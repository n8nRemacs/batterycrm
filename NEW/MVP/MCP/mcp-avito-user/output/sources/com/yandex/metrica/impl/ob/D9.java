package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.C39293zf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes7.dex */
public final class D9 implements Converter {
    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] fromModel(@Y61.k Map<String, byte[]> map) {
        C39293zf c39293zf = new C39293zf();
        int size = map.size();
        C39293zf.a[] aVarArr = new C39293zf.a[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            aVarArr[i13] = new C39293zf.a();
        }
        c39293zf.f382315a = aVarArr;
        for (Object obj : map.entrySet()) {
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            c39293zf.f382315a[i12].f382317a = (String) entry.getKey();
            c39293zf.f382315a[i12].f382318b = (byte[]) entry.getValue();
            i12 = i14;
        }
        return MessageNano.toByteArray(c39293zf);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @Y61.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<String, byte[]> toModel(@Y61.k byte[] bArr) {
        C39293zf.a[] aVarArr = ((C39293zf) MessageNano.mergeFrom(new C39293zf(), bArr)).f382315a;
        int iF2 = kotlin.collections.P0.f(aVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (C39293zf.a aVar : aVarArr) {
            linkedHashMap.put(aVar.f382317a, aVar.f382318b);
        }
        return linkedHashMap;
    }
}
