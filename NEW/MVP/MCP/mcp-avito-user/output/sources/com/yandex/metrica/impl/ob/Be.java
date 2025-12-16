package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;

/* loaded from: classes7.dex */
public class Be implements Ge, InterfaceC39028oe {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39028oe
    public int a(@j.N Em em2) {
        return 2;
    }

    @Override // com.yandex.metrica.impl.ob.Ge
    @j.N
    public byte[] a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
        return TextUtils.isEmpty(c39077qe.f381470b) ? new byte[0] : Base64.decode(c39077qe.f381470b, 0);
    }
}
