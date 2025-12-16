package com.avito.android.blueprint.input;

import Hj.C13996a;
import android.text.Selection;
import android.text.Spannable;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.util.C35798g3;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishInputPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/input/o;", "Lcom/avito/android/blueprint/input/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final hJ.h f105536b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final HtmlEditorViewModel f105537c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f105538d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Q1 f105539e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LlmDescriptionPresenter f105540f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f105541g;

    /* renamed from: h, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f105542h;

    /* renamed from: i, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> f105543i;

    /* renamed from: j, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<G0> f105544j;

    /* renamed from: k, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> f105545k;

    /* renamed from: l, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f105546l;

    /* renamed from: m, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f105547m;

    /* renamed from: n, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> f105548n;

    /* renamed from: o, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<G0> f105549o;

    /* renamed from: p, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> f105550p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.blueprints.publish.html_editor.e f105551q;

    /* compiled from: PublishInputPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.items.d f105553m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.items.d dVar) {
            super(0);
            this.f105553m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            o.this.f105543i.accept(this.f105553m);
            return G0.f406611a;
        }
    }

    @Inject
    public o(@Y61.k hJ.h hVar, @Y61.l HtmlEditorViewModel htmlEditorViewModel, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Q1 q12, @Y61.k LlmDescriptionPresenter llmDescriptionPresenter) {
        this.f105536b = hVar;
        this.f105537c = htmlEditorViewModel;
        this.f105538d = interfaceC28373a;
        this.f105539e = q12;
        this.f105540f = llmDescriptionPresenter;
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105541g = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105542h = cVar2;
        com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105543i = cVar3;
        com.jakewharton.rxrelay3.c<G0> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f105544j = cVar4;
        com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f105545k = cVar5;
        this.f105546l = cVar;
        this.f105547m = cVar2;
        this.f105548n = cVar3;
        this.f105549o = cVar4;
        this.f105550p = cVar5;
        this.f105551q = new com.avito.android.blueprints.publish.html_editor.e();
    }

    @Override // com.avito.android.blueprint.input.c
    /* renamed from: C, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF105550p() {
        return this.f105550p;
    }

    @Override // com.avito.android.blueprint.input.c
    /* renamed from: G, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF105548n() {
        return this.f105548n;
    }

    public final C13996a O(com.avito.android.items.d dVar) {
        String f117480e = dVar.getF117480e();
        boolean f117494s = dVar.getF117494s();
        boolean f173938m = dVar.getF173938m();
        DisplayingOptions f117489n = dVar.getF117489n();
        return new C13996a(f117480e, dVar.getF173931f(), f117494s, f173938m, f117489n != null ? f117489n.getSubTitle() : null, null, dVar.getF117488m() != null ? new a(dVar) : null, dVar.getF173932g(), null, 288, null);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((s) eVar, (com.avito.android.items.d) aVar);
    }

    @Override // com.avito.android.blueprint.input.c
    public final z b() {
        return this.f105546l;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        s sVar = (s) eVar;
        com.avito.android.items.d dVar = (com.avito.android.items.d) aVar;
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
            k(sVar, dVar);
            return;
        }
        sVar.a60(O(dVar));
        com.avito.android.blueprints.publish.html_editor.g.b(sVar);
        String str = c35798g3.f318885e;
        if (str != null) {
            sVar.T2(str);
            sVar.gj(null);
        }
        hJ.m f117495t = dVar.getF117495t();
        CharSequence text = sVar.getText();
        int selectionStart = Selection.getSelectionStart(text);
        int selectionEnd = Selection.getSelectionEnd(text);
        if (f117495t == null) {
            String str2 = c35798g3.f318882b;
            if (str2 != null) {
                sVar.he(str2);
            }
        } else {
            hJ.m mVar = c35798g3.f318883c;
            if (mVar != null) {
                sVar.gj(mVar.i(this.f105536b));
            }
        }
        CharSequence text2 = sVar.getText();
        Spannable spannable = text2 instanceof Spannable ? (Spannable) text2 : null;
        if (spannable != null) {
            Selection.setSelection(spannable, kotlin.ranges.s.g(selectionStart, 0, spannable.length()), kotlin.ranges.s.g(selectionEnd, 0, spannable.length()));
        }
        com.avito.android.blueprints.publish.html_editor.g.c(sVar, spannable, f117495t, dVar, this.f105536b, this.f105551q, this.f105537c, this.f105541g, this.f105538d, this.f105539e.y().invoke().booleanValue() ? dVar.getF117476D() : true, new m(this, dVar), new n(this, dVar));
    }

    public final void k(@Y61.k s sVar, @Y61.k com.avito.android.items.d dVar) {
        DisplayingOptions f117489n;
        Integer length;
        Boolean enabled;
        String postfix;
        String prefix;
        sVar.Yw(null, true);
        sVar.m7();
        sVar.a60(O(dVar));
        sVar.o(dVar.getF117490o());
        sVar.x5(dVar.getF117485j());
        sVar.T2(dVar.getF117486k());
        DisplayingOptions f117489n2 = dVar.getF117489n();
        if (f117489n2 != null && (prefix = f117489n2.getPrefix()) != null) {
            sVar.x5(prefix);
        }
        DisplayingOptions f117489n3 = dVar.getF117489n();
        if (f117489n3 != null && (postfix = f117489n3.getPostfix()) != null) {
            sVar.T2(postfix);
        }
        sVar.gj(null);
        sVar.T0(dVar.getF117493r());
        DisplayingOptions f117489n4 = dVar.getF117489n();
        if (f117489n4 != null && (enabled = f117489n4.getEnabled()) != null) {
            sVar.setEnabled(enabled.booleanValue());
        }
        sVar.M2(true);
        sVar.n2(new g(this));
        int iIntValue = Integer.MAX_VALUE;
        if (dVar.getF117484i() > 1) {
            sVar.J1(dVar.getF117484i(), Integer.MAX_VALUE);
            sVar.Ga(false);
        } else {
            sVar.h0();
            sVar.Ga(true);
        }
        FormatterType f117493r = dVar.getF117493r();
        FormatterType.f179288e.getClass();
        if (L.f(f117493r, FormatterType.a.c())) {
            iIntValue = 12;
        } else {
            DisplayingOptions f117489n5 = dVar.getF117489n();
            if ((f117489n5 != null ? f117489n5.getLength() : null) != null && (f117489n = dVar.getF117489n()) != null && (length = f117489n.getLength()) != null) {
                iIntValue = length.intValue();
            }
        }
        sVar.I0(iIntValue);
        boolean z12 = (dVar.getF117500y() == null && dVar.getF117501z() == null) ? false : true;
        sVar.q2(false);
        if (z12) {
            h hVar = new h(1, this.f105545k, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            LlmDescriptionPresenter llmDescriptionPresenter = this.f105540f;
            llmDescriptionPresenter.b(hVar);
            llmDescriptionPresenter.f(new i(sVar, dVar, sVar, this));
            llmDescriptionPresenter.j(dVar.getF117500y(), dVar.getF117495t() == null ? dVar.getF117501z() : null);
            sVar.C2(new j(this, dVar));
            sVar.y2(new k(this));
            sVar.c2(new l(1, llmDescriptionPresenter, LlmDescriptionPresenter.class, "onTextChanged", "onTextChanged(Ljava/lang/String;)V", 0));
        } else {
            sVar.c2(null);
        }
        hJ.m f117495t = dVar.getF117495t();
        if (f117495t != null) {
            sVar.gj(f117495t.i(this.f105536b));
        } else {
            sVar.gj(dVar.getF117481f());
        }
        DisplayingOptions f117489n6 = dVar.getF117489n();
        sVar.k0(f117489n6 != null ? f117489n6.getCustomPaddings() : null);
        CharSequence text = sVar.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        com.avito.android.blueprints.publish.html_editor.g.c(sVar, spannable, f117495t, dVar, this.f105536b, this.f105551q, this.f105537c, this.f105541g, this.f105538d, this.f105539e.y().invoke().booleanValue() ? dVar.getF117476D() : true, new e(this, dVar), new f(this, dVar));
        sVar.h(dVar.getF117477E());
    }

    @Override // com.avito.android.blueprint.input.c
    public final z n() {
        return this.f105547m;
    }

    @Override // com.avito.android.blueprint.input.c
    public final z r() {
        return this.f105549o;
    }
}
