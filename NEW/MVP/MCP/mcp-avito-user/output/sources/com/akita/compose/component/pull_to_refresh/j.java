package com.akita.compose.component.pull_to_refresh;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.J1;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.A;

/* compiled from: PullToRefreshState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/pull_to_refresh/j;", "", "<init>", "()V", "pull-to-refresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20268c<Float, C20318t> f62474a;

    public j() {
        Float fValueOf = Float.valueOf(0.0f);
        int i12 = A.f406820a;
        this.f62474a = new C20268c<>(fValueOf, J1.f26075a, null, null, 12, null);
    }

    public final float a() {
        return this.f62474a.f().floatValue();
    }

    @Y61.l
    public final Object b(float f12, @Y61.k SuspendLambda suspendLambda) {
        Object objH = this.f62474a.h(Boxing.boxFloat(f12), suspendLambda);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : G0.f406611a;
    }
}
