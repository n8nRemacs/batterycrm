package com.avito.android.profile.user_profile.cards.calls;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.profile.user_profile.cards.o;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CallsCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/calls/g;", "Lcom/avito/android/profile/user_profile/cards/calls/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f224845b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f224846c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f224847d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f224848e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f224849f;

    /* compiled from: CallsCardView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224850l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224850l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224850l.invoke();
            return G0.f406611a;
        }
    }

    public g(@k View view, @k o oVar) {
        super(view);
        this.f224845b = oVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224846c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224847d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.dot);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224848e = viewFindViewById3;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.calls_action_button);
        this.f224849f = cVarA;
        cVarA.b(oVar.b());
    }

    @Override // com.avito.android.profile.user_profile.cards.calls.f
    public final void ei(@k Y41.a aVar, @k String str, @k String str2, boolean z12) {
        this.f224846c.setText(str);
        TextView textView = this.f224847d;
        textView.setText(str2);
        o oVar = this.f224845b;
        textView.setTextColor(z12 ? oVar.h() : oVar.g());
        D6.G(this.f224848e, z12);
        this.f224849f.c(new a(aVar));
    }
}
