package HE;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.i;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.fees_method.h;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.header.g;
import com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info.f;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: FeesMethodsV2ItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHE/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f7006b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f7007c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f7008d = y6.b(10);

    /* renamed from: e, reason: collision with root package name */
    public final int f7009e = y6.b(24);

    /* renamed from: f, reason: collision with root package name */
    public final int f7010f = y6.b(16);

    /* renamed from: g, reason: collision with root package name */
    public final int f7011g = y6.b(10);

    /* renamed from: h, reason: collision with root package name */
    public final int f7012h = y6.b(10);

    /* renamed from: i, reason: collision with root package name */
    public final int f7013i = y6.b(60);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int i12 = cW2 instanceof h ? this.f7011g : cW2 instanceof i ? this.f7012h : this.f7010f;
        rect.left = i12;
        RecyclerView.C cW3 = recyclerView.W(view);
        rect.top = cW3 instanceof g ? true : cW3 instanceof f ? this.f7006b : cW3 instanceof h ? this.f7007c : cW3 instanceof i ? this.f7008d : cW3 instanceof com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details.h ? this.f7009e : 0;
        rect.right = i12;
        rect.bottom = RecyclerView.U(view) == zVar.b() - 1 ? this.f7013i : 0;
    }
}
