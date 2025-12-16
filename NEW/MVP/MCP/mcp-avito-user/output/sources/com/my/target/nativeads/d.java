package com.my.target.nativeads;

import android.content.Context;
import com.my.target.X0;
import com.my.target.p1;
import e11.U1;
import e11.h2;
import f11.AbstractC40218a;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class d extends AbstractC40218a implements com.my.target.nativeads.b {

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Context f365000d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public h11.d f365001e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public h2 f365002f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public c f365003g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public a f365004h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public com.avito.android.advertising.loaders.my_target.i f365005i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public b f365006j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f365007k;

    public interface a {
        void f(@P com.my.target.common.models.b bVar, boolean z12);
    }

    public interface b {
        boolean k();

        void l(@N d dVar);

        void m(@N d dVar);
    }

    public interface c {
        void a(@N k11.c cVar, @N d dVar);

        void b();

        void c();

        void d();

        void e();

        void g(@N String str, @N d dVar);

        void onClick();
    }

    /* renamed from: com.my.target.nativeads.d$d, reason: collision with other inner class name */
    public interface InterfaceC10789d {
    }

    public d(int i12, @N Context context) {
        super(i12, "nativeads");
        this.f365007k = true;
        this.f365000d = context.getApplicationContext();
        this.f365001e = null;
    }

    @P
    public final k11.c a() {
        h2 h2Var = this.f365002f;
        if (h2Var == null) {
            return null;
        }
        return h2Var.g();
    }

    public final void b() {
        if (this.f395641c.compareAndSet(false, true)) {
            p1.a aVar = this.f395640b;
            p1 p1VarA = aVar.a();
            X0 x02 = new X0(this.f395639a, aVar, null);
            x02.f364679d = new com.my.target.ads.a(this, 1);
            x02.a(p1VarA, this.f365000d);
        }
    }

    @Override // com.my.target.nativeads.b
    public final void j() {
        U1.b(this);
        h2 h2Var = this.f365002f;
        if (h2Var != null) {
            h2Var.j();
        }
    }
}
