package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39078qf;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.text.C43047d;

/* renamed from: com.yandex.metrica.impl.ob.te, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39148te {

    /* renamed from: a, reason: collision with root package name */
    private final D9 f381882a = new D9();

    @Y61.k
    public C39078qf.d.a.b[] a(@Y61.l byte[] bArr) {
        int i12 = 0;
        if (bArr == null) {
            return new C39078qf.d.a.b[0];
        }
        Map<String, byte[]> model = this.f381882a.toModel(bArr);
        int size = model.size();
        C39078qf.d.a.b[] bVarArr = new C39078qf.d.a.b[size];
        for (int i13 = 0; i13 < size; i13++) {
            bVarArr[i13] = new C39078qf.d.a.b();
        }
        for (Object obj : ((LinkedHashMap) model).entrySet()) {
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C39078qf.d.a.b bVar = bVarArr[i12];
            String str = (String) entry.getKey();
            Charset charset = C43047d.f410589b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            bVar.f381561a = str.getBytes(charset);
            bVar.f381562b = (byte[]) entry.getValue();
            i12 = i14;
        }
        return bVarArr;
    }
}
