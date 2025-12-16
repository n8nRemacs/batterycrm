package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.std.D;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36467f;
import com.fasterxml.jackson.databind.introspect.C36472k;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/* compiled from: StdKeyDeserializers.java */
/* loaded from: classes4.dex */
public class E implements com.fasterxml.jackson.databind.deser.r, Serializable {
    private static final long serialVersionUID = 1;

    public static D b(com.fasterxml.jackson.databind.e eVar, AbstractC36471j abstractC36471j) throws SecurityException {
        if (abstractC36471j instanceof C36467f) {
            Constructor<?> constructor = ((C36467f) abstractC36471j).f342035e;
            eVar.getClass();
            if (eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                com.fasterxml.jackson.databind.util.g.e(constructor, eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new D.c(constructor);
        }
        Method method = ((C36472k) abstractC36471j).f342054e;
        eVar.getClass();
        if (eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.fasterxml.jackson.databind.util.g.e(method, eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new D.d(method);
    }

    public static com.fasterxml.jackson.databind.m c(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.i iVar) {
        return new D.a(hVar.f341930b, iVar);
    }

    public static com.fasterxml.jackson.databind.m d(com.fasterxml.jackson.databind.util.j jVar) {
        return new D.b(jVar, null);
    }

    public static com.fasterxml.jackson.databind.m e(com.fasterxml.jackson.databind.util.j jVar, C36472k c36472k) {
        return new D.b(jVar, c36472k);
    }

    @Override // com.fasterxml.jackson.databind.deser.r
    public final com.fasterxml.jackson.databind.m a(com.fasterxml.jackson.databind.h hVar) {
        D.e eVar;
        int i12;
        Class<?> clsH = hVar.f341930b;
        if (clsH.isPrimitive()) {
            clsH = com.fasterxml.jackson.databind.util.g.H(clsH);
        }
        if (clsH == String.class || clsH == Object.class || clsH == CharSequence.class || clsH == Serializable.class) {
            if (clsH == String.class) {
                eVar = D.e.f341730e;
            } else {
                if (clsH != Object.class) {
                    return new D.e(clsH);
                }
                eVar = D.e.f341731f;
            }
            return eVar;
        }
        if (clsH == UUID.class) {
            i12 = 12;
        } else if (clsH == Integer.class) {
            i12 = 5;
        } else if (clsH == Long.class) {
            i12 = 6;
        } else if (clsH == Date.class) {
            i12 = 10;
        } else if (clsH == Calendar.class) {
            i12 = 11;
        } else if (clsH == Boolean.class) {
            i12 = 1;
        } else if (clsH == Byte.class) {
            i12 = 2;
        } else if (clsH == Character.class) {
            i12 = 4;
        } else if (clsH == Short.class) {
            i12 = 3;
        } else if (clsH == Float.class) {
            i12 = 7;
        } else if (clsH == Double.class) {
            i12 = 8;
        } else if (clsH == URI.class) {
            i12 = 13;
        } else if (clsH == URL.class) {
            i12 = 14;
        } else if (clsH == Class.class) {
            i12 = 15;
        } else {
            if (clsH == Locale.class) {
                return new D(9, clsH, p.v0(Locale.class));
            }
            if (clsH == Currency.class) {
                return new D(16, clsH, p.v0(Currency.class));
            }
            if (clsH != byte[].class) {
                return null;
            }
            i12 = 17;
        }
        return new D(i12, clsH, null);
    }
}
