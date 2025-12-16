package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import java.nio.charset.Charset;
import kotlin.text.C43047d;

/* loaded from: classes7.dex */
public final class Q6 implements Converter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] fromModel(@Y61.k String str) {
        if ("native".equals(str)) {
            str = "JVM";
        }
        Charset charset = C43047d.f410589b;
        if (str != null) {
            return str.getBytes(charset);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }
}
