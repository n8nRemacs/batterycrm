package com.google.gson.internal.bind;

import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes6.dex */
public final class a extends com.google.gson.stream.a {

    /* renamed from: u, reason: collision with root package name */
    public static final Reader f362121u = new C10733a();

    /* renamed from: v, reason: collision with root package name */
    public static final Object f362122v = new Object();

    /* renamed from: q, reason: collision with root package name */
    public Object[] f362123q;

    /* renamed from: r, reason: collision with root package name */
    public int f362124r;

    /* renamed from: s, reason: collision with root package name */
    public String[] f362125s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f362126t;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    public class C10733a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i12, int i13) {
            throw new AssertionError();
        }
    }

    public a(i iVar) {
        super(f362121u);
        this.f362123q = new Object[32];
        this.f362124r = 0;
        this.f362125s = new String[32];
        this.f362126t = new int[32];
        S(iVar);
    }

    @Override // com.google.gson.stream.a
    public final String B() {
        JsonToken jsonTokenF = F();
        JsonToken jsonToken = JsonToken.f362201g;
        if (jsonTokenF != jsonToken && jsonTokenF != JsonToken.f362202h) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenF + P());
        }
        String strS = ((m) R()).s();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
        return strS;
    }

    @Override // com.google.gson.stream.a
    public final JsonToken F() {
        if (this.f362124r == 0) {
            return JsonToken.f362205k;
        }
        Object objQ = Q();
        if (objQ instanceof Iterator) {
            boolean z12 = this.f362123q[this.f362124r - 2] instanceof k;
            Iterator it = (Iterator) objQ;
            if (!it.hasNext()) {
                return z12 ? JsonToken.f362199e : JsonToken.f362197c;
            }
            if (z12) {
                return JsonToken.f362200f;
            }
            S(it.next());
            return F();
        }
        if (objQ instanceof k) {
            return JsonToken.f362198d;
        }
        if (objQ instanceof f) {
            return JsonToken.f362196b;
        }
        if (!(objQ instanceof m)) {
            if (objQ instanceof j) {
                return JsonToken.f362204j;
            }
            if (objQ == f362122v) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((m) objQ).f362195b;
        if (serializable instanceof String) {
            return JsonToken.f362201g;
        }
        if (serializable instanceof Boolean) {
            return JsonToken.f362203i;
        }
        if (serializable instanceof Number) {
            return JsonToken.f362202h;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.a
    public final void L() {
        if (F() == JsonToken.f362200f) {
            x();
            this.f362125s[this.f362124r - 2] = "null";
        } else {
            R();
            int i12 = this.f362124r;
            if (i12 > 0) {
                this.f362125s[i12 - 1] = "null";
            }
        }
        int i13 = this.f362124r;
        if (i13 > 0) {
            int[] iArr = this.f362126t;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    public final void N(JsonToken jsonToken) {
        if (F() == jsonToken) {
            return;
        }
        StringBuilder sbK = com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was ");
        sbK.append(F());
        sbK.append(P());
        throw new IllegalStateException(sbK.toString());
    }

    public final String O(boolean z12) {
        StringBuilder sb2 = new StringBuilder("$");
        int i12 = 0;
        while (true) {
            int i13 = this.f362124r;
            if (i12 >= i13) {
                return sb2.toString();
            }
            Object[] objArr = this.f362123q;
            Object obj = objArr[i12];
            if (obj instanceof f) {
                i12++;
                if (i12 < i13 && (objArr[i12] instanceof Iterator)) {
                    int i14 = this.f362126t[i12];
                    if (z12 && i14 > 0 && (i12 == i13 - 1 || i12 == i13 - 2)) {
                        i14--;
                    }
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                }
            } else if ((obj instanceof k) && (i12 = i12 + 1) < i13 && (objArr[i12] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f362125s[i12];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i12++;
        }
    }

    public final String P() {
        return " at path " + O(false);
    }

    public final Object Q() {
        return this.f362123q[this.f362124r - 1];
    }

    public final Object R() {
        Object[] objArr = this.f362123q;
        int i12 = this.f362124r - 1;
        this.f362124r = i12;
        Object obj = objArr[i12];
        objArr[i12] = null;
        return obj;
    }

    public final void S(Object obj) {
        int i12 = this.f362124r;
        Object[] objArr = this.f362123q;
        if (i12 == objArr.length) {
            int i13 = i12 * 2;
            this.f362123q = Arrays.copyOf(objArr, i13);
            this.f362126t = Arrays.copyOf(this.f362126t, i13);
            this.f362125s = (String[]) Arrays.copyOf(this.f362125s, i13);
        }
        Object[] objArr2 = this.f362123q;
        int i14 = this.f362124r;
        this.f362124r = i14 + 1;
        objArr2[i14] = obj;
    }

    @Override // com.google.gson.stream.a
    public final void a() {
        N(JsonToken.f362196b);
        S(((f) Q()).f362000b.iterator());
        this.f362126t[this.f362124r - 1] = 0;
    }

    @Override // com.google.gson.stream.a
    public final void b() {
        N(JsonToken.f362198d);
        S(((k) Q()).f362194b.entrySet().iterator());
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f362123q = new Object[]{f362122v};
        this.f362124r = 1;
    }

    @Override // com.google.gson.stream.a
    public final void f() {
        N(JsonToken.f362197c);
        R();
        R();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public final void g() {
        N(JsonToken.f362199e);
        R();
        R();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public final String getPath() {
        return O(false);
    }

    @Override // com.google.gson.stream.a
    public final String j() {
        return O(true);
    }

    @Override // com.google.gson.stream.a
    public final boolean k() {
        JsonToken jsonTokenF = F();
        return (jsonTokenF == JsonToken.f362199e || jsonTokenF == JsonToken.f362197c || jsonTokenF == JsonToken.f362205k) ? false : true;
    }

    @Override // com.google.gson.stream.a
    public final boolean o() {
        N(JsonToken.f362203i);
        boolean zD2 = ((m) R()).d();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
        return zD2;
    }

    @Override // com.google.gson.stream.a
    public final double p() {
        JsonToken jsonTokenF = F();
        JsonToken jsonToken = JsonToken.f362202h;
        if (jsonTokenF != jsonToken && jsonTokenF != JsonToken.f362201g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenF + P());
        }
        double dE2 = ((m) Q()).e();
        if (!this.f362208c && (Double.isNaN(dE2) || Double.isInfinite(dE2))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dE2);
        }
        R();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
        return dE2;
    }

    @Override // com.google.gson.stream.a
    public final int q() {
        JsonToken jsonTokenF = F();
        JsonToken jsonToken = JsonToken.f362202h;
        if (jsonTokenF != jsonToken && jsonTokenF != JsonToken.f362201g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenF + P());
        }
        int iG2 = ((m) Q()).g();
        R();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
        return iG2;
    }

    @Override // com.google.gson.stream.a
    public final String toString() {
        return a.class.getSimpleName() + P();
    }

    @Override // com.google.gson.stream.a
    public final long u() {
        JsonToken jsonTokenF = F();
        JsonToken jsonToken = JsonToken.f362202h;
        if (jsonTokenF != jsonToken && jsonTokenF != JsonToken.f362201g) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenF + P());
        }
        long jL2 = ((m) Q()).l();
        R();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
        return jL2;
    }

    @Override // com.google.gson.stream.a
    public final String x() {
        N(JsonToken.f362200f);
        Map.Entry entry = (Map.Entry) ((Iterator) Q()).next();
        String str = (String) entry.getKey();
        this.f362125s[this.f362124r - 1] = str;
        S(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.a
    public final void z() {
        N(JsonToken.f362204j);
        R();
        int i12 = this.f362124r;
        if (i12 > 0) {
            int[] iArr = this.f362126t;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
    }
}
