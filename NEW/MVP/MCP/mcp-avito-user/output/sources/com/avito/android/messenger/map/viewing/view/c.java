package com.avito.android.messenger.map.viewing.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.runtime.internal.P;
import androidx.core.content.res.i;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapMarkerOptions;
import com.avito.android.avito_map.R;
import com.avito.android.avito_map.clustering.Cluster;
import com.avito.android.avito_map.clustering.ClusterItem;
import com.avito.android.avito_map.clustering.ClusterManager;
import com.avito.android.avito_map.clustering.view.DefaultClusterRenderer;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PinRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/c;", "Lcom/avito/android/avito_map/clustering/view/DefaultClusterRenderer;", "Lcom/avito/android/messenger/map/viewing/view/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends DefaultClusterRenderer<com.avito.android.messenger.map.viewing.view.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f196863a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f196864b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f196865c;

    /* compiled from: PinRenderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Bitmap> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Bitmap invoke() throws Resources.NotFoundException {
            int i12 = R.drawable.blue_pin;
            c cVar = c.this;
            Drawable drawable = cVar.f196863a.getResources().getDrawable(i12, cVar.f196863a.getTheme());
            if (drawable == null) {
                throw new IllegalStateException(("PinRenderer.getBitmapDescriptor(resId = " + i12 + ") error - couldn't get drawable").toString());
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }
    }

    /* compiled from: PinRenderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Bitmap> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Bitmap invoke() throws Resources.NotFoundException {
            int i12 = R.drawable.red_pin;
            c cVar = c.this;
            Drawable drawable = cVar.f196863a.getResources().getDrawable(i12, cVar.f196863a.getTheme());
            if (drawable == null) {
                throw new IllegalStateException(("PinRenderer.getBitmapDescriptor(resId = " + i12 + ") error - couldn't get drawable").toString());
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }
    }

    public c(@k Context context, @k AvitoMap avitoMap, @k ClusterManager<com.avito.android.messenger.map.viewing.view.a> clusterManager) {
        super(context, avitoMap, clusterManager);
        this.f196863a = context;
        this.f196864b = C42727D.c(new a());
        this.f196865c = C42727D.c(new b());
    }

    @Override // com.avito.android.avito_map.clustering.view.DefaultClusterRenderer
    public final int getColor(int i12) {
        Resources resources = this.f196863a.getResources();
        int i13 = R.color.pin_or_rash_background_default_color;
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        return resources.getColor(i13, null);
    }

    @Override // com.avito.android.avito_map.clustering.view.DefaultClusterRenderer
    public final void onBeforeClusterItemRendered(ClusterItem clusterItem, AvitoMapMarkerOptions avitoMapMarkerOptions) {
        com.avito.android.messenger.map.viewing.view.a aVar = (com.avito.android.messenger.map.viewing.view.a) clusterItem;
        if (aVar == null || avitoMapMarkerOptions == null) {
            return;
        }
        avitoMapMarkerOptions.setIcon(aVar.f196862c ? (Bitmap) this.f196865c.getValue() : (Bitmap) this.f196864b.getValue());
    }

    @Override // com.avito.android.avito_map.clustering.view.DefaultClusterRenderer
    public final void onClusterItemRendered(ClusterItem clusterItem, AvitoMapMarker avitoMapMarker) {
        com.avito.android.messenger.map.viewing.view.a aVar = (com.avito.android.messenger.map.viewing.view.a) clusterItem;
        if (aVar == null || avitoMapMarker == null) {
            return;
        }
        boolean z12 = aVar.f196862c;
        avitoMapMarker.changeIcon(z12 ? (Bitmap) this.f196865c.getValue() : (Bitmap) this.f196864b.getValue(), aVar.f196860a + z12, 0.0f, AvitoMapMarker.Anchor.BOTTOM_CENTER);
    }

    @Override // com.avito.android.avito_map.clustering.view.DefaultClusterRenderer
    public final boolean shouldRenderAsCluster(@l Cluster<com.avito.android.messenger.map.viewing.view.a> cluster) {
        return cluster != null && cluster.getSize() > 1;
    }
}
