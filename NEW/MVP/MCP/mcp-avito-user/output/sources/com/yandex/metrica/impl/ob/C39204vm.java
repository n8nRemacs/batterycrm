package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39204vm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f382084a;

    public C39204vm(@j.N Context context) {
        this.f382084a = context;
    }

    public byte[] a() {
        try {
            return Tl.b(new StringBuilder(this.f382084a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public byte[] b() {
        try {
            return Tl.b(this.f382084a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
