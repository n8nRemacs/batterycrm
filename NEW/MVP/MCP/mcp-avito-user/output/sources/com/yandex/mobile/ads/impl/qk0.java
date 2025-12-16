package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.df;

/* loaded from: classes8.dex */
public final class qk0 extends oe<bl0> {
    public qk0(@j.N Context context, @j.N az0<bl0> az0Var, @j.N n2 n2Var, @j.N String str, @j.N String str2, @j.N df.a<AdResponse<bl0>> aVar) {
        super(context, n2Var, str, str2, new xk0(az0Var), aVar, new al0());
    }

    @Override // com.yandex.mobile.ads.impl.oe
    public final boolean b(@j.N zo0 zo0Var, int i12) {
        byte[] bArr;
        return (200 == i12 && (bArr = zo0Var.f392316b) != null && bArr.length > 0) || 204 == i12;
    }
}
