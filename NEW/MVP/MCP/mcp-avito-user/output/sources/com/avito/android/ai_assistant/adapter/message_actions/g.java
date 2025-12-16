package com.avito.android.ai_assistant.adapter.message_actions;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/w0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f88839b;

    public g(f fVar) {
        this.f88839b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f88839b;
        if (fVar.f88823c.isAttachedToWindow()) {
            fVar.f88823c.requestLayout();
        }
    }
}
