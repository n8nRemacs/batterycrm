package kotlinx.datetime.serializers;

import com.avito.android.remote.model.category_parameters.SelectionType;
import java.time.LocalDate;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;
import kotlinx.serialization.internal.U0;
import kotlinx.serialization.internal.Y;

/* compiled from: LocalDateSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/n;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/q;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n implements KSerializer<kotlinx.datetime.q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final n f412655a = new n();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412656b = kotlinx.serialization.descriptors.n.b("kotlinx.datetime.LocalDate", new SerialDescriptor[0], a.f412657l);

    /* compiled from: LocalDateSerializers.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412657l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            C42784z0 c42784z0 = C42784z0.f406748b;
            Y.f412835a.getClass();
            aVar2.a(SelectionType.TYPE_YEAR, Y.f412836b, c42784z0, false);
            U0.f412820a.getClass();
            L0 l02 = U0.f412821b;
            aVar2.a(SelectionType.TYPE_MONTH, l02, c42784z0, false);
            aVar2.a(SelectionType.TYPE_DAY, l02, c42784z0, false);
            return G0.f406611a;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.descriptors.f fVar = f412656b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        Integer numValueOf = null;
        Short shValueOf = null;
        Short shValueOf2 = null;
        while (true) {
            f412655a.getClass();
            int iJ2 = cVarC.j(fVar);
            if (iJ2 == -1) {
                if (numValueOf == null) {
                    throw new MissingFieldException(SelectionType.TYPE_YEAR, fVar.f412728a);
                }
                if (shValueOf == null) {
                    throw new MissingFieldException(SelectionType.TYPE_MONTH, fVar.f412728a);
                }
                if (shValueOf2 == null) {
                    throw new MissingFieldException(SelectionType.TYPE_DAY, fVar.f412728a);
                }
                kotlinx.datetime.q qVar = new kotlinx.datetime.q(numValueOf.intValue(), shValueOf.shortValue(), shValueOf2.shortValue());
                cVarC.d(fVar);
                return qVar;
            }
            if (iJ2 == 0) {
                numValueOf = Integer.valueOf(cVarC.q(fVar, 0));
            } else if (iJ2 == 1) {
                shValueOf = Short.valueOf(cVarC.F(fVar, 1));
            } else {
                if (iJ2 != 2) {
                    g.a(iJ2);
                    throw null;
                }
                shValueOf2 = Short.valueOf(cVarC.F(fVar, 2));
            }
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f412656b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.descriptors.f fVar = f412656b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        f412655a.getClass();
        LocalDate localDate = ((kotlinx.datetime.q) obj).f412619b;
        dVarC.D(0, localDate.getYear(), fVar);
        dVarC.n(fVar, 1, (short) localDate.getMonthValue());
        dVarC.n(fVar, 2, (short) localDate.getDayOfMonth());
        dVarC.d(fVar);
    }
}
