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
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f297699l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C44625c.b f297700m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC44623a, G0> f297701n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f297702o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(int i12, C44625c.b bVar, Y41.l<? super InterfaceC44623a, G0> lVar, int i13) {
        super(2);
        this.f297699l = i12;
        this.f297700m = bVar;
        this.f297701n = lVar;
        this.f297702o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f297702o | 1);
        C44625c.b bVar = this.f297700m;
        Y41.l<InterfaceC44623a, G0> lVar = this.f297701n;
        a.c(this.f297699l, bVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
