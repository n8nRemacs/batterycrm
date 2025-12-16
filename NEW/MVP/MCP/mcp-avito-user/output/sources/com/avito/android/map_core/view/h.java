package com.avito.android.map_core.view;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactoryKt;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerItemKt;
import com.avito.android.avito_map.marker.MarkerWithPrice;
import com.avito.android.avito_map.marker.PartialMarker;
import com.avito.android.map_core.view.marker.MarkerPinView;
import com.avito.android.map_core.view.marker.MarkerPinWithBrandView;
import com.avito.android.map_core.view.marker.MarkerPinWithPriceView;
import com.avito.android.map_core.view.marker.MarkerRashViewImpl;
import com.avito.android.map_core.view.marker.MarkerSpecialPinViewImpl;
import com.avito.android.remote.model.search.map.Brand;
import com.avito.android.remote.model.search.map.Form;
import j.I;
import java.util.Arrays;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MarkerIconFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/map_core/view/h;", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "a", "b", "c", "d", "e", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements AvitoMarkerIconFactory {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Activity f185725a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Activity f185726b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f185727c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public d f185728d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public c f185729e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public b f185730f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public e f185731g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f185732h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final HashMap<String, Bitmap> f185733i = new HashMap<>();

    /* compiled from: MarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/h$a;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f185734a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MarkerPinView f185735b;

        public a(@k View view) {
            this.f185734a = view;
            this.f185735b = (MarkerPinView) view;
        }
    }

    /* compiled from: MarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/h$b;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f185736a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MarkerPinWithBrandView f185737b;

        public b(@k View view) {
            this.f185736a = view;
            this.f185737b = (MarkerPinWithBrandView) view;
        }
    }

    /* compiled from: MarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/h$c;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f185738a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MarkerPinWithPriceView f185739b;

        public c(@k View view) {
            this.f185738a = view;
            this.f185739b = (MarkerPinWithPriceView) view;
        }
    }

    /* compiled from: MarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/h$d;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f185740a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MarkerRashViewImpl f185741b;

        public d(@k View view) {
            this.f185740a = view;
            this.f185741b = (MarkerRashViewImpl) view;
        }
    }

    /* compiled from: MarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/h$e;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final View f185742a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MarkerSpecialPinViewImpl f185743b;

        public e(@k View view) {
            this.f185742a = view;
            this.f185743b = (MarkerSpecialPinViewImpl) view;
        }
    }

    /* compiled from: MarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/map_core/view/h$f", "Lcom/bumptech/glide/request/target/e;", "Landroid/graphics/drawable/Drawable;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends com.bumptech.glide.request.target.e<Drawable> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Bitmap, G0> f185744e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AvitoMarkerItem f185745f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f185746g;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.l<? super Bitmap, G0> lVar, h hVar, AvitoMarkerItem avitoMarkerItem, b bVar) {
            this.f185744e = lVar;
            this.f185745f = avitoMarkerItem;
            this.f185746g = bVar;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void b(@l Drawable drawable) {
            this.f185744e.invoke(null);
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            MarkerItem.Pin pin = (MarkerItem.Pin) this.f185745f;
            b bVar = this.f185746g;
            MarkerPinWithBrandView markerPinWithBrandView = bVar.f185737b;
            markerPinWithBrandView.setTextAndIcon(pin);
            markerPinWithBrandView.setView(pin);
            markerPinWithBrandView.b(pin, (Drawable) obj);
            this.f185744e.invoke(AvitoMarkerIconFactoryKt.toBitmap(bVar.f185736a));
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.q
        public final void g(@l Drawable drawable) {
            MarkerItem.Pin pin = (MarkerItem.Pin) this.f185745f;
            b bVar = this.f185746g;
            MarkerPinWithBrandView markerPinWithBrandView = bVar.f185737b;
            markerPinWithBrandView.setTextAndIcon(pin);
            markerPinWithBrandView.setView(pin);
            markerPinWithBrandView.b(pin, null);
            this.f185744e.invoke(AvitoMarkerIconFactoryKt.toBitmap(bVar.f185736a));
        }
    }

    @Inject
    public h(@k Activity activity) {
        this.f185725a = activity;
        this.f185726b = activity;
        this.f185732h = LayoutInflater.from(activity);
    }

    public final Bitmap a(PartialMarker partialMarker) {
        String str = partialMarker instanceof MarkerWithPrice ? String.format("%s%s%s%s%s%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(partialMarker.getCount()), Boolean.valueOf(partialMarker.getSelected()), Boolean.valueOf(partialMarker.isViewed()), ((MarkerWithPrice) partialMarker).getPrice(), Boolean.valueOf(partialMarker.isFavorite()), partialMarker.getHighlight(), partialMarker.getForm()}, 7)) : String.format("selected%s%s%s%s%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(partialMarker.getCount()), Boolean.valueOf(partialMarker.getSelected()), Boolean.valueOf(partialMarker.isViewed()), Boolean.valueOf(partialMarker.isFavorite()), partialMarker.getHighlight(), partialMarker.getForm()}, 6));
        HashMap<String, Bitmap> map = this.f185733i;
        Bitmap bitmap = map.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        a aVar = this.f185727c;
        if (aVar == null) {
            aVar = new a(b(R.layout.search_map_pin_marker));
            this.f185727c = aVar;
        }
        MarkerPinView markerPinView = aVar.f185735b;
        markerPinView.setTextAndFavorite(partialMarker);
        markerPinView.setPinView(partialMarker);
        Bitmap bitmap2 = AvitoMarkerIconFactoryKt.toBitmap(aVar.f185734a);
        map.put(str, bitmap2);
        return bitmap2;
    }

    public final View b(@I int i12) {
        View viewInflate = this.f185732h.inflate(i12, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return viewInflate;
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    @l
    public final Bitmap getIcon(@k AvitoMarkerItem avitoMarkerItem) {
        if (avitoMarkerItem instanceof MarkerItem.MyLocation) {
            Drawable drawable = this.f185726b.getDrawable(com.avito.android.avito_map.R.drawable.my_location_pin);
            if (drawable == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }
        boolean z12 = avitoMarkerItem instanceof MarkerItem.Rash;
        HashMap<String, Bitmap> map = this.f185733i;
        if (z12) {
            MarkerItem.Rash rash = (MarkerItem.Rash) avitoMarkerItem;
            if (rash.getSelected()) {
                return a((PartialMarker) avitoMarkerItem);
            }
            String str = String.format(MarkerItemKt.ID_RASH, Arrays.copyOf(new Object[]{Integer.valueOf(rash.getCount()), Boolean.valueOf(rash.getSelected()), Boolean.valueOf(rash.isViewed()), Boolean.valueOf(rash.isFavorite()), rash.getHighlight(), rash.getForm()}, 6));
            Bitmap bitmap = map.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            d dVar = this.f185728d;
            if (dVar == null) {
                dVar = new d(b(R.layout.search_map_rash_marker));
                this.f185728d = dVar;
            }
            dVar.f185741b.setStyleByItemParams(rash);
            Bitmap bitmap2 = AvitoMarkerIconFactoryKt.toBitmap(dVar.f185740a);
            map.put(str, bitmap2);
            return bitmap2;
        }
        if (avitoMarkerItem instanceof MarkerItem.Pin) {
            MarkerItem.Pin pin = (MarkerItem.Pin) avitoMarkerItem;
            if (pin.getPrice() == null || pin.getForm() != Form.Priced) {
                return a((PartialMarker) avitoMarkerItem);
            }
            c cVar = this.f185729e;
            if (cVar == null) {
                cVar = new c(b(R.layout.search_map_with_price_pin_marker));
                this.f185729e = cVar;
            }
            MarkerPinWithPriceView markerPinWithPriceView = cVar.f185739b;
            markerPinWithPriceView.setTextAndIcon(pin);
            markerPinWithPriceView.setView(pin);
            return AvitoMarkerIconFactoryKt.toBitmap(cVar.f185738a);
        }
        if (!(avitoMarkerItem instanceof MarkerItem.SpecialPin)) {
            return null;
        }
        MarkerItem markerItem = (MarkerItem) avitoMarkerItem;
        String str2 = String.format(MarkerItemKt.ID_SPECIAL_PIN, Arrays.copyOf(new Object[]{markerItem.getF304960b()}, 1));
        Bitmap bitmap3 = map.get(str2);
        if (bitmap3 != null) {
            return bitmap3;
        }
        e eVar = this.f185731g;
        if (eVar == null) {
            eVar = new e(b(R.layout.search_map_special_pin_marker));
            this.f185731g = eVar;
        }
        eVar.f185743b.setSpecialItem((MarkerItem.SpecialPin) markerItem);
        Bitmap bitmap4 = AvitoMarkerIconFactoryKt.toBitmap(eVar.f185742a);
        map.put(str2, bitmap4);
        return bitmap4;
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    public final void getIconAsync(@k AvitoMarkerItem avitoMarkerItem, @k Y41.l<? super Bitmap, G0> lVar) {
        if (avitoMarkerItem instanceof MarkerItem.Pin) {
            MarkerItem.Pin pin = (MarkerItem.Pin) avitoMarkerItem;
            Brand brand = pin.getBrand();
            if ((brand != null ? brand.getImage() : null) != null) {
                b bVar = this.f185730f;
                if (bVar == null) {
                    bVar = new b(b(R.layout.search_map_with_brand_pin_marker));
                    this.f185730f = bVar;
                }
                Activity activity = this.f185726b;
                com.bumptech.glide.util.k.c(activity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                com.bumptech.glide.j jVarD = com.bumptech.glide.b.b(activity).f338687g.d(activity);
                Brand brand2 = pin.getBrand();
                jVarD.l(Uri.parse(brand2 != null ? brand2.getImage() : null)).g(com.bumptech.glide.load.engine.l.f339087a).B(new f(lVar, this, avitoMarkerItem, bVar));
                return;
            }
        }
        lVar.invoke(null);
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    /* renamed from: getZoomPadding */
    public final int getF1367g() {
        return this.f185725a.getResources().getDimensionPixelSize(R.dimen.search_map_lite_zoom_padding);
    }
}
