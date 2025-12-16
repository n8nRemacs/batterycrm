package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.s;
import com.fasterxml.jackson.databind.util.C36497c;
import java.io.Serializable;

/* compiled from: SerializerFactoryConfig.java */
/* loaded from: classes4.dex */
public final class q implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final s[] f341515e = new s[0];

    /* renamed from: f, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.ser.h[] f341516f = new com.fasterxml.jackson.databind.ser.h[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final s[] f341517b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f341518c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.h[] f341519d;

    public q() {
        s[] sVarArr = f341515e;
        this.f341517b = sVarArr;
        this.f341518c = sVarArr;
        this.f341519d = f341516f;
    }

    public final boolean a() {
        return this.f341519d.length > 0;
    }

    public final C36497c b() {
        return new C36497c(this.f341519d);
    }
}
