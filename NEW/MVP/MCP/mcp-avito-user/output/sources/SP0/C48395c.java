package sp0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.screens.bbip_private.ui.items.budget.m;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.n;
import com.avito.android.screens.bbip_private.ui.items.header.h;
import com.avito.android.screens.bbip_private.ui.items.header.i;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BbipPrivateItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsp0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48395c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f438865b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f438866c = y6.b(24);

    /* renamed from: d, reason: collision with root package name */
    public final int f438867d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f438868e = y6.b(10);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof i;
        int i13 = 0;
        int i14 = this.f438868e;
        int i15 = this.f438867d;
        if (z12) {
            i12 = i15;
        } else {
            i12 = cW2 instanceof m ? true : cW2 instanceof n ? i14 : 0;
        }
        rect.left = i12;
        rect.top = recyclerView.W(view) instanceof h ? this.f438865b : this.f438866c;
        RecyclerView.C cW3 = recyclerView.W(view);
        if (cW3 instanceof i) {
            i13 = i15;
        } else {
            if (cW3 instanceof m ? true : cW3 instanceof n) {
                i13 = i14;
            }
        }
        rect.right = i13;
    }
}
