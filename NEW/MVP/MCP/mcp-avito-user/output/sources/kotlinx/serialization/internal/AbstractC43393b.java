package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: AbstractPolymorphicSerializer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/b;", "", "T", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* renamed from: kotlinx.serialization.internal.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43393b<T> implements KSerializer<T> {
    @Y61.l
    @InterfaceC43389h
    public InterfaceC43386e<T> a(@Y61.k kotlinx.serialization.encoding.c cVar, @Y61.l String str) {
        return cVar.getF412999b().c(str, c());
    }

    @Y61.l
    @InterfaceC43389h
    public kotlinx.serialization.x<T> b(@Y61.k Encoder encoder, @Y61.k T t12) {
        return encoder.getF413104e().d(c(), t12);
    }

    @Y61.k
    public abstract kotlin.reflect.d<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public final T deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        l0.h hVar = new l0.h();
        T t12 = null;
        while (true) {
            int iJ2 = cVarC.j(getF412706c());
            if (iJ2 == -1) {
                if (t12 != null) {
                    cVarC.d(f412706c);
                    return t12;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) hVar.f406842b)).toString());
            }
            if (iJ2 == 0) {
                hVar.f406842b = (T) cVarC.s(getF412706c(), iJ2);
            } else {
                if (iJ2 != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) hVar.f406842b;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iJ2);
                    throw new SerializationException(sb2.toString());
                }
                T t13 = hVar.f406842b;
                if (t13 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                hVar.f406842b = t13;
                t12 = (T) cVarC.v(getF412706c(), iJ2, kotlinx.serialization.n.a(this, cVarC, (String) t13), null);
            }
        }
    }

    @Override // kotlinx.serialization.x
    public final void serialize(@Y61.k Encoder encoder, @Y61.k T t12) {
        kotlinx.serialization.x<? super T> xVarB = kotlinx.serialization.n.b(this, encoder, t12);
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        dVarC.l(getF412706c(), 0, xVarB.getF412706c().getF412799a());
        dVarC.F(getF412706c(), 1, xVarB, t12);
        dVarC.d(f412706c);
    }
}
