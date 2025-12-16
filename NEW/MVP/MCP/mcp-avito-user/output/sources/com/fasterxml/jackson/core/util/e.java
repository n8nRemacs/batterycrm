package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Serializable;
import oX0.AbstractC44703c;

/* compiled from: DefaultPrettyPrinter.java */
/* loaded from: classes3.dex */
public class e implements com.fasterxml.jackson.core.k, f<e>, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.io.n f341294i = new com.fasterxml.jackson.core.io.n(" ");
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final a f341295b;

    /* renamed from: c, reason: collision with root package name */
    public final d f341296c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.n f341297d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f341298e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f341299f;

    /* renamed from: g, reason: collision with root package name */
    public final o f341300g;

    /* renamed from: h, reason: collision with root package name */
    public final String f341301h;

    /* compiled from: DefaultPrettyPrinter.java */
    public static class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f341302b = new a();
    }

    /* compiled from: DefaultPrettyPrinter.java */
    public interface b {
    }

    /* compiled from: DefaultPrettyPrinter.java */
    public static class c implements b, Serializable {
        static {
            new c();
        }
    }

    public e() {
        com.fasterxml.jackson.core.io.n nVar = f341294i;
        this.f341295b = a.f341302b;
        this.f341296c = d.f341290f;
        this.f341298e = true;
        this.f341297d = nVar;
        o oVar = com.fasterxml.jackson.core.k.f341213d2;
        this.f341300g = oVar;
        oVar.getClass();
        this.f341301h = " : ";
    }

    @Override // com.fasterxml.jackson.core.k
    public final void a(AbstractC44703c abstractC44703c) {
        com.fasterxml.jackson.core.io.n nVar = this.f341297d;
        if (nVar != null) {
            abstractC44703c.W(nVar);
        }
    }

    @Override // com.fasterxml.jackson.core.util.f
    public final e b() {
        if (getClass() == e.class) {
            return new e(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    @Override // com.fasterxml.jackson.core.k
    public final void c(AbstractC44703c abstractC44703c) {
        this.f341295b.getClass();
        abstractC44703c.U(' ');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void d(AbstractC44703c abstractC44703c) {
        this.f341295b.getClass();
        abstractC44703c.U('[');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void e(AbstractC44703c abstractC44703c, int i12) {
        this.f341295b.getClass();
        if (i12 > 0) {
            abstractC44703c.U(' ');
        } else {
            abstractC44703c.U(' ');
        }
        abstractC44703c.U(']');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void f(AbstractC44703c abstractC44703c, int i12) {
        d dVar = this.f341296c;
        dVar.getClass();
        int i13 = this.f341299f - 1;
        this.f341299f = i13;
        if (i12 > 0) {
            dVar.a(abstractC44703c, i13);
        } else {
            abstractC44703c.U(' ');
        }
        abstractC44703c.U('}');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void g(AbstractC44703c abstractC44703c) {
        if (this.f341298e) {
            abstractC44703c.X(this.f341301h);
        } else {
            this.f341300g.getClass();
            abstractC44703c.U(':');
        }
    }

    @Override // com.fasterxml.jackson.core.k
    public final void h(AbstractC44703c abstractC44703c) {
        abstractC44703c.U('{');
        this.f341296c.getClass();
        this.f341299f++;
    }

    @Override // com.fasterxml.jackson.core.k
    public final void i(JsonGenerator jsonGenerator) {
        this.f341296c.a(jsonGenerator, this.f341299f);
    }

    @Override // com.fasterxml.jackson.core.k
    public final void k(AbstractC44703c abstractC44703c) {
        this.f341300g.getClass();
        abstractC44703c.U(',');
        this.f341296c.a(abstractC44703c, this.f341299f);
    }

    @Override // com.fasterxml.jackson.core.k
    public final void l(AbstractC44703c abstractC44703c) {
        this.f341300g.getClass();
        abstractC44703c.U(',');
        this.f341295b.getClass();
        abstractC44703c.U(' ');
    }

    public e(e eVar) {
        com.fasterxml.jackson.core.io.n nVar = eVar.f341297d;
        this.f341295b = a.f341302b;
        this.f341296c = d.f341290f;
        this.f341298e = true;
        this.f341295b = eVar.f341295b;
        this.f341296c = eVar.f341296c;
        this.f341298e = eVar.f341298e;
        this.f341299f = eVar.f341299f;
        this.f341300g = eVar.f341300g;
        this.f341301h = eVar.f341301h;
        this.f341297d = nVar;
    }
}
