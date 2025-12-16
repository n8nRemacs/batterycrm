package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;

/* compiled from: NewThreadScheduler.java */
/* loaded from: classes8.dex */
public final class h extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final k f404731e = new k("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* renamed from: d, reason: collision with root package name */
    public final k f404732d = f404731e;

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return new i(this.f404732d);
    }
}
