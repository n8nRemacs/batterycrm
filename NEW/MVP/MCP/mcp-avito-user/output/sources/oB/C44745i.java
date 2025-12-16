package ob;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: CommercialDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lob/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ob.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44745i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f419940b;

    public C44745i(int i12) {
        this.f419940b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        Object objW = recyclerView.W(view);
        if (objW instanceof com.avito.android.advertising.ui.c) {
            Rect f87360i = ((com.avito.android.advertising.ui.c) objW).getF87360i();
            int i12 = this.f419940b;
            rect.left = i12;
            rect.right = i12;
            rect.top = f87360i.top;
            rect.bottom = f87360i.bottom;
        }
    }
}
