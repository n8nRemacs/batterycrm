package com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: MallShortcutItemDecorator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f273013b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.mall_shortcuts.k f273014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273015d = y6.b(3);

    /* renamed from: e, reason: collision with root package name */
    public final int f273016e = y6.b(6);

    public b(int i12, @k com.avito.android.serp.adapter.vertical_main.mall_shortcuts.k kVar) {
        this.f273013b = i12;
        this.f273014c = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        rect.setEmpty();
        RecyclerView.C cW2 = recyclerView.W(view);
        int iU2 = RecyclerView.U(view);
        com.avito.android.serp.adapter.vertical_main.mall_shortcuts.k kVar = this.f273014c;
        int i12 = this.f273013b;
        int iE2 = kVar.e(iU2, i12);
        boolean z12 = iE2 == 0;
        boolean z13 = kVar.f(iU2) + iE2 == i12;
        if (cW2 instanceof e) {
            int i13 = this.f273015d;
            if (!z12) {
                rect.left = i13;
            }
            if (!z13) {
                rect.right = i13;
            }
            rect.bottom = this.f273016e;
        }
    }
}
