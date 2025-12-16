package leakcanary.internal;

import Y61.k;
import android.os.Debug;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import leakcanary.C43758p;
import leakcanary.InterfaceC43759q;
import leakcanary.r;
import leakcanary.u;
import okio.InterfaceC44804n;
import okio.M;
import okio.X;
import shark.B1;
import shark.C48236b2;
import shark.C48240c2;
import shark.C48330p2;
import shark.C48337r2;
import shark.C48344t1;
import shark.F1;
import shark.HprofRecordTag;
import shark.InterfaceC48348u1;
import shark.OnAnalysisProgressListener;
import shark.a3;
import shark.c3;
import shark.d3;
import shark.internal.P;
import shark.j3;
import shark.k3;
import shark.o3;
import shark.p3;

/* compiled from: RealHeapAnalysisJob.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lleakcanary/internal/RealHeapAnalysisJob;", "Lleakcanary/r;", "Lleakcanary/q$a;", "a", "StopAnalysis", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class RealHeapAnalysisJob implements r, InterfaceC43759q.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC42726C f414060a = C42727D.c(new h(this));

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<r.a.C11799a> f414061b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f414062c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public Thread f414063d;

    /* renamed from: e, reason: collision with root package name */
    public int f414064e;

    /* renamed from: f, reason: collision with root package name */
    public OnAnalysisProgressListener.Step f414065f;

    /* renamed from: g, reason: collision with root package name */
    public final Y41.a<File> f414066g;

    /* renamed from: h, reason: collision with root package name */
    public final C43758p f414067h;

    /* renamed from: i, reason: collision with root package name */
    public final List<InterfaceC43759q> f414068i;

    /* compiled from: RealHeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lleakcanary/internal/RealHeapAnalysisJob$a;", "", "<init>", "()V", "", "HPROF_PREFIX", "Ljava/lang/String;", "HPROF_SUFFIX", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: RealHeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() throws StopAnalysis {
            String strName;
            RealHeapAnalysisJob realHeapAnalysisJob = RealHeapAnalysisJob.this;
            OnAnalysisProgressListener.Step step = realHeapAnalysisJob.f414065f;
            if (step == null || (strName = step.name()) == null) {
                strName = "Reading heap dump";
            }
            if (realHeapAnalysisJob.f414061b.get() != null) {
                throw new StopAnalysis(strName);
            }
        }
    }

    /* compiled from: RealHeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/internal/RealHeapAnalysisJob$c", "Lshark/u1;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class c implements InterfaceC48348u1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C48344t1 f414071a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f414072b;

        public c(C48344t1 c48344t1, File file) {
            this.f414071a = c48344t1;
            this.f414072b = file;
        }

        @Override // shark.f3
        @k
        public final d3 a() {
            j3.f438639b.getClass();
            u uVar = j3.f438638a;
            if (uVar != null) {
                uVar.a("Deleting " + this.f414072b + " eagerly");
            }
            d3 d3VarA = this.f414071a.a();
            this.f414072b.delete();
            return d3VarA;
        }

        @Override // shark.o3
        @k
        public final InterfaceC44804n b() {
            return this.f414071a.f438704g.b();
        }
    }

    /* compiled from: RealHeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/n;", "openStreamingSource", "()Lokio/n;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class d implements o3 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l0.f f414073a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3 f414074b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f414075c;

        public d(l0.f fVar, p3 p3Var, File file) {
            this.f414073a = fVar;
            this.f414074b = p3Var;
            this.f414075c = file;
        }

        @Override // shark.o3
        @k
        public final InterfaceC44804n b() {
            this.f414073a.f406840b++;
            InterfaceC44804n interfaceC44804nB = this.f414074b.b();
            if (this.f414073a.f406840b == 2) {
                j3.f438639b.getClass();
                u uVar = j3.f438638a;
                if (uVar != null) {
                    uVar.a("Deleting " + this.f414075c + " eagerly");
                }
                this.f414075c.delete();
            }
            return interfaceC44804nB;
        }
    }

    /* compiled from: RealHeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() throws StopAnalysis {
            if (RealHeapAnalysisJob.this.f414061b.get() != null) {
                throw new StopAnalysis("stripping heap dump");
            }
        }
    }

    static {
        new a(null);
    }

    public RealHeapAnalysisJob(@k Y41.a aVar, @k C43758p c43758p, @k List list) {
        this.f414066g = aVar;
        this.f414067h = c43758p;
        this.f414068i = list;
    }

    public static void c(File file) throws IOException {
        Debug.dumpHprofData(file.getAbsolutePath());
        if (!file.exists()) {
            throw new IllegalStateException("File does not exist after dump");
        }
        if (file.length() > 0) {
            return;
        }
        throw new IllegalStateException(("File has length " + file.length() + " after dump").toString());
    }

    public final Q<B1, String> a(File file) {
        C48240c2 c48240c2;
        long length = file.length();
        C48344t1 c48344t1 = new C48344t1(new p3(file, new b()));
        c cVar = new c(c48344t1, file);
        C48240c2.a aVar = C48240c2.f438252k;
        C43758p c43758p = this.f414067h;
        a3 a3VarInvoke = c43758p.f414117g.invoke();
        C48330p2.f438666d.getClass();
        EnumSet enumSetOf = EnumSet.of(HprofRecordTag.f438062h, HprofRecordTag.f438064j, HprofRecordTag.f438063i, HprofRecordTag.f438068n, HprofRecordTag.f438065k, HprofRecordTag.f438066l, HprofRecordTag.f438067m, HprofRecordTag.f438069o, HprofRecordTag.f438076v);
        aVar.getClass();
        InterfaceC44804n interfaceC44804nB = cVar.b();
        try {
            C48236b2.f438244f.getClass();
            C48236b2 c48236b2A = C48236b2.a.a(interfaceC44804nB);
            kotlin.io.c.a(interfaceC44804nB, null);
            k3.f438644c.getClass();
            k3 k3Var = new k3(cVar, c48236b2A, null);
            P.f438415r.getClass();
            C48330p2 c48330p2 = new C48330p2(cVar, c48236b2A, P.b.b(k3Var, c48236b2A, a3VarInvoke, enumSetOf), null);
            c3.f438262e.getClass();
            d3 d3VarA = c48330p2.f438667a.a();
            C48236b2 c48236b2 = c48330p2.f438668b;
            C48240c2 c48240c22 = new C48240c2(c48236b2, new c3(d3VarA, c48236b2, null), c48330p2.f438669c);
            try {
                c48240c2 = c48240c22;
                try {
                    Q<B1, String> q12 = new Q<>(new F1(new g(this)).a(file, c48240c22, c43758p.f414115e, c43758p.f414111a, c43758p.f414114d, c43758p.f414112b, c43758p.f414113c), c48240c2.f438254c.toString() + ' ' + ("RandomAccess[bytes=" + c48344t1.f438698a + ",reads=" + c48344t1.f438699b + ",travel=" + c48344t1.f438700c + ",range=" + (c48344t1.f438703f - c48344t1.f438702e) + ",size=" + length + "]"));
                    kotlin.io.c.a(c48240c2, null);
                    return q12;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        kotlin.io.c.a(c48240c2, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                c48240c2 = c48240c22;
            }
        } finally {
        }
    }

    public final void b(@k String str) {
        AtomicReference<r.a.C11799a> atomicReference = this.f414061b;
        r.a.C11799a c11799a = new r.a.C11799a(str);
        while (!atomicReference.compareAndSet(null, c11799a) && atomicReference.get() == null) {
        }
    }

    @k
    public final r.a d() {
        if (!this.f414062c.compareAndSet(false, true)) {
            throw new IllegalStateException("HeapAnalysisJob can only be executed once");
        }
        j3.f438639b.getClass();
        u uVar = j3.f438638a;
        if (uVar != null) {
            uVar.a("Starting heap analysis job");
        }
        this.f414063d = Thread.currentThread();
        return e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final leakcanary.r.a e() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.RealHeapAnalysisJob.e():leakcanary.r$a");
    }

    public final void f(File file, File file2) {
        p3 p3Var = new p3(file, new e());
        l0.f fVar = new l0.f();
        fVar.f406840b = 0;
        d dVar = new d(fVar, p3Var, file);
        X x12 = new X(M.c(new FileOutputStream(file2)));
        new C48337r2();
        C48337r2.a(dVar, x12);
    }

    /* compiled from: RealHeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/internal/RealHeapAnalysisJob$StopAnalysis;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class StopAnalysis extends Exception {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f414069b;

        public StopAnalysis(@k String str) {
            this.f414069b = str;
        }

        @Override // java.lang.Throwable
        @k
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
