package io.noties.markwon.html.jsoup.parser;

import io.noties.markwon.html.jsoup.UncheckedIOException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: CharacterReader.java */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f401787a;

    /* renamed from: b, reason: collision with root package name */
    public final StringReader f401788b;

    /* renamed from: c, reason: collision with root package name */
    public int f401789c;

    /* renamed from: d, reason: collision with root package name */
    public int f401790d;

    /* renamed from: e, reason: collision with root package name */
    public int f401791e;

    /* renamed from: f, reason: collision with root package name */
    public int f401792f;

    /* renamed from: g, reason: collision with root package name */
    public int f401793g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f401794h;

    public a(String str) throws IOException {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f401794h = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.f401788b = stringReader;
        this.f401787a = new char[4096];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i12, int i13) {
        if (i13 > 12) {
            return new String(cArr, i12, i13);
        }
        if (i13 < 1) {
            return "";
        }
        int i14 = 0;
        int i15 = i12;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i13) {
            i17 = (i17 * 31) + cArr[i15];
            i16++;
            i15++;
        }
        int length = i17 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i12, i13);
            strArr[length] = str2;
            return str2;
        }
        if (i13 == str.length()) {
            int i18 = i12;
            int i19 = i13;
            while (true) {
                int i22 = i19 - 1;
                if (i19 == 0) {
                    return str;
                }
                int i23 = i18 + 1;
                int i24 = i14 + 1;
                if (cArr[i18] != str.charAt(i14)) {
                    break;
                }
                i18 = i23;
                i19 = i22;
                i14 = i24;
            }
        }
        String str3 = new String(cArr, i12, i13);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f401791e++;
    }

    public final void b() throws IOException {
        StringReader stringReader = this.f401788b;
        int i12 = this.f401791e;
        if (i12 < this.f401790d) {
            return;
        }
        try {
            stringReader.skip(i12);
            stringReader.mark(4096);
            int i13 = stringReader.read(this.f401787a);
            stringReader.reset();
            if (i13 != -1) {
                this.f401789c = i13;
                this.f401792f += this.f401791e;
                this.f401791e = 0;
                this.f401793g = 0;
                if (i13 > 3072) {
                    i13 = 3072;
                }
                this.f401790d = i13;
            }
        } catch (IOException e12) {
            throw new UncheckedIOException(e12);
        }
    }

    public final char d() throws IOException {
        b();
        int i12 = this.f401791e;
        char c12 = i12 >= this.f401789c ? (char) 65535 : this.f401787a[i12];
        this.f401791e = i12 + 1;
        return c12;
    }

    public final String e() throws IOException {
        char[] cArr;
        char c12;
        b();
        int i12 = this.f401791e;
        while (true) {
            int i13 = this.f401791e;
            int i14 = this.f401789c;
            cArr = this.f401787a;
            if (i13 >= i14 || (((c12 = cArr[i13]) < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !Character.isLetter(c12)))) {
                break;
            }
            this.f401791e++;
        }
        return c(cArr, this.f401794h, i12, this.f401791e - i12);
    }

    public final String f(char c12) throws IOException {
        char[] cArr;
        int i12;
        b();
        int i13 = this.f401791e;
        while (true) {
            int i14 = this.f401789c;
            cArr = this.f401787a;
            if (i13 >= i14) {
                i12 = -1;
                break;
            }
            if (c12 == cArr[i13]) {
                i12 = i13 - this.f401791e;
                break;
            }
            i13++;
        }
        String[] strArr = this.f401794h;
        if (i12 != -1) {
            String strC = c(cArr, strArr, this.f401791e, i12);
            this.f401791e += i12;
            return strC;
        }
        b();
        int i15 = this.f401791e;
        String strC2 = c(cArr, strArr, i15, this.f401789c - i15);
        this.f401791e = this.f401789c;
        return strC2;
    }

    public final String g(char... cArr) throws IOException {
        char[] cArr2;
        b();
        int i12 = this.f401791e;
        int i13 = this.f401789c;
        loop0: while (true) {
            int i14 = this.f401791e;
            cArr2 = this.f401787a;
            if (i14 >= i13) {
                break;
            }
            for (char c12 : cArr) {
                if (cArr2[this.f401791e] == c12) {
                    break loop0;
                }
            }
            this.f401791e++;
        }
        int i15 = this.f401791e;
        return i15 > i12 ? c(cArr2, this.f401794h, i12, i15 - i12) : "";
    }

    public final String h(char... cArr) throws IOException {
        char[] cArr2;
        b();
        int i12 = this.f401791e;
        int i13 = this.f401789c;
        while (true) {
            int i14 = this.f401791e;
            cArr2 = this.f401787a;
            if (i14 >= i13 || Arrays.binarySearch(cArr, cArr2[i14]) >= 0) {
                break;
            }
            this.f401791e++;
        }
        int i15 = this.f401791e;
        return i15 > i12 ? c(cArr2, this.f401794h, i12, i15 - i12) : "";
    }

    public final char i() throws IOException {
        b();
        int i12 = this.f401791e;
        if (i12 >= this.f401789c) {
            return (char) 65535;
        }
        return this.f401787a[i12];
    }

    public final boolean j() throws IOException {
        b();
        return this.f401791e >= this.f401789c;
    }

    public final boolean k(String str) throws IOException {
        b();
        b();
        int length = str.length();
        if (length <= this.f401789c - this.f401791e) {
            for (int i12 = 0; i12 < length; i12++) {
                if (str.charAt(i12) == this.f401787a[this.f401791e + i12]) {
                }
            }
            this.f401791e = str.length() + this.f401791e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) throws IOException {
        b();
        int length = str.length();
        if (length <= this.f401789c - this.f401791e) {
            for (int i12 = 0; i12 < length; i12++) {
                if (Character.toUpperCase(str.charAt(i12)) == Character.toUpperCase(this.f401787a[this.f401791e + i12])) {
                }
            }
            this.f401791e = str.length() + this.f401791e;
            return true;
        }
        return false;
    }

    public final boolean m(char c12) {
        return !j() && this.f401787a[this.f401791e] == c12;
    }

    public final boolean n(char... cArr) throws IOException {
        if (j()) {
            return false;
        }
        b();
        char c12 = this.f401787a[this.f401791e];
        for (char c13 : cArr) {
            if (c13 == c12) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c12 = this.f401787a[this.f401791e];
        return (c12 >= 'A' && c12 <= 'Z') || (c12 >= 'a' && c12 <= 'z') || Character.isLetter(c12);
    }

    public final int p(String str) throws IOException {
        b();
        char cCharAt = str.charAt(0);
        int i12 = this.f401791e;
        while (i12 < this.f401789c) {
            char[] cArr = this.f401787a;
            if (cCharAt != cArr[i12]) {
                do {
                    i12++;
                    if (i12 >= this.f401789c) {
                        break;
                    }
                } while (cCharAt != cArr[i12]);
            }
            int i13 = i12 + 1;
            int length = (str.length() + i13) - 1;
            int i14 = this.f401789c;
            if (i12 < i14 && length <= i14) {
                int i15 = i13;
                for (int i16 = 1; i15 < length && str.charAt(i16) == cArr[i15]; i16++) {
                    i15++;
                }
                if (i15 == length) {
                    return i12 - this.f401791e;
                }
            }
            i12 = i13;
        }
        return -1;
    }

    public final void q() {
        this.f401791e--;
    }

    public final String toString() {
        int i12 = this.f401791e;
        return new String(this.f401787a, i12, this.f401789c - i12);
    }
}
