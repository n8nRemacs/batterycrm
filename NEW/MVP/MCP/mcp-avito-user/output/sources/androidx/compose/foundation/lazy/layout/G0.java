package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.W0;
import androidx.compose.foundation.lazy.layout.C20714d0;
import androidx.compose.ui.layout.Y0;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.r;

/* compiled from: LazyLayoutPrefetchState.kt */
@W0
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/G0;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B f29274a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y0 f29275b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final K0 f29276c;

    /* compiled from: LazyLayoutPrefetchState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0083\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/G0$a;", "Landroidx/compose/foundation/lazy/layout/d0$b;", "Landroidx/compose/foundation/lazy/layout/I0;", "", "index", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/H0;", "prefetchMetrics", "<init>", "(Landroidx/compose/foundation/lazy/layout/G0;IJLandroidx/compose/foundation/lazy/layout/H0;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @W0
    public final class a implements C20714d0.b, I0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f29277a;

        /* renamed from: b, reason: collision with root package name */
        public final long f29278b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final H0 f29279c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public Y0.a f29280d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f29281e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f29282f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f29283g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public C1592a f29284h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f29285i;

        /* renamed from: j, reason: collision with root package name */
        public long f29286j;

        /* renamed from: k, reason: collision with root package name */
        public long f29287k;

        /* renamed from: l, reason: collision with root package name */
        public long f29288l;

        /* compiled from: LazyLayoutPrefetchState.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/G0$a$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.lazy.layout.G0$a$a, reason: collision with other inner class name */
        public final class C1592a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<C20714d0> f29290a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<I0>[] f29291b;

            /* renamed from: c, reason: collision with root package name */
            public int f29292c;

            /* renamed from: d, reason: collision with root package name */
            public int f29293d;

            public C1592a(@Y61.k List<C20714d0> list) {
                this.f29290a = list;
                this.f29291b = new List[list.size()];
                if (list.isEmpty()) {
                    androidx.compose.foundation.internal.e.a("NestedPrefetchController shouldn't be created with no states");
                }
            }
        }

        /* compiled from: LazyLayoutPrefetchState.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "it", "Landroidx/compose/ui/node/TraversableNode;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<TraversableNode, TraversableNode.Companion.TraverseDescendantsAction> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ l0.h<List<C20714d0>> f29295l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l0.h<List<C20714d0>> hVar) {
                super(1);
                this.f29295l = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Y41.l
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
                T tE02;
                C20714d0 c20714d0 = ((O0) traversableNode).f29357p;
                l0.h<List<C20714d0>> hVar = this.f29295l;
                List<C20714d0> list = hVar.f406842b;
                if (list != null) {
                    list.add(c20714d0);
                    tE02 = list;
                } else {
                    tE02 = C42745f0.e0(c20714d0);
                }
                hVar.f406842b = tE02;
                return TraversableNode.Companion.TraverseDescendantsAction.f40696c;
            }
        }

        public a() {
            throw null;
        }

        public a(int i12, long j12, H0 h02, C42822w c42822w) {
            this.f29277a = i12;
            this.f29278b = j12;
            this.f29279c = h02;
            r.b.f410658a.getClass();
            kotlin.time.o.f410656a.getClass();
            this.f29288l = kotlin.time.o.a();
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0150 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:62:0x0109, B:64:0x0111, B:66:0x0117, B:70:0x0126, B:72:0x0132, B:74:0x013f, B:73:0x0135, B:77:0x0144, B:78:0x0148, B:80:0x0150, B:84:0x0162, B:85:0x0169, B:86:0x0175), top: B:122:0x0109 }] */
        @Override // androidx.compose.foundation.lazy.layout.I0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(@Y61.k androidx.compose.foundation.lazy.layout.RunnableC20707a.b r16) {
            /*
                Method dump skipped, instructions count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.G0.a.a(androidx.compose.foundation.lazy.layout.a$b):boolean");
        }

        @Override // androidx.compose.foundation.lazy.layout.C20714d0.b
        public final void b() {
            this.f29285i = true;
        }

        public final void c(long j12) {
            if (this.f29282f) {
                androidx.compose.foundation.internal.e.a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f29281e) {
                androidx.compose.foundation.internal.e.a("Request was already measured!");
            }
            this.f29281e = true;
            Y0.a aVar = this.f29280d;
            if (aVar == null) {
                androidx.compose.foundation.internal.e.b("performComposition() must be called before performMeasure()");
                throw new KotlinNothingValueException();
            }
            int iD2 = aVar.d();
            for (int i12 = 0; i12 < iD2; i12++) {
                aVar.a(i12, j12);
            }
        }

        @Override // androidx.compose.foundation.lazy.layout.C20714d0.b
        public final void cancel() {
            if (this.f29282f) {
                return;
            }
            this.f29282f = true;
            Y0.a aVar = this.f29280d;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f29280d = null;
        }

        public final C1592a d() {
            Y0.a aVar = this.f29280d;
            if (aVar == null) {
                androidx.compose.foundation.internal.e.b("Should precompose before resolving nested prefetch states");
                throw new KotlinNothingValueException();
            }
            l0.h hVar = new l0.h();
            aVar.b(new b(hVar));
            List list = (List) hVar.f406842b;
            if (list != null) {
                return new C1592a(list);
            }
            return null;
        }

        public final void e() {
            r.b.f410658a.getClass();
            kotlin.time.o oVar = kotlin.time.o.f410656a;
            oVar.getClass();
            long jA2 = kotlin.time.o.a();
            long j12 = this.f29288l;
            oVar.getClass();
            long jC2 = kotlin.time.l.c(jA2, j12, DurationUnit.f410631c);
            long j13 = jC2 >> 1;
            e.a aVar = kotlin.time.e.f410651c;
            if ((1 & ((int) jC2)) != 0) {
                j13 = j13 > 9223372036854L ? Long.MAX_VALUE : j13 < -9223372036854L ? Long.MIN_VALUE : j13 * 1000000;
            }
            this.f29287k = j13;
            this.f29286j -= j13;
            this.f29288l = jA2;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
            sb2.append(this.f29277a);
            sb2.append(", constraints = ");
            sb2.append((Object) C22712b.n(this.f29278b));
            sb2.append(", isComposed = ");
            sb2.append(this.f29280d != null);
            sb2.append(", isMeasured = ");
            sb2.append(this.f29281e);
            sb2.append(", isCanceled = ");
            return androidx.appcompat.app.r.s(" }", sb2, this.f29282f);
        }
    }

    public G0(@Y61.k B b12, @Y61.k Y0 y02, @Y61.k K0 k02) {
        this.f29274a = b12;
        this.f29275b = y02;
        this.f29276c = k02;
    }
}
