package com.yandex.div.core;

import com.yandex.div.core.view2.C38043z;
import com.yandex.div2.AbstractC38330g;
import com.yandex.div2.C38404j6;
import com.yandex.div2.C38584w0;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import t21.InterfaceC48467b;
import u21.C48774a;
import u21.InterfaceC48776c;
import v21.C49153a;

/* compiled from: DivPreloader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/h0;", "", "a", "b", "c", "d", "e", "f", "g", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC48467b
/* loaded from: classes7.dex */
public class h0 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    @Deprecated
    public static final com.google.firebase.components.g f367542d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final C38043z f367543a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final U f367544b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48774a f367545c;

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/h0$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        void e(boolean z12);
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/h0$b;", "", "<init>", "()V", "Lcom/yandex/div/core/h0$a;", "NO_CALLBACK", "Lcom/yandex/div/core/h0$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/h0$c;", "Lv21/b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends v21.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f367546a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AtomicInteger f367547b = new AtomicInteger(0);

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AtomicInteger f367548c = new AtomicInteger(0);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AtomicBoolean f367549d = new AtomicBoolean(false);

        public c(@Y61.k a aVar) {
            this.f367546a = aVar;
        }

        @Override // v21.b
        public final void a() {
            this.f367548c.incrementAndGet();
            c();
        }

        @Override // v21.b
        public final void b(@Y61.k C49153a c49153a) {
            c();
        }

        public final void c() {
            AtomicInteger atomicInteger = this.f367547b;
            atomicInteger.decrementAndGet();
            if (atomicInteger.get() == 0 && this.f367549d.get()) {
                this.f367546a.e(this.f367548c.get() != 0);
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/h0$d;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f367550a = a.f367551a;

        /* compiled from: DivPreloader.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/h0$d$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f367551a = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final i0 f367552b = new i0();
        }

        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/h0$e;", "LF21/a;", "Lkotlin/G0;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class e extends F21.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final c f367553a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f367554b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.yandex.div.json.expressions.e f367555c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final g f367556d = new g();

        public e(@Y61.k c cVar, @Y61.k a aVar, @Y61.k com.yandex.div.json.expressions.e eVar) {
            this.f367553a = cVar;
            this.f367554b = aVar;
            this.f367555c = eVar;
        }

        @Override // F21.a
        public final /* bridge */ /* synthetic */ G0 a(AbstractC38330g abstractC38330g, com.yandex.div.json.expressions.e eVar) {
            n(abstractC38330g, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 b(AbstractC38330g.c cVar, com.yandex.div.json.expressions.e eVar) {
            Iterator<T> it = cVar.f375015c.f371377t.iterator();
            while (it.hasNext()) {
                m((AbstractC38330g) it.next(), eVar);
            }
            n(cVar, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 c(AbstractC38330g.d dVar, com.yandex.div.json.expressions.e eVar) {
            d dVarPreload;
            C38584w0 c38584w0 = dVar.f375016c;
            List<AbstractC38330g> list = c38584w0.f376862o;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m((AbstractC38330g) it.next(), eVar);
                }
            }
            U u12 = h0.this.f367544b;
            if (u12 != null && (dVarPreload = u12.preload(c38584w0, this.f367554b)) != null) {
                this.f367556d.f367558a.add(dVarPreload);
            }
            n(dVar, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 d(AbstractC38330g.e eVar, com.yandex.div.json.expressions.e eVar2) {
            Iterator<T> it = eVar.f375017c.f371520r.iterator();
            while (it.hasNext()) {
                m((AbstractC38330g) it.next(), eVar2);
            }
            n(eVar, eVar2);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 f(AbstractC38330g.C10942g c10942g, com.yandex.div.json.expressions.e eVar) {
            Iterator<T> it = c10942g.f375019c.f374833t.iterator();
            while (it.hasNext()) {
                m((AbstractC38330g) it.next(), eVar);
            }
            n(c10942g, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 h(AbstractC38330g.k kVar, com.yandex.div.json.expressions.e eVar) {
            Iterator<T> it = kVar.f375023c.f371819o.iterator();
            while (it.hasNext()) {
                m((AbstractC38330g) it.next(), eVar);
            }
            n(kVar, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 j(AbstractC38330g.o oVar, com.yandex.div.json.expressions.e eVar) {
            Iterator<T> it = oVar.f375027c.f375613s.iterator();
            while (it.hasNext()) {
                AbstractC38330g abstractC38330g = ((C38404j6.g) it.next()).f375631c;
                if (abstractC38330g != null) {
                    m(abstractC38330g, eVar);
                }
            }
            n(oVar, eVar);
            return G0.f406611a;
        }

        @Override // F21.a
        public final G0 k(AbstractC38330g.p pVar, com.yandex.div.json.expressions.e eVar) {
            Iterator<T> it = pVar.f375028c.f372050o.iterator();
            while (it.hasNext()) {
                m(((DivTabs.f) it.next()).f372126a, eVar);
            }
            n(pVar, eVar);
            return G0.f406611a;
        }

        public final void n(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.e eVar) {
            ArrayList arrayListA;
            h0 h0Var = h0.this;
            C38043z c38043z = h0Var.f367543a;
            if (c38043z != null && (arrayListA = c38043z.a(abstractC38330g, eVar, this.f367553a)) != null) {
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    this.f367556d.f367558a.add(new j0((v21.e) it.next()));
                }
            }
            com.yandex.div2.H hA2 = abstractC38330g.a();
            C48774a c48774a = h0Var.f367545c;
            if (c48774a.b(hA2)) {
                for (InterfaceC48776c interfaceC48776c : c48774a.f439734a) {
                    if (interfaceC48776c.matches(hA2)) {
                        interfaceC48776c.preprocess(hA2, eVar);
                    }
                }
            }
        }
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/h0$f;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface f {
        void cancel();
    }

    /* compiled from: DivPreloader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/h0$g;", "Lcom/yandex/div/core/h0$f;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f367558a = new ArrayList();

        @Override // com.yandex.div.core.h0.f
        public final void cancel() {
            Iterator it = this.f367558a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).cancel();
            }
        }
    }

    static {
        new b(null);
        f367542d = new com.google.firebase.components.g(10);
    }

    public h0(@Y61.l C38043z c38043z, @Y61.l U u12, @Y61.k C48774a c48774a) {
        this.f367543a = c38043z;
        this.f367544b = u12;
        this.f367545c = c48774a;
    }

    @Y61.k
    public final f a(@Y61.k AbstractC38330g abstractC38330g, @Y61.k com.yandex.div.json.expressions.e eVar, @Y61.k a aVar) {
        c cVar = new c(aVar);
        e eVar2 = new e(cVar, aVar, eVar);
        eVar2.m(abstractC38330g, eVar2.f367555c);
        cVar.f367549d.set(true);
        if (cVar.f367547b.get() == 0) {
            cVar.f367546a.e(cVar.f367548c.get() != 0);
        }
        return eVar2.f367556d;
    }
}
