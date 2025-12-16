package com.avito.android.app_rater;

import Y61.k;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import java.time.Duration;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import td.C48653a;
import ud.C49037b;

/* compiled from: AppRaterLauncherImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app_rater/b;", "Lcom/avito/android/app_rater/a;", "a", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.app_rater.a {

    /* renamed from: g, reason: collision with root package name */
    public static final Duration f91777g;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f91778a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C48653a f91779b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final P f91780c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C49037b f91781d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f91782e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Y41.a<Boolean> f91783f = new c(this);

    /* compiled from: AppRaterLauncherImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/app_rater/b$a;", "", "<init>", "()V", "", "INSTALL_SOURCE_UNKNOWN", "Ljava/lang/String;", "Ljava/time/Duration;", "kotlin.jvm.PlatformType", "MAX_DIFF_DAYS", "Ljava/time/Duration;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f91777g = Duration.ofDays(30L);
    }

    @Inject
    public b(@k R0 r02, @k InterfaceC28373a interfaceC28373a, @k C48653a c48653a, @k P p12, @k C49037b c49037b) {
        this.f91778a = interfaceC28373a;
        this.f91779b = c48653a;
        this.f91780c = p12;
        this.f91781d = c49037b;
        this.f91782e = U.a(r02.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[PHI: r1
  0x004f: PHI (r1v12 java.lang.String) = (r1v11 java.lang.String), (r1v16 java.lang.String) binds: [B:16:0x0065, B:12:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.app_rater.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k androidx.fragment.app.ActivityC22955m r9, @Y61.l com.avito.android.app_rater.events.AppRaterEventSourcePage r10) {
        /*
            r8 = this;
            com.avito.android.P r0 = r8.f91780c
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.P.f67370w0
            r2 = 82
            r1 = r1[r2]
            com.avito.android.A0$a r0 = r0.f67427p0
            DE0.a r0 = r0.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1b
            return
        L1b:
            Y41.a<java.lang.Boolean> r0 = r8.f91783f
            com.avito.android.app_rater.c r0 = (com.avito.android.app_rater.c) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2c
            return
        L2c:
            java.lang.String r0 = "unknown"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L67
            r2 = 30
            if (r1 < r2) goto L51
            android.content.Context r1 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L67
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L67
            android.content.Context r2 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L67
            android.content.pm.InstallSourceInfo r1 = androidx.media3.exoplayer.source.mediaparser.d.h(r1, r2)     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = androidx.media3.exoplayer.source.mediaparser.d.n(r1)     // Catch: java.lang.Exception -> L67
            if (r1 != 0) goto L4f
            goto L67
        L4f:
            r0 = r1
            goto L67
        L51:
            android.content.Context r1 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L67
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L67
            android.content.Context r2 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L67
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L67
            java.lang.String r1 = r1.getInstallerPackageName(r2)     // Catch: java.lang.Exception -> L67
            if (r1 != 0) goto L4f
        L67:
            r5 = r0
            td.a r0 = r8.f91779b
            com.google.common.collect.H1 r0 = r0.f439367a
            java.util.Iterator r1 = r0.iterator()
        L70:
            boolean r2 = r1.hasNext()
            r7 = 0
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.avito.android.app_rater.interactor.d r3 = (com.avito.android.app_rater.interactor.d) r3
            java.lang.String r3 = r3.a()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L70
            goto L8a
        L89:
            r2 = r7
        L8a:
            com.avito.android.app_rater.interactor.d r2 = (com.avito.android.app_rater.interactor.d) r2
            if (r2 != 0) goto Lac
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.avito.android.app_rater.interactor.d r2 = (com.avito.android.app_rater.interactor.d) r2
            boolean r1 = r2 instanceof com.avito.android.app_rater.interactor.t
            if (r1 == 0) goto L92
            goto Lac
        La4:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r10 = "Collection contains no element matching the predicate."
            r9.<init>(r10)
            throw r9
        Lac:
            boolean r0 = r2.getF91816a()
            if (r0 == 0) goto Lb9
            boolean r0 = r2.b()
            if (r0 == 0) goto Lb9
            goto Lba
        Lb9:
            r2 = r7
        Lba:
            if (r2 != 0) goto Lbd
            return
        Lbd:
            java.time.ZoneOffset r0 = java.time.ZoneOffset.UTC
            java.time.LocalDateTime r0 = java.time.LocalDateTime.now(r0)
            ud.b r1 = r8.f91781d
            r1.b(r0)
            java.lang.String r10 = r10.f91800b
            sd.b r0 = new sd.b
            r0.<init>(r10)
            com.avito.android.analytics.a r10 = r8.f91778a
            r10.c(r0)
            com.avito.android.app_rater.d r10 = new com.avito.android.app_rater.d
            r6 = 0
            r1 = r10
            r3 = r9
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = 3
            kotlinx.coroutines.internal.h r0 = r8.f91782e
            kotlinx.coroutines.C43259k.d(r0, r7, r7, r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.app_rater.b.a(androidx.fragment.app.m, com.avito.android.app_rater.events.AppRaterEventSourcePage):void");
    }
}
