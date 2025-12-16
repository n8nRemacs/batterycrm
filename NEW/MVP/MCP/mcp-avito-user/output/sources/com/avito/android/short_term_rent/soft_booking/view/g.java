package com.avito.android.short_term_rent.soft_booking.view;

import Y41.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.lib.util.q;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.RefundRules;
import com.avito.android.remote.model.StrBookingCalculationIcon;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.soft_booking.dialog.a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CollapsedCostInfo;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import com.avito.android.short_term_rent.view.components.toggle_v2.ToggleV2;
import com.avito.android.travel_bnpl_calculator.model.PaymentMethod;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypeDetails;
import com.avito.android.travel_bnpl_calculator.model.PaymentTypes;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.avito.android.util.r6;
import com.avito.android.util.y6;
import com.facebook.imageutils.JfifUtil;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import j.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import pw0.C47158b;
import pw0.C47159c;
import pw0.k;
import qw0.C47455a;
import rw0.AbstractC47927b;
import rw0.AbstractC47928c;
import rw0.AbstractC47929d;
import rw0.C47926a;
import rw0.C47930e;
import rw0.f;
import rw0.k;
import rw0.l;
import rw0.m;
import rw0.o;
import rw0.r;
import rw0.s;
import sK0.C48065c;
import tw0.InterfaceC48733a;

