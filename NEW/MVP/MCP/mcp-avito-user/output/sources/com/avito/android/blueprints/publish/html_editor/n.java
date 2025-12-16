package com.avito.android.blueprints.publish.html_editor;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HtmlEditorItemViewExtensions.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HtmlEditorViewModel f106284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f106285m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(HtmlEditorViewModel htmlEditorViewModel, e eVar) {
        super(0);
        this.f106284l = htmlEditorViewModel;
        this.f106285m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        if (this.f106284l.n2()) {
            com.avito.android.html_editor.c cVar = this.f106285m.f106261b;
            cVar.f164131b = false;
            cVar.f164132c = null;
        }
        return G0.f406611a;
    }
}
