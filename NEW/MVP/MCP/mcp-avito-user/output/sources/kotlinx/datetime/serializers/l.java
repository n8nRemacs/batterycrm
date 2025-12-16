package kotlinx.datetime.serializers;

import java.time.Instant;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.L0;

/* compiled from: InstantSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/l;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/l;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l implements KSerializer<kotlinx.datetime.l> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final l f412650a = new l();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412651b = kotlinx.serialization.descriptors.n.b("kotlinx.datetime.Instant", new SerialDescriptor[0], a.f412652l);

    /* compiled from: InstantSerializers.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412652l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            C42784z0 c42784z0 = C42784z0.f406748b;
            C43412k0.f412877a.getClass();
            L0 l02 = C43412k0.f412878b;
            aVar2.a("epochSeconds", l02, c42784z0, false);
            aVar2.a("nanosecondsOfSecond", l02, c42784z0, true);
            return G0.f406611a;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) throws Exception {
        kotlinx.serialization.descriptors.f fVar = f412651b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        Long lValueOf = null;
        int iQ2 = 0;
        while (true) {
            f412650a.getClass();
            int iJ2 = cVarC.j(fVar);
            if (iJ2 == -1) {
                if (lValueOf == null) {
                    throw new MissingFieldException("epochSeconds", fVar.f412728a);
                }
                l.Companion companion = kotlinx.datetime.l.INSTANCE;
                long jLongValue = lValueOf.longValue();
                companion.getClass();
                kotlinx.datetime.l lVarA = l.Companion.a(iQ2, jLongValue);
                cVarC.d(fVar);
                return lVarA;
            }
            if (iJ2 == 0) {
                lValueOf = Long.valueOf(cVarC.p(fVar, 0));
            } else {
                if (iJ2 != 1) {
                    throw new SerializationException(AK.c.g(iJ2, "Unexpected index: "));
                }
                iQ2 = cVarC.q(fVar, 1);
            }
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412651b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.descriptors.f fVar = f412651b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        f412650a.getClass();
        Instant instant = ((kotlinx.datetime.l) obj).f412618b;
        dVarC.o(fVar, 0, instant.getEpochSecond());
        if (instant.getNano() != 0) {
            dVarC.D(1, instant.getNano(), fVar);
        }
        dVarC.d(fVar);
    }
}
