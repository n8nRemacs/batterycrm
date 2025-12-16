package com.avito.android.profile.user_profile.cards.adverts;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertsCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/adverts/h;", "Lcom/avito/android/profile/user_profile/cards/adverts/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C40723b f224776b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40723b f224777c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C40723b f224778d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f224779e;

    /* compiled from: AdvertsCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224780l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224780l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224780l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.active);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB, C35835l0.l(context.getDrawable(R.drawable.ic_item_24), C35835l0.d(R.attr.gray28, context)));
        this.f224776b = c40723bB;
        C40723b c40723bB2 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.inactive);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB2, C35835l0.l(context.getDrawable(R.drawable.ic_error_24), C35835l0.d(R.attr.red, context)));
        this.f224777c = c40723bB2;
        C40723b c40723bB3 = com.avito.android.profile.user_profile.cards.d.b(view, R.id.rejected);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB3, C35835l0.l(context.getDrawable(R.drawable.ic_error_24), C35835l0.d(R.attr.red, context)));
        this.f224778d = c40723bB3;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.show_adverts);
        cVarA.a(R.string.show_adverts);
        this.f224779e = cVarA;
    }

    @Override // com.avito.android.profile.user_profile.cards.adverts.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f224779e.c(new a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.adverts.g
    public final void VT(@l String str) {
        this.f224778d.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.adverts.g
    public final void an(@l String str) {
        this.f224776b.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.adverts.g
    public final void wD(@l String str) {
        this.f224777c.m6(str);
    }
}
