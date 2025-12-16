package Ig;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.konveyor.adapter.i;
import kotlin.Metadata;

/* compiled from: ShortVideosItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIg/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_avl-entry_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f8476b = y6.b(18);

    /* renamed from: c, reason: collision with root package name */
    public final int f8477c = y6.b(32);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2;
        Object adapter = recyclerView.getAdapter();
        i iVar = adapter instanceof i ? (i) adapter : null;
        if (iVar == null || (iU2 = RecyclerView.U(view)) == -1) {
            return;
        }
        TV0.a item = iVar.getItem(iU2);
        if ((item instanceof d ? (d) item : null) != null) {
            rect.top = this.f8476b;
            rect.bottom = this.f8477c;
        }
    }
}
