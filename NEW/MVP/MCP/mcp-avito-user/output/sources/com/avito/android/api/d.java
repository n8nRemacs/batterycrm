package com.avito.android.api;

import com.avito.android.remote.error.ApiError;
import com.avito.android.retrofit.C34409a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/retrofit/a;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lcom/avito/android/retrofit/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<C34409a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f91310l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(C34409a c34409a) {
        ApiError apiError = c34409a.f255120a;
        return Boolean.valueOf((apiError instanceof com.avito.android.remote.error.s) || (apiError instanceof com.avito.android.remote.error.p) || (apiError instanceof ApiError.CertificatePinningError));
    }
}
