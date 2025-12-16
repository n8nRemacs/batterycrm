package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.io.File;

/* loaded from: classes7.dex */
public class Zg {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f380010a;

    public class a implements com.yandex.metrica.rtm.wrapper.i {
        public a() {
        }

        @j.P
        public File getCrashesDirectory(@j.N Context context) {
            return Zg.this.f380010a.a(context, "appmetrica_rtm_crashes");
        }

        @j.P
        public File getCrashesTriggerDirectory(@j.N Context context) {
            return Zg.this.f380010a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public class b implements com.yandex.metrica.rtm.wrapper.j {
        public b(Zg zg2) {
        }

        @j.P
        public String getDeviceType(@j.N Context context) {
            com.yandex.metrica.b bVarA = F0.g().n().a().a();
            if (bVarA == null) {
                return null;
            }
            return bVarA.f377560b;
        }

        @j.P
        public String getVersion(@j.N Context context) {
            return A2.a(context, context.getPackageName());
        }
    }

    public class c implements com.yandex.metrica.rtm.wrapper.i {
        public c() {
        }

        @j.P
        public File getCrashesDirectory(@j.N Context context) {
            return Zg.this.f380010a.a(context, "appmetrica_rtm_crashes");
        }

        @j.P
        public File getCrashesTriggerDirectory(@j.N Context context) {
            return Zg.this.f380010a.a(context, "appmetrica_rtm_crashes_triggers");
        }
    }

    public Zg() {
        this(new B0());
    }

    @j.N
    public com.yandex.metrica.rtm.wrapper.f b(@j.N Context context) {
        com.yandex.metrica.rtm.wrapper.l lVar;
        if (C38842h2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                new a();
                ICommonExecutor iCommonExecutorF = F0.g().q().f();
                new b(this);
                lVar = new com.yandex.metrica.rtm.wrapper.l(context, iCommonExecutorF);
            } catch (Throwable unused) {
            }
        } else {
            lVar = null;
        }
        return lVar == null ? new Wg() : lVar;
    }

    @j.k0
    public Zg(@j.N B0 b02) {
        this.f380010a = b02;
    }

    @j.N
    public com.yandex.metrica.rtm.wrapper.e a(@j.N Context context) {
        com.yandex.metrica.rtm.wrapper.h hVar;
        if (C38842h2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                new c();
                hVar = new com.yandex.metrica.rtm.wrapper.h(context);
            } catch (Throwable unused) {
            }
        } else {
            hVar = null;
        }
        return hVar == null ? new Vg() : hVar;
    }

    @j.N
    public com.yandex.metrica.rtm.wrapper.d a(@j.N com.yandex.metrica.rtm.wrapper.k kVar, @j.N String str, boolean z12) {
        com.yandex.metrica.rtm.wrapper.g gVar;
        if (C38842h2.a("com.yandex.metrica.rtm.client.ExceptionProcessor")) {
            try {
                gVar = new com.yandex.metrica.rtm.wrapper.g(str, z12);
            } catch (Throwable unused) {
            }
        } else {
            gVar = null;
        }
        return gVar == null ? new Ug() : gVar;
    }
}
