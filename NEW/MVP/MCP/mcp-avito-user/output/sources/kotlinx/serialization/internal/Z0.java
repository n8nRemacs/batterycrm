package kotlinx.serialization.internal;

import kotlin.C42829l0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/Z0;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/l0;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class Z0<A, B, C> implements KSerializer<C42829l0<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KSerializer<A> f412838a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final KSerializer<B> f412839b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final KSerializer<C> f412840c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.descriptors.f f412841d = kotlinx.serialization.descriptors.n.b("kotlin.Triple", new SerialDescriptor[0], new a(this));

    /* compiled from: Tuples.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"A", "B", "C", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<kotlinx.serialization.descriptors.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Z0<A, B, C> f412842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z0<A, B, C> z02) {
            super(1);
            this.f412842l = z02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            Z0<A, B, C> z02 = this.f412842l;
            kotlinx.serialization.descriptors.a.b(aVar2, "first", z02.f412838a.getF332717a());
            kotlinx.serialization.descriptors.a.b(aVar2, "second", z02.f412839b.getF332717a());
            kotlinx.serialization.descriptors.a.b(aVar2, "third", z02.f412840c.getF332717a());
            return kotlin.G0.f406611a;
        }
    }

    public Z0(@Y61.k KSerializer<A> kSerializer, @Y61.k KSerializer<B> kSerializer2, @Y61.k KSerializer<C> kSerializer3) {
        this.f412838a = kSerializer;
        this.f412839b = kSerializer2;
        this.f412840c = kSerializer3;
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.descriptors.f fVar = this.f412841d;
        kotlinx.serialization.encoding.c cVarC = decoder.c(fVar);
        Object obj = a1.f412843a;
        Object objV = obj;
        Object objV2 = objV;
        Object objV3 = objV2;
        while (true) {
            int iJ2 = cVarC.j(fVar);
            if (iJ2 == -1) {
                cVarC.d(fVar);
                if (objV == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objV2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objV3 != obj) {
                    return new C42829l0(objV, objV2, objV3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iJ2 == 0) {
                objV = cVarC.v(fVar, 0, this.f412838a, null);
            } else if (iJ2 == 1) {
                objV2 = cVarC.v(fVar, 1, this.f412839b, null);
            } else {
                if (iJ2 != 2) {
                    throw new SerializationException(AK.c.g(iJ2, "Unexpected index "));
                }
                objV3 = cVarC.v(fVar, 2, this.f412840c, null);
            }
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return this.f412841d;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        kotlinx.serialization.descriptors.f fVar = this.f412841d;
        kotlinx.serialization.encoding.d dVarC = encoder.c(fVar);
        dVarC.F(fVar, 0, this.f412838a, c42829l0.f406871b);
        dVarC.F(fVar, 1, this.f412839b, c42829l0.f406872c);
        dVarC.F(fVar, 2, this.f412840c, c42829l0.f406873d);
        dVarC.d(fVar);
    }
}
