package com.vk.id.network.groupsubscription;

import Y41.p;
import Y61.k;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import com.vk.id.network.groupsubscription.data.InternalVKIDMemberData;
import com.vk.id.network.groupsubscription.exception.InternalVKIDAlreadyGroupMemberException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;
import kotlin.ranges.s;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InternalVKIDGroupSubscriptionApiService.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiService;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "api", "<init>", "(Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;)V", "", "accessToken", "", "shouldShowSubscription", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isServiceAccount", "groupId", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "getGroup", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "justFriends", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "getMembers", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "subscribeToGroup", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApi;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDGroupSubscriptionApiService implements InternalVKIDGroupSubscriptionApiContract {

    @k
    private final InternalVKIDGroupSubscriptionApi api;

    /* compiled from: InternalVKIDGroupSubscriptionApiService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$getGroup$2", f = "InternalVKIDGroupSubscriptionApiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$getGroup$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super InternalVKIDGroupByIdData>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return InternalVKIDGroupSubscriptionApiService.this.new AnonymousClass2(this.$accessToken, this.$groupId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ResponseBody responseBodyBody = InternalVKIDGroupSubscriptionApiService.this.api.getGroup(this.$accessToken, this.$groupId).execute().body();
            if (responseBodyBody == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            JSONObject jSONObject = new JSONObject(responseBodyBody.string());
            if (!jSONObject.isNull("error")) {
                throw new IOException(jSONObject.getString("error"));
            }
            JSONObject jSONObject2 = (JSONObject) jSONObject.getJSONObject("response").getJSONArray("groups").get(0);
            if (jSONObject2.getInt("is_member") != 1) {
                return new InternalVKIDGroupByIdData(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.getString("photo_200"), jSONObject2.getString("description"), jSONObject2.getInt("verified") == 1);
            }
            throw new InternalVKIDAlreadyGroupMemberException();
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InternalVKIDGroupByIdData> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: InternalVKIDGroupSubscriptionApiService.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$getMembers$2", f = "InternalVKIDGroupSubscriptionApiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$getMembers$2, reason: invalid class name and case insensitive filesystem */
    public static final class C378992 extends SuspendLambda implements p<T, Continuation<? super InternalVKIDGroupMembersData>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String $groupId;
        final /* synthetic */ boolean $justFriends;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378992(String str, String str2, boolean z12, Continuation<? super C378992> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$groupId = str2;
            this.$justFriends = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return InternalVKIDGroupSubscriptionApiService.this.new C378992(this.$accessToken, this.$groupId, this.$justFriends, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException, IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ResponseBody responseBodyBody = InternalVKIDGroupSubscriptionApiService.this.api.getMembers(this.$accessToken, this.$groupId, this.$justFriends).execute().body();
            if (responseBodyBody == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            JSONObject jSONObject = new JSONObject(responseBodyBody.string());
            if (!jSONObject.isNull("error")) {
                throw new IOException(jSONObject.getString("error"));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            int i12 = jSONObject2.getInt("count");
            l lVarR = s.r(0, jSONArray.length());
            ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
            kotlin.ranges.k it = lVarR.iterator();
            while (it.f406910d) {
                arrayList.add(new InternalVKIDMemberData(jSONArray.getJSONObject(it.a()).getString("photo_200")));
            }
            return new InternalVKIDGroupMembersData(i12, arrayList);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InternalVKIDGroupMembersData> continuation) {
            return ((C378992) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: InternalVKIDGroupSubscriptionApiService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$isServiceAccount$2", f = "InternalVKIDGroupSubscriptionApiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$isServiceAccount$2, reason: invalid class name and case insensitive filesystem */
    public static final class C379002 extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $accessToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C379002(String str, Continuation<? super C379002> continuation) {
            super(2, continuation);
            this.$accessToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return InternalVKIDGroupSubscriptionApiService.this.new C379002(this.$accessToken, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ResponseBody responseBodyBody = InternalVKIDGroupSubscriptionApiService.this.api.getProfileShortInfo(this.$accessToken).execute().body();
            if (responseBodyBody == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            JSONObject jSONObject = new JSONObject(responseBodyBody.string());
            if (jSONObject.isNull("error")) {
                return Boxing.boxBoolean(jSONObject.getJSONObject("response").getBoolean("is_service_account"));
            }
            throw new IOException(jSONObject.getString("error"));
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((C379002) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: InternalVKIDGroupSubscriptionApiService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$shouldShowSubscription$2", f = "InternalVKIDGroupSubscriptionApiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$shouldShowSubscription$2, reason: invalid class name and case insensitive filesystem */
    public static final class C379012 extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $accessToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C379012(String str, Continuation<? super C379012> continuation) {
            super(2, continuation);
            this.$accessToken = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return InternalVKIDGroupSubscriptionApiService.this.new C379012(this.$accessToken, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ResponseBody responseBodyBody = InternalVKIDGroupSubscriptionApiService.this.api.getShouldShowSubscription(this.$accessToken).execute().body();
            if (responseBodyBody != null) {
                return Boxing.boxBoolean(new JSONObject(responseBodyBody.string()).getJSONObject("response").getBoolean("show"));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((C379012) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* compiled from: InternalVKIDGroupSubscriptionApiService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$subscribeToGroup$2", f = "InternalVKIDGroupSubscriptionApiService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService$subscribeToGroup$2, reason: invalid class name and case insensitive filesystem */
    public static final class C379022 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C379022(String str, String str2, Continuation<? super C379022> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return InternalVKIDGroupSubscriptionApiService.this.new C379022(this.$accessToken, this.$groupId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ResponseBody responseBodyBody = InternalVKIDGroupSubscriptionApiService.this.api.subscribeToGroup(this.$accessToken, this.$groupId).execute().body();
            if (responseBodyBody == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            JSONObject jSONObject = new JSONObject(responseBodyBody.string());
            if (jSONObject.has("response") && jSONObject.getInt("response") == 1) {
                return G0.f406611a;
            }
            throw new IOException(jSONObject.getString("error"));
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C379022) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public InternalVKIDGroupSubscriptionApiService(@k InternalVKIDGroupSubscriptionApi internalVKIDGroupSubscriptionApi) {
        this.api = internalVKIDGroupSubscriptionApi;
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    @Y61.l
    public Object getGroup(@k String str, @k String str2, @k Continuation<? super InternalVKIDGroupByIdData> continuation) {
        return C43259k.g(C43262l0.f411947c, new AnonymousClass2(str, str2, null), continuation);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    @Y61.l
    public Object getMembers(@k String str, @k String str2, boolean z12, @k Continuation<? super InternalVKIDGroupMembersData> continuation) {
        return C43259k.g(C43262l0.f411947c, new C378992(str, str2, z12, null), continuation);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    @Y61.l
    public Object isServiceAccount(@k String str, @k Continuation<? super Boolean> continuation) {
        return C43259k.g(C43262l0.f411947c, new C379002(str, null), continuation);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    @Y61.l
    public Object shouldShowSubscription(@k String str, @k Continuation<? super Boolean> continuation) {
        return C43259k.g(C43262l0.f411947c, new C379012(str, null), continuation);
    }

    @Override // com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract
    @Y61.l
    public Object subscribeToGroup(@k String str, @k String str2, @k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(C43262l0.f411947c, new C379022(str, str2, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
