package com.avito.android.universal_map.map.point_info;

import com.avito.android.universal_map.map.common.marker.Marker;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapPointInfoViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f305874b;

    public r(s sVar) {
        this.f305874b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Marker.Pin.IconType iconType;
        String str = (String) obj;
        Marker.Pin.IconType[] iconTypeArrValues = Marker.Pin.IconType.values();
        int length = iconTypeArrValues.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                iconType = null;
                break;
            }
            iconType = iconTypeArrValues[i12];
            String strName = iconType.name();
            Locale locale = Locale.ROOT;
            if (strName.toUpperCase(locale).equals(str.toUpperCase(locale))) {
                break;
            } else {
                i12++;
            }
        }
        if (iconType == null) {
            iconType = Marker.Pin.IconType.f304936d;
        }
        this.f305874b.f305893a0.postValue(iconType);
    }
}
