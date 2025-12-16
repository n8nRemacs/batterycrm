package com.avito.android.profile.user_profile.cards.wallet.finance_dynamic;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoFinanceDynamicCardBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/finance_dynamic/a;", "LTV0/b;", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/c;", "Lcom/avito/android/profile/user_profile/cards/CardItem$AvitoFinanceDynamicCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<com.avito.android.profile.user_profile.cards.wallet.finance_common.c, CardItem.AvitoFinanceDynamicCardItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f225688a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.profile.user_profile.cards.wallet.finance_common.e> f225689b = new g.a<>(R.layout.user_profile_avito_finance_dynamic, C6856a.f225690l);

    /* compiled from: AvitoFinanceDynamicCardBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/user_profile/cards/wallet/finance_common/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.user_profile.cards.wallet.finance_dynamic.a$a, reason: collision with other inner class name */
    public static final class C6856a extends N implements p<ViewGroup, View, com.avito.android.profile.user_profile.cards.wallet.finance_common.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6856a f225690l = new C6856a();

        public C6856a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.profile.user_profile.cards.wallet.finance_common.e invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.profile.user_profile.cards.wallet.finance_common.e(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f225688a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f225688a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.profile.user_profile.cards.wallet.finance_common.e> b() {
        return this.f225689b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CardItem.AvitoFinanceDynamicCardItem;
    }
}
