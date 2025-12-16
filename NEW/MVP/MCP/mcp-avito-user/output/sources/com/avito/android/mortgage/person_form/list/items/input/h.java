package com.avito.android.mortgage.person_form.list.items.input;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InputView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/input/h;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/input/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class h extends C00.a implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f200715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f200716c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public String f200717d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f200718e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200719f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public N f200720g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public N f200721h;

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            String deformattedText;
            h hVar = h.this;
            boolean z12 = hVar.f200719f;
            Input input = hVar.f200716c;
            if (z12) {
                Editable editableM53getText = input.m53getText();
                if (editableM53getText == null || (deformattedText = editableM53getText.toString()) == null) {
                    deformattedText = "";
                }
            } else {
                deformattedText = input.getDeformattedText();
            }
            if (!hVar.f200718e || (deformattedText.length() > 0 && !deformattedText.equals(hVar.f200717d))) {
                hVar.f200717d = deformattedText;
                ?? r32 = hVar.f200720g;
                if (r32 != 0) {
                    r32.invoke(deformattedText);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InputView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f200723l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AttributedText attributedText) {
            super(1);
            this.f200723l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            j.a(textView, this.f200723l, null);
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f200715b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f200716c = input;
        this.f200717d = "";
        n.c(input, new a());
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 12));
        input.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void NH(@l Y41.l<? super Boolean, G0> lVar) {
        this.f200721h = (N) lVar;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void Qi(@k FormatterType formatterType, @k String str) {
        Input input = this.f200716c;
        input.setFormatterType(formatterType);
        input.setHint(str);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void RQ(boolean z12) {
        this.f200718e = z12;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void Yg(@l AttributedText attributedText, @l String str) {
        ComponentContainer componentContainer = this.f200715b;
        if (attributedText != null) {
            componentContainer.i(new b(attributedText));
        } else if (str != null) {
            componentContainer.setSubtitle(str);
        } else {
            componentContainer.setSubtitle((CharSequence) null);
        }
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void Yq(@k String str) {
        this.f200715b.setTitle(str);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void cY(@l PrintableText printableText) {
        ComponentContainer componentContainer = this.f200715b;
        if (printableText == null) {
            componentContainer.k();
        } else {
            ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f200720g = null;
        this.f200721h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void u0(@l Y41.l<? super String, G0> lVar) {
        this.f200720g = (N) lVar;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void y0(@k String str) {
        boolean z12 = this.f200719f;
        Input input = this.f200716c;
        if (!z12 && !L.f(input.getDeformattedText(), str)) {
            Input.t(input, str, false, 6);
        } else if (this.f200719f) {
            Editable editableM53getText = input.m53getText();
            if (L.f(editableM53getText != null ? editableM53getText.toString() : null, str)) {
                return;
            }
            Input.t(input, str, false, 6);
        }
    }

    @Override // com.avito.android.mortgage.person_form.list.items.input.g
    public final void zk(boolean z12) {
        this.f200719f = z12;
    }
}
