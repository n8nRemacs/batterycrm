package com.avito.android.messenger.conversation.mvi.quick_replies;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class w extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194151l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f194152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AtomicBoolean atomicBoolean, r rVar) {
        super(0);
        this.f194151l = atomicBoolean;
        this.f194152m = rVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        if (!this.f194151l.compareAndSet(true, false)) {
            this.f194152m.f194131k.accept(G0.f406611a);
        }
        return G0.f406611a;
    }
}
