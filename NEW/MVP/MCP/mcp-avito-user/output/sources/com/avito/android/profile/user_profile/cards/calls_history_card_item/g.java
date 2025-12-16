package com.avito.android.profile.user_profile.cards.calls_history_card_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/calls_history_card_item/g;", "Lcom/avito/android/profile/user_profile/cards/calls_history_card_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f224863b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224864c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f224865d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f224866e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f224867f;

    /* compiled from: CallsHistoryCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224868l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224868l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224868l.invoke();
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224863b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224864c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.dot);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224865d = viewFindViewById3;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.calls_action_button);
        this.f224866e = cVarA;
        View viewFindViewById4 = view.findViewById(R.id.icon_and_subtitle_group);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224867f = viewFindViewById4;
        cVarA.b(view.getContext().getString(R.string.open_calls_history_screen));
    }

    @Override // com.avito.android.profile.user_profile.cards.calls_history_card_item.f
    public final void e10(@k CardItem.CallsHistoryCardItem callsHistoryCardItem, @k Y41.a<G0> aVar) {
        String str;
        this.f224863b.setText(callsHistoryCardItem.f224372d);
        boolean zF2 = L.f(callsHistoryCardItem.f224374f, Boolean.TRUE);
        View view = this.f224867f;
        View view2 = this.f224865d;
        if (!zF2 || (str = callsHistoryCardItem.f224373e) == null || str.length() == 0) {
            D6.w(view2);
            D6.w(view);
        } else {
            D6.H(view2);
            D6.H(view);
            this.f224864c.setText(str);
        }
        this.f224866e.c(new a(aVar));
    }
}
