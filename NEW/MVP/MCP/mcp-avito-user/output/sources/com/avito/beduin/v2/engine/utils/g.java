package com.avito.beduin.v2.engine.utils;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StructureDataUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {
    public static final int a(@k A a12, @k z zVar, @k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = a12.f336778b.c(str);
            Integer numValueOf = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                numValueOf = Integer.valueOf(vVarQ.j());
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @k
    public static final String b(@k A a12, @k z zVar, @k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = a12.f336778b.c(str);
            String f336843b = null;
            if (dVarC != null && (vVarQ = dVarC.q(zVar)) != null) {
                f336843b = vVarQ.getF336843b();
            }
            if (f336843b != null) {
                return f336843b;
            }
            throw new IllegalArgumentException(("Property " + str + " is mandatory").toString());
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }

    @l
    public static final String c(@k A a12, @k z zVar, @k String str) throws BeduinPropertyException {
        v vVarQ;
        try {
            com.avito.beduin.v2.engine.field.d dVarC = a12.f336778b.c(str);
            if (dVarC == null || (vVarQ = dVarC.q(zVar)) == null) {
                return null;
            }
            return vVarQ.getF336843b();
        } catch (Exception e12) {
            throw new BeduinPropertyException(str, e12);
        }
    }
}
