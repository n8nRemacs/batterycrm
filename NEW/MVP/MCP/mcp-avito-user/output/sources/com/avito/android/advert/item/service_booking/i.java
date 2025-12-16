package com.avito.android.advert.item.service_booking;

import Y41.p;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.safedeal.SafeDeal;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79841d;

    public /* synthetic */ i(int i12, Object obj, Object obj2) {
        this.f79839b = i12;
        this.f79840c = obj;
        this.f79841d = obj2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.f79839b) {
            case 0:
                ViewGroup viewGroup = ((k) this.f79840c).f79848b;
                RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
                if (recyclerView == null || !recyclerView.d0()) {
                    ((Y41.a) this.f79841d).invoke();
                    break;
                }
                break;
            case 1:
                SafeDeal.TooltipData tooltipData = (SafeDeal.TooltipData) this.f79841d;
                ((p) this.f79840c).invoke(tooltipData.getLabel(), tooltipData.getShowEvent());
                break;
            default:
                ViewGroup viewGroup2 = ((com.avito.android.blueprints.publish.header.l) this.f79840c).f106221c;
                RecyclerView recyclerView2 = viewGroup2 instanceof RecyclerView ? (RecyclerView) viewGroup2 : null;
                if (recyclerView2 == null || !recyclerView2.d0()) {
                    ((Y41.a) this.f79841d).invoke();
                    break;
                }
                break;
        }
    }
}
