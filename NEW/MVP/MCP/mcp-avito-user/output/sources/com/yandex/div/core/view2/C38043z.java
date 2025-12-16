package com.yandex.div.core.view2;

import com.yandex.div.core.h0;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38269b7;
import com.yandex.div2.C38404j6;
import com.yandex.div2.C38577v2;
import com.yandex.div2.DivTabs;
import com.yandex.div2.F;
import com.yandex.div2.O1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivImagePreloader.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/view2/z;", "", "a", "b", "c", "d", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38043z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v21.c f369224a;

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/z$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.z$a */
    public interface a {
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/z$c;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.z$c */
    public interface c {
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/z$d;", "Lcom/yandex/div/core/view2/z$c;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.z$d */
    public static final class d implements c {
        public d() {
            new ArrayList();
        }
    }

    @Inject
    public C38043z(@Y61.k v21.c cVar) {
        this.f369224a = cVar;
    }

    @Y61.k
    public final ArrayList a(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k h0.c cVar) {
        b bVar = new b(cVar, eVar, false);
        bVar.m(abstractC38330g, bVar.f369226b);
        return bVar.f369228d;
    }

    /* compiled from: DivImagePreloader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/z$b;", "LF21/a;", "Lkotlin/G0;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.z$b */
    public final class b extends F21.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final h0.c f369225a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.json.expressions.e f369226b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f369227c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList<v21.e> f369228d;

        public b(@Y61.k h0.c cVar, @Y61.k com.yandex.div.json.expressions.e eVar, boolean z12) {
            this.f369225a = cVar;
            this.f369226b = eVar;
            this.f369227c = z12;
            this.f369228d = new ArrayList<>();
        }

        @Override // F21.a
        public final /* bridge */ /* synthetic */ G0 a(AbstractC38330g abstractC38330g, com.yandex.div.json.expressions.e eVar) {
            n(abstractC38330g, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 b(AbstractC38330g.c cVar, com.yandex.div.json.expressions.e eVar) {
            n(cVar, eVar);
            if (this.f369227c) {
                Iterator<T> it = cVar.f375015c.f371377t.iterator();
                while (it.hasNext()) {
                    m((AbstractC38330g) it.next(), eVar);
                }
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 d(AbstractC38330g.e eVar, com.yandex.div.json.expressions.e eVar2) {
            n(eVar, eVar2);
            if (this.f369227c) {
                Iterator<T> it = eVar.f375017c.f371520r.iterator();
                while (it.hasNext()) {
                    m((AbstractC38330g) it.next(), eVar2);
                }
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 e(AbstractC38330g.f fVar, com.yandex.div.json.expressions.e eVar) {
            n(fVar, eVar);
            O1 o12 = fVar.f375018c;
            if (o12.f373121y.a(eVar).booleanValue()) {
                String string = o12.f373114r.a(eVar).toString();
                ArrayList<v21.e> arrayList = this.f369228d;
                v21.c cVar = C38043z.this.f369224a;
                h0.c cVar2 = this.f369225a;
                arrayList.add(cVar.loadImageBytes(string, cVar2, -1));
                cVar2.f367547b.incrementAndGet();
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 f(AbstractC38330g.C10942g c10942g, com.yandex.div.json.expressions.e eVar) {
            n(c10942g, eVar);
            if (this.f369227c) {
                Iterator<T> it = c10942g.f375019c.f374833t.iterator();
                while (it.hasNext()) {
                    m((AbstractC38330g) it.next(), eVar);
                }
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 g(AbstractC38330g.h hVar, com.yandex.div.json.expressions.e eVar) {
            n(hVar, eVar);
            C38577v2 c38577v2 = hVar.f375020c;
            if (c38577v2.f376714B.a(eVar).booleanValue()) {
                String string = c38577v2.f376753w.a(eVar).toString();
                ArrayList<v21.e> arrayList = this.f369228d;
                v21.c cVar = C38043z.this.f369224a;
                h0.c cVar2 = this.f369225a;
                arrayList.add(cVar.loadImage(string, cVar2, -1));
                cVar2.f367547b.incrementAndGet();
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 h(AbstractC38330g.k kVar, com.yandex.div.json.expressions.e eVar) {
            n(kVar, eVar);
            if (this.f369227c) {
                Iterator<T> it = kVar.f375023c.f371819o.iterator();
                while (it.hasNext()) {
                    m((AbstractC38330g) it.next(), eVar);
                }
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 j(AbstractC38330g.o oVar, com.yandex.div.json.expressions.e eVar) {
            n(oVar, eVar);
            if (this.f369227c) {
                Iterator<T> it = oVar.f375027c.f375613s.iterator();
                while (it.hasNext()) {
                    AbstractC38330g abstractC38330g = ((C38404j6.g) it.next()).f375631c;
                    if (abstractC38330g != null) {
                        m(abstractC38330g, eVar);
                    }
                }
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 k(AbstractC38330g.p pVar, com.yandex.div.json.expressions.e eVar) {
            n(pVar, eVar);
            if (this.f369227c) {
                Iterator<T> it = pVar.f375028c.f372050o.iterator();
                while (it.hasNext()) {
                    m(((DivTabs.f) it.next()).f372126a, eVar);
                }
            }
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 l(AbstractC38330g.q qVar, com.yandex.div.json.expressions.e eVar) {
            n(qVar, eVar);
            List<C38269b7.n> list = qVar.f375029c.f374594x;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String string = ((C38269b7.n) it.next()).f374630e.a(eVar).toString();
                    ArrayList<v21.e> arrayList = this.f369228d;
                    v21.c cVar = C38043z.this.f369224a;
                    h0.c cVar2 = this.f369225a;
                    arrayList.add(cVar.loadImage(string, cVar2, -1));
                    cVar2.f367547b.incrementAndGet();
                }
            }
            return G0.f406611a;
        }

        public final void n(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.e eVar) {
            List<com.yandex.div2.F> listE = abstractC38330g.a().e();
            if (listE == null) {
                return;
            }
            for (com.yandex.div2.F f12 : listE) {
                if (f12 instanceof F.c) {
                    F.c cVar = (F.c) f12;
                    if (cVar.f372265c.f372225f.a(eVar).booleanValue()) {
                        String string = cVar.f372265c.f372224e.a(eVar).toString();
                        ArrayList<v21.e> arrayList = this.f369228d;
                        v21.c cVar2 = C38043z.this.f369224a;
                        h0.c cVar3 = this.f369225a;
                        arrayList.add(cVar2.loadImage(string, cVar3, -1));
                        cVar3.f367547b.incrementAndGet();
                    }
                }
            }
        }

        public /* synthetic */ b(h0.c cVar, com.yandex.div.json.expressions.e eVar, boolean z12, int i12, C42822w c42822w) {
            this(cVar, eVar, (i12 & 4) != 0 ? true : z12);
        }
    }
}
