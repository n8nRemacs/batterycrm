package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/X;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public long f38674a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public X f38675b;

    public X(long j12) {
        this.f38674a = j12;
    }

    public abstract void a(@Y61.k X x12);

    @Y61.k
    public abstract X b();

    @Y61.k
    public X c(long j12) {
        X xB2 = b();
        xB2.f38674a = j12;
        return xB2;
    }

    public X() {
        this(C22176v.j().getF38722b());
    }
}
