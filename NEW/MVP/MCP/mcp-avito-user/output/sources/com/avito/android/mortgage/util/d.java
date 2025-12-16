package com.avito.android.mortgage.util;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProcessIdGenerator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/util/d;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {
    @Inject
    public d() {
    }

    @k
    public static String a() {
        return UUID.randomUUID().toString();
    }
}
