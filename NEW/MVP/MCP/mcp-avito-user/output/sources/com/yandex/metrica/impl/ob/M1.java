package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes7.dex */
class M1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC39040p1 f378861a;

    /* renamed from: b, reason: collision with root package name */
    private final com.yandex.metrica.rtm.wrapper.f f378862b;

    public M1(@j.N InterfaceC39040p1 interfaceC39040p1, @j.N Context context) {
        this(interfaceC39040p1, new Zg().b(context));
    }

    public void a(int i12, Bundle bundle) {
        if (i12 == 1) {
            this.f378861a.reportData(bundle);
        } else {
            if (i12 != 2) {
                return;
            }
            this.f378862b.reportData(bundle);
        }
    }

    @j.k0
    public M1(@j.N InterfaceC39040p1 interfaceC39040p1, @j.N com.yandex.metrica.rtm.wrapper.f fVar) {
        this.f378861a = interfaceC39040p1;
        this.f378862b = fVar;
    }
}
