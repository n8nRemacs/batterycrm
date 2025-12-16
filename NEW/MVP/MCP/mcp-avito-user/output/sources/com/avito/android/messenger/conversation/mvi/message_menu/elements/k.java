package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: RetrySendingMessageElementProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.message_menu.h f191715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f191716c;

    public k(com.avito.android.messenger.conversation.mvi.message_menu.h hVar, j jVar) {
        this.f191715b = hVar;
        this.f191716c = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2.f318762a.a("RetrySendingMessageElementProvider", "Failed update state of message: " + this.f191715b.f191748c, (Throwable) obj);
        this.f191716c.f191712e.M2();
    }
}
