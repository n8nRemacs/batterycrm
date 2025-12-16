package kotlinx.serialization.encoding;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.I0;
import kotlinx.serialization.modules.f;

/* compiled from: Decoding.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/c;", "", "a", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: Decoding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/encoding/c$a;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: Decoding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    boolean D(@k SerialDescriptor serialDescriptor, int i12);

    short F(@k SerialDescriptor serialDescriptor, int i12);

    @k
    /* renamed from: a */
    f getF413093d();

    void d(@k SerialDescriptor serialDescriptor);

    @InterfaceC43387f
    @l
    <T> T f(@k SerialDescriptor serialDescriptor, int i12, @k InterfaceC43386e<? extends T> interfaceC43386e, @l T t12);

    int j(@k SerialDescriptor serialDescriptor);

    float k(@k SerialDescriptor serialDescriptor, int i12);

    double l(@k SerialDescriptor serialDescriptor, int i12);

    char o(@k I0 i02, int i12);

    long p(@k SerialDescriptor serialDescriptor, int i12);

    int q(@k SerialDescriptor serialDescriptor, int i12);

    @k
    String s(@k SerialDescriptor serialDescriptor, int i12);

    <T> T v(@k SerialDescriptor serialDescriptor, int i12, @k InterfaceC43386e<? extends T> interfaceC43386e, @l T t12);

    @k
    Decoder x(@k I0 i02, int i12);

    byte y(@k I0 i02, int i12);
}
