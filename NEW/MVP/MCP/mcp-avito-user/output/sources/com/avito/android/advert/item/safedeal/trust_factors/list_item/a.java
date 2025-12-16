package com.avito.android.advert.item.safedeal.trust_factors.list_item;

import TV0.g;
import Y41.q;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrustFactorsListItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/a;", "LTV0/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/f;", "Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/TrustFactorsListItemItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, TrustFactorsListItemItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f79197a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f79198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<f> f79199c = new g.a<>(R.layout.advert_details_safedeal_trust_factor, com.avito.android.advert.item.safedeal.trust_factors.utils.c.a(new C2337a()));

    /* compiled from: TrustFactorsListItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/safedeal/trust_factors/i;", "tooltipHelper", "Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;Lcom/avito/android/advert/item/safedeal/trust_factors/i;)Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.safedeal.trust_factors.list_item.a$a, reason: collision with other inner class name */
    public static final class C2337a extends N implements q<ViewGroup, View, i, f> {
        public C2337a() {
            super(3);
        }

        @Override // Y41.q
        public final f invoke(ViewGroup viewGroup, View view, i iVar) {
            return new f((ViewGroup) view, a.this.f79198b, iVar);
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.util.text.a aVar) {
        this.f79197a = dVar;
        this.f79198b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f79197a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f79199c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof TrustFactorsListItemItem;
    }
}
