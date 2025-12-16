package tJ;

import androidx.camera.camera2.internal.G;
import com.avito.avcalls.logger.AvCallsLogMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AvCallsLogMessage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-avcalls_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {
    @Y61.k
    public static final String a(@Y61.k AvCallsLogMessage avCallsLogMessage) {
        int i12 = 0;
        List listF0 = C43066x.f0(avCallsLogMessage.f332930d, new String[]{"\n"}, 0, 6);
        String str = (String) C42745f0.S(listF0);
        if (str != null && C43066x.K(str)) {
            listF0 = C42745f0.x(listF0);
        }
        List list = listF0;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String strF = (String) obj;
            if (i12 != 0) {
                strF = G.f("                                      ", strF);
            }
            arrayList.add(strF);
            i12 = i13;
        }
        return C42745f0.O(arrayList, "\n", null, null, null, 62);
    }
}
