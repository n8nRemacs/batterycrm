package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class h70 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f385922a = true;

    @X41.n
    public static final void a(boolean z12) {
        f385922a = z12;
    }

    @X41.n
    public static final void b(@Y61.k String str, @Y61.k Object... objArr) {
        if (f385922a) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
    }

    @X41.n
    public static final void c(@Y61.k String str, @Y61.k Object... objArr) {
        if (f385922a) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
    }

    @X41.n
    public static final void a(@Y61.k String str, @Y61.k Object... objArr) {
        if (f385922a) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
    }
}
