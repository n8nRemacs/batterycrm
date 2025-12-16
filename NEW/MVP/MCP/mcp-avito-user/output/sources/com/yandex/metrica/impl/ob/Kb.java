package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.identifiers.AdsIdentifiersProvider;
import com.yandex.metrica.impl.ob.C39145tb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class Kb implements InterfaceC39193vb {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f378700a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Jb f378701b;

    public Kb(@j.N String str) {
        this(str, new Jb());
    }

    @j.P
    private C39169ub b(@j.N Context context) throws NoSuchMethodException, SecurityException {
        int i12 = AdsIdentifiersProvider.f377712a;
        Method method = AdsIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.f378700a);
        Jb jb2 = this.f378701b;
        Object[] objArr = {context, bundle};
        C39145tb c39145tb = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        jb2.getClass();
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            C39145tb.a aVar = Ib.f378285a.get(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
            if (aVar == null) {
                throw new IllegalArgumentException(("Provider " + bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER") + " is invalid").toString());
            }
            c39145tb = new C39145tb(aVar, bundle3.getString("com.yandex.metrica.identifiers.extra.ID"), bundle3.containsKey("com.yandex.metrica.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("com.yandex.metrica.identifiers.extra.LIMITED")) : null);
        }
        return new C39169ub(c39145tb, U0.a(bundle2.getString("com.yandex.metrica.identifiers.extra.STATUS")), bundle2.getString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39193vb
    @j.N
    public C39169ub a(@j.N Context context) {
        return a(context, new Fb());
    }

    @j.k0
    public Kb(@j.N String str, @j.N Jb jb2) {
        this.f378700a = str;
        this.f378701b = jb2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39193vb
    @j.N
    public C39169ub a(@j.N Context context, @j.N Gb gb2) throws InterruptedException {
        C39169ub c39169ub;
        gb2.c();
        C39169ub c39169ub2 = null;
        while (gb2.b()) {
            try {
                return b(context);
            } catch (InvocationTargetException e12) {
                c39169ub = new C39169ub(null, U0.UNKNOWN, androidx.camera.camera2.internal.G.g(new StringBuilder("exception while fetching "), this.f378700a, " adv_id: ", e12.getTargetException() != null ? e12.getTargetException().getMessage() : null));
                c39169ub2 = c39169ub;
                try {
                    Thread.sleep(gb2.a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th2) {
                c39169ub = new C39169ub(null, U0.UNKNOWN, "exception while fetching " + this.f378700a + " adv_id: " + th2.getMessage());
                c39169ub2 = c39169ub;
                Thread.sleep(gb2.a());
            }
        }
        return c39169ub2 == null ? new C39169ub() : c39169ub2;
    }
}
