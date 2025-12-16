package com.yandex.div.core.state;

import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import kotlin.text.C43066x;

/* compiled from: DivStatePath.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/state/f;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class f {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f367661c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f367662a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Q<String, String>> f367663b;

    /* compiled from: DivStatePath.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/state/f$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static f a(long j12) {
            return new f(j12, new ArrayList());
        }

        public a() {
        }
    }

    @k0
    public f(long j12, @Y61.k List<Q<String, String>> list) {
        this.f367662a = j12;
        this.f367663b = list;
    }

    @X41.n
    @Y61.k
    public static final f c(@Y61.k String str) throws PathFormatException, NumberFormatException {
        f367661c.getClass();
        ArrayList arrayList = new ArrayList();
        List listF0 = C43066x.f0(str, new String[]{"/"}, 0, 6);
        try {
            long j12 = Long.parseLong((String) listF0.get(0));
            if (listF0.size() % 2 != 1) {
                throw new PathFormatException(L.j(str, "Must be even number of states in path: "), null, 2, null);
            }
            kotlin.ranges.j jVarP = s.p(s.r(1, listF0.size()), 2);
            int i12 = jVarP.f406905b;
            int i13 = jVarP.f406906c;
            int i14 = jVarP.f406907d;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    int i15 = i12 + i14;
                    arrayList.add(new Q(listF0.get(i12), listF0.get(i12 + 1)));
                    if (i12 == i13) {
                        break;
                    }
                    i12 = i15;
                }
            }
            return new f(j12, arrayList);
        } catch (NumberFormatException e12) {
            throw new PathFormatException(L.j(str, "Top level id must be number: "), e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final String a() {
        List<Q<String, String>> list = this.f367663b;
        if (list.isEmpty()) {
            return null;
        }
        return new f(this.f367662a, list.subList(0, list.size() - 1)) + '/' + ((String) ((Q) C42745f0.Q(list)).f406619b);
    }

    @Y61.k
    public final f b() {
        List<Q<String, String>> list = this.f367663b;
        if (list.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList(list);
        C42745f0.n0(arrayList);
        return new f(this.f367662a, arrayList);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f367662a == fVar.f367662a && L.f(this.f367663b, fVar.f367663b);
    }

    public final int hashCode() {
        return this.f367663b.hashCode() + (Long.hashCode(this.f367662a) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final String toString() {
        List<Q<String, String>> list = this.f367663b;
        boolean zIsEmpty = list.isEmpty();
        long j12 = this.f367662a;
        if (zIsEmpty) {
            return String.valueOf(j12);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j12);
        sb2.append('/');
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            C42745f0.h(C42745f0.U((String) q12.f406619b, (String) q12.f406620c), arrayList);
        }
        sb2.append(C42745f0.O(arrayList, "/", null, null, null, 62));
        return sb2.toString();
    }

    public /* synthetic */ f(long j12, List list, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? new ArrayList() : list);
    }
}
