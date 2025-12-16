package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.random.f;

/* compiled from: RandomFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/x0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36321x0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36321x0 f337142a = new C36321x0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337143b = "Random";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        long jM2;
        Long lU2 = mVar.u(zVar, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME);
        Long lU3 = mVar.u(zVar, "until");
        InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, "@randomNumber", C42745f0.U(lU2, lU3));
        if (!interfaceC36252bK.getF336616h()) {
            com.avito.beduin.v2.engine.core.z zVarG = interfaceC36252bK.g();
            try {
                if (lU2 != null) {
                    if (lU3 == null) {
                        StringBuilder sb2 = new StringBuilder("until and from in ");
                        f337142a.getClass();
                        sb2.append(f337143b);
                        sb2.append(" function must be specified together");
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    f.a aVar = kotlin.random.f.f406882b;
                    long jLongValue = lU2.longValue();
                    long jLongValue2 = lU3.longValue();
                    aVar.getClass();
                    jM2 = kotlin.random.f.f406883c.o(jLongValue, jLongValue2);
                } else if (lU3 != null) {
                    f.a aVar2 = kotlin.random.f.f406882b;
                    long jLongValue3 = lU3.longValue();
                    aVar2.getClass();
                    jM2 = kotlin.random.f.f406883c.n(jLongValue3);
                } else {
                    kotlin.random.f.f406882b.getClass();
                    jM2 = kotlin.random.f.f406883c.m();
                }
                interfaceC36252bK.l(C36273j.d(zVarG, jM2));
            } catch (Throwable th2) {
                interfaceC36252bK.l(null);
                throw th2;
            }
        }
        return (com.avito.beduin.v2.engine.field.entity.v) interfaceC36252bK.getF336702c();
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f337143b;
    }
}
