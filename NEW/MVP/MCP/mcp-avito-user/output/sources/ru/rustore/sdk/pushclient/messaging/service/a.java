package ru.rustore.sdk.pushclient.messaging.service;

import Qa1.p;
import Y61.k;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import cb1.C27162a;
import cb1.C27165d;
import cb1.C27166e;
import cb1.C27167f;
import cb1.C27169h;
import fb1.C40395b;
import j.l0;
import java.util.List;
import kb1.i;
import kb1.l;
import kb1.m;
import kb1.r;
import kb1.u;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.internal.C43238h;
import lb1.C43722c;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/service/a;", "Landroid/app/Service;", "", "<init>", "()V", "a", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes9.dex */
public class a extends Service {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C12583a f436831i = new C12583a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436832b = C42727D.c(c.f436840l);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436833c = C42727D.c(b.f436839l);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f436834d = C42727D.c(h.f436847l);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f436835e = U.a(C43262l0.f411947c);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C<kb1.g> f436836f = C42727D.c(new d());

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C<l> f436837g = C42727D.c(f.f436843l);

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC42726C<T11.f> f436838h = C42727D.c(e.f436842l);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/pushclient/messaging/service/a$a;", "", "<init>", "()V", "sdk-public-push-client_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.pushclient.messaging.service.a$a, reason: collision with other inner class name */
    public static final class C12583a {
        public C12583a() {
        }

        public /* synthetic */ C12583a(C42822w c42822w) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV11/b;", "invoke", "()LV11/b;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class b extends N implements Y41.a<V11.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f436839l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final V11.b invoke() {
            C27169h.f57985a.getClass();
            return C27169h.a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkb1/f;", "invoke", "()Lkb1/f;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class c extends N implements Y41.a<kb1.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f436840l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kb1.f invoke() {
            C27169h.f57985a.getClass();
            return (kb1.f) C27169h.f57993i.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkb1/g;", "invoke", "()Lkb1/g;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class d extends N implements Y41.a<kb1.g> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final kb1.g invoke() {
            T11.f fVar = C27167f.f57982a;
            C12583a c12583a = a.f436831i;
            T11.f fVarA = a.this.a();
            u uVarA = C27167f.a();
            C27169h.f57985a.getClass();
            return new i(uVarA, (kb1.f) C27169h.f57993i.getValue(), (Qa1.a) C27165d.f57978b.getValue(), (qb1.g) C27169h.f57989e.getValue(), fVarA);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LT11/f;", "invoke", "()LT11/f;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class e extends N implements Y41.a<T11.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f436842l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final T11.f invoke() {
            p pVar = C27166e.f57981b;
            return (pVar != null ? pVar.f13854c : new T11.c("VkpnsClientSdk")).b("VkpnsMessagingService");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkb1/l;", "invoke", "()Lkb1/l;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class f extends N implements Y41.a<l> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f436843l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            T11.f fVar = C27167f.f57982a;
            C27169h.f57985a.getClass();
            kb1.f fVar2 = (kb1.f) C27169h.f57993i.getValue();
            u uVarA = C27167f.a();
            C27166e c27166e = C27166e.f57980a;
            Context applicationContext = C27166e.a().f13852a.getApplicationContext();
            p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            lb1.i iVar = new lb1.i(pVar.f13852a.getApplicationContext());
            p pVar2 = C27166e.f57981b;
            if (pVar2 != null) {
                return new m(fVar2, uVarA, new lb1.g(applicationContext, iVar, new C43722c(pVar2.f13852a.getApplicationContext()), new com.vk.push.core.data.imageloader.b(c27166e), C27169h.a(), fVar), (qb1.g) C27169h.f57989e.getValue(), C27169h.a(), (Ya1.b) C27162a.f57971a.getValue(), fVar);
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 0})
    @DebugMetadata(c = "ru.rustore.sdk.pushclient.messaging.service.RuStoreMessagingService$onCreate$1", f = "RuStoreMessagingService.kt", i = {}, l = {86, 88}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC43125y f436844q;

        /* renamed from: r, reason: collision with root package name */
        public int f436845r;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return a.this.new g(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x003c, code lost:
        
            if (r6 != r1) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0150 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.rustore.sdk.pushclient.messaging.service.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqb1/g;", "invoke", "()Lqb1/g;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class h extends N implements Y41.a<qb1.g> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f436847l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final qb1.g invoke() {
            C27169h.f57985a.getClass();
            return (qb1.g) C27169h.f57989e.getValue();
        }
    }

    public final T11.f a() {
        return this.f436838h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kb1.s.b r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.rustore.sdk.pushclient.messaging.service.b
            if (r0 == 0) goto L13
            r0 = r7
            ru.rustore.sdk.pushclient.messaging.service.b r0 = (ru.rustore.sdk.pushclient.messaging.service.b) r0
            int r1 = r0.f436852u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436852u = r1
            goto L18
        L13:
            ru.rustore.sdk.pushclient.messaging.service.b r0 = new ru.rustore.sdk.pushclient.messaging.service.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f436850s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436852u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            ru.rustore.sdk.pushclient.messaging.service.a r6 = r0.f436848q
            kotlin.C42729a0.b(r7)
            goto L86
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kb1.s$b r6 = r0.f436849r
            ru.rustore.sdk.pushclient.messaging.service.a r2 = r0.f436848q
            kotlin.C42729a0.b(r7)
            goto L60
        L3e:
            kotlin.C42729a0.b(r7)
            T11.f r7 = r5.a()
            java.lang.String r2 = "Sending token to client via onNewToken method"
            r7.info(r2)
            kotlin.C r7 = r5.f436834d
            java.lang.Object r7 = r7.getValue()
            qb1.g r7 = (qb1.g) r7
            r0.f436848q = r5
            r0.f436849r = r6
            r0.f436852u = r3
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r2 = r5
        L60:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r3 = r6.f406496a
            boolean r7 = kotlin.jvm.internal.L.f(r7, r3)
            r3 = 0
            if (r7 != 0) goto L90
            r2.e()
            kotlin.C r7 = r2.f436834d
            java.lang.Object r7 = r7.getValue()
            qb1.g r7 = (qb1.g) r7
            r0.f436848q = r2
            r0.f436849r = r3
            r0.f436852u = r4
            java.lang.String r6 = r6.f406496a
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L85
            return r1
        L85:
            r6 = r2
        L86:
            T11.f r6 = r6.a()
            java.lang.String r7 = "Sending token successful"
            r6.info(r7)
            goto L99
        L90:
            T11.f r6 = r2.a()
            java.lang.String r7 = "This token has already been sent to client earlier"
            r6.a(r7, r3)
        L99:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.rustore.sdk.pushclient.messaging.service.a.b(kb1.s$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // android.app.Service
    @k
    public final IBinder onBind(@k Intent intent) {
        return new r(this.f436837g, this.f436836f, this.f436838h);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Pa1.c.f13143a.getClass();
        if (Pa1.c.f13144b) {
            C43259k.d(this.f436835e, null, null, new g(null), 3);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Pa1.c.f13143a.getClass();
        if (Pa1.c.f13144b) {
            a().info("Service is destroying");
            U.b(this.f436835e, null);
            this.f436836f.getValue().e();
            this.f436837g.getValue().e();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(@Y61.l Intent intent, int i12, int i13) {
        return 1;
    }

    @l0
    public void e() {
    }

    @l0
    public void c(@k List<? extends RuStorePushClientException> list) {
    }

    @l0
    public void d(@k C40395b c40395b) {
    }
}
