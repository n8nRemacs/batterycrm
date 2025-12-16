package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: JsonWriter.java */
/* loaded from: classes6.dex */
public class c implements Closeable, Flushable {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f362222k = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f362223l = new String[128];

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f362224m;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f362225b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f362226c;

    /* renamed from: d, reason: collision with root package name */
    public int f362227d;

    /* renamed from: e, reason: collision with root package name */
    public String f362228e;

    /* renamed from: f, reason: collision with root package name */
    public String f362229f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362230g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f362231h;

    /* renamed from: i, reason: collision with root package name */
    public String f362232i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f362233j;

    static {
        for (int i12 = 0; i12 <= 31; i12++) {
            f362223l[i12] = String.format("\\u%04x", Integer.valueOf(i12));
        }
        String[] strArr = f362223l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f362224m = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f362226c = iArr;
        this.f362227d = 0;
        if (iArr.length == 0) {
            this.f362226c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f362226c;
        int i12 = this.f362227d;
        this.f362227d = i12 + 1;
        iArr2[i12] = 6;
        this.f362229f = ":";
        this.f362233j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f362225b = writer;
    }

    public final void a() throws IOException {
        int iK2 = k();
        if (iK2 == 1) {
            this.f362226c[this.f362227d - 1] = 2;
            i();
            return;
        }
        Writer writer = this.f362225b;
        if (iK2 == 2) {
            writer.append(',');
            i();
        } else {
            if (iK2 == 4) {
                writer.append((CharSequence) this.f362229f);
                this.f362226c[this.f362227d - 1] = 5;
                return;
            }
            if (iK2 != 6) {
                if (iK2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f362230g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f362226c[this.f362227d - 1] = 7;
        }
    }

    public void b() throws IOException {
        x();
        a();
        int i12 = this.f362227d;
        int[] iArr = this.f362226c;
        if (i12 == iArr.length) {
            this.f362226c = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f362226c;
        int i13 = this.f362227d;
        this.f362227d = i13 + 1;
        iArr2[i13] = 1;
        this.f362225b.write(91);
    }

    public void c() throws IOException {
        x();
        a();
        int i12 = this.f362227d;
        int[] iArr = this.f362226c;
        if (i12 == iArr.length) {
            this.f362226c = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f362226c;
        int i13 = this.f362227d;
        this.f362227d = i13 + 1;
        iArr2[i13] = 3;
        this.f362225b.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f362225b.close();
        int i12 = this.f362227d;
        if (i12 > 1 || (i12 == 1 && this.f362226c[i12 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f362227d = 0;
    }

    public final void d(char c12, int i12, int i13) throws IOException {
        int iK2 = k();
        if (iK2 != i13 && iK2 != i12) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f362232i != null) {
            throw new IllegalStateException("Dangling name: " + this.f362232i);
        }
        this.f362227d--;
        if (iK2 == i13) {
            i();
        }
        this.f362225b.write(c12);
    }

    public void f() throws IOException {
        d(']', 1, 2);
    }

    public void flush() throws IOException {
        if (this.f362227d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f362225b.flush();
    }

    public void g() throws IOException {
        d('}', 3, 5);
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f362232i != null) {
            throw new IllegalStateException();
        }
        if (this.f362227d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f362232i = str;
    }

    public final void i() throws IOException {
        if (this.f362228e == null) {
            return;
        }
        Writer writer = this.f362225b;
        writer.write(10);
        int i12 = this.f362227d;
        for (int i13 = 1; i13 < i12; i13++) {
            writer.write(this.f362228e);
        }
    }

    public c j() throws IOException {
        if (this.f362232i != null) {
            if (!this.f362233j) {
                this.f362232i = null;
                return this;
            }
            x();
        }
        a();
        this.f362225b.write("null");
        return this;
    }

    public final int k() {
        int i12 = this.f362227d;
        if (i12 != 0) {
            return this.f362226c[i12 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f362231h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.c.f362224m
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.c.f362223l
        L9:
            java.io.Writer r1 = r8.f362225b
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.c.m(java.lang.String):void");
    }

    public void n(long j12) throws IOException {
        x();
        a();
        this.f362225b.write(Long.toString(j12));
    }

    public void o(Boolean bool) throws IOException {
        if (bool == null) {
            j();
            return;
        }
        x();
        a();
        this.f362225b.write(bool.booleanValue() ? "true" : "false");
    }

    public void p(Number number) throws IOException {
        if (number == null) {
            j();
            return;
        }
        x();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f362222k.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f362230g) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f362225b.append((CharSequence) string);
    }

    public void q(String str) throws IOException {
        if (str == null) {
            j();
            return;
        }
        x();
        a();
        m(str);
    }

    public void u(boolean z12) throws IOException {
        x();
        a();
        this.f362225b.write(z12 ? "true" : "false");
    }

    public final void x() throws IOException {
        if (this.f362232i != null) {
            int iK2 = k();
            if (iK2 == 5) {
                this.f362225b.write(44);
            } else if (iK2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.f362226c[this.f362227d - 1] = 4;
            m(this.f362232i);
            this.f362232i = null;
        }
    }
}
