package com.avito.android.mortgage.pre_approval.form.list.items.input;

import Y41.p;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.mortgage.pre_approval.form.list.items.input.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.I5;
import com.google.android.material.slider.Slider;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/k;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f201792q = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f201793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f201794c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f201795d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Slider f201796e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f201797f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f201798g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f201799h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Chips f201800i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Float, G0> f201801j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f201802k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f201803l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f201804m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public p<? super Boolean, ? super Float, G0> f201805n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f201806o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final c f201807p;

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/pre_approval/form/list/items/input/n$a", "Lcom/google/android/material/slider/Slider$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Slider.b {
        public a() {
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* renamed from: d */
        public final void a(@Y61.k Slider slider) {
            p<? super Boolean, ? super Float, G0> pVar = n.this.f201805n;
            if (pVar != null) {
                ((h) pVar).invoke(Boolean.TRUE, Float.valueOf(slider.getValue()));
            }
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* renamed from: f */
        public final void b(@Y61.k Slider slider) {
            p<? super Boolean, ? super Float, G0> pVar = n.this.f201805n;
            if (pVar != null) {
                ((h) pVar).invoke(Boolean.FALSE, Float.valueOf(slider.getValue()));
            }
        }
    }

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.input_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f201793b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f201794c = input;
        View viewFindViewById3 = view.findViewById(R.id.input_percent);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f201795d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.slider);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.slider.Slider");
        }
        Slider slider = (Slider) viewFindViewById4;
        this.f201796e = slider;
        View viewFindViewById5 = view.findViewById(R.id.slider_max);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f201797f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.slider_min);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f201798g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.slider_group);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f201799h = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.chips);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById8;
        this.f201800i = chips;
        this.f201806o = input.hasFocus();
        c cVar = new c(input, this);
        input.b(cVar);
        this.f201807p = cVar;
        input.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.avito.android.mortgage.pre_approval.form.list.items.input.l
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z12) {
                n nVar = this.f201790b;
                Y41.l<? super Boolean, G0> lVar = nVar.f201804m;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z12));
                }
                nVar.f201806o = z12;
            }
        });
        slider.y(new Slider.a() { // from class: com.avito.android.mortgage.pre_approval.form.list.items.input.m
            @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
            public final /* bridge */ /* synthetic */ void a(Slider slider2, float f12, boolean z12) {
                b(f12, z12);
            }

            @Override // com.google.android.material.slider.Slider.a
            public final void b(float f12, boolean z12) {
                if (!z12) {
                    int i12 = n.f201792q;
                    return;
                }
                Y41.l<? super Float, G0> lVar = this.f201791a.f201801j;
                if (lVar != null) {
                    ((g) lVar).invoke(Float.valueOf(f12));
                }
            }
        });
        slider.z(new a());
        chips.setKeepSelected(true);
        chips.setChipsSelectedListener(new b());
        input.r();
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void C5(@Y61.l PrintableText printableText) {
        ComponentContainer componentContainer = this.f201793b;
        if (printableText == null) {
            componentContainer.k();
        } else {
            ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
        }
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void C8(float f12) {
        this.f201796e.setValue(f12);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void D(@Y61.k PrintableText printableText) {
        ComponentContainer componentContainer = this.f201793b;
        componentContainer.setTitle(printableText.k0(componentContainer.getContext()));
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void E1(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f201802k = lVar;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void H10(@Y61.l String str) {
        I5.a(this.f201795d, str, false);
        this.f201794c.setClearButton(str == null);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void Ha(float f12) {
        this.f201796e.setValueTo(f12);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void Pu(boolean z12) {
        this.f201799h.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void Pw(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f201804m = lVar;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void Z9(@Y61.k Y41.l<? super Float, G0> lVar) {
        this.f201801j = lVar;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void a5(@Y61.l List<? extends com.avito.android.lib.design.chips.h> list) {
        Chips chips = this.f201800i;
        if (list == null || list.isEmpty()) {
            chips.setVisibility(8);
        } else {
            chips.setVisibility(0);
            chips.setData(list);
        }
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void a8(@Y61.k String str) {
        this.f201797f.setText("100 млн ₽");
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void c6(@Y61.l PrintableText printableText) {
        Input input = this.f201794c;
        input.setHint(printableText != null ? printableText.k0(input.getContext()) : null);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void ca(@Y61.k String str) {
        this.f201798g.setText("500 тыс. ₽");
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f201804m = null;
        this.f201803l = null;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void m8(float f12) {
        this.f201796e.setValueFrom(f12);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void r0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f201803l = lVar;
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void setText(@Y61.k String str) {
        Input input = this.f201794c;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        c cVar = this.f201807p;
        input.h(cVar);
        Input.t(input, str, false, 4);
        input.b(cVar);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void t5(@Y61.l FormatterType formatterType) {
        Input input = this.f201794c;
        c cVar = this.f201807p;
        input.h(cVar);
        if (formatterType == null) {
            formatterType = new FormatterType(0, null, null, 7, null);
        }
        input.setFormatterType(formatterType);
        input.b(cVar);
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void td(@Y61.l Integer num) {
        Chips chips = this.f201800i;
        if (num == null || num.intValue() < 0) {
            chips.j();
        } else {
            chips.p(num.intValue(), false);
        }
    }

    @Override // com.avito.android.mortgage.pre_approval.form.list.items.input.k
    public final void x9(@Y61.k p<? super Boolean, ? super Float, G0> pVar) {
        this.f201805n = pVar;
    }

    /* compiled from: InputView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/pre_approval/form/list/items/input/n$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {
        public b() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Y41.l<? super Integer, G0> lVar;
            c.a aVar = hVar instanceof c.a ? (c.a) hVar : null;
            if (aVar == null || (lVar = n.this.f201802k) == null) {
                return;
            }
            ((f) lVar).invoke(Integer.valueOf(aVar.f201777c));
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f201810b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f201811c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f201812d;

        public c(Input input, n nVar) {
            this.f201811c = input;
            this.f201812d = nVar;
            this.f201810b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            Y41.l<? super String, G0> lVar;
            String deformattedText = this.f201811c.getDeformattedText();
            if (L.f(deformattedText, this.f201810b)) {
                return;
            }
            n nVar = this.f201812d;
            if (nVar.f201806o && (lVar = nVar.f201803l) != null) {
                lVar.invoke(deformattedText);
            }
            this.f201810b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
