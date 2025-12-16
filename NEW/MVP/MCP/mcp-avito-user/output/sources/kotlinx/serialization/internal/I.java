package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Enums.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/I;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class I<T extends Enum<T>> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T[] f412779a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f412780b;

    /* compiled from: Enums.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<SerialDescriptor> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I<T> f412781l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f412782m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I<T> i12, String str) {
            super(0);
            this.f412781l = i12;
            this.f412782m = str;
        }

        @Override // Y41.a
        public final SerialDescriptor invoke() {
            I<T> i12 = this.f412781l;
            i12.getClass();
            T[] tArr = i12.f412779a;
            EnumDescriptor enumDescriptor = new EnumDescriptor(this.f412782m, tArr.length);
            for (T t12 : tArr) {
                enumDescriptor.j(t12.name(), false);
            }
            return enumDescriptor;
        }
    }

    public I(@Y61.k String str, @Y61.k T[] tArr) {
        this.f412779a = tArr;
        this.f412780b = C42727D.c(new a(this, str));
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        int iH2 = decoder.h(getF332717a());
        T[] tArr = this.f412779a;
        if (iH2 >= 0 && iH2 < tArr.length) {
            return tArr[iH2];
        }
        throw new SerializationException(iH2 + " is not among valid " + getF332717a().getF412799a() + " enum values, values size is " + tArr.length);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return (SerialDescriptor) this.f412780b.getValue();
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        Enum r52 = (Enum) obj;
        T[] tArr = this.f412779a;
        int iH2 = C42756l.H(r52, tArr);
        if (iH2 != -1) {
            encoder.g(getF332717a(), iH2);
            return;
        }
        throw new SerializationException(r52 + " is not a valid enum " + getF332717a().getF412799a() + ", must be one of " + Arrays.toString(tArr));
    }

    @Y61.k
    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getF332717a().getF412799a() + '>';
    }
}
