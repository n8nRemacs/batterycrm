package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.h4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38844h4 extends C39162u4 {
    @Override // com.yandex.metrica.impl.ob.C39162u4, com.yandex.metrica.impl.ob.InterfaceC39018o4
    @j.N
    public S3 a(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C3(context, c39104ri.d(), i32, aVar, new C38769e4(F0.g().u()), new C39296zi());
    }

    @Override // com.yandex.metrica.impl.ob.C39162u4, com.yandex.metrica.impl.ob.InterfaceC39018o4
    @j.N
    public Q3 b(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C39282z4(context, i32, aVar, c39104ri.d(), new C39296zi(), CounterConfiguration.b.APPMETRICA);
    }

    @Override // com.yandex.metrica.impl.ob.C39162u4
    @j.N
    /* renamed from: c */
    public L3 a(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C3(context, c39104ri.d(), i32, aVar, new C38769e4(F0.g().u()), new C39296zi());
    }

    @Override // com.yandex.metrica.impl.ob.C39162u4
    @j.N
    /* renamed from: d */
    public C39282z4 b(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C39282z4(context, i32, aVar, c39104ri.d(), new C39296zi(), CounterConfiguration.b.APPMETRICA);
    }
}
