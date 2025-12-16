package com.avito.android.device_orientation;

import com.avito.android.device_orientation.c;
import kotlin.Metadata;

/* compiled from: StoppableRotationInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "quarter", "Lcom/avito/android/device_orientation/c;", "apply", "(I)Lcom/avito/android/device_orientation/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final m<T, R> f139244b = new m<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? new c.e() : new c.C4199c() : new c.b() : new c.d() : new c.a();
    }
}
