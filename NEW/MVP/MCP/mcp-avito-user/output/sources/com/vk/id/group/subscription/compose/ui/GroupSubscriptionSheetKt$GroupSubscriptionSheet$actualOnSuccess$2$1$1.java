package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import androidx.compose.material3.C21729mg;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
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
@DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
    final /* synthetic */ Y41.a<String> $accessTokenProvider;
    final /* synthetic */ C21729mg $actualSnackbarHostState;
    final /* synthetic */ String $snackbarLabel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1(Y41.a<String> aVar, C21729mg c21729mg, String str, Continuation<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1> continuation) {
        super(2, continuation);
        this.$accessTokenProvider = aVar;
        this.$actualSnackbarHostState = c21729mg;
        this.$snackbarLabel = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1(this.$accessTokenProvider, this.$actualSnackbarHostState, this.$snackbarLabel, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String token;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 == 0) {
            C42729a0.b(obj);
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            Y41.a<String> aVar = this.$accessTokenProvider;
            if (aVar == null || (token = aVar.invoke()) == null) {
                AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
                token = accessToken != null ? accessToken.getToken() : null;
            }
            groupSubscriptionAnalytics.successShown$group_subscription_compose_release(token);
            C21729mg c21729mg = this.$actualSnackbarHostState;
            String str = this.$snackbarLabel;
            this.label = 1;
            if (C21729mg.b(c21729mg, str, this) == coroutine_suspended) {
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
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }
}
