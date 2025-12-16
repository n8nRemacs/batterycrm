package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.Interceptor;

/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z12) {
        this.forWebSocket = z12;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd A[Catch: IOException -> 0x00b0, TryCatch #3 {IOException -> 0x00b0, blocks: (B:39:0x00a5, B:41:0x00ab, B:44:0x00b3, B:46:0x00dd, B:48:0x00e3, B:49:0x00e6, B:50:0x010a, B:54:0x0115, B:56:0x0134, B:58:0x0142, B:65:0x0158, B:67:0x015e, B:71:0x016b, B:73:0x0180, B:74:0x0188, B:75:0x0192, B:60:0x014d, B:55:0x0124), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124 A[Catch: IOException -> 0x00b0, TryCatch #3 {IOException -> 0x00b0, blocks: (B:39:0x00a5, B:41:0x00ab, B:44:0x00b3, B:46:0x00dd, B:48:0x00e3, B:49:0x00e6, B:50:0x010a, B:54:0x0115, B:56:0x0134, B:58:0x0142, B:65:0x0158, B:67:0x015e, B:71:0x016b, B:73:0x0180, B:74:0x0188, B:75:0x0192, B:60:0x014d, B:55:0x0124), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d A[Catch: IOException -> 0x00b0, TryCatch #3 {IOException -> 0x00b0, blocks: (B:39:0x00a5, B:41:0x00ab, B:44:0x00b3, B:46:0x00dd, B:48:0x00e3, B:49:0x00e6, B:50:0x010a, B:54:0x0115, B:56:0x0134, B:58:0x0142, B:65:0x0158, B:67:0x015e, B:71:0x016b, B:73:0x0180, B:74:0x0188, B:75:0x0192, B:60:0x014d, B:55:0x0124), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158 A[Catch: IOException -> 0x00b0, TryCatch #3 {IOException -> 0x00b0, blocks: (B:39:0x00a5, B:41:0x00ab, B:44:0x00b3, B:46:0x00dd, B:48:0x00e3, B:49:0x00e6, B:50:0x010a, B:54:0x0115, B:56:0x0134, B:58:0x0142, B:65:0x0158, B:67:0x015e, B:71:0x016b, B:73:0x0180, B:74:0x0188, B:75:0x0192, B:60:0x014d, B:55:0x0124), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e A[Catch: IOException -> 0x00b0, TryCatch #3 {IOException -> 0x00b0, blocks: (B:39:0x00a5, B:41:0x00ab, B:44:0x00b3, B:46:0x00dd, B:48:0x00e3, B:49:0x00e6, B:50:0x010a, B:54:0x0115, B:56:0x0134, B:58:0x0142, B:65:0x0158, B:67:0x015e, B:71:0x016b, B:73:0x0180, B:74:0x0188, B:75:0x0192, B:60:0x014d, B:55:0x0124), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b A[Catch: IOException -> 0x00b0, TryCatch #3 {IOException -> 0x00b0, blocks: (B:39:0x00a5, B:41:0x00ab, B:44:0x00b3, B:46:0x00dd, B:48:0x00e3, B:49:0x00e6, B:50:0x010a, B:54:0x0115, B:56:0x0134, B:58:0x0142, B:65:0x0158, B:67:0x015e, B:71:0x016b, B:73:0x0180, B:74:0x0188, B:75:0x0192, B:60:0x014d, B:55:0x0124), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(@Y61.k okhttp3.Interceptor.Chain r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
