package kotlinx.datetime.serializers;

import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.datetime.i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: DateTimeUnitSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/datetime/serializers/u;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/i$d;", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class u implements KSerializer<i.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final u f412671a = new u();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Object f412672b = C42727D.b(LazyThreadSafetyMode.f406615c, a.f412673l);

    /* compiled from: DateTimeUnitSerializers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SerialDescriptor> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f412673l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SerialDescriptor invoke() {
            return kotlinx.serialization.descriptors.n.b("kotlinx.datetime.MonthBased", new SerialDescriptor[0], t.f412670l);
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
        boolean z12 = false;
        int iQ2 = 0;
        while (true) {
            u uVar = f412671a;
            int iJ2 = cVarC.j(uVar.getF332717a());
            if (iJ2 == -1) {
                G0 g02 = G0.f406611a;
                cVarC.d(f332717a);
                if (z12) {
                    return new i.d(iQ2);
                }
                throw new MissingFieldException("months", getF332717a().getF412799a());
            }
            if (iJ2 != 0) {
                g.a(iJ2);
                throw null;
            }
            iQ2 = cVarC.q(uVar.getF332717a(), 0);
            z12 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return (SerialDescriptor) f412672b.getValue();
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
        dVarC.D(0, ((i.d) obj).f412493j, f412671a.getF332717a());
        dVarC.d(f332717a);
    }
}
