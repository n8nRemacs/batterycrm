package com.avito.android.select.glow_animation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.glow_animation_text_view.GlowTextAnimationView;
import com.avito.android.glow_animation_text_view.GradientMaskTextView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GlowAnimationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/glow_animation/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/glow_animation/k;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GlowTextAnimationView f265403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Checkbox f265404c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f265405d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f265406e;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f265407b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f265408c;

        public a(Y41.a aVar, View view) {
            this.f265407b = view;
            this.f265408c = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f265408c.invoke();
            this.f265407b.removeOnLayoutChangeListener(this);
        }
    }

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.glow);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.glow_animation_text_view.GlowTextAnimationView");
        }
        this.f265403b = (GlowTextAnimationView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.checkbox);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f265404c = (Checkbox) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.left_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f265405d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.right_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f265406e = (SimpleDraweeView) viewFindViewById4;
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void Gq(@Y61.l UniversalImage universalImage) {
        Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(this.itemView, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f265406e;
        Uri uriD = C35829k2.c(imageQ, simpleDraweeView, 1, 22).d();
        D6.G(simpleDraweeView, uriD != null);
        if (uriD != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriD);
            aVarA.c();
        }
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void QO(boolean z12) {
        D6.G(this.f265404c, z12);
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void SO(@Y61.k String str, @Y61.k ArrayList arrayList) {
        GlowTextAnimationView glowTextAnimationView = this.f265403b;
        glowTextAnimationView.setText(str);
        GradientMaskTextView gradientMaskTextView = glowTextAnimationView.f161199c;
        gradientMaskTextView.f161206g = true;
        gradientMaskTextView.f161208i = arrayList;
        gradientMaskTextView.requestLayout();
        gradientMaskTextView.invalidate();
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void Uk(@Y61.l UniversalImage universalImage) {
        Image imageQ = universalImage != null ? com.avito.android.actions_sheet.a.q(this.itemView, universalImage) : null;
        SimpleDraweeView simpleDraweeView = this.f265405d;
        Uri uriD = C35829k2.c(imageQ, simpleDraweeView, 1, 22).d();
        D6.G(simpleDraweeView, uriD != null);
        if (uriD != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriD);
            aVarA.c();
        }
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void Y6() {
        this.f265403b.a();
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        D6.a(aVar, this.itemView);
    }

    @Override // com.avito.android.select.glow_animation.k
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ValueAnimator valueAnimator = this.f265403b.f161200d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void nc(@Y61.k Y41.a<G0> aVar) {
        View view = this.itemView;
        view.addOnLayoutChangeListener(new a(aVar, view));
    }

    @Override // com.avito.android.select.glow_animation.k
    public final void vS(int i12) {
        if (this.itemView.getPaddingLeft() == i12 && this.itemView.getPaddingRight() == i12) {
            return;
        }
        View view = this.itemView;
        view.setPadding(i12, view.getPaddingTop(), i12, view.getPaddingBottom());
    }
}
