package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.C43047d;

/* loaded from: classes7.dex */
public final class R6 implements Converter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38805ff[] fromModel(@Y61.k Map<String, String> map) {
        int size = map.size();
        C38805ff[] c38805ffArr = new C38805ff[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c38805ffArr[i13] = new C38805ff();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C38805ff c38805ff = c38805ffArr[i12];
            String key = entry.getKey();
            Charset charset = C43047d.f410589b;
            if (key == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            c38805ff.f380591a = key.getBytes(charset);
            C38805ff c38805ff2 = c38805ffArr[i12];
            String value = entry.getValue();
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            c38805ff2.f380592b = value.getBytes(charset);
            i12++;
        }
        return c38805ffArr;
    }

    @Override // com.yandex.metrica.core.api.Converter
    public Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }
}
