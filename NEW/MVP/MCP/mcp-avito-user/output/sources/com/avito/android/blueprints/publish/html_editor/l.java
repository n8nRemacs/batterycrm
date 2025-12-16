package com.avito.android.blueprints.publish.html_editor;

import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HtmlEditorItemViewExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFocused", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f106280l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HtmlEditorViewModel f106281m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.f f106282n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Y41.l<? super Boolean, G0> lVar, HtmlEditorViewModel htmlEditorViewModel, com.avito.android.items.f fVar) {
        super(1);
        this.f106280l = (N) lVar;
        this.f106281m = htmlEditorViewModel;
        this.f106282n = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        this.f106280l.invoke(bool2);
        HtmlEditorViewModel htmlEditorViewModel = this.f106281m;
        if (zBooleanValue) {
            htmlEditorViewModel.e2(new HtmlEditorViewModel.c.b(this.f106282n.getF100641b()));
        } else {
            htmlEditorViewModel.e2(HtmlEditorViewModel.c.a.f106244a);
        }
        return G0.f406611a;
    }
}
