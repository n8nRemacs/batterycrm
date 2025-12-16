package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
public enum sv0 {
    f390033b("http/1.0"),
    f390034c("http/1.1"),
    f390035d("spdy/3.1"),
    f390036e("h2"),
    f390037f("h2_prior_knowledge"),
    f390038g("quic");


    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f390040a;

    public static final class a {
        @X41.n
        @Y61.k
        public static sv0 a(@Y61.k String str) throws IOException {
            sv0 sv0Var = sv0.f390033b;
            if (!str.equals(sv0Var.f390040a)) {
                sv0Var = sv0.f390034c;
                if (!str.equals(sv0Var.f390040a)) {
                    sv0Var = sv0.f390037f;
                    if (!str.equals(sv0Var.f390040a)) {
                        sv0Var = sv0.f390036e;
                        if (!str.equals(sv0Var.f390040a)) {
                            sv0Var = sv0.f390035d;
                            if (!str.equals(sv0Var.f390040a)) {
                                sv0Var = sv0.f390038g;
                                if (!str.equals(sv0Var.f390040a)) {
                                    throw new IOException(up1.a("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return sv0Var;
        }
    }

    sv0(String str) {
        this.f390040a = str;
    }

    @Override // java.lang.Enum
    @Y61.k
    public final String toString() {
        return this.f390040a;
    }
}