/* compiled from: StrSoftBookingViewHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/view/g;", "Lcom/avito/android/short_term_rent/soft_booking/view/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.short_term_rent.soft_booking.view.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f282897a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f282898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f282899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f282900d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f282901e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public B f282902f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f282903g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f282904h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f282905i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f282906j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f282907k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f282908l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f282909m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public p<? super View, ? super String, G0> f282910n;

    /* compiled from: StrSoftBookingViewHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StrSoftBookingContactFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType = StrSoftBookingContactFieldType.f282654b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrSoftBookingContactFieldType strSoftBookingContactFieldType2 = StrSoftBookingContactFieldType.f282654b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: StrSoftBookingViewHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                g.this.f282897a.getView().clearFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrSoftBookingViewHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/short_term_rent/soft_booking/view/g$c", "Lcom/avito/android/lib/design/animation/AnimationView$f;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements AnimationView.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f282912a;

        public c(Y41.a<G0> aVar) {
            this.f282912a = aVar;
        }

        @Override // com.avito.android.lib.design.animation.AnimationView.f
        public final void a(@Y61.k AnimationView.e eVar, @Y61.k AnimationView.e eVar2) {
            if (eVar2 instanceof AnimationView.e.b) {
                this.f282912a.invoke();
            }
        }
    }

    /* compiled from: StrSoftBookingViewHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Input f282914m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p<String, StrSoftBookingContactFieldType, G0> f282915n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ StrSoftBookingContactFieldType f282916o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Input input, p<? super String, ? super StrSoftBookingContactFieldType, G0> pVar, StrSoftBookingContactFieldType strSoftBookingContactFieldType) {
            super(1);
            this.f282914m = input;
            this.f282915n = pVar;
            this.f282916o = strSoftBookingContactFieldType;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            g.this.getClass();
            Input input = this.f282914m;
            String deformattedText = input.getDeformattedText();
            if (!C43066x.K(deformattedText)) {
                Editable editableM53getText = input.m53getText();
                deformattedText = editableM53getText != null ? editableM53getText.toString() : null;
                if (deformattedText == null) {
                    deformattedText = "";
                }
            }
            this.f282915n.invoke(deformattedText, this.f282916o);
            return G0.f406611a;
        }
    }

    /* compiled from: StrSoftBookingViewHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/short_term_rent/soft_booking/view/g$e", "Lcom/avito/android/short_term_rent/view/components/toggle_v2/ToggleV2$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements ToggleV2.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<rw0.j, G0> f282918b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super rw0.j, G0> lVar) {
            this.f282918b = lVar;
        }

        @Override // com.avito.android.short_term_rent.view.components.toggle_v2.ToggleV2.a
        public final void a(@Y61.k InterfaceC48733a interfaceC48733a) {
            rw0.j jVar = interfaceC48733a instanceof rw0.j ? (rw0.j) interfaceC48733a : null;
            if (jVar == null) {
                return;
            }
            K2.d(g.this.f282897a.s(), false);
            this.f282918b.invoke(jVar);
        }
    }

    /* compiled from: StrSoftBookingViewHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemHint;", "hint", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/short_term_rent/view/components/retro_badges/entity/RetroBadgeItemHint;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<RetroBadgeItemHint, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RetroBadgeItemHint retroBadgeItemHint) {
            RetroBadgeItemHint retroBadgeItemHint2 = retroBadgeItemHint;
            if (retroBadgeItemHint2 != null) {
                a.C8444a c8444a = com.avito.android.short_term_rent.soft_booking.dialog.a.f282581I;
                Context context = g.this.f282897a.p().getContext();
                c8444a.getClass();
                a.C8444a.a(context, retroBadgeItemHint2);
            }
            return G0.f406611a;
        }
    }

    public g(@Y61.k j jVar, @Y61.k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @Y61.k com.avito.android.util.text.a aVar) {
        this.f282897a = jVar;
        this.f282898b = abstractC25658a;
        this.f282899c = aVar;
    }

    public static void Q(final g gVar, LinearLayout linearLayout, AttributedText attributedText, AttributedText attributedText2, boolean z12, boolean z13, ArrayList arrayList, boolean z14, String str, StrBookingCalculationIcon strBookingCalculationIcon, int i12) {
        String name;
        Integer numM;
        String url;
        String name2;
        Integer numM2;
        boolean z15 = (i12 & 4) != 0 ? false : z12;
        boolean z16 = (i12 & 8) != 0 ? true : z13;
        boolean z17 = (i12 & 16) == 0;
        ArrayList arrayList2 = (i12 & 32) != 0 ? null : arrayList;
        boolean z18 = (i12 & 128) == 0 ? z14 : true;
        gVar.getClass();
        final DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(linearLayout.getContext(), null, 0, 0, 14, null);
        descriptionParameterItem.setDotsOffset(y6.b(8));
        com.avito.android.util.text.j.a(descriptionParameterItem.getLeftTextView(), attributedText, null);
        com.avito.android.util.text.j.a(descriptionParameterItem.getRightTextView(), attributedText2, null);
        com.avito.android.lib.design.text_view.a leftTextView = descriptionParameterItem.getLeftTextView();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iB2 = C48065c.b(leftTextView.getContext(), strBookingCalculationIcon != null ? strBookingCalculationIcon.getColor() : null, C35835l0.d(R.attr.gray24, leftTextView.getContext()));
        int iB3 = y6.b(4);
        if ((strBookingCalculationIcon != null ? strBookingCalculationIcon.getPosition() : null) == StrBookingCalculationIcon.Position.START && (name2 = strBookingCalculationIcon.getName()) != null && (numM2 = com.avito.android.lib.util.f.m(name2)) != null) {
            R(spannableStringBuilder, leftTextView.getContext(), numM2.intValue(), iB2, null);
            spannableStringBuilder = S(spannableStringBuilder, iB3);
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append(leftTextView.getText());
        if (((strBookingCalculationIcon != null ? strBookingCalculationIcon.getPosition() : null) == null || strBookingCalculationIcon.getPosition() == StrBookingCalculationIcon.Position.END) && strBookingCalculationIcon != null && (name = strBookingCalculationIcon.getName()) != null && (numM = com.avito.android.lib.util.f.m(name)) != null) {
            int iIntValue = numM.intValue();
            spannableStringBuilderAppend = S(spannableStringBuilderAppend, iB3);
            R(spannableStringBuilderAppend, leftTextView.getContext(), iIntValue, iB2, null);
        }
        if (str != null) {
            leftTextView.setMovementMethod(LinkMovementMethod.getInstance());
            spannableStringBuilderAppend = S(spannableStringBuilderAppend, iB3);
            R(spannableStringBuilderAppend, leftTextView.getContext(), R.attr.textIconQuestionFilled, iB2, new h(gVar, leftTextView, str));
        }
        leftTextView.setText(spannableStringBuilderAppend);
        if (z15) {
            Drawable drawableH = C35835l0.h(z16 ? R.attr.ic_arrowExpandLess16 : R.attr.ic_arrowExpandMore16, descriptionParameterItem.getContext());
            if (drawableH != null) {
                descriptionParameterItem.setLeftTextIconDrawable(drawableH);
            }
        } else if (strBookingCalculationIcon != null && (url = strBookingCalculationIcon.getUrl()) != null) {
            if (url.length() <= 0) {
                url = null;
            }
            if (url != null) {
                descriptionParameterItem.getIcon().setImageTintList(null);
                ImageRequest.a aVar = new ImageRequest.a(new DM.a(descriptionParameterItem.getIcon()));
                aVar.f(Uri.parse(url));
                int iB4 = y6.b(20);
                aVar.f169502t = new ImageRequest.c(iB4, iB4);
                aVar.c();
            }
        }
        if (z17) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(y6.b(8), y6.b(0), y6.b(0), y6.b(0));
            descriptionParameterItem.setLayoutParams(layoutParams);
        }
        if (z15) {
            final int childCount = linearLayout.getChildCount();
            int size = arrayList2 != null ? arrayList2.size() : 0;
            final l0.a aVar2 = new l0.a();
            aVar2.f406838b = z16;
            final int i13 = size;
            descriptionParameterItem.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.short_term_rent.soft_booking.view.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g gVar2;
                    l0.a aVar3 = aVar2;
                    aVar3.f406838b = !aVar3.f406838b;
                    int i14 = 0;
                    while (true) {
                        int i15 = i13;
                        gVar2 = gVar;
                        if (i14 >= i15) {
                            break;
                        }
                        gVar2.f282897a.e0().getChildAt(childCount + i14 + 1).setVisibility(!aVar3.f406838b ? 0 : 8);
                        i14++;
                    }
                    DescriptionParameterItem descriptionParameterItem2 = descriptionParameterItem;
                    Context context = descriptionParameterItem2.getContext();
                    boolean z19 = aVar3.f406838b;
                    gVar2.getClass();
                    descriptionParameterItem2.setLeftTextIconDrawable(C35835l0.h(z19 ? R.attr.ic_arrowExpandLess16 : R.attr.ic_arrowExpandMore16, context));
                }
            });
        }
        descriptionParameterItem.setVisibility(z18 ? 0 : 8);
        linearLayout.addView(descriptionParameterItem);
    }

    public static void R(SpannableStringBuilder spannableStringBuilder, Context context, @InterfaceC42150f int i12, @InterfaceC42156l int i13, Y41.a aVar) {
        PK0.j jVar = new PK0.j(aVar);
        int length = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i13);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) com.avito.android.lib.util.f.n(i12, context));
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(jVar, length, spannableStringBuilder.length(), 17);
    }

    @SuppressLint({"HardcodeStringDetector"})
    public static SpannableStringBuilder S(SpannableStringBuilder spannableStringBuilder, @U int i12) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
        spannableStringBuilder2.setSpan(new PK0.h(i12), 0, spannableStringBuilder2.length(), 33);
        return spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void A(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f282903g = lVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void B(@Y61.l pw0.k kVar) {
        j jVar = this.f282897a;
        if (kVar == null) {
            D6.w(jVar.a0());
            return;
        }
        D6.H(jVar.a0());
        I5.a(jVar.L(), kVar.f428883a, false);
        ConstraintLayout constraintLayoutI = jVar.i();
        k.a aVar = kVar.f428885c;
        String str = kVar.f428884b;
        T(aVar, constraintLayoutI, str);
        T(kVar.f428886d, jVar.w(), str);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void C(@Y61.k p<? super String, ? super StrSoftBookingContactFieldType, G0> pVar) {
        for (Map.Entry<Input, StrSoftBookingContactFieldType> entry : U().entrySet()) {
            Input key = entry.getKey();
            n.c(key, new d(key, pVar, entry.getValue()));
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void D(@Y61.k p<? super String, ? super String, G0> pVar) {
        this.f282897a.u().setPaymentPlanSelectListener(pVar);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void E(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.j().setOnClickListener(new com.avito.android.short_term_rent.soft_booking.view.c(this, aVar, 4));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void F(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
        this.f282898b.m(list);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void G(@Y61.l String str, @Y61.k List<? extends List<RetroBadgeItem>> list) {
        j jVar = this.f282897a;
        jVar.A().setVisibility(!list.isEmpty() ? 0 : 8);
        jVar.E().setText(str);
        jVar.p().setup(list);
        jVar.p().setOnMoreClickListener(new f());
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void H(@Y61.l RefundRules refundRules) {
        AttributedText link;
        AttributedText description;
        String title;
        j jVar = this.f282897a;
        jVar.d().setVisibility(refundRules != null ? 0 : 8);
        if (refundRules != null && (title = refundRules.getTitle()) != null) {
            jVar.I().setText(title);
        }
        if (refundRules != null && (description = refundRules.getDescription()) != null) {
            com.avito.android.util.text.j.c(jVar.x(), description, null);
        }
        if (refundRules == null || (link = refundRules.getLink()) == null) {
            return;
        }
        com.avito.android.util.text.j.c(jVar.K(), link, null);
        jVar.K().setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void I(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f282900d = lVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void J(@Y61.l PaymentTypeDetails paymentTypeDetails) {
        j jVar = this.f282897a;
        if (paymentTypeDetails == null) {
            D6.w(jVar.u());
        } else {
            jVar.u().setupView(paymentTypeDetails);
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void K(@Y61.k AbstractC47928c abstractC47928c) {
        boolean z12 = abstractC47928c instanceof AbstractC47928c.a;
        j jVar = this.f282897a;
        if (!z12) {
            D6.w(jVar.U());
            D6.w(jVar.e0());
        } else {
            AbstractC47928c.a aVar = (AbstractC47928c.a) abstractC47928c;
            com.avito.android.util.text.j.a(jVar.U(), aVar.f437176a, this.f282899c);
            V(aVar.f437177b);
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void L(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.y().setOnClickListener(new com.avito.android.short_term_rent.soft_booking.view.c(this, aVar, 0));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void M(@Y61.k AbstractC47927b abstractC47927b) {
        Object next;
        boolean z12 = abstractC47927b instanceof AbstractC47927b.a;
        j jVar = this.f282897a;
        if (!z12) {
            D6.w(jVar.b0());
            D6.w(jVar.v());
            return;
        }
        D6.H(jVar.b0());
        D6.H(jVar.v());
        ToggleV2 toggleV2B0 = jVar.b0();
        AbstractC47927b.a aVar = (AbstractC47927b.a) abstractC47927b;
        ArrayList arrayList = aVar.f437172a;
        toggleV2B0.setData(arrayList);
        rw0.k kVar = aVar.f437174c;
        if (kVar instanceof k.b) {
            k.b bVar = (k.b) kVar;
            V(bVar.f437226a.f437221g);
            com.avito.android.short_term_rent.view.components.toggle_v2.e eVar = jVar.b0().f283060e;
            if (eVar == null || eVar.f283073c == null) {
                jVar.b0().b(bVar.f437226a);
            }
        } else if (kVar instanceof k.a) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((rw0.j) next).f437220f) {
                        break;
                    }
                }
            }
            rw0.j jVar2 = (rw0.j) next;
            if (jVar2 != null) {
                jVar.b0().b(jVar2);
            }
        }
        jVar.v().setMovementMethod(LinkMovementMethod.getInstance());
        TextView textViewV = jVar.v();
        AttributedText attributedText = aVar.f437173b;
        com.avito.android.util.text.j.a(textViewV, attributedText, null);
        attributedText.setOnDeepLinkClickListener(this.f282902f);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void N(@Y61.l AttributedText attributedText) {
        j jVar = this.f282897a;
        com.avito.android.util.text.j.a(jVar.r(), attributedText, this.f282899c);
        jVar.r().setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void O(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.f().setLoadingStateListener(new c(aVar));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void P(@Y61.k rw0.i iVar) {
        j jVar = this.f282897a;
        jVar.j().setText(iVar.f437214a);
        String str = iVar.f437215b;
        if (str != null) {
            jVar.j().setAppearanceFromAttr(com.avito.android.lib.util.f.d(str));
        }
    }

    public final void T(final k.a aVar, ConstraintLayout constraintLayout, String str) {
        D6.D(constraintLayout, L.f(str, aVar.f428887a) ? R.drawable.bg_refund_toggle_selected : R.drawable.bg_refund_toggle_default);
        View viewFindViewById = constraintLayout.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = constraintLayout.findViewById(R.id.strikethrough_price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = constraintLayout.findViewById(R.id.discount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById3;
        View viewFindViewById4 = constraintLayout.findViewById(R.id.price);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById4;
        View viewFindViewById5 = constraintLayout.findViewById(R.id.tooltip);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        I5.a(textView, aVar.f428888b, false);
        I5.a(textView2, aVar.f428892f, true);
        I5.a(textView3, aVar.f428891e, true);
        I5.a(textView4, aVar.f428889c, false);
        final int i12 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.short_term_rent.soft_booking.view.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f282895c;

            {
                this.f282895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        Y41.l<? super String, G0> lVar = this.f282895c.f282900d;
                        if (lVar != null) {
                            lVar.invoke(aVar.f428887a);
                            break;
                        }
                        break;
                    default:
                        Y41.l<? super DeepLink, G0> lVar2 = this.f282895c.f282901e;
                        if (lVar2 != null) {
                            lVar2.invoke(aVar.f428890d);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        ((ImageView) viewFindViewById5).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.short_term_rent.soft_booking.view.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f282895c;

            {
                this.f282895c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        Y41.l<? super String, G0> lVar = this.f282895c.f282900d;
                        if (lVar != null) {
                            lVar.invoke(aVar.f428887a);
                            break;
                        }
                        break;
                    default:
                        Y41.l<? super DeepLink, G0> lVar2 = this.f282895c.f282901e;
                        if (lVar2 != null) {
                            lVar2.invoke(aVar.f428890d);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final Map<Input, StrSoftBookingContactFieldType> U() {
        j jVar = this.f282897a;
        return P0.g(new Q(jVar.R(), StrSoftBookingContactFieldType.f282654b), new Q(jVar.V(), StrSoftBookingContactFieldType.f282655c), new Q(jVar.X(), StrSoftBookingContactFieldType.f282656d));
    }

    public final void V(@Y61.k List<CostInfo> list) {
        j jVar = this.f282897a;
        jVar.e0().removeAllViews();
        for (CostInfo costInfo : list) {
            Q(this, jVar.e0(), costInfo.f282824c, costInfo.f282825d, costInfo.f282826e, costInfo.f282827f, costInfo.f282828g, false, costInfo.f282830i, costInfo.f282829h, JfifUtil.MARKER_RST0);
            Iterable<CollapsedCostInfo> iterable = costInfo.f282828g;
            if (iterable == null) {
                iterable = C42784z0.f406748b;
            }
            for (CollapsedCostInfo collapsedCostInfo : iterable) {
                Q(this, jVar.e0(), collapsedCostInfo.f282819b, collapsedCostInfo.f282820c, false, false, null, !costInfo.f282827f, collapsedCostInfo.f282822e, collapsedCostInfo.f282821d, 108);
            }
        }
        jVar.e0().setDividerDrawable(r6.a(y6.b(8)));
        D6.H(jVar.e0());
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void a(@Y61.k String str) {
        this.f282897a.c().setText(str);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void b(@Y61.k Y41.a<G0> aVar) {
        this.f282905i = aVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void c(@Y61.k o oVar) {
        boolean z12 = oVar instanceof o.a;
        j jVar = this.f282897a;
        if (!z12) {
            if (oVar instanceof o.b) {
                D6.w(jVar.i0());
                return;
            }
            return;
        }
        D6.H(jVar.i0());
        o.a aVar = (o.a) oVar;
        com.avito.android.util.text.j.a(jVar.Y(), aVar.f437240a, null);
        jVar.n().removeAllViews();
        ArrayList<rw0.p> arrayList = aVar.f437241b;
        ArrayList arrayList2 = new ArrayList();
        for (rw0.p pVar : arrayList) {
            View viewInflate = LayoutInflater.from(jVar.getContext()).inflate(R.layout.item_rules_info, (ViewGroup) jVar.n(), false);
            TextView textView = viewInflate instanceof TextView ? (TextView) viewInflate : null;
            if (textView != null) {
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                com.avito.android.util.text.j.a(textView, pVar.f437243a, null);
                textView.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(17, this, pVar));
            } else {
                textView = null;
            }
            if (textView != null) {
                arrayList2.add(textView);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            jVar.n().addView((TextView) it.next());
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void d(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f282901e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewGroup, com.avito.android.util.text.a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void e(@Y61.l PaymentTypes paymentTypes) {
        Integer numA;
        j jVar = this.f282897a;
        if (paymentTypes == null) {
            D6.w(jVar.h0());
            D6.w(jVar.b());
            return;
        }
        D6.H(jVar.h0());
        D6.H(jVar.b());
        ?? r42 = 0;
        com.avito.android.util.text.j.c(jVar.h0(), paymentTypes.getTitle(), null);
        com.avito.android.travel_bnpl_calculator.b bVar = new com.avito.android.travel_bnpl_calculator.b();
        LinearLayout linearLayoutB = jVar.b();
        Y41.l<? super String, G0> lVar = this.f282907k;
        Y41.l<? super DeepLink, G0> lVar2 = this.f282908l;
        linearLayoutB.removeAllViews();
        for (PaymentMethod paymentMethod : paymentTypes.c()) {
            View viewInflate = LayoutInflater.from(linearLayoutB.getContext()).inflate(R.layout.layout_old_payment_methods, (ViewGroup) r42);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.payment_method_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.payment_method_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.payment_method_subtitle);
            Badge badge = (Badge) viewInflate.findViewById(R.id.payment_method_new_badge);
            Checkmark checkmark = (Checkmark) viewInflate.findViewById(R.id.payment_method_checkmark);
            com.avito.android.util.text.j.c(textView, paymentMethod.getTitle(), r42);
            AttributedText subtitle = paymentMethod.getSubtitle();
            Drawable drawable = r42;
            if (subtitle != null) {
                subtitle.setOnDeepLinkClickListener(new B(26, lVar2));
                drawable = null;
                com.avito.android.util.text.j.c(textView2, subtitle, null);
            }
            Context context = linearLayoutB.getContext();
            Integer numA2 = q.a(paymentMethod.getIcon().getName());
            int iIntValue = numA2 != null ? numA2.intValue() : R.attr.ic_operations20;
            String colorKey = paymentMethod.getIcon().getColor().getColorKey();
            imageView.setImageDrawable(C35835l0.m(context, iIntValue, (colorKey == null || (numA = com.avito.android.lib.util.e.a(colorKey)) == null) ? R.attr.black : numA.intValue()));
            Boolean isNew = paymentMethod.getIsNew();
            D6.G(badge, isNew != null ? isNew.booleanValue() : false);
            Boolean isSelected = paymentMethod.getIsSelected();
            checkmark.setChecked(isSelected != null ? isSelected.booleanValue() : false);
            checkmark.setBackground(!checkmark.isChecked() ? D6.u(checkmark, R.drawable.bg_method_checkmark) : drawable);
            linearLayoutB.addView(viewInflate);
            viewInflate.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(7, lVar, paymentMethod));
            r42 = drawable;
        }
        jVar.o().setOnScrollChangeListener(new com.avito.android.short_term_rent.soft_booking.view.d(bVar, this));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void f(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.u().setPaymentPlanAttachListener(aVar);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void g(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.W().setNavigationOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(20, aVar));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void h(@Y61.l C47455a c47455a) {
        if (c47455a == null) {
            return;
        }
        j jVar = this.f282897a;
        jVar.f().setAnimationData(new AnimationView.a.e(c47455a.f429506a, null, null, 6, null));
        jVar.P().setText(c47455a.f429507b);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void i(@Y61.k Y41.a<G0> aVar) {
        this.f282909m = aVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void j(@Y61.k Y41.a<G0> aVar) {
        this.f282906j = aVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void k(@Y61.k p<? super View, ? super String, G0> pVar) {
        this.f282910n = pVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void l(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.Z().setOnClickListener(new com.avito.android.short_term_rent.soft_booking.view.c(this, aVar, 2));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void m(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f282897a.D(), attributedText, this.f282899c);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void n(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f282902f = new B(13, lVar);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void o(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f282908l = lVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void p(@Y61.k Y41.l<? super rw0.j, G0> lVar) {
        this.f282897a.b0().setSelectedListener(new e(lVar));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void q(@Y61.l s sVar) {
        boolean zEquals = sVar == null ? true : sVar.equals(s.a.f437250a);
        j jVar = this.f282897a;
        if (zEquals) {
            jVar.t().setVisibility(8);
            return;
        }
        if (sVar instanceof s.b) {
            jVar.t().setVisibility(0);
            s.b bVar = (s.b) sVar;
            I5.a(jVar.z(), bVar.f437251a, false);
            Object obj = bVar.f437252b;
            jVar.q().removeAllViews();
            Context context = jVar.q().getContext();
            for (rw0.q qVar : (Iterable) obj) {
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_trust_item, (ViewGroup) null);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
                TextView textView = (TextView) viewInflate.findViewById(R.id.title);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.subtitle);
                UniversalImage universalImage = qVar.f437245a;
                com.avito.android.image_loader.m mVarA = com.avito.android.image_loader.n.a(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null);
                ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
                aVar.d(mVarA);
                aVar.f169485c = Integer.valueOf(R.drawable.bg_image_placeholder_radius_12);
                aVar.f169492j = D6.u(imageView, R.drawable.bg_image_placeholder_radius_12);
                aVar.f169493k = null;
                aVar.e(D6.t(imageView, R.dimen.booking_form_preview_item_icon_corners));
                aVar.f169486d = true;
                aVar.c();
                I5.a(textView, qVar.f437246b, false);
                I5.a(textView2, qVar.f437247c, false);
                jVar.q().addView(viewInflate);
            }
            r rVar = bVar.f437253c;
            if (rVar instanceof r.b) {
                jVar.M().setVisibility(0);
                com.avito.android.lib.design.button.b.a(jVar.M(), ((r.b) rVar).f437249a, false);
                jVar.M().setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 3));
            } else if (L.f(rVar, r.a.f437248a)) {
                jVar.M().setVisibility(8);
            }
            if (Boolean.valueOf(bVar.f437254d).equals(Boolean.TRUE)) {
                jVar.o().setOnScrollChangeListener(new com.avito.android.short_term_rent.soft_booking.view.d(this));
            }
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void r(@Y61.k rw0.h hVar) {
        j jVar = this.f282897a;
        ImageRequest.a aVarA = C35949t5.a(jVar.S());
        aVarA.f(hVar.f437211a);
        aVarA.c();
        jVar.k().setText(hVar.f437212b);
        jVar.f0().setText(hVar.f437213c);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void s(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.B().setOnClickListener(new com.avito.android.short_term_rent.soft_booking.view.c(this, aVar, 3));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void t(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f282907k = lVar;
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void u() {
        j jVar = this.f282897a;
        RecyclerView recyclerViewT = jVar.T();
        recyclerViewT.getContext();
        recyclerViewT.setLayoutManager(new LinearLayoutManager());
        recyclerViewT.setAdapter(this.f282898b);
        for (Map.Entry<Input, StrSoftBookingContactFieldType> entry : U().entrySet()) {
            Input key = entry.getKey();
            key.setOnEditorActionListener(new com.avito.android.autoteka.presentation.previewsearch.b(3, entry.getValue(), this));
            key.setFocusByClearButton(true);
        }
        K2.b(jVar.getView(), new b());
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void v(@Y61.k C47930e c47930e, @Y61.k C47159c c47159c) {
        ComponentContainer componentContainerH;
        AbstractC47929d abstractC47929d;
        C47158b c47158b;
        j jVar = this.f282897a;
        jVar.c0().setText(c47930e.f437190a);
        for (Map.Entry<Input, StrSoftBookingContactFieldType> entry : U().entrySet()) {
            Input key = entry.getKey();
            StrSoftBookingContactFieldType value = entry.getValue();
            int iOrdinal = value.ordinal();
            if (iOrdinal == 0) {
                componentContainerH = jVar.H();
            } else if (iOrdinal == 1) {
                componentContainerH = jVar.g();
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                componentContainerH = jVar.Q();
            }
            int iOrdinal2 = value.ordinal();
            if (iOrdinal2 == 0) {
                abstractC47929d = c47930e.f437191b;
            } else if (iOrdinal2 == 1) {
                abstractC47929d = c47930e.f437192c;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC47929d = c47930e.f437193d;
            }
            int iOrdinal3 = value.ordinal();
            if (iOrdinal3 == 0) {
                c47158b = c47159c.f428859a;
            } else if (iOrdinal3 == 1) {
                c47158b = c47159c.f428860b;
            } else {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c47158b = c47159c.f428861c;
            }
            String str = c47158b != null ? c47158b.f428856b : null;
            if (abstractC47929d instanceof AbstractC47929d.b) {
                Input.t(key, str, false, 6);
                AbstractC47929d.b bVar = (AbstractC47929d.b) abstractC47929d;
                key.setHint(bVar.getF437180a());
                if (bVar instanceof AbstractC47929d.b.C12601b) {
                    componentContainerH.q(null);
                } else if (bVar instanceof AbstractC47929d.b.a) {
                    ComponentContainer.n(componentContainerH, ((AbstractC47929d.b.a) abstractC47929d).f437182c, 2);
                } else if (bVar instanceof AbstractC47929d.b.c) {
                    ((AbstractC47929d.b.c) abstractC47929d).getClass();
                    ComponentContainer.s(componentContainerH, null, 2);
                }
            }
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void w(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.F().setOnClickListener(new com.avito.android.short_term_rent.soft_booking.view.c(this, aVar, 1));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void x(@Y61.k Y41.a<G0> aVar) {
        this.f282897a.e().setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(21, aVar));
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void y(@Y61.k C47926a c47926a) {
        j jVar = this.f282897a;
        jVar.m().setText(c47926a.f437169a);
        f.b bVar = c47926a.f437170b;
        jVar.h().q(null);
        Input.t(jVar.y(), bVar.f437198a, false, 6);
        jVar.y().setHint(bVar.f437199b);
        rw0.g gVar = c47926a.f437171c;
        if (gVar == null) {
            D6.w(jVar.F());
        } else {
            D6.H(jVar.F());
            Input.t(jVar.F(), gVar.getF437206a().k0(jVar.getContext()), false, 6);
        }
    }

    @Override // com.avito.android.short_term_rent.soft_booking.view.b
    public final void z(@Y61.k rw0.l lVar) {
        boolean z12 = lVar instanceof l.a;
        j jVar = this.f282897a;
        if (!z12) {
            D6.w(jVar.B());
            return;
        }
        D6.H(jVar.B());
        l.a aVar = (l.a) lVar;
        I5.a(jVar.G(), aVar.f437227a, false);
        TextView textViewO = jVar.O();
        rw0.m mVar = aVar.f437228b;
        I5.a(textViewO, mVar.getF437230a(), false);
        I5.a(jVar.d0(), mVar.getF437231b(), false);
        if (mVar instanceof m.a) {
            jVar.B().setEnabled(false);
            D6.w(jVar.g0());
        } else if (mVar instanceof m.b) {
            List<CostInfo> list = ((m.b) mVar).f437236e;
            if (list != null) {
                V(list);
            }
            jVar.B().setEnabled(true);
            D6.H(jVar.g0());
        }
    }
}
