package com.avito.android.user_advert.advert.items.safe_deal_services.switcher;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeDealServiceSwitcherItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/a;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/j;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/c$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<j, c.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f310063a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f310064b = new g.a<>(R.layout.safedeal_service_item, C9504a.f310065l);

    /* compiled from: SafeDealServiceSwitcherItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.items.safe_deal_services.switcher.a$a, reason: collision with other inner class name */
    public static final class C9504a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9504a f310065l = new C9504a();

        public C9504a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f310063a = cVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<j, c.b> a() {
        return this.f310063a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f310064b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof c.b;
    }
}
