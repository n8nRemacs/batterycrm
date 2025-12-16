package com.avito.android.mortgage_calculator.internal;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.I3;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import z10.InterfaceC50351d;

/* compiled from: MortgageCalculatorOffers.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_calculator.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32714a0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC50351d.b f204278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I3<androidx.compose.ui.unit.u> f204279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, kotlin.G0> f204280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f204281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f204282p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f204283q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32714a0(InterfaceC50351d.b bVar, I3 i32, Y41.l lVar, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f204278l = bVar;
        this.f204279m = i32;
        this.f204280n = lVar;
        this.f204281o = aVar;
        this.f204282p = vVar;
        this.f204283q = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f204283q | 1);
        Y41.l<DeepLink, kotlin.G0> lVar = this.f204280n;
        Y41.a<kotlin.G0> aVar = this.f204281o;
        C32768q0.p(this.f204278l, this.f204279m, lVar, aVar, this.f204282p, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
