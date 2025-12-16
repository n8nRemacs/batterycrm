package com.avito.android.wallet.page.utils;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import l41.g;

/* compiled from: TabletViews.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "containerWidth", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f328426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f328427c;

    public e(View view, RecyclerView recyclerView) {
        this.f328426b = view;
        this.f328427c = recyclerView;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = (((Number) obj).intValue() - this.f328426b.getResources().getDimensionPixelSize(R.dimen.vas_item_fixed_width)) / 2;
        this.f328427c.setPadding(iIntValue, 0, iIntValue, 0);
    }
}
