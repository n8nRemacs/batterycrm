package dY;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapKt;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.map_core.view.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: AreaConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdY/b;", "LdY/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C39639b implements InterfaceC39638a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f393904a;

    @Inject
    public C39639b(@k e eVar) {
        this.f393904a = eVar;
    }

    @Override // dY.InterfaceC39638a
    @l
    public final AvitoMapBounds a(@l AvitoMapBounds avitoMapBounds) {
        if (avitoMapBounds == null) {
            return null;
        }
        if (this.f393904a.a().f406620c.intValue() == 0) {
            return avitoMapBounds;
        }
        Q<Double, Double> qDenormalizeCoordinates = AvitoMapKt.denormalizeCoordinates(avitoMapBounds.getTopLeft().getLongitude(), avitoMapBounds.getBottomRight().getLongitude());
        return avitoMapBounds.copy(new AvitoMapPoint(avitoMapBounds.getTopLeft().getLatitude(), qDenormalizeCoordinates.f406619b.doubleValue(), null, 4, null), new AvitoMapPoint(avitoMapBounds.getBottomRight().getLatitude(), qDenormalizeCoordinates.f406620c.doubleValue(), null, 4, null));
    }
}
