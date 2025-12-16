package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

@j.X
/* loaded from: classes7.dex */
public class A7 implements InterfaceC38921k7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f377757a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final A3 f377758b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private C39261y7 f377759c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<Bundle> f377760d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final E7 f377761e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final I7 f377762f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final InterfaceC39011nm<Void, String> f377763g;

    public class a implements InterfaceC38986mm<Bundle> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(Bundle bundle) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler(bundle);
        }
    }

    public class b implements InterfaceC39011nm<Void, String> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public String a(Void r12) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public A7(@j.N Context context, @j.N A3 a32) {
        this(context, a32, new B0(), new a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    @j.N
    public String a() {
        return "appmetrica_native_crashes";
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    public void b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    @j.N
    public String c() {
        return "appmetrica-native";
    }

    private A7(@j.N Context context, @j.N A3 a32, @j.N B0 b02, @j.N InterfaceC38986mm<Bundle> interfaceC38986mm) {
        this(context, a32, new C39261y7(context, b02, P.g().d().b()), interfaceC38986mm, new E7(), new I7(), new b());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    @j.l0
    public void a(@j.N String str, @j.N String str2, @j.P String str3) {
        C7 c7B = this.f377759c.b();
        if (c7B != null) {
            if (TextUtils.isEmpty(c7B.f377891a) && c7B.f377894d == null) {
                return;
            }
            this.f377762f.a(str3);
            String strEncodeToString = null;
            this.f377762f.b(this.f377763g.a(null));
            InterfaceC38986mm<Bundle> interfaceC38986mm = this.f377760d;
            String strA = this.f377762f.a();
            Bundle bundle = new Bundle();
            E7 e72 = this.f377761e;
            A3 a32 = this.f377758b;
            e72.getClass();
            try {
                strEncodeToString = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", a32.f()).put("arg_pd", a32.g()).put("arg_ps", a32.h()).put("arg_rt", "main")).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", strEncodeToString);
            bundle.putString("arg_rc", strA);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", c7B.f377891a);
            bundle.putBoolean("arg_i64", c7B.f377892b);
            bundle.putBoolean("arg_ul", c7B.f377893c);
            bundle.putString("arg_sn", this.f377757a.getPackageName() + "-crashpad_new_crash_socket");
            if (c7B.f377894d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(c7B.f377894d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", c7B.f377894d.f381289a);
                bundle.putString("arg_lp", c7B.f377894d.f381290b);
                bundle.putString("arg_dp", c7B.f377894d.f381291c);
            }
            interfaceC38986mm.b(bundle);
        }
    }

    @j.k0
    public A7(@j.N Context context, @j.N A3 a32, @j.N C39261y7 c39261y7, @j.N InterfaceC38986mm<Bundle> interfaceC38986mm, @j.N E7 e72, @j.N I7 i72, @j.N InterfaceC39011nm<Void, String> interfaceC39011nm) {
        this.f377757a = context;
        this.f377758b = a32;
        this.f377759c = c39261y7;
        this.f377760d = interfaceC38986mm;
        this.f377761e = e72;
        this.f377762f = i72;
        this.f377763g = interfaceC39011nm;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    public void a(boolean z12) {
        CrashpadHelper.logsEnabled(z12);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38921k7
    public void a(@j.P String str) {
        this.f377762f.a(str);
        CrashpadHelper.updateRuntimeConfig(this.f377762f.a());
    }
}
