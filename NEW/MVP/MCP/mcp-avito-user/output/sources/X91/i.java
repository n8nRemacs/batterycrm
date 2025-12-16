package X91;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f18737b;

    public i(int i12) {
        this.f18737b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.bottom = this.f18737b;
    }
}
