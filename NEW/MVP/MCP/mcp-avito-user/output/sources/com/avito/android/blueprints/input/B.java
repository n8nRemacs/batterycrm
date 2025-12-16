package com.avito.android.blueprints.input;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import com.avito.android.validation.InterfaceC36016k;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateInputItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/input/B;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/input/z;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B extends com.avito.konveyor.adapter.b implements z {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f105909p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f105910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f105911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f105912d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f105913e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f105914f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextWatcher f105915g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.blueprints.publish.html_editor.p f105916h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public w f105917i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f105918j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N f105919k;

    /* renamed from: l, reason: collision with root package name */
    public final int f105920l;

    /* renamed from: m, reason: collision with root package name */
    public final int f105921m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f105922n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public N f105923o;

    /* compiled from: MultiStateInputItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprints/input/B$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            Y41.a<G0> aVar = B.this.f105922n;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            ?? r12 = B.this.f105923o;
            if (r12 != 0) {
                r12.invoke();
            }
        }
    }

    /* compiled from: MultiStateInputItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f105925l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AttributedText attributedText) {
            super(1);
            this.f105925l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            com.avito.android.util.text.j.a(textView, this.f105925l, null);
            return G0.f406611a;
        }
    }

    /* compiled from: MultiStateInputItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105926l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar) {
            super(0);
            this.f105926l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f105926l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: MultiStateInputItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f105930l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AttributedText attributedText) {
            super(1);
            this.f105930l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            com.avito.android.util.text.j.a(textView, this.f105930l, null);
            return G0.f406611a;
        }
    }

    public B(@Y61.k View view) {
        super(view);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.container);
        this.f105910b = componentContainer;
        this.f105911c = (TextView) view.findViewById(R.id.description);
        Input input = (Input) view.findViewById(R.id.input);
        this.f105912d = input;
        Button button = (Button) view.findViewById(R.id.action_button);
        this.f105913e = button;
        Button button2 = (Button) view.findViewById(R.id.restore_button);
        this.f105914f = button2;
        this.f105920l = componentContainer.getPaddingTop();
        this.f105921m = componentContainer.getPaddingBottom();
        view.addOnAttachStateChangeListener(new a());
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 3));
        Resources resources = view.getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Button.g(button, resources.getDrawable(R.drawable.ic_ai_tool_16, theme), null, false, null, 10);
        Button.g(button2, view.getResources().getDrawable(R.drawable.ic_return, view.getContext().getTheme()), null, false, null, 14);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void C2(@Y61.k final Y41.l<? super String, G0> lVar) {
        this.f105913e.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.blueprints.input.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Input input = this.f105907b.f105912d;
                K2.d(input, true);
                ((q) lVar).invoke(input.getDeformattedText());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void EM(@Y61.l Y41.a<G0> aVar) {
        this.f105923o = (N) aVar;
    }

    @Override // com.avito.android.blueprints.input.z
    public final void Ga(boolean z12) {
        this.f105912d.setSelectionToEndOnFocus(z12);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void H20(@Y61.k Y41.a<G0> aVar) {
        this.f105912d.setRightIconListener(new com.avito.android.blueprint.date.interval.j(8, aVar));
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void HI(@Y61.l Y41.a<G0> aVar) {
        this.f105912d.setTouchListener(aVar != null ? new com.avito.android.blueprint.input.u(2, aVar) : null);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void I0(int i12) {
        this.f105912d.setMaxLength(i12);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void J1(int i12, int i13) {
        Input input = this.f105912d;
        input.setInputType(16385);
        input.o(Integer.MAX_VALUE, i12);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f105910b;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(charSequence2);
        }
        Input.f179303W.getClass();
        this.f105912d.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void M2(boolean z12) {
        this.f105912d.setClearButton(z12);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void MF(@Y61.k com.avito.android.blueprints.publish.html_editor.p pVar) {
        com.avito.android.blueprints.publish.html_editor.p pVar2 = this.f105916h;
        Input input = this.f105912d;
        if (pVar2 != null) {
            input.h(pVar2);
        }
        this.f105916h = pVar;
        input.b(pVar);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void Nb(@Y61.l AttributedText attributedText) {
        this.f105910b.setTitleTipText(new e(attributedText));
    }

    @Override // com.avito.android.blueprints.input.z
    public final void S7(@Y61.l Y41.a<G0> aVar) {
        this.f105910b.setTitleTipListener(aVar);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void T0(@Y61.k FormatterType formatterType) {
        this.f105912d.setFormatterType(formatterType);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void T2(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        this.f105912d.setPostfix(str);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void Tk(@Y61.l TextWatcher textWatcher) {
        w wVar = this.f105917i;
        Input input = this.f105912d;
        if (wVar != null) {
            input.h(wVar);
        }
        this.f105917i = (w) textWatcher;
        if (textWatcher != null) {
            input.b(textWatcher);
        }
    }

    @Override // com.avito.android.blueprints.input.z
    public final void WE(@InterfaceC42150f @Y61.l Integer num, @InterfaceC42150f @Y61.l Integer num2) {
        Input input = this.f105912d;
        if (num == null || num2 == null) {
            input.setRightIconListener(null);
            input.setRightIcon((Drawable) null);
        } else {
            input.setRightIcon(C35835l0.j(num.intValue(), input.getContext()));
            input.setRightIconColor(C35835l0.d(num2.intValue(), input.getContext()));
        }
    }

    @Override // com.avito.android.blueprints.input.z
    public final void Y1(@Y61.l AttributedText attributedText) {
        this.f105910b.i(new b(attributedText));
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void Yw(@Y61.l Y41.l<? super String, G0> lVar, boolean z12) {
        TextWatcher textWatcherC;
        TextWatcher textWatcher = this.f105915g;
        Input input = this.f105912d;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        if (lVar != null) {
            if (z12) {
                textWatcherC = new d(input, lVar);
                input.b(textWatcherC);
            } else {
                textWatcherC = com.avito.android.lib.design.input.n.c(input, lVar);
            }
            this.f105915g = textWatcherC;
        }
    }

    @Override // com.avito.android.blueprints.input.z
    public final void c2(@Y61.l Y41.l<? super String, G0> lVar) {
        com.avito.android.lib.design.input.s sVar = this.f105918j;
        Input input = this.f105912d;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f105918j = lVar != null ? com.avito.android.lib.design.input.n.c(input, lVar) : null;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    @Y61.l
    public final CharSequence getText() {
        return this.f105912d.m53getText();
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void gj(@Y61.l CharSequence charSequence) {
        Input.t(this.f105912d, charSequence, false, 6);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void h(@Y61.l String str) {
        boolean z12 = true ^ (str == null || str.length() == 0);
        TextView textView = this.f105911c;
        D6.G(textView, z12);
        textView.setText(str);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void h0() {
        this.f105912d.r();
    }

    @Override // com.avito.android.blueprints.input.z
    public final void h3(@Y61.l String str, boolean z12) {
        Button button = this.f105914f;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = (str == null || str.length() == 0) ? layoutParams2.height : -1;
        layoutParams2.setMarginEnd((str == null || str.length() == 0) ? D6.t(this.itemView, R.dimen.publish_input_restore_button_padding) : 0);
        button.setLayoutParams(layoutParams2);
        if (str == null) {
            str = "";
        }
        button.setText(str);
        D6.G(button, z12);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void h6() throws Resources.NotFoundException {
        this.f105913e.setAppearance(R.style.Re23_Button_SecondaryLarge);
        this.f105914f.setAppearance(R.style.Re23_Button_SecondaryLarge);
        Input input = this.f105912d;
        input.setAppearance(R.style.Re23_Input_DefaultL);
        Resources resources = input.getResources();
        Resources.Theme theme = input.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Button.g(this.f105913e, resources.getDrawable(R.drawable.ic_ai_tool_16, theme), null, false, null, 10);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void he(@Y61.l String str) {
        Input input = this.f105912d;
        if (L.f(str, input.getDeformattedText())) {
            return;
        }
        Input.t(input, str, false, 4);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        m7();
        this.f105919k = null;
        this.f105912d.setOnSelectionChangedListener(null);
        WE(null, null);
        Tk(null);
        K2.d(this.f105910b, true);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void k0(@Y61.l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        D6.f(this.f105910b, 0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? this.f105920l : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? this.f105921m : y6.d(bottom.intValue()), 5);
    }

    @Override // com.avito.android.util.InterfaceC35938s1, com.avito.android.blueprints.publish.html_editor.f
    public final void m7() {
        com.avito.android.blueprints.publish.html_editor.p pVar = this.f105916h;
        if (pVar != null) {
            this.f105912d.h(pVar);
        }
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void mr(@Y61.l Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> qVar) {
        this.f105912d.setOnSelectionChangedListener(qVar);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void n0(@Y61.l String str) {
        this.f105910b.setSubtitle(str);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void n2(@Y61.k Y41.a<G0> aVar) {
        this.f105912d.setClearButtonListener(new c(aVar));
    }

    @Override // com.avito.android.blueprints.input.z
    public final void o(@Y61.l String str) {
        this.f105912d.setHint(str);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void oN(@Y61.l Y41.a<G0> aVar) {
        this.f105922n = aVar;
    }

    @Override // com.avito.android.blueprints.input.z
    public final void q2(boolean z12) {
        D6.G(this.f105913e, z12);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void s(@Y61.l String str) {
        this.f105910b.setTag(str);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void setAppearance(@InterfaceC42150f int i12) throws Resources.NotFoundException {
        Input input = this.f105912d;
        input.setAppearance(C35835l0.j(i12, input.getContext()));
    }

    @Override // com.avito.android.blueprints.input.z
    public final void setEnabled(boolean z12) {
        this.f105910b.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void setTitle(@Y61.k CharSequence charSequence) {
        this.f105910b.setTitle(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void t1(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        this.f105919k = (N) lVar;
    }

    @Override // com.avito.android.blueprints.input.z
    public final void u(@Y61.l CharSequence charSequence) {
        this.f105910b.q(charSequence);
        Input.f179303W.getClass();
        this.f105912d.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void x2(@Y61.k String str) {
        this.f105913e.setText(str);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void x5(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        this.f105912d.setPrefix(str);
    }

    @Override // com.avito.android.blueprints.input.z
    public final void y2(@Y61.k Y41.a<G0> aVar) {
        this.f105914f.setOnClickListener(new com.avito.android.blueprint.date.interval.j(9, aVar));
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f105927b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f105928c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f105929d;

        public d(Input input, Y41.l lVar) {
            this.f105928c = input;
            this.f105929d = lVar;
            this.f105927b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f105928c.getDeformattedText();
            if (L.f(deformattedText, this.f105927b)) {
                return;
            }
            this.f105929d.invoke(deformattedText);
            this.f105927b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
