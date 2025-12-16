package com.avito.android.auction.details.mvi;

import Md.InterfaceC14470a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AuctionDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMd/a;", "action", "Lkotlinx/coroutines/flow/i;", "LMd/b;", "invoke", "(LMd/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<InterfaceC14470a, InterfaceC43160i<? extends Md.b>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f92358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Md.d> f92359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, Y41.a<? extends Md.d> aVar2) {
        super(1);
        this.f92358l = aVar;
        this.f92359m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends Md.b> invoke(InterfaceC14470a interfaceC14470a) {
        Md.d dVarInvoke = this.f92359m.invoke();
        this.f92358l.getClass();
        return a.c(interfaceC14470a, dVarInvoke);
    }
}
