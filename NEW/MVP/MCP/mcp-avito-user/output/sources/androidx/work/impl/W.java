package androidx.work.impl;

import androidx.work.WorkerParameters;
import kotlin.Metadata;

/* compiled from: WorkLauncher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/W;", "Landroidx/work/impl/V;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class W implements V {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C23588s f55540a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.work.impl.utils.taskexecutor.b f55541b;

    public W(@Y61.k C23588s c23588s, @Y61.k androidx.work.impl.utils.taskexecutor.b bVar) {
        this.f55540a = c23588s;
        this.f55541b = bVar;
    }

    @Override // androidx.work.impl.V
    public final void a(@Y61.k C23613x c23613x, int i12) {
        this.f55541b.b(new androidx.work.impl.utils.H(this.f55540a, c23613x, false, i12));
    }

    public final void c(@Y61.k C23613x c23613x, @Y61.l WorkerParameters.a aVar) {
        this.f55541b.b(new Me.m(this, c23613x, aVar, 13));
    }
}
