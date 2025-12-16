package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import p41.AbstractC46895b;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp41/b;", "", "LX81/i;", "typingEventsByUserId", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190171b;

    public A(C31988b c31988b) {
        this.f190171b = c31988b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC46895b abstractC46895b = (AbstractC46895b) obj;
        C32011z c32011z = new C32011z(this.f190171b);
        abstractC46895b.getClass();
        return new io.reactivex.rxjava3.internal.operators.mixed.v(abstractC46895b, c32011z);
    }
}
