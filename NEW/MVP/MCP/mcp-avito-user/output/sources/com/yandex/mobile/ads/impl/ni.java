package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public abstract class ni implements ju0<Character> {

    public static abstract class a extends ni {
        @Override // com.yandex.mobile.ads.impl.ju0
        @Deprecated
        public final boolean apply(Character ch2) {
            return a(ch2.charValue());
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final char f388302a;

        public b(char c12) {
            this.f388302a = c12;
        }

        @Override // com.yandex.mobile.ads.impl.ni
        public final boolean a(char c12) {
            return c12 == this.f388302a;
        }

        public final String toString() {
            StringBuilder sbA = Cif.a("CharMatcher.is('");
            char c12 = this.f388302a;
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
            sbA.append(String.copyValueOf(cArr));
            sbA.append("')");
            return sbA.toString();
        }
    }

    public static abstract class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f388303a = (String) iu0.a("CharMatcher.none()");

        public final String toString() {
            return this.f388303a;
        }
    }

    public static final class d extends c {

        /* renamed from: b, reason: collision with root package name */
        static final d f388304b = new d();

        private d() {
        }

        @Override // com.yandex.mobile.ads.impl.ni
        public final boolean a(char c12) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.ni
        public final int a(CharSequence charSequence, int i12) {
            iu0.b(i12, charSequence.length());
            return -1;
        }
    }

    public int a(CharSequence charSequence, int i12) {
        int length = charSequence.length();
        iu0.b(i12, length);
        while (i12 < length) {
            if (a(charSequence.charAt(i12))) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public abstract boolean a(char c12);
}
