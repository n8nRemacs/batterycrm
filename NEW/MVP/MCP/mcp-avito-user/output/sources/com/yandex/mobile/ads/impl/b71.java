package com.yandex.mobile.ads.impl;

import java.net.ProtocolException;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class b71 {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final sv0 f383804a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    public final int f383805b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f383806c;

    public static final class a {
        @Y61.k
        public static b71 a(@Y61.k String str) throws ProtocolException, NumberFormatException {
            sv0 sv0Var;
            int i12;
            String strSubstring;
            if (C43066x.h0(str, "HTTP/1.", false)) {
                i12 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(up1.a("Unexpected status line: ", str));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    sv0Var = sv0.f390033b;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException(up1.a("Unexpected status line: ", str));
                    }
                    sv0Var = sv0.f390034c;
                }
            } else {
                if (!C43066x.h0(str, "ICY ", false)) {
                    throw new ProtocolException(up1.a("Unexpected status line: ", str));
                }
                sv0Var = sv0.f390033b;
                i12 = 4;
            }
            int i13 = i12 + 3;
            if (str.length() < i13) {
                throw new ProtocolException(up1.a("Unexpected status line: ", str));
            }
            try {
                int i14 = Integer.parseInt(str.substring(i12, i13));
                if (str.length() <= i13) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i13) != ' ') {
                        throw new ProtocolException(up1.a("Unexpected status line: ", str));
                    }
                    strSubstring = str.substring(i12 + 4);
                }
                return new b71(sv0Var, i14, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(up1.a("Unexpected status line: ", str));
            }
        }
    }

    public b71(@Y61.k sv0 sv0Var, int i12, @Y61.k String str) {
        this.f383804a = sv0Var;
        this.f383805b = i12;
        this.f383806c = str;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f383804a == sv0.f390033b) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f383805b);
        sb2.append(' ');
        sb2.append(this.f383806c);
        return sb2.toString();
    }
}
