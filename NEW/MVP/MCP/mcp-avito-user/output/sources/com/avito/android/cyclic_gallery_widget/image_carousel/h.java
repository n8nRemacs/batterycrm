package com.avito.android.cyclic_gallery_widget.image_carousel;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.circular_progress.a;
import com.avito.android.lib.util.layout.RatioLinearLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import j.InterfaceC42150f;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: CarouselActionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/image_carousel/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/g;", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f132010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatioLinearLayout f132011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f132012d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageButton f132013e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f132014f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Float f132015g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f132016h;

    /* compiled from: CarouselActionItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/a;", "invoke", "()Lcom/avito/android/lib/deprecated_design/circular_progress/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.lib.deprecated_design.circular_progress.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.lib.deprecated_design.circular_progress.a invoke() {
            h hVar = h.this;
            com.avito.android.lib.deprecated_design.circular_progress.a aVarA = new a.C5243a(hVar.f132010b.getContext(), false, 2, null).a();
            aVarA.f177884f = Integer.valueOf(D6.j(hVar.f132010b, 20));
            return aVarA;
        }
    }

    public h(@Y61.k View view) {
        super(view);
        this.f132010b = view;
        this.f132011c = (RatioLinearLayout) view;
        this.f132012d = (TextView) view.findViewById(R.id.action_title);
        this.f132013e = (ImageButton) view.findViewById(R.id.icon);
        this.f132014f = C42727D.c(new a());
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.g
    @Y61.k
    public final z<G0> A() {
        return C37722i.a(this.f132010b);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.g
    public final void Aa(int i12) {
        this.f132010b.setBackgroundResource(i12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.g
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f132016h = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f132016h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.g
    public final void ke(@InterfaceC42150f int i12) {
        this.f132012d.setTextAppearance(C35835l0.j(i12, this.f132010b.getContext()));
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.g
    public final void q0(float f12) {
        if (L.d(this.f132015g, f12)) {
            return;
        }
        RatioLinearLayout ratioLinearLayout = this.f132011c;
        ratioLinearLayout.setRatio(f12);
        ratioLinearLayout.requestLayout();
        this.f132015g = Float.valueOf(f12);
    }

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.g
    public final void wN(@Y61.k String str, int i12, @Y61.l Integer num, @Y61.k PhoneLoadingState phoneLoadingState) {
        boolean z12 = phoneLoadingState == PhoneLoadingState.f430441b;
        View view = this.f132010b;
        view.setEnabled(z12);
        this.f132012d.setText(str);
        Drawable drawableA = num != null ? C43852a.a(view.getContext(), num.intValue()) : null;
        ImageButton imageButton = this.f132013e;
        imageButton.setBackground(drawableA);
        PhoneLoadingState phoneLoadingState2 = PhoneLoadingState.f430442c;
        InterfaceC42726C interfaceC42726C = this.f132014f;
        if (phoneLoadingState == phoneLoadingState2) {
            imageButton.setImageDrawable((com.avito.android.lib.deprecated_design.circular_progress.a) interfaceC42726C.getValue());
            ((com.avito.android.lib.deprecated_design.circular_progress.a) interfaceC42726C.getValue()).start();
        } else {
            imageButton.setImageResource(i12);
            ((com.avito.android.lib.deprecated_design.circular_progress.a) interfaceC42726C.getValue()).stop();
        }
    }
}
