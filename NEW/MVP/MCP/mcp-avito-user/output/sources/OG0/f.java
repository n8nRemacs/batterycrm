package oG0;

import Y61.k;
import Y61.l;
import androidx.view.C23038g0;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.universal_map.map.T;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import qG0.C47290a;

/* compiled from: UniversalMapViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoG0/f;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: UniversalMapViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    /* renamed from: F7 */
    D getF419684V();

    void K4(@l Double d12, @k String str);

    void Lc(boolean z12);

    @k
    /* renamed from: P4 */
    D getF419682T();

    void Q4(@k AvitoMapBounds avitoMapBounds);

    void R6(@k AvitoMapPoint avitoMapPoint, boolean z12, @l Float f12);

    boolean Rb();

    @k
    /* renamed from: S4 */
    C23038g0 getF419674L();

    @k
    /* renamed from: T9 */
    D getF419683U();

    void Xd(@k AvitoMarkerIconFactory avitoMarkerIconFactory);

    void bc(@k AvitoMapPoint avitoMapPoint);

    void ed();

    void fd(@l Marker.Pin.IconType iconType);

    @l
    /* renamed from: h2 */
    C47290a getF419673K();

    void i2(@k Marker.Pin pin, @l Double d12, @l Float f12);

    void t2();

    void uc();

    void xd(@k C47290a c47290a);

    void yb(@k T.a aVar);
}
