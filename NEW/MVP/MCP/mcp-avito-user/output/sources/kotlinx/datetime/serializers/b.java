package kotlinx.datetime.serializers;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.C43320e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.L0;
import kotlinx.serialization.internal.Y;

/* compiled from: DateTimePeriodSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/b;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/e;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b implements KSerializer<C43320e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f412630a = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412631b = kotlinx.serialization.descriptors.n.b("kotlinx.datetime.DatePeriod", new SerialDescriptor[0], a.f412632l);

    /* compiled from: DateTimePeriodSerializers.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412632l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            C42784z0 c42784z0 = C42784z0.f406748b;
            Y.f412835a.getClass();
            L0 l02 = Y.f412836b;
            aVar2.a("years", l02, c42784z0, true);
            aVar2.a("months", l02, c42784z0, true);
            aVar2.a("days", l02, c42784z0, true);
            aVar2.a("hours", l02, c42784z0, true);
            aVar2.a("minutes", l02, c42784z0, true);
            aVar2.a("seconds", l02, c42784z0, true);
            C43412k0.f412877a.getClass();
            aVar2.a("nanoseconds", C43412k0.f412878b, c42784z0, true);
            return G0.f406611a;
        }
    }

    public static void a(long j12, String str) {
        if (j12 == 0) {
            return;
        }
        throw new SerializationException("DatePeriod should have non-date components be zero, but got " + j12 + " in '" + str + '\'');
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.descriptors.f fVar = f412631b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        int iQ2 = 0;
        int iQ3 = 0;
        int iQ4 = 0;
        while (true) {
            f412630a.getClass();
            int iJ2 = cVarC.j(fVar);
            switch (iJ2) {
                case -1:
                    C43320e c43320e = new C43320e(iQ2, iQ3, iQ4);
                    cVarC.d(fVar);
                    return c43320e;
                case 0:
                    iQ2 = cVarC.q(fVar, 0);
                    break;
                case 1:
                    iQ3 = cVarC.q(fVar, 1);
                    break;
                case 2:
                    iQ4 = cVarC.q(fVar, 2);
                    break;
                case 3:
                    a(cVarC.q(fVar, 3), "hours");
                    break;
                case 4:
                    a(cVarC.q(fVar, 4), "minutes");
                    break;
                case 5:
                    a(cVarC.q(fVar, 5), "seconds");
                    break;
                case 6:
                    a(cVarC.p(fVar, 6), "nanoseconds");
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
        return f412631b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        C43320e c43320e = (C43320e) obj;
        kotlinx.serialization.descriptors.f fVar = f412631b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        if (c43320e.i() != 0) {
            d.f412635a.getClass();
            dVarC.D(0, c43320e.i(), d.f412636b);
        }
        if (c43320e.d() != 0) {
            d.f412635a.getClass();
            dVarC.D(1, c43320e.d(), d.f412636b);
        }
        int i12 = c43320e.f412316b;
        if (i12 != 0) {
            d.f412635a.getClass();
            dVarC.D(2, i12, d.f412636b);
        }
        dVarC.d(fVar);
    }
}
