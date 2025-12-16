package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.wg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39222wg {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38930kg f382130a;

    /* renamed from: com.yandex.metrica.impl.ob.wg$a */
    public class a implements InterfaceC38930kg {
        @Override // com.yandex.metrica.impl.ob.InterfaceC38930kg
        public void a(@j.N InterfaceC39198vg interfaceC39198vg) {
            throw new IllegalStateException("No class: com.android.installreferrer.api.InstallReferrerClient");
        }
    }

    public C39222wg(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(a(context, iCommonExecutor));
    }

    public void a(@j.N InterfaceC39198vg interfaceC39198vg) {
        try {
            this.f382130a.a(interfaceC39198vg);
        } catch (Throwable th2) {
            interfaceC39198vg.a(th2);
        }
    }

    @j.k0
    public C39222wg(@j.N InterfaceC38930kg interfaceC38930kg) {
        this.f382130a = interfaceC38930kg;
    }

    @j.N
    private static InterfaceC38930kg a(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        C39079qg c39079qg;
        if (C38842h2.a("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c39079qg = new C39079qg(InstallReferrerClient.newBuilder(context).build(), iCommonExecutor);
            } catch (Throwable unused) {
            }
        } else {
            c39079qg = null;
        }
        return c39079qg == null ? new a() : c39079qg;
    }
}
