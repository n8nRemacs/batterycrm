package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class qgb implements dh0 {
    public final hn5 a;
    public final CopyOnWriteArrayList b;
    public final pgb c;

    public qgb(Context context) {
        qr4 qr4Var = new qr4(2);
        qr4Var.c = new u4f(n7j.a(0.5d, 0.0d));
        qr4Var.b = 128000L;
        qr4Var.a = 3;
        k8f k8fVar = new k8f(qr4Var);
        fqb fqbVar = new fqb(10);
        Context applicationContext = context.getApplicationContext();
        new kr8();
        new ArrayList();
        new w4f();
        new ao6(4, (byte) 0);
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        this.a = new hn5(applicationContext, map, fqbVar, k8fVar);
        this.b = new CopyOnWriteArrayList();
        this.c = new pgb(this);
    }

    @Override // defpackage.dh0
    public final void a(nj4 nj4Var) {
        this.a.a(nj4Var);
    }

    @Override // defpackage.dh0
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.dh0
    public final wgg e() {
        return this.c;
    }

    @Override // defpackage.dh0
    public final long f() {
        return this.a.f();
    }

    @Override // defpackage.dh0
    public final void g(Handler handler, nj4 nj4Var) {
        this.a.g(handler, nj4Var);
    }
}
