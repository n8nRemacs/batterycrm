package com.avito.android.advert.item.fmp.calculator;

import LV.c;
import VU.b;
import Y41.p;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import ca1.C27140f;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.fmp.FmpCalculatorButton;
import com.avito.android.remote.fmp.FmpLoanPeriod;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpCalculatorView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/calculator/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/fmp/calculator/k;", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f75504s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f75505b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f75506c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f75507d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f75508e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Chips f75509f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f75510g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f75511h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f75512i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f75513j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f75514k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public p<? super Boolean, ? super String, G0> f75515l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public H2 f75516m;

    /* renamed from: n, reason: collision with root package name */
    public final int f75517n;

    /* renamed from: o, reason: collision with root package name */
    public final int f75518o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f75519p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final d f75520q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Locale f75521r;

    /* compiled from: AdvertDetailsFmpCalculatorView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOpen", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                m.this.f75507d.clearFocus();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsFmpCalculatorView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/fmp/calculator/m$b;", "", "<init>", "()V", "", "DATE_PATTERN", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AdvertDetailsFmpCalculatorView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOpen", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Boolean, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                m.this.f75507d.clearFocus();
            }
            return G0.f406611a;
        }
    }

    static {
        new b(null);
    }

    public m(@Y61.k View view) {
        super(view);
        Context context = view.getContext();
        this.f75505b = context;
        View viewFindViewById = view.findViewById(R.id.fmp_calculator_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75506c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fmp_calculator_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f75507d = input;
        View viewFindViewById3 = view.findViewById(R.id.fmp_input_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75508e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.fmp_calculator_chips);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.ui.Chips");
        }
        this.f75509f = (Chips) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.fmp_calculator_payment_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f75510g = (DescriptionParameterItem) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.fmp_calculator_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f75511h = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.fmp_calculator_legal);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75512i = (TextView) viewFindViewById7;
        this.f75517n = C35835l0.d(R.attr.red, context);
        this.f75518o = C35835l0.d(R.attr.gray54, context);
        this.f75519p = input.hasFocus();
        d dVar = new d(input, this);
        input.b(dVar);
        this.f75520q = dVar;
        H2 h22 = this.f75516m;
        if (h22 != null) {
            h22.dispose();
        }
        this.f75516m = K2.b(this.itemView, new a());
        this.f75521r = new Locale("ru", "RU");
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void Ac(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f75514k = lVar;
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void Cs(@Y61.l FormatterType formatterType) {
        Input input = this.f75507d;
        d dVar = this.f75520q;
        input.h(dVar);
        if (formatterType == null) {
            formatterType = new FormatterType(0, null, null, 7, null);
        }
        input.setFormatterType(formatterType);
        input.b(dVar);
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void E1(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f75513j = lVar;
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void Fu(@Y61.l Integer num, @Y61.l Double d12, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l AttributedText attributedText3, @Y61.l AttributedText attributedText4) {
        String strValueOf;
        if (num == null || d12 == null || num2 == null || num3 == null) {
            return;
        }
        boolean z12 = num3.intValue() < num.intValue();
        boolean zEquals = Boolean.valueOf(z12).equals(Boolean.TRUE);
        TextView textView = this.f75506c;
        if (zEquals) {
            com.avito.android.util.text.j.a(textView, attributedText3, null);
        } else {
            com.avito.android.util.text.j.a(textView, attributedText2, null);
        }
        Context context = this.f75505b;
        DescriptionParameterItem descriptionParameterItem = this.f75510g;
        if (attributedText4 != null) {
            com.avito.android.util.text.j.a(descriptionParameterItem.getRightTextView(), attributedText4, null);
        } else {
            double dDoubleValue = d12.doubleValue();
            int iIntValue = num2.intValue();
            int iIntValue2 = num3.intValue();
            if (z12) {
                strValueOf = String.valueOf(iIntValue);
            } else {
                double d13 = iIntValue;
                strValueOf = String.valueOf((int) ((dDoubleValue * d13 * iIntValue2) + d13));
            }
            DecimalFormat decimalFormat = new DecimalFormat();
            DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
            decimalFormatSymbols.setGroupingSeparator(' ');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            descriptionParameterItem.getRightTextView().setText(context.getString(R.string.advert_details_fmp_calculator_payment_right_part, decimalFormat.format(Long.parseLong(strValueOf)).toString()));
        }
        if (attributedText != null) {
            com.avito.android.util.text.j.a(descriptionParameterItem.getLeftTextView(), attributedText, null);
        } else {
            descriptionParameterItem.getLeftTextView().setText(context.getString(R.string.advert_details_fmp_calculator_payment_left_part, LocalDate.now().plusDays(num3.intValue()).format(DateTimeFormatter.ofPattern("d MMMM").withLocale(this.f75521r))));
        }
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void N50() {
        this.f75508e.setTextColor(this.f75517n);
        Input.f179303W.getClass();
        this.f75507d.setState(Input.f179305b0);
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void Qb(@Y61.k p<? super Boolean, ? super String, G0> pVar) {
        this.f75515l = pVar;
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void Y(@Y61.k Y41.a<G0> aVar) {
        this.f75511h.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(16, aVar));
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void a5(@Y61.l List<FmpLoanPeriod> list) {
        if (list == null) {
            return;
        }
        List<FmpLoanPeriod> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (FmpLoanPeriod fmpLoanPeriod : list2) {
            Integer numD = fmpLoanPeriod.getValue();
            int iIntValue = numD != null ? numD.intValue() : 0;
            Boolean boolE = fmpLoanPeriod.getIsSelected();
            arrayList.add(new ItemChipable(iIntValue, null, null, null, boolE != null ? boolE.booleanValue() : false, null, fmpLoanPeriod.getChipTitle(), false, false, 430, null));
        }
        g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
        Chips chips = this.f75509f;
        Context context = chips.getContext();
        int iJ2 = C35835l0.j(R.attr.chipsOverlayOutlinedMedium, chips.getContext());
        bVar.getClass();
        chips.setStyle(g.b.c(iJ2, context));
        chips.setState(new ChipsState(0, ChipsState.DisplayType.f178758d, null, arrayList, new n(this, chips, arrayList), 1, null));
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void dH() {
        this.f75508e.setTextColor(this.f75518o);
        Input.f179303W.getClass();
        this.f75507d.setState(Input.f179304a0);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f75515l = null;
        this.f75514k = null;
        H2 h22 = this.f75516m;
        if (h22 != null) {
            h22.dispose();
        }
        this.f75516m = null;
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void nJ(@Y61.l FmpCalculatorButton fmpCalculatorButton) {
        if (fmpCalculatorButton != null) {
            Button button = this.f75511h;
            D6.G(button, true);
            String text = fmpCalculatorButton.getText();
            if (text != null) {
                button.setText(text);
            }
            String style = fmpCalculatorButton.getStyle();
            int iD2 = style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPrimaryMedium;
            b.a aVar = VU.b.f17147t;
            aVar.getClass();
            button.setStyle((VU.b) c.a.a(aVar, this.f75505b, iD2));
        }
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void sk(@Y61.l String str) {
        l lVar = new l(this, 0);
        Input input = this.f75507d;
        input.setOnFocusChangeListener(lVar);
        input.setImeOptions(6);
        input.setOnEditorActionListener(new C27140f(this, 1));
        H2 h22 = this.f75516m;
        if (h22 != null) {
            h22.dispose();
        }
        this.f75516m = K2.b(this.itemView, new c());
        input.r();
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        d dVar = this.f75520q;
        input.h(dVar);
        Input.t(input, str, false, 4);
        input.b(dVar);
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void te(@Y61.l String str) {
        this.f75508e.setText(str);
    }

    @Override // com.avito.android.advert.item.fmp.calculator.k
    public final void x4(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f75512i, attributedText, null);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f75524b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f75525c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f75526d;

        public d(Input input, m mVar) {
            this.f75525c = input;
            this.f75526d = mVar;
            this.f75524b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            Y41.l<? super String, G0> lVar;
            String deformattedText = this.f75525c.getDeformattedText();
            if (L.f(deformattedText, this.f75524b)) {
                return;
            }
            m mVar = this.f75526d;
            if (mVar.f75519p && (lVar = mVar.f75514k) != null) {
                lVar.invoke(deformattedText);
            }
            this.f75524b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
