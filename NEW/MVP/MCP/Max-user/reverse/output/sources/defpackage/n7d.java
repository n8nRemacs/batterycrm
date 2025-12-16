package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n7d {
    public final long a;
    public final long b;

    public n7d(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException();
        }
        this.a = j;
        this.b = j2;
    }

    public static void a(long j, ArrayList arrayList) {
        n7d n7dVar;
        n7d n7dVar2;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            n7d n7dVar3 = (n7d) it.next();
            long j2 = n7dVar3.a;
            long j3 = n7dVar3.b;
            if (j >= j2 && j <= j3) {
                return;
            }
            if (j == j2 - 1 || j == j3 + 1) {
                n7d n7dVar4 = it.hasNext() ? (n7d) it.next() : null;
                if (n7dVar4 != null) {
                    long j4 = n7dVar4.b;
                    long j5 = n7dVar4.a;
                    if (j == j5 - 1 || j == j4 + 1) {
                        n7d n7dVar5 = (n7d) arrayList.get(i);
                        long j6 = n7dVar5.b;
                        long j7 = n7dVar5.a;
                        if (j == j4 + 1 && j7 - 1 == j) {
                            n7dVar2 = new n7d(j5, j6);
                        } else {
                            if (j6 + 1 != j || j != j5 - 1) {
                                throw new IllegalArgumentException();
                            }
                            n7dVar2 = new n7d(j7, j4);
                        }
                        arrayList.set(i, n7dVar2);
                        arrayList.remove(i + 1);
                        return;
                    }
                }
                n7d n7dVar6 = (n7d) arrayList.get(i);
                long j8 = n7dVar6.a;
                long j9 = n7dVar6.b;
                long j10 = j9 + 1;
                if (j == j10) {
                    n7dVar = new n7d(j8, j10);
                } else {
                    long j11 = j8 - 1;
                    if (j != j11) {
                        throw new IllegalArgumentException(vb9.e(j, "Range cannot be extended with that number "));
                    }
                    n7dVar = new n7d(j11, j9);
                }
                arrayList.set(i, n7dVar);
                return;
            }
            if (j3 < j) {
                arrayList.add(i, new n7d(j));
                return;
            }
            i++;
        }
        arrayList.add(i, new n7d(j));
    }

    public final boolean b(n7d n7dVar) {
        return this.a < n7dVar.a && this.b > n7dVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7d)) {
            return false;
        }
        n7d n7dVar = (n7d) obj;
        return Long.valueOf(this.a).equals(Long.valueOf(n7dVar.a)) && Long.valueOf(this.b).equals(Long.valueOf(n7dVar.b));
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return ho7.k(az1.l(this.b, "[", ".."), this.a, "]");
    }

    public n7d(long j) {
        this.a = j;
        this.b = j;
    }
}
