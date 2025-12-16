package androidx.compose.runtime.snapshots;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/c;", "Landroidx/compose/runtime/snapshots/e;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22158c extends C22160e {

    /* compiled from: Snapshot.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "invalid", "Landroidx/compose/runtime/snapshots/e;", "invoke", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.snapshots.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C22174t, C22160e> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f38698l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f38699m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l<Object, G0> lVar, Y41.l<Object, G0> lVar2) {
            super(1);
            this.f38698l = lVar;
            this.f38699m = lVar2;
        }

        @Override // Y41.l
        public final C22160e invoke(C22174t c22174t) {
            long j12;
            C22174t c22174t2 = c22174t;
            synchronized (C22176v.f38750c) {
                j12 = C22176v.f38752e;
                C22176v.f38752e = 1 + j12;
            }
            return new C22160e(j12, c22174t2, this.f38698l, this.f38699m);
        }
    }

    /* compiled from: Snapshot.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "invalid", "Landroidx/compose/runtime/snapshots/j;", "invoke", "(Landroidx/compose/runtime/snapshots/t;)Landroidx/compose/runtime/snapshots/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.snapshots.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<C22174t, C22165j> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f38700l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l<Object, G0> lVar) {
            super(1);
            this.f38700l = lVar;
        }

        @Override // Y41.l
        public final C22165j invoke(C22174t c22174t) {
            long j12;
            C22174t c22174t2 = c22174t;
            synchronized (C22176v.f38750c) {
                j12 = C22176v.f38752e;
                C22176v.f38752e = 1 + j12;
            }
            return new C22165j(j12, c22174t2, this.f38700l);
        }
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.k
    public final C22160e C(@Y61.l Y41.l<Object, G0> lVar, @Y61.l Y41.l<Object, G0> lVar2) {
        a aVar = new a(lVar, lVar2);
        Y41.l<C22174t, G0> lVar3 = C22176v.f38748a;
        return (C22160e) ((AbstractC22167l) C22176v.e(new C22178x(aVar)));
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void c() {
        synchronized (C22176v.f38750c) {
            o();
            G0 g02 = G0.f406611a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void k() {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void l() {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void m() {
        C22176v.e(C22176v.f38748a);
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.k
    public final AbstractC22167l u(@Y61.l Y41.l<Object, G0> lVar) {
        b bVar = new b(lVar);
        Y41.l<C22174t, G0> lVar2 = C22176v.f38748a;
        return (C22165j) ((AbstractC22167l) C22176v.e(new C22178x(bVar)));
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.k
    public final AbstractC22168m w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
