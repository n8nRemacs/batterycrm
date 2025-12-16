package com.avito.android.profile.user_profile.cards.promotions;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.point.Point;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PromotionsCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/promotions/h;", "Lcom/avito/android/profile/user_profile/cards/promotions/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f225274b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225275c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Badge f225276d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Point f225277e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225278f;

    /* compiled from: PromotionsCardView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225279l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225279l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225279l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.card_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225274b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.card_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225275c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.card_title_badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f225276d = (Badge) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.card_description_point);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        this.f225277e = (Point) viewFindViewById4;
        this.f225278f = com.avito.android.profile.user_profile.cards.d.a(view, R.id.promotions_card_action_button);
    }

    @Override // com.avito.android.profile.user_profile.cards.promotions.g
    public final void I1(@l String str) {
        Badge badge = this.f225276d;
        if (str == null) {
            D6.w(badge);
        } else {
            badge.setTitleText(str);
            D6.H(badge);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.promotions.g
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f225278f;
        cVar.b(str);
        cVar.c(new a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.promotions.g
    public final void h(@k String str) {
        this.f225275c.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f225278f.c(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.promotions.g
    public final void qF(boolean z12) {
        Point point = this.f225277e;
        if (z12) {
            D6.H(point);
        } else {
            D6.w(point);
        }
    }

    @Override // com.avito.android.profile.user_profile.cards.promotions.g
    public final void setTitle(@k String str) {
        this.f225274b.setText(str);
    }
}
