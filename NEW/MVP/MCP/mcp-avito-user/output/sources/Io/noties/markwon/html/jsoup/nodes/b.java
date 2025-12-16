package io.noties.markwon.html.jsoup.nodes;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: Attributes.java */
/* loaded from: classes8.dex */
public class b implements Iterable<io.noties.markwon.html.jsoup.nodes.a>, Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f401758e = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public int f401759b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String[] f401760c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f401761d;

    /* compiled from: Attributes.java */
    public class a implements Iterator<io.noties.markwon.html.jsoup.nodes.a> {

        /* renamed from: b, reason: collision with root package name */
        public int f401762b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f401762b < b.this.f401759b;
        }

        @Override // java.util.Iterator
        public final io.noties.markwon.html.jsoup.nodes.a next() {
            b bVar = b.this;
            String[] strArr = bVar.f401761d;
            int i12 = this.f401762b;
            String str = strArr[i12];
            String str2 = bVar.f401760c[i12];
            if (str == null) {
                str = "";
            }
            io.noties.markwon.html.jsoup.nodes.a aVar = new io.noties.markwon.html.jsoup.nodes.a();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            aVar.f401755b = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            aVar.f401756c = str;
            aVar.f401757d = bVar;
            this.f401762b++;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i12 = this.f401762b;
            int i13 = i12 - 1;
            this.f401762b = i13;
            b bVar = b.this;
            int i14 = bVar.f401759b;
            if (i13 >= i14) {
                throw new IllegalArgumentException("Must be false");
            }
            int i15 = (i14 - i13) - 1;
            if (i15 > 0) {
                String[] strArr = bVar.f401760c;
                System.arraycopy(strArr, i12, strArr, i13, i15);
                String[] strArr2 = bVar.f401761d;
                System.arraycopy(strArr2, i12, strArr2, i13, i15);
            }
            int i16 = bVar.f401759b - 1;
            bVar.f401759b = i16;
            bVar.f401760c[i16] = null;
            bVar.f401761d[i16] = null;
        }
    }

    public b() {
        String[] strArr = f401758e;
        this.f401760c = strArr;
        this.f401761d = strArr;
    }

    public final int a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i12 = 0; i12 < this.f401759b; i12++) {
            if (str.equals(this.f401760c[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public final Object clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f401759b = this.f401759b;
            String[] strArr = this.f401760c;
            int i12 = this.f401759b;
            String[] strArr2 = new String[i12];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
            this.f401760c = strArr2;
            String[] strArr3 = this.f401761d;
            int i13 = this.f401759b;
            String[] strArr4 = new String[i13];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i13));
            this.f401761d = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f401759b == bVar.f401759b && Arrays.equals(this.f401760c, bVar.f401760c)) {
            return Arrays.equals(this.f401761d, bVar.f401761d);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f401759b * 31) + Arrays.hashCode(this.f401760c)) * 31) + Arrays.hashCode(this.f401761d);
    }

    @Override // java.lang.Iterable
    public final Iterator<io.noties.markwon.html.jsoup.nodes.a> iterator() {
        return new a();
    }
}
