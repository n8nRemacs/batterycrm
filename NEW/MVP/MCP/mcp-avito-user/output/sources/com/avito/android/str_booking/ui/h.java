package com.avito.android.str_booking.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/F6", "Landroid/view/View$OnAttachStateChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f286042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f286043c;

    public h(RecyclerView recyclerView, g gVar) {
        this.f286042b = recyclerView;
        this.f286043c = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f286042b.removeOnAttachStateChangeListener(this);
        view.removeCallbacks(this.f286043c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
    }
}
