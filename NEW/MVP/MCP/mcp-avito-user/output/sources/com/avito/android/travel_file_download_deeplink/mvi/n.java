package com.avito.android.travel_file_download_deeplink.mvi;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.travel_file_download_deeplink.a;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rm0.InterfaceC47681a;

/* compiled from: FileDownloadInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_file_download_deeplink/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadInteractor$download$1", f = "FileDownloadInteractor.kt", i = {0, 0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", "downloadId"}, s = {"L$0", "J$0"})
/* loaded from: classes4.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.travel_file_download_deeplink.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f301813q;

    /* renamed from: r, reason: collision with root package name */
    public int f301814r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f301815s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p f301816t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f301817u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f301818v;

    /* compiled from: FileDownloadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_file_download_deeplink/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadInteractor$download$1$2", f = "FileDownloadInteractor.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.travel_file_download_deeplink.a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f301819q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f301820r;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.travel_file_download_deeplink.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            a aVar = new a(3, continuation);
            aVar.f301820r = interfaceC43172j;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f301819q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f301820r;
                a.b bVar = a.b.f301685a;
                this.f301819q = 1;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<com.avito.android.travel_file_download_deeplink.a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f301821b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f301822c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f301823d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f301824b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f301825c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f301826d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadInteractor$download$1$invokeSuspend$$inlined$map$1$2", f = "FileDownloadInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.travel_file_download_deeplink.mvi.n$b$a$a, reason: collision with other inner class name */
            public static final class C9243a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f301827q;

                /* renamed from: r, reason: collision with root package name */
                public int f301828r;

                public C9243a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f301827q = obj;
                    this.f301828r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, p pVar, long j12) {
                this.f301824b = interfaceC43172j;
                this.f301825c = pVar;
                this.f301826d = j12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
                /*
                    r8 = this;
                    r0 = 0
                    r1 = 1
                    boolean r2 = r10 instanceof com.avito.android.travel_file_download_deeplink.mvi.n.b.a.C9243a
                    if (r2 == 0) goto L15
                    r2 = r10
                    com.avito.android.travel_file_download_deeplink.mvi.n$b$a$a r2 = (com.avito.android.travel_file_download_deeplink.mvi.n.b.a.C9243a) r2
                    int r3 = r2.f301828r
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L15
                    int r3 = r3 - r4
                    r2.f301828r = r3
                    goto L1a
                L15:
                    com.avito.android.travel_file_download_deeplink.mvi.n$b$a$a r2 = new com.avito.android.travel_file_download_deeplink.mvi.n$b$a$a
                    r2.<init>(r10)
                L1a:
                    java.lang.Object r10 = r2.f301827q
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r4 = r2.f301828r
                    if (r4 == 0) goto L33
                    if (r4 != r1) goto L2b
                    kotlin.C42729a0.b(r10)
                    goto Lbb
                L2b:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L33:
                    kotlin.C42729a0.b(r10)
                    kotlin.G0 r9 = (kotlin.G0) r9
                    com.avito.android.travel_file_download_deeplink.mvi.p r9 = r8.f301825c
                    r9.getClass()
                    android.app.DownloadManager$Query r10 = new android.app.DownloadManager$Query
                    r10.<init>()
                    long r4 = r8.f301826d
                    long[] r6 = new long[r1]
                    r6[r0] = r4
                    r10.setFilterById(r6)
                    android.app.DownloadManager r9 = r9.f301832a
                    android.database.Cursor r10 = r9.query(r10)
                    r10.moveToFirst()
                    java.lang.String r6 = "status"
                    int r6 = r10.getColumnIndex(r6)
                    int r10 = r10.getInt(r6)
                    r6 = 4
                    if (r10 == r6) goto La7
                    r6 = 8
                    if (r10 == r6) goto L6f
                    r9 = 16
                    if (r10 == r9) goto L6c
                    com.avito.android.travel_file_download_deeplink.a$c r9 = com.avito.android.travel_file_download_deeplink.a.c.f301686a
                    goto Lb0
                L6c:
                    com.avito.android.travel_file_download_deeplink.a$b r9 = com.avito.android.travel_file_download_deeplink.a.b.f301685a
                    goto Lb0
                L6f:
                    com.avito.android.travel_file_download_deeplink.a$d r10 = new com.avito.android.travel_file_download_deeplink.a$d
                    android.app.DownloadManager$Query r6 = new android.app.DownloadManager$Query
                    r6.<init>()
                    long[] r7 = new long[r1]
                    r7[r0] = r4
                    r6.setFilterById(r7)
                    android.database.Cursor r9 = r9.query(r6)
                    java.io.Closeable r9 = (java.io.Closeable) r9
                    r0 = r9
                    android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> La0
                    r0.moveToFirst()     // Catch: java.lang.Throwable -> La0
                    java.lang.String r4 = "local_uri"
                    int r4 = r0.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La0
                    java.lang.String r0 = r0.getString(r4)     // Catch: java.lang.Throwable -> La0
                    android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> La0
                    r4 = 0
                    kotlin.io.c.a(r9, r4)
                    r10.<init>(r0)
                    r9 = r10
                    goto Lb0
                La0:
                    r10 = move-exception
                    throw r10     // Catch: java.lang.Throwable -> La2
                La2:
                    r0 = move-exception
                    kotlin.io.c.a(r9, r10)
                    throw r0
                La7:
                    long[] r10 = new long[r1]
                    r10[r0] = r4
                    r9.remove(r10)
                    com.avito.android.travel_file_download_deeplink.a$b r9 = com.avito.android.travel_file_download_deeplink.a.b.f301685a
                Lb0:
                    r2.f301828r = r1
                    kotlinx.coroutines.flow.j r10 = r8.f301824b
                    java.lang.Object r9 = r10.emit(r9, r2)
                    if (r9 != r3) goto Lbb
                    return r3
                Lbb:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_file_download_deeplink.mvi.n.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, p pVar, long j12) {
            this.f301821b = interfaceC43160i;
            this.f301822c = pVar;
            this.f301823d = j12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.travel_file_download_deeplink.a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f301821b.collect(new a(interfaceC43172j, this.f301822c, this.f301823d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Uri uri, String str, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f301816t = pVar;
        this.f301817u = uri;
        this.f301818v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f301816t, this.f301817u, this.f301818v, continuation);
        nVar.f301815s = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.travel_file_download_deeplink.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        long jEnqueue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f301814r;
        p pVar = this.f301816t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f301815s;
            DownloadManager downloadManager = pVar.f301832a;
            DownloadManager.Request request = new DownloadManager.Request(this.f301817u);
            k kVar = pVar.f301833b;
            M m12 = kVar.f301799a;
            String f6495a = m12.getF253555a();
            Q q12 = f6495a == null ? null : new Q(m12.getKey(), f6495a);
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            B0 b02 = kVar.f301801c;
            sb3.append(b02.getKey());
            sb3.append('=');
            String f6495a2 = b02.getF253555a();
            if (f6495a2 == null) {
                f6495a2 = "";
            }
            sb3.append(f6495a2);
            sb2.append(sb3.toString());
            if (!kVar.f301805g.l()) {
                StringBuilder sb4 = new StringBuilder("; ");
                P0 p02 = kVar.f301800b;
                sb4.append(p02.getKey());
                sb4.append('=');
                String f6495a3 = p02.getF253555a();
                sb4.append(f6495a3 != null ? f6495a3 : "");
                sb2.append(sb4.toString());
            }
            Q q13 = new Q("Cookie", sb2.toString());
            U0 u02 = kVar.f301802d;
            String f6495a4 = u02.getF253555a();
            Q q14 = f6495a4 == null ? null : new Q(u02.getKey(), f6495a4);
            I i13 = kVar.f301803e;
            String f6495a5 = i13.getF253555a();
            Q q15 = f6495a5 == null ? null : new Q(i13.getKey(), f6495a5);
            InterfaceC47681a interfaceC47681a = kVar.f301804f;
            String f6495a6 = interfaceC47681a.getF253555a();
            Iterator it = C42756l.B(new Q[]{q12, q13, q14, q15, f6495a6 == null ? null : new Q(interfaceC47681a.getKey(), f6495a6)}).iterator();
            while (it.hasNext()) {
                Q q16 = (Q) it.next();
                request.addRequestHeader((String) q16.f406619b, (String) q16.f406620c);
            }
            String str = this.f301818v;
            request.setTitle(str);
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str);
            jEnqueue = downloadManager.enqueue(request);
            a.C9230a c9230a = new a.C9230a(jEnqueue);
            this.f301815s = interfaceC43172j;
            this.f301813q = jEnqueue;
            this.f301814r = 1;
            if (interfaceC43172j.emit(c9230a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            jEnqueue = this.f301813q;
            interfaceC43172j = (InterfaceC43172j) this.f301815s;
            C42729a0.b(obj);
        }
        pVar.getClass();
        C43152f0 c43152f0 = new C43152f0(new b(C43175k.G(new o(2, null)), pVar, jEnqueue), new a(3, null));
        this.f301815s = null;
        this.f301814r = 2;
        if (C43175k.u(this, c43152f0, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
