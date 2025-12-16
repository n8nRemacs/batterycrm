package com.yandex.div.core.view2.animations;

import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38584w0;
import com.yandex.div2.DivContainer;
import com.yandex.div2.H;
import com.yandex.div2.H0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: DivComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f367913a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(List list, List list2, com.yandex.div.json.expressions.e eVar) {
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList arrayListT0 = C42745f0.T0(list, list2);
        if (!arrayListT0.isEmpty()) {
            Iterator it = arrayListT0.iterator();
            while (it.hasNext()) {
                Q q12 = (Q) it.next();
                AbstractC38330g abstractC38330g = (AbstractC38330g) q12.f406619b;
                AbstractC38330g abstractC38330g2 = (AbstractC38330g) q12.f406620c;
                f367913a.getClass();
                if (!b(abstractC38330g, abstractC38330g2, eVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(@Y61.l AbstractC38330g abstractC38330g, @Y61.l AbstractC38330g abstractC38330g2, @Y61.k com.yandex.div.json.expressions.e eVar) {
        if (!L.f(abstractC38330g == null ? null : abstractC38330g.getClass(), abstractC38330g2 != null ? abstractC38330g2.getClass() : null)) {
            return false;
        }
        if (abstractC38330g == null || abstractC38330g2 == null || abstractC38330g == abstractC38330g2) {
            return true;
        }
        return c(abstractC38330g.a(), abstractC38330g2.a(), eVar) && a(d(abstractC38330g), d(abstractC38330g2), eVar);
    }

    public static boolean c(H h12, H h13, com.yandex.div.json.expressions.e eVar) {
        if (h12.getF374832s() != null && h13.getF374832s() != null && !L.f(h12.getF374832s(), h13.getF374832s())) {
            return false;
        }
        if ((h12 instanceof C38584w0) && (h13 instanceof C38584w0)) {
            if (!L.f(((C38584w0) h12).f376856i, ((C38584w0) h13).f376856i)) {
                return false;
            }
        }
        return ((h12 instanceof DivContainer) && (h13 instanceof DivContainer) && C37931a.A((DivContainer) h12, eVar) != C37931a.A((DivContainer) h13, eVar)) ? false : true;
    }

    public static List d(AbstractC38330g abstractC38330g) {
        if (abstractC38330g instanceof AbstractC38330g.c) {
            return ((AbstractC38330g.c) abstractC38330g).f375015c.f371377t;
        }
        if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            return ((AbstractC38330g.C10942g) abstractC38330g).f375019c.f374833t;
        }
        if (abstractC38330g instanceof AbstractC38330g.h) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.f) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.q) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.m) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.e) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.k) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.p) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.o) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.d) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.j) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.l) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.i) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.n) {
            return C42784z0.f406748b;
        }
        if (abstractC38330g instanceof AbstractC38330g.r) {
            return C42784z0.f406748b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean e(@Y61.l H0 h02, @Y61.k H0 h03, long j12, @Y61.k com.yandex.div.json.expressions.e eVar) {
        Object obj;
        Object next;
        if (h02 == null) {
            return false;
        }
        Iterator<T> it = h02.f372511b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((H0.d) next).f372522b == j12) {
                break;
            }
        }
        H0.d dVar = (H0.d) next;
        if (dVar == null) {
            return false;
        }
        Iterator<T> it2 = h03.f372511b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((H0.d) next2).f372522b == j12) {
                obj = next2;
                break;
            }
        }
        H0.d dVar2 = (H0.d) obj;
        if (dVar2 == null) {
            return false;
        }
        return b(dVar.f372521a, dVar2.f372521a, eVar);
    }
}
