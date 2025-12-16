package com.avito.android.profile.user_profile.cards.calls;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsCardBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/calls/a;", "LTV0/b;", "Lcom/avito/android/profile/user_profile/cards/calls/f;", "Lcom/avito/android/profile/user_profile/cards/CardItem$CallsCardItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<f, CardItem.CallsCardItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f224831a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f224832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<g> f224833c = new g.a<>(R.layout.profile_calls_item, new C6803a());

    /* compiled from: CallsCardBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/user_profile/cards/calls/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/user_profile/cards/calls/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.user_profile.cards.calls.a$a, reason: collision with other inner class name */
    public static final class C6803a extends N implements p<ViewGroup, View, g> {
        public C6803a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view, a.this.f224832b);
        }
    }

    @Inject
    public a(@k d dVar, @k o oVar) {
        this.f224831a = dVar;
        this.f224832b = oVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f224831a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f224833c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CardItem.CallsCardItem;
    }
}
