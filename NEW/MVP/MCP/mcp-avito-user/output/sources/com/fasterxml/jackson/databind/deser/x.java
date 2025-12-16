package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;
import lX0.AbstractC43699b;

/* compiled from: ValueInstantiator.java */
/* loaded from: classes4.dex */
public abstract class x {

    /* compiled from: ValueInstantiator.java */
    public static class b extends x implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final x f341908b;

        public b(x xVar) {
            this.f341908b = xVar;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final com.fasterxml.jackson.databind.introspect.o A() {
            return this.f341908b.A();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final com.fasterxml.jackson.databind.h B(com.fasterxml.jackson.databind.e eVar) {
            return this.f341908b.B(eVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final com.fasterxml.jackson.databind.introspect.o C() {
            return this.f341908b.C();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final com.fasterxml.jackson.databind.introspect.o E() {
            return this.f341908b.E();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final com.fasterxml.jackson.databind.h F(com.fasterxml.jackson.databind.e eVar) {
            return this.f341908b.F(eVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final v[] G(com.fasterxml.jackson.databind.e eVar) {
            return this.f341908b.G(eVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Class<?> H() {
            return this.f341908b.H();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean c() {
            return this.f341908b.c();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean d() {
            return this.f341908b.d();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean e() {
            return this.f341908b.e();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean f() {
            return this.f341908b.f();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean g() {
            return this.f341908b.g();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean h() {
            return this.f341908b.h();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean i() {
            return this.f341908b.i();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean k() {
            return this.f341908b.k();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean l() {
            return this.f341908b.l();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean m() {
            return this.f341908b.m();
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final x n(com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.f fVar) {
            x xVar = this.f341908b;
            x xVarN = xVar.n(bVar, fVar);
            return xVarN == xVar ? this : new b(xVarN);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object o(com.fasterxml.jackson.databind.f fVar, BigDecimal bigDecimal) {
            return this.f341908b.o(fVar, bigDecimal);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object p(com.fasterxml.jackson.databind.f fVar, BigInteger bigInteger) {
            return this.f341908b.p(fVar, bigInteger);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object q(com.fasterxml.jackson.databind.f fVar, boolean z12) {
            return this.f341908b.q(fVar, z12);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object r(com.fasterxml.jackson.databind.f fVar, double d12) {
            return this.f341908b.r(fVar, d12);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object s(com.fasterxml.jackson.databind.f fVar, int i12) {
            return this.f341908b.s(fVar, i12);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object t(com.fasterxml.jackson.databind.f fVar, long j12) {
            return this.f341908b.t(fVar, j12);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object u(com.fasterxml.jackson.databind.f fVar, v[] vVarArr, com.fasterxml.jackson.databind.deser.impl.y yVar) {
            return this.f341908b.u(fVar, vVarArr, yVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object v(com.fasterxml.jackson.databind.f fVar, Object[] objArr) {
            return this.f341908b.v(fVar, objArr);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object w(com.fasterxml.jackson.databind.f fVar, String str) {
            return this.f341908b.w(fVar, str);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object x(com.fasterxml.jackson.databind.f fVar, Object obj) {
            return this.f341908b.x(fVar, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object y(com.fasterxml.jackson.databind.f fVar) {
            return this.f341908b.y(fVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object z(com.fasterxml.jackson.databind.f fVar, Object obj) {
            return this.f341908b.z(fVar, obj);
        }
    }

    /* compiled from: ValueInstantiator.java */
    public interface c {
    }

    public com.fasterxml.jackson.databind.introspect.o A() {
        return null;
    }

    public com.fasterxml.jackson.databind.h B(com.fasterxml.jackson.databind.e eVar) {
        return null;
    }

    public com.fasterxml.jackson.databind.introspect.o C() {
        return null;
    }

    public com.fasterxml.jackson.databind.introspect.o E() {
        return null;
    }

    public com.fasterxml.jackson.databind.h F(com.fasterxml.jackson.databind.e eVar) {
        return null;
    }

    public v[] G(com.fasterxml.jackson.databind.e eVar) {
        return null;
    }

    public Class<?> H() {
        return Object.class;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this instanceof com.fasterxml.jackson.databind.deser.std.r;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean k() {
        return C() != null;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return k() || l() || i() || g() || h() || e() || f() || d() || c();
    }

    public Object o(com.fasterxml.jackson.databind.f fVar, BigDecimal bigDecimal) throws MismatchedInputException {
        fVar.y(H(), this, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
        throw null;
    }

    public Object p(com.fasterxml.jackson.databind.f fVar, BigInteger bigInteger) throws MismatchedInputException {
        fVar.y(H(), this, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
        throw null;
    }

    public Object q(com.fasterxml.jackson.databind.f fVar, boolean z12) throws MismatchedInputException {
        fVar.y(H(), this, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z12));
        throw null;
    }

    public Object r(com.fasterxml.jackson.databind.f fVar, double d12) throws MismatchedInputException {
        fVar.y(H(), this, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d12));
        throw null;
    }

    public Object s(com.fasterxml.jackson.databind.f fVar, int i12) throws MismatchedInputException {
        fVar.y(H(), this, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i12));
        throw null;
    }

    public Object t(com.fasterxml.jackson.databind.f fVar, long j12) throws MismatchedInputException {
        fVar.y(H(), this, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j12));
        throw null;
    }

    public Object u(com.fasterxml.jackson.databind.f fVar, v[] vVarArr, com.fasterxml.jackson.databind.deser.impl.y yVar) throws MismatchedInputException {
        int i12 = yVar.f341691e;
        Object[] objArr = yVar.f341690d;
        if (i12 > 0) {
            BitSet bitSet = yVar.f341693g;
            if (bitSet != null) {
                int length = objArr.length;
                int i13 = 0;
                while (true) {
                    int iNextClearBit = bitSet.nextClearBit(i13);
                    if (iNextClearBit >= length) {
                        break;
                    }
                    objArr[iNextClearBit] = yVar.a(vVarArr[iNextClearBit]);
                    i13 = iNextClearBit + 1;
                }
            } else {
                int i14 = yVar.f341692f;
                int length2 = objArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    if ((i14 & 1) == 0) {
                        objArr[i15] = yVar.a(vVarArr[i15]);
                    }
                    i15++;
                    i14 >>= 1;
                }
            }
        }
        DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES;
        com.fasterxml.jackson.databind.f fVar2 = yVar.f341688b;
        if (fVar2.O(deserializationFeature)) {
            for (int i16 = 0; i16 < vVarArr.length; i16++) {
                if (objArr[i16] == null) {
                    v vVar = vVarArr[i16];
                    fVar2.U(vVar, "Null value for creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", vVar.f341896d.f342656b, Integer.valueOf(vVar.m()));
                    throw null;
                }
            }
        }
        return v(fVar, objArr);
    }

    public Object v(com.fasterxml.jackson.databind.f fVar, Object[] objArr) throws MismatchedInputException {
        fVar.y(H(), this, "no creator with arguments specified", new Object[0]);
        throw null;
    }

    public Object w(com.fasterxml.jackson.databind.f fVar, String str) throws MismatchedInputException {
        Class<?> clsH = H();
        AbstractC43699b abstractC43699b = fVar.f341924g;
        fVar.y(clsH, this, "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
        throw null;
    }

    public Object x(com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException {
        fVar.y(H(), this, "no array delegate creator specified", new Object[0]);
        throw null;
    }

    public Object y(com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        fVar.y(H(), this, "no default no-arguments constructor found", new Object[0]);
        throw null;
    }

    public Object z(com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException {
        fVar.y(H(), this, "no delegate creator specified", new Object[0]);
        throw null;
    }

    /* compiled from: ValueInstantiator.java */
    public static class a extends x implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f341907b;

        public a(Class<?> cls) {
            this.f341907b = cls;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Class<?> H() {
            return this.f341907b;
        }

        public a(com.fasterxml.jackson.databind.h hVar) {
            this.f341907b = hVar.f341930b;
        }
    }

    public x n(com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.f fVar) {
        return this;
    }
}
