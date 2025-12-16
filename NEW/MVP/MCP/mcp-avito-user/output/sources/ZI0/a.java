package ZI0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import wJ0.InterfaceC49521b;

/* compiled from: UserAdvertsActionResultInfoItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZI0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f20082b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20083c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20084d = y6.b(28);

    /* renamed from: e, reason: collision with root package name */
    public final int f20085e = y6.b(2);

    /* renamed from: f, reason: collision with root package name */
    public final int f20086f = y6.b(12);

    @Inject
    public a(@k com.avito.konveyor.a aVar) {
        this.f20082b = aVar.Y(com.avito.android.user_adverts.tab_actions.info.items.block.b.class);
        this.f20083c = aVar.Y(InterfaceC49521b.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        if (cW2.getBindingAdapterPosition() <= 0) {
            if (cW2.getBindingAdapterPosition() == 0) {
                rect.top = this.f20086f;
                return;
            } else {
                super.getItemOffsets(rect, view, recyclerView, zVar);
                return;
            }
        }
        int itemViewType = cW2.getItemViewType();
        if (itemViewType == this.f20082b) {
            rect.set(0, this.f20084d, 0, 0);
        } else if (itemViewType == this.f20083c) {
            rect.set(0, this.f20085e, 0, 0);
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }
}
