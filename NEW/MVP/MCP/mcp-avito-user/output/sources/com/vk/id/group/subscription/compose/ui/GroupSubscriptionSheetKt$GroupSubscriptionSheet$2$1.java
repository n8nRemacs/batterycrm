package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.tracking.core.CrashReporter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GroupSubscriptionSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ InterfaceC22204y1<Boolean> $isSuccess$delegate;
    final /* synthetic */ I3<Y41.l<VKIDGroupSubscriptionFail, G0>> $rememberedOnFail$delegate;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC22204y1<Boolean> $wasVisible$delegate;
    int label;

    /* compiled from: GroupSubscriptionSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Throwable, Continuation<? super G0>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(th2, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: GroupSubscriptionSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$2", f = "GroupSubscriptionSheet.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {
        final /* synthetic */ InterfaceC22204y1<Boolean> $isSuccess$delegate;
        final /* synthetic */ I3<Y41.l<VKIDGroupSubscriptionFail, G0>> $rememberedOnFail$delegate;
        final /* synthetic */ GroupSubscriptionSheetState $state;
        final /* synthetic */ InterfaceC22204y1<Boolean> $wasVisible$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC22204y1<Boolean> interfaceC22204y1, InterfaceC22204y1<Boolean> interfaceC22204y12, I3<? extends Y41.l<? super VKIDGroupSubscriptionFail, G0>> i32, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$state = groupSubscriptionSheetState;
            this.$isSuccess$delegate = interfaceC22204y1;
            this.$wasVisible$delegate = interfaceC22204y12;
            this.$rememberedOnFail$delegate = i32;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$state, this.$isSuccess$delegate, this.$wasVisible$delegate, this.$rememberedOnFail$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                final GroupSubscriptionSheetState groupSubscriptionSheetState = this.$state;
                InterfaceC43160i interfaceC43160iR = C43175k.r(C22126m3.n(new Y41.a() { // from class: com.vk.id.group.subscription.compose.ui.m
                    @Override // Y41.a
                    public final Object invoke() {
                        return Boolean.valueOf(groupSubscriptionSheetState.isVisible());
                    }
                }));
                final InterfaceC22204y1<Boolean> interfaceC22204y1 = this.$isSuccess$delegate;
                final InterfaceC22204y1<Boolean> interfaceC22204y12 = this.$wasVisible$delegate;
                final I3<Y41.l<VKIDGroupSubscriptionFail, G0>> i32 = this.$rememberedOnFail$delegate;
                InterfaceC43172j interfaceC43172j = new InterfaceC43172j() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.GroupSubscriptionSheet.2.1.2.2
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super G0>) continuation);
                    }

                    public final Object emit(boolean z12, Continuation<? super G0> continuation) {
                        if (z12) {
                            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$15(interfaceC22204y1, false);
                        }
                        if (!z12 && GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$20(interfaceC22204y12) && !GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$14(interfaceC22204y1)) {
                            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(i32).invoke(new VKIDGroupSubscriptionFail.Dismiss());
                        }
                        GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$21(interfaceC22204y12, z12);
                        return G0.f406611a;
                    }
                };
                this.label = 1;
                if (interfaceC43160iR.collect(interfaceC43172j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1(GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC22204y1<Boolean> interfaceC22204y1, InterfaceC22204y1<Boolean> interfaceC22204y12, I3<? extends Y41.l<? super VKIDGroupSubscriptionFail, G0>> i32, Continuation<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1> continuation) {
        super(2, continuation);
        this.$state = groupSubscriptionSheetState;
        this.$isSuccess$delegate = interfaceC22204y1;
        this.$wasVisible$delegate = interfaceC22204y12;
        this.$rememberedOnFail$delegate = i32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1(this.$state, this.$isSuccess$delegate, this.$wasVisible$delegate, this.$rememberedOnFail$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            CrashReporter crashReporter = VKID.INSTANCE.getInstance().getCrashReporter();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, this.$isSuccess$delegate, this.$wasVisible$delegate, this.$rememberedOnFail$delegate, null);
            this.label = 1;
            if (crashReporter.runReportingCrashesSuspend(anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$2$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
