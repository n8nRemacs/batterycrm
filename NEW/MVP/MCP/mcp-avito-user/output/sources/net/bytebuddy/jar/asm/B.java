package net.bytebuddy.jar.asm;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* compiled from: Type.java */
/* loaded from: classes7.dex */
public final class B {

    /* renamed from: e, reason: collision with root package name */
    public static final B f418135e = new B(0, 0, "VZCBSIFJD", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final B f418136f = new B(1, 1, "VZCBSIFJD", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final B f418137g = new B(2, 2, "VZCBSIFJD", 3);

    /* renamed from: h, reason: collision with root package name */
    public static final B f418138h = new B(3, 3, "VZCBSIFJD", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final B f418139i = new B(4, 4, "VZCBSIFJD", 5);

    /* renamed from: j, reason: collision with root package name */
    public static final B f418140j = new B(5, 5, "VZCBSIFJD", 6);

    /* renamed from: k, reason: collision with root package name */
    public static final B f418141k = new B(6, 6, "VZCBSIFJD", 7);

    /* renamed from: l, reason: collision with root package name */
    public static final B f418142l = new B(7, 7, "VZCBSIFJD", 8);

    /* renamed from: m, reason: collision with root package name */
    public static final B f418143m = new B(8, 8, "VZCBSIFJD", 9);

    /* renamed from: a, reason: collision with root package name */
    public final int f418144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f418145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418146c;

    /* renamed from: d, reason: collision with root package name */
    public final int f418147d;

    public B(int i12, int i13, String str, int i14) {
        this.f418144a = i12;
        this.f418145b = str;
        this.f418146c = i13;
        this.f418147d = i14;
    }

    public static void a(Class<?> cls, StringBuilder sb2) {
        char c12;
        while (cls.isArray()) {
            sb2.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb2.append('L');
            sb2.append(l(cls));
            sb2.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c12 = 'I';
        } else if (cls == Void.TYPE) {
            c12 = 'V';
        } else if (cls == Boolean.TYPE) {
            c12 = 'Z';
        } else if (cls == Byte.TYPE) {
            c12 = 'B';
        } else if (cls == Character.TYPE) {
            c12 = 'C';
        } else if (cls == Short.TYPE) {
            c12 = 'S';
        } else if (cls == Double.TYPE) {
            c12 = 'D';
        } else if (cls == Float.TYPE) {
            c12 = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c12 = 'J';
        }
        sb2.append(c12);
    }

    public static B[] d(String str) {
        int i12 = 0;
        int i13 = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i14 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i14, str.indexOf(59, i14) + 1) : i14;
            i13++;
        }
        B[] bArr = new B[i13];
        int i15 = 1;
        while (str.charAt(i15) != ')') {
            int i16 = i15;
            while (str.charAt(i16) == '[') {
                i16++;
            }
            int iMax2 = i16 + 1;
            if (str.charAt(i16) == 'L') {
                iMax2 = Math.max(iMax2, str.indexOf(59, iMax2) + 1);
            }
            bArr[i12] = w(i15, iMax2, str);
            i12++;
            i15 = iMax2;
        }
        return bArr;
    }

    public static int e(String str) {
        char cCharAt = str.charAt(1);
        int i12 = 1;
        int i13 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i12++;
                i13 += 2;
            } else {
                while (str.charAt(i12) == '[') {
                    i12++;
                }
                int iMax = i12 + 1;
                if (str.charAt(i12) == 'L') {
                    iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i13++;
                i12 = iMax;
            }
            cCharAt = str.charAt(i12);
        }
        char cCharAt2 = str.charAt(i12 + 1);
        if (cCharAt2 == 'V') {
            return i13 << 2;
        }
        return (i13 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    public static String g(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Class<?> cls : constructor.getParameterTypes()) {
            a(cls, sb2);
        }
        sb2.append(")V");
        return sb2.toString();
    }

    public static String i(Class<?> cls) {
        StringBuilder sb2 = new StringBuilder();
        a(cls, sb2);
        return sb2.toString();
    }

    public static String l(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public static String m(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb2);
        }
        sb2.append(')');
        a(method.getReturnType(), sb2);
        return sb2.toString();
    }

    public static String n(B b12, B... bArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        for (B b13 : bArr) {
            b13.b(sb2);
        }
        sb2.append(')');
        b12.b(sb2);
        return sb2.toString();
    }

    public static B o(String str) {
        return new B(11, 0, str, str.length());
    }

    public static B p(String str) {
        return new B(str.charAt(0) == '[' ? 9 : 12, 0, str, str.length());
    }

