package com.avito.android.app.task;

import java.util.concurrent.Callable;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "call", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.l0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC28572l0<V> implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f91646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f91647d;

    public CallableC28572l0(C28587q0 c28587q0, String str, long j12) {
        this.f91645b = c28587q0;
        this.f91646c = str;
        this.f91647d = j12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f91645b.f91695e.a(Long.valueOf(this.f91647d), this.f91646c);
        return kotlin.G0.f406611a;
    }
}
