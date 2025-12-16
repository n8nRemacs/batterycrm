package com.avito.android.app.task;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.internal.operators.completable.C41821l;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(J)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.d1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28549d1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28598u0 f91585e;

    public C28549d1(C28582o1 c28582o1, LocalMessage localMessage, io.reactivex.rxjava3.core.H h12, InterfaceC28598u0 interfaceC28598u0) {
        this.f91582b = c28582o1;
        this.f91583c = localMessage;
        this.f91584d = h12;
        this.f91585e = interfaceC28598u0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ((Number) obj).longValue();
        C28582o1 c28582o1 = this.f91582b;
        InterfaceC32024m interfaceC32024m = c28582o1.f91670c;
        LocalMessage localMessage = this.f91583c;
        C41828t c41828tB = interfaceC32024m.B(Collections.singletonList(localMessage.getLocalId()));
        io.reactivex.rxjava3.core.H h12 = this.f91584d;
        io.reactivex.rxjava3.internal.operators.completable.H hQ2 = c41828tB.x(h12).q(h12);
        InterfaceC28598u0 interfaceC28598u0 = this.f91585e;
        return new C41821l(hQ2.n(new C28546c1(interfaceC28598u0)), new Q0(c28582o1, interfaceC28598u0, localMessage, 1));
    }
}
