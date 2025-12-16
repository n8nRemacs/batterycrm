package com.avito.android.seller_coach.all_advices.item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.seller_coach.adverts_hint.item.UserAdvertsHintItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvicesItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/item/a;", "LTV0/b;", "Lcom/avito/android/seller_coach/all_advices/item/g;", "Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<g, UserAdvertsHintItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f267342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<h> f267343b = new g.a<>(R.layout.seller_coach_advice_item, C7985a.f267344l);

    /* compiled from: AdvicesItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/seller_coach/all_advices/item/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/seller_coach/all_advices/item/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.seller_coach.all_advices.item.a$a, reason: collision with other inner class name */
    public static final class C7985a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7985a f267344l = new C7985a();

        public C7985a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f267342a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f267342a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<h> b() {
        return this.f267343b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof UserAdvertsHintItem;
    }
}
