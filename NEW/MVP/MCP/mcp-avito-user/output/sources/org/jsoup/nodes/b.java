package org.jsoup.nodes;

import a71.C19693c;
import androidx.camera.camera2.internal.G;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;

/* compiled from: Attributes.java */
/* loaded from: classes7.dex */
public class b implements Iterable<org.jsoup.nodes.a>, Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f421073e = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public int f421074b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String[] f421075c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f421076d;

    /* compiled from: Attributes.java */
    public class a implements Iterator<org.jsoup.nodes.a> {

        /* renamed from: b, reason: collision with root package name */
        public int f421077b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            b bVar;
            while (true) {
                int i12 = this.f421077b;
                bVar = b.this;
                if (i12 >= bVar.f421074b || !b.w(bVar.f421075c[i12])) {
                    break;
                }
                this.f421077b++;
            }
            return this.f421077b < bVar.f421074b;
        }

        @Override // java.util.Iterator
        public final org.jsoup.nodes.a next() {
            b bVar = b.this;
            String[] strArr = bVar.f421075c;
            int i12 = this.f421077b;
            org.jsoup.nodes.a aVar = new org.jsoup.nodes.a(strArr[i12], bVar.f421076d[i12], bVar);
            this.f421077b++;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i12 = this.f421077b - 1;
            this.f421077b = i12;
            b.this.D(i12);
        }
    }

    /* compiled from: Attributes.java */
    /* renamed from: org.jsoup.nodes.b$b, reason: collision with other inner class name */
    public static class C12212b extends AbstractMap<String, String> {

        /* renamed from: b, reason: collision with root package name */
        public final b f421079b;

        /* compiled from: Attributes.java */
        /* renamed from: org.jsoup.nodes.b$b$a */
        public class a implements Iterator<Map.Entry<String, String>> {

            /* renamed from: b, reason: collision with root package name */
            public final Iterator<org.jsoup.nodes.a> f421080b;

            /* renamed from: c, reason: collision with root package name */
            public org.jsoup.nodes.a f421081c;

            public a(a aVar) {
                b bVar = C12212b.this.f421079b;
                bVar.getClass();
                this.f421080b = bVar.new a();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                while (true) {
                    Iterator<org.jsoup.nodes.a> it = this.f421080b;
                    if (!((a) it).hasNext()) {
                        return false;
                    }
                    org.jsoup.nodes.a aVar = (org.jsoup.nodes.a) ((a) it).next();
                    this.f421081c = aVar;
                    String str = aVar.f421070b;
                    if (str.startsWith("data-") && str.length() > 5) {
                        return true;
                    }
                }
            }

            @Override // java.util.Iterator
            public final Map.Entry<String, String> next() {
                String strSubstring = this.f421081c.f421070b.substring(5);
                String str = this.f421081c.f421071c;
                if (str == null) {
                    str = "";
                }
                return new org.jsoup.nodes.a(strSubstring, str, null);
            }

            @Override // java.util.Iterator
            public final void remove() {
                b bVar = C12212b.this.f421079b;
                int iT2 = bVar.t(this.f421081c.f421070b);
                if (iT2 != -1) {
                    bVar.D(iT2);
                }
            }
        }

        /* compiled from: Attributes.java */
        /* renamed from: org.jsoup.nodes.b$b$b, reason: collision with other inner class name */
        public class C12213b extends AbstractSet<Map.Entry<String, String>> {
            public C12213b(a aVar) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<String, String>> iterator() {
                return C12212b.this.new a(null);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                int i12 = 0;
                while (C12212b.this.new a(null).hasNext()) {
                    i12++;
                }
                return i12;
            }
        }

        public C12212b(b bVar, a aVar) {
            this.f421079b = bVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<String, String>> entrySet() {
            return new C12213b(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            String str = (String) obj2;
            String strF = G.f("data-", (String) obj);
            b bVar = this.f421079b;
            String strL = bVar.t(strF) != -1 ? bVar.l(strF) : null;
            bVar.y(strF, str);
            return strL;
        }
    }

    public b() {
        String[] strArr = f421073e;
        this.f421075c = strArr;
        this.f421076d = strArr;
    }

    public static boolean w(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    public final void C(org.jsoup.nodes.a aVar) {
        org.jsoup.helper.d.d(aVar);
        String str = aVar.f421071c;
        if (str == null) {
            str = "";
        }
        y(aVar.f421070b, str);
        aVar.f421072d = this;
    }

    public final void D(int i12) {
        int i13 = this.f421074b;
        if (i12 >= i13) {
            throw new IllegalArgumentException("Must be false");
        }
        int i14 = (i13 - i12) - 1;
        if (i14 > 0) {
            String[] strArr = this.f421075c;
            int i15 = i12 + 1;
            System.arraycopy(strArr, i15, strArr, i12, i14);
            String[] strArr2 = this.f421076d;
            System.arraycopy(strArr2, i15, strArr2, i12, i14);
        }
        int i16 = this.f421074b - 1;
        this.f421074b = i16;
        this.f421075c[i16] = null;
        this.f421076d[i16] = null;
    }

    public final void a(String str, String str2) {
        e(this.f421074b + 1);
        String[] strArr = this.f421075c;
        int i12 = this.f421074b;
        strArr[i12] = str;
        this.f421076d[i12] = str2;
        this.f421074b = i12 + 1;
    }

    public final void b(b bVar) {
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i12 = bVar.f421074b;
            if (i13 >= i12) {
                break;
            }
            if (!w(bVar.f421075c[i13])) {
                i14++;
            }
            i13++;
        }
        if (i14 == 0) {
            return;
        }
        e(this.f421074b + i12);
        a aVar = bVar.new a();
        while (aVar.hasNext()) {
            C((org.jsoup.nodes.a) aVar.next());
        }
    }

    public final void e(int i12) {
        org.jsoup.helper.d.a(i12 >= this.f421074b);
        String[] strArr = this.f421075c;
        int length = strArr.length;
        if (length >= i12) {
            return;
        }
        int i13 = length >= 2 ? 2 * this.f421074b : 2;
        if (i12 <= i13) {
            i12 = i13;
        }
        String[] strArr2 = new String[i12];
        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
        this.f421075c = strArr2;
        String[] strArr3 = this.f421076d;
        String[] strArr4 = new String[i12];
        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
        this.f421076d = strArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f421074b == bVar.f421074b && Arrays.equals(this.f421075c, bVar.f421075c)) {
            return Arrays.equals(this.f421076d, bVar.f421076d);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f421074b * 31) + Arrays.hashCode(this.f421075c)) * 31) + Arrays.hashCode(this.f421076d);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f421074b = this.f421074b;
            String[] strArr = this.f421075c;
            int i12 = this.f421074b;
            String[] strArr2 = new String[i12];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
            this.f421075c = strArr2;
            String[] strArr3 = this.f421076d;
            int i13 = this.f421074b;
            String[] strArr4 = new String[i13];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i13));
            this.f421076d = strArr4;
            return bVar;
        } catch (CloneNotSupportedException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<org.jsoup.nodes.a> iterator() {
        return new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(org.jsoup.parser.f r8) {
        /*
            r7 = this;
            int r0 = r7.f421074b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r8 = r8.f421224b
            r0 = r1
        Lf:
            java.lang.String[] r3 = r7.f421075c
            int r3 = r3.length
            if (r1 >= r3) goto L44
            int r3 = r1 + 1
            r4 = r3
        L17:
            java.lang.String[] r5 = r7.f421075c
            int r6 = r5.length
            if (r4 >= r6) goto L42
            r6 = r5[r4]
            if (r6 != 0) goto L21
            goto L42
        L21:
            if (r8 == 0) goto L2b
            r5 = r5[r1]
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L39
        L2b:
            if (r8 != 0) goto L40
            java.lang.String[] r5 = r7.f421075c
            r6 = r5[r1]
            r5 = r5[r4]
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L40
        L39:
            int r0 = r0 + 1
            r7.D(r4)
            int r4 = r4 + (-1)
        L40:
            int r4 = r4 + r2
            goto L17
        L42:
            r1 = r3
            goto Lf
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.b.j(org.jsoup.parser.f):int");
    }

    public final String l(String str) {
        String str2;
        int iT2 = t(str);
        return (iT2 == -1 || (str2 = this.f421076d[iT2]) == null) ? "" : str2;
    }

    public final String r(String str) {
        String str2;
        int iV2 = v(str);
        return (iV2 == -1 || (str2 = this.f421076d[iV2]) == null) ? "" : str2;
    }

    public final void s(StringBuilder sb2, Document.OutputSettings outputSettings) throws IOException {
        int i12 = this.f421074b;
        for (int i13 = 0; i13 < i12; i13++) {
            if (!w(this.f421075c[i13])) {
                String str = this.f421075c[i13];
                String str2 = this.f421076d[i13];
                sb2.append(' ').append(str);
                if (!org.jsoup.nodes.a.c(str, str2, outputSettings)) {
                    sb2.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    Entities.b(sb2, str2, outputSettings, true, false, false);
                    sb2.append('\"');
                }
            }
        }
    }

    public final int t(String str) {
        org.jsoup.helper.d.d(str);
        for (int i12 = 0; i12 < this.f421074b; i12++) {
            if (str.equals(this.f421075c[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sbB = C19693c.b();
        try {
            s(sbB, new Document("").f421038j);
            return C19693c.h(sbB);
        } catch (IOException e12) {
            throw new SerializationException(e12);
        }
    }

    public final int v(String str) {
        org.jsoup.helper.d.d(str);
        for (int i12 = 0; i12 < this.f421074b; i12++) {
            if (str.equalsIgnoreCase(this.f421075c[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public final void y(String str, String str2) {
        org.jsoup.helper.d.d(str);
        int iT2 = t(str);
        if (iT2 != -1) {
            this.f421076d[iT2] = str2;
        } else {
            a(str, str2);
        }
    }
}
