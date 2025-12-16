package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* compiled from: RootNameLookup.java */
/* loaded from: classes4.dex */
public class y implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final transient q<com.fasterxml.jackson.databind.type.b, com.fasterxml.jackson.databind.v> f342647b = new q<>(20, 200);

    public final com.fasterxml.jackson.databind.v a(Class cls, com.fasterxml.jackson.databind.cfg.m mVar) {
        com.fasterxml.jackson.databind.type.b bVar = new com.fasterxml.jackson.databind.type.b(cls);
        q<com.fasterxml.jackson.databind.type.b, com.fasterxml.jackson.databind.v> qVar = this.f342647b;
        com.fasterxml.jackson.databind.v vVar = qVar.f342624c.get(bVar);
        if (vVar != null) {
            return vVar;
        }
        com.fasterxml.jackson.databind.v vVarS = mVar.d().S(((com.fasterxml.jackson.databind.introspect.s) mVar.i(cls)).f342086e);
        if (vVarS == null || vVarS.f342656b.isEmpty()) {
            vVarS = com.fasterxml.jackson.databind.v.a(cls.getSimpleName());
        }
        qVar.b(bVar, vVarS);
        return vVarS;
    }

    public Object readResolve() {
        return new y();
    }
}
