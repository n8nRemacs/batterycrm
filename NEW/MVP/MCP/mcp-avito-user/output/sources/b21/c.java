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
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivMultipleStateSwitcher.kt */
@A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB21/c;", "LB21/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C38029k f835a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C38040w f836b;

    @Inject
    public c(@k C38029k c38029k, @k C38040w c38040w) {
        this.f835a = c38029k;
        this.f836b = c38040w;
    }

    @Override // B21.e
    public final void a(@k H0.d dVar, @k List<com.yandex.div.core.state.f> list) {
        AbstractC38330g abstractC38330g;
        C38040w c38040w;
        C38029k c38029k = this.f835a;
        View childAt = c38029k.getChildAt(0);
        com.yandex.div.core.state.b.f367653a.getClass();
        List listA = com.yandex.div.core.state.b.a(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (!((com.yandex.div.core.state.f) obj).f367663b.isEmpty()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            abstractC38330g = dVar.f372521a;
            c38040w = this.f836b;
            if (!zHasNext) {
                break;
            }
            com.yandex.div.core.state.f fVar = (com.yandex.div.core.state.f) it.next();
            com.yandex.div.core.state.b.f367653a.getClass();
            t tVarE = com.yandex.div.core.state.b.e(childAt, fVar);
            AbstractC38330g abstractC38330gC = com.yandex.div.core.state.b.c(abstractC38330g, fVar);
            AbstractC38330g.o oVar = abstractC38330gC instanceof AbstractC38330g.o ? (AbstractC38330g.o) abstractC38330gC : null;
            if (tVarE != null && oVar != null && !linkedHashSet.contains(tVarE)) {
                c38040w.b(tVarE, oVar, c38029k, fVar.b());
                linkedHashSet.add(tVarE);
            }
        }
        if (linkedHashSet.isEmpty()) {
            com.yandex.div.core.state.f.f367661c.getClass();
            c38040w.b(childAt, abstractC38330g, c38029k, f.a.a(dVar.f372522b));
        }
        c38040w.a();
    }
}
