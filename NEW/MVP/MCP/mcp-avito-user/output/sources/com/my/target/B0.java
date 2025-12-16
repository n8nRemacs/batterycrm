package com.my.target;

import android.content.Context;
import com.my.target.mediation.e;
import com.my.target.p1;
import e11.C39864e1;
import e11.C39901r0;
import e11.W1;
import e11.e2;
import e11.k2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public abstract class B0<T extends com.my.target.mediation.e> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39901r0 f364334a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final p1.a f364335b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final e11.X0 f364336c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public T f364337d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public WeakReference<Context> f364338e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public W1 f364339f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public B0<T>.b f364340g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public String f364341h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public p1 f364342i;

    /* renamed from: j, reason: collision with root package name */
    public float f364343j;

    public static class a implements com.my.target.mediation.d {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f364344a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f364345b;

        /* renamed from: c, reason: collision with root package name */
        public final int f364346c;

        /* renamed from: d, reason: collision with root package name */
        public final int f364347d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        public final HashMap f364348e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        public final com.my.target.mediation.b f364349f;

        public a(@j.N String str, @j.P String str2, @j.N HashMap map, int i12, int i13, @j.P com.my.target.mediation.b bVar) {
            this.f364344a = str;
            this.f364345b = str2;
            this.f364348e = map;
            this.f364347d = i12;
            this.f364346c = i13;
            this.f364349f = bVar;
        }
    }

    public final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C39864e1 f364350b;

        public b(C39864e1 c39864e1) {
            this.f364350b = c39864e1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C39864e1 c39864e1 = this.f364350b;
            B0 b02 = B0.this;
            Context contextQ = b02.q();
            if (contextQ != null) {
                k2.a(contextQ, c39864e1.f394579d.e("networkTimeout"));
            }
            b02.h(c39864e1, false);
        }
    }

    public B0(@j.N e11.X0 x02, @j.N C39901r0 c39901r0, @j.N p1.a aVar) {
        this.f364336c = x02;
        this.f364334a = c39901r0;
        this.f364335b = aVar;
    }

    @j.P
    public final String c() {
        return this.f364341h;
    }

    public final float d() {
        return this.f364343j;
    }

    public abstract void e(@j.N T t12, @j.N C39864e1 c39864e1, @j.N Context context);

    public final void h(@j.N C39864e1 c39864e1, boolean z12) {
        B0<T>.b bVar = this.f364340g;
        if (bVar == null || bVar.f364350b != c39864e1) {
            return;
        }
        Context contextQ = q();
        p1 p1Var = this.f364342i;
        if (p1Var != null && contextQ != null) {
            p1Var.a(p1Var.f365072d, System.currentTimeMillis() - p1Var.f365071c);
            this.f364342i.b(contextQ);
        }
        W1 w12 = this.f364339f;
        if (w12 != null) {
            w12.b(this.f364340g);
            this.f364339f.close();
            this.f364339f = null;
        }
        this.f364340g = null;
        if (!z12) {
            r();
            return;
        }
        this.f364341h = c39864e1.f394576a;
        this.f364343j = c39864e1.f394584i;
        if (contextQ != null) {
            k2.a(contextQ, c39864e1.f394579d.e("networkFilled"));
        }
    }

    public abstract boolean i(@j.N com.my.target.mediation.e eVar);

    public final void n(@j.N Context context) {
        this.f364338e = new WeakReference<>(context);
        r();
    }

    public abstract void o();

    @j.N
    public abstract T p();

    @j.P
    public final Context q() {
        WeakReference<Context> weakReference = this.f364338e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void r() {
        T t12;
        T t13 = this.f364337d;
        if (t13 != null) {
            try {
                t13.destroy();
            } catch (Throwable th2) {
                th2.toString();
            }
            this.f364337d = null;
        }
        Context contextQ = q();
        if (contextQ == null) {
            return;
        }
        ArrayList<C39864e1> arrayList = this.f364336c.f394504a;
        C39864e1 c39864e1Remove = arrayList.isEmpty() ? null : arrayList.remove(0);
        if (c39864e1Remove == null) {
            o();
            return;
        }
        String str = c39864e1Remove.f394576a;
        if ("myTarget".equals(str)) {
            t12 = (T) p();
        } else {
            try {
                t12 = (T) Class.forName(c39864e1Remove.f394578c).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th3) {
                th3.toString();
                t12 = null;
            }
        }
        this.f364337d = t12;
        e2 e2Var = c39864e1Remove.f394579d;
        if (t12 == null || !i(t12)) {
            k2.a(contextQ, e2Var.e("networkAdapterInvalid"));
            r();
            return;
        }
        float f12 = c39864e1Remove.f394584i;
        p1.a aVar = this.f364335b;
        p1 p1Var = new p1(aVar.f365074a, str, 5);
        p1Var.f365073e = aVar.f365075b;
        p1Var.f365069a.put("priority", Float.valueOf(f12));
        this.f364342i = p1Var;
        W1 w12 = this.f364339f;
        if (w12 != null) {
            w12.close();
        }
        int i12 = c39864e1Remove.f394583h;
        if (i12 > 0) {
            this.f364340g = new b(c39864e1Remove);
            W1 w13 = new W1(i12);
            this.f364339f = w13;
            w13.a(this.f364340g);
        } else {
            this.f364340g = null;
        }
        k2.a(contextQ, e2Var.e("networkRequested"));
        e(this.f364337d, c39864e1Remove, contextQ);
    }
}
