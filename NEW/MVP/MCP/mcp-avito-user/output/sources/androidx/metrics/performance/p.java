package androidx.metrics.performance;

import android.view.View;
import com.avito.android.R;
import j.j0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerformanceMetricsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/metrics/performance/p;", "", "<init>", "()V", "a", "b", "c", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f52728f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52733e;

    /* compiled from: PerformanceMetricsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/metrics/performance/p$a;", "", "<init>", "()V", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @j0
        @Y61.k
        public static b a(@Y61.k View view) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new b();
                rootView.setTag(R.id.metricsStateHolder, tag);
            }
            return (b) tag;
        }

        public a() {
        }
    }

    /* compiled from: PerformanceMetricsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/metrics/performance/p$b;", "", "<init>", "()V", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public p f52734a;
    }

    /* compiled from: PerformanceMetricsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/p$c;", "", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public long f52735a;
    }

    public /* synthetic */ p(C42822w c42822w) {
        this();
    }

    public final void a(long j12, long j13, ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList2.size() - 1;
        ArrayList arrayList3 = this.f52731c;
        if (size >= 0) {
            while (true) {
                int i12 = size - 1;
                c cVar = (c) arrayList2.get(size);
                long j14 = cVar.f52735a;
                if (j14 > 0 && j14 < j12) {
                    c cVar2 = (c) arrayList2.remove(size);
                    synchronized (this.f52733e) {
                        try {
                            this.f52733e.add(cVar2);
                        } catch (OutOfMemoryError unused) {
                            this.f52733e.clear();
                            this.f52733e.add(cVar2);
                        }
                    }
                } else if (0 < j13) {
                    arrayList3.add(cVar);
                    if (arrayList2.equals(this.f52730b) && cVar.f52735a == -1) {
                        cVar.f52735a = j12;
                    }
                }
                if (i12 < 0) {
                    break;
                } else {
                    size = i12;
                }
            }
        }
        if (arrayList3.size() <= 0) {
            return;
        }
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            ArrayList arrayList4 = this.f52732d;
            if (i13 >= size2) {
                for (int size3 = arrayList4.size() - 1; -1 < size3; size3--) {
                    arrayList3.remove(((Number) arrayList4.get(size3)).intValue());
                }
                int size4 = arrayList3.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((c) arrayList3.get(i14)).getClass();
                    arrayList.add(null);
                }
                arrayList3.clear();
                arrayList4.clear();
                return;
            }
            if (!arrayList4.contains(Integer.valueOf(i13))) {
                c cVar3 = (c) arrayList3.get(i13);
                int i15 = i13 + 1;
                if (i15 < arrayList3.size()) {
                    cVar3.getClass();
                    throw null;
                }
            }
            i13++;
        }
    }

    public final void b(long j12, long j13, @Y61.k ArrayList arrayList) {
        synchronized (this.f52730b) {
            arrayList.clear();
            a(j12, j13, arrayList, this.f52729a);
            a(j12, j13, arrayList, this.f52730b);
            G0 g02 = G0.f406611a;
        }
    }

    public p() {
        this.f52729a = new ArrayList();
        this.f52730b = new ArrayList();
        this.f52731c = new ArrayList();
        this.f52732d = new ArrayList();
        this.f52733e = new ArrayList();
    }
}
