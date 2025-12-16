package com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileProAvitoFinanceSkeletonBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item_skeleton/a;", "LTV0/b;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item_skeleton/e;", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item_skeleton/ProfileProAvitoFinanceSkeletonItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<e, ProfileProAvitoFinanceSkeletonItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f223027a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f223028b;

    /* compiled from: ProfileProAvitoFinanceSkeletonBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item_skeleton/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/pro/impl/screen/item/avito_finance/item_skeleton/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.a$a, reason: collision with other inner class name */
    public static final class C6746a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e.a f223029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6746a(e.a aVar) {
            super(2);
            this.f223029l = aVar;
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return this.f223029l.a(view);
        }
    }

    @Inject
    public a(@k c cVar, @k e.a aVar) {
        this.f223027a = cVar;
        this.f223028b = new g.a<>(R.layout.item_profile_pro_avito_finance_skeleton, new C6746a(aVar));
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, ProfileProAvitoFinanceSkeletonItem> a() {
        return this.f223027a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f223028b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ProfileProAvitoFinanceSkeletonItem;
    }
}
