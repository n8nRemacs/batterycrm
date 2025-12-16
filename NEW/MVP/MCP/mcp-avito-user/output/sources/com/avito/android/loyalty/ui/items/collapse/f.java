package com.avito.android.loyalty.ui.items.collapse;

import Y61.k;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CollapseItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/items/collapse/f;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/items/collapse/h;", "Lcom/avito/android/loyalty/ui/items/collapse/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f183675b;

    @Inject
    public f(@k d dVar) {
        this.f183675b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        boolean z12 = aVar2.f183667d;
        RotateAnimation rotateAnimation = new RotateAnimation(z12 ? 0.0f : 180.0f, z12 ? 180.0f : 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(350L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        hVar.f183679c.startAnimation(rotateAnimation);
        hVar.f183678b.setText(aVar2.f183666c);
        hVar.itemView.setOnClickListener(new com.avito.android.lib.design.list_item.a(17, new e(this, aVar2)));
    }
}
