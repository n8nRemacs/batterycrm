package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.S3;

/* loaded from: classes7.dex */
public class Y3<COMPONENT extends S3 & P3> implements N3<X3> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC39018o4<COMPONENT> f379949a;

    public Y3(@j.N InterfaceC39018o4<COMPONENT> interfaceC39018o4) {
        this.f379949a = interfaceC39018o4;
    }

    @Override // com.yandex.metrica.impl.ob.N3
    public R3 a(@j.N Context context, @j.N I3 i32, @j.N D3 d32) {
        return new X3(context, i32, d32, new C38719c4(d32.f377930b), this.f379949a, new J3(), C38783ei.a());
    }
}
