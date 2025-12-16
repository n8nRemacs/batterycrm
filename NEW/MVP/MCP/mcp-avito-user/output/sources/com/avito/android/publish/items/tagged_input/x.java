package com.avito.android.publish.items.tagged_input;

import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.publish.items.tagged_input.A;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35798g3;
import com.avito.android.util.InterfaceC35807h4;
import com.avito.android.validation.j1;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateInputWithTagsItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/x;", "Lcom/avito/android/publish/items/tagged_input/b;", "Lcom/avito/android/validation/j1;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class x implements InterfaceC33870b, j1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.ui.widget.tagged_input.m f237168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f237169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f237170d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final hJ.h f237171e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final HtmlEditorViewModel f237172f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f237173g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f237174h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Q1 f237175i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LlmDescriptionPresenter f237176j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f237177k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f237178l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<E> f237179m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f237180n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> f237181o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237182p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237183q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237184r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237185s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237186t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.blueprints.publish.html_editor.e f237187u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f237188v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f237189w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f237190x;

    @Inject
    public x(@Y61.l com.avito.android.ui.widget.tagged_input.m mVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.util.text.a aVar, @Y61.k hJ.h hVar, @Y61.l HtmlEditorViewModel htmlEditorViewModel, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12, @Y61.k LlmDescriptionPresenter llmDescriptionPresenter) {
        this.f237168b = mVar;
        this.f237169c = interfaceC22983P;
        this.f237170d = aVar;
        this.f237171e = hVar;
        this.f237172f = htmlEditorViewModel;
        this.f237173g = interfaceC28373a;
        this.f237174h = interfaceC35807h4;
        this.f237175i = q12;
        this.f237176j = llmDescriptionPresenter;
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237177k = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f237178l = cVar2;
        com.jakewharton.rxrelay3.c<E> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f237179m = cVar3;
        com.jakewharton.rxrelay3.c<G0> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f237180n = cVar4;
        com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f237181o = cVar5;
        this.f237182p = new C41981q0(cVar);
        this.f237183q = new C41981q0(cVar2);
        this.f237184r = new C41981q0(cVar3);
        this.f237185s = cVar4;
        this.f237186t = cVar5;
        this.f237187u = new com.avito.android.blueprints.publish.html_editor.e();
        com.jakewharton.rxrelay3.c<DeepLink> cVar6 = new com.jakewharton.rxrelay3.c<>();
        this.f237188v = cVar6;
        this.f237189w = new io.reactivex.rxjava3.disposables.c();
        this.f237190x = cVar6;
    }

    public static final void k(x xVar, ParameterElement.H h12, A a12, boolean z12) {
        xVar.getClass();
        xVar.f237178l.accept(new Q<>(Boolean.valueOf(z12), h12));
        if (z12) {
            a12.i0();
            com.avito.android.html_editor.c cVar = xVar.f237187u.f106261b;
            cVar.f164130a.clear();
            cVar.f164131b = true;
        }
    }

    @Override // com.avito.android.publish.items.tagged_input.InterfaceC33870b
    @Y61.k
    /* renamed from: C, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF237186t() {
        return this.f237186t;
    }

    @Override // com.avito.android.publish.items.tagged_input.InterfaceC33870b
    @Y61.k
    /* renamed from: G0, reason: from getter */
    public final C41981q0 getF237184r() {
        return this.f237184r;
    }

    public final void O(@Y61.k A a12, @Y61.k ParameterElement.H h12) {
        CharSequence charSequenceA;
        AttributedText titleTipText;
        a12.Yw(null, true);
        a12.t1(null);
        a12.m7();
        a12.EM(new h(this));
        CharParameter.AutoBeautification autoBeautification = h12.f117318x;
        CharParameter.AutoDescription autoDescription = h12.f117317w;
        boolean z12 = (autoDescription == null && autoBeautification == null) ? false : true;
        Q1 q12 = this.f237175i;
        if (z12) {
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[63];
            if (((Boolean) q12.f67483e0.a().invoke()).booleanValue()) {
                a12.h6();
            }
        }
        a12.wE(a12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zBooleanValue = q12.w().invoke().booleanValue();
        boolean z13 = h12.f117310p;
        String str = h12.f117299e;
        if (zBooleanValue) {
            charSequenceA = this.f237174h.a(str, z13, h12.f117313s);
        } else {
            if (z13) {
                str = "";
            }
            charSequenceA = str;
        }
        spannableStringBuilder.append(charSequenceA);
        if (h12.f117314t) {
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-54485), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        a12.setTitle(spannableStringBuilder);
        DisplayingOptions displayingOptions = h12.f117308n;
        if (displayingOptions != null && (titleTipText = displayingOptions.getTitleTipText()) != null) {
            this.f237189w.b(titleTipText.linkClicksV3().t0(new i<>(this)));
            a12.Nb(titleTipText);
        }
        a12.n0(h12.f117307m);
        a12.o(h12.f117306l);
        a12.T0(h12.f117303i);
        int i12 = h12.f117305k;
        if (i12 == 1) {
            a12.h0();
            a12.Mi(false);
        } else {
            a12.o9(i12);
            a12.Mi(true);
        }
        a12.q2(false);
        if (z12) {
            j jVar = new j(1, this.f237181o, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            LlmDescriptionPresenter llmDescriptionPresenter = this.f237176j;
            llmDescriptionPresenter.b(jVar);
            llmDescriptionPresenter.f(new k(a12, h12));
            if (h12.f117312r != null) {
                autoBeautification = null;
            }
            llmDescriptionPresenter.j(autoDescription, autoBeautification);
            a12.C2(new l(this, h12));
            a12.y2(new m(this));
            a12.c2(new n(1, llmDescriptionPresenter, LlmDescriptionPresenter.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0));
        } else {
            a12.c2(null);
        }
        hJ.m mVar = h12.f117312r;
        if (mVar != null) {
            a12.gj(mVar.i(this.f237171e));
        } else {
            a12.gj(h12.f117300f);
        }
        if (h12.f117302h) {
            String str2 = h12.f117300f;
            this.f237179m.accept(new E(h12.f117181b, str2 != null ? str2 : ""));
        }
        Boolean bool = h12.f117316v;
        a12.M2(bool != null ? bool.booleanValue() : true);
        a12.n2(new o(this));
        a12.h(h12.f117319y);
        CharSequence text = a12.getText();
        com.avito.android.blueprints.publish.html_editor.g.c(a12, text instanceof Spannable ? (Spannable) text : null, mVar, h12, this.f237171e, this.f237187u, this.f237172f, this.f237177k, this.f237173g, q12.y().invoke().booleanValue() ? h12.f117315u : true, new p(h12, this, a12), new C33872d(this, h12));
        V(a12, h12.f117309o, h12.f117311q);
        a12.oN(new C33873e(h12, this, a12));
        a12.EM(new f(h12, this, a12));
        a12.t(new g(a12));
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((A) eVar, (ParameterElement.H) aVar);
    }

    public final void V(A a12, ItemWithState.State state, AttributedText attributedText) {
        boolean z12 = state instanceof ItemWithState.State.Normal;
        com.avito.android.util.text.a aVar = this.f237170d;
        if (z12) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceB = charSequence;
            } else if (attributedText != null) {
                charSequenceB = aVar.b(attributedText);
            }
            a12.u(charSequenceB);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            A.a.a(a12, ((ItemWithState.State.Warning) state).f173900b, null, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            a12.K1(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, attributedText != null ? aVar.b(attributedText) : null);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            A.a.a(a12, null, attributedText != null ? aVar.b(attributedText) : null, 1);
        }
    }

    @Override // com.avito.android.publish.items.tagged_input.InterfaceC33870b, com.avito.android.validation.j1
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.items.a> b() {
        return this.f237182p;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        A a12 = (A) eVar;
        ParameterElement.H h12 = (ParameterElement.H) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35798g3) {
                obj = obj2;
            }
        }
        if (!(obj instanceof C35798g3)) {
            obj = null;
        }
        C35798g3 c35798g3 = (C35798g3) obj;
        if (c35798g3 == null) {
            O(a12, h12);
            return;
        }
        a12.Yw(null, true);
        a12.t1(null);
        hJ.m mVar = h12.f117312r;
        ItemWithState.State state = c35798g3.f318881a;
        if (state != null) {
            V(a12, state, h12.f117311q);
        }
        com.avito.android.blueprints.publish.html_editor.g.b(a12);
        if (mVar == null) {
            String str = c35798g3.f318882b;
            if (str != null && h12.f117317w != null) {
                a12.f8(str);
            }
        } else {
            hJ.m mVar2 = c35798g3.f318883c;
            if (mVar2 != null) {
                CharSequence text = a12.getText();
                int selectionStart = Selection.getSelectionStart(text);
                int selectionEnd = Selection.getSelectionEnd(text);
                a12.gj(mVar2.i(this.f237171e));
                CharSequence text2 = a12.getText();
                Spannable spannable = text2 instanceof Spannable ? (Spannable) text2 : null;
                if (spannable != null) {
                    Selection.setSelection(spannable, kotlin.ranges.s.g(selectionStart, 0, spannable.length()), kotlin.ranges.s.g(selectionEnd, 0, spannable.length()));
                }
            }
        }
        a12.wE(a12);
        CharSequence text3 = a12.getText();
        com.avito.android.blueprints.publish.html_editor.g.c(a12, text3 instanceof Spannable ? (Spannable) text3 : null, h12.f117312r, h12, this.f237171e, this.f237187u, this.f237172f, this.f237177k, this.f237173g, this.f237175i.y().invoke().booleanValue() ? h12.f117315u : true, new q(h12, this, a12), new r(this, h12));
        a12.oN(new s(h12, this, a12));
        a12.EM(new t(h12, this, a12));
        a12.t(new u(a12));
    }

    @Override // com.avito.android.publish.items.tagged_input.InterfaceC33870b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Q<Boolean, com.avito.android.items.a>> n() {
        return this.f237183q;
    }

    @Override // com.avito.android.publish.items.tagged_input.InterfaceC33870b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> r() {
        return this.f237185s;
    }

    @Override // com.avito.android.publish.items.tagged_input.InterfaceC33870b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> y() {
        return this.f237190x;
    }
}
