package com.yandex.div.core.util;

import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38404j6;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42736b;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: DivTreeWalk.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/a;", "Lkotlin/sequences/m;", "Lcom/yandex/div2/g;", "a", "b", "c", "d", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements InterfaceC43030m<AbstractC38330g> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AbstractC38330g f367781a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<AbstractC38330g, Boolean> f367782b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<AbstractC38330g, G0> f367783c;

    /* renamed from: d, reason: collision with root package name */
    public final int f367784d;

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/a$a;", "Lcom/yandex/div/core/util/a$d;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.util.a$a, reason: collision with other inner class name */
    public static final class C10862a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC38330g f367785a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Y41.l<AbstractC38330g, Boolean> f367786b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Y41.l<AbstractC38330g, G0> f367787c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f367788d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public List<? extends AbstractC38330g> f367789e;

        /* renamed from: f, reason: collision with root package name */
        public int f367790f;

        /* JADX WARN: Multi-variable type inference failed */
        public C10862a(@Y61.k AbstractC38330g abstractC38330g, @Y61.l Y41.l<? super AbstractC38330g, Boolean> lVar, @Y61.l Y41.l<? super AbstractC38330g, G0> lVar2) {
            this.f367785a = abstractC38330g;
            this.f367786b = lVar;
            this.f367787c = lVar2;
        }

        @Override // com.yandex.div.core.util.a.d
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AbstractC38330g getF367793a() {
            return this.f367785a;
        }

        @Override // com.yandex.div.core.util.a.d
        @Y61.l
        public final AbstractC38330g b() {
            ArrayList arrayList;
            boolean z12 = this.f367788d;
            AbstractC38330g abstractC38330g = this.f367785a;
            if (!z12) {
                Y41.l<AbstractC38330g, Boolean> lVar = this.f367786b;
                if (lVar != null && !lVar.invoke(abstractC38330g).booleanValue()) {
                    return null;
                }
                this.f367788d = true;
                return abstractC38330g;
            }
            List<? extends AbstractC38330g> list = this.f367789e;
            if (list == null) {
                if ((abstractC38330g instanceof AbstractC38330g.q) || (abstractC38330g instanceof AbstractC38330g.h) || (abstractC38330g instanceof AbstractC38330g.f) || (abstractC38330g instanceof AbstractC38330g.m) || (abstractC38330g instanceof AbstractC38330g.i) || (abstractC38330g instanceof AbstractC38330g.n) || (abstractC38330g instanceof AbstractC38330g.j) || (abstractC38330g instanceof AbstractC38330g.d) || (abstractC38330g instanceof AbstractC38330g.l) || (abstractC38330g instanceof AbstractC38330g.r)) {
                    list = C42784z0.f406748b;
                } else if (abstractC38330g instanceof AbstractC38330g.c) {
                    list = ((AbstractC38330g.c) abstractC38330g).f375015c.f371377t;
                } else if (abstractC38330g instanceof AbstractC38330g.C10942g) {
                    list = ((AbstractC38330g.C10942g) abstractC38330g).f375019c.f374833t;
                } else if (abstractC38330g instanceof AbstractC38330g.e) {
                    list = ((AbstractC38330g.e) abstractC38330g).f375017c.f371520r;
                } else if (abstractC38330g instanceof AbstractC38330g.k) {
                    list = ((AbstractC38330g.k) abstractC38330g).f375023c.f371819o;
                } else {
                    if (abstractC38330g instanceof AbstractC38330g.p) {
                        List<DivTabs.f> list2 = ((AbstractC38330g.p) abstractC38330g).f375028c.f372050o;
                        arrayList = new ArrayList(C42745f0.q(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((DivTabs.f) it.next()).f372126a);
                        }
                    } else {
                        if (!(abstractC38330g instanceof AbstractC38330g.o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<C38404j6.g> list3 = ((AbstractC38330g.o) abstractC38330g).f375027c.f375613s;
                        arrayList = new ArrayList();
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            AbstractC38330g abstractC38330g2 = ((C38404j6.g) it2.next()).f375631c;
                            if (abstractC38330g2 != null) {
                                arrayList.add(abstractC38330g2);
                            }
                        }
                    }
                    list = arrayList;
                }
                this.f367789e = list;
            }
            if (this.f367790f < list.size()) {
                int i12 = this.f367790f;
                this.f367790f = i12 + 1;
                return list.get(i12);
            }
            Y41.l<AbstractC38330g, G0> lVar2 = this.f367787c;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(abstractC38330g);
            return null;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/util/a$b;", "Lkotlin/collections/b;", "Lcom/yandex/div2/g;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b extends AbstractC42736b<AbstractC38330g> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final C42754k<d> f367791d;

        public b(@Y61.k AbstractC38330g abstractC38330g) {
            C42754k<d> c42754k = new C42754k<>();
            c42754k.addLast(com.yandex.div.core.util.c.e(abstractC38330g) ? new C10862a(abstractC38330g, a.this.f367782b, a.this.f367783c) : new c(abstractC38330g));
            this.f367791d = c42754k;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, com.yandex.div2.g] */
        @Override // kotlin.collections.AbstractC42736b
        public final void a() {
            ?? B12 = b();
            if (B12 == 0) {
                this.f406664b = 2;
            } else {
                this.f406665c = B12;
                this.f406664b = 1;
            }
        }

        public final AbstractC38330g b() {
            C42754k<d> c42754k = this.f367791d;
            d dVarH = c42754k.h();
            if (dVarH == null) {
                return null;
            }
            AbstractC38330g abstractC38330gB = dVarH.b();
            if (abstractC38330gB == null) {
                c42754k.removeLast();
                return b();
            }
            if (abstractC38330gB.equals(dVarH.getF367793a()) || !com.yandex.div.core.util.c.e(abstractC38330gB)) {
                return abstractC38330gB;
            }
            int i12 = c42754k.f406741d;
            a aVar = a.this;
            if (i12 >= aVar.f367784d) {
                return abstractC38330gB;
            }
            c42754k.addLast(com.yandex.div.core.util.c.e(abstractC38330gB) ? new C10862a(abstractC38330gB, aVar.f367782b, aVar.f367783c) : new c(abstractC38330gB));
            return b();
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/a$c;", "Lcom/yandex/div/core/util/a$d;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC38330g f367793a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f367794b;

        public c(@Y61.k AbstractC38330g abstractC38330g) {
            this.f367793a = abstractC38330g;
        }

        @Override // com.yandex.div.core.util.a.d
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final AbstractC38330g getF367793a() {
            return this.f367793a;
        }

        @Override // com.yandex.div.core.util.a.d
        @Y61.l
        public final AbstractC38330g b() {
            if (this.f367794b) {
                return null;
            }
            this.f367794b = true;
            return this.f367793a;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/util/a$d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface d {
        @Y61.k
        /* renamed from: a */
        AbstractC38330g getF367793a();

        @Y61.l
        AbstractC38330g b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(AbstractC38330g abstractC38330g, Y41.l<? super AbstractC38330g, Boolean> lVar, Y41.l<? super AbstractC38330g, G0> lVar2, int i12) {
        this.f367781a = abstractC38330g;
        this.f367782b = lVar;
        this.f367783c = lVar2;
        this.f367784d = i12;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<AbstractC38330g> iterator() {
        return new b(this.f367781a);
    }

    public /* synthetic */ a(AbstractC38330g abstractC38330g, Y41.l lVar, Y41.l lVar2, int i12, int i13, C42822w c42822w) {
        this(abstractC38330g, lVar, lVar2, (i13 & 8) != 0 ? Integer.MAX_VALUE : i12);
    }
}
