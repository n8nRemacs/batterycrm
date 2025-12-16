package com.avito.android.saved_searches.presentation.items.switcher;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;

/* compiled from: SwitcherListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/switcher/m;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitcherListItem f258576b;

    public m(SwitcherListItem switcherListItem) {
        this.f258576b = switcherListItem;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        SwitcherListItem switcherListItem = this.f258576b;
        switcherListItem.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        FrameLayout frameLayout = switcherListItem.f258556g;
        LinearLayout linearLayout = switcherListItem.f258557h;
        if (frameLayout == null || linearLayout == null) {
            return;
        }
        linearLayout.setBottom(frameLayout.getHeight() + frameLayout.getTop());
    }
}
