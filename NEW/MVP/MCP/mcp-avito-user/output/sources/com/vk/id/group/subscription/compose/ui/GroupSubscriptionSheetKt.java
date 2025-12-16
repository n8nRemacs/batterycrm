package com.vk.id.group.subscription.compose.ui;

import Y41.p;
import Y41.q;
import android.content.Context;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20614r1;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.E;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.S0;
import androidx.compose.material3.C21729mg;
import androidx.compose.material3.C21914uj;
import androidx.compose.material3.C22015za;
import androidx.compose.material3.Me;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J2;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.M;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.z;
import androidx.compose.ui.v;
import coil.request.p;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import com.vk.id.group.subscription.compose.util.StylingUtilKt;
import com.vk.id.group.subscription.compose.util.TightWrapTextKt;
import com.vk.id.group.subscription.compose.util.UserImageTransformation;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: GroupSubscriptionSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aw\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010!\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"\u001ag\u0010(\u001a\u00020\u00072\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#\u0012\u0006\u0012\u0004\u0018\u00010$0\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b(\u0010)\u001a;\u0010+\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020*2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u0012H\u0001¢\u0006\u0004\b+\u0010,\u001aA\u0010.\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b.\u0010/\u001aA\u00100\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b0\u0010/\u001aT\u00103\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0002\b1H\u0003¢\u0006\u0004\b3\u00104\u001a\\\u00106\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0002\b1H\u0003¢\u0006\u0004\b6\u00107\u001aX\u00109\u001a\u00020\u0007*\u0002082\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0002\b1H\u0003¢\u0006\u0004\b9\u0010:\u001a#\u0010;\u001a\u00020\u0007*\u0002082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b;\u0010<\u001a#\u0010=\u001a\u00020\u0007*\u0002082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b=\u0010<\u001a7\u0010>\u001a\u00020\u0007*\u0002082\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b>\u0010?\u001aS\u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00070\u00122\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00122\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u0000H\u0003¢\u0006\u0004\bC\u0010D\u001a\u000f\u0010E\u001a\u00020\u0000H\u0003¢\u0006\u0004\bE\u0010\u0002¨\u0006O²\u0006\u000e\u0010F\u001a\u00020A8\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010H\u001a\u00020A8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010J\u001a\u00020A8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010K\u001a\u00020A8\n@\nX\u008a\u008e\u0002²\u0006\"\u0010L\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#\u0012\u0006\u0012\u0004\u0018\u00010$0\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010N\u001a\u00020M8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "rememberGroupSubscriptionSheetState", "(Landroidx/compose/runtime/A;I)Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "Landroidx/compose/material3/mg;", "snackbarHostState", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "GroupSubscriptionSnackbarHost", "(Landroidx/compose/material3/mg;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Landroidx/compose/runtime/A;II)V", "Landroidx/compose/ui/v;", "modifier", VoiceInfo.STATE, "Lkotlin/Function0;", "", "accessTokenProvider", "groupId", "onSuccess", "Lkotlin/Function1;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "onFail", "GroupSubscriptionSheet", "(Landroidx/compose/ui/v;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;LY41/a;Ljava/lang/String;LY41/a;LY41/l;Landroidx/compose/material3/mg;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Landroidx/compose/runtime/A;II)V", "Landroidx/compose/runtime/y1;", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;", "status", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;", "data", "Lkotlinx/coroutines/T;", "coroutineScope", "Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor;", "interactor", "progressStatus", "subscribeToGroup", "(Landroidx/compose/runtime/y1;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lkotlinx/coroutines/T;Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor;LY41/a;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus;)V", "Lkotlin/coroutines/Continuation;", "", "saveDisplay", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Loaded;", "onSubscribeButtonClick", "LoadedState", "(LY41/l;LY41/l;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Loaded;LY41/a;Landroidx/compose/runtime/A;I)V", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Subscribing;", "SubscribingState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatus$Subscribing;LY41/l;Landroidx/compose/runtime/A;I)V", "onRetry", "ResubscribingState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;LY41/l;LY41/a;Landroidx/compose/runtime/A;I)V", "FailureState", "Landroidx/compose/runtime/o;", "retryButtonContent", "FailureDataState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;LY41/l;LY41/a;LY41/p;Landroidx/compose/runtime/A;I)V", "subscribeButtonContent", "DataState", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;LY41/l;LY41/a;LY41/p;Landroidx/compose/runtime/A;I)V", "Landroidx/compose/foundation/layout/J;", "DataStateButtons", "(Landroidx/compose/foundation/layout/J;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;LY41/a;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;LY41/l;LY41/p;Landroidx/compose/runtime/A;I)V", "DataStateSubscribers", "(Landroidx/compose/foundation/layout/J;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;Landroidx/compose/runtime/A;I)V", "DataStateLabels", "DataStateHeader", "(Landroidx/compose/foundation/layout/J;LY41/l;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetStatusData;Landroidx/compose/runtime/A;I)V", "onAuthStatusChange", "", "onShowBottomSheetChange", "processSheetShow", "(LY41/l;LY41/l;Lkotlinx/coroutines/T;Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;Landroidx/compose/runtime/A;I)LY41/l;", "rememberGroupSubscriptionSheetStateInternal", "showBottomSheet", "rememberedOnFail", "isSuccess", "actualOnSuccess", "wasVisible", "once", "rememberedSaveDisplay", "Landroidx/compose/material3/SheetValue;", "previousValue", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt {

    /* compiled from: GroupSubscriptionSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$subscribeToGroup$1", f = "GroupSubscriptionSheet.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$subscribeToGroup$1, reason: invalid class name and case insensitive filesystem */
    public static final class C378981 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ GroupSubscriptionSheetStatusData $data;
        final /* synthetic */ GroupSubscriptionInteractor $interactor;
        final /* synthetic */ Y41.a<G0> $onSuccess;
        final /* synthetic */ GroupSubscriptionSheetState $state;
        final /* synthetic */ InterfaceC22204y1<GroupSubscriptionSheetStatus> $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C378981(GroupSubscriptionInteractor groupSubscriptionInteractor, Y41.a<G0> aVar, GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC22204y1<GroupSubscriptionSheetStatus> interfaceC22204y1, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, Continuation<? super C378981> continuation) {
            super(2, continuation);
            this.$interactor = groupSubscriptionInteractor;
            this.$onSuccess = aVar;
            this.$state = groupSubscriptionSheetState;
            this.$status = interfaceC22204y1;
            this.$data = groupSubscriptionSheetStatusData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new C378981(this.$interactor, this.$onSuccess, this.$state, this.$status, this.$data, continuation);
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
                    if (groupSubscriptionInteractor.subscribeToGroup$group_subscription_compose_release(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                this.$onSuccess.invoke();
                this.$state.hide();
            } catch (Throwable unused) {
                this.$status.setValue(new GroupSubscriptionSheetStatus.Failure(this.$data));
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C378981) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    private static final void DataState(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, Y41.l<? super VKIDGroupSubscriptionFail, G0> lVar, Y41.a<G0> aVar, p<? super A, ? super Integer, G0> pVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(651367239);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetState) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetStatusData) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.u(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.u(pVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i14 = i13;
        if ((74899 & i14) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar2 = v.f42878y1;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            v vVarI = R1.i(aVar2, 16);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            bE2.I(-483455358);
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar4, bE2, 48);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = M.c(vVarI);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar2);
            }
            androidx.compose.foundation.H.y(0, c22096nC, J2.a(bE2), bE2, 2058660585);
            K k12 = K.f28344a;
            int i16 = i14 >> 6;
            int i17 = i14 << 3;
            DataStateHeader(k12, lVar, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, bE2, (i17 & 896) | (i16 & 112) | 6 | (i17 & 7168));
            C20608p2.a(bE2, C20588k2.f(aVar2, 12));
            int i18 = (i17 & 112) | 6;
            int i19 = (i14 & 896) | i18;
            DataStateLabels(k12, groupSubscriptionStyle, groupSubscriptionSheetStatusData, bE2, i19);
            C20608p2.a(bE2, C20588k2.f(aVar2, 8));
            DataStateSubscribers(k12, groupSubscriptionStyle, groupSubscriptionSheetStatusData, bE2, i19);
            C20608p2.a(bE2, C20588k2.f(aVar2, 20));
            DataStateButtons(k12, groupSubscriptionStyle, aVar, groupSubscriptionSheetState, lVar, pVar, bE2, i18 | (i16 & 896) | ((i14 << 6) & 7168) | (i17 & 57344) | (458752 & i14));
            androidx.compose.foundation.H.B(bE2, false, true, false, false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(groupSubscriptionStyle, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, lVar, aVar, pVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataState$lambda$51(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, Y41.l lVar, Y41.a aVar, p pVar, int i12, A a12, int i13) {
        DataState(groupSubscriptionStyle, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, lVar, aVar, pVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void DataStateButtons(androidx.compose.foundation.layout.J r18, com.vk.id.group.subscription.common.style.GroupSubscriptionStyle r19, Y41.a<kotlin.G0> r20, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState r21, Y41.l<? super com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail, kotlin.G0> r22, final Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r23, androidx.compose.runtime.A r24, int r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.DataStateButtons(androidx.compose.foundation.layout.J, com.vk.id.group.subscription.common.style.GroupSubscriptionStyle, Y41.a, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState, Y41.l, Y41.p, androidx.compose.runtime.A, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataStateButtons$lambda$53$lambda$52(GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar) {
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.nextTimeClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        groupSubscriptionSheetState.hide();
        lVar.invoke(new VKIDGroupSubscriptionFail.Cancel());
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataStateButtons$lambda$54(J j12, GroupSubscriptionStyle groupSubscriptionStyle, Y41.a aVar, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, p pVar, int i12, A a12, int i13) {
        DataStateButtons(j12, groupSubscriptionStyle, aVar, groupSubscriptionSheetState, lVar, pVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void DataStateHeader(androidx.compose.foundation.layout.J r22, Y41.l<? super com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail, kotlin.G0> r23, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState r24, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatusData r25, androidx.compose.runtime.A r26, int r27) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.DataStateHeader(androidx.compose.foundation.layout.J, Y41.l, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatusData, androidx.compose.runtime.A, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataStateHeader$lambda$67$lambda$66$lambda$65(GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar) {
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.close$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        groupSubscriptionSheetState.hide();
        lVar.invoke(new VKIDGroupSubscriptionFail.Close());
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataStateHeader$lambda$69(J j12, Y41.l lVar, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i12, A a12, int i13) {
        DataStateHeader(j12, lVar, groupSubscriptionSheetState, groupSubscriptionSheetStatusData, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @InterfaceC22132o
    @InterfaceC22181t
    private static final void DataStateLabels(J j12, final GroupSubscriptionStyle groupSubscriptionStyle, final GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, A a12, int i12) {
        int i13;
        int i14;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar;
        v.a aVar;
        ?? r32;
        B bE2 = a12.E(1308295584);
        if ((i12 & 48) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetStatusData) ? 256 : 128;
        }
        if ((i13 & 145) == 144 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39087m;
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            bE2.I(693286680);
            v.a aVar2 = v.f42878y1;
            C20568f2 c20568f2A = C20563e2.a(cVar, bVar, bE2, 54);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = M.c(aVar2);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
            R3.b(pVar2, bE2, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
            R3.b(pVar3, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar4);
            }
            androidx.compose.foundation.H.y(0, c22096nC, J2.a(bE2), bE2, 2058660585);
            C20576h2 c20576h2 = C20576h2.f28641a;
            E.a(null, null, false, r.b(bE2, 147289434, new q<F, A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$DataStateLabels$1$1
                @Override // Y41.q
                public /* bridge */ /* synthetic */ G0 invoke(F f12, A a13, Integer num) {
                    invoke(f12, a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(F f12, A a13, int i16) {
                    int i17;
                    if ((i16 & 6) == 0) {
                        i17 = i16 | (a13.B(f12) ? 4 : 2);
                    } else {
                        i17 = i16;
                    }
                    if ((i17 & 19) == 18 && a13.c()) {
                        a13.f();
                        return;
                    }
                    String groupName = groupSubscriptionSheetStatusData.getGroupName();
                    v.a aVar4 = v.f42878y1;
                    float fH2 = f12.h();
                    float f13 = groupSubscriptionSheetStatusData.getIsGroupVerified() ? 20 : 0;
                    h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                    v vVarV = C20588k2.v(0.0f, fH2 - f13, 1, aVar4);
                    androidx.compose.ui.text.style.i.f42675b.getClass();
                    int i18 = androidx.compose.ui.text.style.i.f42678e;
                    long jTextPrimaryColor = StylingUtilKt.textPrimaryColor(groupSubscriptionStyle, a13, 0);
                    long jE2 = z.e(23);
                    long jE3 = z.e(28);
                    e0.f42240c.getClass();
                    x0 x0Var = new x0(jTextPrimaryColor, jE2, e0.f42249l, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i18, 0, jE3, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null);
                    s.f42720b.getClass();
                    TightWrapTextKt.m118TightWrapTextpNBRTJQ(groupName, vVarV, x0Var, 2, s.f42722d, a13, 27648);
                }
            }), bE2, 3072, 7);
            bE2.I(1829618985);
            if (groupSubscriptionSheetStatusData.getIsGroupVerified()) {
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                C20608p2.a(bE2, C20588k2.t(aVar2, 6));
                float fE2 = ((androidx.compose.ui.unit.d) bE2.o(Q0.f41199h)).E(z.e(4));
                float f12 = 20;
                i14 = 20;
                pVar = pVar2;
                aVar = aVar2;
                r32 = 0;
                C20806p1.a(u0.e.a(R.drawable.vkid_verified_20, 0, bE2), null, R1.m(C20588k2.t(C20588k2.f(aVar2, f12 + fE2), f12), 0.0f, 0.0f, 0.0f, fE2, 7), null, null, 0.0f, null, bE2, 48, 120);
            } else {
                i14 = 20;
                pVar = pVar2;
                aVar = aVar2;
                r32 = 0;
            }
            androidx.compose.foundation.H.B(bE2, r32, r32, true, r32);
            bE2.X(r32);
            if (!C43066x.K(groupSubscriptionSheetStatusData.getGroupDescription())) {
                h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
                v.a aVar6 = aVar;
                C20608p2.a(bE2, C20588k2.f(aVar6, 12));
                bE2.I(693286680);
                C20568f2 c20568f2A2 = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, r32);
                bE2.I(-1323940314);
                int i16 = bE2.f37888Q;
                O1 o1S2 = bE2.S();
                C22096n c22096nC2 = M.c(aVar6);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, c20568f2A2);
                R3.b(pVar3, bE2, o1S2);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                    AK.c.y(i16, bE2, i16, pVar4);
                }
                androidx.compose.foundation.H.y(r32, c22096nC2, J2.a(bE2), bE2, 2058660585);
                String groupDescription = groupSubscriptionSheetStatusData.getGroupDescription();
                androidx.compose.ui.text.style.i.f42675b.getClass();
                int i17 = androidx.compose.ui.text.style.i.f42680g;
                long jTextSecondaryColor = StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, bE2, (i13 >> 3) & 14);
                long jE2 = z.e(16);
                long jE3 = z.e(i14);
                e0.f42240c.getClass();
                x0 x0Var = new x0(jTextSecondaryColor, jE2, e0.f42247j, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i17, 0, jE3, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null);
                s.f42720b.getClass();
                C21914uj.b(groupDescription, aVar6, 0L, 0L, null, null, null, 0L, null, null, 0L, s.f42722d, false, 3, 0, null, x0Var, bE2, 48, 3120, 55292);
                C20608p2.a(bE2, c20576h2.a(aVar6, 1.0f, true));
                bE2.X(false);
                bE2.X(true);
                bE2.X(false);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(j12, groupSubscriptionStyle, groupSubscriptionSheetStatusData, i12, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataStateLabels$lambda$64(J j12, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i12, A a12, int i13) {
        DataStateLabels(j12, groupSubscriptionStyle, groupSubscriptionSheetStatusData, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    private static final void DataStateSubscribers(J j12, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1304970298);
        if ((i12 & 48) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetStatusData) ? 256 : 128;
        }
        int i14 = i13;
        if ((i14 & 145) == 144 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            bE2.I(693286680);
            v.a aVar = v.f42878y1;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
            bE2.I(-1323940314);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = M.c(aVar);
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            androidx.compose.foundation.H.y(0, c22096nC, J2.a(bE2), bE2, 2058660585);
            C20576h2 c20576h2 = C20576h2.f28641a;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            float f12 = 24;
            v vVarF = C20588k2.f(C20588k2.t(aVar, 72), f12);
            bE2.I(733328855);
            InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, bE2, 0);
            bE2.I(-1323940314);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            C22096n c22096nC2 = M.c(vVarF);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, interfaceC22365i0E);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            androidx.compose.foundation.H.y(0, c22096nC2, J2.a(bE2), bE2, 2058660585);
            C20644z c20644z = C20644z.f28804a;
            bE2.I(-1286971354);
            Iterator it = groupSubscriptionSheetStatusData.getUserImageUrls().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                String str = (String) next;
                bE2.I(-1286969524);
                L2.c userImageTransformation = i17 > 0 ? new UserImageTransformation(V.j(StylingUtilKt.backgroundColor(groupSubscriptionStyle, bE2, (i14 >> 3) & 14))) : new L2.a();
                bE2.X(false);
                bE2.I(693286680);
                v.a aVar4 = v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.C1589k c1589k = C20585k.f28660b;
                InterfaceC22215f.f39074a.getClass();
                C20568f2 c20568f2A2 = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
                bE2.I(-1323940314);
                int i19 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                Iterator it2 = it;
                C22096n c22096nC3 = M.c(aVar4);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar5);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A2);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S3);
                p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i19))) {
                    AK.c.y(i19, bE2, i19, pVar4);
                }
                androidx.compose.foundation.H.y(0, c22096nC3, J2.a(bE2), bE2, 2058660585);
                C20576h2 c20576h22 = C20576h2.f28641a;
                C20608p2.a(bE2, C20588k2.t(aVar4, i17 * f12));
                v vVarT = C20588k2.t(C20588k2.f(aVar4, f12), f12);
                p.a aVar6 = new p.a((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
                aVar6.f58691c = str;
                aVar6.f58700l = coil.util.c.a(C42756l.g0(new L2.c[]{userImageTransformation}));
                coil.request.p pVarA = aVar6.a();
                InterfaceC22374n.f40491a.getClass();
                coil.compose.v.b(pVarA, null, vVarT, null, InterfaceC22374n.a.f40495d, null, bE2, 1573296, 4024);
                androidx.compose.foundation.H.B(bE2, false, true, false, false);
                interfaceC22078i = interfaceC22078i;
                f12 = f12;
                i17 = i18;
                it = it2;
            }
            InterfaceC22078i<?> interfaceC22078i2 = interfaceC22078i;
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            bE2.X(false);
            v.a aVar7 = v.f42878y1;
            C20608p2.a(bE2, C20588k2.t(aVar7, 8));
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            bE2.I(1098475987);
            InterfaceC22365i0 interfaceC22365i0G = S0.g(C20585k.f28660b, cVar, bE2);
            bE2.I(-1323940314);
            int i22 = bE2.f37888Q;
            O1 o1S4 = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar8 = InterfaceC22413h.a.f40791b;
            C22096n c22096nC4 = M.c(aVar7);
            if (interfaceC22078i2 == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar8);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0G);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S4);
            Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i22))) {
                AK.c.y(i22, bE2, i22, pVar5);
            }
            androidx.compose.foundation.H.y(0, c22096nC4, J2.a(bE2), bE2, 2058660585);
            C20614r1 c20614r1 = C20614r1.f28730b;
            String strQ = androidx.appcompat.app.r.q(u0.i.a(R.plurals.vkid_group_subscription_subscribers, groupSubscriptionSheetStatusData.getSubscriberCount(), new Object[]{SubscriberCountFormatter.INSTANCE.format(groupSubscriptionSheetStatusData.getSubscriberCount())}, bE2), " ");
            String strF = G.f("· ", u0.i.a(R.plurals.vkid_group_subscription_friends, groupSubscriptionSheetStatusData.getFriendsCount(), new Object[]{Integer.valueOf(groupSubscriptionSheetStatusData.getFriendsCount())}, bE2));
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i23 = androidx.compose.ui.text.style.i.f42678e;
            int i24 = (i14 >> 3) & 14;
            long jTextSecondaryColor = StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, bE2, i24);
            long jE2 = z.e(15);
            long jE3 = z.e(20);
            e0.f42240c.getClass();
            e0 e0Var = e0.f42248k;
            C21914uj.b(strQ, aVar7, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new x0(jTextSecondaryColor, jE2, e0Var, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i23, 0, jE3, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null), bE2, 48, 0, 65532);
            bE2.I(-1286919323);
            if (groupSubscriptionSheetStatusData.getFriendsCount() > 0) {
                C21914uj.b(strF, aVar7, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new x0(StylingUtilKt.textSecondaryColor(groupSubscriptionStyle, bE2, i24), z.e(15), e0Var, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i23, 0, z.e(20), (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null), bE2, 48, 0, 65532);
            }
            bE2.X(false);
            C20608p2.a(bE2, c20614r1.a(aVar7, 1.0f, true));
            bE2.X(false);
            bE2.X(true);
            bE2.X(false);
            androidx.compose.foundation.H.B(bE2, false, false, true, false);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(j12, groupSubscriptionStyle, groupSubscriptionSheetStatusData, i12, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 DataStateSubscribers$lambda$60(J j12, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, int i12, A a12, int i13) {
        DataStateSubscribers(j12, groupSubscriptionStyle, groupSubscriptionSheetStatusData, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0296  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void FailureDataState(final com.vk.id.group.subscription.common.style.GroupSubscriptionStyle r70, final com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState r71, final Y41.l<? super com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail, kotlin.G0> r72, final Y41.a<kotlin.G0> r73, final Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r74, androidx.compose.runtime.A r75, final int r76) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.FailureDataState(com.vk.id.group.subscription.common.style.GroupSubscriptionStyle, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState, Y41.l, Y41.a, Y41.p, androidx.compose.runtime.A, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 FailureDataState$lambda$48$lambda$47$lambda$46(GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar) {
        groupSubscriptionSheetState.hide();
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.cancelClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        lVar.invoke(new VKIDGroupSubscriptionFail.Cancel());
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 FailureDataState$lambda$49(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, Y41.a aVar, Y41.p pVar, int i12, A a12, int i13) {
        FailureDataState(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, pVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void FailureState(@Y61.k final GroupSubscriptionStyle groupSubscriptionStyle, @Y61.k GroupSubscriptionSheetState groupSubscriptionSheetState, @Y61.k Y41.l<? super VKIDGroupSubscriptionFail, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(995379373);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetState) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            groupSubscriptionAnalytics.ErrorShown$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null, bE2, 0);
            FailureDataState(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, r.b(bE2, 307974107, new Y41.p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.FailureState.1
                @Override // Y41.p
                public /* bridge */ /* synthetic */ G0 invoke(A a13, Integer num) {
                    invoke(a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(A a13, int i14) {
                    if ((i14 & 3) == 2 && a13.c()) {
                        a13.f();
                        return;
                    }
                    String strC = u0.i.c(a13, R.string.vkid_group_subscription_fail_primary);
                    v.a aVar2 = v.f42878y1;
                    androidx.compose.ui.text.style.i.f42675b.getClass();
                    int i15 = androidx.compose.ui.text.style.i.f42678e;
                    long jTextPrimaryButtonColor = StylingUtilKt.textPrimaryButtonColor(groupSubscriptionStyle);
                    long jE2 = z.e(groupSubscriptionStyle.getButtonsSizeStyle().getTextSizeSp());
                    long jE3 = z.e(20);
                    e0.f42240c.getClass();
                    C21914uj.b(strC, aVar2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new x0(jTextPrimaryButtonColor, jE2, e0.f42248k, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i15, 0, jE3, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null), a13, 48, 0, 65532);
                }
            }), bE2, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, i12, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 FailureState$lambda$45(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, Y41.a aVar, int i12, A a12, int i13) {
        FailureState(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GroupSubscriptionSheet(@Y61.l androidx.compose.ui.v r46, @Y61.l com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState r47, @Y61.l Y41.a<java.lang.String> r48, @Y61.k final java.lang.String r49, @Y61.k final Y41.a<kotlin.G0> r50, @Y61.l Y41.l<? super com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail, kotlin.G0> r51, @Y61.l androidx.compose.material3.C21729mg r52, @Y61.l com.vk.id.group.subscription.common.style.GroupSubscriptionStyle r53, @Y61.l androidx.compose.runtime.A r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.GroupSubscriptionSheet(androidx.compose.ui.v, com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState, Y41.a, java.lang.String, Y41.a, Y41.l, androidx.compose.material3.mg, com.vk.id.group.subscription.common.style.GroupSubscriptionStyle, androidx.compose.runtime.A, int, int):void");
    }

    private static final boolean GroupSubscriptionSheet$lambda$10(InterfaceC22204y1<Boolean> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupSubscriptionSheet$lambda$11(InterfaceC22204y1<Boolean> interfaceC22204y1, boolean z12) {
        interfaceC22204y1.setValue(Boolean.valueOf(z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y41.l<VKIDGroupSubscriptionFail, G0> GroupSubscriptionSheet$lambda$12(I3<? extends Y41.l<? super VKIDGroupSubscriptionFail, G0>> i32) {
        return (Y41.l) i32.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GroupSubscriptionSheet$lambda$14(InterfaceC22204y1<Boolean> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupSubscriptionSheet$lambda$15(InterfaceC22204y1<Boolean> interfaceC22204y1, boolean z12) {
        interfaceC22204y1.setValue(Boolean.valueOf(z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$17$lambda$16(T t12, Y41.a aVar, InterfaceC22204y1 interfaceC22204y1, Y41.a aVar2, C21729mg c21729mg, String str) {
        GroupSubscriptionSheet$lambda$15(interfaceC22204y1, true);
        C43259k.d(t12, null, null, new GroupSubscriptionSheetKt$GroupSubscriptionSheet$actualOnSuccess$2$1$1(aVar2, c21729mg, str, null), 3);
        aVar.invoke();
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y41.a<G0> GroupSubscriptionSheet$lambda$18(I3<? extends Y41.a<G0>> i32) {
        return i32.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GroupSubscriptionSheet$lambda$20(InterfaceC22204y1<Boolean> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupSubscriptionSheet$lambda$21(InterfaceC22204y1<Boolean> interfaceC22204y1, boolean z12) {
        interfaceC22204y1.setValue(Boolean.valueOf(z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$24$lambda$23(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus) {
        interfaceC22204y1.setValue(groupSubscriptionSheetStatus);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$26$lambda$25(InterfaceC22204y1 interfaceC22204y1, boolean z12) {
        GroupSubscriptionSheet$lambda$11(interfaceC22204y1, z12);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$3$lambda$2(VKIDGroupSubscriptionFail vKIDGroupSubscriptionFail) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$30$lambda$29(final InterfaceC22204y1 interfaceC22204y1, final T t12, final GroupSubscriptionInteractor groupSubscriptionInteractor, final GroupSubscriptionSheetState groupSubscriptionSheetState, final InterfaceC22204y1 interfaceC22204y12, final I3 i32, final boolean z12) {
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new P11.a(6), new Y41.a() { // from class: com.vk.id.group.subscription.compose.ui.g
            @Override // Y41.a
            public final Object invoke() {
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28(z12, interfaceC22204y1, t12, groupSubscriptionInteractor, groupSubscriptionSheetState, interfaceC22204y12, i32);
            }
        });
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$30$lambda$29$lambda$27(Throwable th2) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$30$lambda$29$lambda$28(boolean z12, InterfaceC22204y1 interfaceC22204y1, T t12, GroupSubscriptionInteractor groupSubscriptionInteractor, GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC22204y1 interfaceC22204y12, I3 i32) {
        if (z12) {
            interfaceC22204y1.setValue(GroupSubscriptionSheetStatus.Init.INSTANCE);
            C43259k.d(t12, null, null, new GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1(groupSubscriptionInteractor, groupSubscriptionSheetState, interfaceC22204y1, interfaceC22204y12, i32, null), 3);
        } else {
            GroupSubscriptionSheet$lambda$11(interfaceC22204y12, false);
        }
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSheet$lambda$33(v vVar, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.a aVar, String str, Y41.a aVar2, Y41.l lVar, C21729mg c21729mg, GroupSubscriptionStyle groupSubscriptionStyle, int i12, int i13, A a12, int i14) {
        GroupSubscriptionSheet(vVar, groupSubscriptionSheetState, aVar, str, aVar2, lVar, c21729mg, groupSubscriptionStyle, a12, C22066f2.a(i12 | 1), i13);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC22204y1 GroupSubscriptionSheet$lambda$7$lambda$6() {
        return C22126m3.g(GroupSubscriptionSheetStatus.Init.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC22204y1 GroupSubscriptionSheet$lambda$9$lambda$8() {
        return C22126m3.g(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GroupSubscriptionSnackbarHost(@Y61.k final androidx.compose.material3.C21729mg r10, @Y61.l final com.vk.id.group.subscription.common.style.GroupSubscriptionStyle r11, @Y61.l androidx.compose.runtime.A r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.GroupSubscriptionSnackbarHost(androidx.compose.material3.mg, com.vk.id.group.subscription.common.style.GroupSubscriptionStyle, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 GroupSubscriptionSnackbarHost$lambda$1(C21729mg c21729mg, GroupSubscriptionStyle groupSubscriptionStyle, int i12, int i13, A a12, int i14) {
        GroupSubscriptionSnackbarHost(c21729mg, groupSubscriptionStyle, a12, C22066f2.a(i12 | 1), i13);
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void LoadedState(@Y61.k Y41.l<? super Continuation<? super G0>, ? extends Object> lVar, @Y61.k Y41.l<? super VKIDGroupSubscriptionFail, G0> lVar2, @Y61.k final GroupSubscriptionStyle groupSubscriptionStyle, @Y61.k GroupSubscriptionSheetState groupSubscriptionSheetState, @Y61.k GroupSubscriptionSheetStatus.Loaded loaded, @Y61.k Y41.a<G0> aVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-869972361);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(groupSubscriptionStyle) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetState) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.B(loaded) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 196608) == 0) {
            i13 |= bE2.u(aVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i14 = i13;
        if ((74899 & i14) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            Object[] objArr = new Object[0];
            bE2.I(-1463176991);
            Object objT = bE2.t();
            A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = new Q11.b(3);
                bE2.H(objT);
            }
            bE2.X(false);
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) androidx.compose.runtime.saveable.j.c(objArr, null, (Y41.a) objT, bE2, 3072, 6);
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
            G0 g02 = G0.f406611a;
            bE2.I(-1463173173);
            boolean zB2 = bE2.B(interfaceC22204y1) | bE2.B(interfaceC22204y1M);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == obj) {
                objT2 = new GroupSubscriptionSheetKt$LoadedState$1$1(interfaceC22204y1, interfaceC22204y1M, null);
                bE2.H(objT2);
            }
            bE2.X(false);
            C22187u0.d((Y41.p) objT2, bE2, g02);
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            groupSubscriptionAnalytics.SheetShown$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null, bE2, 0);
            int i15 = i14 >> 6;
            DataState(groupSubscriptionStyle, groupSubscriptionSheetState, loaded.getData(), lVar2, aVar, r.b(bE2, -577510560, new Y41.p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.LoadedState.2
                @Override // Y41.p
                public /* bridge */ /* synthetic */ G0 invoke(A a13, Integer num) {
                    invoke(a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(A a13, int i16) {
                    if ((i16 & 3) == 2 && a13.c()) {
                        a13.f();
                        return;
                    }
                    String strC = u0.i.c(a13, R.string.vkid_group_subscription_primary);
                    v.a aVar2 = v.f42878y1;
                    androidx.compose.ui.text.style.i.f42675b.getClass();
                    int i17 = androidx.compose.ui.text.style.i.f42678e;
                    long jTextPrimaryButtonColor = StylingUtilKt.textPrimaryButtonColor(groupSubscriptionStyle);
                    long jE2 = z.e(groupSubscriptionStyle.getButtonsSizeStyle().getTextSizeSp());
                    long jE3 = z.e(20);
                    e0.f42240c.getClass();
                    C21914uj.b(strC, aVar2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new x0(jTextPrimaryButtonColor, jE2, e0.f42248k, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (androidx.compose.ui.graphics.drawscope.j) null, i17, 0, jE3, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16613368, (C42822w) null), a13, 48, 0, 65532);
                }
            }), bE2, (i15 & 112) | (i15 & 14) | 196608 | ((i14 << 6) & 7168) | ((i14 >> 3) & 57344));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(lVar, lVar2, groupSubscriptionStyle, groupSubscriptionSheetState, loaded, aVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC22204y1 LoadedState$lambda$35$lambda$34() {
        return C22126m3.g(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadedState$lambda$36(InterfaceC22204y1<Boolean> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadedState$lambda$37(InterfaceC22204y1<Boolean> interfaceC22204y1, boolean z12) {
        interfaceC22204y1.setValue(Boolean.valueOf(z12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y41.l<Continuation<? super G0>, Object> LoadedState$lambda$38(I3<? extends Y41.l<? super Continuation<? super G0>, ? extends Object>> i32) {
        return (Y41.l) i32.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 LoadedState$lambda$40(Y41.l lVar, Y41.l lVar2, GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatus.Loaded loaded, Y41.a aVar, int i12, A a12, int i13) {
        LoadedState(lVar, lVar2, groupSubscriptionStyle, groupSubscriptionSheetState, loaded, aVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void ResubscribingState(@Y61.k final GroupSubscriptionStyle groupSubscriptionStyle, @Y61.k GroupSubscriptionSheetState groupSubscriptionSheetState, @Y61.k Y41.l<? super VKIDGroupSubscriptionFail, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1865814551);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetState) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            FailureDataState(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, r.b(bE2, 1912241861, new Y41.p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.ResubscribingState.1
                @Override // Y41.p
                public /* bridge */ /* synthetic */ G0 invoke(A a13, Integer num) {
                    invoke(a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(A a13, int i14) {
                    if ((i14 & 3) == 2 && a13.c()) {
                        a13.f();
                        return;
                    }
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    v vVarO = C20588k2.o(v.f42878y1, 24);
                    GroupSubscriptionStyle groupSubscriptionStyle2 = groupSubscriptionStyle;
                    a13.I(733328855);
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, a13, 0);
                    a13.I(-1323940314);
                    int iM2 = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                    C22096n c22096nC = M.c(vVarO);
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar3);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0E);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(iM2))) {
                        androidx.appcompat.app.r.B(iM2, a13, iM2, pVar);
                    }
                    androidx.compose.foundation.H.x(0, c22096nC, J2.a(a13), a13, 2058660585);
                    C20644z c20644z = C20644z.f28804a;
                    CircleProgressKt.CircleProgress(groupSubscriptionStyle2, "Resubscribing to group spinner", a13, 48);
                    a13.O();
                    a13.z();
                    a13.O();
                    a13.O();
                }
            }), bE2, (i13 & 14) | 24576 | (i13 & 112) | (i13 & 896) | (i13 & 7168));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, i12, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 ResubscribingState$lambda$44(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, Y41.a aVar, int i12, A a12, int i13) {
        ResubscribingState(groupSubscriptionStyle, groupSubscriptionSheetState, lVar, aVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void SubscribingState(@Y61.k final GroupSubscriptionStyle groupSubscriptionStyle, @Y61.k GroupSubscriptionSheetState groupSubscriptionSheetState, @Y61.k GroupSubscriptionSheetStatus.Subscribing subscribing, @Y61.k Y41.l<? super VKIDGroupSubscriptionFail, G0> lVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1530893849);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(groupSubscriptionStyle) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(groupSubscriptionSheetState) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.B(subscribing) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            GroupSubscriptionSheetStatusData data = subscribing.getData();
            bE2.I(-368324177);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new Q11.b(4);
                bE2.H(objT);
            }
            bE2.X(false);
            DataState(groupSubscriptionStyle, groupSubscriptionSheetState, data, lVar, (Y41.a) objT, r.b(bE2, -1285683696, new Y41.p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt.SubscribingState.2
                @Override // Y41.p
                public /* bridge */ /* synthetic */ G0 invoke(A a13, Integer num) {
                    invoke(a13, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(A a13, int i14) {
                    if ((i14 & 3) == 2 && a13.c()) {
                        a13.f();
                        return;
                    }
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    v vVarO = C20588k2.o(v.f42878y1, 24);
                    GroupSubscriptionStyle groupSubscriptionStyle2 = groupSubscriptionStyle;
                    a13.I(733328855);
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0E = C20632w.e(InterfaceC22215f.a.f39076b, false, a13, 0);
                    a13.I(-1323940314);
                    int iM2 = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                    C22096n c22096nC = M.c(vVarO);
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar2);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0E);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(iM2))) {
                        androidx.appcompat.app.r.B(iM2, a13, iM2, pVar);
                    }
                    androidx.compose.foundation.H.x(0, c22096nC, J2.a(a13), a13, 2058660585);
                    C20644z c20644z = C20644z.f28804a;
                    CircleProgressKt.CircleProgress(groupSubscriptionStyle2, "Subscribing to group spinner", a13, 48);
                    a13.O();
                    a13.z();
                    a13.O();
                    a13.O();
                }
            }), bE2, (i13 & 14) | 221184 | (i13 & 112) | (i13 & 7168));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(groupSubscriptionStyle, groupSubscriptionSheetState, subscribing, lVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 SubscribingState$lambda$43(GroupSubscriptionStyle groupSubscriptionStyle, GroupSubscriptionSheetState groupSubscriptionSheetState, GroupSubscriptionSheetStatus.Subscribing subscribing, Y41.l lVar, int i12, A a12, int i13) {
        SubscribingState(groupSubscriptionStyle, groupSubscriptionSheetState, subscribing, lVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    @InterfaceC22132o
    private static final Y41.l<Boolean, G0> processSheetShow(final Y41.l<? super GroupSubscriptionSheetStatus, G0> lVar, final Y41.l<? super Boolean, G0> lVar2, final T t12, final GroupSubscriptionSheetState groupSubscriptionSheetState, A a12, int i12) {
        a12.I(-11956810);
        a12.I(-127985687);
        Object objT = a12.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new Y41.l() { // from class: com.vk.id.group.subscription.compose.ui.f
                @Override // Y41.l
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    return GroupSubscriptionSheetKt.processSheetShow$lambda$72$lambda$71(lVar, lVar2, t12, groupSubscriptionSheetState, zBooleanValue);
                }
            };
            a12.H(objT);
        }
        Y41.l<Boolean, G0> lVar3 = (Y41.l) objT;
        a12.O();
        a12.O();
        return lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 processSheetShow$lambda$72$lambda$71(Y41.l lVar, Y41.l lVar2, T t12, GroupSubscriptionSheetState groupSubscriptionSheetState, boolean z12) {
        if (z12) {
            lVar.invoke(GroupSubscriptionSheetStatus.Init.INSTANCE);
        }
        if (z12) {
            lVar2.invoke(Boolean.TRUE);
        } else {
            ((V0) C43259k.d(t12, null, null, new GroupSubscriptionSheetKt$processSheetShow$1$1$1(groupSubscriptionSheetState, null), 3)).k(new M11.c(2, groupSubscriptionSheetState, lVar2));
        }
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 processSheetShow$lambda$72$lambda$71$lambda$70(GroupSubscriptionSheetState groupSubscriptionSheetState, Y41.l lVar, Throwable th2) {
        if (!groupSubscriptionSheetState.isVisible()) {
            lVar.invoke(Boolean.FALSE);
        }
        return G0.f406611a;
    }

    @InterfaceC22132o
    @Y61.k
    public static final GroupSubscriptionSheetState rememberGroupSubscriptionSheetState(@Y61.l A a12, int i12) {
        a12.I(-1017502691);
        GroupSubscriptionSheetState groupSubscriptionSheetStateRememberGroupSubscriptionSheetStateInternal = rememberGroupSubscriptionSheetStateInternal(a12, 0);
        a12.O();
        return groupSubscriptionSheetStateRememberGroupSubscriptionSheetStateInternal;
    }

    @InterfaceC22132o
    private static final GroupSubscriptionSheetState rememberGroupSubscriptionSheetStateInternal(A a12, int i12) {
        a12.I(-712072454);
        a12.I(-1797808311);
        Object objT = a12.t();
        A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.g(SheetValue.f35417b);
            a12.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        a12.O();
        a12.I(-1797803135);
        Object objT2 = a12.t();
        if (objT2 == obj) {
            objT2 = new b(2, interfaceC22204y1);
            a12.H(objT2);
        }
        a12.O();
        Me meD = C22015za.d((Y41.l) objT2, a12, 54, 0);
        a12.I(-1797796446);
        boolean zB2 = a12.B(meD);
        Object objT3 = a12.t();
        if (zB2 || objT3 == obj) {
            objT3 = new GroupSubscriptionSheetState(meD);
            a12.H(objT3);
        }
        GroupSubscriptionSheetState groupSubscriptionSheetState = (GroupSubscriptionSheetState) objT3;
        a12.O();
        a12.O();
        return groupSubscriptionSheetState;
    }

    private static final SheetValue rememberGroupSubscriptionSheetStateInternal$lambda$74(InterfaceC22204y1<SheetValue> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberGroupSubscriptionSheetStateInternal$lambda$77$lambda$76(InterfaceC22204y1 interfaceC22204y1, SheetValue sheetValue) {
        if (sheetValue == SheetValue.f35417b && sheetValue != rememberGroupSubscriptionSheetStateInternal$lambda$74(interfaceC22204y1)) {
            GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            groupSubscriptionAnalytics.close$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        }
        interfaceC22204y1.setValue(sheetValue);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToGroup(InterfaceC22204y1<GroupSubscriptionSheetStatus> interfaceC22204y1, GroupSubscriptionSheetStatusData groupSubscriptionSheetStatusData, GroupSubscriptionSheetState groupSubscriptionSheetState, T t12, GroupSubscriptionInteractor groupSubscriptionInteractor, Y41.a<G0> aVar, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus) {
        interfaceC22204y1.setValue(groupSubscriptionSheetStatus);
        C43259k.d(t12, null, null, new C378981(groupSubscriptionInteractor, aVar, groupSubscriptionSheetState, interfaceC22204y1, groupSubscriptionSheetStatusData, null), 3);
    }
}
