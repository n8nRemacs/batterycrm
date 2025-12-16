package androidx.metrics.performance;

import android.view.Choreographer;
import android.view.View;
import androidx.metrics.performance.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: JankStatsApi16Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/metrics/performance/g;", "Landroidx/metrics/performance/m;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class g extends m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WeakReference<View> f52707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Choreographer f52708d = Choreographer.getInstance();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p.b f52709e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52710f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final c f52711g;

    /* compiled from: JankStatsApi16Impl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/metrics/performance/g$a", "Landroidx/metrics/performance/o;", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f52712a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f52713b;

        public a(f fVar, g gVar) {
            this.f52712a = fVar;
            this.f52713b = gVar;
        }

        @Override // androidx.metrics.performance.o
        public final void a(long j12, long j13, long j14) {
            f fVar = this.f52712a;
            long j15 = (long) (j14 * fVar.f52706d);
            g gVar = this.f52713b;
            p pVar = gVar.f52709e.f52734a;
            if (pVar != null) {
                pVar.b(j12, j12 + j13, gVar.f52710f);
            }
            boolean z12 = j13 > j15;
            c cVar = gVar.f52711g;
            cVar.f52696b = j12;
            cVar.f52697c = j13;
            cVar.f52698d = z12;
            fVar.f52703a.a(cVar);
        }
    }

    public g(@Y61.k f fVar, @Y61.k View view) {
        this.f52707c = new WeakReference<>(view);
        p.f52728f.getClass();
        this.f52709e = p.a.a(view);
        ArrayList arrayList = new ArrayList();
        this.f52710f = arrayList;
        this.f52711g = new c(arrayList);
        new a(fVar, this);
    }
}
