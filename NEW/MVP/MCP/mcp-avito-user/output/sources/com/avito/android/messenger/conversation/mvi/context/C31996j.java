package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.C31988b;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "oldState", "Lio/reactivex/rxjava3/core/I;", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31996j extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31987a.C5631a, io.reactivex.rxjava3.core.I<InterfaceC31987a.C5631a>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31988b.f f190385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C31988b f190386m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31996j(C31988b.f fVar, C31988b c31988b) {
        super(1);
        this.f190385l = fVar;
        this.f190386m = c31988b;
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.I<InterfaceC31987a.C5631a> invoke(InterfaceC31987a.C5631a c5631a) {
        InterfaceC31987a.C5631a c5631a2 = c5631a;
        C31988b.f fVar = this.f190385l;
        if (!fVar.f190265d) {
            com.avito.android.mvi.b<Channel> bVar = c5631a2.f190237b;
            if (!(bVar instanceof b.c)) {
                bVar = null;
            }
            b.c cVar = (b.c) bVar;
            if (cVar != null && cVar.f207034a == fVar.f190266e) {
                C31988b c31988b = this.f190386m;
                return c31988b.f190242W.g().j0(c31988b.f207140R).d0(S.f190194b).S().n(new C31995i(c5631a2)).u(new C31989c(c31988b, c5631a2, 1));
            }
        }
        return io.reactivex.rxjava3.core.I.q(c5631a2);
    }
}
