package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* loaded from: classes7.dex */
public class Xj extends AbstractC39082qj {

    /* renamed from: a, reason: collision with root package name */
    private int f379932a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC39082qj f379933b;

    public Xj(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(context.getApplicationContext(), new C38987mn(), iCommonExecutor);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void a() {
        int i12 = this.f379932a + 1;
        this.f379932a = i12;
        if (i12 == 1) {
            this.f379933b.a();
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void b() {
        int i12 = this.f379932a - 1;
        this.f379932a = i12;
        if (i12 == 0) {
            this.f379933b.b();
        }
    }

    @j.k0
    public Xj(Context context, @j.N C38987mn c38987mn, @j.N ICommonExecutor iCommonExecutor) {
        if (c38987mn.a(context, "android.hardware.telephony")) {
            this.f379933b = new Ij(context, iCommonExecutor);
        } else {
            this.f379933b = new Kj();
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void a(InterfaceC38685ak interfaceC38685ak) {
        this.f379933b.a(interfaceC38685ak);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public synchronized void a(InterfaceC39201vj interfaceC39201vj) {
        this.f379933b.a(interfaceC39201vj);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public void a(boolean z12) {
        this.f379933b.a(z12);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC39082qj
    public void a(@j.N C39057pi c39057pi) {
        this.f379933b.a(c39057pi);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39001nc
    public void a(@j.P C38976mc c38976mc) {
        this.f379933b.a(c38976mc);
    }
}
