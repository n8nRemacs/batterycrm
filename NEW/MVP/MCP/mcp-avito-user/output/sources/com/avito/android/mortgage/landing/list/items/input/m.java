package com.avito.android.mortgage.landing.list.items.input;

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
import com.avito.android.mortgage.landing.list.items.input.InputItem;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/input/j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f199761p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f199762b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f199763c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f199764d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Slider f199765e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f199766f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f199767g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Chips f199768h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Float, G0> f199769i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f199770j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f199771k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public p<? super Boolean, ? super String, G0> f199772l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public p<? super Boolean, ? super Float, G0> f199773m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f199774n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final c f199775o;

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/list/items/input/m$a", "Lcom/google/android/material/slider/Slider$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Slider.b {
        public a() {
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* renamed from: d */
        public final void a(@Y61.k Slider slider) {
            p<? super Boolean, ? super Float, G0> pVar = m.this.f199773m;
            if (pVar != null) {
                ((g) pVar).invoke(Boolean.TRUE, Float.valueOf(slider.getValue()));
            }
        }

        @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
        /* renamed from: f */
        public final void b(@Y61.k Slider slider) {
            p<? super Boolean, ? super Float, G0> pVar = m.this.f199773m;
            if (pVar != null) {
                ((g) pVar).invoke(Boolean.FALSE, Float.valueOf(slider.getValue()));
            }
        }
    }

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.input_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f199762b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f199763c = input;
        View viewFindViewById3 = view.findViewById(R.id.sliderValue);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199764d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.slider);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.slider.Slider");
        }
        Slider slider = (Slider) viewFindViewById4;
        this.f199765e = slider;
        View viewFindViewById5 = view.findViewById(R.id.slider_max);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199766f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.slider_min);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199767g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.chips);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById7;
        this.f199768h = chips;
        this.f199774n = input.hasFocus();
        c cVar = new c(input, this);
        input.b(cVar);
        this.f199775o = cVar;
        input.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.avito.android.mortgage.landing.list.items.input.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z12) {
                m mVar = this.f199759b;
                p<? super Boolean, ? super String, G0> pVar = mVar.f199772l;
                if (pVar != null) {
                    pVar.invoke(Boolean.valueOf(z12), mVar.f199763c.getDeformattedText());
                }
                mVar.f199774n = z12;
            }
        });
        slider.y(new Slider.a() { // from class: com.avito.android.mortgage.landing.list.items.input.l
            @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
            public final /* bridge */ /* synthetic */ void a(Slider slider2, float f12, boolean z12) {
                b(f12, z12);
            }

            @Override // com.google.android.material.slider.Slider.a
            public final void b(float f12, boolean z12) {
                if (!z12) {
                    int i12 = m.f199761p;
                    return;
                }
                Y41.l<? super Float, G0> lVar = this.f199760a.f199769i;
                if (lVar != null) {
                    ((f) lVar).invoke(Float.valueOf(f12));
                }
            }
        });
        slider.z(new a());
        chips.setKeepSelected(true);
        chips.setChipsSelectedListener(new b());
        input.r();
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void Ac(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f199771k = lVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void C8(float f12) {
        this.f199765e.setValue(f12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void E1(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f199770j = lVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void Ha(float f12) {
        this.f199765e.setValueTo(f12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void I(boolean z12) {
        this.f199763c.setEnabled(z12);
        this.f199765e.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void Qb(@Y61.k p<? super Boolean, ? super String, G0> pVar) {
        this.f199772l = pVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void Z9(@Y61.k Y41.l<? super Float, G0> lVar) {
        this.f199769i = lVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void a5(@Y61.l List<? extends com.avito.android.lib.design.chips.h> list) {
        List<? extends com.avito.android.lib.design.chips.h> list2 = list;
        Chips chips = this.f199768h;
        if (list2 == null || list2.isEmpty()) {
            chips.setVisibility(8);
        } else {
            chips.setVisibility(0);
            chips.setData(list);
        }
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void a8(@Y61.k String str) {
        this.f199766f.setText(str);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void ca(@Y61.k String str) {
        this.f199767g.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f199772l = null;
        this.f199771k = null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void m8(float f12) {
        this.f199765e.setValueFrom(f12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void setText(@Y61.k String str) {
        Input input = this.f199763c;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        c cVar = this.f199775o;
        input.h(cVar);
        Input.t(input, str, false, 4);
        input.b(cVar);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void setTitle(int i12) {
        this.f199762b.setTitle(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void t5(@Y61.l FormatterType formatterType) {
        Input input = this.f199763c;
        c cVar = this.f199775o;
        input.h(cVar);
        if (formatterType == null) {
            formatterType = new FormatterType(0, null, null, 7, null);
        }
        input.setFormatterType(formatterType);
        input.b(cVar);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void td(@Y61.l Integer num) {
        Chips chips = this.f199768h;
        if (num == null || num.intValue() < 0) {
            chips.j();
        } else {
            chips.p(num.intValue(), false);
        }
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void uD(@Y61.l String str) {
        I5.a(this.f199764d, str, false);
        this.f199763c.setClearButton(str == null);
    }

    @Override // com.avito.android.mortgage.landing.list.items.input.j
    public final void x9(@Y61.k p<? super Boolean, ? super Float, G0> pVar) {
        this.f199773m = pVar;
    }

    /* compiled from: InputView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/landing/list/items/input/m$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {
        public b() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Y41.l<? super Integer, G0> lVar;
            InputItem.Chip chip = hVar instanceof InputItem.Chip ? (InputItem.Chip) hVar : null;
            if (chip == null || (lVar = m.this.f199770j) == null) {
                return;
            }
            ((e) lVar).invoke(Integer.valueOf(chip.f199742c));
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
        public String f199778b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f199779c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f199780d;

        public c(Input input, m mVar) {
            this.f199779c = input;
            this.f199780d = mVar;
            this.f199778b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            Y41.l<? super String, G0> lVar;
            String deformattedText = this.f199779c.getDeformattedText();
            if (L.f(deformattedText, this.f199778b)) {
                return;
            }
            m mVar = this.f199780d;
            if (mVar.f199774n && (lVar = mVar.f199771k) != null) {
                lVar.invoke(deformattedText);
            }
            this.f199778b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
