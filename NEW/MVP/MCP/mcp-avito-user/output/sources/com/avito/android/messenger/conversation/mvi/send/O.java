package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import java.io.File;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "kotlin.jvm.PlatformType", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194322c;

    public O(D d12, SendMessagePresenter.State state) {
        this.f194321b = d12;
        this.f194322c = state;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        File file = (File) obj;
        D d12 = this.f194321b;
        return new io.reactivex.rxjava3.internal.operators.completable.T(d12.f194208k0.a(file), new com.avito.android.advert.deeplinks.delivery.p(d12, this.f194322c, file, 10), null);
    }
}
