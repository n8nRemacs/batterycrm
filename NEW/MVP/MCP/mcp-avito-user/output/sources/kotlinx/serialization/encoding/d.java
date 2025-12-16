package kotlinx.serialization.encoding;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.I0;
import kotlinx.serialization.x;

/* compiled from: Encoding.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/d;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface d {

    /* compiled from: Encoding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void D(int i12, int i13, @k SerialDescriptor serialDescriptor);

    <T> void F(@k SerialDescriptor serialDescriptor, int i12, @k x<? super T> xVar, T t12);

    void G(@k SerialDescriptor serialDescriptor, int i12, double d12);

    void d(@k SerialDescriptor serialDescriptor);

    void k(@k SerialDescriptor serialDescriptor, int i12, boolean z12);

    void l(@k SerialDescriptor serialDescriptor, int i12, @k String str);

    void n(@k SerialDescriptor serialDescriptor, int i12, short s5);

    void o(@k SerialDescriptor serialDescriptor, int i12, long j12);

    @InterfaceC43387f
    <T> void p(@k SerialDescriptor serialDescriptor, int i12, @k x<? super T> xVar, @l T t12);

    void q(@k I0 i02, int i12, byte b12);

    void s(@k SerialDescriptor serialDescriptor, int i12, float f12);

    @InterfaceC43387f
    boolean u();

    void v(@k I0 i02, int i12, char c12);

    @k
    Encoder x(@k I0 i02, int i12);
}
