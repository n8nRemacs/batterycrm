package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;

/* renamed from: com.yandex.metrica.impl.ob.u4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39162u4 implements InterfaceC38943l4, InterfaceC39018o4<L3> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39018o4
    @j.N
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L3 a(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C38744d4(context, i32, aVar, F0.g().u(), c39104ri.d(), new C39224wi(c39104ri));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39018o4
    @j.N
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C39282z4 b(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39104ri c39104ri) {
        return new C39282z4(context, i32, aVar, c39104ri.d(), new C39224wi(c39104ri), CounterConfiguration.b.MANUAL);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38943l4
    @j.N
    public InterfaceC38918k4 a(@j.N Context context, @j.N C39043p4 c39043p4, @j.N C38869i4 c38869i4, @j.N D3 d32) {
        return new C39138t4(context, c39043p4.b(new I3(c38869i4.b(), c38869i4.a()), d32, new Y3(this)));
    }
}
