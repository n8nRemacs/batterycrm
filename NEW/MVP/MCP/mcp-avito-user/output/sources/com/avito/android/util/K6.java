package com.avito.android.util;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/K6;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class K6 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f318645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f318646c;

    /* JADX WARN: Multi-variable type inference failed */
    public K6(Y41.a aVar, View view) {
        this.f318645b = view;
        this.f318646c = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f318645b;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f318646c.invoke();
        return true;
    }
}
