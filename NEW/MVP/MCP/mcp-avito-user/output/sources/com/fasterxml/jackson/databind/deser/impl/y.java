package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.impl.x;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import java.util.BitSet;

/* compiled from: PropertyValueBuffer.java */
/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final JsonParser f341687a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.f f341688b;

    /* renamed from: c, reason: collision with root package name */
    public final s f341689c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f341690d;

    /* renamed from: e, reason: collision with root package name */
    public int f341691e;

    /* renamed from: f, reason: collision with root package name */
    public int f341692f;

    /* renamed from: g, reason: collision with root package name */
    public final BitSet f341693g;

    /* renamed from: h, reason: collision with root package name */
    public x f341694h;

    /* renamed from: i, reason: collision with root package name */
    public Object f341695i;

    public y(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, int i12, s sVar) {
        this.f341687a = jsonParser;
        this.f341688b = fVar;
        this.f341691e = i12;
        this.f341689c = sVar;
        this.f341690d = new Object[i12];
        if (i12 < 32) {
            this.f341693g = null;
        } else {
            this.f341693g = new BitSet();
        }
    }

    public final Object a(com.fasterxml.jackson.databind.deser.v vVar) throws DatabindException {
        Object objO = vVar.o();
        com.fasterxml.jackson.databind.f fVar = this.f341688b;
        if (objO != null) {
            fVar.q(vVar.o(), vVar, null);
            throw null;
        }
        Boolean bool = vVar.f342100b.f342515b;
        boolean z12 = bool != null && bool.booleanValue();
        com.fasterxml.jackson.databind.v vVar2 = vVar.f341896d;
        if (z12) {
            fVar.U(vVar, "Missing required creator property '%s' (index %d)", vVar2.f342656b, Integer.valueOf(vVar.m()));
            throw null;
        }
        if (fVar.O(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            fVar.U(vVar, "Missing creator property '%s' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", vVar2.f342656b, Integer.valueOf(vVar.m()));
            throw null;
        }
        try {
            Object objB = vVar.f341901i.b(fVar);
            return objB != null ? objB : vVar.r().b(fVar);
        } catch (DatabindException e12) {
            AbstractC36471j abstractC36471jB = vVar.b();
            if (abstractC36471jB != null) {
                e12.e(abstractC36471jB.h(), vVar2.f342656b);
            }
            throw e12;
        }
    }

    public final boolean b(com.fasterxml.jackson.databind.deser.v vVar, Object obj) {
        int iM2 = vVar.m();
        this.f341690d[iM2] = obj;
        BitSet bitSet = this.f341693g;
        if (bitSet == null) {
            int i12 = this.f341692f;
            int i13 = (1 << iM2) | i12;
            if (i12 != i13) {
                this.f341692f = i13;
                int i14 = this.f341691e - 1;
                this.f341691e = i14;
                if (i14 <= 0) {
                    return this.f341689c == null || this.f341695i != null;
                }
            }
        } else if (!bitSet.get(iM2)) {
            bitSet.set(iM2);
            this.f341691e--;
        }
        return false;
    }

    public final void c(com.fasterxml.jackson.databind.deser.u uVar, String str, Object obj) {
        this.f341694h = new x.a(this.f341694h, obj, uVar, str);
    }

    public final void d(Object obj, Object obj2) {
        this.f341694h = new x.b(this.f341694h, obj2, obj);
    }

    public final void e(com.fasterxml.jackson.databind.deser.v vVar, Object obj) {
        this.f341694h = new x.c(this.f341694h, obj, vVar);
    }

    public final boolean f(String str) {
        s sVar = this.f341689c;
        if (sVar == null || !str.equals(sVar.f341667c.f342656b)) {
            return false;
        }
        this.f341695i = sVar.f341670f.e(this.f341687a, this.f341688b);
        return true;
    }
}
