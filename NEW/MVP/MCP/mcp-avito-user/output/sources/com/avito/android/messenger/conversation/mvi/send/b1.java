package com.avito.android.messenger.conversation.mvi.send;

import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f194484l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Q0 q02) {
        super(0);
        this.f194484l = q02;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        com.jakewharton.rxrelay3.c cVar = this.f194484l.f194361N;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        cVar.accept(g02);
        return g02;
    }
}
