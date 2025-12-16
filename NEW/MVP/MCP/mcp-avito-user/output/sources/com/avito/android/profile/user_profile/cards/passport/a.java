package com.avito.android.profile.user_profile.cards.passport;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PassportCardBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/a;", "LTV0/b;", "Lcom/avito/android/profile/user_profile/cards/passport/h;", "Lcom/avito/android/profile/user_profile/cards/CardItem$PassportCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<h, CardItem.PassportCardItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f225133a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<com.avito.android.component.user_hat.e> f225134b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f225135c = new g.a<>(R.layout.passport_user_profile_info_card, new C6824a());

    /* compiled from: PassportCardBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/user_profile/cards/passport/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/user_profile/cards/passport/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.user_profile.cards.passport.a$a, reason: collision with other inner class name */
    public static final class C6824a extends N implements p<ViewGroup, View, i> {
        public C6824a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f225134b);
        }
    }

    @Inject
    public a(@k c cVar, @k l41.g<com.avito.android.component.user_hat.e> gVar) {
        this.f225133a = cVar;
        this.f225134b = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f225133a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f225135c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CardItem.PassportCardItem;
    }
}
