package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.I;
import java.io.Serializable;

/* compiled from: DeserializationConfig.java */
/* loaded from: classes4.dex */
public final class e extends com.fasterxml.jackson.databind.cfg.m<DeserializationFeature, e> implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final int f341909o = com.fasterxml.jackson.databind.cfg.l.b(DeserializationFeature.class);
    private static final long serialVersionUID = 2;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.node.m f341910l;

    /* renamed from: m, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.c f341911m;

    /* renamed from: n, reason: collision with root package name */
    public final int f341912n;

    public e(com.fasterxml.jackson.databind.cfg.a aVar, com.fasterxml.jackson.databind.jsontype.impl.n nVar, I i12, com.fasterxml.jackson.databind.util.y yVar, com.fasterxml.jackson.databind.cfg.f fVar, com.fasterxml.jackson.databind.cfg.c cVar) {
        super(aVar, nVar, i12, yVar, fVar);
        this.f341912n = f341909o;
        this.f341910l = com.fasterxml.jackson.databind.node.m.f342203b;
        this.f341911m = cVar;
    }

    public final b o(h hVar) {
        this.f341506c.f341475c.getClass();
        com.fasterxml.jackson.databind.introspect.s sVarB = com.fasterxml.jackson.databind.introspect.t.b(this, hVar);
        if (sVarB != null) {
            return sVarB;
        }
        com.fasterxml.jackson.databind.introspect.s sVarA = com.fasterxml.jackson.databind.introspect.t.a(this, hVar);
        return sVarA == null ? new com.fasterxml.jackson.databind.introspect.s(com.fasterxml.jackson.databind.introspect.t.d(this, hVar, this, false)) : sVarA;
    }

    public final boolean p(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.f341372c & this.f341912n) != 0;
    }

    public e(e eVar, long j12, int i12) {
        super(eVar, j12);
        this.f341912n = i12;
        this.f341910l = eVar.f341910l;
        this.f341911m = eVar.f341911m;
    }
}
