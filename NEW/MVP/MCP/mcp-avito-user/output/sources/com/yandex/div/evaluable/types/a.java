package com.yandex.div.evaluable.types;

import X41.g;
import Y61.k;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: Color.kt */
@g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/evaluable/types/a;", "", "a", "value", "", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C10920a f369990b = new C10920a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f369991a;

    /* compiled from: Color.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/types/a$a;", "", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.evaluable.types.a$a, reason: collision with other inner class name */
    public static final class C10920a {
        public /* synthetic */ C10920a(C42822w c42822w) {
            this();
        }

        public static int a(int i12, int i13, int i14, int i15) {
            int i16 = (i12 << 24) | (i13 << 16) | (i14 << 8) | i15;
            C10920a c10920a = a.f369990b;
            return i16;
        }

        public static int b(@k String str) {
            String str2;
            String strJ;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (str.charAt(0) != '#') {
                throw new IllegalArgumentException(L.j(str, "Unknown color ").toString());
            }
            int length = str.length();
            if (length == 4) {
                char cCharAt = str.charAt(1);
                char cCharAt2 = str.charAt(2);
                char cCharAt3 = str.charAt(3);
                str2 = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else {
                if (length != 5) {
                    if (length == 7) {
                        strJ = L.j(str.substring(1), "ff");
                    } else {
                        if (length != 9) {
                            throw new IllegalArgumentException(L.j(str, "Unknown color "));
                        }
                        strJ = str.substring(1);
                    }
                    C43044a.a(16);
                    int i12 = (int) Long.parseLong(strJ, 16);
                    C10920a c10920a = a.f369990b;
                    return i12;
                }
                char cCharAt4 = str.charAt(1);
                char cCharAt5 = str.charAt(2);
                char cCharAt6 = str.charAt(3);
                char cCharAt7 = str.charAt(4);
                str2 = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            }
            strJ = str2;
            C43044a.a(16);
            int i122 = (int) Long.parseLong(strJ, 16);
            C10920a c10920a2 = a.f369990b;
            return i122;
        }

        public C10920a() {
        }
    }

    private /* synthetic */ a(int i12) {
        this.f369991a = i12;
    }

    public static final /* synthetic */ a a(int i12) {
        return new a(i12);
    }

    @k
    public static String b(int i12) {
        return L.j(C43066x.R(8, Integer.toHexString(i12)).toUpperCase(Locale.ROOT), "#");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f369991a == ((a) obj).f369991a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f369991a);
    }

    @k
    public final String toString() {
        return b(this.f369991a);
    }
}
