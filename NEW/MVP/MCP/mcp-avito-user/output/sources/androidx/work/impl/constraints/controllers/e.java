package androidx.work.impl.constraints.controllers;

import Y61.k;
import androidx.work.NetworkType;
import androidx.work.impl.model.H;
import kotlin.Metadata;

/* compiled from: ContraintControllers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/controllers/e;", "Landroidx/work/impl/constraints/controllers/a;", "Landroidx/work/impl/constraints/d;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends a<androidx.work.impl.constraints.d> {
    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean a(@k H h12) {
        return h12.f55804j.f55487a == NetworkType.f55396c;
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final int d() {
        return 7;
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final boolean e(androidx.work.impl.constraints.d dVar) {
        androidx.work.impl.constraints.d dVar2 = dVar;
        return (dVar2.f55692a && dVar2.f55693b) ? false : true;
    }
}
