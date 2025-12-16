package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.div.core.C37918m;

/* loaded from: classes8.dex */
public final class hq {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f386203b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private static volatile hq f386204c;

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private C37918m f386205a;

    private hq() {
    }

    @j.N
    public static hq a() {
        if (f386204c == null) {
            synchronized (f386203b) {
                try {
                    if (f386204c == null) {
                        f386204c = new hq();
                    }
                } finally {
                }
            }
        }
        return f386204c;
    }

    @j.N
    public final C37918m a(@j.N Context context) {
        synchronized (f386203b) {
            try {
                if (this.f386205a == null) {
                    this.f386205a = uq.a(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f386205a;
    }
}
