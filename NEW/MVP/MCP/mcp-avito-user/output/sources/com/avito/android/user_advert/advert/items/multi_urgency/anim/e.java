package com.avito.android.user_advert.advert.items.multi_urgency.anim;

import Y61.k;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ViewAnimator;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiUrgencyHidingLoaderDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/anim/e;", "Lcom/avito/android/user_advert/advert/items/multi_urgency/anim/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Spinner f309633d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f309634e;

    public e(@k Spinner spinner, @k View view) {
        super(spinner, view);
        this.f309633d = spinner;
        this.f309634e = view;
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.anim.b
    public final void a() {
        this.f309634e.setVisibility(8);
        this.f309633d.setVisibility(8);
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.anim.a
    @k
    public final ObjectAnimator b(@k View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewAnimator.ALPHA, view.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new d(this));
        return objectAnimatorOfFloat;
    }
}
