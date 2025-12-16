package J80;

import Y61.k;
import Y61.l;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.d0;
import kotlin.Metadata;

/* compiled from: PlayerUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_player-core_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {
    @k
    public static final String a(@k InterfaceC36534o interfaceC36534o) {
        O.i iVar;
        O oB2 = interfaceC36534o.B();
        return String.valueOf((oB2 == null || (iVar = oB2.f343529c) == null) ? null : iVar.f343571a);
    }

    @l
    public static final Double b(@k d0 d0Var) {
        long duration = d0Var.getDuration();
        if (duration == -9223372036854775807L) {
            return null;
        }
        return Double.valueOf(duration / 1000.0d);
    }
}
