package com.avito.android.profile.pro.impl.screen.item.avito_finance.item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.profile.pro.impl.screen.item.avito_finance.item.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProAvitoFinanceItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/b;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k;", "Lcom/avito/android/avito_finance_user_profile/view/item/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class b implements TV0.b<k, com.avito.android.avito_finance_user_profile.view.item.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f223000a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f223001b;

    /* compiled from: ProfileProAvitoFinanceItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k.b f223002l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k.b bVar) {
            super(2);
            this.f223002l = bVar;
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return this.f223002l.a(view);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k k.b bVar) {
        this.f223000a = dVar;
        this.f223001b = new g.a<>(R.layout.item_profile_pro_avito_finance_block, new a(bVar));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<k, com.avito.android.avito_finance_user_profile.view.item.a> a() {
        return this.f223000a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f223001b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.avito_finance_user_profile.view.item.a;
    }
}
