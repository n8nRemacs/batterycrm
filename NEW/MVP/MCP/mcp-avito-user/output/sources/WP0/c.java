package wp0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.screens.bbip_v2.ui.items.budget.h;
import com.avito.android.screens.bbip_v2.ui.items.duration.i;
import com.avito.android.screens.bbip_v2.ui.items.title.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BbipV2ItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwp0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f441801b = y6.b(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f441802c = y6.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final int f441803d = y6.b(20);

    /* renamed from: e, reason: collision with root package name */
    public final int f441804e = y6.b(10);

    /* renamed from: f, reason: collision with root package name */
    public final int f441805f = y6.b(24);

    /* renamed from: g, reason: collision with root package name */
    public final int f441806g = y6.b(24);

    /* renamed from: h, reason: collision with root package name */
    public final int f441807h = y6.b(86);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int i12 = cW2 instanceof g ? this.f441802c : cW2 instanceof com.avito.android.screens.bbip_v2.ui.items.forecast.g ? this.f441804e : 0;
        rect.left = i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        rect.top = cW3 instanceof g ? this.f441801b : cW3 instanceof com.avito.android.screens.bbip_v2.ui.items.forecast.g ? this.f441803d : cW3 instanceof h ? this.f441805f : cW3 instanceof i ? this.f441806g : 0;
        rect.right = i12;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? this.f441807h : 0;
    }
}
