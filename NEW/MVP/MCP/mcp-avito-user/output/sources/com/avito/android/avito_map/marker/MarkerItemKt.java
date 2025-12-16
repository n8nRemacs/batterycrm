package com.avito.android.avito_map.marker;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.avito_map.marker.MarkerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MarkerItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u001a \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"COMMA_DELIMITER", "", "ID_LITE_MARKER", "ID_MARKER", "ID_MY_LOCATION", "ID_RASH", "ID_SPECIAL_PIN", "setSelected", "", "Lcom/avito/android/avito_map/marker/MarkerItem;", "selectedPinId", "setViewed", "id", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarkerItemKt {

    @k
    private static final String COMMA_DELIMITER = ",";

    @k
    public static final String ID_LITE_MARKER = "%s%s%s";

    @k
    public static final String ID_MARKER = "%s%s%s%s%s%s%s%s%s";

    @k
    public static final String ID_MY_LOCATION = "id_my_location";

    @k
    public static final String ID_RASH = "%s%s%s%s%s%s";

    @k
    public static final String ID_SPECIAL_PIN = "special_pin_%s";

    @k
    public static final List<MarkerItem> setSelected(@k List<? extends MarkerItem> list, @l String str) {
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelableCopy : list) {
            if (parcelableCopy instanceof MarkerItem.Pin) {
                MarkerItem.Pin pin = (MarkerItem.Pin) parcelableCopy;
                parcelableCopy = pin.copy((15999 & 1) != 0 ? pin.id : null, (15999 & 2) != 0 ? pin.text : null, (15999 & 4) != 0 ? pin.selected : L.f(pin.getId(), str), (15999 & 8) != 0 ? pin.coordinates : null, (15999 & 16) != 0 ? pin.count : 0, (15999 & 32) != 0 ? pin.isViewed : false, (15999 & 64) != 0 ? pin.price : null, (15999 & 128) != 0 ? pin.isFavorite : false, (15999 & 256) != 0 ? pin.favoritesIds : null, (15999 & 512) != 0 ? pin.form : null, (15999 & 1024) != 0 ? pin.highlight : null, (15999 & 2048) != 0 ? pin.brand : null, (15999 & 4096) != 0 ? pin.context : null, (15999 & 8192) != 0 ? pin.icon : null);
            } else if (parcelableCopy instanceof MarkerItem.Rash) {
                MarkerItem.Rash rash = (MarkerItem.Rash) parcelableCopy;
                parcelableCopy = rash.copy((1855 & 1) != 0 ? rash.id : null, (1855 & 2) != 0 ? rash.selected : L.f(rash.getId(), str), (1855 & 4) != 0 ? rash.coordinates : null, (1855 & 8) != 0 ? rash.text : null, (1855 & 16) != 0 ? rash.count : 0, (1855 & 32) != 0 ? rash.isViewed : false, (1855 & 64) != 0 ? rash.isFavorite : false, (1855 & 128) != 0 ? rash.favoritesIds : null, (1855 & 256) != 0 ? rash.form : null, (1855 & 512) != 0 ? rash.highlight : null, (1855 & 1024) != 0 ? rash.context : null);
            }
            if (parcelableCopy != null) {
                arrayList.add(parcelableCopy);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[PHI: r5
  0x0047: PHI (r5v2 android.os.Parcelable) = (r5v5 android.os.Parcelable), (r5v6 android.os.Parcelable) binds: [B:14:0x0058, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.avito.android.avito_map.marker.MarkerItem> setViewed(@Y61.k java.util.List<? extends com.avito.android.avito_map.marker.MarkerItem> r22, @Y61.l java.lang.String r23) {
        /*
            r0 = r23
            r1 = r22
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r1.next()
            com.avito.android.avito_map.marker.MarkerItem r3 = (com.avito.android.avito_map.marker.MarkerItem) r3
            boolean r4 = r3 instanceof com.avito.android.avito_map.marker.MarkerItem.Pin
            if (r4 == 0) goto L49
            r5 = r3
            com.avito.android.avito_map.marker.MarkerItem$Pin r5 = (com.avito.android.avito_map.marker.MarkerItem.Pin) r5
            java.lang.String r3 = r5.getId()
            boolean r3 = kotlin.jvm.internal.L.f(r3, r0)
            if (r3 == 0) goto L47
            r20 = 16351(0x3fdf, float:2.2913E-41)
            r21 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.avito.android.avito_map.marker.MarkerItem$Pin r3 = com.avito.android.avito_map.marker.MarkerItem.Pin.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L6e
        L47:
            r3 = r5
            goto L6e
        L49:
            boolean r4 = r3 instanceof com.avito.android.avito_map.marker.MarkerItem.Rash
            if (r4 == 0) goto L6e
            r5 = r3
            com.avito.android.avito_map.marker.MarkerItem$Rash r5 = (com.avito.android.avito_map.marker.MarkerItem.Rash) r5
            java.lang.String r3 = r5.getId()
            boolean r3 = kotlin.jvm.internal.L.f(r3, r0)
            if (r3 == 0) goto L47
            r17 = 2015(0x7df, float:2.824E-42)
            r18 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.avito.android.avito_map.marker.MarkerItem$Rash r3 = com.avito.android.avito_map.marker.MarkerItem.Rash.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L6e:
            if (r3 == 0) goto Lf
            r2.add(r3)
            goto Lf
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avito_map.marker.MarkerItemKt.setViewed(java.util.List, java.lang.String):java.util.List");
    }
}
