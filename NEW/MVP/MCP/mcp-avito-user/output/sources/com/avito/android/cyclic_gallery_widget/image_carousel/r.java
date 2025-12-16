package com.avito.android.cyclic_gallery_widget.image_carousel;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ImageCarouselItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/r;", "LTV0/b;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/v;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/q;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements TV0.b<v, q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f132096a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f132097b;

    /* compiled from: ImageCarouselItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/x;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/cyclic_gallery_widget/image_carousel/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, x> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s.c f132098l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Integer f132099m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.pinch_to_zoom.b f132100n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ PinchToZoomSource f132101o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ z80.e f132102p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.c cVar, Integer num, com.avito.android.pinch_to_zoom.b bVar, PinchToZoomSource pinchToZoomSource, z80.e eVar) {
            super(2);
            this.f132098l = cVar;
            this.f132099m = num;
            this.f132100n = bVar;
            this.f132101o = pinchToZoomSource;
            this.f132102p = eVar;
        }

        @Override // Y41.p
        public final x invoke(ViewGroup viewGroup, View view) {
            x xVar = new x(view, this.f132098l, this.f132099m, this.f132100n, this.f132101o, null, 32, null);
            z80.e eVar = this.f132102p;
            if (eVar != null) {
                xVar.f132158e.f220009d = eVar;
            }
            return xVar;
        }
    }

    public r(@Y61.k u uVar, @Y61.l s.c cVar, @Y61.l Integer num, @Y61.l com.avito.android.pinch_to_zoom.b bVar, @Y61.l PinchToZoomSource pinchToZoomSource, @Y61.l z80.e eVar) {
        this.f132096a = uVar;
        this.f132097b = new g.a<>(R.layout.advert_gallery_item, new a(cVar, num, bVar, pinchToZoomSource, eVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f132096a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f132097b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof q;
    }

    public /* synthetic */ r(u uVar, s.c cVar, Integer num, com.avito.android.pinch_to_zoom.b bVar, PinchToZoomSource pinchToZoomSource, z80.e eVar, int i12, C42822w c42822w) {
        this(uVar, (i12 & 2) != 0 ? null : cVar, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : bVar, (i12 & 16) != 0 ? null : pinchToZoomSource, (i12 & 32) == 0 ? eVar : null);
    }
}
