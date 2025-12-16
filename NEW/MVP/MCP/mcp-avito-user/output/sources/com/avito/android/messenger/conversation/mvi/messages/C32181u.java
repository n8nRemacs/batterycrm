package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/messages/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32181u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f193552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f193553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193554d;

    public C32181u(C32141e c32141e, String str, int i12) {
        this.f193552b = c32141e;
        this.f193553c = str;
        this.f193554d = i12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C32141e c32141e = this.f193552b;
        InterfaceC28373a interfaceC28373a = c32141e.f192906Z;
        String str = c32141e.f192909c0;
        if (str == null) {
            str = "";
        }
        int i12 = this.f193554d - 1;
        interfaceC28373a.c(new com.avito.android.messenger.analytics.h0(c32141e.f192907a0, this.f193553c, str, i12, true));
    }
}
