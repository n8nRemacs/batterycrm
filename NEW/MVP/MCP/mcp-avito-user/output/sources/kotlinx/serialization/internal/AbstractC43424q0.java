package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Tagged.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/q0;", "Lkotlinx/serialization/internal/X0;", "", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* renamed from: kotlinx.serialization.internal.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43424q0 extends X0<String> {
    @Override // kotlinx.serialization.internal.X0
    public final String S(SerialDescriptor serialDescriptor, int i12) {
        String strV = V(serialDescriptor, i12);
        String str = (String) C42745f0.S(this.f412827a);
        if (str == null) {
            str = "";
        }
        return U(str, strV);
    }

    @Y61.k
    public String U(@Y61.k String str, @Y61.k String str2) {
        return str.length() == 0 ? str2 : androidx.compose.foundation.H.i('.', str, str2);
    }

    @Y61.k
    public String V(@Y61.k SerialDescriptor serialDescriptor, int i12) {
        return serialDescriptor.d(i12);
    }
}
