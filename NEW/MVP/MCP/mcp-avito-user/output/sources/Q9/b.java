package q9;

import androidx.viewpager.widget.ViewPager;
import com.avito.android.advert_core.development_offers.analytics.PageScrollDirection;
import com.avito.android.advert_core.development_offers.carousel_bottomsheet.DevelopmentOffersBottomSheetDialog;
import kotlin.Metadata;
import p9.e;

/* compiled from: DevelopmentOffersBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq9/b;", "Landroidx/viewpager/widget/ViewPager$i;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DevelopmentOffersBottomSheetDialog f429058b;

    public b(DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog) {
        this.f429058b = developmentOffersBottomSheetDialog;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        DevelopmentOffersBottomSheetDialog developmentOffersBottomSheetDialog = this.f429058b;
        PageScrollDirection pageScrollDirection = i12 > developmentOffersBottomSheetDialog.f83316h0 ? PageScrollDirection.f83292b : PageScrollDirection.f83293c;
        e eVar = developmentOffersBottomSheetDialog.f83318j0;
        if (eVar != null) {
            eVar.u(pageScrollDirection);
        }
        developmentOffersBottomSheetDialog.f83316h0 = i12;
        developmentOffersBottomSheetDialog.c5();
        developmentOffersBottomSheetDialog.b5();
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
