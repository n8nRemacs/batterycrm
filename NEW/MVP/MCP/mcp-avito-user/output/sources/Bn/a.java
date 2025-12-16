package BN;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import m.C43852a;

/* compiled from: AmenityMarkerIconFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBN/a;", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "_avito_item-map_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements AvitoMarkerIconFactory {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f1361a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ContextThemeWrapper f1362b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1363c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f1364d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f1365e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f1366f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1367g;

    @Inject
    public a(@k Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
        this.f1362b = contextThemeWrapper;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.amenity_pin, (ViewGroup) null);
        this.f1363c = viewInflate;
        this.f1364d = viewInflate.findViewById(R.id.pin_bg_image);
        this.f1365e = (ImageView) viewInflate.findViewById(R.id.pin_image);
        this.f1366f = C43852a.a(contextThemeWrapper, R.drawable.pin_circle_white);
        this.f1367g = context.getResources().getDimensionPixelSize(com.avito.android.avito_map.R.dimen.advert_map_zoom_padding);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap getIcon(@Y61.k com.avito.android.avito_map.marker.AvitoMarkerItem r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: BN.a.getIcon(com.avito.android.avito_map.marker.AvitoMarkerItem):android.graphics.Bitmap");
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    public final void getIconAsync(@k AvitoMarkerItem avitoMarkerItem, @k Y41.l<? super Bitmap, G0> lVar) {
        AvitoMarkerIconFactory.DefaultImpls.getIconAsync(this, avitoMarkerItem, lVar);
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    /* renamed from: getZoomPadding, reason: from getter */
    public final int getF1367g() {
        return this.f1367g;
    }
}
