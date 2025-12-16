package com.fasterxml.jackson.databind.ser.std;

import rX0.InterfaceC47610a;

/* compiled from: ToStringSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class Q extends S {

    /* renamed from: d, reason: collision with root package name */
    public static final Q f342354d = new Q();

    public Q() {
        super(Object.class, 0);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.S
    public final String p(Object obj) {
        return obj.toString();
    }
}