    public static int r(String str) {
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i12 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i12, str.indexOf(59, i12) + 1) : i12;
        }
        return iMax + 1;
    }

    public static B u(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return v(i(cls));
        }
        if (cls == Integer.TYPE) {
            return f418140j;
        }
        if (cls == Void.TYPE) {
            return f418135e;
        }
        if (cls == Boolean.TYPE) {
            return f418136f;
        }
        if (cls == Byte.TYPE) {
            return f418138h;
        }
        if (cls == Character.TYPE) {
            return f418137g;
        }
        if (cls == Short.TYPE) {
            return f418139i;
        }
        if (cls == Double.TYPE) {
            return f418143m;
        }
        if (cls == Float.TYPE) {
            return f418141k;
        }
        if (cls == Long.TYPE) {
            return f418142l;
        }
        throw new AssertionError();
    }

    public static B v(String str) {
        return w(0, str.length(), str);
    }

    public static B w(int i12, int i13, String str) {
        char cCharAt = str.charAt(i12);
        if (cCharAt == '(') {
            return new B(11, i12, str, i13);
        }
        if (cCharAt == 'F') {
            return f418141k;
        }
        if (cCharAt == 'L') {
            return new B(10, i12 + 1, str, i13 - 1);
        }
        if (cCharAt == 'S') {
            return f418139i;
        }
        if (cCharAt == 'V') {
            return f418135e;
        }
        if (cCharAt == 'I') {
            return f418140j;
        }
        if (cCharAt == 'J') {
            return f418142l;
        }
        if (cCharAt == 'Z') {
            return f418136f;
        }
        if (cCharAt == '[') {
            return new B(9, i12, str, i13);
        }
        switch (cCharAt) {
            case 'B':
                return f418138h;
            case 'C':
                return f418137g;
            case 'D':
                return f418143m;
            default:
                throw new IllegalArgumentException("Invalid descriptor: ".concat(str));
        }
    }

    public final void b(StringBuilder sb2) {
        int i12 = this.f418147d;
        int i13 = this.f418146c;
        String str = this.f418145b;
        int i14 = this.f418144a;
        if (i14 == 10) {
            sb2.append((CharSequence) str, i13 - 1, i12 + 1);
        } else {
            if (i14 != 12) {
                sb2.append((CharSequence) str, i13, i12);
                return;
            }
            sb2.append('L');
            sb2.append((CharSequence) str, i13, i12);
            sb2.append(';');
        }
    }

    public final B[] c() {
        return d(h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        int i12 = this.f418144a;
        if (i12 == 12) {
            i12 = 10;
        }
        int i13 = b12.f418144a;
        if (i12 != (i13 != 12 ? i13 : 10)) {
            return false;
        }
        int i14 = this.f418147d;
        int i15 = this.f418146c;
        int i16 = i14 - i15;
        int i17 = b12.f418147d;
        int i18 = b12.f418146c;
        if (i16 != i17 - i18) {
            return false;
        }
        while (i15 < i14) {
            if (this.f418145b.charAt(i15) != b12.f418145b.charAt(i18)) {
                return false;
            }
            i15++;
            i18++;
        }
        return true;
    }

    public final String f() {
        int i12 = this.f418144a;
        String str = this.f418145b;
        int i13 = this.f418147d;
        int i14 = this.f418146c;
        switch (i12) {
            case 0:
                return "void";
            case 1:
                return BooleanParameter.TYPE;
            case 2:
                return CharParameter.TYPE;
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return IntParameter.TYPE;
            case 6:
                return "float";
            case 7:
                return Constants.LONG;
            case 8:
                return "double";
            case 9:
                StringBuilder sb2 = new StringBuilder(w(i14 + j(), i13, str).f());
                for (int iJ2 = j(); iJ2 > 0; iJ2--) {
                    sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
                return sb2.toString();
            case 10:
            case 12:
                return str.substring(i14, i13).replace('/', '.');
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public final String h() {
        int i12 = this.f418147d;
        int i13 = this.f418146c;
        String str = this.f418145b;
        int i14 = this.f418144a;
        if (i14 == 10) {
            return str.substring(i13 - 1, i12 + 1);
        }
        if (i14 != 12) {
            return str.substring(i13, i12);
        }
        return "L" + str.substring(i13, i12) + ';';
    }

    public final int hashCode() {
        int i12 = this.f418144a;
        int iCharAt = (i12 == 12 ? 10 : i12) * 13;
        if (i12 >= 9) {
            for (int i13 = this.f418146c; i13 < this.f418147d; i13++) {
                iCharAt = (this.f418145b.charAt(i13) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final int j() {
        int i12 = 1;
        while (this.f418145b.charAt(this.f418146c + i12) == '[') {
            i12++;
        }
        return i12;
    }

    public final String k() {
        return this.f418145b.substring(this.f418146c, this.f418147d);
    }

    public final int q(int i12) {
        int i13 = this.f418144a;
        if (i12 == 46 || i12 == 79) {
            switch (i13) {
                case 0:
                case 11:
                    throw new UnsupportedOperationException();
                case 1:
                case 3:
                    return i12 + 5;
                case 2:
                    return i12 + 6;
                case 4:
                    return i12 + 7;
                case 5:
                    return i12;
                case 6:
                    return i12 + 2;
                case 7:
                    return i12 + 1;
                case 8:
                    return i12 + 3;
                case 9:
                case 10:
                case 12:
                    return i12 + 4;
                default:
                    throw new AssertionError();
            }
        }
        switch (i13) {
            case 0:
                if (i12 == 172) {
                    return 177;
                }
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i12;
            case 6:
                return i12 + 2;
            case 7:
                return i12 + 1;
            case 8:
                return i12 + 3;
            case 9:
            case 10:
            case 12:
                if (i12 == 21 || i12 == 54 || i12 == 172) {
                    return i12 + 4;
                }
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            default:
                throw new AssertionError();
        }
    }

    public final int s() {
        switch (this.f418144a) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
                return 1;
            case 7:
            case 8:
                return 2;
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public final int t() {
        int i12 = this.f418144a;
        if (i12 == 12) {
            return 10;
        }
        return i12;
    }

    public final String toString() {
        return h();
    }
}
