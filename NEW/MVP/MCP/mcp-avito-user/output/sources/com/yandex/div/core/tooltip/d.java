package com.yandex.div.core.tooltip;

import android.view.View;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f367750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f367751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DivTooltip f367752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C38029k f367753e;

    public d(g gVar, View view, DivTooltip divTooltip, C38029k c38029k) {
        this.f367750b = gVar;
        this.f367751c = view;
        this.f367752d = divTooltip;
        this.f367753e = c38029k;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        g.a(this.f367750b, this.f367751c, this.f367752d, this.f367753e);
    }
}
