package com.akita.compose.component.page_indicator;

import androidx.appcompat.app.r;
import androidx.compose.foundation.lazy.K;
import androidx.compose.foundation.lazy.Y;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: LazyListPageIndicatorState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/page_indicator/a;", "Lcom/akita/compose/component/page_indicator/h;", "a", "page-indicator_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f62303a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f62304b = U2.a(0);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I3 f62305c = C22126m3.d(new c());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I3 f62306d = C22126m3.d(new b());

    /* compiled from: LazyListPageIndicatorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/page_indicator/a$a;", "", "page-indicator_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.component.page_indicator.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2094a {

        /* renamed from: a, reason: collision with root package name */
        public final int f62307a;

        /* renamed from: b, reason: collision with root package name */
        public final float f62308b;

        public C2094a(int i12, float f12) {
            this.f62307a = i12;
            this.f62308b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2094a)) {
                return false;
            }
            C2094a c2094a = (C2094a) obj;
            return this.f62307a == c2094a.f62307a && Float.compare(this.f62308b, c2094a.f62308b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62308b) + (Integer.hashCode(this.f62307a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollPosition(page=");
            sb2.append(this.f62307a);
            sb2.append(", offsetFraction=");
            return r.k(')', this.f62308b, sb2);
        }
    }

    /* compiled from: LazyListPageIndicatorState.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/page_indicator/a$a;", "invoke", "()Lcom/akita/compose/component/page_indicator/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C2094a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C2094a invoke() {
            Object obj;
            a aVar = a.this;
            Y yJ2 = aVar.f62303a.j();
            List<K> listH = yJ2.h();
            int f28948n = yJ2.getF28948n();
            if (listH.isEmpty() || f28948n == 0) {
                return new C2094a(0, 0.0f);
            }
            int f28969q = ((K) C42745f0.E(listH)).getF28969q();
            if (f28969q <= 0) {
                return new C2094a(0, 0.0f);
            }
            float f28947m = ((yJ2.getF28947m() - yJ2.getF28946l()) / 2.0f) + yJ2.getF28946l();
            Iterator<T> it = listH.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    K k12 = (K) next;
                    float fAbs = Math.abs(((k12.getF28969q() / 2) + k12.getF28968p()) - f28947m);
                    do {
                        Object next2 = it.next();
                        K k13 = (K) next2;
                        float fAbs2 = Math.abs(((k13.getF28969q() / 2) + k13.getF28968p()) - f28947m);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            next = next2;
                            fAbs = fAbs2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            K k14 = (K) obj;
            if (k14 == null) {
                return new C2094a(aVar.f62303a.h(), 0.0f);
            }
            return new C2094a(k14.getF29645a(), s.f((f28947m - ((k14.getF28969q() / 2.0f) + k14.getF28968p())) / f28969q, -0.5f, 0.5f));
        }
    }

    /* compiled from: LazyListPageIndicatorState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            a aVar = a.this;
            boolean zA2 = aVar.f62303a.f29721h.a();
            InterfaceC22196w1 interfaceC22196w1 = aVar.f62304b;
            if (!zA2) {
                ((C22061e3) interfaceC22196w1).L3(((C2094a) aVar.f62306d.getF42167b()).f62307a);
            }
            return Integer.valueOf(((C22061e3) interfaceC22196w1).e());
        }
    }

    public a(@Y61.k w0 w0Var) {
        this.f62303a = w0Var;
    }

    @Override // com.akita.compose.component.page_indicator.h
    public final int a() {
        return ((C2094a) this.f62306d.getF42167b()).f62307a;
    }

    @Override // com.akita.compose.component.page_indicator.h
    public final int b() {
        return this.f62303a.j().getF28948n();
    }

    @Override // com.akita.compose.component.page_indicator.h
    public final float c() {
        return ((C2094a) r0.getF42167b()).f62307a + ((C2094a) this.f62306d.getF42167b()).f62308b;
    }

    @Override // com.akita.compose.component.page_indicator.h
    public final int d() {
        return ((Number) this.f62305c.getF42167b()).intValue();
    }

    @Override // com.akita.compose.component.page_indicator.h
    public final float e() {
        return ((C2094a) this.f62306d.getF42167b()).f62308b;
    }
}
