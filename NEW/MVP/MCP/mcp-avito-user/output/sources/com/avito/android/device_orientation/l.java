package com.avito.android.device_orientation;

import kotlin.Metadata;

/* compiled from: StoppableRotationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "prevQuarter", "newDegree", "apply", "(II)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class l<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f139243b;

    public l(o oVar) {
        this.f139243b = oVar;
    }

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        this.f139243b.getClass();
        int i12 = iIntValue * 90;
        int i13 = i12 - 45;
        int i14 = i12 + 45;
        int i15 = ((iIntValue2 + 45) % 360) / 90;
        if (i15 != iIntValue) {
            if (i13 < 0) {
                i13 = i12 + 315;
            }
            int iAbs = Math.abs(iIntValue2 - i13);
            if (i14 < 0) {
                i14 = i12 + 405;
            }
            if (Math.min(iAbs, Math.abs(iIntValue2 - i14)) > 20) {
                iIntValue = i15;
            }
        }
        return Integer.valueOf(iIntValue);
    }
}
