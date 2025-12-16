package com.avito.android.bbl.screens.configure.v4.mvi;

import Bh.C13148c;
import Bh.InterfaceC13146a;
import com.avito.android.bbl.screens.configure.v4.mvi.entity.BblConfigureV4InternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BblConfigureV4Actor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LBh/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "invoke", "(LBh/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<InterfaceC13146a, InterfaceC43160i<? extends BblConfigureV4InternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f99476l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C13148c> f99477m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<C13148c> aVar) {
        super(1);
        this.f99476l = cVar;
        this.f99477m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends BblConfigureV4InternalAction> invoke(InterfaceC13146a interfaceC13146a) {
        C13148c c13148cInvoke = this.f99477m.invoke();
        return this.f99476l.b(interfaceC13146a, c13148cInvoke);
    }
}
