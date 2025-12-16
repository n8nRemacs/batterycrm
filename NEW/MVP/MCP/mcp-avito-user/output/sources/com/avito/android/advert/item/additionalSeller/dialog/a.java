package com.avito.android.advert.item.additionalSeller.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.remote.model.DevelopmentFeature;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DevelopmentFeatureBottomSheetDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/dialog/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends d {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f72567F = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final DevelopmentFeature f72568E;

    /* compiled from: DevelopmentFeatureBottomSheetDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.additionalSeller.dialog.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2179a extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = (a) this.receiver;
            int i12 = a.f72567F;
            aVar.getClass();
            TextView textView = (TextView) view2.findViewById(R.id.description);
            DevelopmentFeature developmentFeature = aVar.f72568E;
            I5.a(textView, developmentFeature.getDescription(), false);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.images);
            for (Image image : developmentFeature.getImages()) {
                View viewInflate = LayoutInflater.from(view2.getContext()).inflate(R.layout.development_feature_image, (ViewGroup) null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, com.avito.android.actions_sheet.a.d(view2, R.dimen.development_feature_image_height));
                marginLayoutParams.setMargins(0, 0, 0, y6.b(10));
                viewInflate.setLayoutParams(marginLayoutParams);
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate;
                simpleDraweeView.e(C35829k2.c(image, simpleDraweeView, 2, 22).d());
                linearLayout.addView(simpleDraweeView);
            }
            return G0.f406611a;
        }
    }

    public a(@k Context context, @k DevelopmentFeature developmentFeature) {
        super(context, R.style.RealtyBottomSheetDialog);
        this.f72568E = developmentFeature;
        d.M(this, developmentFeature.getName(), true, true, 2);
        C(R.layout.development_feature_content, new C2179a(1, this, a.class, "onViewInflate", "onViewInflate(Landroid/view/View;)V", 0));
        T();
        setCanceledOnTouchOutside(true);
    }
}
