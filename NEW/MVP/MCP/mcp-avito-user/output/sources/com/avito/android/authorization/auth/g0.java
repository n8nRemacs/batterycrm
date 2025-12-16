package com.avito.android.authorization.auth;

import com.avito.android.remote.error.ApiError;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/g0;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g0 {

    /* compiled from: AuthView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(g0 g0Var, String str, ApiError apiError, Throwable th2, int i12) {
            if ((i12 & 2) != 0) {
                apiError = null;
            }
            if ((i12 & 4) != 0) {
                th2 = null;
            }
            g0Var.c(apiError, str, th2);
        }
    }

    void a(@Y61.k String str, @Y61.k com.avito.android.social.button.f fVar, @Y61.k Y41.a<G0> aVar);

    void b();

    void c(@Y61.l ApiError apiError, @Y61.k String str, @Y61.l Throwable th2);

    void d(boolean z12);

    void e();
}
