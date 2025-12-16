package kotlinx.serialization.encoding;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.f;

/* compiled from: Decoding.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Decoder {

    /* compiled from: Decoding.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    Decoder A(@k SerialDescriptor serialDescriptor);

    float B();

    boolean C();

    @InterfaceC43387f
    boolean E();

    @k
    /* renamed from: a */
    f getF413093d();

    @k
    c c(@k SerialDescriptor serialDescriptor);

    double g();

    int h(@k SerialDescriptor serialDescriptor);

    <T> T m(@k InterfaceC43386e<? extends T> interfaceC43386e);

    byte n();

    long r();

    short t();

    char u();

    @k
    String w();

    int z();
}
