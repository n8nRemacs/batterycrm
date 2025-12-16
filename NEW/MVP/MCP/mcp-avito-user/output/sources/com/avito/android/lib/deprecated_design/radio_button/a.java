package com.avito.android.lib.deprecated_design.radio_button;

import Y61.l;
import android.view.ViewTreeObserver;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DelegateGlobalLayoutListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/radio_button/a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f178073b;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Y41.a<G0> aVar = this.f178073b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
