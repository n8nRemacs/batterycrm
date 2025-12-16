package com.yandex.mapkit.transport.bicycle;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import j.N;

/* loaded from: classes7.dex */
public class ConstructionSegment implements Serializable {
    private ConstructionID construction;
    private Subpolyline subpolyline;

    public ConstructionSegment(@N ConstructionID constructionID, @N Subpolyline subpolyline) {
        if (constructionID == null) {
            throw new IllegalArgumentException("Required field \"construction\" cannot be null");
        }
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"subpolyline\" cannot be null");
        }
        this.construction = constructionID;
        this.subpolyline = subpolyline;
    }

    @N
    public ConstructionID getConstruction() {
        return this.construction;
    }

    @N
    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.construction = (ConstructionID) archive.add((Archive) this.construction, false, (Class<Archive>) ConstructionID.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public ConstructionSegment() {
    }
}
