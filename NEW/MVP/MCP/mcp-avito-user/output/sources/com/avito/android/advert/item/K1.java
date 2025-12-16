package com.avito.android.advert.item;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.remote.model.item_popularity.ItemPopularity;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: View.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K1 implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h f71768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f71769c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ItemPopularity f71770d;

    public K1(l0.h hVar, I1 i12, ItemPopularity itemPopularity) {
        this.f71768b = hVar;
        this.f71769c = i12;
        this.f71770d = itemPopularity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        l0.h hVar = this.f71768b;
        View viewFindViewById = ((View) hVar.f406842b).findViewById(R.id.toast_item_popularity_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = ((View) hVar.f406842b).findViewById(R.id.toast_item_popularity_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.animation.AnimationView");
        }
        AnimationView animationView = (AnimationView) viewFindViewById2;
        I1 i110 = this.f71769c;
        boolean zB2 = com.avito.android.lib.util.darkTheme.c.b(i110.f71740s0);
        ItemPopularity itemPopularity = this.f71770d;
        String lottieLightUrl = zB2 ? itemPopularity.getImage().getLottieLightUrl() : itemPopularity.getImage().getLottieDarkUrl();
        animationView.setRepeatMode(AnimationView.RepeatMode.f178282c);
        animationView.setAnimationData(new AnimationView.a.e(lottieLightUrl, null, null, 6, null));
        com.avito.android.util.text.j.a(textView, itemPopularity.getToastText(), null);
        long toastTimeDelay = itemPopularity.getToastTimeDelay();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(i110.f71644C0, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, (-((LinearLayout) hVar.f406842b).getHeight()) - y6.b(12));
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        View view2 = (View) hVar.f406842b;
        com.avito.android.util.R0 r02 = i110.f71708g;
        Z1.a(view2, 1000L, r02.b(), new L1(hVar, objectAnimatorOfFloat));
        Z1.a((View) hVar.f406842b, 1400 + toastTimeDelay, r02.b(), new M1(objectAnimatorOfFloat));
        Z1.a((View) hVar.f406842b, toastTimeDelay + 1800, r02.b(), new N1(hVar));
    }
}
