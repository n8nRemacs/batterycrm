package com.avito.android.profile.user_profile.cards.tariff;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/tariff/h;", "Lcom/avito/android/profile/user_profile/cards/tariff/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f225602b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f225603c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f225604d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f225605e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f225606f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f225607g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225608h;

    /* compiled from: TariffCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225609l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225609l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225609l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f225602b = aVar;
        this.f225603c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f225604d = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225605e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225606f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f225607g = viewFindViewById4;
        this.f225608h = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_text);
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225608h.c(new a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void XV(@l String str) {
        I5.a(this.f225606f, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void io() {
        D6.w(this.f225607g);
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void lg() {
        ImageView imageView = this.f225604d;
        imageView.setImageResource(R.drawable.ic_subscribe_24);
        imageView.setColorFilter(C35835l0.d(R.attr.gray28, this.f225603c));
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void n00(@k String str) {
        I5.a(this.f225605e, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void o80(@k String str) {
        D6.H(this.f225607g);
        this.f225608h.b(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void qI() {
        ImageView imageView = this.f225604d;
        imageView.setImageResource(R.drawable.ic_error_24);
        imageView.setColorFilter(C35835l0.d(R.attr.red, this.f225603c));
    }

    @Override // com.avito.android.profile.user_profile.cards.tariff.g
    public final void qk(@l AttributedText attributedText) {
        I5.a(this.f225606f, this.f225602b.c(this.f225603c, attributedText), false);
    }
}
