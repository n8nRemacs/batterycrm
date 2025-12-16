package com.avito.android.profile.user_profile.cards.social;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SocialCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/social/h;", "Lcom/avito/android/profile/user_profile/cards/social/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C40723b f225564b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40723b f225565c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C40723b f225566d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C40723b f225567e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C40723b f225568f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C40723b f225569g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225570h;

    /* compiled from: SocialCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225571l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225571l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225571l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.social_vk);
        c40723bB.setIcon(R.drawable.ic_profile_vk);
        this.f225564b = c40723bB;
        C40723b c40723bB2 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.social_ok);
        c40723bB2.setIcon(R.drawable.ic_profile_ok);
        this.f225565c = c40723bB2;
        C40723b c40723bB3 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.social_apple);
        c40723bB3.setIcon(R.drawable.ic_profile_apple);
        this.f225566d = c40723bB3;
        C40723b c40723bB4 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.social_gp);
        c40723bB4.setIcon(R.drawable.ic_profile_gp);
        this.f225567e = c40723bB4;
        C40723b c40723bB5 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.social_esia);
        c40723bB5.setIcon(R.drawable.ic_profile_esia);
        this.f225568f = c40723bB5;
        C40723b c40723bB6 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.social_avito_fake);
        c40723bB6.setIcon(R.drawable.ic_profile_avito_fake);
        this.f225569g = c40723bB6;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.edit_social_networks);
        cVarA.a(R.string.edit_social_networks);
        this.f225570h = cVarA;
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void CD(@k String str) {
        this.f225569g.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void IR(@k String str) {
        this.f225564b.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void Mh(@k String str) {
        this.f225568f.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void OY(@k String str) {
        this.f225565c.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225570h.c(new a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void UA() {
        this.f225564b.c();
        this.f225565c.c();
        this.f225567e.c();
        this.f225566d.c();
        this.f225568f.c();
        this.f225569g.c();
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void Wg(@k String str) {
        this.f225567e.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.social.g
    public final void cn(@k String str) {
        this.f225566d.m6(str);
    }
}
