package com.avito.android.publish.items.tagged_input;

import android.content.res.Resources;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.widget.tagged_input.e;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateInputWithTagsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/D;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/tagged_input/A;", "Lcom/avito/android/ui/widget/tagged_input/e;", "Lcom/avito/android/ui/widget/tagged_input/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D extends com.avito.konveyor.adapter.b implements A, com.avito.android.ui.widget.tagged_input.e, com.avito.android.ui.widget.tagged_input.g {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f237110o = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ui.widget.tagged_input.f f237111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ui.widget.tagged_input.i f237112c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f237113d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f237114e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f237115f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextWatcher f237116g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.blueprints.publish.html_editor.p f237117h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f237118i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f237119j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Input f237120k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N f237121l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public N f237122m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public N f237123n;

    /* compiled from: MultiStateInputWithTagsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f237124l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f237124l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f237124l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: MultiStateInputWithTagsItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f237128l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AttributedText attributedText) {
            super(1);
            this.f237128l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            com.avito.android.util.text.j.a(textView, this.f237128l, null);
            return G0.f406611a;
        }
    }

    public D(@Y61.k View view, @Y61.k com.avito.android.ui.widget.tagged_input.f fVar) {
        super(view);
        this.f237111b = fVar;
        View viewFindViewById = view.findViewById(R.id.tags);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f237112c = new com.avito.android.ui.widget.tagged_input.i((RecyclerView) viewFindViewById, R.dimen.tags_horizontal_side_padding, 0, 4, null);
        Button button = (Button) view.findViewById(R.id.action_button);
        this.f237113d = button;
        Button button2 = (Button) view.findViewById(R.id.restore_button);
        this.f237114e = button2;
        this.f237115f = (TextView) view.findViewById(R.id.description);
        this.f237119j = (ComponentContainer) view.findViewById(R.id.container);
        this.f237120k = (Input) view.findViewById(R.id.input);
        view.addOnAttachStateChangeListener(new C(this));
        Resources resources = view.getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Button.g(button, resources.getDrawable(R.drawable.ic_ai_tool_16, theme), null, false, null, 10);
        Button.g(button2, view.getResources().getDrawable(R.drawable.ic_return, view.getContext().getTheme()), null, false, null, 14);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e.a
    public final void B50(@Y61.k String str) {
        Input input = this.f237120k;
        if (input.m53getText() == null) {
            Input.t(input, "", false, 6);
        }
        Editable editableM53getText = input.m53getText();
        if (editableM53getText == null) {
            return;
        }
        if (!input.hasFocus()) {
            Selection.setSelection(editableM53getText, editableM53getText.length());
        }
        int selectionStart = Selection.getSelectionStart(editableM53getText);
        int selectionEnd = Selection.getSelectionEnd(editableM53getText);
        if (selectionEnd > selectionStart) {
            Selection.setSelection(editableM53getText.replace(selectionStart, selectionEnd, str), kotlin.ranges.s.g(str.length() + selectionStart, 0, editableM53getText.length()));
        } else {
            Selection.setSelection(editableM53getText.insert(selectionStart, str), kotlin.ranges.s.g(str.length() + selectionStart, 0, editableM53getText.length()));
        }
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void C2(@Y61.k final Y41.l<? super String, G0> lVar) {
        this.f237113d.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.items.tagged_input.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Input input = this.f237107b.f237120k;
                K2.d(input, true);
                ((l) lVar).invoke(input.getDeformattedText());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void EM(@Y61.l Y41.a<G0> aVar) {
        this.f237123n = (N) aVar;
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void FC(@Y61.k String str, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f237112c.FC(str, interfaceC22983P);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void HI(@Y61.l Y41.a<G0> aVar) {
        this.f237120k.setTouchListener(aVar != null ? new com.avito.android.blueprint.input.u(3, aVar) : null);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f237119j;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(charSequence2);
        }
        Input.f179303W.getClass();
        this.f237120k.setState(Input.f179305b0);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void M2(boolean z12) {
        this.f237120k.setClearButton(z12);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void MF(@Y61.k com.avito.android.blueprints.publish.html_editor.p pVar) {
        com.avito.android.blueprints.publish.html_editor.p pVar2 = this.f237117h;
        Input input = this.f237120k;
        if (pVar2 != null) {
            input.h(pVar2);
        }
        this.f237117h = pVar;
        input.b(pVar);
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void Mi(boolean z12) throws Resources.NotFoundException {
        this.f237112c.Mi(z12);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void Nb(@Y61.l AttributedText attributedText) {
        this.f237119j.setTitleTipText(new c(attributedText));
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void No(@Y61.k String str, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f237111b.No(str, interfaceC22983P);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void T0(@Y61.k FormatterType formatterType) {
        this.f237120k.setFormatterType(formatterType);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void Yw(@Y61.l Y41.l<? super String, G0> lVar, boolean z12) {
        TextWatcher textWatcherC;
        TextWatcher textWatcher = this.f237116g;
        Input input = this.f237120k;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        if (lVar != null) {
            if (z12) {
                textWatcherC = new b(input, lVar);
                input.b(textWatcherC);
            } else {
                textWatcherC = com.avito.android.lib.design.input.n.c(input, lVar);
            }
            this.f237116g = textWatcherC;
        }
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void c2(@Y61.l Y41.l<? super String, G0> lVar) {
        com.avito.android.lib.design.input.s sVar = this.f237118i;
        Input input = this.f237120k;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f237118i = lVar != null ? com.avito.android.lib.design.input.n.c(input, lVar) : null;
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void f8(@Y61.l String str) {
        Input input = this.f237120k;
        if (L.f(str, input.getDeformattedText())) {
            return;
        }
        Input.t(input, str, false, 4);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    @Y61.l
    public final CharSequence getText() {
        return this.f237120k.m53getText();
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void gj(@Y61.l CharSequence charSequence) {
        Input.t(this.f237120k, charSequence, false, 6);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void h(@Y61.l String str) {
        boolean z12 = true ^ (str == null || str.length() == 0);
        TextView textView = this.f237115f;
        D6.G(textView, z12);
        textView.setText(str);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void h0() {
        this.f237120k.r();
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void h3(@Y61.l String str, boolean z12) {
        Button button = this.f237114e;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = (str == null || str.length() == 0) ? layoutParams2.height : -1;
        layoutParams2.setMarginEnd((str == null || str.length() == 0) ? D6.t(this.itemView, R.dimen.restore_button_padding) : 0);
        button.setLayoutParams(layoutParams2);
        if (str == null) {
            str = "";
        }
        button.setText(str);
        D6.G(button, z12);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void h6() throws Resources.NotFoundException {
        this.f237113d.setAppearance(R.style.Re23_Button_SecondaryLarge);
        this.f237114e.setAppearance(R.style.Re23_Button_SecondaryLarge);
        Input input = this.f237120k;
        input.setAppearance(R.style.Re23_Input_DefaultL);
        Resources resources = input.getResources();
        Resources.Theme theme = input.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Button.g(this.f237113d, resources.getDrawable(R.drawable.ic_ai_tool_16, theme), null, false, null, 10);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void i0() {
        this.f237120k.v();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        K2.d(this.f237119j, true);
        ?? r02 = this.f237121l;
        if (r02 != 0) {
            r02.invoke();
        }
        this.f237121l = null;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void m7() {
        com.avito.android.blueprints.publish.html_editor.p pVar = this.f237117h;
        if (pVar != null) {
            this.f237120k.h(pVar);
        }
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void mr(@Y61.l Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> qVar) {
        this.f237120k.setOnSelectionChangedListener(qVar);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void n0(@Y61.l String str) {
        this.f237119j.setSubtitle(str);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void n2(@Y61.k Y41.a<G0> aVar) {
        this.f237120k.setClearButtonListener(new a(aVar));
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void o(@Y61.l String str) {
        this.f237120k.setHint(str);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void o9(int i12) {
        Input input = this.f237120k;
        input.setInputType(16385);
        Input.p(input, 0, i12, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void oN(@Y61.l Y41.a<G0> aVar) {
        this.f237122m = (N) aVar;
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void q2(boolean z12) {
        D6.G(this.f237113d, z12);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void rv() {
        this.f237111b.f304709d = null;
    }

    @Override // com.avito.android.ui.widget.tagged_input.e.a
    public final void setText(@Y61.k String str) {
        gj(str);
        Editable editableM53getText = this.f237120k.m53getText();
        if (editableM53getText == null) {
            return;
        }
        Selection.setSelection(editableM53getText, editableM53getText.length());
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void setTitle(@Y61.l CharSequence charSequence) {
        this.f237119j.setTitle(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.items.tagged_input.A
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f237121l = (N) aVar;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void t1(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        G0 g02;
        Input input = this.f237120k;
        if (lVar != null) {
            input.setOnFocusChangeListener(new com.avito.android.blueprint.suggest.A(2, lVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            input.setOnFocusChangeListener(null);
        }
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void u(@Y61.l CharSequence charSequence) {
        this.f237119j.q(charSequence);
        Input.f179303W.getClass();
        this.f237120k.setState(Input.f179304a0);
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void uR(@Y61.k String str, @Y61.k com.avito.android.ui.widget.tagged_input.m mVar, @Y61.k InterfaceC22983P interfaceC22983P, boolean z12) {
        this.f237112c.uR(str, mVar, interfaceC22983P, z12);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void wE(@Y61.k e.a aVar) {
        this.f237111b.f304709d = aVar;
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void x2(@Y61.k String str) {
        this.f237113d.setText(str);
    }

    @Override // com.avito.android.publish.items.tagged_input.A
    public final void y2(@Y61.k Y41.a<G0> aVar) {
        this.f237114e.setOnClickListener(new com.avito.android.publish.details.adapter.edit_category.h(19, aVar));
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void yh(@Y61.k String str, @Y61.k com.avito.android.ui.widget.tagged_input.m mVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f237111b.yh(str, mVar, interfaceC22983P);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f237125b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f237126c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f237127d;

        public b(Input input, Y41.l lVar) {
            this.f237126c = input;
            this.f237127d = lVar;
            this.f237125b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f237126c.getDeformattedText();
            if (L.f(deformattedText, this.f237125b)) {
                return;
            }
            this.f237127d.invoke(deformattedText);
            this.f237125b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
