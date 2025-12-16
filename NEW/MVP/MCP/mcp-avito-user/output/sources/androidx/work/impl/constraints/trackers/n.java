package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Trackers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/trackers/n;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f55727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g<Boolean> f55728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f55729c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g<androidx.work.impl.constraints.d> f55730d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g<Boolean> f55731e;

    @X41.j
    public n() {
        throw null;
    }

    public n(Context context, androidx.work.impl.utils.taskexecutor.b bVar, g gVar, c cVar, g gVar2, g gVar3, int i12, C42822w c42822w) {
        gVar = (i12 & 4) != 0 ? new a(context.getApplicationContext(), bVar) : gVar;
        cVar = (i12 & 8) != 0 ? new c(context.getApplicationContext(), bVar) : cVar;
        if ((i12 & 16) != 0) {
            Context applicationContext = context.getApplicationContext();
            int i13 = j.f55725a;
            gVar2 = new i(applicationContext, bVar);
        }
        gVar3 = (i12 & 32) != 0 ? new l(context.getApplicationContext(), bVar) : gVar3;
        this.f55727a = context;
        this.f55728b = gVar;
        this.f55729c = cVar;
        this.f55730d = gVar2;
        this.f55731e = gVar3;
    }
}
