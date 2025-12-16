package nL0;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.user_adverts_views_pub.c;
import com.avito.android.vas_discount.ui.items.button.g;
import com.avito.android.vas_discount.ui.items.description.d;
import kotlin.Metadata;

/* compiled from: PaddingDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnL0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44290a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f415089b;

    /* renamed from: c, reason: collision with root package name */
    public final int f415090c;

    /* renamed from: d, reason: collision with root package name */
    public final int f415091d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415092e;

    /* renamed from: f, reason: collision with root package name */
    public final int f415093f;

    public C44290a(@k Resources resources) {
        this.f415089b = resources;
        this.f415090c = resources.getDimensionPixelSize(R.dimen.default_padding);
        this.f415091d = resources.getDimensionPixelSize(R.dimen.smaller_padding);
        this.f415092e = resources.getDimensionPixelSize(R.dimen.small_padding);
        this.f415093f = resources.getDimensionPixelSize(R.dimen.button_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) throws Resources.NotFoundException {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof c;
        int i12 = this.f415093f;
        int dimensionPixelOffset = this.f415090c;
        int dimensionPixelOffset2 = 0;
        rect.left = z12 ? 0 : cW2 instanceof g ? i12 : dimensionPixelOffset;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof c) {
            i12 = 0;
        } else if (!(cW3 instanceof g)) {
            i12 = dimensionPixelOffset;
        }
        rect.right = i12;
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        Resources resources = this.f415089b;
        if (bindingAdapterPosition == 0) {
            dimensionPixelOffset2 = this.f415091d;
        } else if (((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition() == zVar.b() - 1 && (recyclerView.W(view) instanceof g)) {
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.button_padding);
        }
        rect.top = dimensionPixelOffset2;
        if ((recyclerView.W(view) instanceof c) || (recyclerView.W(view) instanceof com.avito.android.vas_discount.ui.items.title.c)) {
            dimensionPixelOffset = this.f415092e;
        } else if (recyclerView.W(view) instanceof d) {
            dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.description_padding);
        }
        rect.bottom = dimensionPixelOffset;
    }
}
