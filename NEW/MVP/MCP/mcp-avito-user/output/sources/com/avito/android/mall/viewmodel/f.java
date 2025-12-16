package com.avito.android.mall.viewmodel;

import LX.b;
import kotlin.Metadata;

/* compiled from: MallViewModelImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLX/b;", "it", "Lkotlin/G0;", "accept", "(LLX/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f184376b;

    public f(g gVar) {
        this.f184376b = gVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LX.b bVar = (LX.b) obj;
        boolean z12 = bVar instanceof b.a;
        g gVar = this.f184376b;
        if (z12) {
            gVar.getClass();
            gVar.f184382N.c((HP0.b) gVar.f184383O.d(HP0.b.class, ((b.a) bVar).f9971a));
            return;
        }
        if (bVar instanceof b.C0616b) {
            gVar.getClass();
            gVar.f184377E.c(gVar.f184381M.b(((b.C0616b) bVar).f9972a));
        }
    }
}
