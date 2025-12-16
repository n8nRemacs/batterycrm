package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.hj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38859hj implements InterfaceC38709bj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38699b9 f380730a;

    public C38859hj(@j.N C38699b9 c38699b9) {
        this.f380730a = c38699b9;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38709bj
    @j.P
    public String a() {
        W0 w0U = this.f380730a.u();
        String str = !TextUtils.isEmpty(w0U.f379795a) ? w0U.f379795a : null;
        if (str != null) {
            return str;
        }
        String strN = this.f380730a.n(null);
        return !TextUtils.isEmpty(strN) ? strN : str;
    }
}
