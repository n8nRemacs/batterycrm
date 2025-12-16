package com.avito.konveyor.item_visibility_tracker;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/f;", "Landroid/view/View$OnAttachStateChangeListener;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f338560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f338561c;

    public f(d dVar, RecyclerView recyclerView) {
        this.f338560b = dVar;
        this.f338561c = recyclerView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@k View view) {
        this.f338560b.g(this.f338561c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@k View view) {
    }
}
