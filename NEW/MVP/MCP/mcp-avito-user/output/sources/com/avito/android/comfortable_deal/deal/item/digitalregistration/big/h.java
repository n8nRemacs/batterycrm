package com.avito.android.comfortable_deal.deal.item.digitalregistration.big;

import Ep.InterfaceC13517a;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.di.p;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vp.C49363a;
import wp.InterfaceC49662a;

/* compiled from: DigitalRegistrationBigBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/h;", "Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13517a, G0> f121378b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f121379c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49662a f121380d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f121381e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super InterfaceC13517a, G0> lVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC49662a interfaceC49662a, @p @Y61.l Kundle kundle) {
        this.f121378b = lVar;
        this.f121379c = aVar;
        this.f121380d = interfaceC49662a;
        this.f121381e = kundle != null ? kundle.g("phone") : null;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        C49363a c49363a = (C49363a) aVar;
        String str = this.f121381e;
        if (str != null) {
            kVar.z4(str);
        }
        kVar.rs(new d(this));
        kVar.q6(new e(this, c49363a));
        kVar.ep(new f(this));
        kVar.LZ(new g(this, c49363a));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.big.c
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("phone", this.f121381e);
        return kundle;
    }
}
