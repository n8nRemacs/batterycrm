package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "error", "", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class I<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119417b;

    public I(T t12) {
        this.f119417b = t12;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        Throwable th2 = (Throwable) obj;
        T t12 = this.f119417b;
        t12.getClass();
        if (th2 instanceof ApiException) {
            ApiError apiError = ((ApiException) th2).f318522b;
            if (apiError instanceof ApiError.BadRequest) {
                f0 f0Var = t12.f119452m;
                if (f0Var == null) {
                    return true;
                }
                f0Var.g(apiError, ((ApiError.BadRequest) apiError).getF244063c());
                return true;
            }
        }
        f0 f0Var2 = t12.f119452m;
        if (f0Var2 == null) {
            return true;
        }
        f0Var2.g(null, t12.f119448i.c(th2));
        return true;
    }
}
