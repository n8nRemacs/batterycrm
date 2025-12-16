package kotlinx.datetime.serializers;

import com.avito.android.remote.model.category_parameters.SelectionType;
import java.time.LocalDateTime;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;
import kotlinx.serialization.internal.U0;
import kotlinx.serialization.internal.Y;

/* compiled from: LocalDateTimeSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/p;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/t;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p implements KSerializer<kotlinx.datetime.t> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f412660a = new p();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412661b = kotlinx.serialization.descriptors.n.b("kotlinx.datetime.LocalDateTime", new SerialDescriptor[0], a.f412662l);

    /* compiled from: LocalDateTimeSerializers.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412662l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            C42784z0 c42784z0 = C42784z0.f406748b;
            Y.f412835a.getClass();
            L0 l02 = Y.f412836b;
            aVar2.a(SelectionType.TYPE_YEAR, l02, c42784z0, false);
            U0.f412820a.getClass();
            L0 l03 = U0.f412821b;
            aVar2.a(SelectionType.TYPE_MONTH, l03, c42784z0, false);
            aVar2.a(SelectionType.TYPE_DAY, l03, c42784z0, false);
            aVar2.a(SelectionType.TYPE_HOUR, l03, c42784z0, false);
            aVar2.a(SelectionType.TYPE_MINUTE, l03, c42784z0, false);
            aVar2.a("second", l03, c42784z0, true);
            aVar2.a("nanosecond", l02, c42784z0, true);
            return G0.f406611a;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.descriptors.f fVar = f412661b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        Integer numValueOf = null;
        short sF2 = 0;
        int iQ2 = 0;
        Short shValueOf = null;
        Short shValueOf2 = null;
        Short shValueOf3 = null;
        Short shValueOf4 = null;
        while (true) {
            f412660a.getClass();
            int iJ2 = cVarC.j(fVar);
            switch (iJ2) {
                case -1:
                    if (numValueOf == null) {
                        throw new MissingFieldException(SelectionType.TYPE_YEAR, fVar.f412728a);
                    }
                    if (shValueOf == null) {
                        throw new MissingFieldException(SelectionType.TYPE_MONTH, fVar.f412728a);
                    }
                    if (shValueOf2 == null) {
                        throw new MissingFieldException(SelectionType.TYPE_DAY, fVar.f412728a);
                    }
                    if (shValueOf3 == null) {
                        throw new MissingFieldException(SelectionType.TYPE_HOUR, fVar.f412728a);
                    }
                    if (shValueOf4 == null) {
                        throw new MissingFieldException(SelectionType.TYPE_MINUTE, fVar.f412728a);
                    }
                    kotlinx.datetime.t tVar = new kotlinx.datetime.t(numValueOf.intValue(), shValueOf.shortValue(), shValueOf2.shortValue(), shValueOf3.shortValue(), shValueOf4.shortValue(), sF2, iQ2);
                    cVarC.d(fVar);
                    return tVar;
                case 0:
                    numValueOf = Integer.valueOf(cVarC.q(fVar, 0));
                    break;
                case 1:
                    shValueOf = Short.valueOf(cVarC.F(fVar, 1));
                    break;
                case 2:
                    shValueOf2 = Short.valueOf(cVarC.F(fVar, 2));
                    break;
                case 3:
                    shValueOf3 = Short.valueOf(cVarC.F(fVar, 3));
                    break;
                case 4:
                    shValueOf4 = Short.valueOf(cVarC.F(fVar, 4));
                    break;
                case 5:
                    sF2 = cVarC.F(fVar, 5);
                    break;
                case 6:
                    iQ2 = cVarC.q(fVar, 6);
                    break;
                default:
                    throw new SerializationException(AK.c.g(iJ2, "Unexpected index: "));
            }
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412661b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.descriptors.f fVar = f412661b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        f412660a.getClass();
        LocalDateTime localDateTime = ((kotlinx.datetime.t) obj).f412681b;
        dVarC.D(0, localDateTime.getYear(), fVar);
        dVarC.n(fVar, 1, (short) localDateTime.getMonthValue());
        dVarC.n(fVar, 2, (short) localDateTime.getDayOfMonth());
        dVarC.n(fVar, 3, (short) localDateTime.getHour());
        dVarC.n(fVar, 4, (short) localDateTime.getMinute());
        if (localDateTime.getSecond() != 0 || localDateTime.getNano() != 0) {
            dVarC.n(fVar, 5, (short) localDateTime.getSecond());
            if (localDateTime.getNano() != 0) {
                dVarC.D(6, localDateTime.getNano(), fVar);
            }
        }
        dVarC.d(fVar);
    }
}
