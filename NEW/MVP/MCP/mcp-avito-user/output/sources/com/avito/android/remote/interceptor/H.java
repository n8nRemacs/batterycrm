package com.avito.android.remote.interceptor;

import android.annotation.SuppressLint;
import java.lang.reflect.Field;
import kotlin.Metadata;
import okhttp3.ResponseBody;

/* compiled from: DefineResponseBodyHeadersInterceptor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_network_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class H {
    @Y61.l
    @SuppressLint({"ObfuscationSensitiveReflection"})
    public static final L a(@Y61.k ResponseBody responseBody) {
        L l12 = null;
        L l13 = responseBody instanceof L ? (L) responseBody : null;
        if (l13 != null) {
            return l13;
        }
        try {
            Field declaredField = responseBody.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            L l14 = (L) declaredField.get(responseBody);
            if (l14 != null) {
                l12 = l14;
            }
        } catch (Throwable unused) {
        }
        return l12;
    }
}
