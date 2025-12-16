package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class S1<C extends L3> extends C39208w2<C> {

    /* renamed from: e, reason: collision with root package name */
    private Runnable f379346e;

    /* renamed from: f, reason: collision with root package name */
    private final ICommonExecutor f379347f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S1.this.d();
        }
    }

    public S1(@j.N C c12, @j.N InterfaceC39272yi interfaceC39272yi, @j.N ICommonExecutor iCommonExecutor) {
        super(c12, interfaceC39272yi);
        this.f379346e = new a();
        this.f379347f = iCommonExecutor;
    }

    @Override // com.yandex.metrica.impl.ob.C39208w2
    public void c() {
        this.f379347f.remove(this.f379346e);
    }

    @Override // com.yandex.metrica.impl.ob.C39208w2
    public void f() {
        super.f();
        Lg lgM = e().m();
        if (lgM.F()) {
            String strB = lgM.B();
            if (TextUtils.isEmpty(strB) || DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME.equals(strB)) {
                return;
            }
            try {
                NetworkServiceLocator.f382415b.f382416a.a(C39099rd.a(e()));
            } catch (Throwable unused) {
            }
        }
    }

    public void g() {
        synchronized (this.f382096b) {
            try {
                if (!this.f382097c) {
                    c();
                    if (e().m().G() > 0) {
                        this.f379347f.executeDelayed(this.f379346e, TimeUnit.SECONDS.toMillis(e().m().G()));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
