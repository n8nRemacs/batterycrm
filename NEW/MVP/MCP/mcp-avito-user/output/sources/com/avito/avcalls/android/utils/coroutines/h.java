package com.avito.avcalls.android.utils.coroutines;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.logger.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;

/* compiled from: SharedFlowCollector.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/utils/coroutines/h;", "T", "Lkotlinx/coroutines/flow/j;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h<T> implements InterfaceC43172j<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y1<T> f332463b;

    public h(@k Y1 y12) {
        this.f332463b = y12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @l
    public final Object emit(T t12, @k Continuation<? super G0> continuation) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("CameraPositionFlow", "emit: " + t12);
        Object objEmit = this.f332463b.emit(t12, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }
}
