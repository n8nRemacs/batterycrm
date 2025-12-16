package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.l;
import com.fasterxml.jackson.databind.introspect.C;
import com.fasterxml.jackson.databind.introspect.s;
import com.fasterxml.jackson.databind.introspect.t;
import com.fasterxml.jackson.databind.introspect.v;
import java.io.Serializable;
import java.util.TimeZone;

/* compiled from: MapperConfig.java */
/* loaded from: classes4.dex */
public abstract class l<T extends l<T>> implements v.a, Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final long f341505b;

    /* renamed from: c, reason: collision with root package name */
    public final a f341506c;

    static {
        JsonInclude.a aVar = JsonInclude.a.f340960f;
        JsonFormat.b bVar = JsonFormat.b.f340946i;
    }

    public l(a aVar, long j12) {
        this.f341506c = aVar;
        this.f341505b = j12;
    }

    public static <F extends Enum<F> & d> int b(Class<F> cls) {
        int iA2 = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            d dVar = (d) obj;
            if (dVar.b()) {
                iA2 |= dVar.a();
            }
        }
        return iA2;
    }

    public final com.fasterxml.jackson.databind.h c(Class<?> cls) {
        return this.f341506c.f341474b.l(cls);
    }

    public final AnnotationIntrospector d() {
        return k(MapperFeature.USE_ANNOTATIONS) ? this.f341506c.f341476d : C.f341938b;
    }

    public abstract JsonInclude.a e(Class<?> cls, Class<?> cls2);

    public abstract JsonFormat.b f(Class<?> cls);

    public abstract JsonInclude.a g(Class<?> cls);

    public final TimeZone h() {
        this.f341506c.getClass();
        return a.f341473j;
    }

    public final com.fasterxml.jackson.databind.b i(Class<?> cls) {
        com.fasterxml.jackson.databind.h hVarC = c(cls);
        this.f341506c.f341475c.getClass();
        s sVarB = t.b(this, hVarC);
        return sVarB == null ? s.v(hVarC, this, t.c(this, hVarC, this)) : sVarB;
    }

    public final boolean k(MapperFeature mapperFeature) {
        return (mapperFeature.f341412c & this.f341505b) != 0;
    }

    public l(m mVar, long j12) {
        this.f341506c = mVar.f341506c;
        this.f341505b = j12;
    }
}
