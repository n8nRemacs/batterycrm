package com.avito.android.universal_map.map.common.marker;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_universal-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* compiled from: Marker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f304978a;

        static {
            int[] iArr = new int[UniversalMapPointRect.PointIconType.values().length];
            try {
                iArr[UniversalMapPointRect.PointIconType.AVITO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalMapPointRect.PointIconType.POSTAMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalMapPointRect.PointIconType.PVZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalMapPointRect.PointIconType.PVZ_WITH_TRY_ON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f304978a = iArr;
        }
    }

    @Y61.k
    public static final Marker.Pin a(@Y61.k UniversalMapPointRect universalMapPointRect, @Y61.l Float f12) {
        String id2 = universalMapPointRect.getId();
        AvitoMapPoint avitoMapPointB = com.avito.android.universal_map.map.util.b.b(universalMapPointRect.getCoordinates());
        Map<String, Object> mapH = universalMapPointRect.h();
        String hint = universalMapPointRect.getHint();
        AttributedText richHint = universalMapPointRect.getRichHint();
        UniversalMapPointRect.HintLayout hintLayout = universalMapPointRect.getHintLayout();
        ParametrizedEvent onSelectEvent = universalMapPointRect.getOnSelectEvent();
        UniversalMapPointRect.PointIconType iconType = universalMapPointRect.getIconType();
        Marker.Pin.IconType iconType2 = null;
        if (iconType != null) {
            int i12 = a.f304978a[iconType.ordinal()];
            if (i12 == 1) {
                iconType2 = Marker.Pin.IconType.f304934b;
            } else if (i12 == 2) {
                iconType2 = Marker.Pin.IconType.f304935c;
            } else if (i12 == 3) {
                iconType2 = Marker.Pin.IconType.f304936d;
            } else if (i12 == 4) {
                iconType2 = Marker.Pin.IconType.f304937e;
            }
        }
        return new Marker.Pin(id2, avitoMapPointB, mapH, hint, richHint, hintLayout, onSelectEvent, f12, iconType2);
    }
}
