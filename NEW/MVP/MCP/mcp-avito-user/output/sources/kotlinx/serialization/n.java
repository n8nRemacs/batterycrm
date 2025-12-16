package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractC43393b;
import kotlinx.serialization.internal.C43395c;

/* compiled from: PolymorphicSerializer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {
    @InterfaceC43389h
    @Y61.k
    public static final <T> InterfaceC43386e<T> a(@Y61.k AbstractC43393b<T> abstractC43393b, @Y61.k kotlinx.serialization.encoding.c cVar, @Y61.l String str) {
        InterfaceC43386e<T> interfaceC43386eA = abstractC43393b.a(cVar, str);
        if (interfaceC43386eA != null) {
            return interfaceC43386eA;
        }
        C43395c.a(str, abstractC43393b.c());
        throw null;
    }

    @InterfaceC43389h
    @Y61.k
    public static final <T> x<T> b(@Y61.k AbstractC43393b<T> abstractC43393b, @Y61.k Encoder encoder, @Y61.k T t12) {
        x<T> xVarB = abstractC43393b.b(encoder, t12);
        if (xVarB != null) {
            return xVarB;
        }
        kotlin.reflect.d dVarB = m0.f406844a.b(t12.getClass());
        kotlin.reflect.d<T> dVarC = abstractC43393b.c();
        String strL0 = dVarB.l0();
        if (strL0 == null) {
            strL0 = String.valueOf(dVarB);
        }
        C43395c.a(strL0, dVarC);
        throw null;
    }
}
