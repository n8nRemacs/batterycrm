package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import j.D;
import kotlin.Metadata;

/* compiled from: AvitoMapAttachHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapAttachHelper;", "", "Lcom/avito/android/avito_map/AvitoMap;", "getMap", "()Lcom/avito/android/avito_map/AvitoMap;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "listener", "Lkotlin/G0;", "setMapAttachedListener", "(Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;)V", "", "viewId", "Landroid/view/View;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "attachView", "(ILandroid/view/View;Landroidx/fragment/app/FragmentManager;)V", "MapAttachListener", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvitoMapAttachHelper {

    /* compiled from: AvitoMapAttachHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "", "Lcom/avito/android/avito_map/AvitoMap;", "map", "Lkotlin/G0;", "onMapAttach", "(Lcom/avito/android/avito_map/AvitoMap;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MapAttachListener {
        void onMapAttach(@k AvitoMap map);
    }

    void attachView(@D int viewId, @k View container, @k FragmentManager fragmentManager);

    @l
    AvitoMap getMap();

    void setMapAttachedListener(@k MapAttachListener listener);
}
