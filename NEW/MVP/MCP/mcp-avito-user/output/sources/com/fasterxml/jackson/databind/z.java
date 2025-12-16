package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.introspect.I;
import java.io.Serializable;
import oX0.AbstractC44703c;

/* compiled from: SerializationConfig.java */
/* loaded from: classes4.dex */
public final class z extends com.fasterxml.jackson.databind.cfg.m<SerializationFeature, z> implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final com.fasterxml.jackson.core.util.e f342659n = new com.fasterxml.jackson.core.util.e();

    /* renamed from: o, reason: collision with root package name */
    public static final int f342660o = com.fasterxml.jackson.databind.cfg.l.b(SerializationFeature.class);
    private static final long serialVersionUID = 1;

    /* renamed from: l, reason: collision with root package name */
    public final com.fasterxml.jackson.core.util.e f342661l;

    /* renamed from: m, reason: collision with root package name */
    public final int f342662m;

    public z(com.fasterxml.jackson.databind.cfg.a aVar, com.fasterxml.jackson.databind.jsontype.impl.n nVar, I i12, com.fasterxml.jackson.databind.util.y yVar, com.fasterxml.jackson.databind.cfg.f fVar) {
        super(aVar, nVar, i12, yVar, fVar);
        this.f342662m = f342660o;
        this.f342661l = f342659n;
    }

    public final void o(AbstractC44703c abstractC44703c) {
        int i12 = SerializationFeature.INDENT_OUTPUT.f341447c;
        int i13 = this.f342662m;
        if ((i12 & i13) != 0 && abstractC44703c.f341039b == null) {
            com.fasterxml.jackson.core.util.e eVarB = this.f342661l;
            if (eVarB != null) {
                eVarB = eVarB.b();
            }
            if (eVarB != null) {
                abstractC44703c.f341039b = eVarB;
            }
        }
        boolean z12 = (SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.f341447c & i13) != 0;
        if (z12) {
            int i14 = z12 ? JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.f341052c : 0;
            int i15 = i14;
            int i16 = abstractC44703c.f413834d;
            int i17 = (i15 & i14) | ((~i15) & i16);
            int i18 = i16 ^ i17;
            if (i18 != 0) {
                abstractC44703c.f413834d = i17;
                abstractC44703c.n0(i17, i18);
            }
        }
    }

    public final boolean p(SerializationFeature serializationFeature) {
        return (serializationFeature.f341447c & this.f342662m) != 0;
    }

    public z(z zVar, long j12, int i12) {
        super(zVar, j12);
        this.f342662m = i12;
        this.f342661l = zVar.f342661l;
    }
}
