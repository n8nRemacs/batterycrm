package com.avito.android.item_map.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapTarget;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/avito_map/AvitoMapTarget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<AvitoMapTarget, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f173633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(V v12) {
        super(1);
        this.f173633l = v12;
    }

    @Override // Y41.l
    public final G0 invoke(AvitoMapTarget avitoMapTarget) {
        ItemMapState itemMapState;
        MultiAddressesInfo multiAddressesInfo;
        List<MultiAddressesItem> addresses;
        Object next;
        AvitoMapTarget avitoMapTarget2 = avitoMapTarget;
        V v12 = this.f173633l;
        if (avitoMapTarget2 != null) {
            AvitoMap avitoMap = v12.f173582q;
            boolean z12 = true;
            if (avitoMap != null) {
                avitoMap.moveTo(avitoMapTarget2.getPoint(), true, Float.valueOf(avitoMapTarget2.getZoomLevel()));
            }
            if (v12.j() && (multiAddressesInfo = (itemMapState = v12.f173579n).f173431d) != null && (addresses = multiAddressesInfo.getAddresses()) != null) {
                Iterator<T> it = addresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    MultiAddressesItem multiAddressesItem = (MultiAddressesItem) next;
                    if (multiAddressesItem.getCoords().getLatitude() == avitoMapTarget2.getPoint().getLatitude() && multiAddressesItem.getCoords().getLongitude() == avitoMapTarget2.getPoint().getLongitude()) {
                        break;
                    }
                }
                MultiAddressesItem multiAddressesItem2 = (MultiAddressesItem) next;
                if (multiAddressesItem2 != null) {
                    ArrayList arrayList = new ArrayList();
                    String bottomSheetTitle = multiAddressesItem2.getBottomSheetTitle();
                    if (bottomSheetTitle != null) {
                        arrayList.add(new C31064a(bottomSheetTitle));
                    }
                    List<GeoReference> listH = multiAddressesItem2.h();
                    if (listH != null) {
                        for (GeoReference geoReference : listH) {
                            List<String> colors = geoReference.getColors();
                            String content = geoReference.getContent();
                            String after = geoReference.getAfter();
                            AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
                            String iconName = afterWithIcon != null ? afterWithIcon.getIconName() : null;
                            AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
                            arrayList.add(new GeoReference(colors, content, after, new AfterWithIcon(iconName, afterWithIcon2 != null ? afterWithIcon2.getText() : null), null, 16, null));
                        }
                    }
                    Context context = v12.f173555K;
                    Drawable drawableH = C35835l0.h(R.attr.ic_copyM, context);
                    if (drawableH != null) {
                        drawableH.setTint(C35835l0.d(R.attr.black, context));
                        drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
                    } else {
                        drawableH = null;
                    }
                    String house = multiAddressesItem2.getComponents().getHouse();
                    String str = multiAddressesItem2.getComponents().getLocality() + ((house == null || C43066x.K(house)) ? "" : ", " + multiAddressesItem2.getComponents().getHouse());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(androidx.appcompat.app.r.q(str, "  "));
                    if (drawableH != null) {
                        spannableStringBuilder.setSpan(new ImageSpan(drawableH, 0), str.length() + 1, spannableStringBuilder.length(), 33);
                    }
                    ItemMapState.BottomSheetState bottomSheetState = itemMapState.f173437j;
                    if ((bottomSheetState != null ? bottomSheetState.f173457d : null) == null && (bottomSheetState == null || !bottomSheetState.f173466m)) {
                        z12 = false;
                    }
                    arrayList.add(new C31071h(spannableStringBuilder, itemMapState.f173429b, itemMapState.f173427B, z12));
                    S s5 = v12.f173569d;
                    s5.f173497j = arrayList;
                    s5.notifyDataSetChanged();
                }
            }
        }
        return G0.f406611a;
    }
}
