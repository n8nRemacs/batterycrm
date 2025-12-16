package com.avito.android.blueprints.publish.html_editor;

import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import androidx.compose.runtime.internal.P;
import com.avito.android.html_editor.f;
import com.avito.android.html_formatter.FormatChange;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FormatObserver.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/d;", "Ll41/g;", "Lcom/avito/android/html_formatter/FormatChange;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements l41.g<FormatChange> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f106253b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.items.f f106254c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.html_editor.g f106255d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final N f106256e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l41.g<com.avito.android.items.a> f106257f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HtmlEditorViewModel f106258g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f106259h;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k f fVar, @Y61.k com.avito.android.items.f fVar2, @Y61.k com.avito.android.html_editor.g gVar, @Y61.k Y41.p pVar, @Y61.k l41.g gVar2, @Y61.k HtmlEditorViewModel htmlEditorViewModel, @Y61.k Y41.a aVar) {
        this.f106253b = fVar;
        this.f106254c = fVar2;
        this.f106255d = gVar;
        this.f106256e = (N) pVar;
        this.f106257f = gVar2;
        this.f106258g = htmlEditorViewModel;
        this.f106259h = aVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // l41.g
    public final void accept(FormatChange formatChange) {
        FormatChange formatChange2 = formatChange;
        Y41.a<G0> aVar = this.f106259h;
        ((n) aVar).invoke();
        com.avito.android.items.f fVar = this.f106254c;
        hJ.m f117495t = fVar.getF117495t();
        if (f117495t == null) {
            return;
        }
        f fVar2 = this.f106253b;
        CharSequence text = fVar2.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        int selectionStart = Selection.getSelectionStart(spanned);
        int selectionEnd = Selection.getSelectionEnd(spanned);
        int iMin = Math.min(selectionStart, selectionEnd);
        int iMax = Math.max(selectionStart, selectionEnd);
        hJ.d dVar = new hJ.d(iMin, iMax, formatChange2);
        com.avito.android.html_editor.g gVar = this.f106255d;
        f.a aVarC = gVar.c(f117495t, spanned, Collections.singletonList(dVar));
        o oVar = new o(iMin, iMax, gVar, this.f106258g);
        fVar2.m7();
        fVar2.mr(null);
        fVar2.gj(aVarC.f164137b);
        fVar.m(aVarC.f164136a);
        this.f106257f.accept(fVar);
        fVar2.mr(new c(3, oVar, o.class, "onSelectionChanged", "onSelectionChanged(Ljava/lang/CharSequence;II)V", 0));
        com.avito.android.html_editor.j jVar = new com.avito.android.html_editor.j();
        ?? r72 = this.f106256e;
        f fVar3 = this.f106253b;
        fVar3.MF(new p(fVar3, f117495t, jVar, gVar, r72, aVar, oVar));
        CharSequence text2 = fVar2.getText();
        Spannable spannable = text2 instanceof Spannable ? (Spannable) text2 : null;
        if (spannable == null) {
            return;
        }
        int i12 = aVarC.f164138c;
        if (selectionStart == selectionEnd) {
            Selection.setSelection(spannable, kotlin.ranges.s.g(selectionStart + i12, 0, spannable.length()), kotlin.ranges.s.g(selectionEnd + i12, 0, spannable.length()));
        } else {
            Selection.setSelection(spannable, kotlin.ranges.s.g(selectionStart, 0, spannable.length()), kotlin.ranges.s.g(selectionEnd + i12, 0, spannable.length()));
        }
    }
}
