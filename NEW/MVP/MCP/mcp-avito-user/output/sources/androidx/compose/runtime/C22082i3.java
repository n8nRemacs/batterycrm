package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22158c;
import androidx.compose.runtime.snapshots.C22176v;
import kotlin.Metadata;

/* compiled from: SnapshotState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/i3;", "T", "Landroidx/compose/runtime/snapshots/W;", "Landroidx/compose/runtime/snapshots/C;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22082i3<T> extends androidx.compose.runtime.snapshots.W implements androidx.compose.runtime.snapshots.C<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22116k3<T> f38419c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public a<T> f38420d;

    /* compiled from: SnapshotState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/i3$a;", "T", "Landroidx/compose/runtime/snapshots/X;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.i3$a */
    public static final class a<T> extends androidx.compose.runtime.snapshots.X {

        /* renamed from: c, reason: collision with root package name */
        public T f38421c;

        public a(long j12, T t12) {
            super(j12);
            this.f38421c = t12;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k androidx.compose.runtime.snapshots.X x12) {
            this.f38421c = ((a) x12).f38421c;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final androidx.compose.runtime.snapshots.X b() {
            return new a(C22176v.j().getF38722b(), this.f38421c);
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final androidx.compose.runtime.snapshots.X c(long j12) {
            return new a(C22176v.j().getF38722b(), this.f38421c);
        }
    }

    public C22082i3(T t12, @Y61.k InterfaceC22116k3<T> interfaceC22116k3) {
        this.f38419c = interfaceC22116k3;
        AbstractC22167l abstractC22167lJ = C22176v.j();
        a<T> aVar = new a<>(abstractC22167lJ.getF38722b(), t12);
        if (!(abstractC22167lJ instanceof C22158c)) {
            aVar.f38675b = new a(1, t12);
        }
        this.f38420d = aVar;
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.l
    public final androidx.compose.runtime.snapshots.X a(@Y61.k androidx.compose.runtime.snapshots.X x12, @Y61.k androidx.compose.runtime.snapshots.X x13, @Y61.k androidx.compose.runtime.snapshots.X x14) {
        if (this.f38419c.a(((a) x13).f38421c, ((a) x14).f38421c)) {
            return x13;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final androidx.compose.runtime.snapshots.X d() {
        return this.f38420d;
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final T getF42167b() {
        return ((a) C22176v.s(this.f38420d, this)).f38421c;
    }

    @Override // androidx.compose.runtime.snapshots.C
    @Y61.k
    public final InterfaceC22116k3<T> h() {
        return this.f38419c;
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k androidx.compose.runtime.snapshots.X x12) {
        this.f38420d = (a) x12;
    }

    @Override // androidx.compose.runtime.InterfaceC22204y1
    public final void setValue(T t12) {
        AbstractC22167l abstractC22167lJ;
        a aVar = (a) C22176v.h(this.f38420d);
        if (this.f38419c.a(aVar.f38421c, t12)) {
            return;
        }
        a<T> aVar2 = this.f38420d;
        synchronized (C22176v.f38750c) {
            AbstractC22167l.f38720e.getClass();
            abstractC22167lJ = C22176v.j();
            ((a) C22176v.n(aVar2, this, abstractC22167lJ, aVar)).f38421c = t12;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        C22176v.m(abstractC22167lJ, this);
    }

    @Y61.k
    public final String toString() {
        return "MutableState(value=" + ((a) C22176v.h(this.f38420d)).f38421c + ")@" + hashCode();
    }
}
