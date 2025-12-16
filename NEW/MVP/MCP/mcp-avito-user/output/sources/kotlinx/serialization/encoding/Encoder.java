package kotlinx.serialization.encoding;

import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.x;

/* compiled from: Encoding.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Encoder {

    /* compiled from: Encoding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    d A(@k SerialDescriptor serialDescriptor);

    void B(double d12);

    @InterfaceC43387f
    void C();

    @InterfaceC43387f
    void E();

    @k
    /* renamed from: a */
    f getF413104e();

    void b(@k String str);

    @k
    d c(@k SerialDescriptor serialDescriptor);

    <T> void f(@k x<? super T> xVar, T t12);

    void g(@k SerialDescriptor serialDescriptor, int i12);

    @k
    Encoder h(@k SerialDescriptor serialDescriptor);

    void i(short s5);

    void j(boolean z12);

    void m(int i12);

    void r(long j12);

    void t(char c12);

    void w(byte b12);

    void y(float f12);
}
