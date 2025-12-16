package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

/* compiled from: CharMatcher.java */
@InterfaceC37268l
@XY0.b
/* renamed from: com.google.common.base.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37259e implements N<Character> {

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$A */
    public static final class A extends z {
        static {
            new A();
        }

        public A() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* compiled from: CharMatcher.java */
    @XY0.e
    /* renamed from: com.google.common.base.e$B */
    public static final class B extends u {

        /* renamed from: c, reason: collision with root package name */
        public static final int f359009c = Integer.numberOfLeadingZeros(31);

        /* renamed from: d, reason: collision with root package name */
        public static final B f359010d = new B();

        public B() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c12) >>> f359009c) == c12;
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$a, reason: case insensitive filesystem */
    public static final class C37260a extends AbstractC37259e {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37259e f359011b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37259e f359012c;

        public C37260a(AbstractC37259e abstractC37259e, AbstractC37259e abstractC37259e2) {
            abstractC37259e.getClass();
            this.f359011b = abstractC37259e;
            abstractC37259e2.getClass();
            this.f359012c = abstractC37259e2;
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return this.f359011b.m(c12) && this.f359012c.m(c12);
        }

        public final String toString() {
            return "CharMatcher.and(" + this.f359011b + ", " + this.f359012c + ")";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$b, reason: case insensitive filesystem */
    public static final class C37261b extends u {

        /* renamed from: c, reason: collision with root package name */
        public static final C37261b f359013c = new C37261b();

        public C37261b() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e b(AbstractC37259e abstractC37259e) {
            abstractC37259e.getClass();
            return abstractC37259e;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int f(String str) {
            return str.length();
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int h(int i12, CharSequence charSequence) {
            int length = charSequence.length();
            M.k(i12, length);
            if (i12 == length) {
                return -1;
            }
            return i12;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int i(String str) {
            return str.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return true;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean n(String str) {
            str.getClass();
            return true;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean o(String str) {
            return str.length() == 0;
        }

        @Override // com.google.common.base.AbstractC37259e.h, com.google.common.base.AbstractC37259e
        public final AbstractC37259e p() {
            return x.f359026c;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e q(AbstractC37259e abstractC37259e) {
            abstractC37259e.getClass();
            return this;
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$c */
    public static final class c extends AbstractC37259e {

        /* renamed from: b, reason: collision with root package name */
        public final char[] f359014b;

        public c(String str) {
            char[] charArray = str.toString().toCharArray();
            this.f359014b = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return Arrays.binarySearch(this.f359014b, c12) >= 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c12 : this.f359014b) {
                sb2.append(AbstractC37259e.a(c12));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$d */
    public static final class d extends u {

        /* renamed from: c, reason: collision with root package name */
        public static final d f359015c = new d();

        public d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return c12 <= 127;
        }
    }

    /* compiled from: CharMatcher.java */
    @XY0.c
    @XY0.d
    /* renamed from: com.google.common.base.e$e, reason: collision with other inner class name */
    public static final class C10652e extends u {

        /* renamed from: c, reason: collision with root package name */
        public final BitSet f359016c;

        public C10652e(BitSet bitSet, String str, C37258d c37258d) {
            super(str);
            this.f359016c = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return this.f359016c.get(c12);
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$f */
    public static final class f extends AbstractC37259e {
        static {
            new f();
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            if (c12 != ' ' && c12 != 133 && c12 != 5760) {
                if (c12 == 8199) {
                    return false;
                }
                if (c12 != 8287 && c12 != 12288 && c12 != 8232 && c12 != 8233) {
                    switch (c12) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c12 < 8192 || c12 > 8202) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$g */
    public static final class g extends z {
        static {
            new g();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g() {
            char[] charArray = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
            char[] cArr = new char[37];
            for (int i12 = 0; i12 < 37; i12++) {
                cArr[i12] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i12) + '\t');
            }
            super("CharMatcher.digit()", charArray, cArr);
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$h */
    public static abstract class h extends AbstractC37259e {
        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public AbstractC37259e p() {
            return new w(this);
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$i */
    public static final class i extends AbstractC37259e {
        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        public final boolean apply(Character ch2) {
            ch2.getClass();
            throw null;
        }

        @Override // com.google.common.base.AbstractC37259e
        /* renamed from: d */
        public final boolean apply(Character ch2) {
            ch2.getClass();
            throw null;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            throw null;
        }

        public final String toString() {
            return "CharMatcher.forPredicate(null)";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$j */
    public static final class j extends h {

        /* renamed from: b, reason: collision with root package name */
        public final char f359017b;

        /* renamed from: c, reason: collision with root package name */
        public final char f359018c;

        public j(char c12, char c13) {
            M.g(c13 >= c12);
            this.f359017b = c12;
            this.f359018c = c13;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return this.f359017b <= c12 && c12 <= this.f359018c;
        }

        public final String toString() {
            return "CharMatcher.inRange('" + AbstractC37259e.a(this.f359017b) + "', '" + AbstractC37259e.a(this.f359018c) + "')";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$k */
    public static final class k extends z {
        static {
            new k();
        }

        public k() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$l */
    public static final class l extends h {

        /* renamed from: b, reason: collision with root package name */
        public final char f359019b;

        public l(char c12) {
            this.f359019b = c12;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e b(AbstractC37259e abstractC37259e) {
            return abstractC37259e.m(this.f359019b) ? this : x.f359026c;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return c12 == this.f359019b;
        }

        @Override // com.google.common.base.AbstractC37259e.h, com.google.common.base.AbstractC37259e
        public final AbstractC37259e p() {
            return new n(this.f359019b);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e q(AbstractC37259e abstractC37259e) {
            return abstractC37259e.m(this.f359019b) ? abstractC37259e : new y(this, abstractC37259e);
        }

        public final String toString() {
            return "CharMatcher.is('" + AbstractC37259e.a(this.f359019b) + "')";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$m */
    public static final class m extends h {

        /* renamed from: b, reason: collision with root package name */
        public final char f359020b;

        /* renamed from: c, reason: collision with root package name */
        public final char f359021c;

        public m(char c12, char c13) {
            this.f359020b = c12;
            this.f359021c = c13;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return c12 == this.f359020b || c12 == this.f359021c;
        }

        public final String toString() {
            return "CharMatcher.anyOf(\"" + AbstractC37259e.a(this.f359020b) + AbstractC37259e.a(this.f359021c) + "\")";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$n */
    public static final class n extends h {

        /* renamed from: b, reason: collision with root package name */
        public final char f359022b;

        public n(char c12) {
            this.f359022b = c12;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e b(AbstractC37259e abstractC37259e) {
            return abstractC37259e.m(this.f359022b) ? new C37260a(this, abstractC37259e) : abstractC37259e;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return c12 != this.f359022b;
        }

        @Override // com.google.common.base.AbstractC37259e.h, com.google.common.base.AbstractC37259e
        public final AbstractC37259e p() {
            return new l(this.f359022b);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e q(AbstractC37259e abstractC37259e) {
            return abstractC37259e.m(this.f359022b) ? C37261b.f359013c : this;
        }

        public final String toString() {
            return "CharMatcher.isNot('" + AbstractC37259e.a(this.f359022b) + "')";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$o */
    public static final class o extends AbstractC37259e {
        static {
            new o();
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return Character.isDigit(c12);
        }

        public final String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$p */
    public static final class p extends u {

        /* renamed from: c, reason: collision with root package name */
        public static final p f359023c = new p();

        public p() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return c12 <= 31 || (c12 >= 127 && c12 <= 159);
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$q */
    public static final class q extends AbstractC37259e {
        static {
            new q();
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return Character.isLetter(c12);
        }

        public final String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$r */
    public static final class r extends AbstractC37259e {
        static {
            new r();
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return Character.isLetterOrDigit(c12);
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$s */
    public static final class s extends AbstractC37259e {
        static {
            new s();
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return Character.isLowerCase(c12);
        }

        public final String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$t */
    public static final class t extends AbstractC37259e {
        static {
            new t();
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return Character.isUpperCase(c12);
        }

        public final String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$u */
    public static abstract class u extends h {

        /* renamed from: b, reason: collision with root package name */
        public final String f359024b;

        public u(String str) {
            str.getClass();
            this.f359024b = str;
        }

        public final String toString() {
            return this.f359024b;
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$v */
    public static class v extends AbstractC37259e {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37259e f359025b;

        public v(AbstractC37259e abstractC37259e) {
            this.f359025b = abstractC37259e;
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int f(String str) {
            return str.length() - this.f359025b.f(str);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return !this.f359025b.m(c12);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean n(String str) {
            return this.f359025b.o(str);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean o(String str) {
            return this.f359025b.n(str);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e p() {
            return this.f359025b;
        }

        public String toString() {
            return this.f359025b + ".negate()";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$w */
    public static class w extends v {
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$x */
    public static final class x extends u {

        /* renamed from: c, reason: collision with root package name */
        public static final x f359026c = new x();

        public x() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e b(AbstractC37259e abstractC37259e) {
            abstractC37259e.getClass();
            return this;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int f(String str) {
            str.getClass();
            return 0;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int h(int i12, CharSequence charSequence) {
            M.k(i12, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final int i(String str) {
            str.getClass();
            return -1;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return false;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean n(String str) {
            return str.length() == 0;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean o(String str) {
            str.getClass();
            return true;
        }

        @Override // com.google.common.base.AbstractC37259e.h, com.google.common.base.AbstractC37259e
        public final AbstractC37259e p() {
            return C37261b.f359013c;
        }

        @Override // com.google.common.base.AbstractC37259e
        public final AbstractC37259e q(AbstractC37259e abstractC37259e) {
            abstractC37259e.getClass();
            return abstractC37259e;
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$y */
    public static final class y extends AbstractC37259e {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37259e f359027b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC37259e f359028c;

        public y(AbstractC37259e abstractC37259e, AbstractC37259e abstractC37259e2) {
            abstractC37259e.getClass();
            this.f359027b = abstractC37259e;
            abstractC37259e2.getClass();
            this.f359028c = abstractC37259e2;
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            return this.f359027b.m(c12) || this.f359028c.m(c12);
        }

        public final String toString() {
            return "CharMatcher.or(" + this.f359027b + ", " + this.f359028c + ")";
        }
    }

    /* compiled from: CharMatcher.java */
    /* renamed from: com.google.common.base.e$z */
    public static class z extends AbstractC37259e {

        /* renamed from: b, reason: collision with root package name */
        public final String f359029b;

        /* renamed from: c, reason: collision with root package name */
        public final char[] f359030c;

        /* renamed from: d, reason: collision with root package name */
        public final char[] f359031d;

        public z(String str, char[] cArr, char[] cArr2) {
            this.f359029b = str;
            this.f359030c = cArr;
            this.f359031d = cArr2;
            M.g(cArr.length == cArr2.length);
            int i12 = 0;
            while (i12 < cArr.length) {
                M.g(cArr[i12] <= cArr2[i12]);
                int i13 = i12 + 1;
                if (i13 < cArr.length) {
                    M.g(cArr2[i12] < cArr[i13]);
                }
                i12 = i13;
            }
        }

        @Override // com.google.common.base.AbstractC37259e, com.google.common.base.N
        @Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return apply(ch2);
        }

        @Override // com.google.common.base.AbstractC37259e
        public final boolean m(char c12) {
            int iBinarySearch = Arrays.binarySearch(this.f359030c, c12);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i12 = (~iBinarySearch) - 1;
            return i12 >= 0 && c12 <= this.f359031d[i12];
        }

        public final String toString() {
            return this.f359029b;
        }
    }

    public static String a(char c12) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            cArr[5 - i12] = "0123456789ABCDEF".charAt(c12 & 15);
            c12 = (char) (c12 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static AbstractC37259e c(String str) {
        int length = str.length();
        return length != 0 ? length != 1 ? length != 2 ? new c(str) : new m(str.charAt(0), str.charAt(1)) : new l(str.charAt(0)) : x.f359026c;
    }

    public static AbstractC37259e e() {
        return d.f359015c;
    }

    public static AbstractC37259e g(char c12, char c13) {
        return new j(c12, c13);
    }

    public static AbstractC37259e j(char c12) {
        return new l(c12);
    }

    public static AbstractC37259e k() {
        return new n(' ');
    }

    public static AbstractC37259e l() {
        return p.f359023c;
    }

    public AbstractC37259e b(AbstractC37259e abstractC37259e) {
        return new C37260a(this, abstractC37259e);
    }

    @Override // com.google.common.base.N
    @Deprecated
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean apply(Character ch2) {
        return m(ch2.charValue());
    }

    public int f(String str) {
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            if (m(str.charAt(i13))) {
                i12++;
            }
        }
        return i12;
    }

    public int h(int i12, CharSequence charSequence) {
        int length = charSequence.length();
        M.k(i12, length);
        while (i12 < length) {
            if (m(charSequence.charAt(i12))) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public int i(String str) {
        return h(0, str);
    }

    public abstract boolean m(char c12);

    public boolean n(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (!m(str.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean o(String str) {
        return i(str) == -1;
    }

    public AbstractC37259e p() {
        return new v(this);
    }

    public AbstractC37259e q(AbstractC37259e abstractC37259e) {
        return new y(this, abstractC37259e);
    }
}
