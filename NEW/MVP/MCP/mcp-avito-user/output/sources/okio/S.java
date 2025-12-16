package okio;

import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Path.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokio/S;", "", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class S implements Comparable<S> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f420033c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final String f420034d = File.separator;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44805o f420035b;

    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokio/S$a;", "", "<init>", "()V", "", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static S a(a aVar, File file) {
            aVar.getClass();
            String string = file.toString();
            C44805o c44805o = okio.internal.h.f420085a;
            C44802l c44802l = new C44802l();
            c44802l.O(string);
            return okio.internal.h.d(c44802l, false);
        }

        public static S b(a aVar, String str) {
            aVar.getClass();
            C44805o c44805o = okio.internal.h.f420085a;
            C44802l c44802l = new C44802l();
            c44802l.O(str);
            return okio.internal.h.d(c44802l, false);
        }

        public a() {
        }
    }

    public S(@Y61.k C44805o c44805o) {
        this.f420035b = c44805o;
    }

    @Y61.k
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA2 = okio.internal.h.a(this);
        C44805o c44805o = this.f420035b;
        if (iA2 == -1) {
            iA2 = 0;
        } else if (iA2 < c44805o.d() && c44805o.k(iA2) == 92) {
            iA2++;
        }
        int iD2 = c44805o.d();
        int i12 = iA2;
        while (iA2 < iD2) {
            if (c44805o.k(iA2) == 47 || c44805o.k(iA2) == 92) {
                arrayList.add(c44805o.p(i12, iA2));
                i12 = iA2 + 1;
            }
            iA2++;
        }
        if (i12 < c44805o.d()) {
            arrayList.add(c44805o.p(i12, c44805o.d()));
        }
        return arrayList;
    }

    @Y61.l
    @X41.i
    public final S b() {
        C44805o c44805o = okio.internal.h.f420088d;
        C44805o c44805o2 = this.f420035b;
        if (kotlin.jvm.internal.L.f(c44805o2, c44805o)) {
            return null;
        }
        C44805o c44805o3 = okio.internal.h.f420085a;
        if (kotlin.jvm.internal.L.f(c44805o2, c44805o3)) {
            return null;
        }
        C44805o c44805o4 = okio.internal.h.f420086b;
        if (kotlin.jvm.internal.L.f(c44805o2, c44805o4)) {
            return null;
        }
        C44805o c44805o5 = okio.internal.h.f420089e;
        int iD2 = c44805o2.d();
        byte[] bArr = c44805o5.data;
        if (c44805o2.n(iD2 - bArr.length, c44805o5, bArr.length) && (c44805o2.d() == 2 || c44805o2.n(c44805o2.d() - 3, c44805o3, 1) || c44805o2.n(c44805o2.d() - 3, c44805o4, 1))) {
            return null;
        }
        int i12 = C44799i.f420069b;
        c44805o2.getClass();
        int iL2 = c44805o2.l(i12, c44805o3.data);
        if (iL2 == -1) {
            c44805o2.getClass();
            iL2 = c44805o2.l(i12, c44805o4.data);
        }
        if (iL2 == 2 && f() != null) {
            if (c44805o2.d() == 3) {
                return null;
            }
            return new S(C44805o.q(c44805o2, 0, 3, 1));
        }
        if (iL2 == 1 && c44805o2.n(0, c44805o4, c44805o4.d())) {
            return null;
        }
        if (iL2 != -1 || f() == null) {
            return iL2 == -1 ? new S(c44805o) : iL2 == 0 ? new S(C44805o.q(c44805o2, 0, 1, 1)) : new S(C44805o.q(c44805o2, 0, iL2, 1));
        }
        if (c44805o2.d() == 2) {
            return null;
        }
        return new S(C44805o.q(c44805o2, 0, 2, 1));
    }

    @Y61.k
    public final S c(@Y61.k S s5) {
        int iA2 = okio.internal.h.a(this);
        C44805o c44805o = this.f420035b;
        S s12 = iA2 == -1 ? null : new S(c44805o.p(0, iA2));
        s5.getClass();
        int iA3 = okio.internal.h.a(s5);
        C44805o c44805o2 = s5.f420035b;
        if (!kotlin.jvm.internal.L.f(s12, iA3 != -1 ? new S(c44805o2.p(0, iA3)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + s5).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = s5.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i12 = 0;
        while (i12 < iMin && kotlin.jvm.internal.L.f(arrayListA.get(i12), arrayListA2.get(i12))) {
            i12++;
        }
        if (i12 == iMin && c44805o.d() == c44805o2.d()) {
            return a.b(f420033c, ".");
        }
        if (arrayListA2.subList(i12, arrayListA2.size()).indexOf(okio.internal.h.f420089e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + s5).toString());
        }
        C44802l c44802l = new C44802l();
        C44805o c44805oC = okio.internal.h.c(s5);
        if (c44805oC == null && (c44805oC = okio.internal.h.c(this)) == null) {
            c44805oC = okio.internal.h.f(f420034d);
        }
        int size = arrayListA2.size();
        for (int i13 = i12; i13 < size; i13++) {
            c44802l.B(okio.internal.h.f420089e);
            c44802l.B(c44805oC);
        }
        int size2 = arrayListA.size();
        while (i12 < size2) {
            c44802l.B((C44805o) arrayListA.get(i12));
            c44802l.B(c44805oC);
            i12++;
        }
        return okio.internal.h.d(c44802l, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(S s5) {
        return this.f420035b.compareTo(s5.f420035b);
    }

    @X41.i
    @Y61.k
    public final S d(@Y61.k String str) {
        C44802l c44802l = new C44802l();
        c44802l.O(str);
        return okio.internal.h.b(this, okio.internal.h.d(c44802l, false), false);
    }

    @Y61.k
    public final File e() {
        return new File(this.f420035b.t());
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof S) && kotlin.jvm.internal.L.f(((S) obj).f420035b, this.f420035b);
    }

    @Y61.l
    @X41.i
    public final Character f() {
        C44805o c44805o = okio.internal.h.f420085a;
        C44805o c44805o2 = this.f420035b;
        if (C44805o.h(c44805o2, c44805o) != -1 || c44805o2.d() < 2 || c44805o2.k(1) != 58) {
            return null;
        }
        char cK2 = (char) c44805o2.k(0);
        if (('a' > cK2 || cK2 >= '{') && ('A' > cK2 || cK2 >= '[')) {
            return null;
        }
        return Character.valueOf(cK2);
    }

    public final int hashCode() {
        return this.f420035b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f420035b.t();
    }
}
