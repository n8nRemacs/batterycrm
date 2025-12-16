package androidx.compose.runtime.snapshots.tooling;

import Y61.l;
import androidx.compose.runtime.InterfaceC22195w0;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SnapshotObserver.kt */
@P
@InterfaceC22195w0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/tooling/a;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.l<Object, G0> f38746a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<Object, G0> f38747b;

    public a() {
        this(null, null, 3, null);
    }

    public a(Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
        lVar = (i12 & 1) != 0 ? null : lVar;
        lVar2 = (i12 & 2) != 0 ? null : lVar2;
        this.f38746a = lVar;
        this.f38747b = lVar2;
    }
}
