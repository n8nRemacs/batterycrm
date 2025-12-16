package com.avito.android.publish.items.tagged_input;

import android.view.View;
import kotlin.Metadata;

/* compiled from: MultiStateInputWithTagsItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/C;", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class C implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f237109b;

    public C(D d12) {
        this.f237109b = d12;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        ?? r12 = this.f237109b.f237122m;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        ?? r12 = this.f237109b.f237123n;
        if (r12 != 0) {
            r12.invoke();
        }
    }
}
