package com.avito.android.safedeal.universal_delivery_type;

import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeParams.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_safedeal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    /* compiled from: UniversalDeliveryTypeParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f256637a;

        static {
            int[] iArr = new int[ReloadReason.values().length];
            try {
                iArr[ReloadReason.ADD_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReloadReason.EDIT_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReloadReason.COMPLETE_ADDRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f256637a = iArr;
        }
    }
}
