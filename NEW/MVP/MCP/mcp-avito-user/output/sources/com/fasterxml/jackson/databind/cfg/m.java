package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.p;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.d;
import com.fasterxml.jackson.databind.cfg.e;
import com.fasterxml.jackson.databind.cfg.g;
import com.fasterxml.jackson.databind.cfg.m;
import com.fasterxml.jackson.databind.introspect.C36465d;
import com.fasterxml.jackson.databind.introspect.I;
import com.fasterxml.jackson.databind.introspect.L;
import com.fasterxml.jackson.databind.util.y;
import java.io.Serializable;

/* compiled from: MapperConfigBase.java */
/* loaded from: classes4.dex */
public abstract class m<CFG extends d, T extends m<CFG, T>> extends l<T> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final e f341507i = e.a.f341487b;

    /* renamed from: j, reason: collision with root package name */
    public static final long f341508j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f341509k;

    /* renamed from: d, reason: collision with root package name */
    public final I f341510d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.jsontype.impl.n f341511e;

    /* renamed from: f, reason: collision with root package name */
    public final g.a f341512f;

    /* renamed from: g, reason: collision with root package name */
    public final y f341513g;

    /* renamed from: h, reason: collision with root package name */
    public final f f341514h;

    static {
        long j12 = 0;
        for (MapperFeature mapperFeature : MapperFeature.values()) {
            if (mapperFeature.f341411b) {
                j12 |= mapperFeature.f341412c;
            }
        }
        f341508j = j12;
        f341509k = MapperFeature.AUTO_DETECT_FIELDS.f341412c | MapperFeature.AUTO_DETECT_GETTERS.f341412c | MapperFeature.AUTO_DETECT_IS_GETTERS.f341412c | MapperFeature.AUTO_DETECT_SETTERS.f341412c | MapperFeature.AUTO_DETECT_CREATORS.f341412c;
    }

    public m(a aVar, com.fasterxml.jackson.databind.jsontype.impl.n nVar, I i12, y yVar, f fVar) {
        super(aVar, f341508j);
        this.f341510d = i12;
        this.f341511e = nVar;
        this.f341513g = yVar;
        this.f341512f = g.a.f341491d;
        this.f341514h = fVar;
    }

    @Override // com.fasterxml.jackson.databind.introspect.v.a
    public final Class<?> a(Class<?> cls) {
        this.f341510d.getClass();
        return null;
    }

    @Override // com.fasterxml.jackson.databind.cfg.l
    public final JsonInclude.a e(Class<?> cls, Class<?> cls2) {
        l(cls2).getClass();
        JsonInclude.a aVarG = g(cls);
        if (aVarG == null) {
            return null;
        }
        return aVarG;
    }

    @Override // com.fasterxml.jackson.databind.cfg.l
    public final JsonFormat.b f(Class<?> cls) {
        this.f341514h.getClass();
        return JsonFormat.b.f340946i;
    }

    @Override // com.fasterxml.jackson.databind.cfg.l
    public final JsonInclude.a g(Class<?> cls) {
        l(cls).getClass();
        JsonInclude.a aVar = this.f341514h.f341488b;
        if (aVar == null) {
            return null;
        }
        return aVar;
    }

    public final e l(Class<?> cls) {
        this.f341514h.getClass();
        return f341507i;
    }

    public final p.a m(Class<?> cls, C36465d c36465d) {
        AnnotationIntrospector annotationIntrospectorD = d();
        p.a aVarJ = annotationIntrospectorD == null ? null : annotationIntrospectorD.J(c36465d);
        this.f341514h.getClass();
        p.a aVar = p.a.f340991g;
        if (aVarJ == null) {
            return null;
        }
        return aVarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final L<?> n(Class<?> cls, C36465d c36465d) {
        L bVar;
        boolean zW2 = com.fasterxml.jackson.databind.util.g.w(cls);
        f fVar = this.f341514h;
        if (zW2) {
            bVar = L.b.f341998h;
        } else {
            L.b bVar2 = fVar.f341490d;
            long j12 = this.f341505b;
            long j13 = f341509k;
            bVar = bVar2;
            if ((j12 & j13) != j13) {
                boolean zK2 = k(MapperFeature.AUTO_DETECT_FIELDS);
                JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.f340910d;
                L.b bVar3 = bVar2;
                if (!zK2) {
                    JsonAutoDetect.Visibility visibility2 = bVar2.f342003f;
                    bVar3 = bVar2;
                    if (visibility2 != visibility) {
                        bVar3 = new L.b(bVar2.f341999b, bVar2.f342000c, bVar2.f342001d, bVar2.f342002e, visibility);
                    }
                }
                L.b bVar4 = bVar3;
                if (!k(MapperFeature.AUTO_DETECT_GETTERS)) {
                    JsonAutoDetect.Visibility visibility3 = bVar3.f341999b;
                    bVar4 = bVar3;
                    if (visibility3 != visibility) {
                        bVar4 = new L.b(visibility, bVar3.f342000c, bVar3.f342001d, bVar3.f342002e, bVar3.f342003f);
                    }
                }
                L.b bVar5 = bVar4;
                if (!k(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
                    JsonAutoDetect.Visibility visibility4 = bVar4.f342000c;
                    bVar5 = bVar4;
                    if (visibility4 != visibility) {
                        bVar5 = new L.b(bVar4.f341999b, visibility, bVar4.f342001d, bVar4.f342002e, bVar4.f342003f);
                    }
                }
                L.b bVar6 = bVar5;
                if (!k(MapperFeature.AUTO_DETECT_SETTERS)) {
                    JsonAutoDetect.Visibility visibility5 = bVar5.f342001d;
                    bVar6 = bVar5;
                    if (visibility5 != visibility) {
                        bVar6 = new L.b(bVar5.f341999b, bVar5.f342000c, visibility, bVar5.f342002e, bVar5.f342003f);
                    }
                }
                bVar = bVar6;
                if (!k(MapperFeature.AUTO_DETECT_CREATORS)) {
                    JsonAutoDetect.Visibility visibility6 = bVar6.f342002e;
                    bVar = bVar6;
                    if (visibility6 != visibility) {
                        bVar = new L.b(bVar6.f341999b, bVar6.f342000c, bVar6.f342001d, visibility, bVar6.f342003f);
                    }
                }
            }
        }
        AnnotationIntrospector annotationIntrospectorD = d();
        L lB2 = bVar;
        if (annotationIntrospectorD != null) {
            lB2 = annotationIntrospectorD.b(c36465d, bVar);
        }
        fVar.getClass();
        return lB2;
    }

    public m(m<CFG, T> mVar, long j12) {
        super(mVar, j12);
        this.f341510d = mVar.f341510d;
        this.f341511e = mVar.f341511e;
        this.f341513g = mVar.f341513g;
        this.f341512f = mVar.f341512f;
        this.f341514h = mVar.f341514h;
    }
}
