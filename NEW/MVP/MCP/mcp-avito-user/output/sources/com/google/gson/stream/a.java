package com.google.gson.stream;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.google.gson.internal.v;
import com.google.gson.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonReader.java */
/* loaded from: classes6.dex */
public class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final Reader f362207b;

    /* renamed from: j, reason: collision with root package name */
    public long f362215j;

    /* renamed from: k, reason: collision with root package name */
    public int f362216k;

    /* renamed from: l, reason: collision with root package name */
    public String f362217l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f362218m;

    /* renamed from: o, reason: collision with root package name */
    public String[] f362220o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f362221p;

    /* renamed from: c, reason: collision with root package name */
    public boolean f362208c = false;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f362209d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    public int f362210e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f362211f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f362212g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f362213h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f362214i = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f362219n = 1;

    /* compiled from: JsonReader.java */
    /* renamed from: com.google.gson.stream.a$a, reason: collision with other inner class name */
    public class C10735a extends v {
        @Override // com.google.gson.internal.v
        public final void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                com.google.gson.internal.bind.a aVar2 = (com.google.gson.internal.bind.a) aVar;
                aVar2.N(JsonToken.f362200f);
                Map.Entry entry = (Map.Entry) ((Iterator) aVar2.Q()).next();
                aVar2.S(entry.getValue());
                aVar2.S(new m((String) entry.getKey()));
                return;
            }
            int iD2 = aVar.f362214i;
            if (iD2 == 0) {
                iD2 = aVar.d();
            }
            if (iD2 == 13) {
                aVar.f362214i = 9;
                return;
            }
            if (iD2 == 12) {
                aVar.f362214i = 8;
            } else {
                if (iD2 == 14) {
                    aVar.f362214i = 10;
                    return;
                }
                throw new IllegalStateException("Expected a name but was " + aVar.F() + aVar.n());
            }
        }
    }

    static {
        v.f362169a = new C10735a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f362218m = iArr;
        iArr[0] = 6;
        this.f362220o = new String[32];
        this.f362221p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f362207b = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f362210e = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r10.f362210e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A(char r11) throws com.google.gson.stream.MalformedJsonException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f362210e
            int r3 = r10.f362211f
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f362209d
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f362210e = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f362210e = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.H()
            r1.append(r2)
            int r2 = r10.f362210e
            int r3 = r10.f362211f
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f362212g
            int r2 = r2 + r6
            r10.f362212g = r2
            r10.f362213h = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f362210e = r2
            boolean r2 = r10.h(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.M(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.A(char):java.lang.String");
    }

    public String B() {
        String str;
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 10) {
            str = D();
        } else if (iD2 == 8) {
            str = A('\'');
        } else if (iD2 == 9) {
            str = A('\"');
        } else if (iD2 == 11) {
            str = this.f362217l;
            this.f362217l = null;
        } else if (iD2 == 15) {
            str = Long.toString(this.f362215j);
        } else {
            if (iD2 != 16) {
                throw new IllegalStateException("Expected a string but was " + F() + n());
            }
            str = new String(this.f362209d, this.f362210e, this.f362216k);
            this.f362210e += this.f362216k;
        }
        this.f362214i = 0;
        int[] iArr = this.f362221p;
        int i12 = this.f362219n - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String D() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f362210e
            int r4 = r3 + r2
            int r5 = r7.f362211f
            char[] r6 = r7.f362209d
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.h(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f362210e
            r0.append(r6, r3, r2)
            int r3 = r7.f362210e
            int r3 = r3 + r2
            r7.f362210e = r3
            r2 = 1
            boolean r2 = r7.h(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f362210e
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f362210e
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f362210e
            int r2 = r2 + r1
            r7.f362210e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.D():java.lang.String");
    }

    public JsonToken F() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        switch (iD2) {
            case 1:
                return JsonToken.f362198d;
            case 2:
                return JsonToken.f362199e;
            case 3:
                return JsonToken.f362196b;
            case 4:
                return JsonToken.f362197c;
            case 5:
            case 6:
                return JsonToken.f362203i;
            case 7:
                return JsonToken.f362204j;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.f362201g;
            case 12:
            case 13:
            case 14:
                return JsonToken.f362200f;
            case 15:
            case 16:
                return JsonToken.f362202h;
            case 17:
                return JsonToken.f362205k;
            default:
                throw new AssertionError();
        }
    }

    public final void G(int i12) {
        int i13 = this.f362219n;
        int[] iArr = this.f362218m;
        if (i13 == iArr.length) {
            int i14 = i13 * 2;
            this.f362218m = Arrays.copyOf(iArr, i14);
            this.f362221p = Arrays.copyOf(this.f362221p, i14);
            this.f362220o = (String[]) Arrays.copyOf(this.f362220o, i14);
        }
        int[] iArr2 = this.f362218m;
        int i15 = this.f362219n;
        this.f362219n = i15 + 1;
        iArr2[i15] = i12;
    }

    public final char H() throws MalformedJsonException {
        int i12;
        if (this.f362210e == this.f362211f && !h(1)) {
            M("Unterminated escape sequence");
            throw null;
        }
        int i13 = this.f362210e;
        int i14 = i13 + 1;
        this.f362210e = i14;
        char[] cArr = this.f362209d;
        char c12 = cArr[i13];
        if (c12 == '\n') {
            this.f362212g++;
            this.f362213h = i14;
        } else if (c12 != '\"' && c12 != '\'' && c12 != '/' && c12 != '\\') {
            if (c12 == 'b') {
                return '\b';
            }
            if (c12 == 'f') {
                return '\f';
            }
            if (c12 == 'n') {
                return '\n';
            }
            if (c12 == 'r') {
                return '\r';
            }
            if (c12 == 't') {
                return '\t';
            }
            if (c12 != 'u') {
                M("Invalid escape sequence");
                throw null;
            }
            if (i13 + 5 > this.f362211f && !h(4)) {
                M("Unterminated escape sequence");
                throw null;
            }
            int i15 = this.f362210e;
            int i16 = i15 + 4;
            char c13 = 0;
            while (i15 < i16) {
                char c14 = cArr[i15];
                char c15 = (char) (c13 << 4);
                if (c14 >= '0' && c14 <= '9') {
                    i12 = c14 - '0';
                } else if (c14 >= 'a' && c14 <= 'f') {
                    i12 = c14 - 'W';
                } else {
                    if (c14 < 'A' || c14 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f362210e, 4)));
                    }
                    i12 = c14 - '7';
                }
                c13 = (char) (i12 + c15);
                i15++;
            }
            this.f362210e += 4;
            return c13;
        }
        return c12;
    }

    public final void I(char c12) throws MalformedJsonException {
        do {
            int i12 = this.f362210e;
            int i13 = this.f362211f;
            while (i12 < i13) {
                int i14 = i12 + 1;
                char c13 = this.f362209d[i12];
                if (c13 == c12) {
                    this.f362210e = i14;
                    return;
                }
                if (c13 == '\\') {
                    this.f362210e = i14;
                    H();
                    i12 = this.f362210e;
                    i13 = this.f362211f;
                } else {
                    if (c13 == '\n') {
                        this.f362212g++;
                        this.f362213h = i14;
                    }
                    i12 = i14;
                }
            }
            this.f362210e = i12;
        } while (h(1));
        M("Unterminated string");
        throw null;
    }

    public final void J() {
        char c12;
        do {
            if (this.f362210e >= this.f362211f && !h(1)) {
                return;
            }
            int i12 = this.f362210e;
            int i13 = i12 + 1;
            this.f362210e = i13;
            c12 = this.f362209d[i12];
            if (c12 == '\n') {
                this.f362212g++;
                this.f362213h = i13;
                return;
            }
        } while (c12 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a1, code lost:
    
        c();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.L():void");
    }

    public final void M(String str) throws MalformedJsonException {
        StringBuilder sbR = H.r(str);
        sbR.append(n());
        throw new MalformedJsonException(sbR.toString());
    }

    public void a() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 3) {
            G(1);
            this.f362221p[this.f362219n - 1] = 0;
            this.f362214i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + F() + n());
        }
    }

    public void b() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 1) {
            G(3);
            this.f362214i = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + F() + n());
        }
    }

    public final void c() throws MalformedJsonException {
        if (this.f362208c) {
            return;
        }
        M("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f362214i = 0;
        this.f362218m[0] = 8;
        this.f362219n = 1;
        this.f362207b.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0210, code lost:
    
        if (m(r1) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.d():int");
    }

    public void f() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + F() + n());
        }
        int i12 = this.f362219n;
        this.f362219n = i12 - 1;
        int[] iArr = this.f362221p;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f362214i = 0;
    }

    public void g() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + F() + n());
        }
        int i12 = this.f362219n;
        int i13 = i12 - 1;
        this.f362219n = i13;
        this.f362220o[i13] = null;
        int[] iArr = this.f362221p;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f362214i = 0;
    }

    public String getPath() {
        return i(false);
    }

    public final boolean h(int i12) throws IOException {
        int i13;
        int i14;
        int i15 = this.f362213h;
        int i16 = this.f362210e;
        this.f362213h = i15 - i16;
        int i17 = this.f362211f;
        char[] cArr = this.f362209d;
        if (i17 != i16) {
            int i18 = i17 - i16;
            this.f362211f = i18;
            System.arraycopy(cArr, i16, cArr, 0, i18);
        } else {
            this.f362211f = 0;
        }
        this.f362210e = 0;
        do {
            int i19 = this.f362211f;
            int i22 = this.f362207b.read(cArr, i19, cArr.length - i19);
            if (i22 == -1) {
                return false;
            }
            i13 = this.f362211f + i22;
            this.f362211f = i13;
            if (this.f362212g == 0 && (i14 = this.f362213h) == 0 && i13 > 0 && cArr[0] == 65279) {
                this.f362210e++;
                this.f362213h = i14 + 1;
                i12++;
            }
        } while (i13 < i12);
        return true;
    }

    public final String i(boolean z12) {
        StringBuilder sb2 = new StringBuilder("$");
        int i12 = 0;
        while (true) {
            int i13 = this.f362219n;
            if (i12 >= i13) {
                return sb2.toString();
            }
            int i14 = this.f362218m[i12];
            if (i14 == 1 || i14 == 2) {
                int i15 = this.f362221p[i12];
                if (z12 && i15 > 0 && i12 == i13 - 1) {
                    i15--;
                }
                sb2.append('[');
                sb2.append(i15);
                sb2.append(']');
            } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                sb2.append('.');
                String str = this.f362220o[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i12++;
        }
    }

    public String j() {
        return i(true);
    }

    public boolean k() throws IOException {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        return (iD2 == 2 || iD2 == 4 || iD2 == 17) ? false : true;
    }

    public final boolean m(char c12) throws MalformedJsonException {
        if (c12 == '\t' || c12 == '\n' || c12 == '\f' || c12 == '\r' || c12 == ' ') {
            return false;
        }
        if (c12 != '#') {
            if (c12 == ',') {
                return false;
            }
            if (c12 != '/' && c12 != '=') {
                if (c12 == '{' || c12 == '}' || c12 == ':') {
                    return false;
                }
                if (c12 != ';') {
                    switch (c12) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    final String n() {
        StringBuilder sbY = r.y(this.f362212g + 1, (this.f362210e - this.f362213h) + 1, " at line ", " column ", " path ");
        sbY.append(getPath());
        return sbY.toString();
    }

    public boolean o() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 5) {
            this.f362214i = 0;
            int[] iArr = this.f362221p;
            int i12 = this.f362219n - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (iD2 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + F() + n());
        }
        this.f362214i = 0;
        int[] iArr2 = this.f362221p;
        int i13 = this.f362219n - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return false;
    }

    public double p() throws IOException, NumberFormatException {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 15) {
            this.f362214i = 0;
            int[] iArr = this.f362221p;
            int i12 = this.f362219n - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f362215j;
        }
        if (iD2 == 16) {
            this.f362217l = new String(this.f362209d, this.f362210e, this.f362216k);
            this.f362210e += this.f362216k;
        } else if (iD2 == 8 || iD2 == 9) {
            this.f362217l = A(iD2 == 8 ? '\'' : '\"');
        } else if (iD2 == 10) {
            this.f362217l = D();
        } else if (iD2 != 11) {
            throw new IllegalStateException("Expected a double but was " + F() + n());
        }
        this.f362214i = 11;
        double d12 = Double.parseDouble(this.f362217l);
        if (!this.f362208c && (Double.isNaN(d12) || Double.isInfinite(d12))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d12 + n());
        }
        this.f362217l = null;
        this.f362214i = 0;
        int[] iArr2 = this.f362221p;
        int i13 = this.f362219n - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return d12;
    }

    public int q() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 15) {
            long j12 = this.f362215j;
            int i12 = (int) j12;
            if (j12 != i12) {
                throw new NumberFormatException("Expected an int but was " + this.f362215j + n());
            }
            this.f362214i = 0;
            int[] iArr = this.f362221p;
            int i13 = this.f362219n - 1;
            iArr[i13] = iArr[i13] + 1;
            return i12;
        }
        if (iD2 == 16) {
            this.f362217l = new String(this.f362209d, this.f362210e, this.f362216k);
            this.f362210e += this.f362216k;
        } else {
            if (iD2 != 8 && iD2 != 9 && iD2 != 10) {
                throw new IllegalStateException("Expected an int but was " + F() + n());
            }
            if (iD2 == 10) {
                this.f362217l = D();
            } else {
                this.f362217l = A(iD2 == 8 ? '\'' : '\"');
            }
            try {
                int i14 = Integer.parseInt(this.f362217l);
                this.f362214i = 0;
                int[] iArr2 = this.f362221p;
                int i15 = this.f362219n - 1;
                iArr2[i15] = iArr2[i15] + 1;
                return i14;
            } catch (NumberFormatException unused) {
            }
        }
        this.f362214i = 11;
        double d12 = Double.parseDouble(this.f362217l);
        int i16 = (int) d12;
        if (i16 != d12) {
            throw new NumberFormatException("Expected an int but was " + this.f362217l + n());
        }
        this.f362217l = null;
        this.f362214i = 0;
        int[] iArr3 = this.f362221p;
        int i17 = this.f362219n - 1;
        iArr3[i17] = iArr3[i17] + 1;
        return i16;
    }

    public String toString() {
        return getClass().getSimpleName() + n();
    }

    public long u() throws IOException, NumberFormatException {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 15) {
            this.f362214i = 0;
            int[] iArr = this.f362221p;
            int i12 = this.f362219n - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f362215j;
        }
        if (iD2 == 16) {
            this.f362217l = new String(this.f362209d, this.f362210e, this.f362216k);
            this.f362210e += this.f362216k;
        } else {
            if (iD2 != 8 && iD2 != 9 && iD2 != 10) {
                throw new IllegalStateException("Expected a long but was " + F() + n());
            }
            if (iD2 == 10) {
                this.f362217l = D();
            } else {
                this.f362217l = A(iD2 == 8 ? '\'' : '\"');
            }
            try {
                long j12 = Long.parseLong(this.f362217l);
                this.f362214i = 0;
                int[] iArr2 = this.f362221p;
                int i13 = this.f362219n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return j12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f362214i = 11;
        double d12 = Double.parseDouble(this.f362217l);
        long j13 = (long) d12;
        if (j13 != d12) {
            throw new NumberFormatException("Expected a long but was " + this.f362217l + n());
        }
        this.f362217l = null;
        this.f362214i = 0;
        int[] iArr3 = this.f362221p;
        int i14 = this.f362219n - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return j13;
    }

    public String x() {
        String strA;
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 == 14) {
            strA = D();
        } else if (iD2 == 12) {
            strA = A('\'');
        } else {
            if (iD2 != 13) {
                throw new IllegalStateException("Expected a name but was " + F() + n());
            }
            strA = A('\"');
        }
        this.f362214i = 0;
        this.f362220o[this.f362219n - 1] = strA;
        return strA;
    }

    public final int y(boolean z12) throws IOException {
        int i12 = this.f362210e;
        int i13 = this.f362211f;
        while (true) {
            if (i12 == i13) {
                this.f362210e = i12;
                if (!h(1)) {
                    if (!z12) {
                        return -1;
                    }
                    throw new EOFException("End of input" + n());
                }
                i12 = this.f362210e;
                i13 = this.f362211f;
            }
            int i14 = i12 + 1;
            char[] cArr = this.f362209d;
            char c12 = cArr[i12];
            if (c12 == '\n') {
                this.f362212g++;
                this.f362213h = i14;
            } else if (c12 != ' ' && c12 != '\r' && c12 != '\t') {
                if (c12 == '/') {
                    this.f362210e = i14;
                    if (i14 == i13) {
                        this.f362210e = i12;
                        boolean zH2 = h(2);
                        this.f362210e++;
                        if (!zH2) {
                            return c12;
                        }
                    }
                    c();
                    int i15 = this.f362210e;
                    char c13 = cArr[i15];
                    if (c13 == '*') {
                        this.f362210e = i15 + 1;
                        while (true) {
                            if (this.f362210e + 2 > this.f362211f && !h(2)) {
                                M("Unterminated comment");
                                throw null;
                            }
                            int i16 = this.f362210e;
                            if (cArr[i16] != '\n') {
                                for (int i17 = 0; i17 < 2; i17++) {
                                    if (cArr[this.f362210e + i17] != "*/".charAt(i17)) {
                                        break;
                                    }
                                }
                                i12 = this.f362210e + 2;
                                i13 = this.f362211f;
                                break;
                            }
                            this.f362212g++;
                            this.f362213h = i16 + 1;
                            this.f362210e++;
                        }
                    } else {
                        if (c13 != '/') {
                            return c12;
                        }
                        this.f362210e = i15 + 1;
                        J();
                        i12 = this.f362210e;
                        i13 = this.f362211f;
                    }
                } else {
                    if (c12 != '#') {
                        this.f362210e = i14;
                        return c12;
                    }
                    this.f362210e = i14;
                    c();
                    J();
                    i12 = this.f362210e;
                    i13 = this.f362211f;
                }
            }
            i12 = i14;
        }
    }

    public void z() {
        int iD2 = this.f362214i;
        if (iD2 == 0) {
            iD2 = d();
        }
        if (iD2 != 7) {
            throw new IllegalStateException("Expected null but was " + F() + n());
        }
        this.f362214i = 0;
        int[] iArr = this.f362221p;
        int i12 = this.f362219n - 1;
        iArr[i12] = iArr[i12] + 1;
    }
}
