package HU;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import c3.C26932a;
import com.akita.compose.foundation.p;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ColorExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_compose_shared_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    @l
    public static final p a(@k UniversalColor universalColor) {
        String colorKey = universalColor.getColorKey();
        p pVarA = colorKey != null ? C26932a.a(colorKey) : null;
        if (pVarA != null) {
            return pVarA;
        }
        Color color = universalColor.getColor();
        T tA2 = color != null ? T.a(V.b(color.getValue())) : null;
        if (tA2 == null) {
            return null;
        }
        Color colorDark = universalColor.getColorDark();
        return new p(tA2.f39331a, colorDark != null ? V.b(colorDark.getValue()) : tA2.f39331a, null);
    }
}
