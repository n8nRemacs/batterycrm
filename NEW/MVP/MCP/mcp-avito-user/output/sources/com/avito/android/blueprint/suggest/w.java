package com.avito.android.blueprint.suggest;

import Hj.C13996a;
import android.text.Selection;
import android.text.Spannable;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.util.C35798g3;
import com.avito.android.validation.j1;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/suggest/w;", "Lcom/avito/android/blueprint/suggest/c;", "Lcom/avito/android/validation/j1;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w implements InterfaceC28874c, j1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.ui.widget.tagged_input.m f105737b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f105738c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final hJ.h f105739d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final HtmlEditorViewModel f105740e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f105741f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q1 f105742g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LlmDescriptionPresenter f105743h;

    /* renamed from: i, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f105744i;

    /* renamed from: j, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f105745j;

    /* renamed from: k, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<D> f105746k;

    /* renamed from: l, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<G0> f105747l;

    /* renamed from: m, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> f105748m;

    /* renamed from: n, reason: collision with root package name */
    public final C41981q0 f105749n;

    /* renamed from: o, reason: collision with root package name */
    public final C41981q0 f105750o;

    /* renamed from: p, reason: collision with root package name */
    public final C41981q0 f105751p;

    /* renamed from: q, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<G0> f105752q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105753r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.blueprints.publish.html_editor.e f105754s;

    @Inject
    public w(@Y61.l com.avito.android.ui.widget.tagged_input.m mVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k hJ.h hVar, @Y61.l HtmlEditorViewModel htmlEditorViewModel, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Q1 q12, @Y61.k LlmDescriptionPresenter llmDescriptionPresenter) {
        this.f105737b = mVar;
        this.f105738c = interfaceC22983P;
        this.f105739d = hVar;
        this.f105740e = htmlEditorViewModel;
        this.f105741f = interfaceC28373a;
        this.f105742g = q12;
        this.f105743h = llmDescriptionPresenter;
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105744i = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105745j = cVar2;
        com.jakewharton.rxrelay3.c<D> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105746k = cVar3;
        com.jakewharton.rxrelay3.c<G0> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f105747l = cVar4;
        com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f105748m = cVar5;
        this.f105749n = new C41981q0(cVar);
        this.f105750o = new C41981q0(cVar2);
        this.f105751p = new C41981q0(cVar3);
        this.f105752q = cVar4;
        this.f105753r = cVar5;
        this.f105754s = new com.avito.android.blueprints.publish.html_editor.e();
    }

    public static C13996a V(ParameterElement.H h12) {
        return new C13996a(h12.f117299e, h12.f117309o, h12.f117310p, h12.f117313s, h12.f117307m, null, null, h12.f117311q, null, 352, null);
    }

    public static final void k(w wVar, ParameterElement.H h12, y yVar, boolean z12) {
        wVar.getClass();
        wVar.f105745j.accept(new Q<>(Boolean.valueOf(z12), h12));
        if (z12) {
            yVar.i0();
            com.avito.android.html_editor.c cVar = wVar.f105754s.f106261b;
            cVar.f164130a.clear();
            cVar.f164131b = true;
        }
    }

    @Override // com.avito.android.blueprint.suggest.InterfaceC28874c
    @Y61.k
    /* renamed from: C, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF105753r() {
        return this.f105753r;
    }

    @Override // com.avito.android.blueprint.suggest.InterfaceC28874c
    /* renamed from: G0, reason: from getter */
    public final C41981q0 getF105751p() {
        return this.f105751p;
    }

    public final void O(@Y61.k y yVar, @Y61.k ParameterElement.H h12) {
        yVar.Yw(null, true);
        yVar.t1(null);
        yVar.m7();
        yVar.wE(yVar);
        yVar.a60(V(h12));
        yVar.o(h12.f117306l);
        yVar.T0(h12.f117303i);
        int i12 = h12.f117305k;
        if (i12 == 1) {
            yVar.h0();
            yVar.Mi(false);
        } else {
            yVar.o9(i12);
            yVar.Mi(true);
        }
        CharParameter.AutoBeautification autoBeautification = h12.f117318x;
        CharParameter.AutoDescription autoDescription = h12.f117317w;
        boolean z12 = (autoDescription == null && autoBeautification == null) ? false : true;
        yVar.q2(false);
        if (z12) {
            g gVar = new g(1, this.f105748m, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            LlmDescriptionPresenter llmDescriptionPresenter = this.f105743h;
            llmDescriptionPresenter.b(gVar);
            llmDescriptionPresenter.f(new h(yVar, h12, yVar, this));
            if (h12.f117312r != null) {
                autoBeautification = null;
            }
            llmDescriptionPresenter.j(autoDescription, autoBeautification);
            yVar.C2(new i(this, h12));
            yVar.y2(new j(this));
            yVar.c2(new k(1, llmDescriptionPresenter, LlmDescriptionPresenter.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0));
        } else {
            yVar.c2(null);
        }
        hJ.m mVar = h12.f117312r;
        if (mVar != null) {
            yVar.gj(mVar.i(this.f105739d));
        } else {
            yVar.gj(h12.f117300f);
        }
        if (h12.f117302h) {
            String str = h12.f117300f;
            if (str == null) {
                str = "";
            }
            this.f105746k.accept(new D(h12.f117181b, str));
        }
        Boolean bool = h12.f117316v;
        yVar.M2(bool != null ? bool.booleanValue() : true);
        yVar.n2(new l(this));
        yVar.h(h12.f117319y);
        CharSequence text = yVar.getText();
        com.avito.android.blueprints.publish.html_editor.g.c(yVar, text instanceof Spannable ? (Spannable) text : null, mVar, h12, this.f105739d, this.f105754s, this.f105740e, this.f105744i, this.f105741f, this.f105742g.y().invoke().booleanValue() ? h12.f117315u : true, new m(this, yVar, h12), new n(this, h12));
        yVar.oN(new o(this, yVar, h12));
        yVar.EM(new e(this, yVar, h12));
        yVar.t(new f(yVar));
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((y) eVar, (ParameterElement.H) aVar);
    }

    @Override // com.avito.android.blueprint.suggest.InterfaceC28874c, com.avito.android.validation.j1
    public final io.reactivex.rxjava3.core.z<com.avito.android.items.a> b() {
        return this.f105749n;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        y yVar = (y) eVar;
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
            O(yVar, h12);
            return;
        }
        yVar.Yw(null, true);
        yVar.t1(null);
        hJ.m mVar = h12.f117312r;
        com.avito.android.blueprints.publish.html_editor.g.b(yVar);
        yVar.a60(V(h12));
        if (mVar == null) {
            String str = c35798g3.f318882b;
            if (str != null && h12.f117317w != null) {
                yVar.f8(str);
            }
        } else {
            hJ.m mVar2 = c35798g3.f318883c;
            if (mVar2 != null) {
                CharSequence text = yVar.getText();
                int selectionStart = Selection.getSelectionStart(text);
                int selectionEnd = Selection.getSelectionEnd(text);
                yVar.gj(mVar2.i(this.f105739d));
                CharSequence text2 = yVar.getText();
                Spannable spannable = text2 instanceof Spannable ? (Spannable) text2 : null;
                if (spannable != null) {
                    Selection.setSelection(spannable, kotlin.ranges.s.g(selectionStart, 0, spannable.length()), kotlin.ranges.s.g(selectionEnd, 0, spannable.length()));
                }
            }
        }
        yVar.wE(yVar);
        CharSequence text3 = yVar.getText();
        com.avito.android.blueprints.publish.html_editor.g.c(yVar, text3 instanceof Spannable ? (Spannable) text3 : null, h12.f117312r, h12, this.f105739d, this.f105754s, this.f105740e, this.f105744i, this.f105741f, this.f105742g.y().invoke().booleanValue() ? h12.f117315u : true, new p(this, yVar, h12), new q(this, h12));
        yVar.oN(new r(this, yVar, h12));
        yVar.EM(new s(this, yVar, h12));
        yVar.t(new t(yVar));
    }

    @Override // com.avito.android.blueprint.suggest.InterfaceC28874c
    public final io.reactivex.rxjava3.core.z<Q<Boolean, com.avito.android.items.a>> n() {
        return this.f105750o;
    }

    @Override // com.avito.android.blueprint.suggest.InterfaceC28874c
    public final io.reactivex.rxjava3.core.z r() {
        return this.f105752q;
    }
}
