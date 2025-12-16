package com.vk.push.core.ipc;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: DelayedAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/ipc/p;", "ACTION", "", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p<ACTION> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f367081a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<ACTION, Boolean> f367082b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<ACTION, G0> f367083c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public N0 f367084d;

    public p() {
        throw null;
    }

    public p(T t12, Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
        this.f367081a = (i12 & 1) != 0 ? U.a(C43262l0.f411945a.q(1)) : t12;
        this.f367082b = lVar;
        this.f367083c = lVar2;
    }
}
