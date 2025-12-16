package com.avito.android.delivery_tarifikator.domain;

import aw.InterfaceC24182a;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: SaveSettingsUseCase.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/A;", "Lcom/avito/android/delivery_tarifikator/domain/y;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class A implements InterfaceC29828y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC24182a f135229a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeliveryTarifikatorParams f135230b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f135231c;

    @Inject
    public A(@Y61.k InterfaceC24182a interfaceC24182a, @Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams, @Y61.k R0 r02) {
        this.f135229a = interfaceC24182a;
        this.f135230b = deliveryTarifikatorParams;
        this.f135231c = r02;
    }

    @Override // com.avito.android.delivery_tarifikator.domain.InterfaceC29828y
    @Y61.l
    public final Object a(@Y61.k List list, @Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f135231c.a(), new C29829z(this, list, null), suspendLambda);
    }
}
