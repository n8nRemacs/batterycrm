package com.avito.android.profile.user_profile.cards.silent_update;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SilentUpdateBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/silent_update/a;", "LTV0/b;", "Lcom/avito/android/profile/user_profile/cards/silent_update/k;", "Lcom/avito/android/profile/user_profile/cards/CardItem$SilentUpdateItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<k, CardItem.SilentUpdateItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f225517a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f225518b = new g.a<>(R.layout.profile_silent_update_banner, C6846a.f225519l);

    /* compiled from: SilentUpdateBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/user_profile/cards/silent_update/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/user_profile/cards/silent_update/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile.user_profile.cards.silent_update.a$a, reason: collision with other inner class name */
    public static final class C6846a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6846a f225519l = new C6846a();

        public C6846a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public a(@Y61.k e eVar) {
        this.f225517a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f225517a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f225518b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CardItem.SilentUpdateItem;
    }
}
