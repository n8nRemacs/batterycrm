package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.C43047d;

/* renamed from: com.yandex.metrica.impl.ob.g6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38821g6 implements ProtobufConverter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Gf fromModel(@Y61.k Map<String, byte[]> map) {
        Gf gf2 = new Gf();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Hf hf2 = new Hf();
            String key = entry.getKey();
            Charset charset = C43047d.f410589b;
            if (key == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            hf2.f378263a = key.getBytes(charset);
            hf2.f378264b = entry.getValue();
            arrayList.add(hf2);
        }
        Object[] array = arrayList.toArray(new Hf[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        gf2.f378187a = (Hf[]) array;
        return gf2;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<String, byte[]> toModel(@Y61.k Gf gf2) {
        Hf[] hfArr = gf2.f378187a;
        int iF2 = kotlin.collections.P0.f(hfArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Hf hf2 : hfArr) {
            linkedHashMap.put(new String(hf2.f378263a, C43047d.f410589b), hf2.f378264b);
        }
        return linkedHashMap;
    }
}
