package org.joda.time.format;

import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.connection.RealConnection;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44866h;
import org.joda.time.format.e;
import org.joda.time.y;

/* compiled from: DateTimeFormatterBuilder.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f420735a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public Object f420736b;

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class a implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final char f420737b;

        public a(char c12) {
            this.f420737b = c12;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return 1;
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            char upperCase;
            char upperCase2;
            if (i12 >= str.length()) {
                return ~i12;
            }
            char cCharAt = str.charAt(i12);
            char c12 = this.f420737b;
            return (cCharAt == c12 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c12)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i12 + 1 : ~i12;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            appendable.append(this.f420737b);
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return 1;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
            sb2.append(this.f420737b);
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class b implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final org.joda.time.format.n[] f420738b;

        /* renamed from: c, reason: collision with root package name */
        public final org.joda.time.format.l[] f420739c;

        /* renamed from: d, reason: collision with root package name */
        public final int f420740d;

        /* renamed from: e, reason: collision with root package name */
        public final int f420741e;

        public b(ArrayList arrayList) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12 += 2) {
                Object obj = arrayList.get(i12);
                if (obj instanceof b) {
                    org.joda.time.format.n[] nVarArr = ((b) obj).f420738b;
                    if (nVarArr != null) {
                        for (org.joda.time.format.n nVar : nVarArr) {
                            arrayList2.add(nVar);
                        }
                    }
                } else {
                    arrayList2.add(obj);
                }
                Object obj2 = arrayList.get(i12 + 1);
                if (obj2 instanceof b) {
                    org.joda.time.format.l[] lVarArr = ((b) obj2).f420739c;
                    if (lVarArr != null) {
                        for (org.joda.time.format.l lVar : lVarArr) {
                            arrayList3.add(lVar);
                        }
                    }
                } else {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.f420738b = null;
                this.f420740d = 0;
            } else {
                int size2 = arrayList2.size();
                this.f420738b = new org.joda.time.format.n[size2];
                int iD2 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    org.joda.time.format.n nVar2 = (org.joda.time.format.n) arrayList2.get(i13);
                    iD2 += nVar2.d();
                    this.f420738b[i13] = nVar2;
                }
                this.f420740d = iD2;
            }
            if (arrayList3.contains(null) || arrayList3.isEmpty()) {
                this.f420739c = null;
                this.f420741e = 0;
                return;
            }
            int size3 = arrayList3.size();
            this.f420739c = new org.joda.time.format.l[size3];
            int iA2 = 0;
            for (int i14 = 0; i14 < size3; i14++) {
                org.joda.time.format.l lVar2 = (org.joda.time.format.l) arrayList3.get(i14);
                iA2 += lVar2.a();
                this.f420739c[i14] = lVar2;
            }
            this.f420741e = iA2;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420741e;
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            org.joda.time.format.l[] lVarArr = this.f420739c;
            if (lVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = lVarArr.length;
            for (int i13 = 0; i13 < length && i12 >= 0; i13++) {
                i12 = lVarArr[i13].b(eVar, str, i12);
            }
            return i12;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) {
            org.joda.time.format.n[] nVarArr = this.f420738b;
            if (nVarArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (org.joda.time.format.n nVar : nVarArr) {
                nVar.c(appendable, j12, abstractC44854a, i12, abstractC44868j, locale2);
            }
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420740d;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
            org.joda.time.format.n[] nVarArr = this.f420738b;
            if (nVarArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (org.joda.time.format.n nVar : nVarArr) {
                nVar.e(sb2, eVar, locale);
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.joda.time.format.c$c, reason: collision with other inner class name */
    public static class C12208c extends g {
        @Override // org.joda.time.format.c.f, org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) throws NumberFormatException {
            int i13;
            char cCharAt;
            int iB2 = super.b(eVar, str, i12);
            if (iB2 < 0 || iB2 == (i13 = this.f420748c + i12)) {
                return iB2;
            }
            if (this.f420749d && ((cCharAt = str.charAt(i12)) == '-' || cCharAt == '+')) {
                i13++;
            }
            return iB2 > i13 ? ~(i13 + 1) : iB2 < i13 ? ~iB2 : iB2;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class d implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC44865g f420742b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420743c;

        /* renamed from: d, reason: collision with root package name */
        public final int f420744d;

        public d(AbstractC44865g abstractC44865g, int i12, int i13) {
            this.f420742b = abstractC44865g;
            i13 = i13 > 18 ? 18 : i13;
            this.f420743c = i12;
            this.f420744d = i13;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420744d;
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            AbstractC44864f abstractC44864fB = this.f420742b.b(eVar.f420770a);
            int iMin = Math.min(this.f420744d, str.length() - i12);
            long jD2 = abstractC44864fB.k().d() * 10;
            long j12 = 0;
            int i13 = 0;
            while (i13 < iMin) {
                char cCharAt = str.charAt(i12 + i13);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i13++;
                jD2 /= 10;
                j12 += (cCharAt - '0') * jD2;
            }
            long j13 = j12 / 10;
            if (i13 == 0) {
                return ~i12;
            }
            if (j13 > 2147483647L) {
                return ~i12;
            }
            org.joda.time.field.o oVar = new org.joda.time.field.o(AbstractC44865g.f420903y, org.joda.time.field.m.f420705b, abstractC44864fB.k());
            e.a aVarC = eVar.c();
            aVarC.f420779b = oVar;
            aVarC.f420780c = (int) j13;
            aVarC.f420781d = null;
            aVarC.f420782e = null;
            return i12 + i13;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            f(appendable, j12, abstractC44854a);
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420744d;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            f(sb2, eVar.y().G(eVar), eVar.y());
        }

        public final void f(Appendable appendable, long j12, AbstractC44854a abstractC44854a) throws IOException {
            long j13;
            AbstractC44864f abstractC44864fB = this.f420742b.b(abstractC44854a);
            int i12 = this.f420743c;
            try {
                long jC2 = abstractC44864fB.C(j12);
                if (jC2 == 0) {
                    while (true) {
                        i12--;
                        if (i12 < 0) {
                            return;
                        } else {
                            appendable.append('0');
                        }
                    }
                } else {
                    long jD2 = abstractC44864fB.k().d();
                    int i13 = this.f420744d;
                    while (true) {
                        switch (i13) {
                            case 1:
                                j13 = 10;
                                break;
                            case 2:
                                j13 = 100;
                                break;
                            case 3:
                                j13 = 1000;
                                break;
                            case 4:
                                j13 = 10000;
                                break;
                            case 5:
                                j13 = 100000;
                                break;
                            case 6:
                                j13 = 1000000;
                                break;
                            case 7:
                                j13 = 10000000;
                                break;
                            case 8:
                                j13 = 100000000;
                                break;
                            case 9:
                                j13 = 1000000000;
                                break;
                            case 10:
                                j13 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                                break;
                            case 11:
                                j13 = 100000000000L;
                                break;
                            case 12:
                                j13 = 1000000000000L;
                                break;
                            case 13:
                                j13 = 10000000000000L;
                                break;
                            case 14:
                                j13 = 100000000000000L;
                                break;
                            case 15:
                                j13 = 1000000000000000L;
                                break;
                            case 16:
                                j13 = 10000000000000000L;
                                break;
                            case 17:
                                j13 = 100000000000000000L;
                                break;
                            case 18:
                                j13 = 1000000000000000000L;
                                break;
                            default:
                                j13 = 1;
                                break;
                        }
                        if ((jD2 * j13) / j13 == jD2) {
                            long[] jArr = {(jC2 * j13) / jD2, i13};
                            long j14 = jArr[0];
                            int i14 = (int) jArr[1];
                            String string = (2147483647L & j14) == j14 ? Integer.toString((int) j14) : Long.toString(j14);
                            int length = string.length();
                            while (length < i14) {
                                appendable.append('0');
                                i12--;
                                i14--;
                            }
                            if (i12 < i14) {
                                while (i12 < i14 && length > 1 && string.charAt(length - 1) == '0') {
                                    i14--;
                                    length--;
                                }
                                if (length < string.length()) {
                                    for (int i15 = 0; i15 < length; i15++) {
                                        appendable.append(string.charAt(i15));
                                    }
                                    return;
                                }
                            }
                            appendable.append(string);
                            return;
                        }
                        i13--;
                    }
                }
            } catch (RuntimeException unused) {
                c.p(appendable, i12);
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class e implements org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final org.joda.time.format.l[] f420745b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420746c;

        public e(org.joda.time.format.l[] lVarArr) {
            int iA2;
            this.f420745b = lVarArr;
            int length = lVarArr.length;
            int i12 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.f420746c = i12;
                    return;
                }
                org.joda.time.format.l lVar = lVarArr[length];
                if (lVar != null && (iA2 = lVar.a()) > i12) {
                    i12 = iA2;
                }
            }
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420746c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        
            if (r6 > r12) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
        
            if (r6 != r12) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
        
            if (r3 == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
        
            return ~r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
        
            if (r4 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
        
            r10.d(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
        
            return r6;
         */
        @Override // org.joda.time.format.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int b(org.joda.time.format.e r10, java.lang.String r11, int r12) {
            /*
                r9 = this;
                org.joda.time.format.l[] r0 = r9.f420745b
                int r1 = r0.length
                java.lang.Object r2 = r10.f420778i
                if (r2 != 0) goto Le
                org.joda.time.format.e$b r2 = new org.joda.time.format.e$b
                r2.<init>()
                r10.f420778i = r2
            Le:
                java.lang.Object r2 = r10.f420778i
                r3 = 0
                r4 = 0
                r6 = r12
                r7 = r6
                r5 = r3
            L15:
                if (r5 >= r1) goto L53
                r8 = r0[r5]
                if (r8 != 0) goto L20
                if (r6 > r12) goto L1e
                return r12
            L1e:
                r3 = 1
                goto L53
            L20:
                int r8 = r8.b(r10, r11, r12)
                if (r8 < r12) goto L47
                if (r8 <= r6) goto L4d
                int r4 = r11.length()
                if (r8 >= r4) goto L46
                int r4 = r5 + 1
                if (r4 >= r1) goto L46
                r4 = r0[r4]
                if (r4 != 0) goto L37
                goto L46
            L37:
                java.lang.Object r4 = r10.f420778i
                if (r4 != 0) goto L42
                org.joda.time.format.e$b r4 = new org.joda.time.format.e$b
                r4.<init>()
                r10.f420778i = r4
            L42:
                java.lang.Object r4 = r10.f420778i
                r6 = r8
                goto L4d
            L46:
                return r8
            L47:
                if (r8 >= 0) goto L4d
                int r8 = ~r8
                if (r8 <= r7) goto L4d
                r7 = r8
            L4d:
                r10.d(r2)
                int r5 = r5 + 1
                goto L15
            L53:
                if (r6 > r12) goto L5c
                if (r6 != r12) goto L5a
                if (r3 == 0) goto L5a
                goto L5c
            L5a:
                int r10 = ~r7
                return r10
            L5c:
                if (r4 == 0) goto L61
                r10.d(r4)
            L61:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.c.e.b(org.joda.time.format.e, java.lang.String, int):int");
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static abstract class f implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC44865g f420747b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420748c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f420749d;

        public f(AbstractC44865g abstractC44865g, int i12, boolean z12) {
            this.f420747b = abstractC44865g;
            this.f420748c = i12;
            this.f420749d = z12;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420748c;
        }

        public int b(org.joda.time.format.e eVar, String str, int i12) throws NumberFormatException {
            int i13;
            int i14;
            char cCharAt;
            int iMin = Math.min(this.f420748c, str.length() - i12);
            int i15 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i15 < iMin) {
                int i16 = i12 + i15;
                char cCharAt2 = str.charAt(i16);
                if (i15 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.f420749d)) {
                    boolean z14 = cCharAt2 == '-';
                    boolean z15 = cCharAt2 == '+';
                    int i17 = i15 + 1;
                    if (i17 >= iMin || (cCharAt = str.charAt(i16 + 1)) < '0' || cCharAt > '9') {
                        boolean z16 = z14;
                        z13 = z15;
                        z12 = z16;
                        break;
                    }
                    iMin = Math.min(iMin + 1, str.length() - i12);
                    i15 = i17;
                    boolean z17 = z14;
                    z13 = z15;
                    z12 = z17;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i15++;
                }
            }
            if (i15 == 0) {
                return ~i12;
            }
            if (i15 < 9) {
                int i18 = (z12 || z13) ? i12 + 1 : i12;
                int i19 = i18 + 1;
                try {
                    int iCharAt = str.charAt(i18) - '0';
                    i13 = i12 + i15;
                    while (i19 < i13) {
                        int i22 = (iCharAt << 3) + (iCharAt << 1);
                        int i23 = i19 + 1;
                        int iCharAt2 = (str.charAt(i19) + i22) - 48;
                        i19 = i23;
                        iCharAt = iCharAt2;
                    }
                    i14 = z12 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i12;
                }
            } else if (z13) {
                i13 = i12 + i15;
                i14 = Integer.parseInt(str.subSequence(i12 + 1, i13).toString());
            } else {
                int i24 = i12 + i15;
                i14 = Integer.parseInt(str.subSequence(i12, i24).toString());
                i13 = i24;
            }
            e.a aVarC = eVar.c();
            aVarC.f420779b = this.f420747b.b(eVar.f420770a);
            aVarC.f420780c = i14;
            aVarC.f420781d = null;
            aVarC.f420782e = null;
            return i13;
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class g extends f {

        /* renamed from: e, reason: collision with root package name */
        public final int f420750e;

        public g(AbstractC44865g abstractC44865g, int i12, boolean z12, int i13) {
            super(abstractC44865g, i12, z12);
            this.f420750e = i13;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            int i13 = this.f420750e;
            try {
                org.joda.time.format.i.a(appendable, this.f420747b.b(abstractC44854a).c(j12), i13);
            } catch (RuntimeException unused) {
                c.p(appendable, i13);
            }
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420748c;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            AbstractC44865g abstractC44865g = this.f420747b;
            boolean zF4 = eVar.F4(abstractC44865g);
            int i12 = this.f420750e;
            if (!zF4) {
                c.p(sb2, i12);
                return;
            }
            try {
                org.joda.time.format.i.a(sb2, eVar.I1(abstractC44865g), i12);
            } catch (RuntimeException unused) {
                c.p(sb2, i12);
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class h implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final String f420751b;

        public h(String str) {
            this.f420751b = str;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420751b.length();
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            String str2 = this.f420751b;
            return c.r(i12, str, str2) ? str2.length() + i12 : ~i12;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            appendable.append(this.f420751b);
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420751b.length();
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
            sb2.append((CharSequence) this.f420751b);
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class i implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: d, reason: collision with root package name */
        public static final ConcurrentHashMap f420752d = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC44865g f420753b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f420754c;

        public i(AbstractC44865g abstractC44865g, boolean z12) {
            this.f420753b = abstractC44865g;
            this.f420754c = z12;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return d();
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            int iIntValue;
            Map map;
            Locale locale = eVar.f420771b;
            ConcurrentHashMap concurrentHashMap = f420752d;
            Map concurrentHashMap2 = (Map) concurrentHashMap.get(locale);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap();
                concurrentHashMap.put(locale, concurrentHashMap2);
            }
            Object[] objArr = (Object[]) concurrentHashMap2.get(this.f420753b);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(32);
                y yVar = new y(0L, AbstractC44868j.f420911c);
                AbstractC44865g abstractC44865g = this.f420753b;
                AbstractC44864f abstractC44864fB = abstractC44865g.b(yVar.f420463c);
                if (!abstractC44864fB.B()) {
                    throw new IllegalArgumentException("Field '" + abstractC44865g + "' is not supported");
                }
                y.a aVar = new y.a();
                aVar.f421033b = yVar;
                aVar.f421034c = abstractC44864fB;
                int iS2 = abstractC44864fB.s();
                int iN2 = aVar.f421034c.n();
                if (iN2 - iS2 > 32) {
                    return ~i12;
                }
                iIntValue = aVar.f421034c.m(locale);
                while (iS2 <= iN2) {
                    y yVar2 = aVar.f421033b;
                    yVar2.f420462b = aVar.f421034c.G(iS2, yVar2.f420462b);
                    String strE = aVar.f421034c.e(aVar.f421033b.f420462b, locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap3.put(strE, bool);
                    concurrentHashMap3.put(aVar.f421034c.e(aVar.f421033b.f420462b, locale).toLowerCase(locale), bool);
                    concurrentHashMap3.put(aVar.f421034c.e(aVar.f421033b.f420462b, locale).toUpperCase(locale), bool);
                    concurrentHashMap3.put(aVar.f421034c.h(aVar.f421033b.f420462b, locale), bool);
                    concurrentHashMap3.put(aVar.f421034c.h(aVar.f421033b.f420462b, locale).toLowerCase(locale), bool);
                    concurrentHashMap3.put(aVar.f421034c.h(aVar.f421033b.f420462b, locale).toUpperCase(locale), bool);
                    iS2++;
                }
                if ("en".equals(locale.getLanguage()) && this.f420753b == AbstractC44865g.f420881c) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap3.put("BCE", bool2);
                    concurrentHashMap3.put("bce", bool2);
                    concurrentHashMap3.put("CE", bool2);
                    concurrentHashMap3.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(this.f420753b, new Object[]{concurrentHashMap3, Integer.valueOf(iIntValue)});
                map = concurrentHashMap3;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(str.length(), iIntValue + i12); iMin > i12; iMin--) {
                String string = str.subSequence(i12, iMin).toString();
                if (map.containsKey(string)) {
                    AbstractC44865g abstractC44865g2 = this.f420753b;
                    e.a aVarC = eVar.c();
                    aVarC.f420779b = abstractC44865g2.b(eVar.f420770a);
                    aVarC.f420780c = 0;
                    aVarC.f420781d = string;
                    aVarC.f420782e = locale;
                    return iMin;
                }
            }
            return ~i12;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            try {
                AbstractC44864f abstractC44864fB = this.f420753b.b(abstractC44854a);
                appendable.append(this.f420754c ? abstractC44864fB.e(j12, locale) : abstractC44864fB.h(j12, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420754c ? 6 : 20;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
            String strF;
            try {
                AbstractC44865g abstractC44865g = this.f420753b;
                if (eVar.F4(abstractC44865g)) {
                    AbstractC44864f abstractC44864fB = abstractC44865g.b(eVar.y());
                    strF = this.f420754c ? abstractC44864fB.f(eVar, locale) : abstractC44864fB.i(eVar, locale);
                } else {
                    strF = "�";
                }
                sb2.append((CharSequence) strF);
            } catch (RuntimeException unused) {
                sb2.append((char) 65533);
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class m implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC44865g f420767b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420768c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f420769d;

        public m(AbstractC44865g abstractC44865g, int i12, boolean z12) {
            this.f420767b = abstractC44865g;
            this.f420768c = i12;
            this.f420769d = z12;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420769d ? 4 : 2;
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) throws NumberFormatException {
            int i13;
            int i14;
            int i15 = i12;
            int length = str.length() - i15;
            AbstractC44865g abstractC44865g = this.f420767b;
            AbstractC44854a abstractC44854a = eVar.f420770a;
            if (this.f420769d) {
                int i16 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (i16 < length) {
                    char cCharAt = str.charAt(i15 + i16);
                    if (i16 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z13 = cCharAt == '-';
                        if (z13) {
                            i16++;
                        } else {
                            i15++;
                            length--;
                        }
                        z12 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i16++;
                    }
                }
                if (i16 == 0) {
                    return ~i15;
                }
                if (z12 || i16 != 2) {
                    if (i16 >= 9) {
                        i13 = i16 + i15;
                        i14 = Integer.parseInt(str.subSequence(i15, i13).toString());
                    } else {
                        int i17 = z13 ? i15 + 1 : i15;
                        int i18 = i17 + 1;
                        try {
                            int iCharAt = str.charAt(i17) - '0';
                            i13 = i16 + i15;
                            while (i18 < i13) {
                                int iCharAt2 = (str.charAt(i18) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                                i18++;
                                iCharAt = iCharAt2;
                            }
                            i14 = z13 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i15;
                        }
                    }
                    e.a aVarC = eVar.c();
                    aVarC.f420779b = abstractC44865g.b(abstractC44854a);
                    aVarC.f420780c = i14;
                    aVarC.f420781d = null;
                    aVarC.f420782e = null;
                    return i13;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i15;
            }
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i15;
            }
            int i19 = cCharAt2 - '0';
            char cCharAt3 = str.charAt(i15 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i15;
            }
            int i22 = (((i19 << 3) + (i19 << 1)) + cCharAt3) - 48;
            int i23 = this.f420768c;
            int i24 = i23 - 50;
            int i25 = i24 >= 0 ? i24 % 100 : ((i23 - 49) % 100) + 99;
            int i26 = ((i24 + (i22 < i25 ? 100 : 0)) - i25) + i22;
            e.a aVarC2 = eVar.c();
            aVarC2.f420779b = abstractC44865g.b(abstractC44854a);
            aVarC2.f420780c = i26;
            aVarC2.f420781d = null;
            aVarC2.f420782e = null;
            return i15 + 2;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            int i13;
            try {
                int iC2 = this.f420767b.b(abstractC44854a).c(j12);
                if (iC2 < 0) {
                    iC2 = -iC2;
                }
                i13 = iC2 % 100;
            } catch (RuntimeException unused) {
                i13 = -1;
            }
            if (i13 >= 0) {
                org.joda.time.format.i.a(appendable, i13, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return 2;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            int i12;
            AbstractC44865g abstractC44865g = this.f420767b;
            if (eVar.F4(abstractC44865g)) {
                try {
                    int iI1 = eVar.I1(abstractC44865g);
                    if (iI1 < 0) {
                        iI1 = -iI1;
                    }
                    i12 = iI1 % 100;
                } catch (RuntimeException unused) {
                }
            } else {
                i12 = -1;
            }
            if (i12 >= 0) {
                org.joda.time.format.i.a(sb2, i12, 2);
            } else {
                sb2.append((char) 65533);
                sb2.append((char) 65533);
            }
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class n extends f {
        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            try {
                org.joda.time.format.i.c(appendable, this.f420747b.b(abstractC44854a).c(j12));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420748c;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
            AbstractC44865g abstractC44865g = this.f420747b;
            if (!eVar.F4(abstractC44865g)) {
                sb2.append((char) 65533);
                return;
            }
            try {
                org.joda.time.format.i.c(sb2, eVar.I1(abstractC44865g));
            } catch (RuntimeException unused) {
                sb2.append((char) 65533);
            }
        }
    }

    public static void p(Appendable appendable, int i12) throws IOException {
        while (true) {
            i12--;
            if (i12 < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    public static boolean q(int i12, String str, String str2) {
        int length = str2.length();
        if (str.length() - i12 < length) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i12 + i13) != str2.charAt(i13)) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(int i12, String str, String str2) {
        char upperCase;
        char upperCase2;
        int length = str2.length();
        if (str.length() - i12 < length) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i12 + i13);
            char cCharAt2 = str2.charAt(i13);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(Object obj) {
        if (obj instanceof org.joda.time.format.l) {
            return ((obj instanceof b) && ((b) obj).f420739c == null) ? false : true;
        }
        return false;
    }

    public final void a(org.joda.time.format.b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        d(bVar.f420731a, bVar.f420732b);
    }

    public final void b(org.joda.time.format.d[] dVarArr) {
        int length = dVarArr.length;
        int i12 = 0;
        if (length == 1) {
            org.joda.time.format.d dVar = dVarArr[0];
            if (dVar == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            d(null, org.joda.time.format.f.c(dVar));
            return;
        }
        org.joda.time.format.l[] lVarArr = new org.joda.time.format.l[length];
        while (i12 < length - 1) {
            org.joda.time.format.l lVarC = org.joda.time.format.f.c(dVarArr[i12]);
            lVarArr[i12] = lVarC;
            if (lVarC == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i12++;
        }
        lVarArr[i12] = org.joda.time.format.f.c(dVarArr[i12]);
        d(null, new e(lVarArr));
    }

    public final void c(Object obj) {
        this.f420736b = null;
        ArrayList<Object> arrayList = this.f420735a;
        arrayList.add(obj);
        arrayList.add(obj);
    }

    public final void d(org.joda.time.format.n nVar, org.joda.time.format.l lVar) {
        this.f420736b = null;
        ArrayList<Object> arrayList = this.f420735a;
        arrayList.add(nVar);
        arrayList.add(lVar);
    }

    public final void e(int i12) {
        g(AbstractC44865g.f420888j, i12, 2);
    }

    public final void f(int i12) {
        g(AbstractC44865g.f420892n, i12, 1);
    }

    public final void g(AbstractC44865g abstractC44865g, int i12, int i13) {
        if (abstractC44865g == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i13 < i12) {
            i13 = i12;
        }
        if (i12 < 0 || i13 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i12 <= 1) {
            c(new n(abstractC44865g, i13, false));
        } else {
            c(new g(abstractC44865g, i13, false, i12));
        }
    }

    public final void h(AbstractC44865g abstractC44865g, int i12) {
        if (i12 <= 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Illegal number of digits: "));
        }
        c(new C12208c(abstractC44865g, i12, false, i12));
    }

    public final void i(AbstractC44865g abstractC44865g, int i12, int i13) {
        if (i13 < i12) {
            i13 = i12;
        }
        if (i12 < 0 || i13 <= 0) {
            throw new IllegalArgumentException();
        }
        c(new d(abstractC44865g, i12, i13));
    }

    public final void j(char c12) {
        c(new a(c12));
    }

    public final void k(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                c(new h(str));
            } else {
                c(new a(str.charAt(0)));
            }
        }
    }

    public final void l(org.joda.time.format.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
        d(null, new e(new org.joda.time.format.l[]{org.joda.time.format.f.c(dVar), null}));
    }

    public final void m(AbstractC44865g abstractC44865g, int i12, int i13) {
        if (i13 < i12) {
            i13 = i12;
        }
        if (i12 < 0 || i13 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i12 <= 1) {
            c(new n(abstractC44865g, i13, true));
        } else {
            c(new g(abstractC44865g, i13, true, i12));
        }
    }

    public final void n(AbstractC44865g abstractC44865g) {
        c(new i(abstractC44865g, false));
    }

    public final void o(int i12, String str, boolean z12) {
        c(new l(i12, str, str, z12));
    }

    public final Object s() {
        Object bVar = this.f420736b;
        if (bVar == null) {
            ArrayList<Object> arrayList = this.f420735a;
            if (arrayList.size() == 2) {
                Object obj = arrayList.get(0);
                Object obj2 = arrayList.get(1);
                if (obj == null) {
                    bVar = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    bVar = obj;
                }
            }
            if (bVar == null) {
                bVar = new b(arrayList);
            }
            this.f420736b = bVar;
        }
        return bVar;
    }

    public final org.joda.time.format.b u() {
        Object objS = s();
        boolean z12 = false;
        if ((objS instanceof org.joda.time.format.n) && (!(objS instanceof b) || ((b) objS).f420738b != null)) {
            z12 = true;
        }
        org.joda.time.format.n nVar = z12 ? (org.joda.time.format.n) objS : null;
        org.joda.time.format.l lVar = t(objS) ? (org.joda.time.format.l) objS : null;
        if (nVar == null && lVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new org.joda.time.format.b(nVar, lVar);
    }

    public final org.joda.time.format.d v() {
        Object objS = s();
        if (t(objS)) {
            return org.joda.time.format.m.d((org.joda.time.format.l) objS);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DateTimeFormatterBuilder.java */
    public static final class j implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public static final j f420755b;

        /* renamed from: c, reason: collision with root package name */
        public static final HashMap f420756c;

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList f420757d;

        /* renamed from: e, reason: collision with root package name */
        public static final int f420758e;

        /* renamed from: f, reason: collision with root package name */
        public static final int f420759f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ j[] f420760g;

        static {
            j jVar = new j("INSTANCE", 0);
            f420755b = jVar;
            f420760g = new j[]{jVar};
            f420757d = new ArrayList();
            ArrayList arrayList = new ArrayList(AbstractC44868j.l().b());
            Collections.sort(arrayList);
            f420756c = new HashMap();
            Iterator it = arrayList.iterator();
            int iMax = 0;
            int iMax2 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    HashMap map = f420756c;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    ((List) map.get(strSubstring)).add(strSubstring2);
                } else {
                    f420757d.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            f420758e = iMax;
            f420759f = iMax2;
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f420760g.clone();
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return f420758e;
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            String string;
            int length;
            String string2;
            List list = f420757d;
            int length2 = str.length();
            int iMin = Math.min(length2, f420759f + i12);
            int i13 = i12;
            while (true) {
                if (i13 >= iMin) {
                    string = "";
                    length = i12;
                    break;
                }
                if (str.charAt(i13) == '/') {
                    int i14 = i13 + 1;
                    string = str.subSequence(i12, i14).toString();
                    length = string.length() + i12;
                    if (i13 < length2) {
                        StringBuilder sbR = H.r(string);
                        sbR.append(str.charAt(i14));
                        string2 = sbR.toString();
                    } else {
                        string2 = string;
                    }
                    list = (List) f420756c.get(string2);
                    if (list == null) {
                        return ~i12;
                    }
                } else {
                    i13++;
                }
            }
            String str2 = null;
            for (int i15 = 0; i15 < list.size(); i15++) {
                String str3 = (String) list.get(i15);
                if (c.q(length, str, str3) && (str2 == null || str3.length() > str2.length())) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                return ~i12;
            }
            AbstractC44868j abstractC44868jC = AbstractC44868j.c(string.concat(str2));
            eVar.f420778i = null;
            eVar.f420773d = abstractC44868jC;
            return str2.length() + length;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            appendable.append(abstractC44868j != null ? abstractC44868j.f420915b : "");
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return f420758e;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class k implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final int f420761b;

        public k(int i12) {
            this.f420761b = i12;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return this.f420761b == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.l
        public final int b(org.joda.time.format.e eVar, String str, int i12) {
            AtomicReference<Map<String, AbstractC44868j>> atomicReference = C44866h.f420910c;
            Map<String, AbstractC44868j> map = atomicReference.get();
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
                linkedHashMap.put("UT", abstractC44868j);
                linkedHashMap.put("UTC", abstractC44868j);
                linkedHashMap.put("GMT", abstractC44868j);
                C44866h.c("EST", "America/New_York", linkedHashMap);
                C44866h.c("EDT", "America/New_York", linkedHashMap);
                C44866h.c("CST", "America/Chicago", linkedHashMap);
                C44866h.c("CDT", "America/Chicago", linkedHashMap);
                C44866h.c("MST", "America/Denver", linkedHashMap);
                C44866h.c("MDT", "America/Denver", linkedHashMap);
                C44866h.c("PST", "America/Los_Angeles", linkedHashMap);
                C44866h.c("PDT", "America/Los_Angeles", linkedHashMap);
                Map<String, AbstractC44868j> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                while (true) {
                    if (atomicReference.compareAndSet(null, mapUnmodifiableMap)) {
                        map = mapUnmodifiableMap;
                        break;
                    }
                    if (atomicReference.get() != null) {
                        map = atomicReference.get();
                        break;
                    }
                }
            }
            String str2 = null;
            for (String str3 : map.keySet()) {
                if (c.q(i12, str, str3) && (str2 == null || str3.length() > str2.length())) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                return ~i12;
            }
            AbstractC44868j abstractC44868j2 = map.get(str2);
            eVar.f420778i = null;
            eVar.f420773d = abstractC44868j2;
            return str2.length() + i12;
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws ClassNotFoundException, IOException {
            String strQ;
            long j13 = j12 - i12;
            String str = "";
            if (abstractC44868j != null) {
                String strB = null;
                String str2 = abstractC44868j.f420915b;
                int i13 = this.f420761b;
                if (i13 == 0) {
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String strG = abstractC44868j.g(j13);
                    if (strG != null) {
                        org.joda.time.tz.e eVarH = AbstractC44868j.h();
                        if (eVarH instanceof org.joda.time.tz.c) {
                            String[] strArrE = ((org.joda.time.tz.c) eVarH).e(locale, str2, strG, abstractC44868j.i(j13) == abstractC44868j.m(j13));
                            if (strArrE != null) {
                                strB = strArrE[1];
                            }
                        } else {
                            strB = eVarH.b(locale, str2, strG);
                        }
                        if (strB == null) {
                            strQ = AbstractC44868j.q(abstractC44868j.i(j13));
                            str = strQ;
                        }
                        str = strB;
                    }
                    str = str2;
                } else if (i13 == 1) {
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String strG2 = abstractC44868j.g(j13);
                    if (strG2 != null) {
                        org.joda.time.tz.e eVarH2 = AbstractC44868j.h();
                        if (eVarH2 instanceof org.joda.time.tz.c) {
                            String[] strArrE2 = ((org.joda.time.tz.c) eVarH2).e(locale, str2, strG2, abstractC44868j.i(j13) == abstractC44868j.m(j13));
                            if (strArrE2 != null) {
                                strB = strArrE2[0];
                            }
                        } else {
                            strB = eVarH2.a(locale, str2, strG2);
                        }
                        if (strB == null) {
                            strQ = AbstractC44868j.q(abstractC44868j.i(j13));
                            str = strQ;
                        }
                        str = strB;
                    }
                    str = str2;
                }
            }
            appendable.append(str);
        }

        @Override // org.joda.time.format.n
        public final int d() {
            return this.f420761b == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    public static class l implements org.joda.time.format.n, org.joda.time.format.l {

        /* renamed from: b, reason: collision with root package name */
        public final String f420762b;

        /* renamed from: c, reason: collision with root package name */
        public final String f420763c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f420764d;

        /* renamed from: e, reason: collision with root package name */
        public final int f420765e;

        /* renamed from: f, reason: collision with root package name */
        public final int f420766f;

        public l(int i12, String str, String str2, boolean z12) {
            this.f420762b = str;
            this.f420763c = str2;
            this.f420764d = z12;
            if (i12 < 2) {
                throw new IllegalArgumentException();
            }
            this.f420765e = 2;
            this.f420766f = i12;
        }

        public static int f(int i12, int i13, String str) {
            int i14 = 0;
            for (int iMin = Math.min(str.length() - i12, i13); iMin > 0; iMin--) {
                char cCharAt = str.charAt(i12 + i14);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i14++;
            }
            return i14;
        }

        @Override // org.joda.time.format.l
        public final int a() {
            return d();
        }

        /* JADX WARN: Removed duplicated region for block: B:82:0x00e6 A[PHI: r0 r7
  0x00e6: PHI (r0v4 int) = (r0v3 int), (r0v5 int), (r0v3 int) binds: [B:75:0x00d1, B:93:0x0104, B:81:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r7v8 int) = (r7v7 int), (r7v9 int), (r7v7 int) binds: [B:75:0x00d1, B:93:0x0104, B:81:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // org.joda.time.format.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int b(org.joda.time.format.e r13, java.lang.String r14, int r15) {
            /*
                Method dump skipped, instructions count: 298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.c.l.b(org.joda.time.format.e, java.lang.String, int):int");
        }

        @Override // org.joda.time.format.n
        public final void c(Appendable appendable, long j12, AbstractC44854a abstractC44854a, int i12, AbstractC44868j abstractC44868j, Locale locale) throws IOException {
            String str;
            if (abstractC44868j == null) {
                return;
            }
            if (i12 == 0 && (str = this.f420762b) != null) {
                appendable.append(str);
                return;
            }
            if (i12 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i12 = -i12;
            }
            int i13 = i12 / Constants.ONE_HOUR;
            org.joda.time.format.i.a(appendable, i13, 2);
            int i14 = this.f420766f;
            if (i14 == 1) {
                return;
            }
            int i15 = i12 - (i13 * Constants.ONE_HOUR);
            int i16 = this.f420765e;
            if (i15 != 0 || i16 > 1) {
                int i17 = i15 / 60000;
                boolean z12 = this.f420764d;
                if (z12) {
                    appendable.append(':');
                }
                org.joda.time.format.i.a(appendable, i17, 2);
                if (i14 == 2) {
                    return;
                }
                int i18 = i15 - (i17 * 60000);
                if (i18 != 0 || i16 > 2) {
                    int i19 = i18 / 1000;
                    if (z12) {
                        appendable.append(':');
                    }
                    org.joda.time.format.i.a(appendable, i19, 2);
                    if (i14 == 3) {
                        return;
                    }
                    int i22 = i18 - (i19 * 1000);
                    if (i22 != 0 || i16 > 3) {
                        if (z12) {
                            appendable.append('.');
                        }
                        org.joda.time.format.i.a(appendable, i22, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.n
        public final int d() {
            int i12 = this.f420765e;
            int i13 = (i12 + 1) << 1;
            if (this.f420764d) {
                i13 += i12 - 1;
            }
            String str = this.f420762b;
            return (str == null || str.length() <= i13) ? i13 : str.length();
        }

        @Override // org.joda.time.format.n
        public final void e(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) {
        }
    }
}
