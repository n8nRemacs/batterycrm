package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.G;

/* compiled from: ObjectIdWriter.java */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342283a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.n f342284b;

    /* renamed from: c, reason: collision with root package name */
    public final G<?> f342285c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.l<Object> f342286d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f342287e;

    public i(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.core.io.n nVar, G g12, com.fasterxml.jackson.databind.l lVar, boolean z12) {
        this.f342283a = hVar;
        this.f342284b = nVar;
        this.f342285c = g12;
        this.f342286d = lVar;
        this.f342287e = z12;
    }

    public static i a(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.v vVar, G<?> g12, boolean z12) {
        String str = vVar == null ? null : vVar.f342656b;
        return new i(hVar, str != null ? new com.fasterxml.jackson.core.io.n(str) : null, g12, null, z12);
    }
}
