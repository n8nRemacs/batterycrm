package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public class TimeRange implements Serializable {
    private Integer from;
    private Boolean isTwentyFourHours;

    /* renamed from: to, reason: collision with root package name */
    private Integer f377470to;

    public TimeRange(@P Boolean bool, @P Integer num, @P Integer num2) {
        this.isTwentyFourHours = bool;
        this.from = num;
        this.f377470to = num2;
    }

    @P
    public Integer getFrom() {
        return this.from;
    }

    @P
    public Boolean getIsTwentyFourHours() {
        return this.isTwentyFourHours;
    }

    @P
    public Integer getTo() {
        return this.f377470to;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.isTwentyFourHours = archive.add(this.isTwentyFourHours, true);
        this.from = archive.add(this.from, true);
        this.f377470to = archive.add(this.f377470to, true);
    }

    public TimeRange() {
    }
}
