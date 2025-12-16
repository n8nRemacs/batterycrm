package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.google.protobuf.nano.ym.MessageNano;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38895j6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f380835a;

    /* renamed from: b, reason: collision with root package name */
    private final C38821g6 f380836b;

    /* renamed from: c, reason: collision with root package name */
    private final C38871i6 f380837c;

    /* renamed from: d, reason: collision with root package name */
    private final R7 f380838d;

    public C38895j6(@Y61.k Context context, @Y61.k I3 i32) {
        i32.a();
        this.f380835a = "session_extras";
        this.f380836b = new C38821g6();
        this.f380837c = new C38871i6();
        this.f380838d = C38899ja.a(context).a(i32);
    }

    @Y61.k
    public final Map<String, byte[]> a() {
        try {
            byte[] bArrA = this.f380838d.a(this.f380835a);
            if (bArrA != null) {
                if (!(bArrA.length == 0)) {
                    C38821g6 c38821g6 = this.f380836b;
                    this.f380837c.getClass();
                    return c38821g6.toModel((Gf) MessageNano.mergeFrom(new Gf(), bArrA));
                }
            }
        } catch (Throwable unused) {
        }
        C38821g6 c38821g62 = this.f380836b;
        this.f380837c.getClass();
        return c38821g62.toModel(new Gf());
    }

    public final void a(@Y61.k Map<String, byte[]> map) {
        R7 r72 = this.f380838d;
        String str = this.f380835a;
        C38871i6 c38871i6 = this.f380837c;
        Gf gfFromModel = this.f380836b.fromModel(map);
        c38871i6.getClass();
        r72.a(str, MessageNano.toByteArray(gfFromModel));
    }
}
