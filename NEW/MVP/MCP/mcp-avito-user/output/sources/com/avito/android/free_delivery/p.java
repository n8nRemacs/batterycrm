package com.avito.android.free_delivery;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UE.c f158818l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f158819m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FreeDeliveryDetails f158820n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UE.a, G0> f158821o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f158822p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(UE.c cVar, com.akita.compose.component.tooltip.t tVar, FreeDeliveryDetails freeDeliveryDetails, Y41.l<? super UE.a, G0> lVar, int i12) {
        super(2);
        this.f158818l = cVar;
        this.f158819m = tVar;
        this.f158820n = freeDeliveryDetails;
        this.f158821o = lVar;
        this.f158822p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f158822p | 1);
        FreeDeliveryDetails freeDeliveryDetails = this.f158820n;
        Y41.l<UE.a, G0> lVar = this.f158821o;
        j.g(this.f158818l, this.f158819m, freeDeliveryDetails, lVar, a12, iA2);
        return G0.f406611a;
    }
}
