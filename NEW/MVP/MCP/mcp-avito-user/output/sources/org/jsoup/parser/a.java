package org.jsoup.parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import org.jsoup.UncheckedIOException;

/* compiled from: CharacterReader.java */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public char[] f421127a;

    /* renamed from: b, reason: collision with root package name */
    public StringReader f421128b;

    /* renamed from: c, reason: collision with root package name */
    public int f421129c;

    /* renamed from: d, reason: collision with root package name */
    public int f421130d;

    /* renamed from: e, reason: collision with root package name */
    public int f421131e;

    /* renamed from: f, reason: collision with root package name */
    public int f421132f;

    /* renamed from: g, reason: collision with root package name */
    public int f421133g = -1;

    /* renamed from: h, reason: collision with root package name */
    public String[] f421134h = new String[512];

    /* renamed from: i, reason: collision with root package name */
    public boolean f421135i;

    public a(StringReader stringReader, int i12) throws IOException {
        org.jsoup.helper.d.a(stringReader.markSupported());
        this.f421128b = stringReader;
        this.f421127a = new char[i12 > 32768 ? 32768 : i12];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i12, int i13) {
        if (i13 > 12) {
            return new String(cArr, i12, i13);
        }
        if (i13 < 1) {
            return "";
        }
        int i14 = i13 * 31;
        int i15 = 0;
        int i16 = i12;
        int i17 = 0;
        while (i17 < i13) {
            i14 = (i14 * 31) + cArr[i16];
            i17++;
            i16++;
        }
        int i18 = i14 & 511;
        String str = strArr[i18];
        if (str == null) {
            String str2 = new String(cArr, i12, i13);
            strArr[i18] = str2;
            return str2;
        }
        if (i13 == str.length()) {
            int i19 = i12;
            int i22 = i13;
            while (true) {
                int i23 = i22 - 1;
                if (i22 == 0) {
                    return str;
                }
                int i24 = i19 + 1;
                int i25 = i15 + 1;
                if (cArr[i19] != str.charAt(i15)) {
                    break;
                }
                i19 = i24;
                i22 = i23;
                i15 = i25;
            }
        }
        String str3 = new String(cArr, i12, i13);
        strArr[i18] = str3;
        return str3;
    }

    public final void a() {
        this.f421131e++;
    }

    public final void b() throws IOException {
        int i12;
        int i13;
        boolean z12;
        if (this.f421135i || (i12 = this.f421131e) < this.f421130d) {
            return;
        }
        int i14 = this.f421133g;
        if (i14 != -1) {
            i13 = i12 - i14;
            i12 = i14;
        } else {
            i13 = 0;
        }
        try {
            long j12 = i12;
            long jSkip = this.f421128b.skip(j12);
            this.f421128b.mark(32768);
            int i15 = 0;
            while (true) {
                z12 = true;
                if (i15 > 1024) {
                    break;
                }
                StringReader stringReader = this.f421128b;
                char[] cArr = this.f421127a;
                int i16 = stringReader.read(cArr, i15, cArr.length - i15);
                if (i16 == -1) {
                    this.f421135i = true;
                }
                if (i16 <= 0) {
                    break;
                } else {
                    i15 += i16;
                }
            }
            this.f421128b.reset();
            if (i15 > 0) {
                if (jSkip != j12) {
                    z12 = false;
                }
                org.jsoup.helper.d.a(z12);
                this.f421129c = i15;
                this.f421132f += i12;
                this.f421131e = i13;
                if (this.f421133g != -1) {
                    this.f421133g = 0;
                }
                if (i15 > 24576) {
                    i15 = 24576;
                }
                this.f421130d = i15;
            }
        } catch (IOException e12) {
            throw new UncheckedIOException(e12);
        }
    }

    public final char d() throws IOException {
        b();
        int i12 = this.f421131e;
        char c12 = i12 >= this.f421129c ? (char) 65535 : this.f421127a[i12];
        this.f421131e = i12 + 1;
        return c12;
    }

    public final String e() {
        int i12 = this.f421131e;
        int i13 = this.f421129c;
        char[] cArr = this.f421127a;
        int i14 = i12;
        while (i14 < i13) {
            char c12 = cArr[i14];
            if (c12 == 0 || c12 == '&' || c12 == '<') {
                break;
            }
            i14++;
        }
        this.f421131e = i14;
        return i14 > i12 ? c(this.f421127a, this.f421134h, i12, i14 - i12) : "";
    }

    public final String f() throws IOException {
        char c12;
        b();
        int i12 = this.f421131e;
        while (true) {
            int i13 = this.f421131e;
            if (i13 >= this.f421129c || (((c12 = this.f421127a[i13]) < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !Character.isLetter(c12)))) {
                break;
            }
            this.f421131e++;
        }
        return c(this.f421127a, this.f421134h, i12, this.f421131e - i12);
    }

    public final String g(char c12) throws IOException {
        int i12;
        b();
        int i13 = this.f421131e;
        while (true) {
            if (i13 >= this.f421129c) {
                i12 = -1;
                break;
            }
            if (c12 == this.f421127a[i13]) {
                i12 = i13 - this.f421131e;
                break;
            }
            i13++;
        }
        if (i12 != -1) {
            String strC = c(this.f421127a, this.f421134h, this.f421131e, i12);
            this.f421131e += i12;
            return strC;
        }
        b();
        char[] cArr = this.f421127a;
        String[] strArr = this.f421134h;
        int i14 = this.f421131e;
        String strC2 = c(cArr, strArr, i14, this.f421129c - i14);
        this.f421131e = this.f421129c;
        return strC2;
    }

    public final String h(char... cArr) throws IOException {
        b();
        int i12 = this.f421131e;
        int i13 = this.f421129c;
        char[] cArr2 = this.f421127a;
        int i14 = i12;
        loop0: while (i14 < i13) {
            for (char c12 : cArr) {
                if (cArr2[i14] == c12) {
                    break loop0;
                }
            }
            i14++;
        }
        this.f421131e = i14;
        return i14 > i12 ? c(this.f421127a, this.f421134h, i12, i14 - i12) : "";
    }

    public final String i(char... cArr) throws IOException {
        b();
        int i12 = this.f421131e;
        int i13 = this.f421129c;
        char[] cArr2 = this.f421127a;
        int i14 = i12;
        while (i14 < i13 && Arrays.binarySearch(cArr, cArr2[i14]) < 0) {
            i14++;
        }
        this.f421131e = i14;
        return i14 > i12 ? c(this.f421127a, this.f421134h, i12, i14 - i12) : "";
    }

    public final char j() throws IOException {
        b();
        int i12 = this.f421131e;
        if (i12 >= this.f421129c) {
            return (char) 65535;
        }
        return this.f421127a[i12];
    }

    public final boolean k() throws IOException {
        b();
        return this.f421131e >= this.f421129c;
    }

    public final boolean l(String str) throws IOException {
        b();
        b();
        int length = str.length();
        if (length <= this.f421129c - this.f421131e) {
            for (int i12 = 0; i12 < length; i12++) {
                if (str.charAt(i12) == this.f421127a[this.f421131e + i12]) {
                }
            }
            this.f421131e = str.length() + this.f421131e;
            return true;
        }
        return false;
    }

    public final boolean m(String str) throws IOException {
        b();
        int length = str.length();
        if (length <= this.f421129c - this.f421131e) {
            for (int i12 = 0; i12 < length; i12++) {
                if (Character.toUpperCase(str.charAt(i12)) == Character.toUpperCase(this.f421127a[this.f421131e + i12])) {
                }
            }
            this.f421131e = str.length() + this.f421131e;
            return true;
        }
        return false;
    }

    public final boolean n(char c12) {
        return !k() && this.f421127a[this.f421131e] == c12;
    }

    public final boolean o(char... cArr) throws IOException {
        if (k()) {
            return false;
        }
        b();
        char c12 = this.f421127a[this.f421131e];
        for (char c13 : cArr) {
            if (c13 == c12) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        if (k()) {
            return false;
        }
        char c12 = this.f421127a[this.f421131e];
        return (c12 >= 'A' && c12 <= 'Z') || (c12 >= 'a' && c12 <= 'z') || Character.isLetter(c12);
    }

    public final int q(String str) throws IOException {
        b();
        char cCharAt = str.charAt(0);
        int i12 = this.f421131e;
        while (i12 < this.f421129c) {
            if (cCharAt != this.f421127a[i12]) {
                do {
                    i12++;
                    if (i12 >= this.f421129c) {
                        break;
                    }
                } while (cCharAt != this.f421127a[i12]);
            }
            int i13 = i12 + 1;
            int length = (str.length() + i13) - 1;
            int i14 = this.f421129c;
            if (i12 < i14 && length <= i14) {
                int i15 = i13;
                for (int i16 = 1; i15 < length && str.charAt(i16) == this.f421127a[i15]; i16++) {
                    i15++;
                }
                if (i15 == length) {
                    return i12 - this.f421131e;
                }
            }
            i12 = i13;
        }
        return -1;
    }

    public final int r() {
        return this.f421132f + this.f421131e;
    }

    public final void s() {
        int i12 = this.f421133g;
        if (i12 == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.f421131e = i12;
        this.f421133g = -1;
    }

    public final void t() {
        int i12 = this.f421131e;
        if (i12 < 1) {
            throw new UncheckedIOException(new IOException("No buffer left to unconsume"));
        }
        this.f421131e = i12 - 1;
    }

    public final String toString() {
        int i12 = this.f421129c;
        int i13 = this.f421131e;
        return i12 - i13 < 0 ? "" : new String(this.f421127a, i13, i12 - i13);
    }
}
