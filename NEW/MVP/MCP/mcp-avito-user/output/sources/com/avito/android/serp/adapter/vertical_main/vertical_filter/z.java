package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;

/* compiled from: VerticalFilterPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f273653b;

    public z(v vVar) {
        this.f273653b = vVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.avito.android.serp.adapter.vertical_main.vertical_filter.J, java.lang.Object] */
    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        v vVar = this.f273653b;
        ?? r12 = vVar.f273577C;
        if (r12 != 0) {
            r12.Of(null, false);
        }
        V2.f318762a.a("VerticalFilterPresenterImpl", "load search form filter error", th2);
        vVar.f273621u.accept(th2);
        C43259k.d(vVar.f273575A, null, null, new y(vVar, th2, null), 3);
    }
}
