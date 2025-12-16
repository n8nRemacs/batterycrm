package com.avito.android.advert.item;

import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert_core.analytics.branding_gallery.AnalyticsBrandingType;
import com.avito.android.util.ExpandablePanelLayout;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/r1;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.r1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28163r1 extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f78296b;

    public C28163r1(I1 i12) {
        this.f78296b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        this.f78296b.f71738r0.a(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        I1 i14 = this.f78296b;
        GridLayoutManager gridLayoutManager = i14.f71676S0;
        int iK1 = gridLayoutManager.K1();
        Integer numValueOf = Integer.valueOf(iK1);
        if (iK1 == -1) {
            numValueOf = null;
        }
        int iM1 = gridLayoutManager.M1();
        Integer numValueOf2 = iM1 != -1 ? Integer.valueOf(iM1) : null;
        if (numValueOf != null && numValueOf2 != null) {
            i14.f71741t.a(numValueOf.intValue(), numValueOf2.intValue());
        }
        if (i12 != 0 || i13 != 0) {
            i14.x(true, false);
        }
        i14.z();
        boolean zF2 = kotlin.jvm.internal.L.f(i14.f71686X0, "111");
        GridLayoutManager gridLayoutManager2 = i14.f71676S0;
        if (zF2) {
            int iK12 = gridLayoutManager2.K1();
            int iM12 = gridLayoutManager2.M1();
            if (iK12 != -1 && iM12 != -1 && iK12 < iM12 && iK12 <= iM12) {
                int i15 = iK12;
                while (true) {
                    RecyclerView.C cQ2 = i14.f71750x0.Q(i15, false);
                    boolean z12 = cQ2 instanceof com.avito.android.advert.item.brandingGallery.block.e;
                    com.avito.android.advert_core.analytics.a aVar = i14.f71706f0;
                    if (z12) {
                        if (i15 != iK12 && i15 != iM12) {
                            aVar.i1(AnalyticsBrandingType.f82805c);
                        }
                    } else if (cQ2 instanceof com.avito.android.advert.item.branding_advantages.block.h) {
                        com.avito.android.advert.item.branding_advantages.block.h hVar = (com.avito.android.advert.item.branding_advantages.block.h) cQ2;
                        ExpandablePanelLayout expandablePanelLayout = hVar.f74197h;
                        Rect rect = new Rect();
                        if (expandablePanelLayout.getLocalVisibleRect(rect) && rect.bottom - rect.top == expandablePanelLayout.getHeight()) {
                            aVar.i1(AnalyticsBrandingType.f82807e);
                        }
                        Rect rect2 = new Rect();
                        RecyclerView recyclerView2 = hVar.f74196g;
                        if (recyclerView2.getLocalVisibleRect(rect2) && rect2.bottom - rect2.top == recyclerView2.getHeight()) {
                            aVar.i1(AnalyticsBrandingType.f82806d);
                        }
                    }
                    if (i15 == iM12) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        int iH1 = gridLayoutManager2.H1();
        if (iH1 == -1) {
            return;
        }
        i14.f71729n.o(new kotlin.ranges.l(iH1, iH1 + 3, 1));
    }
}
