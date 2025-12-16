package com.avito.android.messenger.conversation.mvi.context;

import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/i;", "typingEvent", "Lio/reactivex/rxjava3/core/g;", "apply", "(LX81/i;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32011z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190407b;

    public C32011z(C31988b c31988b) {
        this.f190407b = c31988b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        X81.i iVar = (X81.i) obj;
        C31988b c31988b = this.f190407b;
        return new C41826q(new C32009x(c31988b, iVar)).g(C41823n.f402260b.j(3000L, TimeUnit.MILLISECONDS, c31988b.f207133K.c())).g(new C41826q(new C32010y(c31988b, iVar)));
    }
}
