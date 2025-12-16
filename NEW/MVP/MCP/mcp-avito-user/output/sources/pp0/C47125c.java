package pp0;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.screens.bbip.ui.items.budget.i;
import com.avito.android.screens.bbip.ui.items.duration.j;
import com.avito.android.screens.bbip.ui.items.title.g;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BbipPaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpp0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47125c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f428780b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f428782d;

    @Inject
    public C47125c(@k Resources resources) {
        this.f428780b = resources.getDimensionPixelSize(R.dimen.bbip_title_item_padding_top);
        this.f428781c = resources.getDimensionPixelSize(R.dimen.bbip_item_padding_bottom);
        this.f428782d = resources.getDimensionPixelSize(R.dimen.bbip_duration_item_padding_bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12 = 0;
        rect.top = recyclerView.W(view) instanceof g ? this.f428780b : 0;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof g ? true : cW2 instanceof com.avito.android.screens.bbip.ui.items.forecast.g ? true : cW2 instanceof i) {
            i12 = this.f428781c;
        } else if (cW2 instanceof j) {
            i12 = this.f428782d;
        }
        rect.bottom = i12;
    }
}
