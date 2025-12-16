package com.avito.android.beduin.common.component.button_buy_delivery;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.AbstractC35201t;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.R0;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import hZ.InterfaceC40895a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinBuyWithDeliveryButtonComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/button_buy_delivery/c;", "Lej/b;", "Lcom/avito/android/beduin/common/component/button_buy_delivery/BeduinBuyWithDeliveryButtonModel;", "Lcom/avito/android/beduin/common/component/button_buy_delivery/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC40113b<BeduinBuyWithDeliveryButtonModel, a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f100825a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40895a f100826b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC35201t f100827c;

    @Inject
    public c(@k R0 r02, @k InterfaceC40895a interfaceC40895a, @k AbstractC35201t abstractC35201t) {
        this.f100825a = r02;
        this.f100826b = interfaceC40895a;
        this.f100827c = abstractC35201t;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new a((BeduinBuyWithDeliveryButtonModel) beduinModel, this.f100825a, this.f100826b, this.f100827c);
    }
}
