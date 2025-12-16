package ET0;

import com.avito.android.remote.model.ProfileTab;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;

/* compiled from: SpacingExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {
    @Y61.k
    public static final h a(@Y61.k G g12) {
        Integer numA = g12.a(ProfileTab.ALL);
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = g12.a("horizontal");
        int iIntValue2 = numA2 != null ? numA2.intValue() : iIntValue;
        Integer numA3 = g12.a("vertical");
        if (numA3 != null) {
            iIntValue = numA3.intValue();
        }
        return new h(iIntValue2, iIntValue);
    }
}
