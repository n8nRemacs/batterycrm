package com.avito.android.publish.slots.delivery_all_toggles.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryAllTogglesItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_all_toggles/item/i;", "Lcom/avito/android/publish/slots/delivery_all_toggles/item/g;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f243499b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243500c;

    @Inject
    public i() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243499b = cVar;
        this.f243500c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        r rVar = (r) aVar;
        UniversalImage universalImage = rVar.f243530c;
        boolean z12 = rVar.f243546s;
        kVar.MQ(universalImage, z12);
        kVar.uE(rVar.f243531d, z12);
        kVar.KL(rVar.f243532e);
        kVar.GA(z12);
        boolean z13 = rVar.f243537j;
        String str = rVar.f243534g;
        String str2 = rVar.f243535h;
        kVar.fJ(z13 ? str2 : str, rVar.f243536i);
        kVar.bW(rVar.f243533f, rVar.f243538k, rVar.f243539l, rVar.f243541n);
        kVar.wU(str2, str);
        kVar.SX(rVar.f243546s, rVar.f243543p, rVar.f243542o, rVar.f243544q, rVar.f243545r, new h(1, this.f243499b, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
    }

    @Override // com.avito.android.publish.slots.delivery_all_toggles.item.g
    @Y61.k
    public final z<String> l() {
        return this.f243500c;
    }
}
