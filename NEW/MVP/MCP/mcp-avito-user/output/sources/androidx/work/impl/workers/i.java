package androidx.work.impl.workers;

import androidx.appcompat.app.r;
import androidx.work.G;
import androidx.work.impl.model.C23574p;
import androidx.work.impl.model.H;
import androidx.work.impl.model.InterfaceC23575q;
import androidx.work.impl.model.InterfaceC23582y;
import androidx.work.impl.model.o0;
import androidx.work.impl.model.q0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DiagnosticsWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56083a = 0;

    static {
        G.b("DiagnosticsWrkr");
    }

    public static final String a(InterfaceC23582y interfaceC23582y, q0 q0Var, InterfaceC23575q interfaceC23575q, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            H h12 = (H) it.next();
            C23574p c23574pF = interfaceC23575q.f(o0.a(h12));
            Integer numValueOf = c23574pF != null ? Integer.valueOf(c23574pF.f55878c) : null;
            String str = h12.f55795a;
            String strO = C42745f0.O(interfaceC23582y.a(str), ",", null, null, null, 62);
            String strO2 = C42745f0.O(q0Var.b(str), ",", null, null, null, 62);
            StringBuilder sbA = r.A("\n", str, "\t ");
            sbA.append(h12.f55797c);
            sbA.append("\t ");
            sbA.append(numValueOf);
            sbA.append("\t ");
            sbA.append(h12.f55796b.name());
            sbA.append("\t ");
            sbA.append(strO);
            sbA.append("\t ");
            sbA.append(strO2);
            sbA.append('\t');
            sb2.append(sbA.toString());
        }
        return sb2.toString();
    }
}
