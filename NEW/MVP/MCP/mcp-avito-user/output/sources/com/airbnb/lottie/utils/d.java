package com.airbnb.lottie.utils;

import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.F;
import java.util.HashSet;

/* compiled from: LogcatLogger.java */
/* loaded from: classes10.dex */
public class d implements F {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f60100a = new HashSet();

    @Override // com.airbnb.lottie.F
    public final void a(String str, Throwable th2) {
        HashSet hashSet = f60100a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }

    @Override // com.airbnb.lottie.F
    public final void b(String str) {
        a(str, null);
    }

    @Override // com.airbnb.lottie.F
    public final void debug(String str) {
        boolean z12 = C27285e.f59567a;
    }

    @Override // com.airbnb.lottie.F
    public final void error(String str, Throwable th2) {
        boolean z12 = C27285e.f59567a;
    }
}
