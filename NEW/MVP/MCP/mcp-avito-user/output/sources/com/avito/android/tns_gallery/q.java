package com.avito.android.tns_gallery;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TnsGalleryItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tns_gallery/q;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tns_gallery/n;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f301550f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f301551b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f301552c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f301553d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public float[] f301554e;

    public q(@Y61.k View view) {
        super(view);
        this.f301551b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f301552c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f301553d = (FrameLayout) viewFindViewById2;
    }

    @Override // com.avito.android.tns_gallery.n
    public final void Ds(@Y61.k float[] fArr) {
        this.f301554e = fArr;
        SimpleDraweeView simpleDraweeView = this.f301552c;
        int iD2 = C35835l0.d(R.attr.gray8, simpleDraweeView.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iD2);
        gradientDrawable.setCornerRadii(this.f301554e);
        simpleDraweeView.setBackground(gradientDrawable);
        GW0.a aVar = (GW0.a) simpleDraweeView.getHierarchy();
        RoundingParams roundingParamsA = RoundingParams.a(fArr);
        RoundingParams.RoundingMethod roundingMethod = RoundingParams.RoundingMethod.f340158b;
        roundingParamsA.f340151a = roundingMethod;
        roundingParamsA.f(0.0f);
        roundingParamsA.f340154d = C35835l0.d(R.attr.white, simpleDraweeView.getContext());
        roundingParamsA.f340151a = roundingMethod;
        aVar.s(roundingParamsA);
    }

    @Override // com.avito.android.tns_gallery.n
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f301553d.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(29, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f301553d.setOnClickListener(null);
    }

    @Override // com.avito.android.tns_gallery.n
    public final void m70(boolean z12) {
        SimpleDraweeView simpleDraweeView = this.f301552c;
        if (z12) {
            simpleDraweeView.getHierarchy().n(s.c.f340137i);
        } else {
            simpleDraweeView.getHierarchy().n(s.c.f340133e);
        }
    }

    @Override // com.avito.android.tns_gallery.n
    public final void qu(@Y61.k com.avito.android.image_loader.a aVar) {
        SimpleDraweeView simpleDraweeView = this.f301552c;
        p pVar = simpleDraweeView.getScaleType() == ImageView.ScaleType.FIT_CENTER ? new p(this) : null;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f169487e = pVar;
        aVarA.d(aVar);
        aVarA.f169490h = new o(this);
        aVarA.c();
    }

    @Override // com.avito.android.tns_gallery.n
    public final void sB(int i12, int i13) {
        FrameLayout frameLayout = this.f301553d;
        frameLayout.getLayoutParams().width = i12;
        frameLayout.getLayoutParams().height = i13;
        frameLayout.requestLayout();
    }
}
