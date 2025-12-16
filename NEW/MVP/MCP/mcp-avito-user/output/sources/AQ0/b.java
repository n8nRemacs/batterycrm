package AQ0;

import Y61.l;
import com.avito.avcalls.call.models.CameraPosition;
import kotlin.Metadata;

/* compiled from: CameraPositionMapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @l
    public static final CameraPosition a(@l Integer num) {
        if (num != null && num.intValue() == 0) {
            return CameraPosition.FRONT;
        }
        if (num != null && num.intValue() == 1) {
            return CameraPosition.BACK;
        }
        return null;
    }
}
