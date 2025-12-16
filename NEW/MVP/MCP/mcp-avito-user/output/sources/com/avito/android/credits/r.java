package com.avito.android.credits;

import Ds.InterfaceC13437a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import androidx.browser.customtabs.h;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.V;
import com.avito.android.Y;
import com.avito.android.Z;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.Z0;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.credits.calculator.C29615b;
import com.avito.android.credits.credit_partner_screen.a;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.credits.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.credit_broker.Contest;
import com.avito.android.remote.model.credit_broker.CreditProgress;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.IconName;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.avito.android.remote.model.credit_broker.OfferDetailsItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.C35809h6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CreditCalculatorPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/r;", "Lcom/avito/android/credits/q;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13437a f129026b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f129027c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y f129028d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z f129029e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final V f129030f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.installments.d f129031g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.credits.calculator.l f129032h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Z0 f129033i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public I1 f129034j;

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CreditCalculator.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CreditCalculator.Type type = CreditCalculator.Type.f128977b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CreditCalculator.Type type2 = CreditCalculator.Type.f128977b;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CreditCalculator.Type type3 = CreditCalculator.Type.f128977b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CreditCalculator.Type type4 = CreditCalculator.Type.f128977b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CreditCalculator.Type type5 = CreditCalculator.Type.f128977b;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CreditCalculator.Type type6 = CreditCalculator.Type.f128977b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CreditCalculator f129035l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f129036m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ CreditCalculator f129037n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CreditCalculator creditCalculator, r rVar, CreditCalculator creditCalculator2) {
            super(0);
            this.f129035l = creditCalculator;
            this.f129036m = rVar;
            this.f129037n = creditCalculator2;
        }

        @Override // Y41.a
        public final G0 invoke() {
            CreditProgress.Block leftBlock;
            AttributedText attributedText;
            CreditProgress.Block rightBlock;
            AttributedText attributedText2;
            AttributedText attributedText3;
            CreditCalculator creditCalculator = this.f129035l;
            AttributedText attributedText4 = creditCalculator.f128952b;
            r rVar = this.f129036m;
            if (attributedText4 != null) {
                r.k(rVar, attributedText4);
            }
            AttributedText attributedText5 = creditCalculator.f128956f;
            if (attributedText5 != null) {
                r.k(rVar, attributedText5);
            }
            CreditCalculator creditCalculator2 = this.f129037n;
            com.avito.android.credits.models.d dVar = creditCalculator2 instanceof com.avito.android.credits.models.d ? (com.avito.android.credits.models.d) creditCalculator2 : null;
            if (dVar != null) {
                List<OfferDetailsItem> list = dVar.f128995E;
                if (list != null) {
                    for (OfferDetailsItem offerDetailsItem : list) {
                        if (offerDetailsItem != null && (attributedText3 = offerDetailsItem.getAttributedText()) != null) {
                            r.k(rVar, attributedText3);
                        }
                    }
                }
                CreditProgress creditProgress = dVar.f128994D;
                if (creditProgress != null && (rightBlock = creditProgress.getRightBlock()) != null && (attributedText2 = rightBlock.getAttributedText()) != null) {
                    r.k(rVar, attributedText2);
                }
                if (creditProgress != null && (leftBlock = creditProgress.getLeftBlock()) != null && (attributedText = leftBlock.getAttributedText()) != null) {
                    r.k(rVar, attributedText);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/credits/models/CreditCalculator;", "kotlin.jvm.PlatformType", "data", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/credits/models/CreditCalculator;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<CreditCalculator, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CreditCalculator creditCalculator) {
            CreditCalculator creditCalculator2 = creditCalculator;
            if (creditCalculator2 != null) {
                r.this.O(creditCalculator2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Uri, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            Z0 z02;
            AdvertDetailsFragment advertDetailsFragment;
            Context context;
            Uri uri2 = uri;
            if (uri2 != null && (z02 = r.this.f129033i) != null && (context = (advertDetailsFragment = z02.f72298c).getContext()) != null) {
                h.i iVar = new h.i();
                iVar.f22867b.f22826a = Integer.valueOf(androidx.core.content.d.getColor(context, R.color.legacy_white) | (-16777216));
                iVar.b(false);
                advertDetailsFragment.startActivity(iVar.a().f22864a.setData(uri2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "kotlin.jvm.PlatformType", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            boolean z12 = deepLink2 instanceof DialogDeepLink;
            r rVar = r.this;
            if (z12) {
                com.avito.android.credits.calculator.l lVar = rVar.f129032h;
                if (lVar != null) {
                    lVar.sg(((DialogDeepLink) deepLink2).f133257e);
                }
            } else {
                Z0 z02 = rVar.f129033i;
                if (z02 != null) {
                    z02.g(null, deepLink2, null);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LDs/g;", "kotlin.jvm.PlatformType", "screenData", "Lkotlin/G0;", "invoke", "(LDs/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Ds.g, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Ds.g gVar) {
            com.avito.android.credits.credit_partner_screen.a cVar;
            Ds.g gVar2 = gVar;
            if (!C35809h6.a(gVar2.f3515a)) {
                r rVar = r.this;
                rVar.getClass();
                int iOrdinal = gVar2.f3516b.ordinal();
                Z z12 = rVar.f129029e;
                switch (iOrdinal) {
                    case 0:
                    case 1:
                        cVar = new a.c(z12.getF128569g());
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        break;
                    case 5:
                        cVar = new a.b(z12.getF128569g());
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Z0 z02 = rVar.f129033i;
                if (z02 != null) {
                    String f128566d = rVar.f129028d.getF128566d();
                    AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
                    NavigationTabSetItem navigationTabSetItemQ5 = advertDetailsFragment.q5();
                    advertDetailsFragment.startActivity(z02.f72308m.a(cVar.f128769a, gVar2.f3515a, navigationTabSetItemQ5, z02.f72297b, f128566d));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Uri, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            Z0 z02;
            Intent intentQ;
            Uri uri2 = uri;
            if (uri2 != null && !C35809h6.a(uri2) && (z02 = r.this.f129033i) != null && (intentQ = z02.f72315t.q(uri2, null)) != null) {
                z02.f72298c.startActivity(intentQ);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isEditing", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Boolean, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            com.avito.android.credits.calculator.l lVar;
            if (bool.booleanValue() && (lVar = r.this.f129032h) != null) {
                lVar.tJ();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<G0, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            I1 i12 = r.this.f129034j;
            if (i12 != null) {
                t.a.a(i12, CreditCalculatorItem.class, 0, 14);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/LoanTerms$Term;", "kotlin.jvm.PlatformType", "term", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/credit_broker/LoanTerms$Term;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<LoanTerms.Term, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LoanTerms.Term term) {
            r.this.f129031g.e(term);
            return G0.f406611a;
        }
    }

    /* compiled from: CreditCalculatorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f129046b;

        /* JADX WARN: Multi-variable type inference failed */
        public k(Y41.l lVar) {
            this.f129046b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f129046b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f129046b;
        }

        public final int hashCode() {
            return this.f129046b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f129046b.invoke(obj);
        }
    }

    @Inject
    public r(@Y61.k InterfaceC13437a interfaceC13437a, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.k Y y12, @Y61.k Z z12, @Y61.k V v12, @Y61.k com.avito.android.credits.installments.d dVar) {
        this.f129026b = interfaceC13437a;
        this.f129027c = lVar;
        this.f129028d = y12;
        this.f129029e = z12;
        this.f129030f = v12;
        this.f129031g = dVar;
    }

    public static final void k(r rVar, AttributedText attributedText) {
        rVar.getClass();
        attributedText.setOnUrlClickListener(null);
        attributedText.setOnDeepLinkClickListener(null);
    }

    @Override // com.avito.android.credits.q
    public final void A4(@Y61.k Z0 z02) {
        this.f129033i = z02;
    }

    @Override // com.avito.android.credits.q
    public final void M() {
        InterfaceC22983P interfaceC22983PE = this.f129027c.e();
        InterfaceC13437a interfaceC13437a = this.f129026b;
        interfaceC13437a.getF3506L().observe(interfaceC22983PE, new k(new c()));
        interfaceC13437a.getF3507M().observe(interfaceC22983PE, new k(new d()));
        interfaceC13437a.getF3508N().observe(interfaceC22983PE, new k(new e()));
        interfaceC13437a.getF3509O().observe(interfaceC22983PE, new k(new f()));
        interfaceC13437a.getF3510P().observe(interfaceC22983PE, new k(new g()));
        interfaceC13437a.getF3511Q().observe(interfaceC22983PE, new k(new h()));
        interfaceC13437a.getF3513S().observe(interfaceC22983PE, new k(new i()));
        interfaceC13437a.getF3512R().observe(interfaceC22983PE, new k(new j()));
    }

    public final com.avito.android.credits.calculator.l O(CreditCalculator creditCalculator) {
        Contest contest;
        EntryPoint.Action action;
        com.avito.android.credits.calculator.l lVar = this.f129032h;
        if (lVar == null) {
            return null;
        }
        lVar.yp(creditCalculator.f128952b, creditCalculator.f128951a, creditCalculator.f128953c);
        lVar.gH(creditCalculator.f128956f, creditCalculator.f128954d, creditCalculator.f128955e);
        EntryPoint f129006b = creditCalculator.getF129006B();
        boolean zF2 = (f129006b == null || (action = f129006b.getAction()) == null) ? false : L.f(action.getIsContest(), Boolean.TRUE);
        if ((creditCalculator instanceof com.avito.android.credits.models.f) && (lVar instanceof C29615b) && zF2 && (contest = ((com.avito.android.credits.models.f) creditCalculator).f129010F) != null) {
            C29615b c29615b = (C29615b) lVar;
            String text = contest.getText();
            UniversalColor color = contest.getColor();
            TextView textView = c29615b.f128670v;
            if (textView != null) {
                u.a(textView, text, color);
                textView.setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(c29615b, 11));
            }
        }
        if ((creditCalculator instanceof com.avito.android.credits.models.d) && (lVar instanceof com.avito.android.credits.calculator.A)) {
            com.avito.android.credits.calculator.A a12 = (com.avito.android.credits.calculator.A) lVar;
            com.avito.android.credits.models.d dVar = (com.avito.android.credits.models.d) creditCalculator;
            a12.J80(dVar.f128994D);
            a12.K80(dVar.f128995E);
            a12.H80(dVar.f128996F, dVar.f128993C, dVar.f128999I);
            LoanTerms.Term term = dVar.f128993C;
            if (term != null) {
                this.f129031g.e(term);
            }
            a12.F80(dVar.f128997G);
        }
        lVar.cE(new Q(Integer.valueOf(creditCalculator.f128972v), creditCalculator.f128975y), creditCalculator.f128973w, creditCalculator.f128969s, creditCalculator.getF129008D(), new Q(Integer.valueOf(creditCalculator.f128971u), creditCalculator.f128976z), creditCalculator.f128974x);
        lVar.t(new b(creditCalculator, this, creditCalculator));
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.credits.calculator.l lVar = (com.avito.android.credits.calculator.l) eVar;
        CreditCalculatorItem creditCalculatorItem = (CreditCalculatorItem) aVar;
        this.f129032h = lVar;
        lVar.Yv(creditCalculatorItem.f128556e);
        lVar.T60(creditCalculatorItem.f128557f);
        InterfaceC13437a interfaceC13437a = this.f129026b;
        CreditCalculator creditCalculator = (CreditCalculator) interfaceC13437a.getF3506L().getValue();
        if (creditCalculator != null) {
            O(creditCalculator);
        }
        if (lVar instanceof com.avito.android.credits.calculator.D) {
            ((com.avito.android.credits.calculator.D) lVar).f128702d.setCompoundDrawablesWithIntrinsicBounds(0, 0, creditCalculatorItem.f128555d == IconName.SBER_AUTO ? R.drawable.credits_sber_logo : R.drawable.cetelem_credit_partner_logo, 0);
        }
        lVar.Gw(interfaceC13437a);
    }

    @Override // com.avito.android.credits.q
    public final void a4(@Y61.l I1 i12) {
        this.f129034j = i12;
    }

    @Override // com.avito.android.credits.q
    public final void f0() {
        this.f129033i = null;
        this.f129034j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.credits.q
    @Y61.l
    public final CreditCalculator getData() {
        return (CreditCalculator) this.f129026b.getF3506L().getValue();
    }

    @Override // com.avito.android.credits.q
    public final void k7(@Y61.k CreditCalculator creditCalculator) {
        this.f129026b.g5(creditCalculator);
        this.f129031g.d(this.f129030f);
    }
}
