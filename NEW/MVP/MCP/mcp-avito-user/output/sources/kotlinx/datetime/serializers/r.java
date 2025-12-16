package kotlinx.datetime.serializers;

import com.avito.android.remote.model.category_parameters.SelectionType;
import java.time.LocalTime;
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

/* compiled from: LocalTimeSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/r;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/w;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r implements KSerializer<kotlinx.datetime.w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final r f412665a = new r();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412666b = kotlinx.serialization.descriptors.n.b("kotlinx.datetime.LocalTime", new SerialDescriptor[0], a.f412667l);

    /* compiled from: LocalTimeSerializers.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412667l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            C42784z0 c42784z0 = C42784z0.f406748b;
            U0.f412820a.getClass();
            L0 l02 = U0.f412821b;
            aVar2.a(SelectionType.TYPE_HOUR, l02, c42784z0, false);
            aVar2.a(SelectionType.TYPE_MINUTE, l02, c42784z0, false);
            aVar2.a("second", l02, c42784z0, true);
            Y.f412835a.getClass();
            aVar2.a("nanosecond", Y.f412836b, c42784z0, true);
            return G0.f406611a;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.descriptors.f fVar = f412666b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        Short shValueOf = null;
        Short shValueOf2 = null;
        short sF2 = 0;
        int iQ2 = 0;
        while (true) {
            f412665a.getClass();
            int iJ2 = cVarC.j(fVar);
            if (iJ2 == -1) {
                if (shValueOf == null) {
                    throw new MissingFieldException(SelectionType.TYPE_HOUR, fVar.f412728a);
                }
                if (shValueOf2 == null) {
                    throw new MissingFieldException(SelectionType.TYPE_MINUTE, fVar.f412728a);
                }
                kotlinx.datetime.w wVar = new kotlinx.datetime.w(shValueOf.shortValue(), shValueOf2.shortValue(), sF2, iQ2);
                cVarC.d(fVar);
                return wVar;
            }
            if (iJ2 == 0) {
                shValueOf = Short.valueOf(cVarC.F(fVar, 0));
            } else if (iJ2 == 1) {
                shValueOf2 = Short.valueOf(cVarC.F(fVar, 1));
            } else if (iJ2 == 2) {
                sF2 = cVarC.F(fVar, 2);
            } else {
                if (iJ2 != 3) {
                    throw new SerializationException(AK.c.g(iJ2, "Unexpected index: "));
                }
                iQ2 = cVarC.q(fVar, 3);
            }
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412666b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.descriptors.f fVar = f412666b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        f412665a.getClass();
        LocalTime localTime = ((kotlinx.datetime.w) obj).f412684b;
        dVarC.n(fVar, 0, (short) localTime.getHour());
        dVarC.n(fVar, 1, (short) localTime.getMinute());
        if (localTime.getSecond() != 0 || localTime.getNano() != 0) {
            dVarC.n(fVar, 2, (short) localTime.getSecond());
            if (localTime.getNano() != 0) {
                dVarC.D(3, localTime.getNano(), fVar);
            }
        }
        dVarC.d(fVar);
    }
}
