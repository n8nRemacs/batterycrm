package com.avito.android.messenger.conversation.mvi.send;

import android.view.ViewTreeObserver;
import com.avito.android.util.A6;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/Y0;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Y0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0 f194470b;

    public Y0(Q0 q02) {
        this.f194470b = q02;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Q0 q02 = this.f194470b;
        A6.b(q02.f194368a.getViewTreeObserver(), this);
        q02.f194362O = (q02.f194368a.getMeasuredHeight() * 2) / 3;
    }
}
