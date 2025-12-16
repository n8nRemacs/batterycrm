package com.avito.android.wallet.page.mvi;

import PK0.m;
import Y61.k;
import Y61.l;
import ZO0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC19927a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.verification.verification_input_inn.o;
import com.avito.android.wallet.page.WalletPagePromoBannerView;
import com.avito.android.wallet.page.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: WalletPageView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/mvi/g;", "", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f328213a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AbstractC19927a f328214b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.l<ZO0.b, G0> f328215c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f328216d;

    /* renamed from: e, reason: collision with root package name */
    public final SwipeRefreshLayout f328217e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f328218f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f328219g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f328220h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f328221i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewGroup f328222j;

    /* renamed from: k, reason: collision with root package name */
    public final View f328223k;

    /* renamed from: l, reason: collision with root package name */
    public final Button f328224l;

    /* renamed from: m, reason: collision with root package name */
    public final WalletPagePromoBannerView f328225m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final c f328226n;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k View view, @l AbstractC19927a abstractC19927a, @k Y41.l<? super ZO0.b, G0> lVar) {
        this.f328213a = view;
        this.f328214b = abstractC19927a;
        this.f328215c = lVar;
        this.f328216d = (ViewGroup) view.findViewById(R.id.payment_wallet_page_content_layout);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.f328217e = swipeRefreshLayout;
        this.f328218f = (TextView) view.findViewById(R.id.wallet_balance_money_title);
        this.f328219g = (TextView) view.findViewById(R.id.wallet_balance_money);
        this.f328220h = (TextView) view.findViewById(R.id.wallet_balance_bonus);
        this.f328221i = (TextView) view.findViewById(R.id.wallet_bonuses_title);
        this.f328222j = (ViewGroup) view.findViewById(R.id.wallet_page_error);
        this.f328223k = view.findViewById(R.id.wallet_page_loading_indicator);
        this.f328224l = (Button) view.findViewById(R.id.wallet_balance_top_up_button);
        Button button = (Button) view.findViewById(R.id.wallet_balance_operations_history_button);
        Button button2 = (Button) view.findViewById(R.id.error_refresh_button);
        Button button3 = (Button) view.findViewById(R.id.error_return_to_profile_button);
        this.f328225m = (WalletPagePromoBannerView) view.findViewById(R.id.payment_wallet_page_banner);
        this.f328226n = new c(view.findViewById(R.id.wallet_page_unavailable), lVar);
        final int i12 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.wallet.page.mvi.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f328174c;

            {
                this.f328174c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f328174c.f328215c.invoke(b.e.f20122a);
                        break;
                    case 1:
                        this.f328174c.f328215c.invoke(b.f.f20123a);
                        break;
                    default:
                        this.f328174c.f328215c.invoke(b.C1438b.f20119a);
                        break;
                }
            }
        });
        final int i13 = 1;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.wallet.page.mvi.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f328174c;

            {
                this.f328174c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f328174c.f328215c.invoke(b.e.f20122a);
                        break;
                    case 1:
                        this.f328174c.f328215c.invoke(b.f.f20123a);
                        break;
                    default:
                        this.f328174c.f328215c.invoke(b.C1438b.f20119a);
                        break;
                }
            }
        });
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, view.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 13));
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.wallet.page.mvi.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f328174c;

            {
                this.f328174c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f328174c.f328215c.invoke(b.e.f20122a);
                        break;
                    case 1:
                        this.f328174c.f328215c.invoke(b.f.f20123a);
                        break;
                    default:
                        this.f328174c.f328215c.invoke(b.C1438b.f20119a);
                        break;
                }
            }
        });
    }

    public final void a(@k com.avito.android.wallet.page.mvi.entity.a aVar) {
        Color color;
        Color color2;
        if (new com.avito.android.lib.util.c(aVar, null).f181333c) {
            return;
        }
        boolean z12 = aVar instanceof a.C10178a;
        ViewGroup viewGroup = this.f328222j;
        View view = this.f328223k;
        ViewGroup viewGroup2 = this.f328216d;
        c cVar = this.f328226n;
        if (z12) {
            D6.H(viewGroup2);
            D6.w(view);
            D6.w(viewGroup);
            D6.w(cVar.f328093a);
            a.C10178a c10178a = (a.C10178a) aVar;
            AbstractC19927a abstractC19927a = this.f328214b;
            if (abstractC19927a != null) {
                abstractC19927a.w(c10178a.f328199b);
            }
            ZO0.d dVar = c10178a.f328200c;
            View view2 = this.f328213a;
            TextView textView = this.f328218f;
            if (textView != null) {
                String string = dVar.f20131b;
                if (string == null) {
                    string = view2.getContext().getString(R.string.payment_wallet_page_balance_title);
                }
                textView.setText(string);
            }
            String str = dVar.f20132c;
            TextView textView2 = this.f328219g;
            if (str != null && textView2 != null) {
                Context context = view2.getContext();
                m.f12986a.getClass();
                Integer numA = m.a(context, str);
                textView2.setTextAppearance(numA != null ? numA.intValue() : com.avito.android.lib.util.f.r(context, str));
            }
            if (textView2 != null) {
                textView2.setText(dVar.f20130a);
            }
            ZO0.c cVar2 = c10178a.f328201d;
            TextView textView3 = this.f328220h;
            TextView textView4 = this.f328221i;
            if (cVar2 != null) {
                if (textView4 != null) {
                    String string2 = cVar2.f20127b;
                    if (string2 == null) {
                        string2 = view2.getContext().getString(R.string.payment_wallet_page_bonuses_title);
                    }
                    textView4.setText(string2);
                }
                D6.H(textView4);
                String str2 = cVar2.f20128c;
                if (str2 != null && textView3 != null) {
                    Context context2 = view2.getContext();
                    m.f12986a.getClass();
                    Integer numA2 = m.a(context2, str2);
                    textView3.setTextAppearance(numA2 != null ? numA2.intValue() : com.avito.android.lib.util.f.r(context2, str2));
                }
                I5.a(textView3, cVar2.f20126a, false);
                if (cVar2.f20129d != null) {
                    I5.d(textView4, null, C35835l0.m(view2.getContext(), R.attr.ic_help16, R.attr.warmGray28), 11);
                    textView4.setOnClickListener(new o(4, this, cVar2));
                } else {
                    I5.d(textView4, null, null, 11);
                    textView4.setOnClickListener(null);
                }
            } else {
                D6.w(textView3);
                D6.w(textView4);
            }
            ZO0.l lVar = c10178a.f328202e;
            Button button = this.f328224l;
            if (lVar == null) {
                D6.g(button);
            } else {
                D6.H(button);
                button.setText(lVar.f20156a);
                button.setOnClickListener(new o(5, this, lVar));
            }
            e eVar = new e(this);
            f fVar = new f(this);
            WalletPagePromoBannerView walletPagePromoBannerView = this.f328225m;
            ZO0.f fVar2 = walletPagePromoBannerView.f327758f;
            ZO0.f fVar3 = c10178a.f328203f;
            if (!new com.avito.android.lib.util.c(fVar3, fVar2).f181333c) {
                walletPagePromoBannerView.f327758f = fVar3;
                if (fVar3 == null) {
                    D6.w(walletPagePromoBannerView);
                } else {
                    D6.H(walletPagePromoBannerView);
                    eVar.invoke();
                    AttributedText attributedText = fVar2 != null ? fVar2.f20138a : null;
                    AttributedText attributedText2 = fVar3.f20138a;
                    if (!new com.avito.android.lib.util.c(attributedText2, attributedText).f181333c) {
                        j.a(walletPagePromoBannerView.f327754b, attributedText2, null);
                    }
                    AttributedText attributedText3 = fVar2 != null ? fVar2.f20139b : null;
                    AttributedText attributedText4 = fVar3.f20139b;
                    if (!new com.avito.android.lib.util.c(attributedText4, attributedText3).f181333c) {
                        j.a(walletPagePromoBannerView.f327755c, attributedText4, null);
                    }
                    ZO0.h hVar = fVar2 != null ? fVar2.f20141d : null;
                    ZO0.h hVar2 = fVar3.f20141d;
                    if (!new com.avito.android.lib.util.c(hVar2, hVar).f181333c) {
                        walletPagePromoBannerView.g(walletPagePromoBannerView.f327756d, hVar2);
                    }
                    ZO0.h hVar3 = fVar2 != null ? fVar2.f20142e : null;
                    ZO0.h hVar4 = fVar3.f20142e;
                    if (!new com.avito.android.lib.util.c(hVar4, hVar3).f181333c) {
                        walletPagePromoBannerView.g(walletPagePromoBannerView.f327757e, hVar4);
                    }
                    ZO0.g gVar = fVar2 != null ? fVar2.f20140c : null;
                    ZO0.g gVar2 = fVar3.f20140c;
                    if (!new com.avito.android.lib.util.c(gVar2, gVar).f181333c) {
                        C48063a c48063a = C48063a.f437606a;
                        Context context3 = walletPagePromoBannerView.getContext();
                        String str3 = gVar2 != null ? gVar2.f20146c : null;
                        Integer numValueOf = (gVar2 == null || (color2 = gVar2.f20144a) == null) ? null : Integer.valueOf(color2.getValue());
                        if (gVar2 == null || (color = gVar2.f20145b) == null) {
                            color = gVar2 != null ? gVar2.f20144a : null;
                        }
                        Integer numD = C48063a.d(c48063a, context3, str3, numValueOf, color != null ? Integer.valueOf(color.getValue()) : null);
                        walletPagePromoBannerView.setBackgroundTintList(ColorStateList.valueOf(numD != null ? numD.intValue() : R.attr.white));
                    }
                    DeepLink deepLink = fVar2 != null ? fVar2.f20143f : null;
                    DeepLink deepLink2 = fVar3.f20143f;
                    if (!new com.avito.android.lib.util.c(deepLink2, deepLink).f181333c) {
                        walletPagePromoBannerView.setClickable(deepLink2 != null);
                        walletPagePromoBannerView.setFocusable(deepLink2 != null);
                        if (deepLink2 != null) {
                            walletPagePromoBannerView.setOnClickListener(new XA0.c(fVar, deepLink2, 21));
                        } else {
                            walletPagePromoBannerView.setOnClickListener(null);
                        }
                    }
                }
            }
        } else if (aVar instanceof a.b) {
            D6.w(viewGroup2);
            D6.w(view);
            D6.H(viewGroup);
            D6.w(cVar.f328093a);
        } else if (aVar instanceof a.d) {
            D6.w(viewGroup2);
            D6.w(view);
            D6.w(viewGroup);
            D6.H(cVar.f328093a);
            a.d dVar2 = (a.d) aVar;
            a.d dVar3 = cVar.f328099g;
            String str4 = dVar3 != null ? dVar3.f328207b : null;
            String str5 = dVar2.f328207b;
            if (!new com.avito.android.lib.util.c(str5, str4).f181333c) {
                I5.a(cVar.f328095c, str5, false);
            }
            a.d dVar4 = cVar.f328099g;
            String str6 = dVar4 != null ? dVar4.f328208c : null;
            String str7 = dVar2.f328208c;
            if (!new com.avito.android.lib.util.c(str7, str6).f181333c) {
                I5.a(cVar.f328096d, str7, false);
            }
            a.d dVar5 = cVar.f328099g;
            ZO0.a aVar2 = dVar5 != null ? dVar5.f328209d : null;
            ZO0.a aVar3 = dVar2.f328209d;
            if (!new com.avito.android.lib.util.c(aVar3, aVar2).f181333c) {
                cVar.a(cVar.f328097e, aVar3);
            }
            a.d dVar6 = cVar.f328099g;
            ZO0.a aVar4 = dVar6 != null ? dVar6.f328210e : null;
            ZO0.a aVar5 = dVar2.f328210e;
            if (!new com.avito.android.lib.util.c(aVar5, aVar4).f181333c) {
                cVar.a(cVar.f328098f, aVar5);
            }
            cVar.f328099g = dVar2;
        } else if (aVar instanceof a.c) {
            D6.w(viewGroup2);
            D6.H(view);
            D6.w(viewGroup);
            D6.w(cVar.f328093a);
        }
        this.f328217e.setRefreshing(aVar.getF328198a());
    }
}
