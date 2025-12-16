package kotlinx.datetime.serializers;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.AbstractC43321f;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/d;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/f;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d implements KSerializer<AbstractC43321f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f412635a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412636b = kotlinx.serialization.descriptors.n.b("kotlinx.datetime.DateTimePeriod", new SerialDescriptor[0], a.f412637l);

    /* compiled from: DateTimePeriodSerializers.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412637l = new a();

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

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.descriptors.f fVar = f412636b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        int iQ2 = 0;
        int iQ3 = 0;
        int iQ4 = 0;
        int iQ5 = 0;
        int iQ6 = 0;
        int iQ7 = 0;
        long jP2 = 0;
        while (true) {
            f412635a.getClass();
            int iJ2 = cVarC.j(fVar);
            switch (iJ2) {
                case -1:
                    AbstractC43321f abstractC43321fA = kotlinx.datetime.h.a(iQ2, iQ3, iQ4, iQ5, iQ6, jP2, iQ7);
                    cVarC.d(fVar);
                    return abstractC43321fA;
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
                    iQ5 = cVarC.q(fVar, 3);
                    break;
                case 4:
                    iQ6 = cVarC.q(fVar, 4);
                    break;
                case 5:
                    iQ7 = cVarC.q(fVar, 5);
                    break;
                case 6:
                    jP2 = cVarC.p(fVar, 6);
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
        return f412636b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC43321f abstractC43321f = (AbstractC43321f) obj;
        kotlinx.serialization.descriptors.f fVar = f412636b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        int i12 = abstractC43321f.i();
        d dVar = f412635a;
        if (i12 != 0) {
            dVar.getClass();
            dVarC.D(0, abstractC43321f.i(), fVar);
        }
        if (abstractC43321f.d() != 0) {
            dVar.getClass();
            dVarC.D(1, abstractC43321f.d(), fVar);
        }
        if (abstractC43321f.getF412481b() != 0) {
            dVar.getClass();
            dVarC.D(2, abstractC43321f.getF412481b(), fVar);
        }
        if (abstractC43321f.b() != 0) {
            dVar.getClass();
            dVarC.D(3, abstractC43321f.b(), fVar);
        }
        if (abstractC43321f.c() != 0) {
            dVar.getClass();
            dVarC.D(4, abstractC43321f.c(), fVar);
        }
        if (abstractC43321f.f() != 0) {
            dVar.getClass();
            dVarC.D(5, abstractC43321f.f(), fVar);
        }
        if (abstractC43321f.e() != 0) {
            dVar.getClass();
            dVarC.o(fVar, 6, abstractC43321f.e());
        }
        dVarC.d(fVar);
    }
}
