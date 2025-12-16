package com.avito.android.beduin.common.container.horizontal_slider;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.container.horizontal_slider.BeduinBaseHorizontalSliderLayout;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import kotlin.Metadata;

/* compiled from: BeduinBaseHorizontalSliderLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/a;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public boolean f103094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinBaseHorizontalSliderLayout<Object> f103095c;

    public a(BeduinBaseHorizontalSliderLayout<Object> beduinBaseHorizontalSliderLayout) {
        this.f103095c = beduinBaseHorizontalSliderLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        BeduinBaseHorizontalSliderLayout<Object> beduinBaseHorizontalSliderLayout = this.f103095c;
        ValueAnimator valueAnimator = beduinBaseHorizontalSliderLayout.f103065g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i12 == 1) {
            this.f103094b = true;
            io.reactivex.rxjava3.internal.observers.m mVar = beduinBaseHorizontalSliderLayout.f103070l;
            if (mVar != null) {
                DisposableHelper.a(mVar);
            }
            beduinBaseHorizontalSliderLayout.f103070l = null;
            beduinBaseHorizontalSliderLayout.f103071m = 0L;
        }
        if (i12 == 0) {
            boolean z12 = !this.f103094b;
            BeduinBaseHorizontalSliderLayout.a aVar = beduinBaseHorizontalSliderLayout.listener;
            if (aVar != null) {
                aVar.b((LinearLayoutManager.SavedState) beduinBaseHorizontalSliderLayout.f103061c.Y0(), z12);
            }
            this.f103094b = false;
        }
    }
}
