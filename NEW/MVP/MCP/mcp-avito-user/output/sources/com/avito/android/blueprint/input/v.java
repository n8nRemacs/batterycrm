package com.avito.android.blueprint.input;

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
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/input/v;", "LHj/c;", "Lcom/avito/android/blueprint/input/s;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v extends Hj.c implements s {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f105563w = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Input f105564m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f105565n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f105566o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f105567p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public TextWatcher f105568q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public com.avito.android.blueprints.publish.html_editor.p f105569r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.input.s f105570s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public N f105571t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f105572u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f105573v;

    /* compiled from: PublishInputView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprint/input/v$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            Y41.a<G0> aVar = v.this.f105572u;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            Y41.a<G0> aVar = v.this.f105573v;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: PublishInputView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f105575l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(0);
            this.f105575l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f105575l.invoke();
            return G0.f406611a;
        }
    }

    public v(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_input_content, aVar);
        Input input = (Input) this.f7656e.findViewById(R.id.input);
        this.f105564m = input;
        this.f105565n = (TextView) view.findViewById(R.id.description);
        Button button = (Button) view.findViewById(R.id.action_button);
        this.f105566o = button;
        this.f105567p = (Button) view.findViewById(R.id.restore_button);
        view.addOnAttachStateChangeListener(new a());
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 2));
        Resources resources = view.getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Button.g(button, resources.getDrawable(R.drawable.ic_ai_tool_16, theme), null, false, null, 10);
    }

    @Override // Hj.c
    public final void B80() {
        Input.f179303W.getClass();
        this.f105564m.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void C2(@Y61.k final Y41.l<? super String, G0> lVar) {
        this.f105566o.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.blueprint.input.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Input input = this.f105559b.f105564m;
                K2.d(input, true);
                ((j) lVar).invoke(input.getDeformattedText());
            }
        });
    }

    @Override // Hj.c
    public final void C80() {
        Input.f179303W.getClass();
        this.f105564m.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void EM(@Y61.l Y41.a<G0> aVar) {
        this.f105573v = aVar;
    }

    @Override // com.avito.android.blueprint.input.s
    public final void Ga(boolean z12) {
        this.f105564m.setSelectionToEndOnFocus(z12);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void HI(@Y61.l Y41.a<G0> aVar) {
        this.f105564m.setTouchListener(aVar != null ? new u(0, aVar) : null);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void I0(int i12) {
        this.f105564m.setMaxLength(i12);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void J1(int i12, int i13) {
        Input input = this.f105564m;
        input.setInputType(16385);
        input.o(Integer.MAX_VALUE, i12);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void M2(boolean z12) {
        this.f105564m.setClearButton(true);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void MF(@Y61.k com.avito.android.blueprints.publish.html_editor.p pVar) {
        com.avito.android.blueprints.publish.html_editor.p pVar2 = this.f105569r;
        Input input = this.f105564m;
        if (pVar2 != null) {
            input.h(pVar2);
        }
        this.f105569r = pVar;
        input.b(pVar);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void T0(@Y61.k FormatterType formatterType) {
        this.f105564m.setFormatterType(formatterType);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void T2(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        this.f105564m.setPostfix(str);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void Yw(@Y61.l Y41.l<? super String, G0> lVar, boolean z12) {
        TextWatcher textWatcherC;
        TextWatcher textWatcher = this.f105568q;
        Input input = this.f105564m;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        if (lVar != null) {
            if (z12) {
                textWatcherC = new c(input, lVar);
                input.b(textWatcherC);
            } else {
                textWatcherC = com.avito.android.lib.design.input.n.c(input, lVar);
            }
            this.f105568q = textWatcherC;
        }
    }

    @Override // com.avito.android.blueprint.input.s
    public final void c2(@Y61.l Y41.l<? super String, G0> lVar) {
        com.avito.android.lib.design.input.s sVar = this.f105570s;
        Input input = this.f105564m;
        if (sVar != null) {
            input.h(sVar);
        }
        this.f105570s = lVar != null ? com.avito.android.lib.design.input.n.c(input, lVar) : null;
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    @Y61.l
    public final CharSequence getText() {
        return this.f105564m.m53getText();
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void gj(@Y61.l CharSequence charSequence) {
        Input.t(this.f105564m, charSequence, false, 6);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void h(@Y61.l String str) {
        boolean z12 = true ^ (str == null || str.length() == 0);
        TextView textView = this.f105565n;
        D6.G(textView, z12);
        textView.setText(str);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void h0() {
        this.f105564m.r();
    }

    @Override // com.avito.android.blueprint.input.s
    public final void h3(@Y61.l String str, boolean z12) {
        Button button = this.f105567p;
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

    @Override // com.avito.android.blueprint.input.s
    public final void he(@Y61.l String str) {
        Input input = this.f105564m;
        if (L.f(str, input.getDeformattedText())) {
            return;
        }
        Input.t(input, str, false, 4);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        m7();
        this.f105571t = null;
        Input input = this.f105564m;
        input.setOnSelectionChangedListener(null);
        input.setRightIconListener(null);
        input.setRightIcon((Drawable) null);
        K2.d(this.f7655d, true);
    }

    @Override // com.avito.android.util.InterfaceC35938s1, com.avito.android.blueprints.publish.html_editor.f
    public final void m7() {
        com.avito.android.blueprints.publish.html_editor.p pVar = this.f105569r;
        if (pVar != null) {
            this.f105564m.h(pVar);
        }
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void mr(@Y61.l Y41.q<? super CharSequence, ? super Integer, ? super Integer, G0> qVar) {
        this.f105564m.setOnSelectionChangedListener(qVar);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void n2(@Y61.k Y41.a<G0> aVar) {
        this.f105564m.setClearButtonListener(new b(aVar));
    }

    @Override // com.avito.android.blueprint.input.s
    public final void o(@Y61.l String str) {
        this.f105564m.setHint(str);
    }

    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void oN(@Y61.l Y41.a<G0> aVar) {
        this.f105572u = aVar;
    }

    @Override // com.avito.android.blueprint.input.s
    public final void q2(boolean z12) {
        D6.G(this.f105566o, z12);
    }

    @Override // Hj.c, Hj.InterfaceC13997b
    public final void setEnabled(boolean z12) {
        super.setEnabled(z12);
        this.f105564m.setEnabled(z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.blueprints.publish.html_editor.f
    public final void t1(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        this.f105571t = (N) lVar;
    }

    @Override // com.avito.android.blueprint.input.s
    public final void x2(@Y61.k String str) {
        this.f105566o.setText(str);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void x5(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        this.f105564m.setPrefix(str);
    }

    @Override // com.avito.android.blueprint.input.s
    public final void y2(@Y61.k Y41.a<G0> aVar) {
        this.f105567p.setOnClickListener(new com.avito.android.blueprint.date.interval.j(3, aVar));
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f105576b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f105577c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f105578d;

        public c(Input input, Y41.l lVar) {
            this.f105577c = input;
            this.f105578d = lVar;
            this.f105576b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f105577c.getDeformattedText();
            if (L.f(deformattedText, this.f105576b)) {
                return;
            }
            this.f105578d.invoke(deformattedText);
            this.f105576b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
