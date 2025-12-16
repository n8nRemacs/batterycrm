package lB0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff.cpx.configure.advance.items.cards.j;
import com.avito.android.tariff.cpx.configure.advance.items.header.h;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: CpxConfigureAdvanceItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlB0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43614a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f413578b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f413579c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f413580d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f413581e = y6.b(168);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        int i13 = recyclerView.W(view) instanceof h ? this.f413580d : 0;
        rect.left = i13;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof h) {
            i12 = this.f413578b;
        } else {
            i12 = cW2 instanceof j ? true : cW2 instanceof com.avito.android.tariff.cpx.configure.advance.items.chips.j ? this.f413579c : 0;
        }
        rect.top = i12;
        rect.right = i13;
        RecyclerView.C cW3 = recyclerView.W(view);
        rect.bottom = cW3 instanceof j ? true : cW3 instanceof com.avito.android.tariff.cpx.configure.advance.items.chips.j ? this.f413581e : 0;
    }
}
