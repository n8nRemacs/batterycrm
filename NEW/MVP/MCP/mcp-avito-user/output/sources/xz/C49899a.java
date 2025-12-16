package xZ;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: LastItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxZ/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49899a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f442532b;

    public C49899a(int i12) {
        this.f442532b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        if (RecyclerView.U(view) == zVar.b() - 1) {
            rect.bottom = this.f442532b;
        }
    }
}
