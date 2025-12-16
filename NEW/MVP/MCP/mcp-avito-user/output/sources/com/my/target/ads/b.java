package com.my.target.ads;

import android.content.Context;
import com.my.target.C37804p;
import com.my.target.k1;
import com.my.target.p1;
import e11.W0;
import f11.AbstractC40218a;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public abstract class b extends AbstractC40218a {

    /* renamed from: d, reason: collision with root package name */
    @N
    public final Context f364682d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public k1 f364683e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f364684f;

    public b(@N Context context, int i12, @N String str) {
        super(i12, str);
        this.f364684f = true;
        this.f364682d = context;
    }

    public void a() {
        k1 k1Var = this.f364683e;
        if (k1Var != null) {
            k1Var.destroy();
            this.f364683e = null;
        }
    }

    public abstract void b(@P W0 w02, @P String str);

    public final void c() {
        if (this.f395641c.compareAndSet(false, true)) {
            p1.a aVar = this.f395640b;
            p1 p1VarA = aVar.a();
            C37804p c37804p = new C37804p(this.f395639a, aVar, null);
            c37804p.f364679d = new a(this, 0);
            c37804p.a(p1VarA, this.f364682d);
        }
    }
}
