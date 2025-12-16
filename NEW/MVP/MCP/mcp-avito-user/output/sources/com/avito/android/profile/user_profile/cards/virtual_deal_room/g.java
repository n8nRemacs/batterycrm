package com.avito.android.profile.user_profile.cards.virtual_deal_room;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VirtualDealRoomCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/virtual_deal_room/g;", "Lcom/avito/android/profile/user_profile/cards/virtual_deal_room/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f225620f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f225621b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225622c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f225623d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Badge f225624e;

    public g(@k View view) {
        super(view);
        this.f225621b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225622c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225623d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badge_new);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f225624e = (Badge) viewFindViewById3;
    }

    @Override // com.avito.android.profile.user_profile.cards.virtual_deal_room.f
    public final void F4(@l String str) {
        h.a(this.f225624e, str);
    }

    @Override // com.avito.android.profile.user_profile.cards.virtual_deal_room.f
    public final void c(@k Y41.a<G0> aVar) {
        this.f225621b.setOnClickListener(new com.avito.android.profile.edit.adapter.c(27, aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.virtual_deal_room.f
    public final void f(@k String str) {
        this.f225623d.setText(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.virtual_deal_room.f
    public final void setTitle(@k String str) {
        this.f225622c.setText(str);
    }
}
