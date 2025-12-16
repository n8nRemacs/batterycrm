package com.avito.android.universal_map.map.common.marker;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactoryKt;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.universal_map.map.common.marker.Marker;
import com.avito.android.universal_map.map.common.marker.MarkerItem;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.LinkedHashMap;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapMarkerIconFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/m;", "Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "a", "b", "c", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements AvitoMarkerIconFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutInflater f304986a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f304987b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f304988c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f304989d = C42727D.c(new p(this));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f304990e = C42727D.c(new o(this));

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f304991f = C42727D.c(new n(this));

    /* compiled from: UniversalMapMarkerIconFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/m$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f304992a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f304993b;

        public a(@Y61.k View view) {
            this.f304992a = view;
            View viewFindViewById = view.findViewById(R.id.text_view);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.f304993b = (TextView) viewFindViewById;
        }

        public final void a(int i12) throws Resources.NotFoundException {
            int dimensionPixelSize = this.f304992a.getResources().getDimensionPixelSize(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? R.dimen.universal_map_21dp : R.dimen.universal_map_18dp : R.dimen.universal_map_14dp : R.dimen.universal_map_10dp : R.dimen.universal_map_6dp);
            TextView textView = this.f304993b;
            textView.setPadding(textView.getPaddingLeft(), dimensionPixelSize, textView.getPaddingRight(), dimensionPixelSize);
        }
    }

    /* compiled from: UniversalMapMarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/m$b;", "Lcom/avito/android/universal_map/map/common/marker/m$a;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f304994c;

        public b(@Y61.k View view) {
            super(view);
            this.f304994c = (TextView) view.findViewById(R.id.label);
        }
    }

    /* compiled from: UniversalMapMarkerIconFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/m$c;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f304995a;

        /* renamed from: b, reason: collision with root package name */
        public final CardView f304996b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ImageView f304997c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f304998d;

        public c(@Y61.k View view) {
            this.f304995a = view;
            this.f304996b = (CardView) view.findViewById(R.id.label_container);
            this.f304997c = (ImageView) view.findViewById(R.id.marker);
            this.f304998d = (TextView) view.findViewById(R.id.label);
        }
    }

    /* compiled from: UniversalMapMarkerIconFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f304999a;

        static {
            int[] iArr = new int[Marker.Pin.IconType.values().length];
            try {
                Marker.Pin.IconType iconType = Marker.Pin.IconType.f304934b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Marker.Pin.IconType iconType2 = Marker.Pin.IconType.f304934b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Marker.Pin.IconType iconType3 = Marker.Pin.IconType.f304934b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f304999a = iArr;
        }
    }

    public m(@Y61.k LayoutInflater layoutInflater, @Y61.k r rVar) {
        this.f304986a = layoutInflater;
        this.f304987b = rVar;
    }

    public static final View a(m mVar, LayoutInflater layoutInflater, int i12) {
        mVar.getClass();
        View viewInflate = layoutInflater.inflate(i12, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return viewInflate;
    }

    public static Bitmap b(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final int c(Marker.Pin.IconType iconType, boolean z12) {
        int i12;
        r rVar = this.f304987b;
        if (z12) {
            i12 = iconType != null ? d.f304999a[iconType.ordinal()] : -1;
            return i12 != 1 ? i12 != 2 ? i12 != 3 ? rVar.f305005c : rVar.f305011i : rVar.f305007e : rVar.f305009g;
        }
        i12 = iconType != null ? d.f304999a[iconType.ordinal()] : -1;
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? rVar.f305004b : rVar.f305010h : rVar.f305006d : rVar.f305008f;
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    @Y61.l
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final Bitmap getIcon(@Y61.k AvitoMarkerItem avitoMarkerItem) throws Resources.NotFoundException {
        Bitmap bitmap;
        int iIntValue;
        LinkedHashMap linkedHashMap = this.f304988c;
        Bitmap bitmap2 = (Bitmap) linkedHashMap.get(avitoMarkerItem.getMapId());
        if (bitmap2 != null) {
            return bitmap2;
        }
        boolean z12 = avitoMarkerItem instanceof MarkerItem.MyLocation;
        LayoutInflater layoutInflater = this.f304986a;
        if (z12) {
            bitmap = b(layoutInflater.getContext().getDrawable(this.f304987b.f305003a));
        } else if (avitoMarkerItem instanceof MarkerItem.Pin) {
            MarkerItem.Pin pin = (MarkerItem.Pin) avitoMarkerItem;
            bitmap = b(layoutInflater.getContext().getDrawable(c(pin.f304959f, pin.f304956c)));
        } else {
            int iB2 = 0;
            if (avitoMarkerItem instanceof MarkerItem.PinWithLabel) {
                MarkerItem.PinWithLabel pinWithLabel = (MarkerItem.PinWithLabel) avitoMarkerItem;
                c cVar = (c) this.f304989d.getValue();
                TextView textView = cVar.f304998d;
                String str = pinWithLabel.f304962d;
                AttributedText attributedText = pinWithLabel.f304963e;
                if (attributedText != null) {
                    com.avito.android.util.text.j.a(textView, attributedText, null);
                } else {
                    textView.setMaxLines(2);
                    I5.a(textView, str, false);
                }
                CardView cardView = cVar.f304996b;
                UniversalMapPointRect.HintLayout hintLayout = pinWithLabel.f304964f;
                if (hintLayout != null) {
                    Integer maxWidth = hintLayout.getMaxWidth();
                    TextView textView2 = cVar.f304998d;
                    if (maxWidth != null) {
                        textView2.setMaxWidth(y6.b(maxWidth.intValue()));
                    }
                    if (hintLayout.getCornerRadius() != null) {
                        cardView.setRadius(y6.b(r8.intValue()));
                    }
                    UniversalMapPointRect.HintLayout.Padding padding = hintLayout.getPadding();
                    if (padding != null) {
                        Integer left = padding.getLeft();
                        int iB3 = (left == null && (left = padding.getAll()) == null) ? 0 : y6.b(left.intValue());
                        Integer top = padding.getTop();
                        int iB4 = (top == null && (top = padding.getAll()) == null) ? 0 : y6.b(top.intValue());
                        Integer right = padding.getRight();
                        int iB5 = (right == null && (right = padding.getAll()) == null) ? 0 : y6.b(right.intValue());
                        Integer bottom = padding.getBottom();
                        if (bottom != null) {
                            iIntValue = bottom.intValue();
                        } else {
                            Integer all = padding.getAll();
                            if (all != null) {
                                iIntValue = all.intValue();
                            }
                            textView2.setPadding(iB3, iB4, iB5, iB2);
                        }
                        iB2 = y6.b(iIntValue);
                        textView2.setPadding(iB3, iB4, iB5, iB2);
                    }
                }
                cVar.f304997c.setImageResource(c(pinWithLabel.f304967i, pinWithLabel.f304961c));
                View view = cVar.f304995a;
                bitmap = (str == null && attributedText == null) ? AvitoMarkerIconFactoryKt.toBitmap(view) : AvitoMarkerIconFactoryKt.toBitmapWithShadowForCardView(view, cardView);
            } else if (avitoMarkerItem instanceof MarkerItem.Cluster) {
                a aVar = (a) this.f304991f.getValue();
                TextView textView3 = aVar.f304993b;
                String str2 = ((MarkerItem.Cluster) avitoMarkerItem).f304949b;
                I5.a(textView3, str2, false);
                aVar.a(str2.length());
                bitmap = AvitoMarkerIconFactoryKt.toBitmap(aVar.f304992a);
            } else {
                if (!(avitoMarkerItem instanceof MarkerItem.ClusterWithLabel)) {
                    throw new UnsupportedOperationException();
                }
                MarkerItem.ClusterWithLabel clusterWithLabel = (MarkerItem.ClusterWithLabel) avitoMarkerItem;
                b bVar = (b) this.f304990e.getValue();
                TextView textView4 = bVar.f304993b;
                String str3 = clusterWithLabel.f304953d;
                I5.a(textView4, str3, false);
                I5.a(bVar.f304994c, clusterWithLabel.f304952c, false);
                bVar.a(str3.length());
                bitmap = AvitoMarkerIconFactoryKt.toBitmap(bVar.f304992a);
            }
        }
        if (bitmap != null) {
            linkedHashMap.put(avitoMarkerItem.getMapId(), bitmap);
        }
        return bitmap;
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    public final void getIconAsync(@Y61.k AvitoMarkerItem avitoMarkerItem, @Y61.k Y41.l<? super Bitmap, G0> lVar) {
        AvitoMarkerIconFactory.DefaultImpls.getIconAsync(this, avitoMarkerItem, lVar);
    }

    @Override // com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory
    /* renamed from: getZoomPadding */
    public final int getF1367g() {
        return 0;
    }
}
