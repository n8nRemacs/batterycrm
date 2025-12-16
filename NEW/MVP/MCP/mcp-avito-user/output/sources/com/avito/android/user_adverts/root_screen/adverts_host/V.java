package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: UserAdvertsHostView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/V;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface V {

    /* compiled from: UserAdvertsHostView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(V v12, String str, ApiError apiError, int i12) {
            if ((i12 & 2) != 0) {
                apiError = null;
            }
            v12.a(str, apiError, (i12 & 8) != 0 ? 2750 : -1);
        }
    }

    void a(@Y61.k String str, @Y61.l ApiError apiError, int i12);
}
