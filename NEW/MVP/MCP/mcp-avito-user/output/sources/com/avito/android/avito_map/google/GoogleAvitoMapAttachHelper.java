package com.avito.android.avito_map.google;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.google.GoogleAvitoMapAttachHelper;
import com.google.android.gms.maps.C36806c;
import com.google.android.gms.maps.InterfaceC36810g;
import com.google.android.gms.maps.SupportMapFragment;
import j.D;
import kotlin.Metadata;

/* compiled from: GoogleAvitoMapAttachHelper.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/avito_map/google/GoogleAvitoMapAttachHelper;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper;", "<init>", "()V", "Lcom/avito/android/avito_map/AvitoMap;", "getMap", "()Lcom/avito/android/avito_map/AvitoMap;", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "listener", "Lkotlin/G0;", "setMapAttachedListener", "(Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;)V", "", "viewId", "Landroid/view/View;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "attachView", "(ILandroid/view/View;Landroidx/fragment/app/FragmentManager;)V", "mapAttachListener", "Lcom/avito/android/avito_map/AvitoMapAttachHelper$MapAttachListener;", "map", "Lcom/avito/android/avito_map/AvitoMap;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/google/android/gms/maps/g;", "onMapReadyCallback", "Lcom/google/android/gms/maps/g;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleAvitoMapAttachHelper implements AvitoMapAttachHelper {
    private Context context;
    private AvitoMap map;

    @l
    private AvitoMapAttachHelper.MapAttachListener mapAttachListener;

    @k
    private final InterfaceC36810g onMapReadyCallback = new InterfaceC36810g() { // from class: tg.b
        @Override // com.google.android.gms.maps.InterfaceC36810g
        public final void onMapReady(C36806c c36806c) {
            GoogleAvitoMapAttachHelper.onMapReadyCallback$lambda$1(this.f439382a, c36806c);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMapReadyCallback$lambda$1(GoogleAvitoMapAttachHelper googleAvitoMapAttachHelper, C36806c c36806c) {
        Context context = googleAvitoMapAttachHelper.context;
        if (context == null) {
            context = null;
        }
        AvitoGoogleMap avitoGoogleMap = new AvitoGoogleMap(c36806c, context);
        googleAvitoMapAttachHelper.map = avitoGoogleMap;
        AvitoMapAttachHelper.MapAttachListener mapAttachListener = googleAvitoMapAttachHelper.mapAttachListener;
        if (mapAttachListener != null) {
            mapAttachListener.onMapAttach(avitoGoogleMap);
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper
    public void attachView(@D int viewId, @k View container, @k FragmentManager fragmentManager) {
        this.context = container.getContext();
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        H hE2 = fragmentManager.e();
        hE2.n(viewId, supportMapFragment, null);
        hE2.e();
        supportMapFragment.b5(this.onMapReadyCallback);
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper
    @k
    public AvitoMap getMap() {
        AvitoMap avitoMap = this.map;
        if (avitoMap == null) {
            return null;
        }
        return avitoMap;
    }

    @Override // com.avito.android.avito_map.AvitoMapAttachHelper
    public void setMapAttachedListener(@k AvitoMapAttachHelper.MapAttachListener listener) {
        this.mapAttachListener = listener;
    }
}
