package com.avito.android.widget_filters.ui;

import OP0.a;
import android.view.View;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f330304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WidgetFiltersFragment f330305c;

    public /* synthetic */ b(WidgetFiltersFragment widgetFiltersFragment, int i12) {
        this.f330304b = i12;
        this.f330305c = widgetFiltersFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WidgetFiltersFragment widgetFiltersFragment = this.f330305c;
        switch (this.f330304b) {
            case 0:
                WidgetFiltersFragment.a aVar = WidgetFiltersFragment.f330270x0;
                widgetFiltersFragment.r5().accept(a.A.f12234a);
                break;
            case 1:
                WidgetFiltersFragment.a aVar2 = WidgetFiltersFragment.f330270x0;
                widgetFiltersFragment.r5().accept(a.z.f12272a);
                break;
            case 2:
                WidgetFiltersFragment.a aVar3 = WidgetFiltersFragment.f330270x0;
                widgetFiltersFragment.r5().accept(a.v.f12267a);
                break;
            case 3:
                WidgetFiltersFragment.a aVar4 = WidgetFiltersFragment.f330270x0;
                widgetFiltersFragment.r5().accept(a.B.f12235a);
                break;
            default:
                WidgetFiltersFragment.a aVar5 = WidgetFiltersFragment.f330270x0;
                widgetFiltersFragment.r5().accept(a.p.f12260a);
                break;
        }
    }
}
