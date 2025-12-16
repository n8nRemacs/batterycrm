package com.avito.android.travel_payment_methods.items.loan_terms;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_payment_methods.model.LoanTerm;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48065c;

/* compiled from: LoanTermsViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/A;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/travel_payment_methods/items/loan_terms/u;", "a", "b", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class A extends com.avito.konveyor.adapter.b implements u {

    /* renamed from: i, reason: collision with root package name */
    public static final int f302478i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f302479b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f302480c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f302481d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f302482e;

    /* renamed from: f, reason: collision with root package name */
    public final Chips f302483f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f302484g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f302485h;

    /* compiled from: LoanTermsViewImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/A$a;", "", "<init>", "()V", "", "DEFAULT_DASH_COLOR", "I", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LoanTermsViewImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/A$b;", "Lcom/avito/android/lib/design/chips/h;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LoanTerm f302486b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f302487c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f302488d;

        public b(@Y61.k LoanTerm loanTerm) {
            this.f302486b = loanTerm;
            this.f302487c = loanTerm.f302536e;
            this.f302488d = loanTerm.f302539h;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            if (!(obj instanceof com.avito.android.lib.design.chips.h)) {
                return false;
            }
            String str = this.f302487c;
            if (str.length() > 0) {
                com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
                if (hVar.getF262141c().length() > 0) {
                    return L.f(str, hVar.getF262141c());
                }
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f302487c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0, reason: from getter */
        public final boolean getF106770d() {
            return this.f302488d;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }
    }

    static {
        new a(null);
        f302478i = R.attr.gray16;
    }

    public A(@Y61.k View view) {
        super(view);
        this.f302479b = view;
        this.f302480c = (TextView) view.findViewById(R.id.loan_title);
        this.f302481d = (TextView) view.findViewById(R.id.loan_subtitle);
        this.f302482e = (LinearLayout) view.findViewById(R.id.blocks_container);
        this.f302483f = (Chips) view.findViewById(R.id.loan_terms_chips);
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.u
    public final void E60(@Y61.k LoanTermsItem loanTermsItem, @Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f302479b.addOnAttachStateChangeListener(new c(loanTermsItem, this));
        List<LoanTerm> list = loanTermsItem.f302495d;
        int size = list.size();
        Chips chips = this.f302483f;
        if (size <= 1) {
            D6.w(chips);
            return;
        }
        D6.H(chips);
        l0.a aVar = new l0.a();
        aVar.f406838b = true;
        chips.setChipsSelectedListener(new d(aVar, pVar));
        chips.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((LoanTerm) obj).f302536e;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new b((LoanTerm) it.next()));
        }
        chips.setData(arrayList2);
        chips.p((int) loanTermsItem.f302494c, true);
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.u
    public final void Na(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f302484g = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // com.avito.android.travel_payment_methods.items.loan_terms.u
    public final void dL(@Y61.l LoanTerm.Progress progress) {
        if (progress == null) {
            return;
        }
        LinearLayout linearLayout = this.f302482e;
        linearLayout.removeAllViews();
        ?? r42 = 0;
        int i12 = 0;
        for (Object obj : progress.f302542d) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            LoanTerm.Progress.ProgressBlock progressBlock = (LoanTerm.Progress.ProgressBlock) obj;
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.layout_progress_block, (ViewGroup) null, (boolean) r42);
            Long l12 = progressBlock.f302543b;
            LinearLayout.LayoutParams layoutParams = l12 != null ? new LinearLayout.LayoutParams(y6.b((int) l12.longValue()), -2) : new LinearLayout.LayoutParams(r42, -2, 1.0f);
            layoutParams.setMarginStart(i12 != 0 ? y6.b((int) progress.f302540b) : r42);
            viewInflate.setLayoutParams(layoutParams);
            View viewFindViewById = viewInflate.findViewById(R.id.dashes_container);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            LinearLayout linearLayout2 = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.text_block_title);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            Long l13 = progressBlock.f302548g;
            layoutParams2.topMargin = l13 != null ? y6.b((int) l13.longValue()) : r42;
            textView.setLayoutParams(layoutParams2);
            View viewFindViewById3 = viewInflate.findViewById(R.id.text_block_subtitle);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById3;
            AttributedText attributedText = progressBlock.f302549h;
            if (attributedText != null) {
                attributedText.setOnDeepLinkClickListener(new z(this, 0));
            }
            com.avito.android.util.text.j.a(textView, attributedText, null);
            AttributedText attributedText2 = progressBlock.f302547f;
            if (attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new z(this, 0));
                com.avito.android.util.text.j.a(textView2, attributedText2, null);
            }
            int i14 = (int) progress.f302541c;
            Drawable drawableL = C35835l0.l(C43852a.a(linearLayout2.getContext(), R.drawable.term_progress_dash), C48065c.d(linearLayout2.getContext(), progressBlock.f302544c, f302478i));
            int i15 = (int) progressBlock.f302545d;
            for (int i16 = r42; i16 < i15; i16++) {
                View view = new View(linearLayout2.getContext());
                view.setBackground(drawableL);
                LinearLayout linearLayout3 = linearLayout2;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(l12 != null ? y6.b((int) l12.longValue()) : 0, y6.b(i14));
                if (l12 == null) {
                    layoutParams3.weight = 1.0f;
                }
                if (i16 > 0) {
                    Long l14 = progressBlock.f302546e;
                    layoutParams3.setMarginStart(l14 != null ? y6.b((int) l14.longValue()) : 0);
                }
                view.setLayoutParams(layoutParams3);
                linearLayout2 = linearLayout3;
                linearLayout2.addView(view);
            }
            linearLayout.addView(viewInflate);
            i12 = i13;
            r42 = 0;
        }
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.u
    public final void g1(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f302485h = lVar;
    }

    @Override // com.avito.android.travel_payment_methods.items.loan_terms.u
    public final void mp(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new z(this, 1));
            com.avito.android.util.text.j.c(this.f302480c, attributedText, null);
        }
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(new z(this, 1));
            com.avito.android.util.text.j.c(this.f302481d, attributedText2, null);
        }
    }

    /* compiled from: LoanTermsViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/travel_payment_methods/items/loan_terms/A$c", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LoanTermsItem f302489b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f302490c;

        public c(LoanTermsItem loanTermsItem, A a12) {
            this.f302489b = loanTermsItem;
            this.f302490c = a12;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            Y41.l<? super String, G0> lVar;
            String str = this.f302489b.f302496e;
            if (str == null || (lVar = this.f302490c.f302484g) == null) {
                return;
            }
            lVar.invoke(str);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }

    /* compiled from: LoanTermsViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/travel_payment_methods/items/loan_terms/A$d", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_travel-payment-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l0.a f302491a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f302492b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(l0.a aVar, Y41.p<? super String, ? super String, G0> pVar) {
            this.f302491a = aVar;
            this.f302492b = (N) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            l0.a aVar = this.f302491a;
            if (aVar.f406838b) {
                aVar.f406838b = false;
                return;
            }
            b bVar = hVar instanceof b ? (b) hVar : null;
            if (bVar != null) {
                LoanTerm loanTerm = bVar.f302486b;
                this.f302492b.invoke(loanTerm.f302536e, loanTerm.f302533b);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
