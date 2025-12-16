package com.avito.android.blueprints.select;

import Ba.ViewOnClickListenerC13121a;
import PK0.n;
import PK0.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/select/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/select/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f106605k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f106606b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106607c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f106608d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f106609e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f106610f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f106611g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public a f106612h;

    /* renamed from: i, reason: collision with root package name */
    public final int f106613i;

    /* renamed from: j, reason: collision with root package name */
    public final int f106614j;

    public m(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.l Y41.a<G0> aVar2) {
        super(view);
        this.f106606b = view;
        this.f106607c = aVar;
        this.f106608d = aVar2;
        this.f106609e = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        Input input = (Input) view.findViewById(R.id.select);
        this.f106610f = input;
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.container);
        this.f106611g = componentContainer;
        this.f106613i = componentContainer.getPaddingTop();
        this.f106614j = componentContainer.getPaddingBottom();
        Input.p(input, 0, 0, 3);
    }

    public final SpannableStringBuilder B80(CharSequence charSequence, Y41.a aVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        View view = this.f106606b;
        view.getContext().setTheme(R.style.Theme_DesignSystem_Re23);
        FV.a aVar2 = FV.a.f4720a;
        Context context = view.getContext();
        int iB2 = y6.b(3);
        l lVar = new l(aVar);
        aVar2.getClass();
        String strN = com.avito.android.lib.util.f.n(R.attr.textIconQuestionFilled, context);
        spannableStringBuilder.append(strN == null ? charSequence : FV.a.d(charSequence, strN, iB2, lVar));
        com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
        Context context2 = view.getContext();
        int iJ2 = C35835l0.j(R.attr.textM20, view.getContext());
        dVar.getClass();
        spannableStringBuilder.setSpan(new p(n.a(com.avito.android.lib.design.text_view.d.a(iJ2, context2), null, null, null, null, null, new C35763c0(C35835l0.d(R.attr.gray28, view.getContext()), null, null, null, 14, null), null, null, null, 8063)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // com.avito.android.blueprints.select.k
    public final void Fv(@Y61.l CustomPaddings customPaddings) {
        Integer top = customPaddings.getTop();
        Integer numValueOf = top != null ? Integer.valueOf(y6.d(top.intValue())) : null;
        Integer bottom = customPaddings.getBottom();
        D6.c(this.f106610f, null, numValueOf, null, bottom != null ? Integer.valueOf(y6.d(bottom.intValue())) : null, 5);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void K(@Y61.l Y41.l<? super String, G0> lVar) {
        a aVar = this.f106612h;
        Input input = this.f106610f;
        if (aVar != null) {
            input.h(aVar);
        }
        a aVar2 = new a(input, lVar);
        input.b(aVar2);
        this.f106612h = aVar2;
    }

    @Override // com.avito.android.blueprints.select.k
    public final void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f106611g;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(charSequence2);
        }
        Input.f179303W.getClass();
        this.f106610f.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void NL(@Y61.k AddressParameter.InputStyle inputStyle) throws Resources.NotFoundException {
        int iC2 = com.avito.android.lib.util.f.c(new androidx.appcompat.view.d(this.f106606b.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, inputStyle.getTheme())), inputStyle.getName());
        Input input = this.f106610f;
        input.getContext().setTheme(com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, inputStyle.getTheme()));
        input.setAppearanceAndContent(iC2);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void Rg(@Y61.k AddressParameter.MotivationPosition motivationPosition) {
        this.f106611g.setMessagePosition(motivationPosition == AddressParameter.MotivationPosition.BOTTOM);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f106610f.setOnClickListener(new ViewOnClickListenerC13121a(23, aVar));
    }

    @Override // com.avito.android.blueprints.select.k
    public final void b3(@Y61.l String str) {
        if (str == null) {
            return;
        }
        this.f106611g.setTitleStyle(com.avito.android.lib.util.f.r(this.f106609e, str));
    }

    @Override // com.avito.android.blueprints.select.k
    public final void cH(@Y61.l AttributedText attributedText, @Y61.l Y41.a<G0> aVar) {
        CharSequence charSequenceC = this.f106607c.c(this.f106606b.getContext(), attributedText);
        if (attributedText != null) {
            charSequenceC = charSequenceC != null ? B80(charSequenceC, aVar) : null;
        }
        ComponentContainer componentContainer = this.f106611g;
        componentContainer.q(charSequenceC);
        componentContainer.setSubtitle((CharSequence) null);
        Input input = this.f106610f;
        input.setRightIcon((Drawable) null);
        Input.f179303W.getClass();
        input.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void i4(@Y61.l Y41.a<G0> aVar) {
        ComponentContainer componentContainer = this.f106611g;
        if (aVar != null) {
            componentContainer.setTitleTipListener(aVar);
        } else {
            componentContainer.setTitleTipListener(null);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Input input = this.f106610f;
        input.setOnClickListener(null);
        a aVar = this.f106612h;
        if (aVar != null) {
            input.h(aVar);
        }
        Y41.a<G0> aVar2 = this.f106608d;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    @Override // com.avito.android.blueprints.select.k
    public final void k(@Y61.l AttributedText attributedText) {
        CharSequence charSequenceC = this.f106607c.c(this.f106609e, attributedText);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        ComponentContainer componentContainer = this.f106611g;
        componentContainer.setSubtitleMovementMethod(linkMovementMethod);
        componentContainer.setSubtitle(charSequenceC);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void k0(@Y61.l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        D6.f(this.f106611g, 0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? this.f106613i : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? this.f106614j : y6.d(bottom.intValue()), 5);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void m(@Y61.l String str) {
        Input.t(this.f106610f, str, false, 6);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void o(@Y61.l String str) {
        this.f106610f.setHint(str);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void p2(boolean z12) {
        this.f106610f.setClearButton(z12);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void pb(boolean z12) {
        this.f106610f.setRightContainerForceInvisible(z12);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void setEnabled(boolean z12) {
        this.f106610f.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void setTitle(@Y61.k CharSequence charSequence) {
        this.f106611g.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void tW(@Y61.l AttributedText attributedText, @Y61.l Y41.a<G0> aVar) {
        CharSequence charSequenceC = this.f106607c.c(this.f106606b.getContext(), attributedText);
        if (attributedText != null) {
            charSequenceC = charSequenceC != null ? B80(charSequenceC, aVar) : null;
        }
        ComponentContainer componentContainer = this.f106611g;
        componentContainer.q(charSequenceC);
        componentContainer.setSubtitle((CharSequence) null);
        Input input = this.f106610f;
        input.setRightIcon((Drawable) null);
        Input.f179303W.getClass();
        input.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprints.select.k
    public final void u(@Y61.l CharSequence charSequence) {
        this.f106611g.q(charSequence);
        Input.f179303W.getClass();
        this.f106610f.setState(Input.f179304a0);
    }

    public /* synthetic */ m(View view, com.avito.android.util.text.a aVar, Y41.a aVar2, int i12, C42822w c42822w) {
        this(view, aVar, (i12 & 4) != 0 ? null : aVar2);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f106615b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f106616c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f106617d;

        public a(Input input, Y41.l lVar) {
            this.f106616c = input;
            this.f106617d = lVar;
            this.f106615b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f106616c.getDeformattedText();
            if (L.f(deformattedText, this.f106615b)) {
                return;
            }
            this.f106617d.invoke(deformattedText);
            this.f106615b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
