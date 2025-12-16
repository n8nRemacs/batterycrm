package com.avito.android.fees_methods.screen.fees_methods_v2.mvi;

import com.avito.android.fees_methods.screen.fees_methods_v2.mvi.entity.FeesMethodsV2InternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FeesMethodsV2Actor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGE/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/mvi/entity/FeesMethodsV2InternalAction;", "invoke", "(LGE/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class c extends N implements Y41.l<GE.a, InterfaceC43160i<? extends FeesMethodsV2InternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f158275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<GE.c> f158276m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, Y41.a<GE.c> aVar2) {
        super(1);
        this.f158275l = aVar;
        this.f158276m = aVar2;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends FeesMethodsV2InternalAction> invoke(GE.a aVar) {
        GE.c cVarInvoke = this.f158276m.invoke();
        return this.f158275l.b(aVar, cVarInvoke);
    }
}
