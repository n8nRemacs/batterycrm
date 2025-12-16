package com.avito.android.messenger.map.viewing.view;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapBoundsBuilder;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import com.avito.android.avito_map.clustering.ClusterManager;
import java.util.Iterator;
import kotlin.Q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class e implements ClusterManager.OnClusterItemClickListener, ClusterManager.OnClusterClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f196878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvitoMap f196879b;

    public /* synthetic */ e(f fVar, AvitoMap avitoMap) {
        this.f196878a = fVar;
        this.f196879b = avitoMap;
    }

    @Override // com.avito.android.avito_map.clustering.ClusterManager.OnClusterClickListener
    public boolean onClusterClick(Cluster cluster) {
        Q<Integer, Integer> size;
        Q<Integer, Integer> size2;
        f fVar = this.f196878a;
        AvitoMap avitoMap = fVar.f196884e;
        int iIntValue = 0;
        int iIntValue2 = (avitoMap == null || (size2 = avitoMap.getSize()) == null) ? 0 : size2.f406619b.intValue();
        AvitoMap avitoMap2 = fVar.f196884e;
        if (avitoMap2 != null && (size = avitoMap2.getSize()) != null) {
            iIntValue = size.f406620c.intValue();
        }
        AvitoMapBoundsBuilder avitoMapBoundsBuilder = new AvitoMapBoundsBuilder(iIntValue2, iIntValue);
        Iterator it = cluster.getItems().iterator();
        while (it.hasNext()) {
            avitoMapBoundsBuilder.addPoint(((a) it.next()).getPosition());
        }
        avitoMapBoundsBuilder.addOffset(fVar.f196899t);
        AvitoMapBounds avitoMapBoundsBuild = avitoMapBoundsBuilder.build();
        if (avitoMapBoundsBuild != null) {
            this.f196879b.moveTo(avitoMapBoundsBuild, true);
        }
        return true;
    }

    @Override // com.avito.android.avito_map.clustering.ClusterManager.OnClusterItemClickListener
    public boolean onClusterItemClick(ClusterItem clusterItem) {
        AvitoMapPoint position;
        a aVar = (a) clusterItem;
        f fVar = this.f196878a;
        ClusterManager<a> clusterManager = fVar.f196888i;
        if (clusterManager == null) {
            clusterManager = null;
        }
        AvitoMapMarker marker = ((c) clusterManager.getRenderer()).getMarker(aVar);
        if (marker != null && (position = marker.getPosition()) != null) {
            this.f196879b.moveTo(position, true, null);
        }
        fVar.f196891l.accept(aVar);
        return true;
    }
}
