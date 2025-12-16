package com.avito.android.location_list;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: LocationListPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class V<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f181895b;

    public V(a0 a0Var) {
        this.f181895b = a0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        String message = th2.getMessage();
        a0 a0Var = this.f181895b;
        a0Var.f181917q.f(null, message);
        k0 k0Var = a0Var.f181920t;
        if (k0Var != null) {
            k0Var.d();
        }
        V2.f318762a.f(th2);
    }
}
