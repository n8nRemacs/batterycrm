package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.AbstractC44872n;
import org.joda.time.D;

/* compiled from: PeriodFormatterBuilder.java */
/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f420854a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f420855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f420856c;

    /* renamed from: d, reason: collision with root package name */
    public c[] f420857d;

    /* compiled from: PeriodFormatterBuilder.java */
    public static class a implements t, s {

        /* renamed from: a, reason: collision with root package name */
        public final t[] f420858a;

        /* renamed from: b, reason: collision with root package name */
        public final s[] f420859b;

        public a(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i12 = 0; i12 < size; i12 += 2) {
                Object obj = list.get(i12);
                if (obj instanceof t) {
                    if (obj instanceof a) {
                        t[] tVarArr = ((a) obj).f420858a;
                        if (tVarArr != null) {
                            for (t tVar : tVarArr) {
                                arrayList.add(tVar);
                            }
                        }
                    } else {
                        arrayList.add(obj);
                    }
                }
                Object obj2 = list.get(i12 + 1);
                if (obj2 instanceof s) {
                    if (obj2 instanceof a) {
                        s[] sVarArr = ((a) obj2).f420859b;
                        if (sVarArr != null) {
                            for (s sVar : sVarArr) {
                                arrayList2.add(sVar);
                            }
                        }
                    } else {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                this.f420858a = null;
            } else {
                this.f420858a = (t[]) arrayList.toArray(new t[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.f420859b = null;
            } else {
                this.f420859b = (s[]) arrayList2.toArray(new s[arrayList2.size()]);
            }
        }

        @Override // org.joda.time.format.t
        public final int a(org.joda.time.base.f fVar) {
            t[] tVarArr = this.f420858a;
            int length = tVarArr.length;
            int iA2 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return iA2;
                }
                iA2 += tVarArr[length].a(fVar);
            }
        }

        @Override // org.joda.time.format.t
        public final void b(StringBuffer stringBuffer, org.joda.time.base.f fVar) {
            for (t tVar : this.f420858a) {
                tVar.b(stringBuffer, fVar);
            }
        }

        @Override // org.joda.time.format.t
        public final int c(org.joda.time.base.f fVar, int i12) {
            t[] tVarArr = this.f420858a;
            int length = tVarArr.length;
            int iC2 = 0;
            while (iC2 < i12) {
                length--;
                if (length < 0) {
                    break;
                }
                iC2 += tVarArr[length].c(fVar, Integer.MAX_VALUE);
            }
            return iC2;
        }
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class b extends d {

        /* renamed from: b, reason: collision with root package name */
        public final d f420860b;

        /* renamed from: c, reason: collision with root package name */
        public final d f420861c;

        /* renamed from: d, reason: collision with root package name */
        public final String[] f420862d;

        public b(d dVar, d dVar2) {
            this.f420860b = dVar;
            this.f420861c = dVar2;
            HashSet hashSet = new HashSet();
            for (String str : dVar.c()) {
                for (String str2 : this.f420861c.c()) {
                    hashSet.add(str + str2);
                }
            }
            this.f420862d = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.r.f
        public final void a(StringBuffer stringBuffer, int i12) {
            this.f420860b.a(stringBuffer, i12);
            this.f420861c.a(stringBuffer, i12);
        }

        @Override // org.joda.time.format.r.f
        public final int b(int i12) {
            return this.f420860b.b(i12) + this.f420861c.b(i12);
        }

        @Override // org.joda.time.format.r.f
        public final String[] c() {
            return (String[]) this.f420862d.clone();
        }
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static abstract class d implements f {

        /* renamed from: a, reason: collision with root package name */
        public volatile String[] f420868a;
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class e implements t, s {

        /* renamed from: b, reason: collision with root package name */
        public static final e f420869b = new e("");

        /* renamed from: a, reason: collision with root package name */
        public final String f420870a;

        public e(String str) {
            this.f420870a = str;
        }

        @Override // org.joda.time.format.t
        public final int a(org.joda.time.base.f fVar) {
            return this.f420870a.length();
        }

        @Override // org.joda.time.format.t
        public final void b(StringBuffer stringBuffer, org.joda.time.base.f fVar) {
            stringBuffer.append(this.f420870a);
        }

        @Override // org.joda.time.format.t
        public final int c(org.joda.time.base.f fVar, int i12) {
            return 0;
        }
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public interface f {
        void a(StringBuffer stringBuffer, int i12);

        int b(int i12);

        String[] c();
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class g extends d {
        @Override // org.joda.time.format.r.f
        public final void a(StringBuffer stringBuffer, int i12) {
            stringBuffer.append((String) null);
        }

        @Override // org.joda.time.format.r.f
        public final int b(int i12) {
            throw null;
        }

        @Override // org.joda.time.format.r.f
        public final String[] c() {
            return new String[]{null, null};
        }
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class h extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator<String> f420871b = null;

        /* compiled from: PeriodFormatterBuilder.java */
        public static class a implements Comparator<String> {
            @Override // java.util.Comparator
            public final int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        }

        static {
            new a();
        }

        @Override // org.joda.time.format.r.f
        public final void a(StringBuffer stringBuffer, int i12) {
            d(i12);
            throw null;
        }

        @Override // org.joda.time.format.r.f
        public final int b(int i12) {
            d(i12);
            throw null;
        }

        @Override // org.joda.time.format.r.f
        public final String[] c() {
            throw null;
        }

        public final int d(int i12) {
            String.valueOf(i12);
            throw null;
        }
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class i implements t, s {

        /* renamed from: a, reason: collision with root package name */
        public final String f420872a;

        /* renamed from: b, reason: collision with root package name */
        public final String f420873b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f420874c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f420875d;

        /* renamed from: e, reason: collision with root package name */
        public final t f420876e;

        /* renamed from: f, reason: collision with root package name */
        public volatile t f420877f;

        /* renamed from: g, reason: collision with root package name */
        public final s f420878g;

        /* renamed from: h, reason: collision with root package name */
        public volatile s f420879h;

        public i(String str, String str2, String[] strArr, t tVar, s sVar, boolean z12) {
            this.f420872a = str;
            this.f420873b = str2;
            if ((str2 != null && !str.equals(str2)) || (strArr != null && strArr.length != 0)) {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
            }
            this.f420876e = tVar;
            this.f420878g = sVar;
            this.f420874c = z12;
            this.f420875d = true;
        }

        @Override // org.joda.time.format.t
        public final int a(org.joda.time.base.f fVar) {
            int length;
            t tVar = this.f420876e;
            t tVar2 = this.f420877f;
            int iA2 = tVar2.a(fVar) + tVar.a(fVar);
            if (this.f420874c) {
                if (tVar.c(fVar, 1) <= 0) {
                    return iA2;
                }
                if (this.f420875d) {
                    int iC2 = tVar2.c(fVar, 2);
                    if (iC2 <= 0) {
                        return iA2;
                    }
                    length = (iC2 > 1 ? this.f420872a : this.f420873b).length();
                } else {
                    length = this.f420872a.length();
                }
            } else {
                if (!this.f420875d || tVar2.c(fVar, 1) <= 0) {
                    return iA2;
                }
                length = this.f420872a.length();
            }
            return iA2 + length;
        }

        @Override // org.joda.time.format.t
        public final void b(StringBuffer stringBuffer, org.joda.time.base.f fVar) {
            t tVar = this.f420876e;
            t tVar2 = this.f420877f;
            tVar.b(stringBuffer, fVar);
            if (this.f420874c) {
                if (tVar.c(fVar, 1) > 0) {
                    if (this.f420875d) {
                        int iC2 = tVar2.c(fVar, 2);
                        if (iC2 > 0) {
                            stringBuffer.append(iC2 > 1 ? this.f420872a : this.f420873b);
                        }
                    } else {
                        stringBuffer.append(this.f420872a);
                    }
                }
            } else if (this.f420875d && tVar2.c(fVar, 1) > 0) {
                stringBuffer.append(this.f420872a);
            }
            tVar2.b(stringBuffer, fVar);
        }

        @Override // org.joda.time.format.t
        public final int c(org.joda.time.base.f fVar, int i12) {
            int iC2 = this.f420876e.c(fVar, i12);
            return iC2 < i12 ? iC2 + this.f420877f.c(fVar, i12) : iC2;
        }
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class j extends d {

        /* renamed from: b, reason: collision with root package name */
        public final String f420880b;

        public j(String str) {
            this.f420880b = str;
        }

        @Override // org.joda.time.format.r.f
        public final void a(StringBuffer stringBuffer, int i12) {
            stringBuffer.append(this.f420880b);
        }

        @Override // org.joda.time.format.r.f
        public final int b(int i12) {
            return this.f420880b.length();
        }

        @Override // org.joda.time.format.r.f
        public final String[] c() {
            return new String[]{this.f420880b};
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public r() {
        ArrayList arrayList = this.f420854a;
        if (arrayList == null) {
            this.f420854a = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.f420855b = false;
        this.f420856c = false;
        this.f420857d = new c[10];
    }

    public static Object[] d(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            e eVar = e.f420869b;
            return new Object[]{eVar, eVar};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        a aVar = new a(list);
        return new Object[]{aVar, aVar};
    }

    public static q e(List<Object> list, boolean z12, boolean z13) {
        if (z12 && z13) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof i)) {
            i iVar = (i) list.get(0);
            if (iVar.f420879h == null && iVar.f420877f == null) {
                q qVarE = e(list.subList(2, size), z12, z13);
                t tVar = qVarE.f420852a;
                s sVar = qVarE.f420853b;
                iVar.f420877f = tVar;
                iVar.f420879h = sVar;
                return new q(iVar, iVar);
            }
        }
        Object[] objArrD = d(list);
        return z12 ? new q(null, (s) objArrD[1]) : z13 ? new q((t) objArrD[0], null) : new q((t) objArrD[0], (s) objArrD[1]);
    }

    public final void a(t tVar, s sVar) {
        this.f420854a.add(tVar);
        this.f420854a.add(sVar);
        this.f420855b = this.f420855b;
        this.f420856c = this.f420856c;
    }

    public final void b(int i12) {
        c cVar = new c(i12, this.f420857d);
        a(cVar, cVar);
        this.f420857d[i12] = cVar;
    }

    public final void c(String str) {
        Object objJ;
        Object objJ2;
        j jVar = new j(str);
        if (this.f420854a.size() > 0) {
            objJ = androidx.appcompat.app.r.j(2, this.f420854a);
            objJ2 = androidx.appcompat.app.r.j(1, this.f420854a);
        } else {
            objJ = null;
            objJ2 = null;
        }
        if (objJ == null || objJ2 == null || objJ != objJ2 || !(objJ instanceof c)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        c cVar = new c((c) objJ, jVar);
        ArrayList arrayList = this.f420854a;
        arrayList.set(arrayList.size() - 2, cVar);
        ArrayList arrayList2 = this.f420854a;
        arrayList2.set(arrayList2.size() - 1, cVar);
        this.f420857d[cVar.f420865c] = cVar;
    }

    /* compiled from: PeriodFormatterBuilder.java */
    public static class c implements t, s {

        /* renamed from: a, reason: collision with root package name */
        public final int f420863a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420864b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420865c;

        /* renamed from: d, reason: collision with root package name */
        public final c[] f420866d;

        /* renamed from: e, reason: collision with root package name */
        public final d f420867e;

        public c(int i12, c[] cVarArr) {
            this.f420863a = 1;
            this.f420864b = 2;
            this.f420865c = i12;
            this.f420866d = cVarArr;
            this.f420867e = null;
        }

        public static boolean e(D d12, int i12) {
            AbstractC44872n abstractC44872n = AbstractC44872n.f420940n;
            AbstractC44872n abstractC44872n2 = AbstractC44872n.f420939m;
            switch (i12) {
                case 0:
                    return d12.c(AbstractC44872n.f420932f);
                case 1:
                    return d12.c(AbstractC44872n.f420933g);
                case 2:
                    return d12.c(AbstractC44872n.f420934h);
                case 3:
                    return d12.c(AbstractC44872n.f420935i);
                case 4:
                    return d12.c(AbstractC44872n.f420937k);
                case 5:
                    return d12.c(AbstractC44872n.f420938l);
                case 6:
                    return d12.c(abstractC44872n2);
                case 7:
                    return d12.c(abstractC44872n);
                case 8:
                case 9:
                    return d12.c(abstractC44872n2) || d12.c(abstractC44872n);
                default:
                    return false;
            }
        }

        @Override // org.joda.time.format.t
        public final int a(org.joda.time.base.f fVar) {
            long jD2 = d(fVar);
            if (jD2 == Long.MAX_VALUE) {
                return 0;
            }
            int iMax = Math.max(org.joda.time.format.i.d(jD2), this.f420863a);
            int i12 = this.f420865c;
            if (i12 >= 8) {
                int iMax2 = Math.max(iMax, jD2 < 0 ? 5 : 4);
                iMax = (i12 == 9 && Math.abs(jD2) % 1000 == 0) ? iMax2 - 3 : iMax2 + 1;
                jD2 /= 1000;
            }
            int i13 = (int) jD2;
            d dVar = this.f420867e;
            return dVar != null ? iMax + dVar.b(i13) : iMax;
        }

        @Override // org.joda.time.format.t
        public final void b(StringBuffer stringBuffer, org.joda.time.base.f fVar) {
            long jD2 = d(fVar);
            if (jD2 == Long.MAX_VALUE) {
                return;
            }
            int i12 = (int) jD2;
            int i13 = this.f420865c;
            if (i13 >= 8) {
                i12 = (int) (jD2 / 1000);
            }
            int length = stringBuffer.length();
            int i14 = this.f420863a;
            if (i14 <= 1) {
                try {
                    org.joda.time.format.i.c(stringBuffer, i12);
                } catch (IOException unused) {
                }
            } else {
                org.joda.time.format.i.b(stringBuffer, i12, i14);
            }
            if (i13 >= 8) {
                int iAbs = (int) (Math.abs(jD2) % 1000);
                if (i13 == 8 || iAbs > 0) {
                    if (jD2 < 0 && jD2 > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    org.joda.time.format.i.b(stringBuffer, iAbs, 3);
                }
            }
            d dVar = this.f420867e;
            if (dVar != null) {
                dVar.a(stringBuffer, i12);
            }
        }

        @Override // org.joda.time.format.t
        public final int c(org.joda.time.base.f fVar, int i12) {
            if (i12 <= 0) {
                return 0;
            }
            return (this.f420864b == 4 || d(fVar) != Long.MAX_VALUE) ? 1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long d(org.joda.time.base.f r13) {
            /*
                r12 = this;
                r0 = 4
                int r1 = r12.f420864b
                if (r1 != r0) goto L7
                r0 = 0
                goto Lb
            L7:
                org.joda.time.D r0 = r13.a()
            Lb:
                int r2 = r12.f420865c
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                if (r0 == 0) goto L1b
                boolean r5 = e(r0, r2)
                if (r5 != 0) goto L1b
                return r3
            L1b:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420940n
                org.joda.time.n r6 = org.joda.time.AbstractC44872n.f420939m
                switch(r2) {
                    case 0: goto L60;
                    case 1: goto L59;
                    case 2: goto L52;
                    case 3: goto L4b;
                    case 4: goto L44;
                    case 5: goto L3d;
                    case 6: goto L38;
                    case 7: goto L32;
                    case 8: goto L23;
                    case 9: goto L23;
                    default: goto L22;
                }
            L22:
                return r3
            L23:
                int r6 = r13.b(r6)
                int r5 = r13.b(r5)
                long r6 = (long) r6
                r8 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 * r8
                long r8 = (long) r5
                long r6 = r6 + r8
                goto L67
            L32:
                int r5 = r13.b(r5)
            L36:
                long r6 = (long) r5
                goto L67
            L38:
                int r5 = r13.b(r6)
                goto L36
            L3d:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420938l
                int r5 = r13.b(r5)
                goto L36
            L44:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420937k
                int r5 = r13.b(r5)
                goto L36
            L4b:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420935i
                int r5 = r13.b(r5)
                goto L36
            L52:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420934h
                int r5 = r13.b(r5)
                goto L36
            L59:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420933g
                int r5 = r13.b(r5)
                goto L36
            L60:
                org.joda.time.n r5 = org.joda.time.AbstractC44872n.f420932f
                int r5 = r13.b(r5)
                goto L36
            L67:
                r8 = 0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 != 0) goto Lce
                r5 = 0
                r8 = 1
                r9 = 9
                org.joda.time.format.r$c[] r10 = r12.f420866d
                if (r1 == r8) goto La3
                r11 = 2
                if (r1 == r11) goto L7d
                r13 = 5
                if (r1 == r13) goto L7c
                goto Lce
            L7c:
                return r3
            L7d:
                int r1 = r13.size()
            L81:
                if (r5 >= r1) goto L8d
                int r11 = r13.g(r5)
                if (r11 == 0) goto L8a
                goto La2
            L8a:
                int r5 = r5 + 1
                goto L81
            L8d:
                r13 = r10[r2]
                if (r13 != r12) goto La2
                int r2 = r2 + r8
            L92:
                if (r2 > r9) goto Lce
                boolean r13 = e(r0, r2)
                if (r13 == 0) goto L9f
                r13 = r10[r2]
                if (r13 == 0) goto L9f
                return r3
            L9f:
                int r2 = r2 + 1
                goto L92
            La2:
                return r3
            La3:
                int r1 = r13.size()
            La7:
                if (r5 >= r1) goto Lb3
                int r8 = r13.g(r5)
                if (r8 == 0) goto Lb0
                goto Lcd
            Lb0:
                int r5 = r5 + 1
                goto La7
            Lb3:
                r13 = r10[r2]
                if (r13 != r12) goto Lcd
                r13 = 8
                int r13 = java.lang.Math.min(r2, r13)
            Lbd:
                int r13 = r13 + (-1)
                if (r13 < 0) goto Lce
                if (r13 > r9) goto Lce
                boolean r1 = e(r0, r13)
                if (r1 == 0) goto Lbd
                r1 = r10[r13]
                if (r1 == 0) goto Lbd
            Lcd:
                return r3
            Lce:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.r.c.d(org.joda.time.base.f):long");
        }

        public c(c cVar, d dVar) {
            this.f420863a = cVar.f420863a;
            this.f420864b = cVar.f420864b;
            this.f420865c = cVar.f420865c;
            this.f420866d = cVar.f420866d;
            d dVar2 = cVar.f420867e;
            this.f420867e = dVar2 != null ? new b(dVar2, dVar) : dVar;
        }
    }
}
