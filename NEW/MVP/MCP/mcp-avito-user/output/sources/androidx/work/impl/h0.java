package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.WorkInfo;
import androidx.work.impl.model.H;
import androidx.work.impl.utils.C23596f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: WorkerUpdater.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class h0 {

    /* compiled from: WorkerUpdater.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y f55747l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f55748m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c0 f55749n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.c0 c0Var, Y y12, String str) {
            super(0);
            this.f55747l = y12;
            this.f55748m = str;
            this.f55749n = c0Var;
        }

        @Override // Y41.a
        public final G0 invoke() {
            androidx.work.c0 c0Var = this.f55749n;
            Y y12 = this.f55747l;
            String str = this.f55748m;
            g0 g0Var = new g0(c0Var, y12, str);
            androidx.work.impl.model.I iA2 = y12.f55559d.A();
            ArrayList arrayListD = iA2.D(str);
            if (arrayListD.size() > 1) {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
            H.b bVar = (H.b) C42745f0.G(arrayListD);
            if (bVar == null) {
                g0Var.invoke();
            } else {
                String str2 = bVar.f55819a;
                androidx.work.impl.model.H hI2 = iA2.i(str2);
                if (hI2 == null) {
                    throw new IllegalStateException(androidx.camera.core.Q.a("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"));
                }
                if (!hI2.d()) {
                    throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                }
                if (bVar.f55820b == WorkInfo.State.f55424g) {
                    iA2.b(str2);
                    g0Var.invoke();
                } else {
                    final androidx.work.impl.model.H hB2 = androidx.work.impl.model.H.b(c0Var.f55479b, bVar.f55819a, null, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                    C23588s c23588s = y12.f55562g;
                    final WorkDatabase workDatabase = y12.f55559d;
                    C23538b c23538b = y12.f55558c;
                    final List<InterfaceC23590u> list = y12.f55561f;
                    final HashSet hashSet = c0Var.f55480c;
                    androidx.work.impl.model.I iA3 = workDatabase.A();
                    final String str3 = hB2.f55795a;
                    final androidx.work.impl.model.H hI3 = iA3.i(str3);
                    if (hI3 == null) {
                        throw new IllegalArgumentException(AK.c.k("Worker with ", str3, " doesn't exist"));
                    }
                    if (!hI3.f55796b.a()) {
                        if (hI3.d() ^ hB2.d()) {
                            j0 j0Var = j0.f55752l;
                            StringBuilder sb2 = new StringBuilder("Can't update ");
                            sb2.append((String) j0Var.invoke(hI3));
                            sb2.append(" Worker to ");
                            throw new UnsupportedOperationException(AK.c.s(sb2, (String) j0Var.invoke(hB2), " Worker. Update operation must preserve worker's type."));
                        }
                        final boolean zE2 = c23588s.e(str3);
                        if (!zE2) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC23590u) it.next()).h(str3);
                            }
                        }
                        workDatabase.r(new Runnable() { // from class: androidx.work.impl.f0
                            @Override // java.lang.Runnable
                            public final void run() {
                                WorkDatabase workDatabase2 = workDatabase;
                                androidx.work.impl.model.I iA4 = workDatabase2.A();
                                androidx.work.impl.model.q0 q0VarB = workDatabase2.B();
                                androidx.work.impl.model.H h12 = hI3;
                                WorkInfo.State state = h12.f55796b;
                                int i12 = h12.f55805k;
                                long j12 = h12.f55808n;
                                int i13 = h12.f55814t + 1;
                                long j13 = h12.f55815u;
                                int i14 = h12.f55816v;
                                androidx.work.impl.model.H h13 = hB2;
                                androidx.work.impl.model.H hB3 = androidx.work.impl.model.H.b(h13, null, state, null, null, i12, j12, h12.f55813s, i13, j13, i14, 12835837);
                                if (h13.f55816v == 1) {
                                    hB3.f55815u = h13.f55815u;
                                    hB3.f55816v++;
                                }
                                iA4.o(C23596f.b(hB3));
                                String str4 = str3;
                                q0VarB.a(str4);
                                q0VarB.c(str4, hashSet);
                                if (zE2) {
                                    return;
                                }
                                iA4.x(-1L, str4);
                                workDatabase2.z().b(str4);
                            }
                        });
                        if (!zE2) {
                            C23612w.b(c23538b, workDatabase, list);
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    @Y61.k
    @RestrictTo
    public static final androidx.work.L a(@Y61.k androidx.work.c0 c0Var, @Y61.k Y y12, @Y61.k String str) {
        return androidx.work.P.a(y12.f55558c.f55462p, "enqueueUniquePeriodic_".concat(str), y12.f55560e.f56028a, new a(c0Var, y12, str));
    }
}
