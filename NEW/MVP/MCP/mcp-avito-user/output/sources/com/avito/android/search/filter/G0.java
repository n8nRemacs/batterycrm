package com.avito.android.search.filter;

import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class G0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261863b;

    public G0(C34574h0 c34574h0) {
        this.f261863b = c34574h0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        C34574h0 c34574h0 = this.f261863b;
        c34574h0.f263341i.a();
        com.avito.android.search.filter.tracker.a aVar = c34574h0.f263340h;
        aVar.i(th2);
        aVar.j();
        k1 k1Var = c34574h0.f263315M;
        if (k1Var != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = th2.toString();
            }
            k1Var.g(new ApiError.Failure(message));
        }
        aVar.g(th2);
    }
}
