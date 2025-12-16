package com.avito.android.map_core.utils;

import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleBottomSheetDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/utils/h;", "", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f185689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<FrameLayout> f185690b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f185691c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f185692d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f185693e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f185694f;

    public h(@Y61.k FrameLayout frameLayout) {
        this.f185689a = frameLayout;
        this.f185690b = BottomSheetBehavior.B(frameLayout);
        this.f185691c = LayoutInflater.from(frameLayout.getContext());
    }

    public final void a() {
        boolean z12 = this.f185693e;
        if (!z12) {
            throw new IllegalStateException("Bottom sheet is not hideable");
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f185690b;
        if (!bottomSheetBehavior.f355972I) {
            if (z12 && bottomSheetBehavior.f355975L == 5) {
                if (this.f185694f) {
                    bottomSheetBehavior.b(3);
                } else {
                    bottomSheetBehavior.b(4);
                }
            }
            bottomSheetBehavior.M(this.f185693e);
        }
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
    }
}
