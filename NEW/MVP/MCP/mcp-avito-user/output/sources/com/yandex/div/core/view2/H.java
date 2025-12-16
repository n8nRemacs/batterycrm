package com.yandex.div.core.view2;

import android.content.Context;
import androidx.transition.C23494e;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.B;
import com.yandex.div2.C38303f1;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.O0;
import com.yandex.div2.T;
import com.yandex.div2.X4;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43025h;

/* compiled from: DivTransitionBuilder.kt */
@com.yandex.div.core.dagger.A
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/H;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f367855a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f367856b;

    /* compiled from: DivTransitionBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/view2/H$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DivTransitionBuilder.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[DivSlideTransition.Edge.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public H(@Y61.k @Named("context") Context context, @Y61.k S s5) {
        this.f367855a = context;
        this.f367856b = s5;
    }

    public static androidx.transition.L c(com.yandex.div2.T t12, com.yandex.div.json.expressions.e eVar) {
        if (t12 instanceof T.d) {
            androidx.transition.T t13 = new androidx.transition.T();
            Iterator<T> it = ((T.d) t12).f373514c.f373457a.iterator();
            while (it.hasNext()) {
                t13.N(c((com.yandex.div2.T) it.next(), eVar));
            }
            return t13;
        }
        if (!(t12 instanceof T.a)) {
            throw new NoWhenBranchMatchedException();
        }
        C23494e c23494e = new C23494e();
        T.a aVar = (T.a) t12;
        c23494e.f54667d = aVar.f373512c.f372768a.a(eVar).longValue();
        com.yandex.div2.M m12 = aVar.f373512c;
        c23494e.f54666c = m12.f372770c.a(eVar).longValue();
        c23494e.f54668e = com.yandex.div.core.util.c.b(m12.f372769b.a(eVar));
        return c23494e;
    }

    @Y61.k
    public final androidx.transition.T a(@Y61.l C43025h c43025h, @Y61.l C43025h c43025h2, @Y61.k com.yandex.div.json.expressions.e eVar) {
        androidx.transition.T t12 = new androidx.transition.T();
        t12.Q(0);
        S s5 = this.f367856b;
        if (c43025h != null) {
            ArrayList arrayList = new ArrayList();
            C43025h.a aVar = new C43025h.a(c43025h);
            while (aVar.hasNext()) {
                AbstractC38330g abstractC38330g = (AbstractC38330g) aVar.next();
                String f376752v = abstractC38330g.a().getF376752v();
                com.yandex.div2.B f376725m = abstractC38330g.a().getF376725M();
                if (f376752v != null && f376725m != null) {
                    androidx.transition.L lB2 = b(f376725m, 2, eVar);
                    lB2.c(s5.a(f376752v));
                    arrayList.add(lB2);
                }
            }
            com.yandex.div.core.view2.animations.i.a(t12, arrayList);
        }
        if (c43025h != null && c43025h2 != null) {
            ArrayList arrayList2 = new ArrayList();
            C43025h.a aVar2 = new C43025h.a(c43025h);
            while (aVar2.hasNext()) {
                AbstractC38330g abstractC38330g2 = (AbstractC38330g) aVar2.next();
                String f376752v2 = abstractC38330g2.a().getF376752v();
                com.yandex.div2.T f376723k = abstractC38330g2.a().getF376723K();
                if (f376752v2 != null && f376723k != null) {
                    androidx.transition.L lC2 = c(f376723k, eVar);
                    lC2.c(s5.a(f376752v2));
                    arrayList2.add(lC2);
                }
            }
            com.yandex.div.core.view2.animations.i.a(t12, arrayList2);
        }
        if (c43025h2 != null) {
            ArrayList arrayList3 = new ArrayList();
            C43025h.a aVar3 = new C43025h.a(c43025h2);
            while (aVar3.hasNext()) {
                AbstractC38330g abstractC38330g3 = (AbstractC38330g) aVar3.next();
                String f376752v3 = abstractC38330g3.a().getF376752v();
                com.yandex.div2.B f376724l = abstractC38330g3.a().getF376724L();
                if (f376752v3 != null && f376724l != null) {
                    androidx.transition.L lB3 = b(f376724l, 1, eVar);
                    lB3.c(s5.a(f376752v3));
                    arrayList3.add(lB3);
                }
            }
            com.yandex.div.core.view2.animations.i.a(t12, arrayList3);
        }
        return t12;
    }

    public final androidx.transition.L b(com.yandex.div2.B b12, int i12, com.yandex.div.json.expressions.e eVar) {
        if (b12 instanceof B.e) {
            androidx.transition.T t12 = new androidx.transition.T();
            Iterator<T> it = ((B.e) b12).f370629c.f377222a.iterator();
            while (it.hasNext()) {
                androidx.transition.L lB2 = b((com.yandex.div2.B) it.next(), i12, eVar);
                t12.E(Math.max(t12.f54667d, lB2.f54666c + lB2.f54667d));
                t12.N(lB2);
            }
            return t12;
        }
        if (b12 instanceof B.c) {
            B.c cVar = (B.c) b12;
            com.yandex.div.core.view2.animations.d dVar = new com.yandex.div.core.view2.animations.d((float) cVar.f370627c.f374765a.a(eVar).doubleValue());
            dVar.S(i12);
            C38303f1 c38303f1 = cVar.f370627c;
            dVar.f54667d = c38303f1.f374766b.a(eVar).longValue();
            dVar.f54666c = c38303f1.f374768d.a(eVar).longValue();
            dVar.f54668e = com.yandex.div.core.util.c.b(c38303f1.f374767c.a(eVar));
            return dVar;
        }
        if (b12 instanceof B.d) {
            B.d dVar2 = (B.d) b12;
            float fDoubleValue = (float) dVar2.f370628c.f374020e.a(eVar).doubleValue();
            X4 x42 = dVar2.f370628c;
            com.yandex.div.core.view2.animations.f fVar = new com.yandex.div.core.view2.animations.f(fDoubleValue, (float) x42.f374018c.a(eVar).doubleValue(), (float) x42.f374019d.a(eVar).doubleValue());
            fVar.S(i12);
            fVar.f54667d = x42.f374016a.a(eVar).longValue();
            fVar.f54666c = x42.f374021f.a(eVar).longValue();
            fVar.f54668e = com.yandex.div.core.util.c.b(x42.f374017b.a(eVar));
            return fVar;
        }
        if (!(b12 instanceof B.f)) {
            throw new NoWhenBranchMatchedException();
        }
        B.f fVar2 = (B.f) b12;
        O0 o02 = fVar2.f370630c.f371974a;
        int iO2 = o02 == null ? -1 : C37931a.O(o02, this.f367855a.getResources().getDisplayMetrics(), eVar);
        DivSlideTransition divSlideTransition = fVar2.f370630c;
        int iOrdinal = divSlideTransition.f371976c.a(eVar).ordinal();
        int i13 = 3;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i13 = 48;
            } else if (iOrdinal == 2) {
                i13 = 5;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = 80;
            }
        }
        com.yandex.div.core.view2.animations.g gVar = new com.yandex.div.core.view2.animations.g(iO2, i13);
        gVar.S(i12);
        gVar.f54667d = divSlideTransition.f371975b.a(eVar).longValue();
        gVar.f54666c = divSlideTransition.f371978e.a(eVar).longValue();
        gVar.f54668e = com.yandex.div.core.util.c.b(divSlideTransition.f371977d.a(eVar));
        return gVar;
    }
}
