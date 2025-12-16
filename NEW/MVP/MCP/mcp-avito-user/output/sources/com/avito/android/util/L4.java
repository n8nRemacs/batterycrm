package com.avito.android.util;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: RussianPhoneNumberFormatter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/L4;", "Lcom/avito/android/util/V3;", "_common_formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class L4 implements V3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f318651a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f318652b;

    /* JADX WARN: Illegal instructions before constructor call */
    public L4() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    @Override // com.avito.android.util.InterfaceC35945t1
    public final String a(String str) {
        String str2 = str;
        return str2 == null ? "" : b(0, str2).f318924a;
    }

    @Y61.k
    public final C35843m0 b(int i12, @Y61.l String str) {
        C35843m0 c35843m0C;
        String str2;
        int i13 = 0;
        if (str == null) {
            return new C35843m0("", 0);
        }
        C35843m0 c35843m0 = new C35843m0(str, i12);
        if (this.f318652b) {
            c35843m0C = c(c35843m0);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                str2 = c35843m0C.f318924a;
                if (i14 >= str2.length()) {
                    break;
                }
                if (Character.isDigit(str2.charAt(i14))) {
                    i15++;
                }
                i14++;
            }
            if (i15 == 11 && (str2.charAt(0) == '7' || str2.charAt(0) == '8')) {
                c35843m0C = new C35843m0(C43066x.x(1, str2), c35843m0C.f318925b - 1);
            }
        } else {
            c35843m0C = c(c35843m0);
        }
        String str3 = c35843m0C.f318924a;
        if (str3.length() != 0) {
            StringBuilder sb2 = new StringBuilder(13);
            int i16 = c35843m0C.f318925b;
            int i17 = 0;
            while (i13 < str3.length()) {
                if (i17 > 12) {
                    if (Character.isDigit(str3.charAt(i13))) {
                        sb2.append(str3.charAt(i13));
                    }
                } else if ("ddd ddd-dd-dd".charAt(i17) == 'd') {
                    if (Character.isDigit(str3.charAt(i13))) {
                        sb2.append(str3.charAt(i13));
                        i17++;
                    } else {
                        i13++;
                        if (i17 < i16) {
                            i16--;
                        }
                    }
                } else if (str3.charAt(i13) == "ddd ddd-dd-dd".charAt(i17)) {
                    sb2.append(str3.charAt(i13));
                    i17++;
                } else {
                    sb2.append("ddd ddd-dd-dd".charAt(i17));
                    i17++;
                    if (i17 <= i16) {
                        i16++;
                    }
                }
                i13++;
            }
            c35843m0C = new C35843m0(sb2.toString(), i16);
        }
        if (!this.f318651a) {
            return c35843m0C;
        }
        return new C35843m0("+7 " + c35843m0C.f318924a, c35843m0C.f318925b + 3);
    }

    public final C35843m0 c(C35843m0 c35843m0) {
        String strSubstring = c35843m0.f318924a;
        boolean z12 = this.f318651a;
        int iMax = c35843m0.f318925b;
        if (z12 && C43066x.h0(strSubstring, "+7 ", false)) {
            strSubstring = strSubstring.substring(3);
            iMax = Math.max(0, iMax - 3);
        }
        int length = strSubstring.length();
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            char cCharAt = strSubstring.charAt(i12);
            if (Character.isDigit(cCharAt) || cCharAt == '+') {
                break;
            }
            i12++;
        }
        if (i12 != -1 && C43066x.g0(i12, strSubstring, "+7", false)) {
            strSubstring = strSubstring.substring(i12 + 2);
            iMax = Math.max(0, (iMax - 2) - i12);
        }
        return new C35843m0(strSubstring, iMax);
    }

    public L4(boolean z12, boolean z13) {
        this.f318651a = z12;
        this.f318652b = z13;
    }

    public /* synthetic */ L4(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
