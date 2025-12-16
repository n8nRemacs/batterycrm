package com.avito.android.imv_chart;

import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f170259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f170260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HorizontalScrollView f170261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f170262e;

    public b(View view, c cVar, HorizontalScrollView horizontalScrollView, View view2) {
        this.f170259b = view;
        this.f170260c = cVar;
        this.f170261d = horizontalScrollView;
        this.f170262e = view2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f170260c.getClass();
        HorizontalScrollView horizontalScrollView = this.f170261d;
        int width = horizontalScrollView.getWidth();
        View view2 = this.f170262e;
        int width2 = (width - view2.getWidth()) / 2;
        if (width2 < 0) {
            horizontalScrollView.scrollTo((int) view2.getX(), 0);
        } else {
            horizontalScrollView.scrollTo(Math.max(((int) view2.getX()) - width2, 0), 0);
        }
        this.f170259b.removeOnLayoutChangeListener(this);
    }
}
