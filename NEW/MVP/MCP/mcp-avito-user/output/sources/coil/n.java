package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.decode.b;
import coil.e;
import coil.f;
import coil.fetch.a;
import coil.fetch.b;
import coil.fetch.c;
import coil.fetch.d;
import coil.fetch.e;
import coil.fetch.i;
import coil.fetch.j;
import coil.fetch.l;
import coil.memory.MemoryCache;
import coil.request.C27245b;
import coil.request.s;
import coil.request.w;
import coil.util.t;
import coil.util.y;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.t1;
import okhttp3.HttpUrl;

/* compiled from: RealImageLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/n;", "Lcoil/j;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f58540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C27245b f58541b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<MemoryCache> f58542c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<coil.disk.a> f58543d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f58544e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final f.d f58545f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final t f58546g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final coil.util.o f58547h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f58548i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final w f58549j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final e f58550k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ArrayList f58551l;

    /* compiled from: RealImageLoader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil/n$a;", "", "<init>", "()V", "", "REQUEST_TYPE_ENQUEUE", "I", "REQUEST_TYPE_EXECUTE", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super coil.request.q>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f58552q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ coil.request.p f58554s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(coil.request.p pVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f58554s = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return n.this.new b(this.f58554s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super coil.request.q> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            coil.util.o oVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f58552q;
            n nVar = n.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f58552q = 1;
                obj = n.d(nVar, this.f58554s, 0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            coil.request.q qVar = (coil.request.q) obj;
            if ((qVar instanceof coil.request.e) && (oVar = nVar.f58547h) != null) {
                Throwable th2 = ((coil.request.e) qVar).f58643c;
                if (oVar.f58787a <= 6) {
                    oVar.a(6, "RealImageLoader", null, th2);
                }
            }
            return obj;
        }
    }

    static {
        new a(null);
    }

    public n(@Y61.k Context context, @Y61.k C27245b c27245b, @Y61.k InterfaceC42726C interfaceC42726C, @Y61.k InterfaceC42726C interfaceC42726C2, @Y61.k InterfaceC42726C interfaceC42726C3, @Y61.k f.d dVar, @Y61.k e eVar, @Y61.k t tVar, @Y61.l coil.util.o oVar) {
        this.f58540a = context;
        this.f58541b = c27245b;
        this.f58542c = interfaceC42726C;
        this.f58543d = interfaceC42726C2;
        this.f58544e = interfaceC42726C3;
        this.f58545f = dVar;
        this.f58546g = tVar;
        this.f58547h = oVar;
        CoroutineContext.Element elementB = t1.b();
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f58548i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) elementB, K.f411877a.y()).plus(new r(N.f410714t2, this)));
        y yVar = new y(this);
        w wVar = new w(this, yVar, oVar);
        this.f58549j = wVar;
        e.a aVar = new e.a(eVar);
        aVar.a(new I2.c(), HttpUrl.class);
        aVar.a(new I2.g(), String.class);
        aVar.a(new I2.b(), Uri.class);
        aVar.a(new I2.f(), Uri.class);
        aVar.a(new I2.e(), Integer.class);
        aVar.a(new I2.a(), byte[].class);
        H2.c cVar2 = new H2.c();
        ArrayList arrayList = aVar.f58368c;
        arrayList.add(new Q(cVar2, Uri.class));
        arrayList.add(new Q(new H2.a(tVar.f58794a), File.class));
        aVar.b(new j.b(interfaceC42726C3, interfaceC42726C2, tVar.f58796c), Uri.class);
        aVar.b(new i.a(), File.class);
        aVar.b(new a.C2072a(), Uri.class);
        aVar.b(new d.a(), Uri.class);
        aVar.b(new l.b(), Uri.class);
        aVar.b(new e.a(), Drawable.class);
        aVar.b(new b.a(), Bitmap.class);
        aVar.b(new c.a(), ByteBuffer.class);
        aVar.f58370e.add(new b.c(tVar.f58797d, tVar.f58798e));
        e eVarC = aVar.c();
        this.f58550k = eVarC;
        this.f58551l = C42745f0.i0(new coil.intercept.a(this, yVar, wVar, oVar), eVarC.f58361a);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[Catch: all -> 0x00dd, PHI: r1 r2 r3 r4
  0x00e0: PHI (r1v14 coil.n) = (r1v3 coil.n), (r1v15 coil.n), (r1v16 coil.n) binds: [B:26:0x0076, B:35:0x00c7, B:37:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r2v9 coil.f) = (r2v3 coil.f), (r2v15 coil.f), (r2v16 coil.f) binds: [B:26:0x0076, B:35:0x00c7, B:37:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r3v10 coil.request.p) = (r3v16 coil.request.p), (r3v17 coil.request.p), (r3v18 coil.request.p) binds: [B:26:0x0076, B:35:0x00c7, B:37:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x00e0: PHI (r4v9 coil.request.v) = (r4v20 coil.request.v), (r4v21 coil.request.v), (r4v22 coil.request.v) binds: [B:26:0x0076, B:35:0x00c7, B:37:0x00d9] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114 A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176 A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:66:0x0166, B:68:0x016d, B:69:0x0176, B:71:0x017a, B:63:0x013b, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:48:0x00f2, B:51:0x00f8, B:53:0x0110, B:55:0x0114, B:56:0x0117, B:58:0x011e, B:59:0x0121, B:52:0x0104, B:32:0x00be, B:34:0x00c4, B:36:0x00c9, B:73:0x0186, B:74:0x018b), top: B:95:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190 A[Catch: all -> 0x01ba, TryCatch #1 {all -> 0x01ba, blocks: (B:75:0x018c, B:77:0x0190, B:79:0x0194, B:81:0x0199, B:82:0x01af, B:84:0x01b6, B:85:0x01b9, B:88:0x01bc), top: B:94:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #1 {all -> 0x01ba, blocks: (B:75:0x018c, B:77:0x0190, B:79:0x0194, B:81:0x0199, B:82:0x01af, B:84:0x01b6, B:85:0x01b9, B:88:0x01bc), top: B:94:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(coil.n r22, coil.request.p r23, int r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.n.d(coil.n, coil.request.p, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // coil.j
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C27245b getF58541b() {
        return this.f58541b;
    }

    @Override // coil.j
    @Y61.k
    public final coil.request.d b(@Y61.k coil.request.p pVar) {
        InterfaceC43076a0<? extends coil.request.q> interfaceC43076a0B = C43259k.b(this.f58548i, null, new b(pVar, null), 3);
        K2.c cVar = pVar.f58661c;
        return cVar instanceof K2.d ? coil.util.l.c(((K2.d) cVar).getView()).b(interfaceC43076a0B) : new s(interfaceC43076a0B);
    }

    @Override // coil.j
    @Y61.l
    public final Object c(@Y61.k coil.request.p pVar, @Y61.k SuspendLambda suspendLambda) {
        return U.c(new o(this, pVar, null), suspendLambda);
    }

    @Y61.l
    public final MemoryCache e() {
        return this.f58542c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(coil.request.e r7, K2.c r8, coil.f r9) {
        /*
            r6 = this;
            coil.request.p r0 = r7.f58642b
            coil.util.o r1 = r6.f58547h
            if (r1 == 0) goto L2c
            int r2 = r1.f58787a
            r3 = 4
            if (r2 > r3) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "🚨 Failed - "
            r2.<init>(r4)
            java.lang.Object r4 = r0.f58660b
            r2.append(r4)
            java.lang.String r4 = " - "
            r2.append(r4)
            java.lang.Throwable r4 = r7.f58643c
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r3, r5, r2, r4)
        L2c:
            boolean r1 = r8 instanceof M2.d
            android.graphics.drawable.Drawable r2 = r7.f58641a
            if (r1 != 0) goto L35
            if (r8 == 0) goto L50
            goto L44
        L35:
            coil.request.p r1 = r7.f58642b
            M2.c$a r1 = r1.f58671m
            r3 = r8
            M2.d r3 = (M2.d) r3
            M2.c r1 = r1.a(r3, r7)
            boolean r3 = r1 instanceof M2.b
            if (r3 == 0) goto L48
        L44:
            r8.d(r2)
            goto L50
        L48:
            r9.getClass()
            coil.f$a r8 = coil.f.f58371a
            r1.a()
        L50:
            r9.b(r0, r7)
            coil.request.p$b r8 = r0.f58662d
            if (r8 == 0) goto L5a
            r8.b(r0, r7)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.n.f(coil.request.e, K2.c, coil.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(coil.request.x r8, K2.c r9, coil.f r10) {
        /*
            r7 = this;
            coil.request.p r0 = r8.f58739b
            coil.util.o r1 = r7.f58547h
            if (r1 == 0) goto L57
            int r2 = r1.f58787a
            r3 = 4
            if (r2 > r3) goto L57
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.graphics.Bitmap$Config[] r4 = coil.util.l.f58781a
            coil.decode.DataSource r4 = r8.f58740c
            int r5 = r4.ordinal()
            if (r5 == 0) goto L31
            r6 = 1
            if (r5 == r6) goto L31
            r6 = 2
            if (r5 == r6) goto L2d
            r6 = 3
            if (r5 != r6) goto L27
            java.lang.String r5 = "☁️ "
            goto L34
        L27:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L2d:
            java.lang.String r5 = "💾"
            goto L34
        L31:
            java.lang.String r5 = "🧠"
        L34:
            r2.append(r5)
            java.lang.String r5 = " Successful ("
            r2.append(r5)
            java.lang.String r4 = r4.name()
            r2.append(r4)
            java.lang.String r4 = ") - "
            r2.append(r4)
            java.lang.Object r4 = r0.f58660b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.a(r3, r5, r2, r4)
        L57:
            boolean r1 = r9 instanceof M2.d
            android.graphics.drawable.Drawable r2 = r8.f58738a
            if (r1 != 0) goto L60
            if (r9 == 0) goto L7b
            goto L6f
        L60:
            coil.request.p r1 = r8.f58739b
            M2.c$a r1 = r1.f58671m
            r3 = r9
            M2.d r3 = (M2.d) r3
            M2.c r1 = r1.a(r3, r8)
            boolean r3 = r1 instanceof M2.b
            if (r3 == 0) goto L73
        L6f:
            r9.b(r2)
            goto L7b
        L73:
            r10.getClass()
            coil.f$a r9 = coil.f.f58371a
            r1.a()
        L7b:
            r10.c(r0, r8)
            coil.request.p$b r9 = r0.f58662d
            if (r9 == 0) goto L85
            r9.c(r0, r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.n.g(coil.request.x, K2.c, coil.f):void");
    }
}
