package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.transition.L;
import androidx.transition.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ViewCopies.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/animations/p;", "Landroidx/transition/P;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class p extends P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f367979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroupOverlay f367980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f367981c;

    public p(View view, ViewGroupOverlay viewGroupOverlay, ImageView imageView) {
        this.f367979a = view;
        this.f367980b = viewGroupOverlay;
        this.f367981c = imageView;
    }

    @Override // androidx.transition.P, androidx.transition.L.f
    public final void a() {
        this.f367980b.remove(this.f367981c);
    }

    @Override // androidx.transition.P, androidx.transition.L.f
    public final void c() {
        ImageView imageView = this.f367981c;
        if (imageView.getParent() == null) {
            this.f367980b.add(imageView);
        }
    }

    @Override // androidx.transition.P, androidx.transition.L.f
    public final void d(@Y61.k L l12) {
        this.f367979a.setVisibility(4);
    }

    @Override // androidx.transition.P, androidx.transition.L.f
    public final void e(@Y61.k L l12) {
        View view = this.f367979a;
        view.setTag(R.id.save_overlay_view, null);
        view.setVisibility(0);
        this.f367980b.remove(this.f367981c);
        l12.A(this);
    }
}
