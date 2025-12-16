package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShortTermRentHiddenSwitcherItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/a;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/g;", "LOH0/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<g, OH0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f310249a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f310250b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f310251c = new g.a<>(R.layout.my_advert_str_hidden_switcher_item, new C9509a());

    /* compiled from: ShortTermRentHiddenSwitcherItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_advert.advert.items.short_term_rent.switcher.a$a, reason: collision with other inner class name */
    public static final class C9509a extends N implements Y41.p<ViewGroup, View, h> {
        public C9509a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f310249a);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f310249a = aVar;
        this.f310250b = cVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<g, OH0.b> a() {
        return this.f310250b;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f310251c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof OH0.b;
    }
}
