package com.avito.android.user_advert.advert.items.multi_urgency.anim;

import Y61.k;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ViewAnimator;
import com.avito.android.lib.design.spinner.Spinner;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiUrgencyShowingLoaderDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/anim/g;", "Lcom/avito/android/user_advert/advert/items/multi_urgency/anim/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Spinner f309635d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f309636e;

    public g(@k Spinner spinner, @k View view) {
        super(spinner, view);
        this.f309635d = spinner;
        this.f309636e = view;
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.anim.b
    public final void a() {
        View view = this.f309636e;
        view.setVisibility(0);
        Spinner spinner = this.f309635d;
        spinner.setVisibility(0);
        view.setAlpha(0.8f);
        spinner.setAlpha(1.0f);
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.anim.a
    @k
    public final ObjectAnimator b(@k View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewAnimator.ALPHA, 0.0f, view.equals(this.f309635d) ? 1.0f : 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        return objectAnimatorOfFloat;
    }

    @Override // com.avito.android.user_advert.advert.items.multi_urgency.anim.a, com.avito.android.user_advert.advert.items.multi_urgency.anim.b
    public final void start() {
        this.f309636e.setVisibility(0);
        this.f309635d.setVisibility(0);
        super.start();
    }
}
