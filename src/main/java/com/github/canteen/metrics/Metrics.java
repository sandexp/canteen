package com.github.canteen.metrics;

/**
 * 计量信息类
 * @author xyf
 * @date 20200710
 */
public abstract class Metrics {

	Exception reason;

	public abstract boolean updateMetrics(String name,Number delta);

	public abstract <V> V getMetricsValue(String name);

	public abstract boolean clearMetrics();

	// 向远端发送消息
	public abstract Object send(Object event,String host,Integer port);
}
