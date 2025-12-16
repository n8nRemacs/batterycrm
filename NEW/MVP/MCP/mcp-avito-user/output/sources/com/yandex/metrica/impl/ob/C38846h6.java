package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.h6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38846h6 {

    /* renamed from: a, reason: collision with root package name */
    private final C38895j6 f380680a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f380681b;

    public C38846h6(@Y61.k Context context, @Y61.k I3 i32) {
        String strA = i32.a();
        if (strA != null) {
            A2.a(strA);
        }
        C38895j6 c38895j6 = new C38895j6(context, i32);
        this.f380680a = c38895j6;
        this.f380681b = new LinkedHashMap(c38895j6.a());
    }

    @Y61.k
    public final Map<String, byte[]> a() {
        return new HashMap(this.f380681b);
    }

    public final void a(@Y61.k String str, @Y61.l byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f380681b.remove(str);
        } else {
            this.f380681b.put(str, bArr);
        }
        this.f380680a.a(this.f380681b);
    }
}
