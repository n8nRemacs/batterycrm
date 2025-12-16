package V1;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StringUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
@RestrictTo
/* loaded from: classes10.dex */
public final class g {
    public static final void a(int i12, @Y61.k StringBuilder sb2) {
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append("?");
            if (i13 < i12 - 1) {
                sb2.append(",");
            }
        }
    }
}
