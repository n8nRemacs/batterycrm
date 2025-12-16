package com.avito.android.profile.user_profile.cards.services_seller_subscription;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesSellerSubscriptionCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/services_seller_subscription/h;", "Lcom/avito/android/profile/user_profile/cards/services_seller_subscription/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f225503f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225506d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f225507e;

    public h(@k View view) {
        super(view);
        this.f225504b = view;
        View viewFindViewById = view.findViewById(R.id.services_seller_subscription_card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225505c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.services_seller_subscription_card_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225506d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.services_seller_subscription_action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225507e = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.profile.user_profile.cards.services_seller_subscription.g
    public final void O0(@k String str, @l String str2) {
        if (str2 == null) {
            I5.a(this.f225505c, str, false);
        } else {
            com.avito.android.lib.design.badge.e.d(this.f225505c, str, str2, R.style.Re23_Badge_TextRedXS, null, 56);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.services_seller_subscription.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f225507e.setOnClickListener(new com.avito.android.profile.edit.adapter.c(22, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.services_seller_subscription.g
    public final void f(@l String str) {
        I5.a(this.f225506d, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.services_seller_subscription.g
    public final void w2(@k String str) {
        I5.a(this.f225507e, str, false);
    }
}
