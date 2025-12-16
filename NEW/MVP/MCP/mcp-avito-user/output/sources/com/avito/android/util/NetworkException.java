package com.avito.android.util;

import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkException.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/NetworkException;", "Lcom/avito/android/util/ApiException;", "a", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class NetworkException extends ApiException {
    private static final long serialVersionUID = 2;

    /* compiled from: NetworkException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/NetworkException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public NetworkException(ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
        super(apiError, (i12 & 2) != 0 ? null : th2);
    }

    public NetworkException(Throwable th2, int i12, C42822w c42822w) {
        this(null, (i12 & 1) != 0 ? null : th2);
    }

    public /* synthetic */ NetworkException(String str, Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkException(@Y61.l String str, @Y61.l Throwable th2) {
        if (str == null) {
            str = th2 != null ? th2.getMessage() : null;
            if (str == null) {
                str = "";
            }
        }
        super(new ApiError.NetworkIOError(str), th2);
    }
}
