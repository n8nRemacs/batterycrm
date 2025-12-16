package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: GroupSubscriptionSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$LoadedState$1$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt$LoadedState$1$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ InterfaceC22204y1<Boolean> $once$delegate;
    final /* synthetic */ I3<Y41.l<Continuation<? super G0>, Object>> $rememberedSaveDisplay$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupSubscriptionSheetKt$LoadedState$1$1(InterfaceC22204y1<Boolean> interfaceC22204y1, I3<? extends Y41.l<? super Continuation<? super G0>, ? extends Object>> i32, Continuation<? super GroupSubscriptionSheetKt$LoadedState$1$1> continuation) {
        super(2, continuation);
        this.$once$delegate = interfaceC22204y1;
        this.$rememberedSaveDisplay$delegate = i32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new GroupSubscriptionSheetKt$LoadedState$1$1(this.$once$delegate, this.$rememberedSaveDisplay$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (GroupSubscriptionSheetKt.LoadedState$lambda$36(this.$once$delegate)) {
                Y41.l lVarLoadedState$lambda$38 = GroupSubscriptionSheetKt.LoadedState$lambda$38(this.$rememberedSaveDisplay$delegate);
                this.label = 1;
                if (lVarLoadedState$lambda$38.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        GroupSubscriptionSheetKt.LoadedState$lambda$37(this.$once$delegate, false);
        return G0.f406611a;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((GroupSubscriptionSheetKt$LoadedState$1$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
