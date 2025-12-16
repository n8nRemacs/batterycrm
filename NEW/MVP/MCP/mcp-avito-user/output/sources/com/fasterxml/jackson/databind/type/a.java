package com.fasterxml.jackson.databind.type;

import java.lang.reflect.Array;

/* compiled from: ArrayType.java */
/* loaded from: classes4.dex */
public final class a extends l {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f342446m = 0;
    private static final long serialVersionUID = 1;

    /* renamed from: k, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342447k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f342448l;

    public a(com.fasterxml.jackson.databind.h hVar, m mVar, Object obj, Object obj2, Object obj3, boolean z12) {
        super(obj.getClass(), mVar, null, null, hVar.f341931c, obj2, obj3, z12);
        this.f342447k = hVar;
        this.f342448l = obj;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean A() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean B() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h K(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h L(com.fasterxml.jackson.databind.h hVar) throws NegativeArraySizeException {
        return new a(hVar, this.f342466i, Array.newInstance(hVar.f341930b, 0), this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h N(Object obj) {
        com.fasterxml.jackson.databind.h hVar = this.f342447k;
        if (obj == hVar.f341933e) {
            return this;
        }
        return new a(hVar.R(obj), this.f342466i, this.f342448l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h O(com.fasterxml.jackson.databind.i iVar) {
        com.fasterxml.jackson.databind.h hVar = this.f342447k;
        if (iVar == hVar.f341932d) {
            return this;
        }
        return new a(hVar.S(iVar), this.f342466i, this.f342448l, this.f341932d, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h Q() {
        if (this.f341934f) {
            return this;
        }
        return new a(this.f342447k.Q(), this.f342466i, this.f342448l, this.f341932d, this.f341933e, true);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h R(Object obj) {
        if (obj == this.f341933e) {
            return this;
        }
        return new a(this.f342447k, this.f342466i, this.f342448l, this.f341932d, obj, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h S(Object obj) {
        if (obj == this.f341932d) {
            return this;
        }
        return new a(this.f342447k, this.f342466i, this.f342448l, obj, this.f341933e, this.f341934f);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f342447k.equals(((a) obj).f342447k);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h n() {
        return this.f342447k;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder o(StringBuilder sb2) {
        sb2.append('[');
        return this.f342447k.o(sb2);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final StringBuilder p(StringBuilder sb2) {
        sb2.append('[');
        return this.f342447k.p(sb2);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final String toString() {
        return "[array type, component type: " + this.f342447k + "]";
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean v() {
        return this.f342447k.v();
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean w() {
        return super.w() || this.f342447k.w();
    }

    @Override // com.fasterxml.jackson.databind.h
    public final boolean y() {
        return false;
    }
}
