package com.esiasdk.android.esiaLoginClient;

import Y61.k;
import com.esiasdk.android.EsiaErrorResponse;
import kotlin.Metadata;

/* compiled from: EsiaLoginCallback.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/b;", "", "a", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: EsiaLoginCallback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/b$a;", "", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    void a(@k EsiaErrorResponse esiaErrorResponse);

    void b(@k TokenParameters tokenParameters);

    void c(@k EsiaErrorResponse esiaErrorResponse);
}
