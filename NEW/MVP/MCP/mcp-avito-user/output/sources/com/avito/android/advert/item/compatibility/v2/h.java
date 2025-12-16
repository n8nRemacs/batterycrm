package com.avito.android.advert.item.compatibility.v2;

import U4.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: GarageCompatibilityV2Presenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v2/h;", "Lcom/avito/android/advert/item/compatibility/v2/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.spare_parts.a f74362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f74363c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v2.a f74364d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43238h f74365e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public SparePartsV2Response f74366f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74367g;

    /* compiled from: GarageCompatibilityV2Presenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(h.this.f74363c, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.advert.item.spare_parts.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.advert.item.compatibility.v2.a aVar3, @Y61.k R0 r02, @a.c @Y61.l Kundle kundle) {
        Boolean boolA;
        this.f74362b = aVar;
        this.f74363c = aVar2;
        this.f74364d = aVar3;
        this.f74365e = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.d()));
        this.f74366f = kundle != null ? (SparePartsV2Response) kundle.d("saved_state_garage_compat_response") : null;
        this.f74367g = (kundle == null || (boolA = kundle.a("saved_state_garage_compat_error")) == null) ? false : boolA.booleanValue();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        GarageCompatibilityV2Item garageCompatibilityV2Item = (GarageCompatibilityV2Item) aVar;
        if (this.f74367g) {
            lVar.hide();
            return;
        }
        SparePartsV2Response sparePartsV2Response = this.f74366f;
        if (sparePartsV2Response != null) {
            k(lVar, sparePartsV2Response);
            return;
        }
        String str = garageCompatibilityV2Item.f74347e;
        C43175k.K(new C43197r1(new g(lVar, this, null), this.f74362b.a(garageCompatibilityV2Item.f74346d, str)), this.f74365e);
    }

    @Override // com.avito.android.advert.item.compatibility.v2.f
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f74366f, "saved_state_garage_compat_response");
        kundle.h(Boolean.valueOf(this.f74367g), "saved_state_garage_compat_error");
        return kundle;
    }

    @Override // com.avito.android.advert.item.compatibility.v2.f
    public final void f0() {
        Q0.d(this.f74365e.f411905b);
    }

    public final void k(l lVar, SparePartsV2Response sparePartsV2Response) {
        SparePartsV2Response.GarageCompatibility garageCompatibility = sparePartsV2Response.getGarageCompatibility();
        if ((garageCompatibility != null ? garageCompatibility.getStatus() : null) == null) {
            lVar.hide();
            return;
        }
        this.f74364d.a(garageCompatibility != null ? garageCompatibility.getTitle() : null, garageCompatibility != null ? garageCompatibility.getSubtitle() : null);
        lVar.C0();
        lVar.ti(garageCompatibility, new a());
    }

    @Override // com.avito.android.advert.item.compatibility.v2.f
    public final void m0() {
        this.f74362b.m0();
        this.f74366f = null;
        this.f74367g = false;
    }
}
