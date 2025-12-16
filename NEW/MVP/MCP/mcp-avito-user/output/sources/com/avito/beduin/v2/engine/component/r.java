package com.avito.beduin.v2.engine.component;

import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Reader.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/r;", "Lcom/avito/beduin/v2/engine/component/s;", "Lcom/avito/beduin/v2/engine/component/a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class r extends s implements InterfaceC36241a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36268a f336575b;

    public r(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k C36268a c36268a) {
        super(zVar);
        this.f336575b = c36268a;
        c36268a.f336782b.size();
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36241a
    @Y61.l
    public final <T> T i(int i12, @Y61.k String str, @Y61.k ZT0.a aVar, @Y61.k Y41.q<? super G, ? super InterfaceC36249i, ? super String, ? extends T> qVar) throws BeduinPropertyException {
        String strValueOf = String.valueOf(i12);
        try {
            return (T) s(this.f336575b.f336782b.get(i12), str, aVar, qVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(strValueOf, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36241a
    @Y61.l
    public final <T> T j(int i12, @Y61.k String str, @Y61.k Y41.q<? super G, ? super InterfaceC36249i, ? super String, ? extends T> qVar) throws BeduinPropertyException {
        String strValueOf = String.valueOf(i12);
        try {
            return (T) o(this.f336575b.f336782b.get(i12), str, qVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(strValueOf, e12);
        }
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36241a
    @Y61.l
    public final Object m(int i12, @Y61.k Y41.l lVar, @Y61.k String str) throws BeduinPropertyException {
        String strValueOf = String.valueOf(i12);
        try {
            return r(this.f336575b.f336782b.get(i12), str, lVar);
        } catch (Exception e12) {
            throw new BeduinPropertyException(strValueOf, e12);
        }
    }
}
