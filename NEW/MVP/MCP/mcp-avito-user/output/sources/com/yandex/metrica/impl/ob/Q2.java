package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes7.dex */
public class Q2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38862hm f379241a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f379242b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private S0 f379243c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private T0 f379244d;

    public Q2() {
        this(new C38862hm());
    }

    public synchronized S0 a(@j.N Context context, @j.N Im im2) {
        try {
            if (this.f379243c == null) {
                if (a(context)) {
                    this.f379243c = new C39008nj(im2.b(), im2.b().getHandler(), im2.a(), new Q());
                } else {
                    this.f379243c = new P2(context, im2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f379243c;
    }

    @j.k0
    public Q2(@j.N C38862hm c38862hm) {
        this.f379241a = c38862hm;
    }

    public synchronized T0 a(@j.N Context context, @j.N S0 s02) {
        try {
            if (this.f379244d == null) {
                if (a(context)) {
                    this.f379244d = new C39033oj();
                } else {
                    this.f379244d = new T2(context, s02);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f379244d;
    }

    private synchronized boolean a(@j.N Context context) {
        try {
            if (this.f379242b == null) {
                this.f379242b = Boolean.valueOf(!this.f379241a.a(context));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f379242b.booleanValue();
    }
}
