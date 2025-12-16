package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.ser.std.C36479e;
import com.fasterxml.jackson.databind.ser.std.C36482h;
import com.fasterxml.jackson.databind.ser.std.C36483i;
import com.fasterxml.jackson.databind.ser.std.C36485k;
import com.fasterxml.jackson.databind.ser.std.C36489o;
import com.fasterxml.jackson.databind.ser.std.C36492s;
import com.fasterxml.jackson.databind.ser.std.H;
import com.fasterxml.jackson.databind.ser.std.I;
import com.fasterxml.jackson.databind.ser.std.M;
import com.fasterxml.jackson.databind.ser.std.N;
import com.fasterxml.jackson.databind.ser.std.Q;
import com.fasterxml.jackson.databind.ser.std.T;
import com.fasterxml.jackson.databind.ser.std.U;
import com.fasterxml.jackson.databind.ser.std.w;
import com.fasterxml.jackson.databind.ser.std.x;
import com.fasterxml.jackson.databind.ser.std.y;
import com.fasterxml.jackson.databind.util.C;
import com.fasterxml.jackson.databind.z;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: BasicSerializerFactory.java */
/* loaded from: classes4.dex */
public abstract class b extends r implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap<String, com.fasterxml.jackson.databind.l<?>> f342232c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap<String, Class<? extends com.fasterxml.jackson.databind.l<?>>> f342233d;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.q f342234b = new com.fasterxml.jackson.databind.cfg.q();

    /* compiled from: BasicSerializerFactory.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342235a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f342236b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f342236b = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342236b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342236b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342236b[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342236b[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f342236b[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            f342235a = iArr2;
            try {
                iArr2[8] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f342235a[4] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f342235a[3] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends com.fasterxml.jackson.databind.l<?>>> map = new HashMap<>();
        HashMap<String, com.fasterxml.jackson.databind.l<?>> map2 = new HashMap<>();
        map2.put(String.class.getName(), new N());
        Q q12 = Q.f342354d;
        map2.put(StringBuffer.class.getName(), q12);
        map2.put(StringBuilder.class.getName(), q12);
        map2.put(Character.class.getName(), q12);
        map2.put(Character.TYPE.getName(), q12);
        map2.put(Integer.class.getName(), new y.f(Integer.class));
        Class cls = Integer.TYPE;
        map2.put(cls.getName(), new y.f(cls));
        map2.put(Long.class.getName(), new y.g(Long.class));
        Class cls2 = Long.TYPE;
        map2.put(cls2.getName(), new y.g(cls2));
        String name = Byte.class.getName();
        y.e eVar = y.e.f342417d;
        map2.put(name, eVar);
        map2.put(Byte.TYPE.getName(), eVar);
        String name2 = Short.class.getName();
        y.h hVar = y.h.f342418d;
        map2.put(name2, hVar);
        map2.put(Short.TYPE.getName(), hVar);
        map2.put(Double.class.getName(), new y.c(Double.class));
        Class cls3 = Double.TYPE;
        map2.put(cls3.getName(), new y.c(cls3));
        String name3 = Float.class.getName();
        y.d dVar = y.d.f342416d;
        map2.put(name3, dVar);
        map2.put(Float.TYPE.getName(), dVar);
        map2.put(Boolean.TYPE.getName(), new C36479e(true));
        map2.put(Boolean.class.getName(), new C36479e(false));
        map2.put(BigInteger.class.getName(), new x(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new x(BigDecimal.class));
        map2.put(Calendar.class.getName(), C36482h.f342378g);
        map2.put(Date.class.getName(), C36485k.f342379g);
        HashMap map3 = new HashMap();
        map3.put(URL.class, new Q(URL.class, 0));
        map3.put(URI.class, new Q(URI.class, 0));
        map3.put(Currency.class, new Q(Currency.class, 0));
        map3.put(UUID.class, new U());
        map3.put(Pattern.class, new Q(Pattern.class, 0));
        map3.put(Locale.class, new Q(Locale.class, 0));
        map3.put(AtomicBoolean.class, I.a.class);
        map3.put(AtomicInteger.class, I.b.class);
        map3.put(AtomicLong.class, I.c.class);
        map3.put(File.class, C36489o.class);
        map3.put(Class.class, C36483i.class);
        w wVar = w.f342413d;
        map3.put(Void.class, wVar);
        map3.put(Void.TYPE, wVar);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof com.fasterxml.jackson.databind.l) {
                map2.put(((Class) entry.getKey()).getName(), (com.fasterxml.jackson.databind.l) value);
            } else {
                map.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        map.put(C.class.getName(), T.class);
        f342232c = map2;
        f342233d = map;
    }

    public static JsonInclude.a a(A a12, com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.h hVar, Class cls) {
        z zVar = a12.f341330b;
        JsonInclude.a aVarK = bVar.k(zVar.f341514h.f341488b);
        zVar.l(cls).getClass();
        zVar.l(hVar.f341930b).getClass();
        return aVarK;
    }

    public static com.fasterxml.jackson.databind.l e(A a12, AbstractC36463b abstractC36463b) {
        z zVar = a12.f341330b;
        Object objY = zVar.d().Y(abstractC36463b);
        if (objY == null) {
            return null;
        }
        com.fasterxml.jackson.databind.l<Object> lVarH = a12.H(abstractC36463b, objY);
        Object objU = zVar.d().U(abstractC36463b);
        com.fasterxml.jackson.databind.util.i iVarC = objU != null ? a12.c(objU) : null;
        return iVarC == null ? lVarH : new H(iVarC, iVarC.b(a12.e()), lVarH);
    }

    public static boolean f(z zVar, com.fasterxml.jackson.databind.b bVar) {
        JsonSerialize.Typing typingX = zVar.d().X(bVar.m());
        return (typingX == null || typingX == JsonSerialize.Typing.f341452d) ? zVar.k(MapperFeature.USE_STATIC_TYPING) : typingX == JsonSerialize.Typing.f341451c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l b(com.fasterxml.jackson.databind.A r10, com.fasterxml.jackson.databind.h r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.b.b(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.h):com.fasterxml.jackson.databind.l");
    }

    public final com.fasterxml.jackson.databind.jsontype.o c(z zVar, com.fasterxml.jackson.databind.h hVar) {
        ArrayList arrayList;
        com.fasterxml.jackson.databind.introspect.s sVar = (com.fasterxml.jackson.databind.introspect.s) zVar.i(hVar.f341930b);
        AnnotationIntrospector annotationIntrospectorD = zVar.d();
        C36465d c36465d = sVar.f342086e;
        com.fasterxml.jackson.databind.jsontype.n nVarC0 = annotationIntrospectorD.c0(hVar, zVar, c36465d);
        if (nVarC0 == null) {
            zVar.f341506c.getClass();
            arrayList = null;
            nVarC0 = null;
        } else {
            zVar.f341511e.getClass();
            AnnotationIntrospector annotationIntrospectorD2 = zVar.d();
            HashMap map = new HashMap();
            com.fasterxml.jackson.databind.jsontype.impl.n.a(c36465d, new com.fasterxml.jackson.databind.jsontype.j(c36465d.f342008c, null), zVar, annotationIntrospectorD2, map);
            arrayList = new ArrayList(map.values());
        }
        if (nVarC0 == null) {
            return null;
        }
        return nVarC0.a(zVar, hVar, arrayList);
    }

    public final M d(A a12, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.b bVar) throws SecurityException {
        if (com.fasterxml.jackson.databind.k.class.isAssignableFrom(hVar.f341930b)) {
            return com.fasterxml.jackson.databind.ser.std.C.f342342d;
        }
        AbstractC36471j abstractC36471jH = bVar.h();
        if (abstractC36471jH == null) {
            return null;
        }
        z zVar = a12.f341330b;
        zVar.getClass();
        if (zVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            com.fasterxml.jackson.databind.util.g.e(abstractC36471jH.k(), zVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        com.fasterxml.jackson.databind.h hVarF = abstractC36471jH.f();
        com.fasterxml.jackson.databind.l lVarE = e(a12, abstractC36471jH);
        if (lVarE == null) {
            lVarE = (com.fasterxml.jackson.databind.l) hVarF.f341932d;
        }
        com.fasterxml.jackson.databind.jsontype.o oVarC = (com.fasterxml.jackson.databind.jsontype.o) hVarF.f341933e;
        if (oVarC == null) {
            oVarC = c(zVar, hVarF);
        }
        return new C36492s(abstractC36471jH, oVarC, lVarE);
    }
}
