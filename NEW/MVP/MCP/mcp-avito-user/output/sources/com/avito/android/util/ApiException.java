package com.avito.android.util;

import com.avito.android.remote.error.ApiError;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/ApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ApiException extends Exception {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ApiError f318522b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f318523c;

    /* compiled from: ApiException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/ApiException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ApiException.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return ApiException.this.f318522b.getF244063c();
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ ApiException(ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
        this(apiError, (i12 & 2) != 0 ? null : th2);
    }

    public final boolean equals(@Y61.l Object obj) {
        ApiException apiException = obj instanceof ApiException ? (ApiException) obj : null;
        return kotlin.jvm.internal.L.f(apiException != null ? apiException.f318522b : null, this.f318522b);
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return (String) this.f318523c.getValue();
    }

    public final int hashCode() {
        return this.f318522b.hashCode();
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String toString() {
        return "ApiException(" + this.f318522b + ").cause=" + getCause();
    }

    public ApiException(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
        super(th2);
        this.f318522b = apiError;
        this.f318523c = C42727D.c(new b());
    }
}
