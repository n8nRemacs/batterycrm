package as0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.with_reviews.e;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: SellersCarouselWidgetDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Las0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: as0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C24170a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f56764b = y6.b(18);

    /* renamed from: c, reason: collision with root package name */
    public final int f56765c = y6.b(15);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof e) {
            rect.top = this.f56764b;
            rect.bottom = this.f56765c;
        }
    }
}
