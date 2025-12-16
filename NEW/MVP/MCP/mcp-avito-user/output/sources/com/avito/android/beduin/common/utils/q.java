package com.avito.android.beduin.common.utils;

import com.avito.android.remote.model.delivery.CardType;
import kotlin.Metadata;

/* compiled from: CardTypes.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {

    /* compiled from: CardTypes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.VISA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.MASTERCARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.MIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
