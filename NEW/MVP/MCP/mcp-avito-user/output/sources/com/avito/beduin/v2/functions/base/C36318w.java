package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.text.C43059p;

/* compiled from: CheckRegexFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/w;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36318w extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36318w f337136a = new C36318w();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337137b = "CheckRegex";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, "value");
        if (strW == null) {
            strW = "";
        }
        try {
            com.avito.beduin.v2.engine.field.d dVarC = mVar.c("pattern");
            C43059p c43059p = null;
            if (dVarC != null) {
                com.avito.beduin.v2.engine.field.entity.v vVarQ = dVarC.q(zVar);
                String f336843b = vVarQ != null ? vVarQ.getF336843b() : null;
                if (f336843b != null) {
                    c43059p = new C43059p(f336843b);
                }
            }
            return C36273j.f(zVar, c43059p != null ? c43059p.a(strW) : true);
        } catch (Exception e12) {
            throw new BeduinPropertyException("pattern", e12);
        }
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337137b;
    }
}
