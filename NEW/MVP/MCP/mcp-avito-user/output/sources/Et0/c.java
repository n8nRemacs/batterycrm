package ET0;

import com.avito.android.remote.model.ProfileTab;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: IndentsExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {
    @Y61.k
    public static final b a(@Y61.k G g12) {
        Integer numA = g12.a(ProfileTab.ALL);
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = g12.a("horizontal");
        int iIntValue2 = numA2 != null ? numA2.intValue() : iIntValue;
        Integer numA3 = g12.a("vertical");
        if (numA3 != null) {
            iIntValue = numA3.intValue();
        }
        Integer numA4 = g12.a("start");
        int iIntValue3 = numA4 != null ? numA4.intValue() : iIntValue2;
        Integer numA5 = g12.a("end");
        if (numA5 != null) {
            iIntValue2 = numA5.intValue();
        }
        Integer numA6 = g12.a("bottom");
        int iIntValue4 = numA6 != null ? numA6.intValue() : iIntValue;
        Integer numA7 = g12.a("top");
        if (numA7 != null) {
            iIntValue = numA7.intValue();
        }
        return new b(iIntValue3, iIntValue2, iIntValue4, iIntValue);
    }
}
