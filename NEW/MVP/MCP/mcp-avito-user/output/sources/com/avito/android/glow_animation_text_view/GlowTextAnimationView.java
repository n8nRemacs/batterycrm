package com.avito.android.glow_animation_text_view;

import PH.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.view.d;
import com.avito.android.util.D1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: GlowTextAnimationView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/glow_animation_text_view/GlowTextAnimationView;", "Landroid/widget/FrameLayout;", "", "animationText", "Lkotlin/G0;", "setText", "(Ljava/lang/CharSequence;)V", "_avito_glow-animation-text-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GlowTextAnimationView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f161197e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f161198b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GradientMaskTextView f161199c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ValueAnimator f161200d;

    @j
    public GlowTextAnimationView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        PH.a aVar = new PH.a(0L, 0, 0, 0L, 0L, 31, null);
        ValueAnimator valueAnimator = this.f161200d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f161203d = this.f161199c.getF161203d() * 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-f161203d, r1.getWidth() + f161203d);
        valueAnimatorOfFloat.setDuration(aVar.f12941a);
        D1.a(valueAnimatorOfFloat, aVar.f12942b);
        valueAnimatorOfFloat.setRepeatMode(aVar.f12943c);
        valueAnimatorOfFloat.setStartDelay(aVar.f12944d);
        valueAnimatorOfFloat.addUpdateListener(new AV.a(this, 3));
        valueAnimatorOfFloat.addListener(new b(this, new l0.a()));
        this.f161200d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void setText(@k CharSequence animationText) {
        this.f161198b.setText(animationText);
        this.f161199c.setText(animationText);
    }

    public GlowTextAnimationView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R.attr.textViewStyle : i12);
        LayoutInflater.from(new d(context, com.avito.android.R.style.Theme_DesignSystem_Re23)).inflate(com.avito.android.R.layout.glow_text_animation_view, this);
        View viewFindViewById = findViewById(com.avito.android.R.id.label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f161198b = (TextView) viewFindViewById;
        this.f161199c = (GradientMaskTextView) findViewById(com.avito.android.R.id.glow_mask);
    }
}
