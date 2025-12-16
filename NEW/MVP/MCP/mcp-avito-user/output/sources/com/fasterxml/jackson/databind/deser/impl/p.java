package com.fasterxml.jackson.databind.deser.impl;

import java.io.Serializable;

/* compiled from: NullsAsEmptyProvider.java */
/* loaded from: classes4.dex */
public class p implements com.fasterxml.jackson.databind.deser.s, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.i<?> f341661b;

    public p(com.fasterxml.jackson.databind.i<?> iVar) {
        this.f341661b = iVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.s
    public final Object d(com.fasterxml.jackson.databind.f fVar) {
        return this.f341661b.l(fVar);
    }
}
