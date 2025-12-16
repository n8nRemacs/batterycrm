package leakcanary;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: HeapAnalysisClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/n;", "", "a", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43756n {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f414105d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Y41.a<File> f414106a;

    /* renamed from: b, reason: collision with root package name */
    public final C43758p f414107b;

    /* renamed from: c, reason: collision with root package name */
    public final List<InterfaceC43759q> f414108c;

    /* compiled from: HeapAnalysisClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/n$a;", "", "<init>", "()V", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: leakcanary.n$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: HeapAnalysisClient.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "name", "", "accept"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.n$b */
    public static final class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public static final b f414109a = new b();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C43066x.h0(str, "heap-", false) && C43066x.z(str, ".hprof", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43756n(@Y61.k Y41.a<? extends File> aVar, @Y61.k C43758p c43758p, @Y61.k List<? extends InterfaceC43759q> list) {
        this.f414106a = aVar;
        this.f414107b = c43758p;
        this.f414108c = list;
    }

    public final void a() {
        File[] fileArrListFiles = this.f414106a.invoke().listFiles(b.f414109a);
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
    }
}
