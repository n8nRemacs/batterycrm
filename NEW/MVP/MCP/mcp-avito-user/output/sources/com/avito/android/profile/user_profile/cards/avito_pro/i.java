package com.avito.android.profile.user_profile.cards.avito_pro;

import L91.q;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.profile.user_profile.cards.c;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoProCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/avito_pro/i;", "Lcom/avito/android/profile/user_profile/cards/avito_pro/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f224818e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f224819b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PU.b f224820c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f224821d;

    /* compiled from: AvitoProCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224822l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224822l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224822l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: AvitoProCardItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f224823l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f224824m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.avito.android.lib.design.tooltip.k kVar) {
            super(1);
            this.f224823l = str;
            this.f224824m = kVar;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            o oVar2 = oVar;
            oVar2.b(this.f224823l);
            oVar2.f(true);
            oVar2.e(new com.avito.android.advert.item.safedeal.trust_factors.k(this.f224824m, 7));
            return G0.f406611a;
        }
    }

    /* compiled from: AvitoProCardItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f224825l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ i f224826m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.lib.design.tooltip.k kVar, i iVar) {
            super(0);
            this.f224825l = kVar;
            this.f224826m = iVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            this.f224825l.f(this.f224826m.itemView.findViewById(R.id.user_profile_common_card_container));
            return Boolean.TRUE;
        }
    }

    public i(@k View view) {
        super(view);
        this.f224819b = view.getContext();
        this.f224820c = c.a.a(view, R.id.user_profile_common_card_container);
        TextView textView = (TextView) view.findViewById(R.id.text_icon);
        this.f224821d = textView;
        FV.a.f4720a.getClass();
        FV.a.j(textView, R.attr.textIconWork, 0);
    }

    @Override // com.avito.android.profile.user_profile.cards.avito_pro.h
    public final void NW(boolean z12) {
        this.f224821d.setVisibility(z12 ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.profile.user_profile.cards.avito_pro.h
    public final void T6(@k String str, @k Y41.a<G0> aVar) throws Resources.NotFoundException {
        Context context = this.f224819b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.profile_avito_pro_anchor_offset);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.profile_avito_pro_display_min_padding);
        r.d dVar = new r.d(new i.a(null, 1, 0 == true ? 1 : 0));
        dVar.j(dimensionPixelSize);
        dVar.m(dimensionPixelSize2);
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(context, 0, 0, 6, null);
        int i12 = kVar.f181229o;
        kVar.f181228n = -2;
        kVar.f181229o = i12;
        kVar.f181224j = dVar;
        p.a(kVar, new b(str, kVar));
        kVar.d(new q(7));
        kVar.setOnDismissListener(new com.avito.android.campaigns_sale.konveyor.editBlock.o(1, aVar));
        D6.C(new c(kVar, this), this.itemView);
    }

    @Override // com.avito.android.profile.user_profile.cards.avito_pro.h
    public final void b(@k String str) {
        this.f224820c.g0(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.avito_pro.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f224820c.a(new a(aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f224820c.a(null);
    }

    @Override // com.avito.android.profile.user_profile.cards.avito_pro.h
    public final void n(@k String str) {
        this.f224820c.b(str);
    }
}
