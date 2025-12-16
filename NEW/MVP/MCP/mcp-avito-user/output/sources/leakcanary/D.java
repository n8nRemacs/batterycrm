package leakcanary;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: ProcessInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/D;", "", "a", "b", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface D {

    /* compiled from: ProcessInfo.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lleakcanary/D$a;", "", "<init>", "()V", "a", "b", "c", "Lleakcanary/D$a$b;", "Lleakcanary/D$a$a;", "Lleakcanary/D$a$c;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static abstract class a {

        /* compiled from: ProcessInfo.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/D$a$a;", "Lleakcanary/D$a;", "<init>", "()V", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: leakcanary.D$a$a, reason: collision with other inner class name */
        public static final class C11793a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C11793a f413980a = new C11793a();

            public C11793a() {
                super(null);
            }
        }

        /* compiled from: ProcessInfo.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/D$a$b;", "Lleakcanary/D$a;", "<init>", "()V", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f413981a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: ProcessInfo.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/D$a$c;", "Lleakcanary/D$a;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public final long f413982a;

            public c(long j12) {
                super(null);
                this.f413982a = j12;
            }
        }

        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: ProcessInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/D$b;", "Lleakcanary/D;", "<init>", "()V", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    @SuppressLint({"NewApi"})
    public static final class b implements D {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final b f413987e = new b();

        /* renamed from: a, reason: collision with root package name */
        public static final ActivityManager.RunningAppProcessInfo f413983a = new ActivityManager.RunningAppProcessInfo();

        /* renamed from: b, reason: collision with root package name */
        public static final ActivityManager.MemoryInfo f413984b = new ActivityManager.MemoryInfo();

        /* renamed from: c, reason: collision with root package name */
        public static final InterfaceC42726C f413985c = C42727D.c(C11794b.f413989l);

        /* renamed from: d, reason: collision with root package name */
        public static final InterfaceC42726C f413986d = C42727D.c(a.f413988l);

        /* compiled from: ProcessInfo.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f413988l = new a();

            public a() {
                super(0);
            }

            @Override // Y41.a
            public final Long invoke() {
                b.f413987e.getClass();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(androidx.camera.camera2.internal.G.e(Process.myPid(), "/proc/", "/stat")), 8192);
                try {
                    String line = bufferedReader.readLine();
                    kotlin.io.c.a(bufferedReader, null);
                    return Long.valueOf((Long.parseLong((String) C43066x.e0(C43066x.m0(line, ") ", line), new char[]{' '}).get(19)) * 1000) / Os.sysconf(OsConstants._SC_CLK_TCK));
                } finally {
                }
            }
        }

        /* compiled from: ProcessInfo.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
        /* renamed from: leakcanary.D$b$b, reason: collision with other inner class name */
        public static final class C11794b extends kotlin.jvm.internal.N implements Y41.a<Long> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11794b f413989l = new C11794b();

            public C11794b() {
                super(0);
            }

            @Override // Y41.a
            public final Long invoke() {
                return Long.valueOf(Process.getStartUptimeMillis());
            }
        }

        @Override // leakcanary.D
        @Y61.k
        public final a a(@Y61.k Context context) {
            Object systemService = context.getSystemService("activity");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            ActivityManager activityManager = (ActivityManager) systemService;
            if (activityManager.isLowRamDevice()) {
                return a.b.f413981a;
            }
            ActivityManager.MemoryInfo memoryInfo = f413984b;
            activityManager.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory) {
                long j12 = memoryInfo.availMem;
                long j13 = memoryInfo.threshold;
                if (j12 > j13) {
                    long j14 = j12 - j13;
                    Runtime runtime = Runtime.getRuntime();
                    return new a.c(kotlin.ranges.s.d(j14, runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())));
                }
            }
            return a.C11793a.f413980a;
        }

        @Override // leakcanary.D
        public final boolean b() {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = f413983a;
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance >= 400;
        }

        @Override // leakcanary.D
        public final long c() {
            return SystemClock.uptimeMillis() - ((Number) f413985c.getValue()).longValue();
        }

        @Override // leakcanary.D
        @SuppressLint({"UsableSpace"})
        public final long d(@Y61.k File file) {
            return file.getUsableSpace();
        }
    }

    @Y61.k
    a a(@Y61.k Context context);

    boolean b();

    long c();

    long d(@Y61.k File file);
}
