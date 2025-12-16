package com.vk.id.group.subscription.compose.interactor;

import Y41.a;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.compose.storage.GroupSubscriptionPrefsStorage;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import com.vk.id.network.groupsubscription.data.InternalVKIDMemberData;
import com.vk.id.storage.InternalVKIDTokenStorage;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: GroupSubscriptionInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010%\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor;", "", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "apiService", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "", "groupId", "Lkotlin/Function0;", "externalAccessTokenProvider", "Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;", "storage", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "limit", "<init>", "(Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;Lcom/vk/id/storage/InternalVKIDTokenStorage;Ljava/lang/String;LY41/a;Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "", "passesRemoteLimits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "passesLocalLimits", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;", "getGroup", "Lkotlin/G0;", "saveDisplay$group_subscription_compose_release", "saveDisplay", "loadGroup$group_subscription_compose_release", "loadGroup", "subscribeToGroup$group_subscription_compose_release", "subscribeToGroup", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Ljava/lang/String;", "LY41/a;", "Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getAccessToken", "()Ljava/lang/String;", "accessToken", "Companion", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionInteractor {

    @k
    private final InternalVKIDGroupSubscriptionApiContract apiService;

    @l
    private final a<String> externalAccessTokenProvider;

    @k
    private final String groupId;

    @l
    private final GroupSubscriptionLimit limit;

    @k
    private final GroupSubscriptionPrefsStorage storage;

    @k
    private final InternalVKIDTokenStorage tokenStorage;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GroupSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor$Companion;", "", "<init>", "()V", "IMAGE_NUMBER", "", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GroupSubscriptionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2", f = "GroupSubscriptionInteractor.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super InternalVKIDGroupData>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: GroupSubscriptionInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$1", f = "GroupSubscriptionInteractor.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super InternalVKIDGroupByIdData>, Object> {
            int label;
            final /* synthetic */ GroupSubscriptionInteractor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = groupSubscriptionInteractor;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.label;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract = this.this$0.apiService;
                    String accessToken = this.this$0.getAccessToken();
                    String str = this.this$0.groupId;
                    this.label = 1;
                    obj = internalVKIDGroupSubscriptionApiContract.getGroup(accessToken, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super InternalVKIDGroupByIdData> continuation) {
                return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* compiled from: GroupSubscriptionInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$2", f = "GroupSubscriptionInteractor.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C108302 extends SuspendLambda implements p<T, Continuation<? super InternalVKIDGroupMembersData>, Object> {
            int label;
            final /* synthetic */ GroupSubscriptionInteractor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C108302(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super C108302> continuation) {
                super(2, continuation);
                this.this$0 = groupSubscriptionInteractor;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new C108302(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.label;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract = this.this$0.apiService;
                    String accessToken = this.this$0.getAccessToken();
                    String str = this.this$0.groupId;
                    this.label = 1;
                    obj = internalVKIDGroupSubscriptionApiContract.getMembers(accessToken, str, false, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super InternalVKIDGroupMembersData> continuation) {
                return ((C108302) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* compiled from: GroupSubscriptionInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$3", f = "GroupSubscriptionInteractor.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements p<T, Continuation<? super InternalVKIDGroupMembersData>, Object> {
            int label;
            final /* synthetic */ GroupSubscriptionInteractor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(GroupSubscriptionInteractor groupSubscriptionInteractor, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = groupSubscriptionInteractor;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.label;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract = this.this$0.apiService;
                    String accessToken = this.this$0.getAccessToken();
                    String str = this.this$0.groupId;
                    this.label = 1;
                    obj = internalVKIDGroupSubscriptionApiContract.getMembers(accessToken, str, true, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super InternalVKIDGroupMembersData> continuation) {
                return ((AnonymousClass3) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = GroupSubscriptionInteractor.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.L$0;
                InterfaceC43076a0[] interfaceC43076a0Arr = {C43259k.b(t12, null, new AnonymousClass1(GroupSubscriptionInteractor.this, null), 3), C43259k.b(t12, null, new C108302(GroupSubscriptionInteractor.this, null), 3), C43259k.b(t12, null, new AnonymousClass3(GroupSubscriptionInteractor.this, null), 3)};
                this.label = 1;
                obj = C43225h.b(interfaceC43076a0Arr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            List list = (List) obj;
            InternalVKIDGroupByIdData internalVKIDGroupByIdData = (InternalVKIDGroupByIdData) list.get(0);
            InternalVKIDGroupMembersData internalVKIDGroupMembersData = (InternalVKIDGroupMembersData) list.get(1);
            InternalVKIDGroupMembersData internalVKIDGroupMembersData2 = (InternalVKIDGroupMembersData) list.get(2);
            String imageUrl = internalVKIDGroupByIdData.getImageUrl();
            String name = internalVKIDGroupByIdData.getName();
            String description = internalVKIDGroupByIdData.getDescription();
            ArrayList arrayListH0 = C42745f0.h0(internalVKIDGroupMembersData2.getMembers(), internalVKIDGroupMembersData.getMembers());
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListH0, 10));
            Iterator it = arrayListH0.iterator();
            while (it.hasNext()) {
                arrayList.add(((InternalVKIDMemberData) it.next()).getImageUrl());
            }
            return new InternalVKIDGroupData(imageUrl, name, description, C42745f0.E0(arrayList, 3), internalVKIDGroupMembersData.getCount(), internalVKIDGroupMembersData2.getCount(), internalVKIDGroupByIdData.getIsVerified());
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InternalVKIDGroupData> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: GroupSubscriptionInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$passesLocalLimits$2", f = "GroupSubscriptionInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$passesLocalLimits$2, reason: invalid class name and case insensitive filesystem */
    public static final class C378942 extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        int label;

        public C378942(Continuation<? super C378942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return GroupSubscriptionInteractor.this.new C378942(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            if (GroupSubscriptionInteractor.this.limit == null) {
                return Boxing.boxBoolean(true);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(6, -GroupSubscriptionInteractor.this.limit.getPeriodInDays());
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            if (accessToken == null) {
                return Boxing.boxBoolean(false);
            }
            long userID = accessToken.getUserID();
            Set<Date> displays = GroupSubscriptionInteractor.this.storage.getDisplays(userID);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : displays) {
                if (((Date) obj2).after(calendar.getTime())) {
                    arrayList.add(obj2);
                }
            }
            Set<? extends Date> setP0 = C42745f0.P0(arrayList);
            GroupSubscriptionInteractor.this.storage.saveDisplays(userID, setP0);
            return Boxing.boxBoolean(setP0.size() < GroupSubscriptionInteractor.this.limit.getMaxSubscriptionsToShow());
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((C378942) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public GroupSubscriptionInteractor(@k InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract, @k InternalVKIDTokenStorage internalVKIDTokenStorage, @k String str, @l a<String> aVar, @k GroupSubscriptionPrefsStorage groupSubscriptionPrefsStorage, @l GroupSubscriptionLimit groupSubscriptionLimit) {
        this.apiService = internalVKIDGroupSubscriptionApiContract;
        this.tokenStorage = internalVKIDTokenStorage;
        this.groupId = str;
        this.externalAccessTokenProvider = aVar;
        this.storage = groupSubscriptionPrefsStorage;
        this.limit = groupSubscriptionLimit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAccessToken() {
        String strInvoke;
        a<String> aVar = this.externalAccessTokenProvider;
        if (aVar != null && (strInvoke = aVar.invoke()) != null) {
            return strInvoke;
        }
        AccessToken currentAccessToken = this.tokenStorage.getCurrentAccessToken();
        if (currentAccessToken != null) {
            return currentAccessToken.getToken();
        }
        throw new NotAuthorizedException();
    }

    private final Object getGroup(Continuation<? super InternalVKIDGroupData> continuation) {
        return C43259k.g(continuation.getF411960f(), new AnonymousClass2(null), continuation);
    }

    private final Object passesLocalLimits(Continuation<? super Boolean> continuation) {
        return C43259k.g(C43262l0.f411947c, new C378942(null), continuation);
    }

    private final Object passesRemoteLimits(Continuation<? super Boolean> continuation) {
        return this.apiService.shouldShowSubscription(getAccessToken(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadGroup$group_subscription_compose_release(@Y61.k kotlin.coroutines.Continuation<? super com.vk.id.network.groupsubscription.data.InternalVKIDGroupData> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$loadGroup$1
            if (r0 == 0) goto L13
            r0 = r8
            com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$loadGroup$1 r0 = (com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$loadGroup$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$loadGroup$1 r0 = new com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$loadGroup$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.C42729a0.b(r8)
            goto La2
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.L$0
            com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor r2 = (com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor) r2
            kotlin.C42729a0.b(r8)
            goto L8e
        L43:
            java.lang.Object r2 = r0.L$0
            com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor r2 = (com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor) r2
            kotlin.C42729a0.b(r8)
            goto L75
        L4b:
            java.lang.Object r2 = r0.L$0
            com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor r2 = (com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor) r2
            kotlin.C42729a0.b(r8)
            goto L62
        L53:
            kotlin.C42729a0.b(r8)
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r8 = r7.passesLocalLimits(r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            r2 = r7
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Laf
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r8 = r2.passesRemoteLimits(r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto La9
            com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract r8 = r2.apiService
            java.lang.String r5 = r2.getAccessToken()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.isServiceAccount(r5, r0)
            if (r8 != r1) goto L8e
            return r1
        L8e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto La3
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = r2.getGroup(r0)
            if (r8 != r1) goto La2
            return r1
        La2:
            return r8
        La3:
            com.vk.id.group.subscription.compose.interactor.ServiceAccountException r8 = new com.vk.id.group.subscription.compose.interactor.ServiceAccountException
            r8.<init>()
            throw r8
        La9:
            com.vk.id.group.subscription.compose.interactor.RemoteLimitReachedException r8 = new com.vk.id.group.subscription.compose.interactor.RemoteLimitReachedException
            r8.<init>()
            throw r8
        Laf:
            com.vk.id.group.subscription.compose.interactor.ClientLimitReachedException r8 = new com.vk.id.group.subscription.compose.interactor.ClientLimitReachedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor.loadGroup$group_subscription_compose_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @l
    public final Object saveDisplay$group_subscription_compose_release(@k Continuation<? super G0> continuation) {
        Object objRunReportingCrashesSuspend = VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashesSuspend(new GroupSubscriptionInteractor$saveDisplay$2(null), new GroupSubscriptionInteractor$saveDisplay$3(this, null), continuation);
        return objRunReportingCrashesSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunReportingCrashesSuspend : G0.f406611a;
    }

    @l
    public final Object subscribeToGroup$group_subscription_compose_release(@k Continuation<? super G0> continuation) {
        Object objSubscribeToGroup = this.apiService.subscribeToGroup(getAccessToken(), this.groupId, continuation);
        return objSubscribeToGroup == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSubscribeToGroup : G0.f406611a;
    }
}
