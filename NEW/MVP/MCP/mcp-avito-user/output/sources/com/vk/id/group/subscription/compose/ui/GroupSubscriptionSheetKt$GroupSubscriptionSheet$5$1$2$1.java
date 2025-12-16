package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.facebook.imageutils.JfifUtil;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.compose.interactor.ClientLimitReachedException;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.interactor.RemoteLimitReachedException;
import com.vk.id.group.subscription.compose.interactor.ServiceAccountException;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupData;
import com.vk.id.network.groupsubscription.exception.InternalVKIDAlreadyGroupMemberException;
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
@DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {JfifUtil.MARKER_APP1}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    final /* synthetic */ I3<Y41.l<VKIDGroupSubscriptionFail, G0>> $rememberedOnFail$delegate;
    final /* synthetic */ InterfaceC22204y1<Boolean> $showBottomSheet$delegate;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC22204y1<GroupSubscriptionSheetStatus> $status;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1(GroupSubscriptionInteractor groupSubscriptionInteractor, GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC22204y1<GroupSubscriptionSheetStatus> interfaceC22204y1, InterfaceC22204y1<Boolean> interfaceC22204y12, I3<? extends Y41.l<? super VKIDGroupSubscriptionFail, G0>> i32, Continuation<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1> continuation) {
        super(2, continuation);
        this.$interactor = groupSubscriptionInteractor;
        this.$state = groupSubscriptionSheetState;
        this.$status = interfaceC22204y1;
        this.$showBottomSheet$delegate = interfaceC22204y12;
        this.$rememberedOnFail$delegate = i32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1(this.$interactor, this.$state, this.$status, this.$showBottomSheet$delegate, this.$rememberedOnFail$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                GroupSubscriptionInteractor groupSubscriptionInteractor = this.$interactor;
                this.label = 1;
                obj = groupSubscriptionInteractor.loadGroup$group_subscription_compose_release(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            InterfaceC22204y1<GroupSubscriptionSheetStatus> interfaceC22204y1 = this.$status;
            InterfaceC22204y1<Boolean> interfaceC22204y12 = this.$showBottomSheet$delegate;
            InternalVKIDGroupData internalVKIDGroupData = (InternalVKIDGroupData) obj;
            String imageUrl = internalVKIDGroupData.getImageUrl();
            String name = internalVKIDGroupData.getName();
            interfaceC22204y1.setValue(new GroupSubscriptionSheetStatus.Loaded(new GroupSubscriptionSheetStatusData(imageUrl, internalVKIDGroupData.getDescription(), name, internalVKIDGroupData.getUserImageUrls(), internalVKIDGroupData.getSubscriberCount(), internalVKIDGroupData.getFriendsCount(), internalVKIDGroupData.getIsVerified())));
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(interfaceC22204y12, true);
        } catch (ClientLimitReachedException unused) {
            this.$state.hide();
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate).invoke(new VKIDGroupSubscriptionFail.ClientLimitReached());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (RemoteLimitReachedException unused2) {
            this.$state.hide();
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate).invoke(new VKIDGroupSubscriptionFail.RemoteLimitReached());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (ServiceAccountException unused3) {
            this.$state.hide();
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate).invoke(new VKIDGroupSubscriptionFail.ServiceAccount());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (InternalVKIDAlreadyGroupMemberException unused4) {
            this.$state.hide();
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate).invoke(new VKIDGroupSubscriptionFail.AlreadyGroupMember());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (Throwable th2) {
            this.$state.hide();
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate).invoke(new VKIDGroupSubscriptionFail.Other(th2));
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        }
        return G0.f406611a;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
