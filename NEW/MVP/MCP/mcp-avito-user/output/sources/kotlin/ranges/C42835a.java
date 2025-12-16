package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Progressions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/a;", "", "", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.ranges.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42835a implements Iterable<Character>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public final char f406891b;

    /* renamed from: c, reason: collision with root package name */
    public final char f406892c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406893d = 1;

    /* compiled from: Progressions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/ranges/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C11639a {
        public /* synthetic */ C11639a(C42822w c42822w) {
            this();
        }

        public C11639a() {
        }
    }

    static {
        new C11639a(null);
    }

    public C42835a(char c12, char c13) {
        this.f406891b = c12;
        this.f406892c = (char) kotlin.internal.n.a(c12, c13, 1);
    }

    public boolean equals(@Y61.l Object obj) {
        if (obj instanceof C42835a) {
            if (!isEmpty() || !((C42835a) obj).isEmpty()) {
                C42835a c42835a = (C42835a) obj;
                if (this.f406891b != c42835a.f406891b || this.f406892c != c42835a.f406892c || this.f406893d != c42835a.f406893d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f406891b * 31) + this.f406892c) * 31) + this.f406893d;
    }

    public boolean isEmpty() {
        int i12 = this.f406893d;
        char c12 = this.f406892c;
        char c13 = this.f406891b;
        if (i12 > 0) {
            if (L.g(c13, c12) <= 0) {
                return false;
            }
        } else if (L.g(c13, c12) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C42836b(this.f406891b, this.f406892c, this.f406893d);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2;
        char c12 = this.f406892c;
        char c13 = this.f406891b;
        int i12 = this.f406893d;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(c13);
            sb2.append("..");
            sb2.append(c12);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(c13);
            sb2.append(" downTo ");
            sb2.append(c12);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
