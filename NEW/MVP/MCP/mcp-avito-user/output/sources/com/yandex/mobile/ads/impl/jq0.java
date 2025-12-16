package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class jq0 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private static final Object f386950c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private static volatile jq0 f386951d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final vq0 f386952a = new vq0();

    /* renamed from: b, reason: collision with root package name */
    private boolean f386953b;

    private jq0() {
    }

    @j.N
    public static jq0 a() {
        if (f386951d == null) {
            synchronized (f386950c) {
                try {
                    if (f386951d == null) {
                        f386951d = new jq0();
                    }
                } finally {
                }
            }
        }
        jq0 jq0Var = f386951d;
        Objects.requireNonNull(jq0Var);
        return jq0Var;
    }

    public final void a(@j.N Context context) {
        synchronized (f386950c) {
            try {
                if (this.f386952a.b(context) && !this.f386953b) {
                    yq0.a(context);
                    this.f386953b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
