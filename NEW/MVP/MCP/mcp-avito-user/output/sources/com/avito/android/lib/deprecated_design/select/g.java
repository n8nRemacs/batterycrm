package com.avito.android.lib.deprecated_design.select;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.select.SelectionAwareEditText;
import com.avito.android.lib.deprecated_design.select.g;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectView.kt */
@s0
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u000756789:;J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010#J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b0\u0010\u0013J\u0017\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104¨\u0006<"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lcom/avito/android/lib/deprecated_design/select/g$g;", "listener", "Lkotlin/G0;", "setOnValueClickListener", "(Lcom/avito/android/lib/deprecated_design/select/g$g;)V", "Lcom/avito/android/lib/deprecated_design/select/g$b;", "setOnClearClickListener", "(Lcom/avito/android/lib/deprecated_design/select/g$b;)V", "Lcom/avito/android/lib/deprecated_design/select/g$a;", "setOnChangeListener", "(Lcom/avito/android/lib/deprecated_design/select/g$a;)V", "Lcom/avito/android/lib/deprecated_design/select/g$d;", "setOnFocusChangeListener", "(Lcom/avito/android/lib/deprecated_design/select/g$d;)V", "", "value", "setValue", "(Ljava/lang/CharSequence;)V", "status", "setStatus", ConstraintKt.WARNING, "setWarning", "error", "setError", "", "visible", "setClearVisible", "(Z)V", "singleLine", "setSingleLine", "", "gravity", "setEditTextGravity", "(I)V", "getValue", "()Ljava/lang/CharSequence;", "orientation", "setOrientation", "Lcom/avito/android/lib/deprecated_design/select/SelectState;", VoiceInfo.STATE, "setState", "(Lcom/avito/android/lib/deprecated_design/select/SelectState;)V", "Lcom/avito/android/lib/deprecated_design/select/SelectMode;", "mode", "setMode", "(Lcom/avito/android/lib/deprecated_design/select/SelectMode;)V", "setValueInner", "Lcom/avito/android/common/k;", "data", "setText", "(Lcom/avito/android/common/k;)V", "a", "b", "c", "d", "e", "f", "g", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class g extends LinearLayoutCompat {

    /* renamed from: A, reason: collision with root package name */
    @l
    public b f178106A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public a f178107B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public d f178108C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final f f178109D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f178110E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public CharSequence f178111F;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.select.c f178112q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final View f178113r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final SelectionAwareEditText f178114s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final View f178115t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final TextView f178116u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public SelectState f178117v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public SelectMode f178118w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public com.avito.android.lib.deprecated_design.select.b f178119x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.select.a f178120y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public InterfaceC5248g f178121z;

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$a;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends Y41.l<String, G0> {
    }

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$b;", "Lkotlin/Function0;", "Lkotlin/G0;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends Y41.a<G0> {
    }

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$c;", "Landroid/view/View$OnFocusChangeListener;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(@l View view, boolean z12) {
            d dVar = g.this.f178108C;
            if (dVar != null) {
                dVar.invoke(Boolean.valueOf(z12));
            }
        }
    }

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$d;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends Y41.l<Boolean, G0> {
    }

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$e;", "Lcom/avito/android/lib/deprecated_design/select/SelectionAwareEditText$a;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e implements SelectionAwareEditText.a {
        public e() {
        }

        @Override // com.avito.android.lib.deprecated_design.select.SelectionAwareEditText.a
        public final void a() {
            g.this.f178114s.length();
        }
    }

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$f;", "Lcom/avito/android/util/u5;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class f extends AbstractC35956u5 {
        public f() {
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void afterTextChanged(@k Editable editable) {
            g.n(g.this, editable);
        }
    }

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/select/g$g;", "Lkotlin/Function0;", "Lkotlin/G0;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.deprecated_design.select.g$g, reason: collision with other inner class name */
    public interface InterfaceC5248g extends Y41.a<G0> {
    }

    public g(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        com.avito.android.lib.deprecated_design.select.b dVar;
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f178112q = new com.avito.android.lib.deprecated_design.select.c();
        this.f178117v = SelectState.f178091e;
        this.f178118w = SelectMode.f178088b;
        f fVar = new f();
        this.f178109D = fVar;
        super.setOrientation(1);
        setDuplicateParentStateEnabled(true);
        LayoutInflater.from(context).inflate(R.layout.deprecated_select, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.value_container);
        this.f178113r = viewFindViewById;
        SelectionAwareEditText selectionAwareEditText = (SelectionAwareEditText) viewFindViewById.findViewById(R.id.value);
        this.f178114s = selectionAwareEditText;
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.clear);
        this.f178115t = viewFindViewById2;
        this.f178116u = (TextView) findViewById(R.id.status);
        final int i14 = 0;
        selectionAwareEditText.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.lib.deprecated_design.select.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f178105c;

            {
                this.f178105c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g.InterfaceC5248g interfaceC5248g = this.f178105c.f178121z;
                        if (interfaceC5248g != null) {
                            interfaceC5248g.invoke();
                            break;
                        }
                        break;
                    default:
                        g.b bVar = this.f178105c.f178106A;
                        if (bVar != null) {
                            bVar.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.lib.deprecated_design.select.f

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f178105c;

            {
                this.f178105c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        g.InterfaceC5248g interfaceC5248g = this.f178105c.f178121z;
                        if (interfaceC5248g != null) {
                            interfaceC5248g.invoke();
                            break;
                        }
                        break;
                    default:
                        g.b bVar = this.f178105c.f178106A;
                        if (bVar != null) {
                            bVar.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        selectionAwareEditText.addTextChangedListener(fVar);
        this.f178110E = true;
        selectionAwareEditText.setOnFocusChangeListener(new c());
        selectionAwareEditText.setSelectionListener(new e());
        SelectMode selectMode = this.f178118w;
        Resources resources = getResources();
        int iOrdinal = selectMode.ordinal();
        if (iOrdinal == 0) {
            dVar = new com.avito.android.lib.deprecated_design.select.d(resources);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new com.avito.android.lib.deprecated_design.select.e(resources);
        }
        this.f178119x = dVar;
        dVar.b(this.f178117v, context);
        selectionAwareEditText.setBackground(this.f178119x.a());
        com.avito.android.lib.deprecated_design.select.a aVar = new com.avito.android.lib.deprecated_design.select.a(context);
        this.f178120y = aVar;
        aVar.b(this.f178117v, context);
        viewFindViewById2.setBackground(aVar.f178100a);
    }

    public static final void n(g gVar, Editable editable) {
        SelectionAwareEditText selectionAwareEditText = gVar.f178114s;
        com.avito.android.common.k kVar = new com.avito.android.common.k(selectionAwareEditText.getSelectionStart(), selectionAwareEditText.getSelectionEnd(), editable);
        gVar.f178111F = editable;
        com.avito.android.common.k kVar2 = new com.avito.android.common.k(kVar.f123767b, kVar.f123768c, new SpannableStringBuilder(editable));
        if (gVar.f178110E) {
            gVar.f178110E = false;
            f fVar = gVar.f178109D;
            selectionAwareEditText.removeTextChangedListener(fVar);
            gVar.setText(kVar2);
            selectionAwareEditText.addTextChangedListener(fVar);
            gVar.f178110E = true;
        } else {
            gVar.setText(kVar2);
        }
        a aVar = gVar.f178107B;
        if (aVar != null) {
            aVar.invoke(String.valueOf(gVar.f178111F));
        }
    }

    private final void setMode(SelectMode mode) {
        com.avito.android.lib.deprecated_design.select.b dVar;
        if (this.f178118w != mode) {
            this.f178118w = mode;
            SelectMode selectMode = SelectMode.f178088b;
            int i12 = mode == selectMode ? 1 : 0;
            SelectionAwareEditText selectionAwareEditText = this.f178114s;
            selectionAwareEditText.setInputType(i12);
            selectionAwareEditText.setFocusableInTouchMode(mode == selectMode);
            Resources resources = getResources();
            this.f178112q.getClass();
            int iOrdinal = mode.ordinal();
            if (iOrdinal == 0) {
                dVar = new com.avito.android.lib.deprecated_design.select.d(resources);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = new com.avito.android.lib.deprecated_design.select.e(resources);
            }
            this.f178119x = dVar;
            dVar.b(this.f178117v, getContext());
            selectionAwareEditText.setBackground(this.f178119x.a());
        }
    }

    private final void setState(SelectState state) {
        if (this.f178117v != state) {
            this.f178117v = state;
            this.f178116u.setTextColor(C35835l0.e(state.f178098d, getContext()));
            this.f178119x.b(state, getContext());
            this.f178120y.b(state, getContext());
        }
    }

    private final void setText(com.avito.android.common.k data) {
        SelectionAwareEditText selectionAwareEditText = this.f178114s;
        boolean zEquals = String.valueOf(selectionAwareEditText.getText()).equals(data.f123766a.toString());
        if (!zEquals) {
            selectionAwareEditText.setText(data.f123766a);
        }
        int selectionStart = selectionAwareEditText.getSelectionStart();
        int i12 = data.f123768c;
        int i13 = data.f123767b;
        boolean z12 = (selectionStart == i13 && selectionAwareEditText.getSelectionEnd() == i12) ? false : true;
        if (!zEquals || z12) {
            selectionAwareEditText.setSelection(i13, i12);
        }
    }

    private final void setValueInner(CharSequence value) {
        this.f178111F = value;
        CharSequence charSequence = value == null ? "" : value;
        if (charSequence.length() == 0) {
            SelectionAwareEditText selectionAwareEditText = this.f178114s;
            if (!selectionAwareEditText.hasFocus()) {
                selectionAwareEditText.setText(value);
                return;
            }
        }
        com.avito.android.common.k kVar = new com.avito.android.common.k(charSequence.length(), charSequence.length(), charSequence);
        setText(new com.avito.android.common.k(kVar.f123767b, kVar.f123768c, new SpannableStringBuilder(charSequence)));
    }

    @l
    /* renamed from: getValue, reason: from getter */
    public final CharSequence getF178111F() {
        return this.f178111F;
    }

    public final void setClearVisible(boolean visible) {
        D6.G(this.f178115t, visible);
    }

    public final void setEditTextGravity(int gravity) {
        this.f178114s.setGravity(gravity);
    }

    public final void setError(@l CharSequence error) {
        SelectState selectState = SelectState.f178093g;
        I5.a(this.f178116u, error, false);
        setState(selectState);
    }

    public final void setOnChangeListener(@k a listener) {
        this.f178107B = listener;
    }

    public final void setOnClearClickListener(@k b listener) {
        this.f178106A = listener;
    }

    public final void setOnFocusChangeListener(@k d listener) {
        this.f178108C = listener;
    }

    public final void setOnValueClickListener(@l InterfaceC5248g listener) {
        this.f178121z = listener;
    }

    public final void setSingleLine(boolean singleLine) {
        this.f178114s.setSingleLine(singleLine);
    }

    public final void setStatus(@l CharSequence status) {
        SelectState selectState = SelectState.f178091e;
        I5.a(this.f178116u, status, false);
        setState(selectState);
    }

    public final void setValue(@l CharSequence value) {
        if (!this.f178110E) {
            setValueInner(value);
            return;
        }
        this.f178110E = false;
        f fVar = this.f178109D;
        SelectionAwareEditText selectionAwareEditText = this.f178114s;
        selectionAwareEditText.removeTextChangedListener(fVar);
        setValueInner(value);
        selectionAwareEditText.addTextChangedListener(fVar);
        this.f178110E = true;
    }

    public final void setWarning(@l CharSequence warning) {
        SelectState selectState = SelectState.f178092f;
        I5.a(this.f178116u, warning, false);
        setState(selectState);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void setOrientation(int orientation) {
    }
}
