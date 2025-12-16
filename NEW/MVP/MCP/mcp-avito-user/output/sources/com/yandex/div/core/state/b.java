package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import com.yandex.div.core.view2.divs.widgets.t;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38404j6;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: DivPathUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/state/b;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f367653a = new b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(@Y61.k java.util.List r10) {
        /*
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L7
            return r10
        L7:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            com.yandex.div.core.state.f$a r0 = com.yandex.div.core.state.f.f367661c
            r0.getClass()
            androidx.camera.core.impl.r0 r0 = new androidx.camera.core.impl.r0
            r1 = 9
            r0.<init>(r1)
            java.util.List r10 = kotlin.collections.C42745f0.B0(r10, r0)
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r10 = kotlin.collections.C42745f0.E(r10)
            r1 = 9
            int r1 = kotlin.collections.C42745f0.q(r0, r1)
            if (r1 != 0) goto L2e
            java.util.List r10 = java.util.Collections.singletonList(r10)
            goto Laa
        L2e:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = r1 + 1
            r2.<init>(r1)
            r2.add(r10)
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            com.yandex.div.core.state.f r1 = (com.yandex.div.core.state.f) r1
            com.yandex.div.core.state.f r10 = (com.yandex.div.core.state.f) r10
            long r3 = r10.f367662a
            long r5 = r1.f367662a
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L53
            goto L9e
        L53:
            java.util.List<kotlin.Q<java.lang.String, java.lang.String>> r3 = r10.f367663b
            int r4 = r3.size()
            java.util.List<kotlin.Q<java.lang.String, java.lang.String>> r5 = r1.f367663b
            int r6 = r5.size()
            if (r4 < r6) goto L62
            goto L9e
        L62:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto La5
            java.lang.Object r6 = r3.next()
            int r7 = r4 + 1
            if (r4 < 0) goto La0
            kotlin.Q r6 = (kotlin.Q) r6
            java.lang.Object r4 = r5.get(r4)
            kotlin.Q r4 = (kotlin.Q) r4
            A r8 = r6.f406619b
            java.lang.String r8 = (java.lang.String) r8
            A r9 = r4.f406619b
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = kotlin.jvm.internal.L.f(r8, r9)
            if (r8 == 0) goto L9e
            B r6 = r6.f406620c
            java.lang.String r6 = (java.lang.String) r6
            B r4 = r4.f406620c
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.jvm.internal.L.f(r6, r4)
            if (r4 != 0) goto L9c
            goto L9e
        L9c:
            r4 = r7
            goto L69
        L9e:
            r10 = r1
            goto La5
        La0:
            kotlin.collections.C42745f0.H0()
            r10 = 0
            throw r10
        La5:
            r2.add(r10)
            goto L3c
        La9:
            r10 = r2
        Laa:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = kotlin.collections.C42745f0.v(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.state.b.a(java.util.List):java.util.List");
    }

    public static AbstractC38330g b(AbstractC38330g abstractC38330g, String str) {
        if (abstractC38330g instanceof AbstractC38330g.o) {
            AbstractC38330g.o oVar = (AbstractC38330g.o) abstractC38330g;
            C38404j6 c38404j6 = oVar.f375027c;
            String str2 = c38404j6.f375604j;
            if (str2 == null && (str2 = c38404j6.f375608n) == null) {
                str2 = "";
            }
            if (str2.equals(str)) {
                return abstractC38330g;
            }
            List<C38404j6.g> list = oVar.f375027c.f375613s;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC38330g abstractC38330g2 = ((C38404j6.g) it.next()).f375631c;
                if (abstractC38330g2 != null) {
                    arrayList.add(abstractC38330g2);
                }
            }
            return d(arrayList, str);
        }
        if (abstractC38330g instanceof AbstractC38330g.p) {
            List<DivTabs.f> list2 = ((AbstractC38330g.p) abstractC38330g).f375028c.f372050o;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((DivTabs.f) it2.next()).f372126a);
            }
            return d(arrayList2, str);
        }
        if (abstractC38330g instanceof AbstractC38330g.c) {
            return d(((AbstractC38330g.c) abstractC38330g).f375015c.f371377t, str);
        }
        if (abstractC38330g instanceof AbstractC38330g.C10942g) {
            return d(((AbstractC38330g.C10942g) abstractC38330g).f375019c.f374833t, str);
        }
        if (abstractC38330g instanceof AbstractC38330g.e) {
            return d(((AbstractC38330g.e) abstractC38330g).f375017c.f371520r, str);
        }
        if (abstractC38330g instanceof AbstractC38330g.k) {
            return d(((AbstractC38330g.k) abstractC38330g).f375023c.f371819o, str);
        }
        if ((abstractC38330g instanceof AbstractC38330g.d) || (abstractC38330g instanceof AbstractC38330g.q) || (abstractC38330g instanceof AbstractC38330g.h) || (abstractC38330g instanceof AbstractC38330g.n) || (abstractC38330g instanceof AbstractC38330g.j) || (abstractC38330g instanceof AbstractC38330g.f) || (abstractC38330g instanceof AbstractC38330g.i) || (abstractC38330g instanceof AbstractC38330g.m) || (abstractC38330g instanceof AbstractC38330g.l) || (abstractC38330g instanceof AbstractC38330g.r)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public static AbstractC38330g c(@Y61.k AbstractC38330g abstractC38330g, @Y61.k f fVar) {
        List<Q<String, String>> list = fVar.f367663b;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = (String) ((Q) it.next()).f406619b;
            f367653a.getClass();
            abstractC38330g = b(abstractC38330g, str);
            if (abstractC38330g == null) {
                return null;
            }
        }
        return abstractC38330g;
    }

    public static AbstractC38330g d(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC38330g abstractC38330g = (AbstractC38330g) it.next();
            f367653a.getClass();
            AbstractC38330g abstractC38330gB = b(abstractC38330g, str);
            if (abstractC38330gB != null) {
                return abstractC38330gB;
            }
        }
        return null;
    }

    @Y61.l
    public static t e(@Y61.k View view, @Y61.k f fVar) {
        t tVarE;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof t) {
            t tVar = (t) view;
            f path = tVar.getPath();
            if (L.f(path == null ? null : path.a(), fVar.a())) {
                return tVar;
            }
        }
        Iterator itA = C22816e.a((ViewGroup) view);
        do {
            C22833m0 c22833m0 = (C22833m0) itA;
            if (!c22833m0.hasNext()) {
                return null;
            }
            tVarE = e((View) c22833m0.next(), fVar);
        } while (tVarE == null);
        return tVarE;
    }
}
