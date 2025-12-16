package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194270b;

    public D0(D d12) {
        this.f194270b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        D d12 = this.f194270b;
        d12.le().s(new D.s(false));
        V2.f318762a.a(d12.f207131E, "quickRepliesInteractor.getQuickReplies() subscription encountered an error!", (Throwable) obj);
    }
}
