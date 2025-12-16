package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

@j.X
/* renamed from: com.yandex.metrica.impl.ob.t7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39141t7 implements InterfaceC38772e7<String> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39189v7 f381858a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC39011nm<String, Bundle> f381859b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Callable<List<Bundle>> f381860c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC38986mm<String> f381861d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39117s7 f381862e;

    /* renamed from: com.yandex.metrica.impl.ob.t7$a */
    public class a implements InterfaceC39011nm<String, Bundle> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public Bundle a(@j.N String str) {
            return CrashpadServiceHelper.readCrash(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.t7$b */
    public class b implements Callable<List<Bundle>> {
        @Override // java.util.concurrent.Callable
        public List<Bundle> call() {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.t7$c */
    public class c implements InterfaceC38986mm<String> {
        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(String str) {
            CrashpadServiceHelper.a(str);
        }
    }

    public C39141t7(@j.N C39189v7 c39189v7) {
        this(c39189v7, new C39117s7(), new a(), new b(), new c());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38772e7
    public void a(@j.N String str) {
        Bundle bundleA;
        String str2 = str;
        try {
            bundleA = this.f381859b.a(str2);
        } catch (Throwable unused) {
        }
        C39093r7 c39093r7A = bundleA != null ? this.f381862e.a(str2, bundleA) : null;
        if (c39093r7A != null) {
            this.f381858a.a2(c39093r7A);
        } else {
            this.f381861d.b(str2);
        }
    }

    @j.k0
    public C39141t7(@j.N C39189v7 c39189v7, @j.N C39117s7 c39117s7, @j.N InterfaceC39011nm<String, Bundle> interfaceC39011nm, @j.N Callable<List<Bundle>> callable, @j.N InterfaceC38986mm<String> interfaceC38986mm) {
        this.f381858a = c39189v7;
        this.f381862e = c39117s7;
        this.f381859b = interfaceC39011nm;
        this.f381860c = callable;
        this.f381861d = interfaceC38986mm;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38772e7
    public void a() {
        try {
            for (Bundle bundle : this.f381860c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    C39093r7 c39093r7A = this.f381862e.a(string, bundle);
                    if (c39093r7A != null) {
                        this.f381858a.b2(c39093r7A);
                    } else {
                        this.f381861d.b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
