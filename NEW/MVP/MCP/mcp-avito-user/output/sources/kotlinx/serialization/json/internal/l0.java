package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.C0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.w0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.d1;
import kotlinx.serialization.internal.g1;
import kotlinx.serialization.internal.j1;
import kotlinx.serialization.internal.m1;

/* compiled from: StreamingJsonEncoder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Set<SerialDescriptor> f413109a;

    static {
        int i12 = kotlin.s0.f410475c;
        g1.f412860a.getClass();
        int i13 = w0.f410662c;
        j1.f412874a.getClass();
        int i14 = kotlin.o0.f406874c;
        d1.f412850a.getClass();
        int i15 = C0.f406602c;
        m1.f412893a.getClass();
        f413109a = C42756l.l0(new SerialDescriptor[]{g1.f412861b, j1.f412875b, d1.f412851b, m1.f412894b});
    }

    public static final boolean a(@Y61.k SerialDescriptor serialDescriptor) {
        return serialDescriptor.getF412817l() && f413109a.contains(serialDescriptor);
    }
}
