package com.my.target.nativeads;

import android.content.Context;
import com.my.target.X0;
import com.my.target.p1;
import e11.U1;
import e11.o2;
import f11.AbstractC40218a;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public final class h extends AbstractC40218a implements com.my.target.nativeads.b {

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Context f365008d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final h11.d f365009e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public o2 f365010f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public c f365011g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public a f365012h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public b f365013i;

    public interface a {
        void d(@P com.my.target.common.models.b bVar, boolean z12);
    }

    public interface b {
        void f(@N h hVar);

        void g(@N h hVar);

        boolean k();
    }

    public interface c {
        void a(@N String str);

        void b();

        void c();

        void e(@N k11.b bVar);
    }

    public interface d {
    }

    public h(int i12, @P h11.d dVar, @N Context context) {
        super(i12, "nativebanner");
        this.f365008d = context.getApplicationContext();
        this.f365009e = dVar;
    }

    public final void a() {
        if (this.f395641c.compareAndSet(false, true)) {
            p1.a aVar = this.f395640b;
            p1 p1VarA = aVar.a();
            X0 x02 = new X0(this.f395639a, aVar, null);
            x02.f364679d = new com.my.target.ads.a(this, 2);
            x02.a(p1VarA, this.f365008d);
        }
    }

    @Override // com.my.target.nativeads.b
    public final void j() {
        U1.b(this);
        o2 o2Var = this.f365010f;
        if (o2Var != null) {
            o2Var.j();
        }
    }
}
