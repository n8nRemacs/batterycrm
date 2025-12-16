package com.avito.android.widget_filters.ui;

import android.view.View;
import com.avito.android.widget_filters.ui.WidgetFiltersFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f330310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f330311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f330312d;

    public /* synthetic */ g(int i12, Object obj, Object obj2) {
        this.f330310b = i12;
        this.f330311c = obj;
        this.f330312d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f330312d;
        Object obj2 = this.f330311c;
        switch (this.f330310b) {
            case 0:
                i iVar = (i) obj2;
                Y41.a aVar = (Y41.a) obj;
                com.avito.android.lib.design.tooltip.k kVar = iVar.f330318a;
                if (kVar != null) {
                    kVar.dismiss();
                }
                ((c) aVar).invoke();
                iVar.f330318a = null;
                break;
            default:
                WidgetFiltersFragment.a aVar2 = WidgetFiltersFragment.f330270x0;
                ((WidgetFiltersFragment) obj2).r5().accept((OP0.a) obj);
                break;
        }
    }
}
