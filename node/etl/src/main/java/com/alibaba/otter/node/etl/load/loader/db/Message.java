package com.alibaba.otter.node.etl.load.loader.db;

import java.io.Serializable;
import java.util.List;

import com.alibaba.otter.shared.etl.model.EventData;

public class Message implements Serializable {

	private static final long serialVersionUID = 7395505129576369699L;

	private List<EventData> eventDatas;

	public List<EventData> getEventDatas() {
		return eventDatas;
	}

	public void setEventDatas(List<EventData> eventDatas) {
		this.eventDatas = eventDatas;
	}

}
