package com.avito.android.delivery_tarifikator.domain;

import aw.InterfaceC24182a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: LoadTarifikatorUseCase.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/m;", "Lcom/avito/android/delivery_tarifikator/domain/k;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* renamed from: com.avito.android.delivery_tarifikator.domain.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29817m implements InterfaceC29815k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC24182a f135299a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryTarifikatorParams f135300b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f135301c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h0 f135302d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p0 f135303e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final x0 f135304f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final J f135305g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29809e f135306h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Mv.e f135307i;

    @Inject
    public C29817m(@Y61.k InterfaceC24182a interfaceC24182a, @Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams, @Y61.k R0 r02, @Y61.k h0 h0Var, @Y61.k p0 p0Var, @Y61.k x0 x0Var, @Y61.k J j12, @Y61.k InterfaceC29809e interfaceC29809e, @Y61.k Mv.e eVar) {
        this.f135299a = interfaceC24182a;
        this.f135300b = deliveryTarifikatorParams;
        this.f135301c = r02;
        this.f135302d = h0Var;
        this.f135303e = p0Var;
        this.f135304f = x0Var;
        this.f135305g = j12;
        this.f135306h = interfaceC29809e;
        this.f135307i = eVar;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29815k
    @Y61.l
    public final Object a(@Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f135301c.a(), new C29816l(this, null), suspendLambda);
    }
}
