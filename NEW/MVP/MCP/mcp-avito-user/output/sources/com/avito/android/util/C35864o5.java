package com.avito.android.util;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: SharedPreferences.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.o5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35864o5 {
    @Y61.l
    public static final Object a(@Y61.k SharedPreferences sharedPreferences, @Y61.k String str, @Y61.k kotlinx.coroutines.M m12, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(m12, new C35848m5(sharedPreferences, str, null), suspendLambda);
    }

    @Y61.l
    public static final Object b(@Y61.k SharedPreferences sharedPreferences, @Y61.k String str, @Y61.k String str2, @Y61.k kotlinx.coroutines.M m12, @Y61.k ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(m12, new C35856n5(sharedPreferences, str, str2, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : kotlin.G0.f406611a;
    }
}
