package com.avito.android.serp.adapter.carousel_gig;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.GigShiftInfo;
import com.avito.android.remote.model.Image;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselGigShiftView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_gig/i;", "Lcom/avito/android/serp/adapter/carousel_gig/h;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.android.serp.c implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f269098k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f269099b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f269100c;

    /* renamed from: d, reason: collision with root package name */
    public final DescriptionParameterItem f269101d;

    /* renamed from: e, reason: collision with root package name */
    public final DescriptionParameterItem f269102e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f269103f;

    /* renamed from: g, reason: collision with root package name */
    public final SimpleDraweeView f269104g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f269105h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f269106i;

    /* renamed from: j, reason: collision with root package name */
    public final Button f269107j;

    public i(@k View view) {
        super(view);
        this.f269099b = view;
        this.f269100c = (TextView) view.findViewById(R.id.gig_title);
        this.f269101d = (DescriptionParameterItem) view.findViewById(R.id.gig_shift_1);
        this.f269102e = (DescriptionParameterItem) view.findViewById(R.id.gig_shift_2);
        this.f269103f = (TextView) view.findViewById(R.id.gig_more_shifts);
        this.f269104g = (SimpleDraweeView) view.findViewById(R.id.gig_seller_logo);
        this.f269105h = (TextView) view.findViewById(R.id.gig_seller_name);
        this.f269106i = (TextView) view.findViewById(R.id.gig_seller_location);
        this.f269107j = (Button) view.findViewById(R.id.gig_button);
    }

    public static void B80(DescriptionParameterItem descriptionParameterItem, GigShiftInfo.GigShift gigShift) {
        if (gigShift == null) {
            D6.g(descriptionParameterItem);
            return;
        }
        D6.H(descriptionParameterItem);
        descriptionParameterItem.getLeftTextView().setText(descriptionParameterItem.getResources().getString(R.string.gig_shift_template, gigShift.getDate(), gigShift.getTime(), gigShift.getDuration()));
        descriptionParameterItem.getRightTextView().setText(gigShift.getPrice());
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void Cy(@l GigShiftInfo.GigShift gigShift) {
        B80(this.f269102e, gigShift);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void Fm(@l String str) {
        I5.a(this.f269106i, str, true);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void NN(@l Image image) {
        C35949t5.c(this.f269104g, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void Pf(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f269099b);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void Sk() {
        D6.w(this.f269099b);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void jv(@l String str) {
        I5.a(this.f269103f, str, true);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void m1(@l String str) {
        I5.a(this.f269105h, str, true);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void pj() {
        D6.H(this.f269099b);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void r1(@l String str, @l Y41.a<G0> aVar) {
        Button button = this.f269107j;
        com.avito.android.lib.design.button.b.a(button, str, true);
        button.setOnClickListener(new o(9, aVar));
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void setTitle(@l String str) {
        I5.a(this.f269100c, str, true);
    }

    @Override // com.avito.android.serp.adapter.carousel_gig.h
    public final void vx(@l GigShiftInfo.GigShift gigShift) {
        B80(this.f269101d, gigShift);
    }
}
