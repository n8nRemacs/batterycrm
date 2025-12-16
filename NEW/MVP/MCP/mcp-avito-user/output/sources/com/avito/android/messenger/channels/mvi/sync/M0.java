package com.avito.android.messenger.channels.mvi.sync;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p41.AbstractC46895b;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp41/b;", "", "Lcom/avito/android/messenger/channels/mvi/sync/a;", "readChannelRequestObservable", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f188361b;

    public M0(U0 u02) {
        this.f188361b = u02;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        this.f188361b.getClass();
        return ((AbstractC46895b) obj).D0(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
