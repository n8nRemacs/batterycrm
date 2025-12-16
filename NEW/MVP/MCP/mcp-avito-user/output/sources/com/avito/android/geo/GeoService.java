package com.avito.android.geo;

import Y41.p;
import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.IBinder;
import android.os.Message;
import com.avito.android.di.C29972i;
import com.avito.android.geo.di.b;
import com.avito.android.geo.g;
import com.avito.android.util.B1;
import com.avito.android.util.L6;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: GeoService.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/geo/GeoService;", "Landroid/app/Service;", "Lcom/avito/android/geo/g$a;", "Lcom/avito/android/util/L6$a;", "<init>", "()V", "a", "_avito_geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GeoService extends Service implements g.a, L6.a {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f159279i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public g f159280b;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public d f159282d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public R0 f159283e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public L6 f159284f;

    /* renamed from: h, reason: collision with root package name */
    public long f159286h;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f159281c = C42727D.c(new c());

    /* renamed from: g, reason: collision with root package name */
    public int f159285g = -1;

    /* compiled from: GeoService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/avito/android/geo/GeoService$a;", "", "<init>", "()V", "", "DEFAULT_MAX_TIMEOUT_MS", "I", "", "KEY_ACCURACY", "Ljava/lang/String;", "KEY_FORCE_UPDATE", "KEY_TIMEOUT", "MSG_STOP_SELF", "NOT_RUNNING_ID", "TAG", "_avito_geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GeoService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.geo.GeoService$onUpdateFinished$1", f = "GeoService.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f159287q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Location f159289s;

        /* compiled from: GeoService.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.geo.GeoService$onUpdateFinished$1$1", f = "GeoService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ GeoService f159290q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Location f159291r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GeoService geoService, Location location, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f159290q = geoService;
                this.f159291r = location;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f159290q, this.f159291r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                d dVar = this.f159290q.f159282d;
                if (dVar == null) {
                    dVar = null;
                }
                j jVar = dVar.f159303b;
                Location location = this.f159291r;
                if (location != null) {
                    jVar.m(location);
                }
                jVar.k(dVar.f159302a.now());
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Location location, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f159289s = location;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return GeoService.this.new b(this.f159289s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f159287q;
            Location location = this.f159289s;
            GeoService geoService = GeoService.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                R0 r02 = geoService.f159283e;
                if (r02 == null) {
                    r02 = null;
                }
                kotlinx.coroutines.scheduling.b bVarA = r02.a();
                a aVar = new a(geoService, location, null);
                this.f159287q = 1;
                if (C43259k.g(bVarA, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            com.avito.android.geo.c.f159300b.getClass();
            Intent intent = new Intent("ACTION_GEO_UPDATE");
            intent.putExtra("event", "update_finished");
            intent.putExtra("location", location);
            androidx.localbroadcastmanager.content.a.a(geoService).c(intent);
            geoService.stopSelf();
            return G0.f406611a;
        }
    }

    /* compiled from: GeoService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/T;", "invoke", "()Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<T> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final T invoke() {
            R0 r02 = GeoService.this.f159283e;
            if (r02 == null) {
                r02 = null;
            }
            return U.a(r02.b());
        }
    }

    public final void a(Intent intent) {
        V2.f318762a.c("GeoService", "handleIntent", null);
        this.f159284f.sendEmptyMessageDelayed(1, this.f159286h);
        int intExtra = intent.getIntExtra("accuracy", 0);
        d dVar = this.f159282d;
        Location locationJ = (dVar != null ? dVar : null).f159303b.j();
        g gVar = this.f159280b;
        long j12 = this.f159286h;
        com.avito.android.geo.b bVar = (com.avito.android.geo.b) gVar;
        bVar.f159297e = intExtra;
        bVar.c(locationJ);
        bVar.f159294b.sendEmptyMessageDelayed(1, j12);
        bVar.d();
    }

    public final void b(@Y61.l Location location) {
        V2.f318762a.c("GeoService", "onUpdateFinished: ".concat(B1.a(location)), null);
        this.f159284f.removeCallbacksAndMessages(null);
        C43259k.d((T) this.f159281c.getValue(), null, null, new b(location, null), 3);
    }

    @Override // com.avito.android.util.L6.a
    public final void handleMessage(@Y61.k Message message) {
        if (message.what == 1) {
            ((com.avito.android.geo.b) this.f159280b).a();
        }
    }

    @Override // android.app.Service
    @Y61.l
    public final IBinder onBind(@Y61.k Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        com.avito.android.geo.di.c cVar = (com.avito.android.geo.di.c) C29972i.a(C29972i.b(this), com.avito.android.geo.di.c.class);
        b.a aVarA = com.avito.android.geo.di.a.a();
        aVarA.a(cVar);
        aVarA.build().a(this);
        int i12 = h.f159306a;
        this.f159280b = new n(this, new L6(), new com.avito.android.server_time.a(), (LocationManager) getSystemService("location"));
        L6 l62 = new L6();
        l62.f318653a = new WeakReference<>(this);
        this.f159284f = l62;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f159285g = -1;
        U.b((T) this.f159281c.getValue(), null);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(@Y61.l android.content.Intent r7, int r8, int r9) {
        /*
            r6 = this;
            super.onStartCommand(r7, r8, r9)
            r8 = 2
            if (r7 != 0) goto La
            r6.stopSelf()
            return r8
        La:
            int r0 = r6.f159285g
            r1 = -1
            if (r0 != r1) goto L5a
            r6.f159285g = r9
            java.lang.String r9 = "timeout"
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r7.getLongExtra(r9, r0)
            r2 = 5000(0x1388, double:2.4703E-320)
            long r0 = java.lang.Math.max(r0, r2)
            r6.f159286h = r0
            java.lang.String r9 = "force_update"
            r0 = 0
            boolean r9 = r7.getBooleanExtra(r9, r0)
            if (r9 != 0) goto L49
            com.avito.android.geo.d r9 = r6.f159282d
            if (r9 == 0) goto L2f
            goto L30
        L2f:
            r9 = 0
        L30:
            com.avito.android.geo.j r0 = r9.f159303b
            long r0 = r0.l()
            com.avito.android.server_time.h r9 = r9.f159302a
            long r2 = r9.now()
            r4 = 600000(0x927c0, double:2.964394E-318)
            long r0 = r0 + r4
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 >= 0) goto L45
            goto L49
        L45:
            r6.stopSelf()
            goto L5a
        L49:
            r6.a(r7)     // Catch: java.lang.RuntimeException -> L4d
            goto L5a
        L4d:
            r7 = move-exception
            com.avito.android.util.V2 r9 = com.avito.android.util.V2.f318762a
            java.lang.String r0 = "GeoService"
            java.lang.String r1 = "handleIntent"
            r9.a(r0, r1, r7)
            r6.stopSelf()
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.geo.GeoService.onStartCommand(android.content.Intent, int, int):int");
    }
}
