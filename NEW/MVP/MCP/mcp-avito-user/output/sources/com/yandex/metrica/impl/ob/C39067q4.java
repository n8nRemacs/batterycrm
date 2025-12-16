package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.q4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39067q4 implements InterfaceC38943l4, InterfaceC39018o4<U3> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC38943l4
    @j.N
    public InterfaceC38918k4 a(@j.N Context context, @j.N C39043p4 c39043p4, @j.N C38869i4 c38869i4, @j.N D3 d32) {
        return new C39090r4(context, c39043p4.b(new W3(c38869i4.b(), c38869i4.a()), d32, new Y3(this)));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39018o4
    @j.N
    public Q3 b(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C39282z4(context, i32, aVar, c39104ri.d(), new C39224wi(c39104ri), CounterConfiguration.b.MAIN);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39018o4
    @j.N
    public S3 a(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new U3(context, c39104ri.d(), i32, aVar, F0.g().m(), F0.g().u(), new C39224wi(c39104ri));
    }
}
