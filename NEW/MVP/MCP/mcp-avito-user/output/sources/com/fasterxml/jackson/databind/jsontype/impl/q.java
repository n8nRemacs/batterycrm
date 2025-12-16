package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.std.v;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypeDeserializerBase.java */
/* loaded from: classes4.dex */
public abstract class q extends com.fasterxml.jackson.databind.jsontype.l implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.m f342163b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342164c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.c f342165d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342166e;

    /* renamed from: f, reason: collision with root package name */
    public final String f342167f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f342168g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f342169h;

    /* renamed from: i, reason: collision with root package name */
    public com.fasterxml.jackson.databind.i<Object> f342170i;

    public q(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.m mVar, String str, boolean z12, com.fasterxml.jackson.databind.h hVar2) {
        this.f342164c = hVar;
        this.f342163b = mVar;
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        this.f342167f = str == null ? "" : str;
        this.f342168g = z12;
        this.f342169h = new ConcurrentHashMap(16, 0.75f, 2);
        this.f342166e = hVar2;
        this.f342165d = null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final Class<?> g() {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        com.fasterxml.jackson.databind.h hVar = this.f342166e;
        if (hVar == null) {
            return null;
        }
        return hVar.f341930b;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final String h() {
        return this.f342167f;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final com.fasterxml.jackson.databind.jsontype.m i() {
        return this.f342163b;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.l
    public final boolean l() {
        return this.f342166e != null;
    }

    public final Object m(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        return o(fVar, obj instanceof String ? (String) obj : String.valueOf(obj)).e(jsonParser, fVar);
    }

    public final com.fasterxml.jackson.databind.i<Object> n(com.fasterxml.jackson.databind.f fVar) {
        com.fasterxml.jackson.databind.i<Object> iVar;
        com.fasterxml.jackson.databind.h hVar = this.f342166e;
        if (hVar == null) {
            if (fVar.O(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return v.f341845e;
        }
        if (com.fasterxml.jackson.databind.util.g.v(hVar.f341930b)) {
            return v.f341845e;
        }
        synchronized (this.f342166e) {
            try {
                if (this.f342170i == null) {
                    this.f342170i = fVar.p(this.f342166e, this.f342165d);
                }
                iVar = this.f342170i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public final com.fasterxml.jackson.databind.i<Object> o(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidTypeIdException {
        ConcurrentHashMap concurrentHashMap = this.f342169h;
        com.fasterxml.jackson.databind.i<Object> iVarP = (com.fasterxml.jackson.databind.i) concurrentHashMap.get(str);
        if (iVarP == null) {
            com.fasterxml.jackson.databind.jsontype.m mVar = this.f342163b;
            com.fasterxml.jackson.databind.h hVarD = mVar.d(fVar, str);
            com.fasterxml.jackson.databind.c cVar = this.f342165d;
            com.fasterxml.jackson.databind.h hVar = this.f342164c;
            if (hVarD == null) {
                com.fasterxml.jackson.databind.i<Object> iVarN = n(fVar);
                if (iVarN == null) {
                    String strC = mVar.c();
                    String strConcat = strC == null ? "type ids are not statically known" : "known type ids = ".concat(strC);
                    if (cVar != null) {
                        strConcat = androidx.media3.exoplayer.analytics.m.l(strConcat, " (for POJO property '", cVar.getName(), "')");
                    }
                    fVar.F(hVar, str, strConcat);
                    return v.f341845e;
                }
                iVarP = iVarN;
            } else {
                if (hVar != null && hVar.getClass() == hVarD.getClass() && !hVarD.v()) {
                    try {
                        Class<?> cls = hVarD.f341930b;
                        fVar.getClass();
                        hVarD = hVar.x(cls) ? hVar : fVar.f341921d.f341506c.f341474b.k(hVar, cls, false);
                    } catch (IllegalArgumentException e12) {
                        throw fVar.L(hVar, str, e12.getMessage());
                    }
                }
                iVarP = fVar.p(hVarD, cVar);
            }
            concurrentHashMap.put(str, iVarP);
        }
        return iVarP;
    }

    public final String toString() {
        return "[" + getClass().getName() + "; base-type:" + this.f342164c + "; id-resolver: " + this.f342163b + ']';
    }

    public q(q qVar, com.fasterxml.jackson.databind.c cVar) {
        this.f342164c = qVar.f342164c;
        this.f342163b = qVar.f342163b;
        this.f342167f = qVar.f342167f;
        this.f342168g = qVar.f342168g;
        this.f342169h = qVar.f342169h;
        this.f342166e = qVar.f342166e;
        this.f342170i = qVar.f342170i;
        this.f342165d = cVar;
    }
}
