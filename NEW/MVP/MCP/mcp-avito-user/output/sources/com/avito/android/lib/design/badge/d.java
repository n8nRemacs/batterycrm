package com.avito.android.lib.design.badge;

import android.view.ViewPropertyAnimator;
import com.avito.android.lib.design.badge.Badge;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Views.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Badge.a f178391b;

    public d(Badge.a aVar) {
        this.f178391b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Badge.a aVar = this.f178391b;
        ViewPropertyAnimator viewPropertyAnimatorA = aVar.a();
        viewPropertyAnimatorA.start();
        aVar.f178375j = viewPropertyAnimatorA;
    }
}
