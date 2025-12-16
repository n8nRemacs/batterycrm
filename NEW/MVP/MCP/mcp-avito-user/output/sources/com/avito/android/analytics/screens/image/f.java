package com.avito.android.analytics.screens.image;

import Y61.k;
import android.net.Uri;
import android.os.Handler;
import android.util.LruCache;
import com.avito.android.I1;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.G;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.u;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.analytics.n;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadingTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/image/f;", "Lcom/avito/android/analytics/screens/image/d;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f90619o = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f90620a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G f90621b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Screen f90622c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f90623d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final H f90624e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Handler f90625f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final I1 f90626g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.screens.image.a f90627h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final u f90628i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final n f90629j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.remote.analytics.image.e f90630k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f90631l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final LinkedHashSet f90632m = new LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    @k
    public final LruCache<Uri, Long> f90633n = new LruCache<>(30);

    /* compiled from: ImageLoadingTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/image/f$a;", "", "<init>", "()V", "", "LOADING_START_TIMES_CACHE_SIZE", "I", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public f(@k InterfaceC28373a interfaceC28373a, @k G g12, @k Screen screen, @k c cVar, @k H h12, @k Handler handler, @k I1 i12, @k com.avito.android.analytics.screens.image.a aVar, @k u uVar, @k n nVar, @k com.avito.android.remote.analytics.image.e eVar) {
        this.f90620a = interfaceC28373a;
        this.f90621b = g12;
        this.f90622c = screen;
        this.f90623d = cVar;
        this.f90624e = h12;
        this.f90625f = handler;
        this.f90626g = i12;
        this.f90627h = aVar;
        this.f90628i = uVar;
        this.f90629j = nVar;
        this.f90630k = eVar;
        this.f90631l = screen.f90471b;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.avito.android.analytics.screens.image.f r24, android.net.Uri r25, java.lang.String r26, int r27, int r28, java.lang.String r29, java.lang.Throwable r30, int r31) {
        /*
            r0 = r24
            r1 = r31 & 4
            r2 = 0
            if (r1 == 0) goto La
            r19 = r2
            goto Lc
        La:
            r19 = r27
        Lc:
            r1 = r31 & 8
            if (r1 == 0) goto L13
            r20 = r2
            goto L15
        L13:
            r20 = r28
        L15:
            r1 = r31 & 32
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = r3
            goto L1e
        L1c:
            r1 = r30
        L1e:
            r4 = r31 & 64
            r5 = 1
            if (r4 == 0) goto L26
            r18 = r5
            goto L28
        L26:
            r18 = r2
        L28:
            com.avito.android.analytics.H r4 = r0.f90624e
            java.lang.String r6 = r4.a()
            com.avito.android.I1 r4 = r0.f90626g
            r4.getClass()
            kotlin.reflect.n<java.lang.Object>[] r7 = com.avito.android.I1.f67278k0
            r8 = 5
            r7 = r7[r8]
            com.avito.android.A0$a r4 = r4.f67314f
            DE0.a r4 = r4.a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L50
            com.avito.android.analytics.screens.Screen r4 = r0.f90622c
            boolean r4 = r4.f90472c
            if (r4 == 0) goto L51
        L50:
            r2 = r5
        L51:
            android.util.LruCache<android.net.Uri, java.lang.Long> r4 = r0.f90633n
            r5 = r25
            java.lang.Object r4 = r4.get(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L61
            r4 = 0
        L5f:
            r9 = r4
            goto L66
        L61:
            long r4 = r4.longValue()
            goto L5f
        L66:
            if (r18 == 0) goto L6a
            if (r2 == 0) goto Lba
        L6a:
            com.avito.android.analytics.screens.u r2 = r0.f90628i
            r2.getClass()
            long r7 = com.avito.android.analytics.screens.u.b()
            long r21 = com.avito.android.analytics.screens.u.c()
            long r11 = com.avito.android.analytics.screens.u.a()
            if (r1 == 0) goto L88
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r16 = r4
            goto L8a
        L88:
            r16 = r3
        L8a:
            if (r1 == 0) goto L9e
            arrow.core.a$b r4 = new arrow.core.a$b
            r4.<init>(r1)
            com.avito.android.remote.analytics.n r1 = r0.f90629j
            com.avito.android.remote.analytics.a r1 = r1.b(r4)
            if (r1 == 0) goto L9e
            java.lang.String r1 = r1.f253102a
            r17 = r1
            goto La0
        L9e:
            r17 = r3
        La0:
            com.avito.android.remote.analytics.image.e r1 = r0.f90630k
            r15 = r29
            java.lang.String r23 = r1.b(r15)
            pc.d r1 = new pc.d
            r3 = r1
            java.lang.String r4 = r0.f90631l
            long r13 = r2.f90959a
            r5 = r6
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r9, r11, r13, r15, r16, r17, r18, r19, r20, r21, r23)
            com.avito.android.analytics.a r0 = r0.f90620a
            r0.c(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.analytics.screens.image.f.c(com.avito.android.analytics.screens.image.f, android.net.Uri, java.lang.String, int, int, java.lang.String, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.avito.android.analytics.screens.image.f r20, java.lang.String r21, java.lang.String r22, long r23, int r25, int r26, long r27, java.lang.String r29, java.lang.Throwable r30, int r31) {
        /*
            r0 = r20
            r10 = r29
            r1 = r31
            r2 = r1 & 8
            r3 = 0
            if (r2 == 0) goto Ld
            r5 = r3
            goto Lf
        Ld:
            r5 = r25
        Lf:
            r2 = r1 & 16
            if (r2 == 0) goto L15
            r6 = r3
            goto L17
        L15:
            r6 = r26
        L17:
            r2 = r1 & 32
            if (r2 == 0) goto L1f
            r7 = 0
            r11 = r7
            goto L21
        L1f:
            r11 = r27
        L21:
            r2 = r1 & 128(0x80, float:1.8E-43)
            r4 = 0
            if (r2 == 0) goto L28
            r2 = r4
            goto L2a
        L28:
            r2 = r30
        L2a:
            r1 = r1 & 256(0x100, float:3.59E-43)
            r7 = 1
            if (r1 == 0) goto L31
            r15 = r7
            goto L32
        L31:
            r15 = r3
        L32:
            com.avito.android.I1 r1 = r0.f90626g
            r1.getClass()
            kotlin.reflect.n<java.lang.Object>[] r8 = com.avito.android.I1.f67278k0
            r9 = 5
            r8 = r8[r9]
            com.avito.android.A0$a r1 = r1.f67314f
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L54
            com.avito.android.analytics.screens.Screen r1 = r0.f90622c
            boolean r1 = r1.f90472c
            if (r1 == 0) goto L55
        L54:
            r3 = r7
        L55:
            if (r15 == 0) goto L59
            if (r3 == 0) goto La5
        L59:
            com.avito.android.analytics.H r1 = r0.f90624e
            java.lang.String r3 = r1.a()
            if (r2 == 0) goto L6b
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r13 = r1
            goto L6c
        L6b:
            r13 = r4
        L6c:
            if (r2 == 0) goto L7f
            arrow.core.a$b r1 = new arrow.core.a$b
            r1.<init>(r2)
            com.avito.android.remote.analytics.n r2 = r0.f90629j
            com.avito.android.remote.analytics.a r1 = r2.b(r1)
            if (r1 == 0) goto L7f
            java.lang.String r1 = r1.f253102a
            r14 = r1
            goto L80
        L7f:
            r14 = r4
        L80:
            com.avito.android.remote.analytics.image.e r1 = r0.f90630k
            java.lang.String r16 = r1.b(r10)
            kotlin.w0 r17 = r1.c(r10)
            pc.f r9 = new pc.f
            r1 = r9
            r18 = 0
            java.lang.String r2 = r0.f90631l
            r4 = r21
            r7 = r23
            r19 = r9
            r9 = r22
            r10 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11, r13, r14, r15, r16, r17, r18)
            com.avito.android.analytics.a r0 = r0.f90620a
            r1 = r19
            r0.c(r1)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.analytics.screens.image.f.d(com.avito.android.analytics.screens.image.f, java.lang.String, java.lang.String, long, int, int, long, java.lang.String, java.lang.Throwable, int):void");
    }

    public final void a(long j12, String str, String str2) {
        String strA = this.f90624e.a();
        I1 i12 = this.f90626g;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[6];
        if (((Boolean) i12.f67316g.a().invoke()).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f90621b.getF90370a());
            sb2.append(".absolute.");
            sb2.append(this.f90631l);
            sb2.append(".image-loading.");
            sb2.append(str);
            sb2.append('.');
            this.f90620a.c(new y.c(androidx.compose.foundation.H.o(sb2, strA, '.', str2), Long.valueOf(j12), null));
        }
    }

    public final void b(long j12, String str, String str2) {
        I1 i12 = this.f90626g;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[6];
        if (((Boolean) i12.f67316g.a().invoke()).booleanValue()) {
            this.f90628i.getClass();
            this.f90620a.c(new y.c(this.f90621b.getF90370a() + ".absolute." + this.f90631l + ".image-drawing." + str + '.' + str2, Long.valueOf(u.c() - j12), null));
        }
    }
}
