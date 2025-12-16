package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42809i;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class gz implements Iterable<kotlin.Q<? extends String, ? extends String>>, Z41.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String[] f385860a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final ArrayList f385861a = new ArrayList(20);

        @Y61.k
        public final void a(@Y61.k String str) {
            int iH2 = C43066x.H(':', 1, 4, str);
            if (iH2 != -1) {
                b(str.substring(0, iH2), str.substring(iH2 + 1));
            } else if (str.charAt(0) == ':') {
                b("", str.substring(1));
            } else {
                b("", str);
            }
        }

        @Y61.k
        public final ArrayList b() {
            return this.f385861a;
        }

        @Y61.k
        public final void c(@Y61.k String str, @Y61.k String str2) {
            b.b(str);
            b.b(str2, str);
            b(str);
            b(str, str2);
        }

        @Y61.k
        public final void b(@Y61.k String str, @Y61.k String str2) {
            this.f385861a.add(str);
            this.f385861a.add(C43066x.A0(str2).toString());
        }

        @Y61.k
        public final a b(@Y61.k String str) {
            int i12 = 0;
            while (i12 < this.f385861a.size()) {
                if (str.equalsIgnoreCase((String) this.f385861a.get(i12))) {
                    this.f385861a.remove(i12);
                    this.f385861a.remove(i12);
                    i12 -= 2;
                }
                i12 += 2;
            }
            return this;
        }

        @Y61.k
        public final void a(@Y61.k String str, @Y61.k String str2) {
            b.b(str);
            b.b(str2, str);
            b(str, str2);
        }

        @Y61.k
        public final gz a() {
            return new gz((String[]) this.f385861a.toArray(new String[0]), 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(int i12) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(qc1.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i12), str).toString());
                }
            }
        }

        private b() {
        }

        public static final String a(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iA2 = kotlin.internal.n.a(length, 0, -2);
            if (iA2 <= length) {
                while (!C43066x.C(str, strArr[length], true)) {
                    if (length != iA2) {
                        length -= 2;
                    }
                }
                return strArr[length + 1];
            }
            return null;
        }

        @X41.n
        @X41.i
        @Y61.k
        public static gz a(@Y61.k String... strArr) {
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    String str = strArr2[i13];
                    if (str != null) {
                        strArr2[i13] = C43066x.A0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int iA2 = kotlin.internal.n.a(0, strArr2.length - 1, 2);
                if (iA2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        String str2 = strArr2[i14];
                        String str3 = strArr2[i14 + 1];
                        b(str2);
                        b(str3, str2);
                        if (i14 == iA2) {
                            break;
                        }
                        i14 += 2;
                    }
                }
                return new gz(strArr2, i12);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str, String str2) {
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(qc1.a("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i12), str2));
                    sb2.append(qc1.d(str2) ? "" : up1.a(": ", str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        @X41.n
        @X41.i
        @Y61.k
        public static gz a(@Y61.k Map map) {
            String[] strArr = new String[map.size() * 2];
            int i12 = 0;
            int i13 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = C43066x.A0(str).toString();
                String string2 = C43066x.A0(str2).toString();
                b(string);
                b(string2, string);
                strArr[i13] = string;
                strArr[i13 + 1] = string2;
                i13 += 2;
            }
            return new gz(strArr, i12);
        }
    }

    static {
        new b(0);
    }

    public /* synthetic */ gz(String[] strArr, int i12) {
        this(strArr);
    }

    @Y61.l
    public final String a(@Y61.k String str) {
        return b.a(this.f385860a, str);
    }

    @Y61.k
    public final String b(int i12) {
        return this.f385860a[(i12 * 2) + 1];
    }

    @Y61.k
    public final TreeMap c() {
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            String lowerCase = a(i12).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(b(i12));
        }
        return treeMap;
    }

    @Y61.k
    public final List d() {
        int size = size();
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < size; i12++) {
            if ("Set-Cookie".equalsIgnoreCase(a(i12))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i12));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : C42784z0.f406748b;
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof gz) && Arrays.equals(this.f385860a, ((gz) obj).f385860a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f385860a);
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<kotlin.Q<? extends String, ? extends String>> iterator() {
        int size = size();
        kotlin.Q[] qArr = new kotlin.Q[size];
        for (int i12 = 0; i12 < size; i12++) {
            qArr[i12] = new kotlin.Q(a(i12), b(i12));
        }
        return C42809i.a(qArr);
    }

    @X41.i
    public final int size() {
        return this.f385860a.length / 2;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            String strA = a(i12);
            String strB = b(i12);
            sb2.append(strA);
            sb2.append(": ");
            if (qc1.d(strA)) {
                strB = "██";
            }
            sb2.append(strB);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private gz(String[] strArr) {
        this.f385860a = strArr;
    }

    @Y61.k
    public final String a(int i12) {
        return this.f385860a[i12 * 2];
    }

    @Y61.k
    public final a b() {
        a aVar = new a();
        C42745f0.i(aVar.b(), this.f385860a);
        return aVar;
    }
}
