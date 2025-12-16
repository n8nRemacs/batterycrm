package B21;

import Y61.k;
import android.view.View;
import com.yandex.div.core.dagger.A;
import com.yandex.div.core.state.f;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import com.yandex.div.core.view2.divs.widgets.t;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.H0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: DivJoinedStateSwitcher.kt */
@A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB21/a;", "LB21/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C38029k f831a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C38040w f832b;

    @Inject
    public a(@k C38029k c38029k, @k C38040w c38040w) {
        this.f831a = c38029k;
        this.f832b = c38040w;
    }

    @Override // B21.e
    public final void a(@k H0.d dVar, @k List<com.yandex.div.core.state.f> list) {
        com.yandex.div.core.state.f fVar;
        com.yandex.div.core.state.f fVar2;
        C38029k c38029k = this.f831a;
        int i12 = 0;
        View childAt = c38029k.getChildAt(0);
        f.a aVar = com.yandex.div.core.state.f.f367661c;
        long j12 = dVar.f372522b;
        aVar.getClass();
        com.yandex.div.core.state.f fVarA = f.a.a(j12);
        int size = list.size();
        if (size == 0) {
            fVar = fVarA;
        } else if (size != 1) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                com.yandex.div.core.state.f fVar3 = (com.yandex.div.core.state.f) it.next();
                com.yandex.div.core.state.f fVar4 = (com.yandex.div.core.state.f) next;
                com.yandex.div.core.state.f.f367661c.getClass();
                long j13 = fVar4.f367662a;
                if (j13 != fVar3.f367662a) {
                    fVar2 = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i13 = i12;
                    for (Object obj : fVar4.f367663b) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        Q q12 = (Q) obj;
                        Q q13 = (Q) C42745f0.K(i13, fVar3.f367663b);
                        if (q13 == null || !L.f(q12, q13)) {
                            fVar2 = new com.yandex.div.core.state.f(j13, arrayList);
                            break;
                        } else {
                            arrayList.add(q12);
                            i13 = i14;
                        }
                    }
                    fVar2 = new com.yandex.div.core.state.f(j13, arrayList);
                }
                next = fVar2 == null ? fVarA : fVar2;
                i12 = 0;
            }
            fVar = (com.yandex.div.core.state.f) next;
        } else {
            fVar = (com.yandex.div.core.state.f) C42745f0.E(list);
        }
        boolean zIsEmpty = fVar.f367663b.isEmpty();
        AbstractC38330g abstractC38330g = dVar.f372521a;
        if (!zIsEmpty) {
            com.yandex.div.core.state.b.f367653a.getClass();
            t tVarE = com.yandex.div.core.state.b.e(childAt, fVar);
            AbstractC38330g abstractC38330gC = com.yandex.div.core.state.b.c(abstractC38330g, fVar);
            AbstractC38330g.o oVar = abstractC38330gC instanceof AbstractC38330g.o ? (AbstractC38330g.o) abstractC38330gC : null;
            if (tVarE != null && oVar != null) {
                childAt = tVarE;
                abstractC38330g = oVar;
                fVarA = fVar;
            }
        }
        com.yandex.div.core.state.f fVarB = fVarA.b();
        C38040w c38040w = this.f832b;
        c38040w.b(childAt, abstractC38330g, c38029k, fVarB);
        c38040w.a();
    }
}
