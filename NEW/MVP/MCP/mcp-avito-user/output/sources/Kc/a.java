package KC;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advertising.ui.c;
import com.avito.android.serp.adapter.witcher.Appearance;
import com.avito.android.serp.adapter.witcher.J;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: FavoritesPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKC/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f9360b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Appearance.Margins f9361c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Appearance.Margins f9362d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Appearance.Paddings f9363e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Appearance.Paddings f9364f;

    static {
        Parcelable.Creator<Appearance.Paddings> creator = Appearance.Paddings.CREATOR;
        Parcelable.Creator<Appearance.Margins> creator2 = Appearance.Margins.CREATOR;
    }

    public a(@k Resources resources) throws Resources.NotFoundException {
        this.f9360b = resources.getDimensionPixelSize(R.dimen.list_serp_card_padding);
        this.f9364f = new Appearance.Paddings(0, resources.getDimensionPixelSize(R.dimen.favorite_witcher_internal_bottom_padding), 0, 0, 13, null);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.favorite_witcher_title_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.favorite_witcher_list_additional_horizontal_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.favorite_witcher_list_horizontal_delta_margin) - dimensionPixelSize2;
        this.f9361c = new Appearance.Margins(0, 0, dimensionPixelSize, dimensionPixelSize, 3, null);
        this.f9362d = new Appearance.Margins(resources.getDimensionPixelSize(R.dimen.favorite_witcher_list_margin_top), 0, dimensionPixelSize3, dimensionPixelSize3, 2, null);
        this.f9363e = new Appearance.Paddings(0, 0, dimensionPixelSize2, dimensionPixelSize2, 3, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 != null && (cW2 instanceof J)) {
            J j12 = (J) cW2;
            j12.CZ(this.f9361c);
            j12.Fe(this.f9362d);
            j12.Fe(this.f9363e);
            j12.Qj(this.f9364f);
            return;
        }
        boolean z12 = cW2 instanceof c;
        int i12 = this.f9360b;
        if (!z12) {
            rect.left = i12;
            rect.right = i12;
            return;
        }
        int iB2 = y6.b(12);
        rect.top = iB2;
        rect.bottom = iB2;
        int i13 = i12 + iB2;
        rect.left = i13;
        rect.right = i13;
    }
}
