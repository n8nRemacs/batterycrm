package com.avito.android.sbc.create.mvi.util;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AutoDispatchPredictionHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/create/mvi/util/a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f259896a = new a();

    public static long a(long j12, long j13) {
        double dFloor;
        if (0 > j12 || j12 >= 2) {
            double d12 = j13;
            dFloor = Math.floor((((0.4d * d12) + 1) - (Math.pow(d12, 0.6d) * 0.2d)) * j12);
        } else {
            dFloor = Math.floor((j13 * 0.5d) + 2);
        }
        return (long) dFloor;
    }
}
