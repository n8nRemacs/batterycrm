package com.avito.android.blueprints.publish.html_editor;

import android.text.Selection;
import android.text.Spannable;
import com.avito.android.analytics.InterfaceC28373a;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HtmlEditorItemViewExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_publish-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    /* compiled from: HtmlEditorItemViewExtensions.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<G0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f106262l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.items.f f106263m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ HtmlEditorViewModel f106264n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, com.avito.android.items.f fVar2, HtmlEditorViewModel htmlEditorViewModel) {
            super(1);
            this.f106262l = fVar;
            this.f106263m = fVar2;
            this.f106264n = htmlEditorViewModel;
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            CharSequence text = this.f106262l.getText();
            String f117481f = this.f106263m.getF117481f();
            if (f117481f != null) {
                this.f106264n.y7(new com.avito.android.html_editor.d(f117481f, Selection.getSelectionStart(text), Selection.getSelectionEnd(text)), false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HtmlEditorItemViewExtensions.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f106265l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.p<? super CharSequence, ? super String, G0> pVar) {
            super(1);
            this.f106265l = (N) pVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            this.f106265l.invoke(str2, str2);
            return G0.f406611a;
        }
    }

    public static final void a(f fVar, io.reactivex.rxjava3.disposables.c cVar, HtmlEditorViewModel htmlEditorViewModel, com.avito.android.items.f fVar2, com.avito.android.html_editor.g gVar, Y41.p<? super CharSequence, ? super String, G0> pVar, l41.g<com.avito.android.items.a> gVar2, Y41.a<G0> aVar) {
        cVar.e();
        cVar.b(htmlEditorViewModel.v7(fVar2.getF145224b()).t0(new d(fVar, fVar2, gVar, pVar, gVar2, htmlEditorViewModel, aVar)));
        cVar.b(htmlEditorViewModel.Fa(fVar2.getF145224b()).t0(new com.avito.android.blueprints.publish.html_editor.b(fVar, fVar2, gVar, pVar, gVar2, htmlEditorViewModel, aVar)));
        cVar.b(htmlEditorViewModel.R9(fVar2.getF145224b()).t0(new com.avito.android.api.a(14, new a(fVar, fVar2, htmlEditorViewModel))));
    }

    public static final void b(@Y61.k f fVar) {
        fVar.Yw(null, true);
        fVar.m7();
        fVar.mr(null);
        fVar.HI(null);
    }

    public static final void c(@Y61.k f fVar, @Y61.l Spannable spannable, @Y61.l hJ.m mVar, @Y61.k com.avito.android.items.f fVar2, @Y61.k hJ.h hVar, @Y61.k e eVar, @Y61.l HtmlEditorViewModel htmlEditorViewModel, @Y61.k l41.g<com.avito.android.items.a> gVar, @Y61.k InterfaceC28373a interfaceC28373a, boolean z12, @Y61.k Y41.l<? super Boolean, G0> lVar, @Y61.k Y41.p<? super CharSequence, ? super String, G0> pVar) {
        String f73059c = fVar2.getF145224b();
        LinkedHashMap linkedHashMap = eVar.f106260a;
        Object cVar = linkedHashMap.get(f73059c);
        if (cVar == null) {
            cVar = new io.reactivex.rxjava3.disposables.c();
            linkedHashMap.put(f73059c, cVar);
        }
        ((io.reactivex.rxjava3.disposables.c) cVar).e();
        if (mVar == null || htmlEditorViewModel == null) {
            fVar.mr(null);
            fVar.t1(lVar);
            fVar.Yw(new b(pVar), z12);
            return;
        }
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int iMin = Math.min(selectionStart, selectionEnd);
        int iMax = Math.max(selectionStart, selectionEnd);
        String f73059c2 = fVar2.getF145224b();
        LinkedHashMap linkedHashMap2 = eVar.f106260a;
        Object cVar2 = linkedHashMap2.get(f73059c2);
        if (cVar2 == null) {
            cVar2 = new io.reactivex.rxjava3.disposables.c();
            linkedHashMap2.put(f73059c2, cVar2);
        }
        io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) cVar2;
        fVar.HI(new h(eVar, fVar2, fVar, htmlEditorViewModel));
        n nVar = new n(htmlEditorViewModel, eVar);
        com.avito.android.html_editor.g gVar2 = new com.avito.android.html_editor.g(new com.avito.android.html_editor.n(), hVar, eVar.f106261b, interfaceC28373a, new m(htmlEditorViewModel));
        o oVar = new o(iMin, iMax, gVar2, htmlEditorViewModel);
        fVar.mr(new i(3, oVar, o.class, "onSelectionChanged", "onSelectionChanged(Ljava/lang/CharSequence;II)V", 0));
        fVar.MF(new p(fVar, mVar, new com.avito.android.html_editor.j(), gVar2, pVar, nVar, oVar));
        a(fVar, cVar3, htmlEditorViewModel, fVar2, gVar2, pVar, gVar, nVar);
        fVar.oN(new j(fVar, cVar3, htmlEditorViewModel, fVar2, gVar2, pVar, gVar, nVar));
        fVar.EM(new k(eVar, fVar2));
        fVar.t1(new l(lVar, htmlEditorViewModel, fVar2));
    }
}
