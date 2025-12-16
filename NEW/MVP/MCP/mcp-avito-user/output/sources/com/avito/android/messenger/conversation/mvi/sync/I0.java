package com.avito.android.messenger.conversation.mvi.sync;

import io.reactivex.rxjava3.internal.operators.observable.C41946e1;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p41.AbstractC46895b;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\u0006R\u00020\u00070\u00052$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lp41/b;", "", "Lkotlin/Q;", "", "channelRequestObs", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;", "Lcom/avito/android/messenger/conversation/mvi/sync/v0;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194598c;

    public I0(C32293v0 c32293v0, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194597b = c32293v0;
        this.f194598c = messengerUserHashInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC46895b abstractC46895b = (AbstractC46895b) obj;
        String str = (String) abstractC46895b.f428195b;
        if (str == null) {
            return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = abstractC46895b.d0(E0.f194588b);
        int i12 = C32293v0.f194852a0;
        C32293v0 c32293v0 = this.f194597b;
        io.reactivex.rxjava3.core.H hC2 = c32293v0.f207133K.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(timeUnit, "unit is null");
        return new C41946e1(b0D0.d0(io.reactivex.rxjava3.internal.functions.a.l(timeUnit, hC2)).d0(F0.f194589b), new D0(c32293v0, 0)).N(G0.f194590b).d0(new H0(c32293v0, this.f194598c, str));
    }
}
