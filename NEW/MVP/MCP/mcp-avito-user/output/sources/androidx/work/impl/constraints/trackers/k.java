package androidx.work.impl.constraints.trackers;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.G;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NetworkStateTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/trackers/k;", "Landroidx/work/impl/constraints/trackers/e;", "Landroidx/work/impl/constraints/d;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends e<androidx.work.impl.constraints.d> {
    @Override // androidx.work.impl.constraints.trackers.g
    public final Object a() {
        j.a(null);
        throw null;
    }

    @Override // androidx.work.impl.constraints.trackers.e
    @Y61.k
    public final IntentFilter e() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.e
    public final void f(@Y61.k Intent intent) {
        if (L.f(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            G gA2 = G.a();
            int i12 = j.f55725a;
            gA2.getClass();
            j.a(null);
            throw null;
        }
    }
}
