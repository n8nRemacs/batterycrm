package com.avito.android.advert.item.select.benefits;

import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.AdvertAutoSelect;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.V0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAutoSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/benefits/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/select/benefits/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f79359f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f79360b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f79361c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f79362d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f79363e;

    public k(@Y61.k View view, @Y61.k a aVar) {
        super(view);
        this.f79360b = aVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79361c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.benefits_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f79362d = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f79363e = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.select.benefits.j
    public final void Y0(@l String str, @l Y41.a<G0> aVar) {
        Button button = this.f79363e;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.advert.item.parking.h(13, aVar));
    }

    @Override // com.avito.android.advert.item.select.benefits.j
    public final void b(@l String str) {
        I5.a(this.f79361c, str, false);
    }

    @Override // com.avito.android.advert.item.select.benefits.j
    public final void y4(@l List<AdvertAutoSelect.AutoSelectBenefit> list) {
        Drawable drawableH;
        ViewGroup viewGroup = this.f79362d;
        viewGroup.removeAllViews();
        boolean zA2 = O2.a(list);
        D6.G(viewGroup, zA2);
        if (zA2) {
            this.f79360b.getClass();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            for (AdvertAutoSelect.AutoSelectBenefit autoSelectBenefit : list) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_auto_select_benefit, viewGroup, false);
                c cVar = new c(viewInflate);
                cVar.f79345b.setText(autoSelectBenefit.getText());
                AdvertAutoSelect.AutoSelectBenefit.LocalIcon localIcon = autoSelectBenefit.getLocalIcon();
                if (localIcon != null) {
                    String color = localIcon.getColor();
                    if (color == null) {
                        color = AvitoMapMarkerKt.AMENITY_TYPE_BLACK;
                    }
                    Integer numA = com.avito.android.lib.util.e.a(color);
                    ImageView imageView = cVar.f79344a;
                    Drawable drawable = null;
                    Integer numValueOf = numA != null ? Integer.valueOf(C35835l0.d(numA.intValue(), imageView.getContext())) : null;
                    Integer numA2 = q.a(localIcon.getName());
                    if (numA2 != null && (drawableH = C35835l0.h(numA2.intValue(), imageView.getContext())) != null) {
                        if (numValueOf != null) {
                            V0.d(drawableH, numValueOf.intValue());
                        }
                        drawable = drawableH;
                    }
                    C35821j2.a(imageView, drawable);
                }
                viewGroup.addView(viewInflate);
            }
        }
    }
}
