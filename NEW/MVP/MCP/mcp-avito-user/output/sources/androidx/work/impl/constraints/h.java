package androidx.work.impl.constraints;

import Y61.k;
import androidx.work.G;
import androidx.work.impl.model.H;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.M;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f55709a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f55710b = 0;

    static {
        G.b("WorkConstraintsTracker");
        f55709a = 1000L;
    }

    @k
    public static final P0 a(@k f fVar, @k H h12, @k M m12, @k e eVar) {
        P0 p0A = Q0.a();
        C43259k.d(U.a(m12.plus(p0A)), null, null, new g(fVar, h12, eVar, null), 3);
        return p0A;
    }
}
