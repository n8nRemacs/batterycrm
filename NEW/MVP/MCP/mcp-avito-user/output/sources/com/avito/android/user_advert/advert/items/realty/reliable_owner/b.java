package com.avito.android.user_advert.advert.items.realty.reliable_owner;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReliableOwnerItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/b;", "LTV0/b;", "Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/h;", "Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<h, com.avito.android.user_advert.advert.items.realty.reliable_owner.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f309929a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f309930b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.c f309931c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f309932d = new g.a<>(R.layout.my_advert_reliable_owner_block_item, new a());

    /* compiled from: ReliableOwnerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new i(view, bVar.f309930b, bVar.f309931c);
        }
    }

    @Inject
    public b(@k d dVar, @k com.avito.android.util.text.a aVar, @k com.avito.android.serp.adapter.vertical_main.c cVar) {
        this.f309929a = dVar;
        this.f309930b = aVar;
        this.f309931c = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f309929a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f309932d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.user_advert.advert.items.realty.reliable_owner.a;
    }
}
