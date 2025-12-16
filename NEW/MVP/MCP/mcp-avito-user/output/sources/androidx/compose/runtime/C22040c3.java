package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22176v;
import kotlin.Metadata;

/* compiled from: SnapshotFloatState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/c3;", "Landroidx/compose/runtime/snapshots/W;", "Landroidx/compose/runtime/v1;", "Landroidx/compose/runtime/snapshots/C;", "", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.c3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22040c3 extends androidx.compose.runtime.snapshots.W implements InterfaceC22192v1, androidx.compose.runtime.snapshots.C<Float> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public a f38188c;

    /* compiled from: SnapshotFloatState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/c3$a;", "Landroidx/compose/runtime/snapshots/X;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.c3$a */
    public static final class a extends androidx.compose.runtime.snapshots.X {

        /* renamed from: c, reason: collision with root package name */
        public float f38189c;

        public a(long j12, float f12) {
            super(j12);
            this.f38189c = f12;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k androidx.compose.runtime.snapshots.X x12) {
            this.f38189c = ((a) x12).f38189c;
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final androidx.compose.runtime.snapshots.X b() {
            return c(C22176v.j().getF38722b());
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final androidx.compose.runtime.snapshots.X c(long j12) {
            return new a(j12, this.f38189c);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC22192v1
    public final void S6(float f12) {
        AbstractC22167l abstractC22167lJ;
        a aVar = (a) C22176v.h(this.f38188c);
        if (aVar.f38189c == f12) {
            return;
        }
        a aVar2 = this.f38188c;
        synchronized (C22176v.f38750c) {
            AbstractC22167l.f38720e.getClass();
            abstractC22167lJ = C22176v.j();
            ((a) C22176v.n(aVar2, this, abstractC22167lJ, aVar)).f38189c = f12;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        C22176v.m(abstractC22167lJ, this);
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.l
    public final androidx.compose.runtime.snapshots.X a(@Y61.k androidx.compose.runtime.snapshots.X x12, @Y61.k androidx.compose.runtime.snapshots.X x13, @Y61.k androidx.compose.runtime.snapshots.X x14) {
        if (((a) x13).f38189c == ((a) x14).f38189c) {
            return x13;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final androidx.compose.runtime.snapshots.X d() {
        return this.f38188c;
    }

    @Override // androidx.compose.runtime.InterfaceC22192v1, androidx.compose.runtime.InterfaceC22207z0
    public final float f() {
        return ((a) C22176v.s(this.f38188c, this)).f38189c;
    }

    @Override // androidx.compose.runtime.snapshots.C
    @Y61.k
    public final InterfaceC22116k3<Float> h() {
        return L3.f38023a;
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k androidx.compose.runtime.snapshots.X x12) {
        this.f38188c = (a) x12;
    }

    @Y61.k
    public final String toString() {
        return "MutableFloatState(value=" + ((a) C22176v.h(this.f38188c)).f38189c + ")@" + hashCode();
    }
}
