package com.fasterxml.jackson.databind.deser.impl;

import java.io.Serializable;

/* compiled from: NullsConstantProvider.java */
/* loaded from: classes4.dex */
public class q implements com.fasterxml.jackson.databind.deser.s, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final q f341662c = new q(null);

    /* renamed from: d, reason: collision with root package name */
    public static final q f341663d = new q(null);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f341664b;

    public q(Object obj) {
        this.f341664b = obj;
    }

    public static boolean a(com.fasterxml.jackson.databind.deser.s sVar) {
        return sVar == f341662c;
    }

    @Override // com.fasterxml.jackson.databind.deser.s
    public final Object d(com.fasterxml.jackson.databind.f fVar) {
        return this.f341664b;
    }
}
