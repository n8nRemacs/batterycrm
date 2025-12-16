package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.lang.annotation.Annotation;
import java.util.EnumMap;
import java.util.EnumSet;

/* compiled from: ClassNameIdResolver.java */
/* loaded from: classes4.dex */
public class k extends r {

    /* renamed from: c, reason: collision with root package name */
    public final PolymorphicTypeValidator f342148c;

    public k(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.type.n nVar, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(hVar, nVar);
        this.f342148c = polymorphicTypeValidator;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public String a(Object obj) {
        return f(obj, obj.getClass(), this.f342171a);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.r, com.fasterxml.jackson.databind.jsontype.m
    public final String c() {
        return "class name used as type id";
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.r, com.fasterxml.jackson.databind.jsontype.m
    public final com.fasterxml.jackson.databind.h d(com.fasterxml.jackson.databind.f fVar, String str) {
        return g(fVar, str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public final String e(Class cls, Object obj) {
        return f(obj, cls, this.f342171a);
    }

    public final String f(Object obj, Class<?> cls, com.fasterxml.jackson.databind.type.n nVar) {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (!name.startsWith("java.util.")) {
            if (name.indexOf(36) < 0 || com.fasterxml.jackson.databind.util.g.r(cls) == null) {
                return name;
            }
            com.fasterxml.jackson.databind.h hVar = this.f342172b;
            return com.fasterxml.jackson.databind.util.g.r(hVar.f341930b) == null ? hVar.f341930b.getName() : name;
        }
        if (obj instanceof EnumSet) {
            return nVar.f(nVar.c(null, com.fasterxml.jackson.databind.util.g.m((EnumSet) obj), com.fasterxml.jackson.databind.type.n.f342487f), EnumSet.class).V();
        }
        if (!(obj instanceof EnumMap)) {
            return name;
        }
        Class<? extends Enum<?>> clsL = com.fasterxml.jackson.databind.util.g.l((EnumMap) obj);
        com.fasterxml.jackson.databind.type.m mVar = com.fasterxml.jackson.databind.type.n.f342487f;
        return nVar.i(EnumMap.class, nVar.c(null, clsL, mVar), nVar.c(null, Object.class, mVar)).V();
    }

    public com.fasterxml.jackson.databind.h g(com.fasterxml.jackson.databind.f fVar, String str) throws InvalidTypeIdException {
        com.fasterxml.jackson.databind.h hVarK;
        fVar.getClass();
        int iIndexOf = str.indexOf(60);
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.f342135b;
        PolymorphicTypeValidator.Validity validity2 = PolymorphicTypeValidator.Validity.f342136c;
        com.fasterxml.jackson.databind.h hVar = this.f342172b;
        PolymorphicTypeValidator polymorphicTypeValidator = this.f342148c;
        if (iIndexOf > 0) {
            str.substring(0, iIndexOf);
            PolymorphicTypeValidator.Validity validityB = polymorphicTypeValidator.b();
            if (validityB == validity2) {
                throw fVar.L(hVar, str, "Configured `PolymorphicTypeValidator` (of type " + com.fasterxml.jackson.databind.util.g.f(polymorphicTypeValidator) + ") denied resolution");
            }
            hVarK = fVar.e().g(str);
            if (!hVarK.I(hVar.f341930b)) {
                throw fVar.L(hVar, str, "Not a subtype");
            }
            if (validityB != validity && polymorphicTypeValidator.c() != validity) {
                throw fVar.L(hVar, str, "Configured `PolymorphicTypeValidator` (of type " + com.fasterxml.jackson.databind.util.g.f(polymorphicTypeValidator) + ") denied resolution");
            }
        } else {
            PolymorphicTypeValidator.Validity validityB2 = polymorphicTypeValidator.b();
            if (validityB2 == validity2) {
                throw fVar.L(hVar, str, "Configured `PolymorphicTypeValidator` (of type " + com.fasterxml.jackson.databind.util.g.f(polymorphicTypeValidator) + ") denied resolution");
            }
            try {
                fVar.e().getClass();
                Class<?> clsM = com.fasterxml.jackson.databind.type.n.m(str);
                if (!hVar.J(clsM)) {
                    throw fVar.L(hVar, str, "Not a subtype");
                }
                hVarK = fVar.f341921d.f341506c.f341474b.k(hVar, clsM, false);
                if (validityB2 == PolymorphicTypeValidator.Validity.f342137d && polymorphicTypeValidator.c() != validity) {
                    throw fVar.L(hVar, str, "Configured `PolymorphicTypeValidator` (of type " + com.fasterxml.jackson.databind.util.g.f(polymorphicTypeValidator) + ") denied resolution");
                }
            } catch (ClassNotFoundException unused) {
                hVarK = null;
            } catch (Exception e12) {
                throw fVar.L(hVar, str, androidx.compose.ui.graphics.colorspace.e.n("problem: (", e12.getClass().getName(), ") ", com.fasterxml.jackson.databind.util.g.i(e12)));
            }
        }
        if (hVarK != null) {
            return hVarK;
        }
        fVar.F(hVar, str, "no such class found");
        return null;
    }
}
