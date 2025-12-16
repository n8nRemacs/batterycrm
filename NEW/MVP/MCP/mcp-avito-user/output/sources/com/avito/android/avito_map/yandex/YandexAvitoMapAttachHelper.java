package com.avito.android.avito_map.yandex;

import AK.c;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapView;
import com.avito.android.avito_map.R;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.mapview.MapView;
import j.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: YandexAvitoMapAttachHelper.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/avito_map/yandex/YandexAvitoMapAttachHelper;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper;", "", "mapIsMovable", "<init>", "(Z)V", "Lcom/avito/android/avito_map/AvitoMap;", "getMap", "()Lcom/avito/android/avito_map/AvitoMap;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "listener", "Lkotlin/G0;", "setMapAttachedListener", "(Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;)V", "", "viewId", "Landroid/view/View;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "attachView", "(ILandroid/view/View;Landroidx/fragment/app/FragmentManager;)V", "Z", "map", "Lcom/avito/android/avito_map/AvitoMap;", "mapAttachListener", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexAvitoMapAttachHelper implements AvitoMapAttachHelper {

    @l
    private AvitoMap map;

    @l
    private AvitoMapAttachHelper.MapAttachListener mapAttachListener;
    private final boolean mapIsMovable;

    public YandexAvitoMapAttachHelper() {
        this(false, 1, null);
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper
    @SuppressLint({"InflateParams"})
    public void attachView(@D int viewId, @k View container, @k FragmentManager fragmentManager) {
        MapView mapView;
        Context context = container.getContext();
        AvitoMapView avitoMapView = (AvitoMapView) container.findViewById(viewId);
        if (avitoMapView == null) {
            throw new IllegalArgumentException(c.g(viewId, "No view found with provided id: "));
        }
        int childCount = avitoMapView.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                mapView = null;
                break;
            }
            View childAt = avitoMapView.getChildAt(i12);
            if (childAt instanceof MapView) {
                mapView = (MapView) childAt;
                break;
            }
            i12++;
        }
        if (mapView == null) {
            mapView = this.mapIsMovable ? (MapView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.yandex_map_movable, (ViewGroup) null) : new MapView(context);
            avitoMapView.addView(mapView);
        }
        mapView.onStart();
        MapKitFactory.getInstance().onStart();
        AvitoYandexMap avitoYandexMap = new AvitoYandexMap(mapView, context);
        this.map = avitoYandexMap;
        AvitoMapAttachHelper.MapAttachListener mapAttachListener = this.mapAttachListener;
        if (mapAttachListener != null) {
            mapAttachListener.onMapAttach(avitoYandexMap);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper
    @l
    public AvitoMap getMap() {
        return this.map;
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper
    public void setMapAttachedListener(@k AvitoMapAttachHelper.MapAttachListener listener) {
        this.mapAttachListener = listener;
    }

    public YandexAvitoMapAttachHelper(boolean z12) {
        this.mapIsMovable = z12;
    }

    public /* synthetic */ YandexAvitoMapAttachHelper(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }
}
