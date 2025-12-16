package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ej, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38784ej {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private static volatile C38784ej f380502b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39132sm f380503a;

    @j.k0
    public C38784ej(@j.N C39132sm c39132sm) {
        this.f380503a = c39132sm;
    }

    @j.N
    public static C38784ej a(@j.N Context context) {
        if (f380502b == null) {
            synchronized (C38784ej.class) {
                try {
                    if (f380502b == null) {
                        f380502b = new C38784ej(new C39132sm(context, "uuid.dat"));
                    }
                } finally {
                }
            }
        }
        return f380502b;
    }

    public C38759dj b(@j.N Context context, @j.N InterfaceC38709bj interfaceC38709bj) {
        return new C38759dj(interfaceC38709bj, new C38684aj(), this.f380503a, new C38809fj(context, new B0(), new C38911jm()));
    }

    public C38759dj a(@j.N Context context, @j.N InterfaceC38709bj interfaceC38709bj) {
        return new C38759dj(interfaceC38709bj, new C38834gj(context, new B0()), this.f380503a, new C38809fj(context, new B0(), new C38911jm()));
    }
}
