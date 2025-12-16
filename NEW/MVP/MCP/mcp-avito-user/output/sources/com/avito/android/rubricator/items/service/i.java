package com.avito.android.rubricator.items.service;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.rubricator.b;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/service/i;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b.c.a f255829b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f255830c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f255831d;

    /* renamed from: e, reason: collision with root package name */
    public final int f255832e;

    public /* synthetic */ i(Context context, b.c.a aVar, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Integer num;
        int iIntValue;
        Integer num2;
        boolean z12 = this.f255831d;
        boolean z13 = this.f255830c;
        if (!z13 || z12) {
            b.c.a aVar = this.f255829b;
            iIntValue = z13 ? (aVar == null || (num2 = aVar.f255721b) == null) ? 10 : num2.intValue() : z12 ? 6 : (aVar == null || (num = aVar.f255720a) == null) ? 3 : num.intValue();
        } else {
            iIntValue = 8;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = iU2 % iIntValue;
        int i13 = iU2 / iIntValue;
        int iS2 = (D6.s(recyclerView) - (D6.s(view) * iIntValue)) / (iIntValue - 1);
        rect.left = (i12 * iS2) / iIntValue;
        int i14 = this.f255832e;
        rect.top = i13 == 0 ? 0 : i14;
        rect.right = iS2 - (((i12 + 1) * iS2) / iIntValue);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.j jVar = adapter instanceof com.avito.konveyor.adapter.j ? (com.avito.konveyor.adapter.j) adapter : null;
        int count = jVar != null ? jVar.f338513c.getCount() : 0;
        int iCeil = (int) Math.ceil(count / iIntValue);
        if (count > 0 && i13 == iCeil - 1) {
            i14 = 0;
        }
        rect.bottom = i14;
    }

    public i(@k Context context, @l b.c.a aVar) {
        this.f255829b = aVar;
        this.f255830c = context.getResources().getBoolean(R.bool.is_tablet);
        this.f255831d = context.getResources().getConfiguration().orientation == 2;
        this.f255832e = y6.b(8);
    }
}
