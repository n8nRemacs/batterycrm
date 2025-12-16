package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: TypeBase.java */
/* loaded from: classes4.dex */
public abstract class l extends com.fasterxml.jackson.databind.h implements com.fasterxml.jackson.databind.k {

    /* renamed from: j, reason: collision with root package name */
    public static final m f342463j = m.f342469h;
    private static final long serialVersionUID = 1;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342464g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h[] f342465h;

    /* renamed from: i, reason: collision with root package name */
    public final m f342466i;

    public l(Class<?> cls, m mVar, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h[] hVarArr, int i12, Object obj, Object obj2, boolean z12) {
        super(cls, i12, obj, obj2, z12);
        this.f342466i = mVar == null ? f342463j : mVar;
        this.f342464g = hVar;
        this.f342465h = hVarArr;
    }

    public static void T(Class cls, StringBuilder sb2, boolean z12) {
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = name.charAt(i12);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb2.append(cCharAt);
            }
            if (z12) {
                sb2.append(';');
                return;
            }
            return;
        }
        if (cls == Boolean.TYPE) {
            sb2.append('Z');
            return;
        }
        if (cls == Byte.TYPE) {
            sb2.append('B');
            return;
        }
        if (cls == Short.TYPE) {
            sb2.append('S');
            return;
        }
        if (cls == Character.TYPE) {
            sb2.append('C');
            return;
        }
        if (cls == Integer.TYPE) {
            sb2.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb2.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb2.append('F');
        } else if (cls == Double.TYPE) {
            sb2.append('D');
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: ".concat(cls.getName()));
            }
            sb2.append('V');
        }
    }

    public final boolean U(int i12) {
        return this.f341930b.getTypeParameters().length == i12;
    }

    public String V() {
        return this.f341930b.getName();
    }

    @Override // com.fasterxml.jackson.databind.k
    public final void a(JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeId = new WritableTypeId(JsonToken.VALUE_STRING, this);
        oVar.e(jsonGenerator, writableTypeId);
        d(jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeId);
    }

    @Override // com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, A a12) {
        jsonGenerator.i0(V());
    }

    @Override // qX0.AbstractC47359a
    public final String g() {
        return V();
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h h(int i12) {
        return this.f342466i.d(i12);
    }

    @Override // com.fasterxml.jackson.databind.h
    public final int i() {
        return this.f342466i.f342471c.length;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final com.fasterxml.jackson.databind.h l(Class<?> cls) {
        com.fasterxml.jackson.databind.h hVarL;
        com.fasterxml.jackson.databind.h[] hVarArr;
        if (cls == this.f341930b) {
            return this;
        }
        if (cls.isInterface() && (hVarArr = this.f342465h) != null) {
            for (com.fasterxml.jackson.databind.h hVar : hVarArr) {
                com.fasterxml.jackson.databind.h hVarL2 = hVar.l(cls);
                if (hVarL2 != null) {
                    return hVarL2;
                }
            }
        }
        com.fasterxml.jackson.databind.h hVar2 = this.f342464g;
        if (hVar2 == null || (hVarL = hVar2.l(cls)) == null) {
            return null;
        }
        return hVarL;
    }

    @Override // com.fasterxml.jackson.databind.h
    public m m() {
        return this.f342466i;
    }

    @Override // com.fasterxml.jackson.databind.h
    public final List<com.fasterxml.jackson.databind.h> q() {
        com.fasterxml.jackson.databind.h[] hVarArr = this.f342465h;
        if (hVarArr == null) {
            return Collections.emptyList();
        }
        int length = hVarArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(hVarArr) : Collections.singletonList(hVarArr[0]) : Collections.emptyList();
    }

    @Override // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.h t() {
        return this.f342464g;
    }
}
