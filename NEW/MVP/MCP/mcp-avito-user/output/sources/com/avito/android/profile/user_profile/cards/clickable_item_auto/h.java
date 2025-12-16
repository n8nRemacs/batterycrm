package com.avito.android.profile.user_profile.cards.clickable_item_auto;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.c;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoClickableCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/clickable_item_auto/h;", "Lcom/avito/android/profile/user_profile/cards/clickable_item_auto/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f224886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Badge f224888d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PU.b f224889e;

    /* compiled from: AutoClickableCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224890l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224890l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224886b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224887c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.auto_clickable_item_badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        this.f224888d = (Badge) viewFindViewById3;
        this.f224889e = c.a.a(view, R.id.auto_clickable_item_container);
    }

    @Override // com.avito.android.profile.user_profile.cards.clickable_item_auto.g
    public final void G50(@k CardItem.AutoClickableCardItem autoClickableCardItem, @k Y41.a<G0> aVar) {
        this.f224886b.setText(autoClickableCardItem.f224313d);
        I5.a(this.f224887c, autoClickableCardItem.f224314e, false);
        com.avito.android.lib.design.badge.h.a(this.f224888d, autoClickableCardItem.f224315f);
        this.f224889e.a(new a(aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f224889e.a(null);
    }
}
