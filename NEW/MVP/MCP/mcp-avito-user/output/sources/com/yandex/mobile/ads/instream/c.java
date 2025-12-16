package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.df1;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.l50;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.v40;
import com.yandex.mobile.ads.impl.yk;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final v40 f392494a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final l50 f392495b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final e f392496c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private final b f392497d;

    public c(@N Context context, @N o60 o60Var, @N v40 v40Var, @N e eVar) {
        this.f392494a = v40Var;
        this.f392496c = eVar;
        l50 l50Var = new l50();
        this.f392495b = l50Var;
        this.f392497d = new b(context, o60Var, v40Var, l50Var, eVar);
    }

    public final void a(@P g60 g60Var) {
        this.f392497d.a(g60Var);
    }

    public final void b() {
        this.f392497d.d();
    }

    public final void c() {
        this.f392494a.a();
        this.f392497d.h();
    }

    public final void d() {
        this.f392497d.j();
        this.f392495b.b();
    }

    public final void a(@P yk ykVar) {
        this.f392497d.a(ykVar);
    }

    public final void a(@N lu luVar, @N List<df1> list) {
        this.f392495b.a(luVar, list);
        this.f392494a.a();
        this.f392496c.g();
        this.f392497d.a();
    }

    public final void a() {
        this.f392497d.c();
    }
}
