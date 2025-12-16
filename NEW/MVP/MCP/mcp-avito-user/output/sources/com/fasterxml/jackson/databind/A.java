package com.fasterxml.jackson.databind;

import androidx.media3.common.C23088b;
import com.fasterxml.jackson.annotation.G;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.util.E;
import java.text.DateFormat;

/* compiled from: SerializerProvider.java */
/* loaded from: classes4.dex */
public abstract class A extends d {

    /* renamed from: l, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.ser.impl.c f341328l = new com.fasterxml.jackson.databind.ser.impl.c();

    /* renamed from: m, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.ser.impl.s f341329m = new com.fasterxml.jackson.databind.ser.impl.s();

    /* renamed from: b, reason: collision with root package name */
    public final z f341330b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.g f341331c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.q f341332d;

    /* renamed from: e, reason: collision with root package name */
    public transient com.fasterxml.jackson.databind.cfg.g f341333e;

    /* renamed from: f, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.impl.s f341334f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.std.w f341335g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.impl.c f341336h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.ser.impl.l f341337i;

    /* renamed from: j, reason: collision with root package name */
    public DateFormat f341338j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f341339k;

    public A() {
        this.f341334f = f341329m;
        this.f341335g = com.fasterxml.jackson.databind.ser.std.w.f342413d;
        this.f341336h = f341328l;
        this.f341330b = null;
        this.f341331c = null;
        this.f341332d = new com.fasterxml.jackson.databind.ser.q();
        this.f341337i = null;
        this.f341333e = null;
        this.f341339k = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> A(l<?> lVar, c cVar) {
        return (lVar == 0 || !(lVar instanceof com.fasterxml.jackson.databind.ser.j)) ? lVar : ((com.fasterxml.jackson.databind.ser.j) lVar).a(this, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<?> B(l<?> lVar, c cVar) {
        return (lVar == 0 || !(lVar instanceof com.fasterxml.jackson.databind.ser.j)) ? lVar : ((com.fasterxml.jackson.databind.ser.j) lVar).a(this, cVar);
    }

    public abstract Object C(Class cls);

    public abstract boolean E(Object obj);

    public final void F(b bVar, com.fasterxml.jackson.databind.introspect.u uVar, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder sbB = C23088b.b("Invalid definition for property ", d.b(uVar.getName()), " (of type ", com.fasterxml.jackson.databind.util.g.A(bVar.f341454a.f341930b), "): ");
        sbB.append(str);
        throw new InvalidDefinitionException(y(), sbB.toString());
    }

    public final void G(b bVar, String str, Object... objArr) throws InvalidDefinitionException {
        String strA = com.fasterxml.jackson.databind.util.g.A(bVar.f341454a.f341930b);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(y(), androidx.compose.ui.graphics.colorspace.e.n("Invalid type definition for type ", strA, ": ", str));
    }

    public abstract l<Object> H(AbstractC36463b abstractC36463b, Object obj);

    @Override // com.fasterxml.jackson.databind.d
    public final com.fasterxml.jackson.databind.cfg.l d() {
        return this.f341330b;
    }

    @Override // com.fasterxml.jackson.databind.d
    public final com.fasterxml.jackson.databind.type.n e() {
        return this.f341330b.f341506c.f341474b;
    }

    @Override // com.fasterxml.jackson.databind.d
    public final Object i(String str) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(y(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<Object> k(h hVar) throws JsonMappingException {
        try {
            l<Object> lVarI = this.f341331c.i(this, hVar);
            if (lVarI != 0) {
                com.fasterxml.jackson.databind.ser.q qVar = this.f341332d;
                synchronized (qVar) {
                    try {
                        if (qVar.f342331a.put(new E(hVar, false), lVarI) == null) {
                            qVar.f342332b.set(null);
                        }
                        if (lVarI instanceof com.fasterxml.jackson.databind.ser.p) {
                            ((com.fasterxml.jackson.databind.ser.p) lVarI).b(this);
                        }
                    } finally {
                    }
                }
            }
            return lVarI;
        } catch (IllegalArgumentException e12) {
            throw new JsonMappingException(y(), com.fasterxml.jackson.databind.util.g.i(e12), e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<Object> l(Class<?> cls) throws InvalidDefinitionException {
        h hVarC = this.f341330b.c(cls);
        try {
            l<Object> lVarI = this.f341331c.i(this, hVarC);
            if (lVarI != 0) {
                com.fasterxml.jackson.databind.ser.q qVar = this.f341332d;
                synchronized (qVar) {
                    try {
                        l<Object> lVarPut = qVar.f342331a.put(new E(false, (Class) cls), lVarI);
                        l<Object> lVarPut2 = qVar.f342331a.put(new E(hVarC, false), lVarI);
                        if (lVarPut == null || lVarPut2 == null) {
                            qVar.f342332b.set(null);
                        }
                        if (lVarI instanceof com.fasterxml.jackson.databind.ser.p) {
                            ((com.fasterxml.jackson.databind.ser.p) lVarI).b(this);
                        }
                    } finally {
                    }
                }
            }
            return lVarI;
        } catch (IllegalArgumentException e12) {
            i(com.fasterxml.jackson.databind.util.g.i(e12));
            throw null;
        }
    }

    public final DateFormat m() {
        DateFormat dateFormat = this.f341338j;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f341330b.f341506c.f341479g.clone();
        this.f341338j = dateFormat2;
        return dateFormat2;
    }

    public final h n(h hVar, Class<?> cls) {
        return hVar.x(cls) ? hVar : this.f341330b.f341506c.f341474b.k(hVar, cls, true);
    }

    public final void o(JsonGenerator jsonGenerator) {
        if (this.f341339k) {
            jsonGenerator.H();
        } else {
            this.f341335g.f(null, jsonGenerator, this);
        }
    }

    public final l<Object> p(h hVar, c cVar) {
        l<Object> lVarB = this.f341337i.b(hVar);
        return (lVarB == null && (lVarB = this.f341332d.a(hVar)) == null && (lVarB = k(hVar)) == null) ? z(hVar.f341930b) : B(lVarB, cVar);
    }

    public final l<Object> q(Class<?> cls, c cVar) {
        l<Object> lVarC = this.f341337i.c(cls);
        if (lVarC == null) {
            com.fasterxml.jackson.databind.ser.q qVar = this.f341332d;
            l<Object> lVarB = qVar.b(cls);
            if (lVarB == null) {
                lVarC = qVar.a(this.f341330b.c(cls));
                if (lVarC == null && (lVarC = l(cls)) == null) {
                    return z(cls);
                }
            } else {
                lVarC = lVarB;
            }
        }
        return B(lVarC, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l<Object> r(h hVar, c cVar) {
        l lVarB = this.f341331c.b(this, hVar);
        if (lVarB instanceof com.fasterxml.jackson.databind.ser.p) {
            ((com.fasterxml.jackson.databind.ser.p) lVarB).b(this);
        }
        return B(lVarB, cVar);
    }

    public abstract com.fasterxml.jackson.databind.ser.impl.x s(Object obj, G<?> g12);

    public final l<Object> t(h hVar, c cVar) {
        l<Object> lVarB = this.f341337i.b(hVar);
        return (lVarB == null && (lVarB = this.f341332d.a(hVar)) == null && (lVarB = k(hVar)) == null) ? z(hVar.f341930b) : A(lVarB, cVar);
    }

    public final l<Object> u(Class<?> cls, c cVar) {
        l<Object> lVarC = this.f341337i.c(cls);
        if (lVarC == null) {
            com.fasterxml.jackson.databind.ser.q qVar = this.f341332d;
            l<Object> lVarB = qVar.b(cls);
            if (lVarB == null) {
                lVarC = qVar.a(this.f341330b.c(cls));
                if (lVarC == null && (lVarC = l(cls)) == null) {
                    return z(cls);
                }
            } else {
                lVarC = lVarB;
            }
        }
        return A(lVarC, cVar);
    }

    public final l v(Class cls) {
        l<Object> lVar;
        l<Object> lVarA = this.f341337i.a(cls);
        if (lVarA != null) {
            return lVarA;
        }
        com.fasterxml.jackson.databind.ser.q qVar = this.f341332d;
        synchronized (qVar) {
            lVar = qVar.f342331a.get(new E(true, cls));
        }
        if (lVar != null) {
            return lVar;
        }
        l<Object> lVarX = x(cls, null);
        com.fasterxml.jackson.databind.ser.g gVar = this.f341331c;
        z zVar = this.f341330b;
        com.fasterxml.jackson.databind.jsontype.o oVarC = gVar.c(zVar, zVar.c(cls));
        if (oVarC != null) {
            lVarX = new com.fasterxml.jackson.databind.ser.impl.r(oVarC.a(null), lVarX);
        }
        com.fasterxml.jackson.databind.ser.q qVar2 = this.f341332d;
        synchronized (qVar2) {
            try {
                if (qVar2.f342331a.put(new E(true, cls), lVarX) == null) {
                    qVar2.f342332b.set(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVarX;
    }

    public final l<Object> w(h hVar, c cVar) throws JsonMappingException {
        if (hVar == null) {
            throw new JsonMappingException(y(), "Null passed for `valueType` of `findValueSerializer()`", (Throwable) null);
        }
        l<Object> lVarB = this.f341337i.b(hVar);
        return (lVarB == null && (lVarB = this.f341332d.a(hVar)) == null && (lVarB = k(hVar)) == null) ? z(hVar.f341930b) : B(lVarB, cVar);
    }

    public final l<Object> x(Class<?> cls, c cVar) {
        l<Object> lVarC = this.f341337i.c(cls);
        if (lVarC == null) {
            com.fasterxml.jackson.databind.ser.q qVar = this.f341332d;
            l<Object> lVarB = qVar.b(cls);
            if (lVarB == null) {
                lVarC = qVar.a(this.f341330b.c(cls));
                if (lVarC == null && (lVarC = l(cls)) == null) {
                    return z(cls);
                }
            } else {
                lVarC = lVarB;
            }
        }
        return B(lVarC, cVar);
    }

    public JsonGenerator y() {
        return null;
    }

    public final l<Object> z(Class<?> cls) {
        return cls == Object.class ? this.f341334f : new com.fasterxml.jackson.databind.ser.impl.s(cls, 0);
    }

    public A(k.a aVar, z zVar, com.fasterxml.jackson.databind.ser.g gVar) {
        this.f341334f = f341329m;
        this.f341335g = com.fasterxml.jackson.databind.ser.std.w.f342413d;
        com.fasterxml.jackson.databind.ser.impl.c cVar = f341328l;
        this.f341336h = cVar;
        this.f341331c = gVar;
        this.f341330b = zVar;
        com.fasterxml.jackson.databind.ser.q qVar = aVar.f341332d;
        this.f341332d = qVar;
        this.f341334f = aVar.f341334f;
        com.fasterxml.jackson.databind.ser.std.w wVar = aVar.f341335g;
        this.f341335g = wVar;
        this.f341336h = aVar.f341336h;
        this.f341339k = wVar == cVar;
        zVar.getClass();
        this.f341333e = zVar.f341512f;
        com.fasterxml.jackson.databind.ser.impl.l lVar = qVar.f342332b.get();
        if (lVar == null) {
            synchronized (qVar) {
                lVar = qVar.f342332b.get();
                if (lVar == null) {
                    com.fasterxml.jackson.databind.ser.impl.l lVar2 = new com.fasterxml.jackson.databind.ser.impl.l(qVar.f342331a);
                    qVar.f342332b.set(lVar2);
                    lVar = lVar2;
                }
            }
        }
        this.f341337i = lVar;
    }
}
