package com.airbnb.lottie.parser.moshi;

import androidx.appcompat.app.r;
import java.io.Closeable;
import java.util.Arrays;
import okio.P;
import okio.Y;

/* loaded from: classes10.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f59963f = new String[128];

    /* renamed from: b, reason: collision with root package name */
    public int f59964b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f59965c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public String[] f59966d = new String[32];

    /* renamed from: e, reason: collision with root package name */
    public int[] f59967e = new int[32];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {

        /* renamed from: b, reason: collision with root package name */
        public static final Token f59968b;

        /* renamed from: c, reason: collision with root package name */
        public static final Token f59969c;

        /* renamed from: d, reason: collision with root package name */
        public static final Token f59970d;

        /* renamed from: e, reason: collision with root package name */
        public static final Token f59971e;

        /* renamed from: f, reason: collision with root package name */
        public static final Token f59972f;

        /* renamed from: g, reason: collision with root package name */
        public static final Token f59973g;

        /* renamed from: h, reason: collision with root package name */
        public static final Token f59974h;

        /* renamed from: i, reason: collision with root package name */
        public static final Token f59975i;

        /* renamed from: j, reason: collision with root package name */
        public static final Token f59976j;

        /* renamed from: k, reason: collision with root package name */
        public static final Token f59977k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ Token[] f59978l;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            f59968b = token;
            Token token2 = new Token("END_ARRAY", 1);
            f59969c = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            f59970d = token3;
            Token token4 = new Token("END_OBJECT", 3);
            f59971e = token4;
            Token token5 = new Token("NAME", 4);
            f59972f = token5;
            Token token6 = new Token("STRING", 5);
            f59973g = token6;
            Token token7 = new Token("NUMBER", 6);
            f59974h = token7;
            Token token8 = new Token("BOOLEAN", 7);
            f59975i = token8;
            Token token9 = new Token("NULL", 8);
            f59976j = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            f59977k = token10;
            f59978l = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public Token() {
            throw null;
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) f59978l.clone();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f59979a;

        /* renamed from: b, reason: collision with root package name */
        public final P f59980b;

        public a(String[] strArr, P p12) {
            this.f59979a = strArr;
            this.f59980b = p12;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x005b, TryCatch #0 {IOException -> 0x005b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:27:0x005d), top: B:31:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.airbnb.lottie.parser.moshi.JsonReader.a a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L5b
                okio.o[] r0 = new okio.C44805o[r0]     // Catch: java.io.IOException -> L5b
                okio.l r1 = new okio.l     // Catch: java.io.IOException -> L5b
                r1.<init>()     // Catch: java.io.IOException -> L5b
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L5b
                if (r3 >= r4) goto L5d
                r4 = r12[r3]     // Catch: java.io.IOException -> L5b
                java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.JsonReader.f59963f     // Catch: java.io.IOException -> L5b
                r6 = 34
                r1.D(r6)     // Catch: java.io.IOException -> L5b
                int r7 = r4.length()     // Catch: java.io.IOException -> L5b
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L5b
                r11 = 128(0x80, float:1.8E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L5b
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.N(r9, r8, r4)     // Catch: java.io.IOException -> L5b
            L3d:
                r1.O(r10)     // Catch: java.io.IOException -> L5b
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.N(r9, r7, r4)     // Catch: java.io.IOException -> L5b
            L4a:
                r1.D(r6)     // Catch: java.io.IOException -> L5b
                r1.readByte()     // Catch: java.io.IOException -> L5b
                long r4 = r1.f420125c     // Catch: java.io.IOException -> L5b
                okio.o r4 = r1.W0(r4)     // Catch: java.io.IOException -> L5b
                r0[r3] = r4     // Catch: java.io.IOException -> L5b
                int r3 = r3 + 1
                goto La
            L5b:
                r12 = move-exception
                goto L72
            L5d:
                com.airbnb.lottie.parser.moshi.JsonReader$a r1 = new com.airbnb.lottie.parser.moshi.JsonReader$a     // Catch: java.io.IOException -> L5b
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L5b
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L5b
                okio.P$a r2 = okio.P.f420028e     // Catch: java.io.IOException -> L5b
                r2.getClass()     // Catch: java.io.IOException -> L5b
                okio.P r0 = okio.P.a.b(r0)     // Catch: java.io.IOException -> L5b
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L5b
                return r1
            L72:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.a.a(java.lang.String[]):com.airbnb.lottie.parser.moshi.JsonReader$a");
        }
    }

    static {
        for (int i12 = 0; i12 <= 31; i12++) {
            f59963f[i12] = String.format("\\u%04x", Integer.valueOf(i12));
        }
        String[] strArr = f59963f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader m(Y y12) {
        return new d(y12);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract boolean f();

    public abstract boolean g();

    public final String getPath() {
        int i12 = this.f59964b;
        int[] iArr = this.f59965c;
        String[] strArr = this.f59966d;
        int[] iArr2 = this.f59967e;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            if (i14 == 1 || i14 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i13]);
                sb2.append(']');
            } else if (i14 == 3 || i14 == 4 || i14 == 5) {
                sb2.append('.');
                String str = strArr[i13];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract double h();

    public abstract int i();

    public abstract String j();

    public abstract String k();

    public abstract Token n();

    public final void o(int i12) {
        int i13 = this.f59964b;
        int[] iArr = this.f59965c;
        if (i13 == iArr.length) {
            if (i13 == 256) {
                throw new com.airbnb.lottie.parser.moshi.a("Nesting too deep at " + getPath());
            }
            this.f59965c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f59966d;
            this.f59966d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f59967e;
            this.f59967e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f59965c;
        int i14 = this.f59964b;
        this.f59964b = i14 + 1;
        iArr3[i14] = i12;
    }

    public abstract int p(a aVar);

    public abstract void q();

    public abstract void u();

    public final void x(String str) throws b {
        StringBuilder sbZ = r.z(str, " at path ");
        sbZ.append(getPath());
        throw new b(sbZ.toString());
    }
}
