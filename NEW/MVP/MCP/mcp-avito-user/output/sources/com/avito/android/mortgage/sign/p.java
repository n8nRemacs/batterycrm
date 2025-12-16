package com.avito.android.mortgage.sign;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SignScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Float, Float, G0> f203800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<l0.n> f203801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Y41.p<? super Float, ? super Float, G0> pVar, InterfaceC22204y1<l0.n> interfaceC22204y1) {
        super(0);
        this.f203800l = pVar;
        this.f203801m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC22204y1<l0.n> interfaceC22204y1 = this.f203801m;
        l0.n f42167b = interfaceC22204y1.getF42167b();
        Float fValueOf = f42167b != null ? Float.valueOf(Float.intBitsToFloat((int) (f42167b.f413404a >> 32))) : null;
        l0.n f42167b2 = interfaceC22204y1.getF42167b();
        this.f203800l.invoke(fValueOf, f42167b2 != null ? Float.valueOf(Float.intBitsToFloat((int) (4294967295L & f42167b2.f413404a))) : null);
        return G0.f406611a;
    }
}
