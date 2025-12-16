package com.yandex.mapkit.directions.driving;

import com.yandex.mapkit.annotations.AnnotationLanguage;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public final class DrivingOptions implements Serializable {
    private AnnotationLanguage annotationLanguage;
    private Boolean avoidPoorConditions;
    private Boolean avoidTolls;
    private Boolean avoidUnpaved;
    private Long departureTime;
    private Double initialAzimuth;
    private Integer routesCount;

    public DrivingOptions(@P Double d12, @P Integer num, @P Boolean bool, @P Boolean bool2, @P Boolean bool3, @P Long l12, @P AnnotationLanguage annotationLanguage) {
        this.initialAzimuth = d12;
        this.routesCount = num;
        this.avoidTolls = bool;
        this.avoidUnpaved = bool2;
        this.avoidPoorConditions = bool3;
        this.departureTime = l12;
        this.annotationLanguage = annotationLanguage;
    }

    @P
    public AnnotationLanguage getAnnotationLanguage() {
        return this.annotationLanguage;
    }

    @P
    public Boolean getAvoidPoorConditions() {
        return this.avoidPoorConditions;
    }

    @P
    public Boolean getAvoidTolls() {
        return this.avoidTolls;
    }

    @P
    public Boolean getAvoidUnpaved() {
        return this.avoidUnpaved;
    }

    @P
    public Long getDepartureTime() {
        return this.departureTime;
    }

    @P
    public Double getInitialAzimuth() {
        return this.initialAzimuth;
    }

    @P
    public Integer getRoutesCount() {
        return this.routesCount;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.initialAzimuth = archive.add(this.initialAzimuth, true);
        this.routesCount = archive.add(this.routesCount, true);
        this.avoidTolls = archive.add(this.avoidTolls, true);
        this.avoidUnpaved = archive.add(this.avoidUnpaved, true);
        this.avoidPoorConditions = archive.add(this.avoidPoorConditions, true);
        this.departureTime = archive.add(this.departureTime, true);
        this.annotationLanguage = (AnnotationLanguage) archive.add((Archive) this.annotationLanguage, true, (Class<Archive>) AnnotationLanguage.class);
    }

    public DrivingOptions setAnnotationLanguage(@P AnnotationLanguage annotationLanguage) {
        this.annotationLanguage = annotationLanguage;
        return this;
    }

    public DrivingOptions setAvoidPoorConditions(@P Boolean bool) {
        this.avoidPoorConditions = bool;
        return this;
    }

    public DrivingOptions setAvoidTolls(@P Boolean bool) {
        this.avoidTolls = bool;
        return this;
    }

    public DrivingOptions setAvoidUnpaved(@P Boolean bool) {
        this.avoidUnpaved = bool;
        return this;
    }

    public DrivingOptions setDepartureTime(@P Long l12) {
        this.departureTime = l12;
        return this;
    }

    public DrivingOptions setInitialAzimuth(@P Double d12) {
        this.initialAzimuth = d12;
        return this;
    }

    public DrivingOptions setRoutesCount(@P Integer num) {
        this.routesCount = num;
        return this;
    }

    public DrivingOptions() {
    }
}
