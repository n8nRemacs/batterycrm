package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39358q1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Object f389045b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private static volatile C39358q1 f389046c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f389047d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39355p1 f389048a;

    /* renamed from: com.yandex.mobile.ads.impl.q1$a */
    public static final class a {
        @X41.n
        @Y61.k
        public static C39358q1 a(@Y61.k Context context) {
            if (C39358q1.f389046c == null) {
                synchronized (C39358q1.f389045b) {
                    try {
                        if (C39358q1.f389046c == null) {
                            C39358q1.f389046c = new C39358q1(y90.a(context));
                        }
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C39358q1 c39358q1 = C39358q1.f389046c;
            if (c39358q1 != null) {
                return c39358q1;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private C39358q1(C39355p1 c39355p1) {
        this.f389048a = c39355p1;
    }

    @Y61.k
    public final C39355p1 c() {
        return this.f389048a;
    }

    public /* synthetic */ C39358q1(w90 w90Var) {
        this(new C39355p1(w90Var));
    }
}
