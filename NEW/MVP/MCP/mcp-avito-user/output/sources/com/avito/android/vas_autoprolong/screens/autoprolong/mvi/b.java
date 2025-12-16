package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction;
import jL0.C42282c;
import jL0.InterfaceC42280a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutoprolongActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LjL0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "invoke", "(LjL0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<InterfaceC42280a, InterfaceC43160i<? extends AutoprolongInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f319531l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C42282c> f319532m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<C42282c> aVar) {
        super(1);
        this.f319531l = cVar;
        this.f319532m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends AutoprolongInternalAction> invoke(InterfaceC42280a interfaceC42280a) {
        C42282c c42282cInvoke = this.f319532m.invoke();
        return this.f319531l.b(interfaceC42280a, c42282cInvoke);
    }
}
