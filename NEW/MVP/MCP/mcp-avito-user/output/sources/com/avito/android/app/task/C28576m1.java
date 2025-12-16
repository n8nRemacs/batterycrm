package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.internal.operators.completable.C41821l;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: PendingMessageHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.m1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28576m1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28598u0 f91660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f91661f;

    public C28576m1(C28582o1 c28582o1, LocalMessage localMessage, io.reactivex.rxjava3.core.H h12, InterfaceC28598u0 interfaceC28598u0, AtomicInteger atomicInteger) {
        this.f91657b = c28582o1;
        this.f91658c = localMessage;
        this.f91659d = h12;
        this.f91660e = interfaceC28598u0;
        this.f91661f = atomicInteger;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        final Throwable th2 = (Throwable) obj;
        C41828t c41828tB = this.f91657b.f91670c.B(Collections.singletonList(this.f91658c.getLocalId()));
        final AtomicInteger atomicInteger = this.f91661f;
        final C28582o1 c28582o1 = this.f91657b;
        final InterfaceC28598u0 interfaceC28598u0 = this.f91660e;
        final LocalMessage localMessage = this.f91658c;
        return new C41821l(c41828tB, new InterfaceC43543a() { // from class: com.avito.android.app.task.l1
            @Override // l41.InterfaceC43543a
            public final void run() {
                c28582o1.c(interfaceC28598u0, localMessage, atomicInteger.get(), th2);
            }
        }).x(this.f91659d);
    }
}
