package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.uiaccessor.a;

/* loaded from: classes7.dex */
class Ek {

    public class a implements a.InterfaceC10964a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC38986mm f378081a;

        public a(Ek ek2, InterfaceC38986mm interfaceC38986mm) {
            this.f378081a = interfaceC38986mm;
        }

        @Override // com.yandex.metrica.uiaccessor.a.InterfaceC10964a
        public void fragmentAttached(@j.N Activity activity) {
            this.f378081a.b(activity);
        }
    }

    @j.N
    public Z21.a a(@j.N InterfaceC38986mm<Activity> interfaceC38986mm) {
        com.yandex.metrica.uiaccessor.a aVar;
        try {
            aVar = new com.yandex.metrica.uiaccessor.a(new a(this, interfaceC38986mm));
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar == null ? new b(this) : aVar;
    }

    public class b implements Z21.a {
        public b(Ek ek2) {
        }

        @Override // Z21.a
        public void subscribe(@j.N Activity activity) {
        }

        @Override // Z21.a
        public void unsubscribe(@j.N Activity activity) {
        }
    }
}
