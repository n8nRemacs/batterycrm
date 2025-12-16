package zl0;

import Y61.k;
import com.avito.android.remote.analytics.y;
import com.squareup.anvil.annotations.ContributesBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RetryRecoverableErrorsInterceptorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lzl0/e;", "Lzl0/d;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50585b f444225b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y f444226c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.quic.performance.a f444227d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.quic.tracking.a f444228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f444229f;

    /* renamed from: g, reason: collision with root package name */
    public final long f444230g;

    /* compiled from: RetryRecoverableErrorsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzl0/e$a;", "", "<init>", "()V", "", "RETRY_TIMEOUT_FOR_TEST", "J", "RETRY_TIMEOUT_REAL", "", "TAG", "Ljava/lang/String;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public e(C50585b c50585b, y yVar, com.avito.android.quic.performance.a aVar, com.avito.android.quic.tracking.a aVar2, int i12, long j12, int i13, C42822w c42822w) {
        i12 = (i13 & 16) != 0 ? 7 : i12;
        j12 = (i13 & 32) != 0 ? 500L : j12;
        this.f444225b = c50585b;
        this.f444226c = yVar;
        this.f444227d = aVar;
        this.f444228e = aVar2;
        this.f444229f = i12;
        this.f444230g = j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    @Override // okhttp3.Interceptor
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(@Y61.k okhttp3.Interceptor.Chain r15) throws java.lang.Throwable {
        /*
            r14 = this;
            com.avito.android.quic.tracking.a r0 = r14.f444228e
            zl0.b r1 = r14.f444225b
            r2 = r15
            okhttp3.internal.http.RealInterceptorChain r2 = (okhttp3.internal.http.RealInterceptorChain) r2
            okhttp3.Request r3 = r15.request()
            okhttp3.Call r4 = r2.call()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L14:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L21
            com.avito.android.quic.performance.a r6 = r14.f444227d
            java.util.Set<okhttp3.Call> r6 = r6.f246299l
            r6.add(r4)
        L21:
            boolean r6 = r4.getCanceled()
            if (r6 != 0) goto Ld2
            int r6 = r5.size()     // Catch: java.io.IOException -> L6b
            if (r6 != 0) goto L2e
            goto L46
        L2e:
            int r6 = r6 + 1
            long r6 = (long) r6     // Catch: java.io.IOException -> L6b
            long r8 = r14.f444230g     // Catch: java.io.IOException -> L6b
            long r6 = r6 * r8
            kotlin.random.f$a r8 = kotlin.random.f.f406882b     // Catch: java.io.IOException -> L6b
            r8.getClass()     // Catch: java.io.IOException -> L6b
            kotlin.random.f r8 = kotlin.random.f.f406883c     // Catch: java.io.IOException -> L6b
            r9 = 100
            int r8 = r8.k(r9)     // Catch: java.io.IOException -> L6b
            long r8 = (long) r8
            long r6 = r6 + r8
            java.lang.Thread.sleep(r6)     // Catch: java.lang.InterruptedException -> L46 java.io.IOException -> L6b
        L46:
            okhttp3.Response r6 = r2.proceed(r3)     // Catch: java.io.IOException -> L6b
            r1.getClass()     // Catch: java.io.IOException -> L6b
            boolean r7 = r5.isEmpty()     // Catch: java.io.IOException -> L6b
            if (r7 == 0) goto L54
            goto L67
        L54:
            zl0.a r7 = new zl0.a     // Catch: java.io.IOException -> L6b
            int r9 = r5.size()     // Catch: java.io.IOException -> L6b
            r12 = 4
            r13 = 0
            r10 = 1
            r11 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> L6b
            com.avito.android.analytics.a r8 = r1.f444220a     // Catch: java.io.IOException -> L6b
            r8.c(r7)     // Catch: java.io.IOException -> L6b
        L67:
            r0.c(r3, r6)     // Catch: java.io.IOException -> L6b
            return r6
        L6b:
            r6 = move-exception
            int r7 = r5.size()
            r8 = 1
            int r9 = r14.f444229f
            r10 = 0
            if (r7 < r9) goto L78
            r7 = r8
            goto L79
        L78:
            r7 = r10
        L79:
            java.io.IOException r6 = r0.a(r4, r3, r6)
            if (r7 != 0) goto Lac
            okhttp3.Request r7 = r15.request()
            com.avito.android.remote.analytics.y r9 = r14.f444226c
            java.lang.String r9 = r9.a(r6)
            if (r9 == 0) goto L8d
            r9 = r8
            goto L8e
        L8d:
            r9 = r10
        L8e:
            java.lang.String r11 = com.avito.android.remote.analytics.y.b(r6)
            if (r11 == 0) goto L96
            r11 = r8
            goto L97
        L96:
            r11 = r10
        L97:
            java.lang.String r7 = r7.method()
            java.lang.String r12 = "GET"
            boolean r7 = kotlin.text.C43066x.C(r7, r12, r8)
            if (r9 == 0) goto Lac
            if (r11 != 0) goto Lac
            if (r7 == 0) goto Lac
            r5.add(r6)
            goto L14
        Lac:
            r1.getClass()
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto Lcd
            zl0.a r15 = new zl0.a
            int r0 = r5.size()
            com.avito.android.remote.analytics.y r2 = r1.f444221b
            java.lang.String r2 = r2.a(r6)
            if (r2 != 0) goto Lc5
            java.lang.String r2 = "okhttp"
        Lc5:
            r15.<init>(r0, r2, r10)
            com.avito.android.analytics.a r0 = r1.f444220a
            r0.c(r15)
        Lcd:
            java.lang.Throwable r15 = okhttp3.internal.Util.withSuppressed(r6, r5)
            throw r15
        Ld2:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: zl0.e.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
