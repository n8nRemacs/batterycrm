package com.avito.android.app.task;

import Oq.InterfaceC14725a;
import kotlin.Metadata;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.h1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28561h1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91610b;

    public C28561h1(C28582o1 c28582o1) {
        this.f91610b = c28582o1;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14725a.C0808a.a(this.f91610b.f91674g, new MessageSendingFatalException("Message sending is broken", (Throwable) obj), null, 6);
    }
}
