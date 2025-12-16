package Wh;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.Corners;
import kotlin.Metadata;

/* compiled from: BeduinContainerBackground.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {
    @l
    public static final Integer a(@k BeduinContainerBackground beduinContainerBackground) {
        Integer numD;
        Corners corners = beduinContainerBackground.getCorners();
        return (corners == null || (numD = corners.d()) == null) ? beduinContainerBackground.getCornerRadius() : numD;
    }

    @l
    public static final Integer b(@k BeduinContainerBackground beduinContainerBackground) {
        Integer numE;
        Corners corners = beduinContainerBackground.getCorners();
        return (corners == null || (numE = corners.e()) == null) ? beduinContainerBackground.getCornerRadius() : numE;
    }

    @l
    public static final Integer c(@k BeduinContainerBackground beduinContainerBackground) {
        Integer numG;
        Corners corners = beduinContainerBackground.getCorners();
        return (corners == null || (numG = corners.g()) == null) ? beduinContainerBackground.getCornerRadius() : numG;
    }

    @l
    public static final Integer d(@k BeduinContainerBackground beduinContainerBackground) {
        Integer numH;
        Corners corners = beduinContainerBackground.getCorners();
        return (corners == null || (numH = corners.h()) == null) ? beduinContainerBackground.getCornerRadius() : numH;
    }
}
