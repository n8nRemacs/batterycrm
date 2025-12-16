package com.avito.android.tariff_cpt.configure.landing.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oC0.C44625c;
import oC0.InterfaceC44623a;

/* compiled from: TariffCptConfigureLandingScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class w extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f297729l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C44625c.C12178c f297730m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC44623a, G0> f297731n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f297732o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(int i12, C44625c.C12178c c12178c, Y41.l<? super InterfaceC44623a, G0> lVar, int i13) {
        super(2);
        this.f297729l = i12;
        this.f297730m = c12178c;
        this.f297731n = lVar;
        this.f297732o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f297732o | 1);
        C44625c.C12178c c12178c = this.f297730m;
        Y41.l<InterfaceC44623a, G0> lVar = this.f297731n;
        a.e(this.f297729l, c12178c, lVar, a12, iA2);
        return G0.f406611a;
    }
}
