package com.avito.android.blueprint.suggest;

import android.view.View;
import kotlin.Metadata;

/* compiled from: PublishInputWithSuggestsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/suggest/B;", "Landroid/view/View$OnAttachStateChangeListener;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f105674b;

    public B(C c12) {
        this.f105674b = c12;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        ?? r12 = this.f105674b.f105686w;
        if (r12 != 0) {
            r12.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        ?? r12 = this.f105674b.f105687x;
        if (r12 != 0) {
            r12.invoke();
        }
    }
}
