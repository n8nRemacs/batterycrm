package com.akita.compose.component.stepper;

import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Stepper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f62858l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f62859m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Integer> f62860n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i12, InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1<Integer> interfaceC22204y1) {
        super(1);
        this.f62858l = i12;
        this.f62859m = interfaceC22196w1;
        this.f62860n = interfaceC22204y1;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        return new f(this.f62858l, this.f62859m, this.f62860n);
    }
}
