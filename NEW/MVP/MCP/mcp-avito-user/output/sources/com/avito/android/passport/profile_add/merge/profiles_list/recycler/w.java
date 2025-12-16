package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ProfileListItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/w;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f213344b = y6.b(12);

    /* renamed from: c, reason: collision with root package name */
    public final int f213345c = y6.b(18);

    /* renamed from: d, reason: collision with root package name */
    public final int f213346d = y6.b(36);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        rect.top = iU2 == 0 ? this.f213345c : iU2 == adapter.getItemCount() + (-1) ? y6.b(0) : this.f213344b;
        rect.bottom = iU2 == adapter.getItemCount() + (-1) ? this.f213346d : y6.b(0);
    }
}
