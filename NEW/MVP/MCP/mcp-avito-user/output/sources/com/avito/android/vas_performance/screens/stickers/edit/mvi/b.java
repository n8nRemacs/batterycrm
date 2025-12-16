package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StickersEditActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LML0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "invoke", "(LML0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<ML0.a, InterfaceC43160i<? extends StickersEditInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f320774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ML0.c> f320775m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<ML0.c> aVar) {
        super(1);
        this.f320774l = cVar;
        this.f320775m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends StickersEditInternalAction> invoke(ML0.a aVar) {
        ML0.c cVarInvoke = this.f320775m.invoke();
        return this.f320774l.b(aVar, cVarInvoke);
    }
}
