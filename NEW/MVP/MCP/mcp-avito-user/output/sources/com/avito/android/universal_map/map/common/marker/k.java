package com.avito.android.universal_map.map.common.marker;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.universal_map.map.common.marker.Marker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MarkerLabelManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/k;", "Lcom/avito/android/universal_map/map/common/marker/j;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AvitoMapAttachHelper f304979a;

    /* renamed from: b, reason: collision with root package name */
    public final int f304980b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304981c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f304982d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f304983e;

    @Inject
    public k(@Y61.k AvitoMapAttachHelper avitoMapAttachHelper, @Y61.k Context context) {
        this.f304979a = avitoMapAttachHelper;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.universal_map_pin_with_label, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f304982d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f304983e = textView;
        textView.setText("Выгодно\\n250 \\u20BD, 2–3 дня");
        viewInflate.measure(0, 0);
        this.f304980b = viewInflate.getMeasuredWidth();
        this.f304981c = viewInflate.getMeasuredHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.universal_map.map.common.marker.j
    @Y61.k
    public final Set a(@Y61.l AvitoMapBounds avitoMapBounds, @Y61.k ArrayList arrayList) {
        Q q12;
        String str;
        AvitoMap map;
        Point screenLocation;
        if (avitoMapBounds == null) {
            return B0.f406639b;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Q q13 = null;
            if (!it.hasNext()) {
                break;
            }
            Marker.Pin pin = (Marker.Pin) it.next();
            AvitoMapPoint avitoMapPoint = pin.f304924d;
            if (avitoMapBounds.contains(avitoMapPoint) && (map = this.f304979a.getMap()) != null && (screenLocation = map.toScreenLocation(avitoMapPoint)) != null) {
                q13 = new Q(pin, screenLocation);
            }
            if (q13 != null) {
                arrayList3.add(q13);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Q q14 = (Q) it2.next();
            Point point = (Point) q14.f406620c;
            Marker.Pin pin2 = (Marker.Pin) q14.f406619b;
            String str2 = pin2.f304926f;
            AttributedText attributedText = pin2.f304927g;
            TextView textView = this.f304983e;
            if (attributedText != null) {
                com.avito.android.util.text.j.c(textView, attributedText, null);
                View view = this.f304982d;
                view.measure(0, 0);
                q12 = new Q(Integer.valueOf(view.getMeasuredWidth()), Integer.valueOf(view.getMeasuredHeight()));
            } else if (str2 != null) {
                textView.setText(str2);
                View view2 = this.f304982d;
                view2.measure(0, 0);
                q12 = new Q(Integer.valueOf(view2.getMeasuredWidth()), Integer.valueOf(view2.getMeasuredHeight()));
            } else {
                q12 = new Q(Integer.valueOf(this.f304980b), Integer.valueOf(this.f304981c));
            }
            int iIntValue = ((Number) q12.f406619b).intValue();
            int iIntValue2 = ((Number) q12.f406620c).intValue();
            int i12 = point.x;
            int i13 = iIntValue / 2;
            int i14 = point.y;
            int i15 = iIntValue2 / 2;
            Rect rect = new Rect(i12 - i13, i14 - i15, i12 + i13, i14 + i15);
            if (arrayList2.isEmpty()) {
                arrayList2.add(rect);
                str = pin2.f304923c;
            } else {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (Rect.intersects((Rect) it3.next(), rect)) {
                        str = null;
                        break;
                    }
                }
                arrayList2.add(rect);
                str = pin2.f304923c;
            }
            if (str != null) {
                arrayList4.add(str);
            }
        }
        return C42745f0.P0(arrayList4);
    }
}
