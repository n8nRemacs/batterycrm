package sX0;

import com.fasterxml.jackson.databind.introspect.AbstractC36463b;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.introspect.n;
import com.fasterxml.jackson.databind.introspect.o;
import com.fasterxml.jackson.databind.v;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* compiled from: Java7SupportImpl.java */
/* renamed from: sX0.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48126h extends AbstractC48125g {
    @Override // sX0.AbstractC48125g
    public final v a(n nVar) {
        ConstructorProperties constructorPropertiesC;
        o oVarQ = nVar.q();
        if (oVarQ == null || (constructorPropertiesC = oVarQ.c(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = constructorPropertiesC.value();
        int iP2 = nVar.p();
        if (iP2 < strArrValue.length) {
            return v.a(strArrValue[iP2]);
        }
        return null;
    }

    @Override // sX0.AbstractC48125g
    public final Boolean b(AbstractC36471j abstractC36471j) {
        Transient transientC = abstractC36471j.c(Transient.class);
        if (transientC != null) {
            return Boolean.valueOf(transientC.value());
        }
        return null;
    }

    @Override // sX0.AbstractC48125g
    public final Boolean c(AbstractC36463b abstractC36463b) {
        if (abstractC36463b.c(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
