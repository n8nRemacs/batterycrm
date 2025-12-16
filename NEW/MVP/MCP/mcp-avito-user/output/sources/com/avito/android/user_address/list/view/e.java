package com.avito.android.user_address.list.view;

import Y61.k;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: UserAddressListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/view/e;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f307453b;

    public e(d dVar) {
        this.f307453b = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@k RecyclerView recyclerView, int i12, int i13) {
        int iK1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).K1();
        TextView textView = this.f307453b.f307451q;
        if (textView != null) {
            D6.G(textView, iK1 != 0);
        }
    }
}
