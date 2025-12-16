package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import com.yandex.metrica.CounterConfiguration;

/* loaded from: classes7.dex */
public class Q1 extends C39281z3 {

    /* renamed from: c, reason: collision with root package name */
    protected C39230x0 f379237c;

    /* renamed from: d, reason: collision with root package name */
    protected C38879ie f379238d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f379239e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final String f379240f;

    public Q1(@j.N A3 a32, @j.N CounterConfiguration counterConfiguration) {
        this(a32, counterConfiguration, null);
    }

    public void a(C38713bn c38713bn) {
        this.f379237c = new C39230x0(c38713bn);
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        CounterConfiguration counterConfigurationB = b();
        synchronized (counterConfigurationB) {
            bundle.putParcelable("COUNTER_CFG_OBJ", counterConfigurationB);
        }
        A3 a3A = a();
        synchronized (a3A) {
            bundle.putParcelable("PROCESS_CFG_OBJ", a3A);
        }
        return bundle;
    }

    @j.P
    public String d() {
        return this.f379237c.a();
    }

    @j.P
    public String e() {
        return this.f379240f;
    }

    public boolean f() {
        return this.f379239e;
    }

    public void g() {
        this.f379239e = true;
    }

    public void h() {
        this.f379239e = false;
    }

    public Q1(@j.N A3 a32, @j.N CounterConfiguration counterConfiguration, @j.P String str) {
        super(a32, counterConfiguration);
        this.f379239e = true;
        this.f379240f = str;
    }

    public void a(InterfaceC38907ji interfaceC38907ji) {
        if (interfaceC38907ji != null) {
            CounterConfiguration counterConfigurationB = b();
            String strE = ((C38858hi) interfaceC38907ji).e();
            synchronized (counterConfigurationB) {
                counterConfigurationB.f377493b.put("CFG_UUID", strE);
            }
        }
    }

    public void a(C38879ie c38879ie) {
        this.f379238d = c38879ie;
    }
}
