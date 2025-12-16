package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConnectionQuality.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B {

    /* compiled from: ConnectionQuality.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165510a;

        static {
            int[] iArr = new int[ConnectionQuality.values().length];
            try {
                iArr[ConnectionQuality.NO_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionQuality.f165511OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionQuality.UNSTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f165510a = iArr;
        }
    }

    @Y61.k
    public static final String a(@Y61.k ConnectionQuality connectionQuality) {
        int i12 = a.f165510a[connectionQuality.ordinal()];
        if (i12 == 1) {
            return "NO_DATA";
        }
        if (i12 == 2) {
            return "OK";
        }
        if (i12 == 3) {
            return "UNSTABLE";
        }
        throw new NoWhenBranchMatchedException();
    }
}
