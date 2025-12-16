package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.util.InterfaceC36495a;
import com.fasterxml.jackson.databind.util.z;

/* compiled from: AttributePropertyWriter.java */
/* loaded from: classes4.dex */
public class a extends com.fasterxml.jackson.databind.ser.t {
    private static final long serialVersionUID = 1;

    /* renamed from: u, reason: collision with root package name */
    public final String f342264u;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, z zVar, InterfaceC36495a interfaceC36495a, com.fasterxml.jackson.databind.h hVar) {
        JsonInclude.Include include;
        Object obj;
        JsonInclude.Include include2 = JsonInclude.Include.f340958f;
        JsonInclude.Include include3 = JsonInclude.Include.f340954b;
        JsonInclude.a aVar = zVar.f342653g;
        boolean z12 = false;
        if (aVar != null && (include = aVar.f340961b) != include3 && include != include2) {
            z12 = true;
        }
        boolean z13 = z12;
        if (aVar == null) {
            obj = Boolean.FALSE;
        } else {
            JsonInclude.Include include4 = aVar.f340961b;
            obj = (include4 == include3 || include4 == JsonInclude.Include.f340955c || include4 == include2) ? null : JsonInclude.Include.f340956d;
        }
        super(zVar, zVar.f342650d, interfaceC36495a, hVar, null, null, null, z13, obj, null);
        this.f342264u = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.t
    public final Object n(A a12) {
        return a12.f341333e.a(this.f342264u);
    }

    @Override // com.fasterxml.jackson.databind.ser.t
    public final com.fasterxml.jackson.databind.ser.t o() {
        throw new IllegalStateException("Should not be called on this type");
    }
}
