package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectionRegistrarImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/X0;", "Landroidx/compose/foundation/text/selection/V0;", "<init>", "()V", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 implements V0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31890f = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f31891a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f31892b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.H0<InterfaceC21041v> f31893c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f31894d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31895e;

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/text/selection/X0;", "it", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/text/selection/X0;)Ljava/lang/Long;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, X0, Long> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f31896l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Long invoke(androidx.compose.runtime.saveable.x xVar, X0 x02) {
            return Long.valueOf(x02.f31894d.get());
        }
    }

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/text/selection/X0;", "invoke", "(J)Landroidx/compose/foundation/text/selection/X0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Long, X0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f31897l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final X0 invoke(Long l12) {
            return new X0(l12.longValue(), null);
        }
    }

    /* compiled from: SelectionRegistrarImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/selection/X0$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
        a aVar = a.f31896l;
        b bVar = b.f31897l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        new androidx.compose.runtime.saveable.w(bVar, aVar);
    }

    public /* synthetic */ X0(long j12, C42822w c42822w) {
        this(j12);
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final void a(long j12) {
        this.f31891a = false;
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final void b(@Y61.k InterfaceC21041v interfaceC21041v) {
        long f32124a = interfaceC21041v.getF32124a();
        androidx.collection.H0<InterfaceC21041v> h02 = this.f31893c;
        if (h02.a(f32124a)) {
            this.f31892b.remove(interfaceC21041v);
            h02.g(interfaceC21041v.getF32124a());
        }
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final long d() {
        AtomicLong atomicLong = this.f31894d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.V0
    @Y61.k
    public final InterfaceC21041v f(@Y61.k C21035s c21035s) {
        long j12 = c21035s.f32124a;
        if (j12 == 0) {
            androidx.compose.foundation.internal.e.a("The selectable contains an invalid id: " + j12);
        }
        androidx.collection.H0<InterfaceC21041v> h02 = this.f31893c;
        if (h02.a(j12)) {
            androidx.compose.foundation.internal.e.a("Another selectable with the id: " + c21035s + ".selectableId has already subscribed.");
        }
        h02.h(j12, c21035s);
        this.f31892b.add(c21035s);
        this.f31891a = false;
        return c21035s;
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final boolean g(@Y61.k androidx.compose.ui.layout.A a12, long j12, long j13, @Y61.k InterfaceC21049z interfaceC21049z, boolean z12) {
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.V0
    @Y61.k
    public final androidx.collection.Y<C21045x> h() {
        return (androidx.collection.Y) ((C22082i3) this.f31895e).getF42167b();
    }

    @Y61.k
    public final ArrayList j(@Y61.k androidx.compose.ui.layout.A a12) {
        boolean z12 = this.f31891a;
        ArrayList arrayList = this.f31892b;
        if (!z12) {
            C42745f0.z0(arrayList, new W0(0, new Y0(a12)));
            this.f31891a = true;
        }
        return arrayList;
    }

    public X0(long j12) {
        this.f31892b = new ArrayList();
        this.f31893c = androidx.collection.Z.a();
        this.f31894d = new AtomicLong(j12);
        this.f31895e = C22126m3.g(androidx.collection.Z.f25658a);
    }

    public X0() {
        this(1L);
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final void c() {
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final void e(long j12) {
    }

    @Override // androidx.compose.foundation.text.selection.V0
    public final void i(@Y61.k androidx.compose.ui.layout.A a12, long j12, @Y61.k InterfaceC21049z interfaceC21049z, boolean z12) {
    }
}
