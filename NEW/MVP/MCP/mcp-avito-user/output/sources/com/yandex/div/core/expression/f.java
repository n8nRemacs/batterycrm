package com.yandex.div.core.expression;

import com.yandex.div.core.expression.variables.k;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.j;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f367463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f367464c;

    public /* synthetic */ f(k kVar, int i12) {
        this.f367463b = i12;
        this.f367464c = kVar;
    }

    @Override // com.yandex.div.evaluable.j
    public final Object get(String str) {
        switch (this.f367463b) {
            case 0:
                C21.h hVarC = this.f367464c.c(str);
                if (hVarC == null) {
                    return null;
                }
                return hVarC.b();
            default:
                C21.h hVarC2 = this.f367464c.c(str);
                Object objB = hVarC2 == null ? null : hVarC2.b();
                if (objB != null) {
                    return objB;
                }
                throw new EvaluableException(L.j(str, "Unknown variable "), null, 2, null);
        }
    }
}
