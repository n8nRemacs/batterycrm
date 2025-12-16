package com.avito.android.blueprints.input;

import android.text.Selection;
import android.text.Spannable;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.input.z;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.items.ItemWithState;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.remote.model.category_parameters.ParamButton;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35798g3;
import com.avito.android.util.InterfaceC35807h4;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateInputItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/input/e;", "Lcom/avito/android/blueprints/input/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f105944b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final hJ.h f105945c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final HtmlEditorViewModel f105946d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f105947e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35807h4 f105948f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q1 f105949g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LlmDescriptionPresenter f105950h;

    /* renamed from: i, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.a> f105951i;

    /* renamed from: j, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> f105952j;

    /* renamed from: k, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> f105953k;

    /* renamed from: l, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<G0> f105954l;

    /* renamed from: m, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> f105955m;

    /* renamed from: n, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105956n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f105957o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105958p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105959q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105960r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105961s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105962t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f105963u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.blueprints.publish.html_editor.e f105964v;

    /* compiled from: MultiStateInputItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105965a;

        static {
            int[] iArr = new int[ParamButton.Position.values().length];
            try {
                iArr[ParamButton.Position.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParamButton.Position.INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105965a = iArr;
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.util.text.a aVar, @Y61.k hJ.h hVar, @Y61.l HtmlEditorViewModel htmlEditorViewModel, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35807h4 interfaceC35807h4, @Y61.k Q1 q12, @Y61.k LlmDescriptionPresenter llmDescriptionPresenter) {
        this.f105944b = aVar;
        this.f105945c = hVar;
        this.f105946d = htmlEditorViewModel;
        this.f105947e = interfaceC28373a;
        this.f105948f = interfaceC35807h4;
        this.f105949g = q12;
        this.f105950h = llmDescriptionPresenter;
        com.jakewharton.rxrelay3.c<com.avito.android.items.a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105951i = cVar;
        com.jakewharton.rxrelay3.c<Q<Boolean, com.avito.android.items.a>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105952j = cVar2;
        com.jakewharton.rxrelay3.c<ItemWithAdditionalButton> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105953k = cVar3;
        com.jakewharton.rxrelay3.c<G0> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f105954l = cVar4;
        com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f105955m = cVar5;
        com.jakewharton.rxrelay3.c<DeepLink> cVar6 = new com.jakewharton.rxrelay3.c<>();
        this.f105956n = cVar6;
        this.f105957o = new io.reactivex.rxjava3.disposables.c();
        this.f105958p = cVar;
        this.f105959q = cVar2;
        this.f105960r = cVar3;
        this.f105961s = cVar4;
        this.f105962t = cVar5;
        this.f105963u = cVar6;
        this.f105964v = new com.avito.android.blueprints.publish.html_editor.e();
    }

    @Override // com.avito.android.blueprints.input.d
    @Y61.k
    /* renamed from: C, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF105962t() {
        return this.f105962t;
    }

    @Override // com.avito.android.blueprints.input.d
    @Y61.k
    /* renamed from: G, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF105960r() {
        return this.f105960r;
    }

    public final void O(z zVar, ItemWithState.State state, AttributedText attributedText) {
        boolean z12 = state instanceof ItemWithState.State.Normal;
        com.avito.android.util.text.a aVar = this.f105944b;
        if (z12) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence != null) {
                charSequenceB = charSequence;
            } else if (attributedText != null) {
                charSequenceB = aVar.b(attributedText);
            }
            zVar.u(charSequenceB);
            return;
        }
        if (state instanceof ItemWithState.State.Warning) {
            z.a.a(zVar, ((ItemWithState.State.Warning) state).f173900b, null, 2);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            zVar.K1(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b, attributedText != null ? aVar.b(attributedText) : null);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            z.a.a(zVar, null, attributedText != null ? aVar.b(attributedText) : null, 1);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((z) eVar, (com.avito.android.items.d) aVar);
    }

    @Override // com.avito.android.blueprints.input.d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<com.avito.android.items.a> b() {
        return this.f105958p;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        z zVar = (z) eVar;
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
            k(zVar, dVar);
            return;
        }
        AttributedText f173932g = c35798g3.f318884d;
        ItemWithState.State f173931f = c35798g3.f318881a;
        if (f173931f != null || f173932g != null) {
            if (f173931f == null) {
                f173931f = dVar.getF173931f();
            }
            if (f173932g == null) {
                f173932g = dVar.getF173932g();
            }
            O(zVar, f173931f, f173932g);
        }
        com.avito.android.blueprints.publish.html_editor.g.b(zVar);
        String str = c35798g3.f318885e;
        if (str != null) {
            zVar.T2(str);
            zVar.gj(null);
        }
        hJ.m f117495t = dVar.getF117495t();
        CharSequence text = zVar.getText();
        int selectionStart = Selection.getSelectionStart(text);
        int selectionEnd = Selection.getSelectionEnd(text);
        if (f117495t == null) {
            String str2 = c35798g3.f318882b;
            if (str2 != null) {
                zVar.he(str2);
            }
        } else {
            hJ.m mVar = c35798g3.f318883c;
            if (mVar != null) {
                zVar.gj(mVar.i(this.f105945c));
            }
        }
        CharSequence text2 = zVar.getText();
        Spannable spannable = text2 instanceof Spannable ? (Spannable) text2 : null;
        if (spannable != null) {
            Selection.setSelection(spannable, kotlin.ranges.s.g(selectionStart, 0, spannable.length()), kotlin.ranges.s.g(selectionEnd, 0, spannable.length()));
        }
        com.avito.android.blueprints.publish.html_editor.g.c(zVar, spannable, f117495t, dVar, this.f105945c, this.f105964v, this.f105946d, this.f105951i, this.f105947e, this.f105949g.y().invoke().booleanValue() ? dVar.getF117476D() : true, new r(this, dVar), new s(this, dVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@Y61.k com.avito.android.blueprints.input.z r30, @Y61.k com.avito.android.items.d r31) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.blueprints.input.e.k(com.avito.android.blueprints.input.z, com.avito.android.items.d):void");
    }

    @Override // com.avito.android.blueprints.input.d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Q<Boolean, com.avito.android.items.a>> n() {
        return this.f105959q;
    }

    @Override // com.avito.android.blueprints.input.d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> r() {
        return this.f105961s;
    }

    @Override // com.avito.android.blueprints.input.d
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> y() {
        return this.f105963u;
    }
}
