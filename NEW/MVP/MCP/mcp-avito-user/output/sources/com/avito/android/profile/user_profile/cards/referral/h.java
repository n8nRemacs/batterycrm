package com.avito.android.profile.user_profile.cards.referral;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReferralCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/referral/h;", "Lcom/avito/android/profile/user_profile/cards/referral/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225311g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225312b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225313c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225314d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f225315e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Badge f225316f;

    public h(@k View view) {
        super(view);
        this.f225312b = view;
        View viewFindViewById = view.findViewById(R.id.referral_card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225313c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.referral_card_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225314d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.referral_card_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f225315e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.referral_card_badge_new);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f225316f = (Badge) viewFindViewById4;
    }

    @Override // com.avito.android.profile.user_profile.cards.referral.g
    public final void tC(@k CardItem.ReferralCardItem referralCardItem, @k Y41.a<G0> aVar) {
        I5.a(this.f225313c, referralCardItem.f224523d, false);
        I5.a(this.f225314d, referralCardItem.f224524e, false);
        SimpleDraweeView simpleDraweeView = this.f225315e;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(referralCardItem.f224525f, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnTheme));
        aVarA.c();
        this.f225312b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(19, aVar));
        Badge badge = this.f225316f;
        badge.setClipChildren(true);
        String str = referralCardItem.f224528i;
        badge.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (str == null) {
            str = "";
        }
        badge.setTitleText(str);
    }
}
