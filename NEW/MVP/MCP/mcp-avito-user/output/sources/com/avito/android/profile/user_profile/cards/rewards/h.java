package com.avito.android.profile.user_profile.cards.rewards;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RewardsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/rewards/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/user_profile/cards/rewards/g;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225348g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225349b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225350c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225351d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f225352e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Badge f225353f;

    public h(@k View view) {
        super(view);
        this.f225349b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225350c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225351d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f225352e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.badge_new);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f225353f = (Badge) viewFindViewById4;
    }

    @Override // com.avito.android.profile.user_profile.cards.rewards.g
    public final void TI(@k CardItem.RewardsCardItem rewardsCardItem, @k Y41.a<G0> aVar) {
        I5.a(this.f225350c, rewardsCardItem.f224534d, false);
        I5.a(this.f225351d, rewardsCardItem.f224535e, false);
        UniversalImage universalImage = rewardsCardItem.f224536f;
        boolean z12 = universalImage != null;
        SimpleDraweeView simpleDraweeView = this.f225352e;
        D6.G(simpleDraweeView, z12);
        View view = this.f225349b;
        if (universalImage != null) {
            l.w(com.avito.android.actions_sheet.a.q(view, universalImage), C35949t5.a(simpleDraweeView));
        }
        Badge badge = this.f225353f;
        badge.setClipChildren(true);
        String str = rewardsCardItem.f224538h;
        badge.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        if (str == null) {
            str = "";
        }
        badge.setTitleText(str);
        view.setOnClickListener(new com.avito.android.profile.edit.adapter.c(20, aVar));
    }
}
