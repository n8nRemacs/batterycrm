package androidx.work.impl.constraints.controllers;

import Y61.k;
import androidx.work.G;
import androidx.work.NetworkType;
import androidx.work.impl.model.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContraintControllers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/constraints/controllers/g;", "Landroidx/work/impl/constraints/controllers/a;", "Landroidx/work/impl/constraints/d;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends androidx.work.impl.constraints.controllers.a<androidx.work.impl.constraints.d> {

    /* compiled from: ContraintControllers.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/constraints/controllers/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        G.b("NetworkNotRoamingCtrlr");
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean a(@k H h12) {
        return h12.f55804j.f55487a == NetworkType.f55398e;
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final int d() {
        return 7;
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final boolean e(androidx.work.impl.constraints.d dVar) {
        androidx.work.impl.constraints.d dVar2 = dVar;
        return (dVar2.f55692a && dVar2.f55695d) ? false : true;
    }
}
