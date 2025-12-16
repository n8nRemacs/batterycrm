package com.avito.android.advert.item.compatibility.v3.item.brand_compatibility;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: BrandCompatibilityView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility/h;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final int f74432f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74433b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f74434c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f74435d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f74436e;

    /* compiled from: BrandCompatibilityView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/item/brand_compatibility/i$a;", "", "<init>", "()V", "", "BRAND_PLACEHOLDER_DRAWABLE_RES", "I", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f74432f = R.drawable.ic_garage_compatibility_v3_brand_placeholder;
    }

    public i(@k View view) {
        super(view);
        this.f74433b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74434c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74435d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74436e = (SimpleDraweeView) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.h
    public final void se(@k d dVar, @k com.avito.android.advert.item.compatibility.v3.b bVar) {
        G0 g02;
        Image imageDependsOnThemeOrDefault;
        SparePartsGroup sparePartsGroupP = dVar.getF74442c();
        String str = sparePartsGroupP.f80445d;
        TextView textView = this.f74434c;
        I5.a(textView, str, false);
        TextView textView2 = this.f74435d;
        I5.a(textView2, sparePartsGroupP.f80446e, false);
        SimpleDraweeView simpleDraweeView = this.f74436e;
        v.b(simpleDraweeView, R.dimen.garage_compatibility_item_v3_image_corner_radius);
        UniversalImage universalImage = sparePartsGroupP.f80443b;
        int i12 = f74432f;
        if (universalImage == null || (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) == null) {
            g02 = null;
        } else {
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(simpleDraweeView));
            Drawable drawableA = C43852a.a(simpleDraweeView.getContext(), i12);
            ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
            aVar.f169492j = drawableA;
            aVar.f169493k = scaleType;
            aVar.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
            aVar.f169486d = true;
            aVar.c();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            simpleDraweeView.setImageResource(i12);
            D6.H(simpleDraweeView);
        }
        View view = this.f74433b;
        boolean z12 = sparePartsGroupP.f80447f;
        if (z12) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new com.avito.android.advert.closed.b(12, bVar, sparePartsGroupP));
        }
        int i13 = R.attr.gray36;
        int i14 = z12 ? R.attr.gray36 : R.attr.black;
        if (!z12) {
            i13 = R.attr.gray54;
        }
        textView.setTextColor(C35835l0.d(i14, view.getContext()));
        textView2.setTextColor(C35835l0.d(i13, view.getContext()));
    }
}
