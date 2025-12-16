package com.avito.android.api;

import com.avito.android.remote.error.ApiError;
import com.avito.android.retrofit.C34409a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/retrofit/a;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/retrofit/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.l<C34409a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f91317l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(1);
        this.f91317l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(C34409a c34409a) {
        C34409a c34409a2 = c34409a;
        ApiError apiError = c34409a2.f255120a;
        boolean z12 = apiError instanceof com.avito.android.remote.error.s;
        k kVar = this.f91317l;
        String str = c34409a2.f255121b;
        if (z12) {
            k.a(kVar, apiError, str, new e(kVar, apiError));
        } else if (apiError instanceof com.avito.android.remote.error.p) {
            k.a(kVar, apiError, str, new f(kVar, apiError));
        } else if (apiError instanceof ApiError.CertificatePinningError) {
            k.a(kVar, apiError, str, new g(kVar, apiError));
        }
        return G0.f406611a;
    }
}
