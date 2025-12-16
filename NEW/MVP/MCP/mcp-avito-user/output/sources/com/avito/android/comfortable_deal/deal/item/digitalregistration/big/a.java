package com.avito.android.comfortable_deal.deal.item.digitalregistration.big;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vp.C49363a;

/* compiled from: DigitalRegistrationBigBannerBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/a;", "LTV0/b;", "Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/k;", "Lvp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<k, C49363a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f121368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f121369b = new g.a<>(R.layout.deal_item_digital_registration_big, C3583a.f121370l);

    /* compiled from: DigitalRegistrationBigBannerBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/big/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.deal.item.digitalregistration.big.a$a, reason: collision with other inner class name */
    public static final class C3583a extends N implements p<ViewGroup, View, m> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3583a f121370l = new C3583a();

        public C3583a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f121368a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f121368a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f121369b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof C49363a) && ((C49363a) aVar).f440967c;
    }
}
