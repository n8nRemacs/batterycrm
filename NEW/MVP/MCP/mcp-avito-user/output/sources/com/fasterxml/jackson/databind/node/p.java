package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonToken;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NodeCursor.java */
/* loaded from: classes4.dex */
abstract class p extends com.fasterxml.jackson.core.g {

    /* renamed from: c, reason: collision with root package name */
    public final p f342206c;

    /* renamed from: d, reason: collision with root package name */
    public String f342207d;

    /* renamed from: e, reason: collision with root package name */
    public Object f342208e;

    /* compiled from: NodeCursor.java */
    public static final class a extends p {

        /* renamed from: f, reason: collision with root package name */
        public final Iterator<com.fasterxml.jackson.databind.j> f342209f;

        /* renamed from: g, reason: collision with root package name */
        public com.fasterxml.jackson.databind.j f342210g;

        public a(com.fasterxml.jackson.databind.j jVar, p pVar) {
            super(1, pVar);
            this.f342209f = jVar.e();
        }

        @Override // com.fasterxml.jackson.databind.node.p, com.fasterxml.jackson.core.g
        public final com.fasterxml.jackson.core.g c() {
            return this.f342206c;
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final JsonToken i() {
            Iterator<com.fasterxml.jackson.databind.j> it = this.f342209f;
            if (!it.hasNext()) {
                this.f342210g = null;
                return JsonToken.END_ARRAY;
            }
            this.f341142b++;
            com.fasterxml.jackson.databind.j next = it.next();
            this.f342210g = next;
            return next.b();
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final a j() {
            return new a(this.f342210g, this);
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final b k() {
            return new b(this.f342210g, this);
        }
    }

    /* compiled from: NodeCursor.java */
    public static final class b extends p {

        /* renamed from: f, reason: collision with root package name */
        public final Iterator<Map.Entry<String, com.fasterxml.jackson.databind.j>> f342211f;

        /* renamed from: g, reason: collision with root package name */
        public Map.Entry<String, com.fasterxml.jackson.databind.j> f342212g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f342213h;

        public b(com.fasterxml.jackson.databind.j jVar, p pVar) {
            super(2, pVar);
            this.f342211f = ((t) jVar).f342216c.entrySet().iterator();
            this.f342213h = true;
        }

        @Override // com.fasterxml.jackson.databind.node.p, com.fasterxml.jackson.core.g
        public final com.fasterxml.jackson.core.g c() {
            return this.f342206c;
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final JsonToken i() {
            if (!this.f342213h) {
                this.f342213h = true;
                return this.f342212g.getValue().b();
            }
            Iterator<Map.Entry<String, com.fasterxml.jackson.databind.j>> it = this.f342211f;
            if (!it.hasNext()) {
                this.f342207d = null;
                this.f342212g = null;
                return JsonToken.END_OBJECT;
            }
            this.f341142b++;
            this.f342213h = false;
            Map.Entry<String, com.fasterxml.jackson.databind.j> next = it.next();
            this.f342212g = next;
            this.f342207d = next != null ? next.getKey() : null;
            return JsonToken.FIELD_NAME;
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final a j() {
            return new a(l(), this);
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final b k() {
            return new b(l(), this);
        }

        public final com.fasterxml.jackson.databind.j l() {
            Map.Entry<String, com.fasterxml.jackson.databind.j> entry = this.f342212g;
            if (entry == null) {
                return null;
            }
            return entry.getValue();
        }
    }

    /* compiled from: NodeCursor.java */
    public static final class c extends p {
        @Override // com.fasterxml.jackson.databind.node.p, com.fasterxml.jackson.core.g
        public final com.fasterxml.jackson.core.g c() {
            return this.f342206c;
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final JsonToken i() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final a j() {
            return new a(null, this);
        }

        @Override // com.fasterxml.jackson.databind.node.p
        public final b k() {
            return new b(null, this);
        }
    }

    public p(int i12, p pVar) {
        this.f341141a = i12;
        this.f341142b = -1;
        this.f342206c = pVar;
    }

    @Override // com.fasterxml.jackson.core.g
    public final String a() {
        return this.f342207d;
    }

    @Override // com.fasterxml.jackson.core.g
    public final Object b() {
        return this.f342208e;
    }

    @Override // com.fasterxml.jackson.core.g
    public com.fasterxml.jackson.core.g c() {
        return this.f342206c;
    }

    @Override // com.fasterxml.jackson.core.g
    public final void g(Object obj) {
        this.f342208e = obj;
    }

    public abstract JsonToken i();

    public abstract a j();

    public abstract b k();
}
