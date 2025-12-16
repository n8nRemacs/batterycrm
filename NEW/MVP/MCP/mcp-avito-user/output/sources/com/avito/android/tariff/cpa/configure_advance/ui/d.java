package com.avito.android.tariff.cpa.configure_advance.ui;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff.cpa.configure_advance.items.advance_info.h;
import com.avito.android.tariff.cpa.configure_advance.items.extra_info.g;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfigureAdvancePaddingDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/ui/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f294376b = y6.b(24);

    @Inject
    public d() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        rect.top = cW2 instanceof g ? y6.b(23) : cW2 instanceof h ? y6.b(8) : 0;
        rect.bottom = RecyclerView.U(view) == zVar.b() + (-1) ? y6.b(40) : 0;
        int i12 = this.f294376b;
        rect.left = i12;
        rect.right = i12;
    }
}
