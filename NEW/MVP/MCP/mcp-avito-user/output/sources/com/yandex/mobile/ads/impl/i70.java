package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bh0;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class i70 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<g70, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f386362a = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(g70 g70Var) {
            return "\t·\t" + g70Var.getMessage();
        }
    }

    @Y61.k
    public static String a(@Y61.k bh0.a.b bVar) {
        return C42745f0.O(bVar.a(), "\n", "Yandex Mobile Ads integrated incorrectly\n", null, a.f386362a, 28);
    }
}
