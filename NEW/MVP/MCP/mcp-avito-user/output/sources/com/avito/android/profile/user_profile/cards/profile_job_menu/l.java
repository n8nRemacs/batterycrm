package com.avito.android.profile.user_profile.cards.profile_job_menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.remote.model.user_profile.items.ProfileJobMenuItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileJobMenuItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/profile_job_menu/l;", "Lcom/avito/android/profile/user_profile/cards/profile_job_menu/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f225220l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f225221b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Badge f225222c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f225223d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f225224e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f225225f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f225226g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f225227h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f225228i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.text_view.a f225229j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f225230k;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f225221b = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f225222c = (Badge) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.responses);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        this.f225223d = viewGroup;
        View viewFindViewById4 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225224e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.create_cv);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById5;
        this.f225225f = viewGroup2;
        View viewFindViewById6 = viewGroup2.findViewById(R.id.title);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225226g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.gig);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById7;
        this.f225227h = viewGroup3;
        View viewFindViewById8 = viewGroup3.findViewById(R.id.title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225228i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.card_action_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.text_view.AvitoTextView");
        }
        this.f225229j = (com.avito.android.lib.design.text_view.a) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.divider);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225230k = viewFindViewById10;
    }

    public static void B80(ViewGroup viewGroup, TextView textView, ProfileJobMenuItem.Tile tile, Y41.a aVar) {
        if (tile == null) {
            D6.w(viewGroup);
            return;
        }
        textView.setText(tile.getTitle());
        viewGroup.setOnClickListener(new C(22, aVar));
        D6.H(viewGroup);
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_job_menu.k
    public final void F4(@Y61.l String str) {
        Badge badge = this.f225222c;
        if (str == null) {
            D6.w(badge);
        } else {
            badge.setTitleText(str);
            D6.H(badge);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_job_menu.k
    public final void H30(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        ViewGroup viewGroup = this.f225221b;
        View viewFindViewById = viewGroup.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(str);
        viewGroup.setOnClickListener(new com.avito.android.profile.edit.adapter.c(16, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_job_menu.k
    public final void J40(@Y61.l ProfileJobMenuItem.Tile tile, @Y61.k Y41.a<G0> aVar) {
        B80(this.f225225f, this.f225226g, tile, aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_job_menu.k
    public final void iF(@Y61.l ProfileJobMenuItem.Tile tile, @Y61.k Y41.a<G0> aVar) {
        B80(this.f225227h, this.f225228i, tile, aVar);
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_job_menu.k
    public final void ku(@Y61.l String str, @Y61.k Y41.a<G0> aVar) {
        View view = this.f225230k;
        com.avito.android.lib.design.text_view.a aVar2 = this.f225229j;
        if (str == null) {
            D6.w(view);
            D6.w(aVar2);
        } else {
            aVar2.setText(str);
            I5.c(aVar2, aVar);
            D6.H(view);
            D6.H(aVar2);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.profile_job_menu.k
    public final void ro(@Y61.l ProfileJobMenuItem.Tile tile, @Y61.k Y41.a<G0> aVar) {
        B80(this.f225223d, this.f225224e, tile, aVar);
    }
}
