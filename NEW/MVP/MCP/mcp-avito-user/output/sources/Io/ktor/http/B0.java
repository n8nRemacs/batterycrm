package io.ktor.http;

import io.ktor.http.InterfaceC41550v0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43044a;

/* compiled from: Query.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B0 {
    public static final void a(C41554x0 c41554x0, String str, int i12, int i13, int i14) {
        if (i13 == -1) {
            int iD2 = d(i12, i14, str);
            int iC2 = c(iD2, i14, str);
            if (iC2 > iD2) {
                c41554x0.c(C42784z0.f406748b, str.substring(iD2, iC2));
                return;
            }
            return;
        }
        int iD3 = d(i12, i13, str);
        int iC3 = c(iD3, i13, str);
        if (iC3 > iD3) {
            String strSubstring = str.substring(iD3, iC3);
            int iD4 = d(i13 + 1, i14, str);
            c41554x0.d(strSubstring, str.substring(iD4, c(iD4, i14, str)));
        }
    }

    public static InterfaceC41550v0 b(String str) {
        int i12;
        if (str.length() - 1 < 0) {
            InterfaceC41550v0.f400124b.getClass();
            return InterfaceC41550v0.a.f400126b;
        }
        InterfaceC41550v0.a aVar = InterfaceC41550v0.f400124b;
        C41554x0 c41554x0A = C41558z0.a();
        int length = str.length() - 1;
        int i13 = 0;
        int i14 = -1;
        if (length >= 0) {
            int i15 = 0;
            i12 = 0;
            int i16 = -1;
            while (i13 != 1000) {
                char cCharAt = str.charAt(i15);
                if (cCharAt == '&') {
                    a(c41554x0A, str, i12, i16, i15);
                    i12 = i15 + 1;
                    i13++;
                    i16 = -1;
                } else if (cCharAt == '=' && i16 == -1) {
                    i16 = i15;
                }
                if (i15 != length) {
                    i15++;
                } else {
                    i14 = i16;
                }
            }
            return new C41556y0(true, c41554x0A.f400385b);
        }
        i12 = 0;
        if (i13 != 1000) {
            a(c41554x0A, str, i12, i14, str.length());
        }
        return new C41556y0(true, c41554x0A.f400385b);
    }

    public static final int c(int i12, int i13, String str) {
        while (i13 > i12 && C43044a.d(str.charAt(i13 - 1))) {
            i13--;
        }
        return i13;
    }

    public static final int d(int i12, int i13, String str) {
        while (i12 < i13 && C43044a.d(str.charAt(i12))) {
            i12++;
        }
        return i12;
    }
}
