package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/n0;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n0 implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f283442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f283443b;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(Y41.a aVar, View view) {
        this.f283442a = view;
        this.f283443b = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z12) {
        if (z12) {
            this.f283442a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f283443b.invoke();
        }
    }
}
