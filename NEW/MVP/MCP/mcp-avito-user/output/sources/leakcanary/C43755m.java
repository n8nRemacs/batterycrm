package leakcanary;

import android.os.Build;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;

/* compiled from: GoodAndroidVersionInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/m;", "Lleakcanary/q;", "<init>", "()V", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* renamed from: leakcanary.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43755m implements InterfaceC43759q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC42726C f414103a = C42727D.c(a.f414104l);

    /* compiled from: GoodAndroidVersionInterceptor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: leakcanary.m$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f414104l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 30) {
                return null;
            }
            return androidx.camera.camera2.internal.G.e(i12, "Build.VERSION.SDK_INT ", " not supported");
        }
    }

    @Override // leakcanary.InterfaceC43759q
    @Y61.k
    public final r.a a(@Y61.k RealHeapAnalysisJob realHeapAnalysisJob) {
        String str = (String) this.f414103a.getValue();
        if (str != null) {
            realHeapAnalysisJob.b(str);
        }
        return realHeapAnalysisJob.e();
    }
}
