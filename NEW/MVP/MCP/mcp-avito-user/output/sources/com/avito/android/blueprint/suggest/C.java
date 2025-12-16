package com.avito.android.blueprint.suggest;

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
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.ui.widget.tagged_input.e;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputWithSuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprint/suggest/C;", "LHj/c;", "Lcom/avito/android/blueprint/suggest/y;", "Lcom/avito/android/ui/widget/tagged_input/e;", "Lcom/avito/android/ui/widget/tagged_input/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C extends Hj.c implements y, com.avito.android.ui.widget.tagged_input.e, com.avito.android.ui.widget.tagged_input.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f105675y = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ui.widget.tagged_input.f f105676m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.ui.widget.tagged_input.i f105677n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Input f105678o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f105679p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f105680q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Button f105681r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public TextWatcher f105682s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public com.avito.android.blueprints.publish.html_editor.p f105683t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f105684u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public N f105685v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public N f105686w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public N f105687x;

    /* compiled from: PublishInputWithSuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105688l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f105688l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f105688l.invoke();
            return G0.f406611a;
        }
    }

    public C(@Y61.k View view, @Y61.k com.avito.android.ui.widget.tagged_input.f fVar, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_input_with_suggests_content, aVar);
        this.f105676m = fVar;
        View viewFindViewById = view.findViewById(R.id.tags);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f105677n = new com.avito.android.ui.widget.tagged_input.i((RecyclerView) viewFindViewById, R.dimen.publish_input_with_tags_horizontal_padding, R.layout.view_publish_input_suggest);
        this.f105678o = (Input) this.f7656e.findViewById(R.id.input);
        this.f105679p = (TextView) view.findViewById(R.id.description);
        Button button = (Button) view.findViewById(R.id.action_button);
        this.f105680q = button;
        this.f105681r = (Button) view.findViewById(R.id.restore_button);
        view.addOnAttachStateChangeListener(new B(this));
        Resources resources = view.getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Button.g(button, resources.getDrawable(R.drawable.ic_ai_tool_16, theme), null, false, null, 10);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e.a
    public final void B50(@Y61.k String str) {
        Input input = this.f105678o;
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

    @Override // Hj.c
    public final void B80() {
        Input.f179303W.getClass();
        this.f105678o.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void C2(@Y61.k final Y41.l<? super String, G0> lVar) {
        this.f105680q.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.blueprint.suggest.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Input input = this.f105762b.f105678o;
                K2.d(input, true);
                ((i) lVar).invoke(input.getDeformattedText());
            }
        });
    }

    @Override // Hj.c
    public final void C80() {
        Input.f179303W.getClass();
        this.f105678o.setState(Input.f179304a0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void EM(@Y61.l Y41.a<G0> aVar) {
        this.f105687x = (N) aVar;
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void FC(@Y61.k String str, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f105677n.FC(str, interfaceC22983P);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void HI(@Y61.l Y41.a<G0> aVar) {
        this.f105678o.setTouchListener(aVar != null ? new com.avito.android.blueprint.input.u(1, aVar) : null);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void M2(boolean z12) {
        this.f105678o.setClearButton(z12);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void MF(@Y61.k com.avito.android.blueprints.publish.html_editor.p pVar) {
        com.avito.android.blueprints.publish.html_editor.p pVar2 = this.f105683t;
        Input input = this.f105678o;
        if (pVar2 != null) {
            input.h(pVar2);
        }
        this.f105683t = pVar;
        input.b(pVar);
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void Mi(boolean z12) throws Resources.NotFoundException {
        this.f105677n.Mi(z12);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void No(@Y61.k String str, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f105676m.No(str, interfaceC22983P);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void T0(@Y61.k FormatterType formatterType) {
        this.f105678o.setFormatterType(formatterType);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void Yw(@Y61.l Y41.l<? super String, G0> lVar, boolean z12) {
        TextWatcher textWatcherC;
        TextWatcher textWatcher = this.f105682s;
        Input input = this.f105678o;
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
            this.f105682s = textWatcherC;
        }
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void c2(@Y61.l Y41.l<? super String, G0> lVar) {
        com.avito.android.lib.design.input.s sVar = this.f105684u;
        Input input = this.f105678o;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f105684u = lVar != null ? com.avito.android.lib.design.input.n.c(input, lVar) : null;
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void f8(@Y61.l String str) {
        Input input = this.f105678o;
        if (L.f(str, input.getDeformattedText())) {
            return;
        }
        Input.t(input, str, false, 4);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    @Y61.l
    public final CharSequence getText() {
        return this.f105678o.m53getText();
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void gj(@Y61.l CharSequence charSequence) {
        Input.t(this.f105678o, charSequence, false, 6);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void h(@Y61.l String str) {
        boolean z12 = true ^ (str == null || str.length() == 0);
        TextView textView = this.f105679p;
        D6.G(textView, z12);
        textView.setText(str);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void h0() {
        this.f105678o.r();
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void h3(@Y61.l String str, boolean z12) {
        Button button = this.f105681r;
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

    @Override // com.avito.android.blueprint.suggest.y
    public final void i0() {
        this.f105678o.v();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        K2.d(this.f7655d, true);
        ?? r02 = this.f105685v;
        if (r02 != 0) {
            r02.invoke();
        }
        this.f105685v = null;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void m7() {
        com.avito.android.blueprints.publish.html_editor.p pVar = this.f105683t;
        if (pVar != null) {
            this.f105678o.h(pVar);
        }
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void mr(@Y61.l Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> qVar) {
        this.f105678o.setOnSelectionChangedListener(qVar);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void n2(@Y61.k Y41.a<G0> aVar) {
        this.f105678o.setClearButtonListener(new a(aVar));
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void o(@Y61.l String str) {
        this.f105678o.setHint(str);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void o9(int i12) {
        Input input = this.f105678o;
        input.setInputType(16385);
        Input.p(input, 0, i12, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void oN(@Y61.l Y41.a<G0> aVar) {
        this.f105686w = (N) aVar;
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void q2(boolean z12) {
        D6.G(this.f105680q, z12);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void rv() {
        this.f105676m.f304709d = null;
    }

    @Override // com.avito.android.ui.widget.tagged_input.e.a
    public final void setText(@Y61.k String str) {
        gj(str);
        Editable editableM53getText = this.f105678o.m53getText();
        if (editableM53getText == null) {
            return;
        }
        Selection.setSelection(editableM53getText, editableM53getText.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprint.suggest.y
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f105685v = (N) aVar;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void t1(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        G0 g02;
        Input input = this.f105678o;
        if (lVar != null) {
            input.setOnFocusChangeListener(new A(0, lVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            input.setOnFocusChangeListener(null);
        }
    }

    @Override // com.avito.android.ui.widget.tagged_input.g
    public final void uR(@Y61.k String str, @Y61.k com.avito.android.ui.widget.tagged_input.m mVar, @Y61.k InterfaceC22983P interfaceC22983P, boolean z12) {
        this.f105677n.uR(str, mVar, interfaceC22983P, z12);
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void wE(@Y61.k e.a aVar) {
        this.f105676m.f304709d = aVar;
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void x2(@Y61.k String str) {
        this.f105680q.setText(str);
    }

    @Override // com.avito.android.blueprint.suggest.y
    public final void y2(@Y61.k Y41.a<G0> aVar) {
        this.f105681r.setOnClickListener(new com.avito.android.blueprint.date.interval.j(6, aVar));
    }

    @Override // com.avito.android.ui.widget.tagged_input.e
    public final void yh(@Y61.k String str, @Y61.k com.avito.android.ui.widget.tagged_input.m mVar, @Y61.k InterfaceC22983P interfaceC22983P) {
        this.f105676m.yh(str, mVar, interfaceC22983P);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f105689b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f105690c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f105691d;

        public b(Input input, Y41.l lVar) {
            this.f105690c = input;
            this.f105691d = lVar;
            this.f105689b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f105690c.getDeformattedText();
            if (L.f(deformattedText, this.f105689b)) {
                return;
            }
            this.f105691d.invoke(deformattedText);
            this.f105689b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
