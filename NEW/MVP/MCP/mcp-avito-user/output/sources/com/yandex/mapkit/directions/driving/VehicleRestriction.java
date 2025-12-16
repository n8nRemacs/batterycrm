package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.P;

/* loaded from: classes7.dex */
public class VehicleRestriction implements Serializable {
    private Float axleWeightLimit;
    private Float heightLimit;
    private Boolean legal;
    private Float lengthLimit;
    private Float maxWeightLimit;
    private Integer minEcoClass;
    private Float payloadLimit;
    private Boolean trailerNotAllowed;
    private Float weightLimit;
    private Float widthLimit;

    public VehicleRestriction(@P Float f12, @P Float f13, @P Float f14, @P Float f15, @P Float f16, @P Float f17, @P Float f18, @P Integer num, @P Boolean bool, @P Boolean bool2) {
        this.weightLimit = f12;
        this.axleWeightLimit = f13;
        this.maxWeightLimit = f14;
        this.heightLimit = f15;
        this.widthLimit = f16;
        this.lengthLimit = f17;
        this.payloadLimit = f18;
        this.minEcoClass = num;
        this.trailerNotAllowed = bool;
        this.legal = bool2;
    }

    @P
    public Float getAxleWeightLimit() {
        return this.axleWeightLimit;
    }

    @P
    public Float getHeightLimit() {
        return this.heightLimit;
    }

    @P
    public Boolean getLegal() {
        return this.legal;
    }

    @P
    public Float getLengthLimit() {
        return this.lengthLimit;
    }

    @P
    public Float getMaxWeightLimit() {
        return this.maxWeightLimit;
    }

    @P
    public Integer getMinEcoClass() {
        return this.minEcoClass;
    }

    @P
    public Float getPayloadLimit() {
        return this.payloadLimit;
    }

    @P
    public Boolean getTrailerNotAllowed() {
        return this.trailerNotAllowed;
    }

    @P
    public Float getWeightLimit() {
        return this.weightLimit;
    }

    @P
    public Float getWidthLimit() {
        return this.widthLimit;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.weightLimit = archive.add(this.weightLimit, true);
        this.axleWeightLimit = archive.add(this.axleWeightLimit, true);
        this.maxWeightLimit = archive.add(this.maxWeightLimit, true);
        this.heightLimit = archive.add(this.heightLimit, true);
        this.widthLimit = archive.add(this.widthLimit, true);
        this.lengthLimit = archive.add(this.lengthLimit, true);
        this.payloadLimit = archive.add(this.payloadLimit, true);
        this.minEcoClass = archive.add(this.minEcoClass, true);
        this.trailerNotAllowed = archive.add(this.trailerNotAllowed, true);
        this.legal = archive.add(this.legal, true);
    }

    public VehicleRestriction() {
    }
}
