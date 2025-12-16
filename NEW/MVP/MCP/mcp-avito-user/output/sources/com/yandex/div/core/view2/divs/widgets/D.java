package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import androidx.collection.q1;
import com.avito.android.R;
import com.yandex.div.core.U;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.c0;
import com.yandex.div2.C38584w0;
import com.yandex.div2.H;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import u21.C48774a;

/* compiled from: ReleaseViewVisitor.kt */
@com.yandex.div.core.dagger.A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/D;", "Lcom/yandex/div/core/view2/divs/widgets/w;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class D extends w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38029k f368871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final U f368872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48774a f368873c;

    @Inject
    public D(@Y61.k C38029k c38029k, @Y61.l U u12, @Y61.k C48774a c48774a) {
        this.f368871a = c38029k;
        this.f368872b = u12;
        this.f368873c = c48774a;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void a(@Y61.k View view) {
        Object tag = view.getTag(R.id.div_custom_tag);
        C38584w0 c38584w0 = tag instanceof C38584w0 ? (C38584w0) tag : null;
        if (c38584w0 != null) {
            r(view, c38584w0);
            U u12 = this.f368872b;
            if (u12 == null) {
                return;
            }
            u12.release(view, c38584w0);
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void b(@Y61.k f fVar) {
        r(fVar, fVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void c(@Y61.k g gVar) {
        r(gVar, gVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void d(@Y61.k h hVar) {
        r(hVar, hVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void e(@Y61.k i iVar) {
        r(iVar, iVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void f(@Y61.k k kVar) {
        r(kVar, kVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void g(@Y61.k l lVar) {
        r(lVar, lVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void h(@Y61.k m mVar) {
        r(mVar, mVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void i(@Y61.k n nVar) {
        r(nVar, nVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void j(@Y61.k o oVar) {
        r(oVar, oVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void k(@Y61.k p pVar) {
        r(pVar, pVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void l(@Y61.k q qVar) {
        r(qVar, qVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void m(@Y61.k r rVar) {
        r(rVar, rVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void n(@Y61.k t tVar) {
        r(tVar, tVar.getDivState());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void o(@Y61.k v vVar) {
        r(vVar, vVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void p(@Y61.k y yVar) {
        r(yVar, yVar.getDiv());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.w
    public final void q(@Y61.k com.yandex.div.internal.widget.tabs.z zVar) {
        r(zVar, zVar.getDiv());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(View view, H h12) {
        if (h12 != null) {
            this.f368873c.c(this.f368871a, view, h12);
        }
        if (view instanceof c0) {
            ((c0) view).release();
        }
        Object tag = view.getTag(R.id.div_releasable_list);
        q1 q1Var = tag instanceof q1 ? (q1) tag : null;
        com.yandex.div.core.util.j jVar = q1Var != null ? new com.yandex.div.core.util.j(q1Var) : null;
        if (jVar == null) {
            return;
        }
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).release();
        }
    }
}
