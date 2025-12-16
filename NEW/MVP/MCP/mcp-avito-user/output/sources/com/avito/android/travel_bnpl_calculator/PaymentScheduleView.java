package com.avito.android.travel_bnpl_calculator;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_bnpl_calculator.model.DashBlock;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypeDetails;
import com.avito.android.travel_bnpl_calculator.model.ScheduleVariant;
import com.avito.android.travel_bnpl_calculator.model.ScheduleVariantProgress;
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
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import m.C43852a;
import sK0.C48065c;

/* compiled from: PaymentScheduleView.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/PaymentScheduleView;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;", "data", "Lkotlin/G0;", "setupView", "(Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;)V", "Lkotlin/Function2;", "", "c", "LY41/p;", "getPaymentPlanSelectListener", "()LY41/p;", "setPaymentPlanSelectListener", "(LY41/p;)V", "paymentPlanSelectListener", "Lkotlin/Function0;", "d", "LY41/a;", "getPaymentPlanAttachListener", "()LY41/a;", "setPaymentPlanAttachListener", "(LY41/a;)V", "paymentPlanAttachListener", "a", "b", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentScheduleView extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f301641i;

    /* renamed from: b, reason: collision with root package name */
    @l
    public PaymentTypeDetails f301642b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public p<? super String, ? super String, G0> paymentPlanSelectListener;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public Y41.a<G0> paymentPlanAttachListener;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f301645e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f301646f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f301647g;

    /* renamed from: h, reason: collision with root package name */
    public final Chips f301648h;

    /* compiled from: PaymentScheduleView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/PaymentScheduleView$a;", "", "<init>", "()V", "", "DEFAULT_DASH_COLOR", "I", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentScheduleView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/PaymentScheduleView$b;", "Lcom/avito/android/lib/design/chips/h;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements h {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ScheduleVariant f301649b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f301650c;

        public b(@k ScheduleVariant scheduleVariant) {
            this.f301649b = scheduleVariant;
            this.f301650c = scheduleVariant.getTermTitle();
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            String str = this.f301650c;
            if (str.length() > 0) {
                h hVar = (h) obj;
                if (hVar.getF262141c().length() > 0) {
                    return L.f(str, hVar.getF262141c());
                }
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @k
        /* renamed from: W */
        public final CharSequence getF262141c() {
            return this.f301650c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final e getImage() {
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
        @l
        public final e q1() {
            return null;
        }
    }

    static {
        new a(null);
        f301641i = R.attr.gray16;
    }

    @j
    public PaymentScheduleView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static void a(ScheduleVariantProgress scheduleVariantProgress, LinearLayout linearLayout) {
        linearLayout.removeAllViews();
        int i12 = 0;
        for (Object obj : scheduleVariantProgress.d()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            DashBlock dashBlock = (DashBlock) obj;
            View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.layout_text_block, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = dashBlock.getBlockWidth() != null ? new LinearLayout.LayoutParams(y6.b(dashBlock.getBlockWidth().intValue()), -2) : new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMarginStart(i12 != 0 ? y6.b(scheduleVariantProgress.getBlockSpacing()) : 0);
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
            layoutParams2.topMargin = y6.b(dashBlock.getTextMarginTop());
            textView.setLayoutParams(layoutParams2);
            View viewFindViewById3 = viewInflate.findViewById(R.id.text_block_subtitle);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById3;
            com.avito.android.util.text.j.c(textView, dashBlock.getTitle(), null);
            AttributedText subtitle = dashBlock.getSubtitle();
            if (subtitle != null) {
                com.avito.android.util.text.j.c(textView2, subtitle, null);
            }
            int iE2 = scheduleVariantProgress.getDashHeight();
            Drawable drawableL = C35835l0.l(C43852a.a(linearLayout2.getContext(), R.drawable.term_progress), C48065c.d(linearLayout2.getContext(), dashBlock.getDashColor(), f301641i));
            int iE3 = dashBlock.getDashCount();
            for (int i14 = 0; i14 < iE3; i14++) {
                View view = new View(linearLayout2.getContext());
                view.setBackground(drawableL);
                Integer numC = dashBlock.getBlockWidth();
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(numC != null ? y6.b(numC.intValue()) : 0, y6.b(iE2));
                if (dashBlock.getBlockWidth() == null) {
                    layoutParams3.weight = 1.0f;
                }
                if (i14 > 0) {
                    layoutParams3.setMarginStart(y6.b(dashBlock.getDashSpacing()));
                }
                view.setLayoutParams(layoutParams3);
                linearLayout2.addView(view);
            }
            linearLayout.addView(viewInflate);
            i12 = i13;
        }
    }

    @l
    public final Y41.a<G0> getPaymentPlanAttachListener() {
        return this.paymentPlanAttachListener;
    }

    @l
    public final p<String, String, G0> getPaymentPlanSelectListener() {
        return this.paymentPlanSelectListener;
    }

    public final void setPaymentPlanAttachListener(@l Y41.a<G0> aVar) {
        this.paymentPlanAttachListener = aVar;
    }

    public final void setPaymentPlanSelectListener(@l p<? super String, ? super String, G0> pVar) {
        this.paymentPlanSelectListener = pVar;
    }

    public final void setupView(@k PaymentTypeDetails data) {
        ScheduleVariant scheduleVariant;
        D6.H(this);
        if (this.f301642b == data) {
            return;
        }
        this.f301642b = data;
        l0.a aVar = new l0.a();
        aVar.f406838b = true;
        List<ScheduleVariant> listC = data.c();
        int size = listC != null ? listC.size() : 0;
        Chips chips = this.f301648h;
        if (size < 1) {
            D6.w(chips);
            D6.w(this);
        } else if (size == 1) {
            List<ScheduleVariant> listC2 = data.c();
            if (listC2 == null || (scheduleVariant = (ScheduleVariant) C42745f0.K(0, listC2)) == null) {
                return;
            }
            com.avito.android.util.text.j.a(this.f301645e, scheduleVariant.getTitle(), null);
            com.avito.android.util.text.j.a(this.f301646f, scheduleVariant.getSubtitle(), null);
            a(scheduleVariant.getProgress(), this.f301647g);
            D6.w(chips);
        } else {
            D6.H(chips);
            if (data.c() != null) {
                List<ScheduleVariant> listC3 = data.c();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listC3) {
                    String strE = ((ScheduleVariant) obj).getTermTitle();
                    if (strE != null && strE.length() != 0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new b((ScheduleVariant) it.next()));
                }
                chips.setData(arrayList2);
            }
            chips.setChipsSelectedListener(new c(aVar));
            chips.j();
            Integer numD = data.getSelectedIndex();
            chips.p(numD != null ? numD.intValue() : 0, true);
        }
        Y41.a<G0> aVar2 = this.paymentPlanAttachListener;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public PaymentScheduleView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.loanTerms : i12);
        LayoutInflater.from(context).inflate(R.layout.layout_loan_terms, (ViewGroup) this, true);
        this.f301645e = (TextView) findViewById(R.id.loan_title);
        this.f301646f = (TextView) findViewById(R.id.loan_subtitle);
        this.f301647g = (LinearLayout) findViewById(R.id.blocks_container);
        this.f301648h = (Chips) findViewById(R.id.loan_terms_chips);
    }

    /* compiled from: PaymentScheduleView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/travel_bnpl_calculator/PaymentScheduleView$c", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Chips.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0.a f301652b;

        public c(l0.a aVar) {
            this.f301652b = aVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k h hVar) {
            b bVar = hVar instanceof b ? (b) hVar : null;
            if (bVar != null) {
                PaymentScheduleView paymentScheduleView = PaymentScheduleView.this;
                ScheduleVariant scheduleVariant = bVar.f301649b;
                com.avito.android.util.text.j.a(paymentScheduleView.f301645e, scheduleVariant.getTitle(), null);
                com.avito.android.util.text.j.a(paymentScheduleView.f301646f, scheduleVariant.getSubtitle(), null);
                PaymentScheduleView.a(scheduleVariant.getProgress(), paymentScheduleView.f301647g);
                l0.a aVar = this.f301652b;
                if (aVar.f406838b) {
                    aVar.f406838b = false;
                    return;
                }
                p<String, String, G0> paymentPlanSelectListener = paymentScheduleView.getPaymentPlanSelectListener();
                if (paymentPlanSelectListener != null) {
                    paymentPlanSelectListener.invoke(hVar.getF262141c().toString(), ((b) hVar).f301649b.getPlanId());
                }
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k h hVar) {
        }
    }
}
