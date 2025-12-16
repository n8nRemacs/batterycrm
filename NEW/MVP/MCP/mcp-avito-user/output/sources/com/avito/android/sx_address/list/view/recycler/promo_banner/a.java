package com.avito.android.sx_address.list.view.recycler.promo_banner;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemDecorator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/view/recycler/promo_banner/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f293537b = y6.b(4);

    /* renamed from: c, reason: collision with root package name */
    public final int f293538c = y6.b(10);

    /* renamed from: d, reason: collision with root package name */
    public final int f293539d = y6.b(10);

    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int itemCount = adapter.getItemCount() - 1;
            int i12 = this.f293537b;
            if (iIntValue == 0) {
                rect.left = this.f293538c;
                rect.right = i12;
            } else if (iIntValue == itemCount) {
                rect.left = i12;
                rect.right = this.f293539d;
            } else {
                rect.left = i12;
                rect.right = i12;
            }
        }
    }
}
