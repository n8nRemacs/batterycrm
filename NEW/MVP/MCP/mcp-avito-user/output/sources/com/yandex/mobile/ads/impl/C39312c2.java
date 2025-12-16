package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* renamed from: com.yandex.mobile.ads.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39312c2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final hh1 f384156a;

    /* renamed from: com.yandex.mobile.ads.impl.c2$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f384157a;

        static {
            int[] iArr = new int[InstreamAdBreakPosition.Type.values().length];
            f384157a = iArr;
            try {
                iArr[InstreamAdBreakPosition.Type.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f384157a[InstreamAdBreakPosition.Type.PERCENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f384157a[InstreamAdBreakPosition.Type.POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C39312c2(@j.N hh1 hh1Var) {
        this.f384156a = hh1Var;
    }

    public final long a(@j.N InstreamAdBreakPosition instreamAdBreakPosition) {
        long value = instreamAdBreakPosition.getValue();
        int i12 = a.f384157a[instreamAdBreakPosition.getPositionType().ordinal()];
        if (i12 == 1) {
            return value;
        }
        if (i12 == 2) {
            if (value == 100) {
                return Long.MIN_VALUE;
            }
            if (value == 0) {
                return 0L;
            }
            long jA2 = this.f384156a.a();
            if (jA2 != -9223372036854775807L) {
                return (long) ((value / 100.0f) * jA2);
            }
        }
        return -1L;
    }
}
