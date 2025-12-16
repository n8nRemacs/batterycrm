package leakcanary;

import android.app.Application;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import shark.j3;

/* compiled from: AppWatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lleakcanary/b;", "", "<init>", "()V", "a", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43744b {

    /* renamed from: b, reason: collision with root package name */
    public static RuntimeException f414038b;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C43744b f414040d = new C43744b();

    /* renamed from: a, reason: collision with root package name */
    public static volatile long f414037a = -1;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final y f414039c = new y(C11797b.f414047a, c.f414048b, d.f414049l);

    /* compiled from: AppWatcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/b$a;", "", "a", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
    @InterfaceC42830m
    /* renamed from: leakcanary.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f414041a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f414042b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f414043c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f414044d;

        /* renamed from: e, reason: collision with root package name */
        public final long f414045e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f414046f;

        /* compiled from: AppWatcher.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/b$a$a;", "", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
        @InterfaceC42830m
        /* renamed from: leakcanary.b$a$a, reason: collision with other inner class name */
        public static final class C11796a {
        }

        public a() {
            this(false, false, false, false, 0L, false, 63, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f414041a == aVar.f414041a && this.f414042b == aVar.f414042b && this.f414043c == aVar.f414043c && this.f414044d == aVar.f414044d && this.f414045e == aVar.f414045e && this.f414046f == aVar.f414046f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            boolean z12 = this.f414041a;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = i12 * 31;
            boolean z13 = this.f414042b;
            int i14 = z13;
            if (z13 != 0) {
                i14 = 1;
            }
            int i15 = (i13 + i14) * 31;
            boolean z14 = this.f414043c;
            int i16 = z14;
            if (z14 != 0) {
                i16 = 1;
            }
            int i17 = (i15 + i16) * 31;
            boolean z15 = this.f414044d;
            int i18 = z15;
            if (z15 != 0) {
                i18 = 1;
            }
            long j12 = this.f414045e;
            int i19 = (((i17 + i18) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            boolean z16 = this.f414046f;
            return i19 + (z16 ? 1 : z16 ? 1 : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Config(watchActivities=");
            sb2.append(this.f414041a);
            sb2.append(", watchFragments=");
            sb2.append(this.f414042b);
            sb2.append(", watchFragmentViews=");
            sb2.append(this.f414043c);
            sb2.append(", watchViewModels=");
            sb2.append(this.f414044d);
            sb2.append(", watchDurationMillis=");
            sb2.append(this.f414045e);
            sb2.append(", enabled=");
            return androidx.appcompat.app.r.s(")", sb2, this.f414046f);
        }

        public a(boolean z12, boolean z13, boolean z14, boolean z15, long j12, boolean z16, int i12, C42822w c42822w) {
            z12 = (i12 & 1) != 0 ? true : z12;
            z13 = (i12 & 2) != 0 ? true : z13;
            z14 = (i12 & 4) != 0 ? true : z14;
            z15 = (i12 & 8) != 0 ? true : z15;
            j12 = (i12 & 16) != 0 ? TimeUnit.SECONDS.toMillis(5L) : j12;
            z16 = (i12 & 32) != 0 ? true : z16;
            this.f414041a = z12;
            this.f414042b = z13;
            this.f414043c = z14;
            this.f414044d = z15;
            this.f414045e = j12;
            this.f414046f = z16;
        }
    }

    /* compiled from: AppWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "uptimeMillis"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.b$b, reason: collision with other inner class name */
    public static final class C11797b implements InterfaceC43750h {

        /* renamed from: a, reason: collision with root package name */
        public static final C11797b f414047a = new C11797b();

        @Override // leakcanary.InterfaceC43750h
        public final long a() {
            return SystemClock.uptimeMillis();
        }
    }

    /* compiled from: AppWatcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "execute", "(Ljava/lang/Runnable;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.b$c */
    public static final class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public static final c f414048b = new c();

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C43744b.f414040d.getClass();
            if (C43744b.f414038b == null) {
                throw new IllegalStateException("AppWatcher not installed");
            }
            leakcanary.internal.d.b().postDelayed(runnable, C43744b.f414037a);
        }
    }

    /* compiled from: AppWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.b$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f414049l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        new a(false, false, false, false, 0L, false, 63, null);
    }

    public static void a(C43744b c43744b, Application application) {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        y yVar = f414039c;
        c43744b.getClass();
        List listU = C42745f0.U(new C43743a(application, yVar), new C43753k(application, yVar), new H(yVar), new M(yVar));
        c43744b.getClass();
        leakcanary.internal.d.a();
        if (f414038b != null) {
            throw new IllegalStateException("AppWatcher already installed, see exception cause for prior install call", f414038b);
        }
        if (millis < 0) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.i(millis, "retainedDelayMillis ", " must be at least 0 ms").toString());
        }
        f414037a = millis;
        if ((application.getApplicationInfo().flags & 2) != 0) {
            u.f414121a.getClass();
            j3 j3Var = j3.f438639b;
            u uVar = new u();
            j3Var.getClass();
            j3.f438638a = uVar;
        }
        leakcanary.internal.e.f414089b.getClass();
        ((Y41.l) leakcanary.internal.e.f414088a.getValue()).invoke(application);
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            ((InterfaceC43760s) it.next()).a();
        }
        f414038b = new RuntimeException("manualInstall() first called here");
    }
}
