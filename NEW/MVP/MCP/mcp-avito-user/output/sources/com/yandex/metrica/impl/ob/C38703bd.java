package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39054pf;

/* renamed from: com.yandex.metrica.impl.ob.bd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38703bd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Vb f380200a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38678ad f380201b;

    public C38703bd(@j.N Vb vb2, @j.N C38678ad c38678ad) {
        this.f380200a = vb2;
        this.f380201b = c38678ad;
    }

    @j.P
    public C39054pf.b a(long j12, @j.P String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Hc hcB = this.f380200a.b(j12, str);
                if (hcB != null) {
                    return this.f380201b.a(hcB);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
