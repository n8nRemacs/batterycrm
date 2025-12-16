package Fc1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.random.f;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.r1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13714r1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f5776a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final xyz.n.a.i4 f5777b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f5778c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f5779d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f5780e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f5781f = new ArrayList();

    public C13714r1(@Y61.k String str, @Y61.k xyz.n.a.i4 i4Var) {
        this.f5776a = str;
        this.f5777b = i4Var;
    }

    public final void a(@Y61.k List<C13602e5> list) {
        ArrayList arrayList = this.f5781f;
        arrayList.clear();
        ArrayList arrayList2 = this.f5779d;
        arrayList2.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((C13602e5) it.next());
            f.a aVar = kotlin.random.f.f406882b;
            kotlin.ranges.l lVar = new kotlin.ranges.l(1, 32, 1);
            ArrayList arrayList3 = new ArrayList(C42745f0.q(lVar, 10));
            kotlin.ranges.k it2 = lVar.iterator();
            while (it2.f406910d) {
                it2.a();
                kotlin.random.f.f406882b.getClass();
                arrayList3.add(Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789".charAt(kotlin.random.f.f406883c.k(61))));
            }
            arrayList2.add(C42745f0.O(arrayList3, "", null, null, null, 62));
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13714r1)) {
            return false;
        }
        C13714r1 c13714r1 = (C13714r1) obj;
        return kotlin.jvm.internal.L.f(this.f5776a, c13714r1.f5776a) && this.f5777b == c13714r1.f5777b;
    }

    public final int hashCode() {
        return this.f5777b.hashCode() + (this.f5776a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "FeedbackFieldResult(fieldId=" + this.f5776a + ", type=" + this.f5777b + ')';
    }
}
