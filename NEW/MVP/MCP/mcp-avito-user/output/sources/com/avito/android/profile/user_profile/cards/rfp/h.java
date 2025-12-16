package com.avito.android.profile.user_profile.cards.rfp;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RfpCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/rfp/h;", "Lcom/avito/android/profile/user_profile/cards/rfp/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f225362g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225363b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FrameLayout f225364c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225365d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f225366e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Badge f225367f;

    public h(@k View view) {
        super(view);
        this.f225363b = view;
        View viewFindViewById = view.findViewById(R.id.user_profile_rfp_card_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f225364c = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225365d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225366e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.badge_counter);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f225367f = (Badge) viewFindViewById4;
    }

    @Override // com.avito.android.profile.user_profile.cards.rfp.g
    public final void G3(@k Y41.a<G0> aVar) {
        this.f225364c.setOnClickListener(new com.avito.android.profile.edit.adapter.c(21, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.rfp.g
    public final void f(@k String str) {
        this.f225366e.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.rfp.g
    public final void o7(@l String str) {
        Badge badge = this.f225367f;
        if (str == null || str.length() == 0) {
            D6.g(badge);
        } else {
            D6.H(badge);
            badge.setTitleText(str);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.rfp.g
    public final void setTitle(@k String str) {
        this.f225365d.setText(str);
    }
}
