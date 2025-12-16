package com.avito.android.profile.pro.impl.screen.item.orders;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProOrdersBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/orders/a;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/orders/f;", "Lcom/avito/android/profile/pro/impl/screen/item/orders/ProfileProOrdersItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<f, ProfileProOrdersItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f223365a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f223366b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f223367c = new g.a<>(R.layout.item_profile_pro_orders, new C6761a());

    /* compiled from: ProfileProOrdersBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/orders/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/orders/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.pro.impl.screen.item.orders.a$a, reason: collision with other inner class name */
    public static final class C6761a extends N implements p<ViewGroup, View, h> {
        public C6761a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f223366b);
        }
    }

    @Inject
    public a(@k c cVar, @K3.a @k com.avito.konveyor.adapter.d dVar) {
        this.f223365a = cVar;
        this.f223366b = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f223365a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f223367c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ProfileProOrdersItem;
    }
}
