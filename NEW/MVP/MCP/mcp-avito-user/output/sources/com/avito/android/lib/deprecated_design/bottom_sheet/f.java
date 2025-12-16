package com.avito.android.lib.deprecated_design.bottom_sheet;

import Y61.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f177866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f177867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f177868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f177869e;

    public f(View view, e eVar, float f12, int i12) {
        this.f177866b = view;
        this.f177867c = eVar;
        this.f177868d = f12;
        this.f177869e = i12;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        e eVar = this.f177867c;
        int height = eVar.f177849h.getHeight();
        int i22 = this.f177869e;
        float f12 = this.f177868d;
        if (height > 0) {
            eVar.f177850i.N(((int) (eVar.f177849h.getHeight() * f12)) - i22, false);
        } else {
            eVar.f177850i.N(((int) (eVar.f177845d.getDisplayMetrics().heightPixels * f12)) - i22, false);
        }
        this.f177866b.removeOnLayoutChangeListener(this);
    }
}
