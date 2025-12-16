package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import rX0.InterfaceC47610a;

/* compiled from: StdValueInstantiator.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class H extends com.fasterxml.jackson.databind.deser.x implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f341733b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f341734c;

    /* renamed from: d, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341735d;

    /* renamed from: e, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341736e;

    /* renamed from: f, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.v[] f341737f;

    /* renamed from: g, reason: collision with root package name */
    public com.fasterxml.jackson.databind.h f341738g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341739h;

    /* renamed from: i, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.v[] f341740i;

    /* renamed from: j, reason: collision with root package name */
    public com.fasterxml.jackson.databind.h f341741j;

    /* renamed from: k, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341742k;

    /* renamed from: l, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.v[] f341743l;

    /* renamed from: m, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341744m;

    /* renamed from: n, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341745n;

    /* renamed from: o, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341746o;

    /* renamed from: p, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341747p;

    /* renamed from: q, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341748q;

    /* renamed from: r, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341749r;

    /* renamed from: s, reason: collision with root package name */
    public com.fasterxml.jackson.databind.introspect.o f341750s;

    public H(com.fasterxml.jackson.databind.h hVar) {
        this.f341733b = hVar == null ? "UNKNOWN TYPE" : hVar.toString();
        this.f341734c = hVar == null ? Object.class : hVar.f341930b;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.introspect.o A() {
        return this.f341742k;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.h B(com.fasterxml.jackson.databind.e eVar) {
        return this.f341741j;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.introspect.o C() {
        return this.f341735d;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.introspect.o E() {
        return this.f341739h;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.h F(com.fasterxml.jackson.databind.e eVar) {
        return this.f341738g;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final com.fasterxml.jackson.databind.deser.v[] G(com.fasterxml.jackson.databind.e eVar) {
        return this.f341737f;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Class<?> H() {
        return this.f341734c;
    }

    public final Object I(com.fasterxml.jackson.databind.introspect.o oVar, com.fasterxml.jackson.databind.deser.v[] vVarArr, com.fasterxml.jackson.databind.f fVar, Object obj) throws JsonMappingException {
        if (oVar == null) {
            throw new IllegalStateException("No delegate constructor for " + this.f341733b);
        }
        try {
            if (vVarArr == null) {
                return oVar.r(obj);
            }
            int length = vVarArr.length;
            Object[] objArr = new Object[length];
            for (int i12 = 0; i12 < length; i12++) {
                com.fasterxml.jackson.databind.deser.v vVar = vVarArr[i12];
                if (vVar != null) {
                    fVar.q(vVar.o(), vVar, null);
                    throw null;
                }
                objArr[i12] = obj;
            }
            return oVar.q(objArr);
        } catch (Throwable th2) {
            throw J(fVar, th2);
        }
    }

    public final JsonMappingException J(com.fasterxml.jackson.databind.f fVar, Throwable th2) {
        Throwable cause;
        if (((th2 instanceof ExceptionInInitializerError) || (th2 instanceof InvocationTargetException)) && (cause = th2.getCause()) != null) {
            th2 = cause;
        }
        return th2 instanceof JsonMappingException ? (JsonMappingException) th2 : fVar.K(this.f341734c, th2);
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean a() {
        return this.f341749r != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean b() {
        return this.f341747p != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean c() {
        return this.f341750s != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean d() {
        return this.f341748q != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean e() {
        return this.f341745n != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean f() {
        return this.f341746o != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean g() {
        return this.f341736e != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean h() {
        return this.f341744m != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean i() {
        return this.f341741j != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean k() {
        return this.f341735d != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean l() {
        return this.f341738g != null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final boolean m() {
        return k() || l() || i() || g() || h() || e() || f() || d() || c();
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object o(com.fasterxml.jackson.databind.f fVar, BigDecimal bigDecimal) throws ValueInstantiationException, MismatchedInputException {
        com.fasterxml.jackson.databind.introspect.o oVar = this.f341749r;
        if (oVar != null) {
            try {
                return oVar.r(bigDecimal);
            } catch (Throwable th2) {
                fVar.x(this.f341749r.h(), J(fVar, th2));
                throw null;
            }
        }
        if (this.f341748q != null) {
            double dDoubleValue = bigDecimal.doubleValue();
            Double dValueOf = Double.isInfinite(dDoubleValue) ? null : Double.valueOf(dDoubleValue);
            if (dValueOf != null) {
                try {
                    return this.f341748q.r(dValueOf);
                } catch (Throwable th3) {
                    fVar.x(this.f341748q.h(), J(fVar, th3));
                    throw null;
                }
            }
        }
        super.o(fVar, bigDecimal);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object p(com.fasterxml.jackson.databind.f fVar, BigInteger bigInteger) throws ValueInstantiationException, MismatchedInputException {
        com.fasterxml.jackson.databind.introspect.o oVar = this.f341747p;
        if (oVar == null) {
            super.p(fVar, bigInteger);
            throw null;
        }
        try {
            return oVar.r(bigInteger);
        } catch (Throwable th2) {
            fVar.x(this.f341747p.h(), J(fVar, th2));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object q(com.fasterxml.jackson.databind.f fVar, boolean z12) throws ValueInstantiationException, MismatchedInputException {
        if (this.f341750s == null) {
            super.q(fVar, z12);
            throw null;
        }
        try {
            return this.f341750s.r(Boolean.valueOf(z12));
        } catch (Throwable th2) {
            fVar.x(this.f341750s.h(), J(fVar, th2));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object r(com.fasterxml.jackson.databind.f fVar, double d12) throws ValueInstantiationException, MismatchedInputException {
        if (this.f341748q != null) {
            try {
                return this.f341748q.r(Double.valueOf(d12));
            } catch (Throwable th2) {
                fVar.x(this.f341748q.h(), J(fVar, th2));
                throw null;
            }
        }
        if (this.f341749r == null) {
            super.r(fVar, d12);
            throw null;
        }
        try {
            return this.f341749r.r(BigDecimal.valueOf(d12));
        } catch (Throwable th3) {
            fVar.x(this.f341749r.h(), J(fVar, th3));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object s(com.fasterxml.jackson.databind.f fVar, int i12) throws ValueInstantiationException, MismatchedInputException {
        if (this.f341745n != null) {
            try {
                return this.f341745n.r(Integer.valueOf(i12));
            } catch (Throwable th2) {
                fVar.x(this.f341745n.h(), J(fVar, th2));
                throw null;
            }
        }
        if (this.f341746o != null) {
            try {
                return this.f341746o.r(Long.valueOf(i12));
            } catch (Throwable th3) {
                fVar.x(this.f341746o.h(), J(fVar, th3));
                throw null;
            }
        }
        if (this.f341747p == null) {
            super.s(fVar, i12);
            throw null;
        }
        try {
            return this.f341747p.r(BigInteger.valueOf(i12));
        } catch (Throwable th4) {
            fVar.x(this.f341747p.h(), J(fVar, th4));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object t(com.fasterxml.jackson.databind.f fVar, long j12) throws ValueInstantiationException, MismatchedInputException {
        if (this.f341746o != null) {
            try {
                return this.f341746o.r(Long.valueOf(j12));
            } catch (Throwable th2) {
                fVar.x(this.f341746o.h(), J(fVar, th2));
                throw null;
            }
        }
        if (this.f341747p == null) {
            super.t(fVar, j12);
            throw null;
        }
        try {
            return this.f341747p.r(BigInteger.valueOf(j12));
        } catch (Throwable th3) {
            fVar.x(this.f341747p.h(), J(fVar, th3));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object v(com.fasterxml.jackson.databind.f fVar, Object[] objArr) throws ValueInstantiationException, MismatchedInputException {
        com.fasterxml.jackson.databind.introspect.o oVar = this.f341736e;
        if (oVar == null) {
            super.v(fVar, objArr);
            throw null;
        }
        try {
            return oVar.q(objArr);
        } catch (Exception e12) {
            fVar.x(this.f341734c, J(fVar, e12));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object w(com.fasterxml.jackson.databind.f fVar, String str) throws ValueInstantiationException, MismatchedInputException {
        com.fasterxml.jackson.databind.introspect.o oVar = this.f341744m;
        if (oVar == null) {
            super.w(fVar, str);
            throw null;
        }
        try {
            return oVar.r(str);
        } catch (Throwable th2) {
            fVar.x(this.f341744m.h(), J(fVar, th2));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object x(com.fasterxml.jackson.databind.f fVar, Object obj) {
        com.fasterxml.jackson.databind.introspect.o oVar = this.f341742k;
        return (oVar != null || this.f341739h == null) ? I(oVar, this.f341743l, fVar, obj) : z(fVar, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object y(com.fasterxml.jackson.databind.f fVar) throws ValueInstantiationException, MismatchedInputException {
        com.fasterxml.jackson.databind.introspect.o oVar = this.f341735d;
        if (oVar == null) {
            super.y(fVar);
            throw null;
        }
        try {
            return oVar.p();
        } catch (Exception e12) {
            fVar.x(this.f341734c, J(fVar, e12));
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.x
    public final Object z(com.fasterxml.jackson.databind.f fVar, Object obj) {
        com.fasterxml.jackson.databind.introspect.o oVar;
        com.fasterxml.jackson.databind.introspect.o oVar2 = this.f341739h;
        return (oVar2 != null || (oVar = this.f341742k) == null) ? I(oVar2, this.f341740i, fVar, obj) : I(oVar, this.f341743l, fVar, obj);
    }
}
