package com.avito.android.beduin.common.component.map;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.avito_map.lite.MapLiteModeView;
import com.avito.android.avito_map.lite.google.GoogleMapLiteModeViewImpl;
import com.avito.android.avito_map.lite.yandex.YandexMapLiteModeViewImpl;
import com.avito.android.lib.util.v;
import com.yandex.mapkit.mapview.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinMapLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/map/f;", "Landroid/widget/FrameLayout;", "", "heightPx", "Lkotlin/G0;", "setMapHeight", "(Ljava/lang/Integer;)V", "radiusPx", "setMapCornerRadius", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final float f101756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101757c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CardView f101758d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f101759e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final MapLiteModeView f101760f;

    public f(Context context, AttributeSet attributeSet, int i12, boolean z12, int i13, C42822w c42822w) {
        MapLiteModeView googleMapLiteModeViewImpl;
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f101756b = getResources().getDimensionPixelSize(R.dimen.map_default_corner_radius);
        this.f101757c = getResources().getDimensionPixelSize(R.dimen.map_default_height);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_map, (ViewGroup) this, true);
        ViewStub viewStub = (ViewStub) findViewById(R.id.stub_map);
        if (viewStub != null) {
            viewStub.setLayoutResource(z12 ? R.layout.beduin_map_yandex_view : R.layout.beduin_map_google_view);
            viewStub.inflate();
        }
        if (z12) {
            View viewFindViewById = findViewById(R.id.beduin_yandex_map);
            this.f101759e = viewFindViewById;
            googleMapLiteModeViewImpl = new YandexMapLiteModeViewImpl((MapView) viewFindViewById, new BN.a(context), R.style.Theme_DesignSystem_Legacy);
        } else {
            View viewFindViewById2 = findViewById(R.id.beduin_google_map);
            this.f101759e = viewFindViewById2;
            googleMapLiteModeViewImpl = new GoogleMapLiteModeViewImpl((com.google.android.gms.maps.MapView) viewFindViewById2, new BN.a(context));
        }
        this.f101760f = googleMapLiteModeViewImpl;
        this.f101758d = (CardView) findViewById(R.id.map_container);
    }

    public final void setMapCornerRadius(@l Integer radiusPx) {
        v.a(this.f101758d, radiusPx != null ? radiusPx.intValue() : this.f101756b);
    }

    public final void setMapHeight(@l Integer heightPx) {
        this.f101758d.getLayoutParams().height = heightPx != null ? heightPx.intValue() : this.f101757c;
        requestLayout();
    }
}
