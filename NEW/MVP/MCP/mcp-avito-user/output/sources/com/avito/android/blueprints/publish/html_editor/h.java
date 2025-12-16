package com.avito.android.blueprints.publish.html_editor;

import android.text.Selection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HtmlEditorItemViewExtensions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f106266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.f f106267m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f106268n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ HtmlEditorViewModel f106269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, com.avito.android.items.f fVar, f fVar2, HtmlEditorViewModel htmlEditorViewModel) {
        super(0);
        this.f106266l = eVar;
        this.f106267m = fVar;
        this.f106268n = fVar2;
        this.f106269o = htmlEditorViewModel;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f106266l;
        com.avito.android.html_editor.c cVar = eVar.f106261b;
        cVar.f164131b = true;
        if (cVar.f164132c instanceof hJ.d) {
            String f117481f = this.f106267m.getF117481f();
            if (f117481f != null) {
                CharSequence text = this.f106268n.getText();
                this.f106269o.y7(new com.avito.android.html_editor.d(f117481f, Selection.getSelectionStart(text), Selection.getSelectionEnd(text)), true);
            }
            eVar.f106261b.f164132c = null;
        }
        return G0.f406611a;
    }
}
