package com.avito.android.select.bottom_sheet.blueprints.group;

import dq0.InterfaceC39781c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectableGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f265112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f265113m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, a aVar) {
        super(0);
        this.f265112l = qVar;
        this.f265113m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        q qVar = this.f265112l;
        com.jakewharton.rxrelay3.c<a> cVar = qVar.f265124d;
        a aVar = this.f265113m;
        cVar.accept(aVar);
        Y41.l<InterfaceC39781c, G0> lVar = qVar.f265122b;
        if (lVar != null) {
            lVar.invoke(new InterfaceC39781c.d(aVar));
        }
        return G0.f406611a;
    }
}
