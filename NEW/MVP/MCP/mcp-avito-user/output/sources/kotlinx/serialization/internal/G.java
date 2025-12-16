package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: BuiltInSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/G;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/time/e;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes8.dex */
public final class G implements KSerializer<kotlin.time.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final G f412771a = new G();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f412772b = new L0("kotlin.time.Duration", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        e.a aVar = kotlin.time.e.f410651c;
        String strW = decoder.w();
        aVar.getClass();
        try {
            return kotlin.time.e.c(kotlin.time.g.a(strW));
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException(AK.c.k("Invalid ISO duration string format: '", strW, "'."), e12);
        }
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412772b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        long j12 = ((kotlin.time.e) obj).f410654b;
        e.a aVar = kotlin.time.e.f410651c;
        StringBuilder sb2 = new StringBuilder();
        if (j12 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jN2 = j12 < 0 ? kotlin.time.e.n(j12) : j12;
        long jL2 = kotlin.time.e.l(jN2, DurationUnit.f410636h);
        int iF2 = kotlin.time.e.f(jN2);
        int i12 = kotlin.time.e.i(jN2);
        int iH2 = kotlin.time.e.h(jN2);
        if (kotlin.time.e.j(j12)) {
            jL2 = 9999999999999L;
        }
        boolean z12 = false;
        boolean z13 = jL2 != 0;
        boolean z14 = (i12 == 0 && iH2 == 0) ? false : true;
        if (iF2 != 0 || (z14 && z13)) {
            z12 = true;
        }
        if (z13) {
            sb2.append(jL2);
            sb2.append('H');
        }
        if (z12) {
            sb2.append(iF2);
            sb2.append('M');
        }
        if (z14 || (!z13 && !z12)) {
            kotlin.time.e.b(sb2, i12, iH2, 9, "S", true);
        }
        encoder.b(sb2.toString());
    }
}
