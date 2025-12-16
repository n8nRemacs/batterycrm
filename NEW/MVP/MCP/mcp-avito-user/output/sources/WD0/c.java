package WD0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_lf_publication.common.ui.items.header.h;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationRegionItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWD0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f17835b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f17836c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public final int f17837d = y6.b(24);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        rect.top = recyclerView.W(view) instanceof h ? this.f17836c : 0;
        rect.bottom = recyclerView.W(view) instanceof h ? this.f17837d : 0;
        boolean z12 = recyclerView.W(view) instanceof com.avito.android.tariff_lf_publication.region.ui.items.option.h;
        int i12 = this.f17835b;
        rect.left = z12 ? 0 : i12;
        rect.right = recyclerView.W(view) instanceof com.avito.android.tariff_lf_publication.region.ui.items.option.h ? 0 : i12;
    }
}
