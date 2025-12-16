package com.avito.android.blueprints.publish.html_editor;

import android.text.Selection;
import android.text.Spannable;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FormatHistoryNavigationObserver.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/b;", "Ll41/g;", "Lcom/avito/android/html_editor/r;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements l41.g<com.avito.android.html_editor.r> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f106246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.items.f f106247c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.g f106248d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final N f106249e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l41.g<com.avito.android.items.a> f106250f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HtmlEditorViewModel f106251g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f106252h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k f fVar, @Y61.k com.avito.android.items.f fVar2, @Y61.k com.avito.android.html_editor.g gVar, @Y61.k Y41.p pVar, @Y61.k l41.g gVar2, @Y61.k HtmlEditorViewModel htmlEditorViewModel, @Y61.k Y41.a aVar) {
        this.f106246b = fVar;
        this.f106247c = fVar2;
        this.f106248d = gVar;
        this.f106249e = (N) pVar;
        this.f106250f = gVar2;
        this.f106251g = htmlEditorViewModel;
        this.f106252h = aVar;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // l41.g
    public final void accept(com.avito.android.html_editor.r rVar) {
        com.avito.android.html_editor.r rVar2 = rVar;
        f fVar = this.f106246b;
        fVar.m7();
        fVar.mr(null);
        String str = rVar2.f164133a;
        com.avito.android.items.f fVar2 = this.f106247c;
        fVar2.m(str);
        hJ.m mVar = rVar2.f164157e;
        fVar2.z1(mVar);
        fVar.gj(rVar2.f164156d);
        com.avito.android.html_editor.g gVar = this.f106248d;
        HtmlEditorViewModel htmlEditorViewModel = this.f106251g;
        int i12 = rVar2.f164134b;
        int i13 = rVar2.f164135c;
        o oVar = new o(i12, i13, gVar, htmlEditorViewModel);
        fVar.mr(new a(3, oVar, o.class, "onSelectionChanged", "onSelectionChanged(Ljava/lang/CharSequence;II)V", 0));
        com.avito.android.html_editor.j jVar = new com.avito.android.html_editor.j();
        ?? r112 = this.f106249e;
        Y41.a<G0> aVar = this.f106252h;
        f fVar3 = this.f106246b;
        fVar3.MF(new p(fVar3, mVar, jVar, gVar, r112, aVar, oVar));
        CharSequence text = fVar.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        Selection.setSelection(spannable, kotlin.ranges.s.g(i12, 0, spannable.length()), kotlin.ranges.s.g(i13, 0, spannable.length()));
        this.f106250f.accept(fVar2);
    }
}
