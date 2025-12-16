package com.avito.android.util;

import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.util.t3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C35947t3 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request());
    }
}
