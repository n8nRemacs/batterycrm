package com.avito.android.util;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertPriceDiscountFormatter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/m;", "Lcom/avito/android/util/t1;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35842m implements InterfaceC35945t1<Integer> {
    @Inject
    public C35842m() {
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(Integer num) {
        Integer num2 = num;
        if (num2 == null) {
            return "";
        }
        return "-" + num2 + '%';
    }
}
