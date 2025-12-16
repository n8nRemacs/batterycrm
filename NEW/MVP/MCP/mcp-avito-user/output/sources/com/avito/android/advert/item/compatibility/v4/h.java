package com.avito.android.advert.item.compatibility.v4;

import U4.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.spare_parts.data.CompatibilityV4Info;
import com.avito.android.advert.item.spare_parts.data.SparePartsCompatibilityV4Holder;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: GarageCompatibilityV4Presenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v4/h;", "Lcom/avito/android/advert/item/compatibility/v4/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.spare_parts.a f74541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f74542c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.compatibility.v4.a f74543d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f74544e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public C43238h f74545f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public SparePartsCompatibilityV4Holder f74546g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74547h;

    /* compiled from: GarageCompatibilityV4Presenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.a.a(h.this.f74542c, deepLink, null, null, 6);
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.advert.item.spare_parts.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.advert.item.compatibility.v4.a aVar3, @Y61.k R0 r02, @a.e @Y61.l Kundle kundle) {
        Boolean boolA;
        this.f74541b = aVar;
        this.f74542c = aVar2;
        this.f74543d = aVar3;
        this.f74544e = r02;
        this.f74546g = kundle != null ? (SparePartsCompatibilityV4Holder) kundle.d("saved_state_garage_compat_response_v4") : null;
        this.f74547h = (kundle == null || (boolA = kundle.a("saved_state_garage_compat_error_v4")) == null) ? false : boolA.booleanValue();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        GarageCompatibilityV4Item garageCompatibilityV4Item = (GarageCompatibilityV4Item) aVar;
        if (this.f74547h) {
            lVar.hide();
            return;
        }
        C43238h c43238h = this.f74545f;
        if (c43238h == null) {
            return;
        }
        SparePartsCompatibilityV4Holder sparePartsCompatibilityV4Holder = this.f74546g;
        if (sparePartsCompatibilityV4Holder != null) {
            k(lVar, sparePartsCompatibilityV4Holder);
            return;
        }
        C43175k.K(new C43197r1(new g(lVar, this, null), this.f74541b.c(null, garageCompatibilityV4Item.f74525d, garageCompatibilityV4Item.f74526e)), c43238h);
    }

    @Override // com.avito.android.advert.item.compatibility.v4.f
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f74546g, "saved_state_garage_compat_response_v4");
        kundle.h(Boolean.valueOf(this.f74547h), "saved_state_garage_compat_error_v4");
        return kundle;
    }

    @Override // com.avito.android.advert.item.compatibility.v4.f
    public final void f0() {
        C43238h c43238h = this.f74545f;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f74545f = null;
    }

    public final void k(l lVar, SparePartsCompatibilityV4Holder sparePartsCompatibilityV4Holder) {
        CompatibilityV4Info compatibilityV4Info = sparePartsCompatibilityV4Holder != null ? sparePartsCompatibilityV4Holder.f80441c : null;
        if (compatibilityV4Info == null) {
            lVar.hide();
            return;
        }
        this.f74543d.a(compatibilityV4Info.f80423b, compatibilityV4Info.f80424c);
        lVar.C0();
        lVar.lm(compatibilityV4Info, new a());
    }

    @Override // com.avito.android.advert.item.compatibility.v4.f
    public final void m0() {
        this.f74541b.m0();
        this.f74546g = null;
        this.f74547h = false;
    }

    @Override // com.avito.android.advert.item.compatibility.v4.f
    public final void q() {
        C43238h c43238hA = U.a(this.f74544e.b());
        C43238h c43238h = this.f74545f;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f74545f = c43238hA;
    }
}
