package com.vk.id.group.subscription.compose.analytics;

import M11.d;
import Y41.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.FontStyleKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.id.VKID;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.param.LanguageParamKt;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GroupSubscriptionAnalytics.kt */
@P
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u0018J\u0019\u0010\u001f\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u0019\u0010!\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b \u0010\u0018J\u0019\u0010#\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\"\u0010\u0018J\u0019\u0010%\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b$\u0010\u0018R\u001a\u0010'\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100¨\u00063"}, d2 = {"Lcom/vk/id/group/subscription/compose/analytics/GroupSubscriptionAnalytics;", "", "<init>", "()V", "", "eventName", "accessToken", "Lkotlin/G0;", "track", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "appIdParam", "()Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "nowhereScreen", "groupIdParam", "themeParam", "Lkotlin/Function0;", "fireAnalytics", "SheetScreenShown", "(LY41/a;Landroidx/compose/runtime/A;I)V", "SheetShown$group_subscription_compose_release", "(Ljava/lang/String;Landroidx/compose/runtime/A;I)V", "SheetShown", "subscribeToGroupClick$group_subscription_compose_release", "(Ljava/lang/String;)V", "subscribeToGroupClick", "nextTimeClick$group_subscription_compose_release", "nextTimeClick", "close$group_subscription_compose_release", "close", "ErrorShown$group_subscription_compose_release", "ErrorShown", "retryClick$group_subscription_compose_release", "retryClick", "cancelClick$group_subscription_compose_release", "cancelClick", "successShown$group_subscription_compose_release", "successShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isErrorState", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isErrorState$group_subscription_compose_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Ljava/util/concurrent/atomic/AtomicReference;", "getStyle$group_subscription_compose_release", "()Ljava/util/concurrent/atomic/AtomicReference;", "groupId", "getGroupId$group_subscription_compose_release", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionAnalytics {

    @k
    public static final GroupSubscriptionAnalytics INSTANCE = new GroupSubscriptionAnalytics();

    @k
    private static final AtomicBoolean isErrorState = new AtomicBoolean(false);

    @k
    private static final AtomicReference<GroupSubscriptionStyle> style = new AtomicReference<>(null);

    @k
    private static final AtomicReference<String> groupId = new AtomicReference<>(null);
    public static final int $stable = 8;

    /* compiled from: GroupSubscriptionAnalytics.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GroupSubscriptionAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 ErrorShown$lambda$4$lambda$3(String str) {
        INSTANCE.track("community_follow_error_show", str);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 ErrorShown$lambda$5(GroupSubscriptionAnalytics groupSubscriptionAnalytics, String str, int i12, A a12, int i13) {
        groupSubscriptionAnalytics.ErrorShown$group_subscription_compose_release(str, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void SheetScreenShown(Y41.a<kotlin.G0> r6, androidx.compose.runtime.A r7, int r8) {
        /*
            r5 = this;
            r0 = 2002752177(0x775f92b1, float:4.5345994E33)
            androidx.compose.runtime.B r7 = r7.E(r0)
            r0 = r8 & 6
            r1 = 2
            if (r0 != 0) goto L17
            boolean r0 = r7.u(r6)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = r1
        L15:
            r0 = r0 | r8
            goto L18
        L17:
            r0 = r8
        L18:
            r0 = r0 & 3
            if (r0 != r1) goto L27
            boolean r0 = r7.c()
            if (r0 != 0) goto L23
            goto L27
        L23:
            r7.f()
            goto L6b
        L27:
            androidx.compose.runtime.y1 r0 = androidx.compose.runtime.C22126m3.m(r6, r7)
            androidx.compose.runtime.X1 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r1 = r7.o(r1)
            androidx.compose.runtime.y1 r1 = androidx.compose.runtime.C22126m3.m(r1, r7)
            java.lang.Object r2 = r1.getF42167b()
            r3 = 68777559(0x4197657, float:1.8039403E-36)
            r7.I(r3)
            boolean r3 = r7.B(r1)
            boolean r4 = r7.B(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r7.t()
            if (r3 != 0) goto L59
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r3) goto L62
        L59:
            M11.c r4 = new M11.c
            r3 = 0
            r4.<init>(r3, r1, r0)
            r7.H(r4)
        L62:
            Y41.l r4 = (Y41.l) r4
            r0 = 0
            r7.X(r0)
            androidx.compose.runtime.C22187u0.a(r2, r4, r7)
        L6b:
            androidx.compose.runtime.c2 r7 = r7.Z()
            if (r7 == 0) goto L79
            M11.b r0 = new M11.b
            r1 = 2
            r0.<init>(r5, r6, r8, r1)
            r7.f38184d = r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics.SheetScreenShown(Y41.a, androidx.compose.runtime.A, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 SheetScreenShown$lambda$10(GroupSubscriptionAnalytics groupSubscriptionAnalytics, a aVar, int i12, A a12, int i13) {
        groupSubscriptionAnalytics.SheetScreenShown(aVar, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC22118l0 SheetScreenShown$lambda$9$lambda$8(I3 i32, I3 i33, C22128n0 c22128n0) {
        final Lifecycle lifecycle = ((InterfaceC22983P) i32.getF42167b()).getLifecycle();
        final d dVar = new d(i33, 0);
        lifecycle.a(dVar);
        return new InterfaceC22118l0() { // from class: com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics$SheetScreenShown$lambda$9$lambda$8$$inlined$onDispose$1
            @Override // androidx.compose.runtime.InterfaceC22118l0
            public void dispose() {
                lifecycle.c(dVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SheetScreenShown$lambda$9$lambda$8$lambda$6(I3 i32, InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
        if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            ((a) i32.getF42167b()).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 SheetShown$lambda$1$lambda$0(String str) {
        INSTANCE.track("community_follow_modal_window_show", str);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 SheetShown$lambda$2(GroupSubscriptionAnalytics groupSubscriptionAnalytics, String str, int i12, A a12, int i13) {
        groupSubscriptionAnalytics.SheetShown$group_subscription_compose_release(str, a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    private final VKIDAnalytics.EventParam appIdParam() {
        return new VKIDAnalytics.EventParam(HiAnalyticsConstant.BI_KEY_APP_ID, null, C43066x.y0(VKID.INSTANCE.getInstance().getClientId()), 2, null);
    }

    private final VKIDAnalytics.EventParam groupIdParam() {
        return new VKIDAnalytics.EventParam("group_id", groupId.get(), null, 4, null);
    }

    private final VKIDAnalytics.EventParam nowhereScreen() {
        return new VKIDAnalytics.EventParam("screen_current", "nowhere", null, 4, null);
    }

    private final VKIDAnalytics.EventParam themeParam() {
        String str;
        GroupSubscriptionStyle groupSubscriptionStyle = style.get();
        if (groupSubscriptionStyle == null || (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light)) {
            str = FontStyleKt.LIGHT;
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "dark";
        }
        return new VKIDAnalytics.EventParam("theme_type", str, null, 4, null);
    }

    private final void track(String eventName, String accessToken) {
        VKIDAnalytics.INSTANCE.trackEvent(accessToken, eventName, nowhereScreen(), appIdParam(), LanguageParamKt.vkidInternalLanguageParam(VKID.INSTANCE.getInstance().getContext()), themeParam(), groupIdParam());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ErrorShown$group_subscription_compose_release(@Y61.l java.lang.String r5, @Y61.l androidx.compose.runtime.A r6, int r7) {
        /*
            r4 = this;
            r0 = 2032583727(0x7926c42f, float:5.411877E34)
            androidx.compose.runtime.B r6 = r6.E(r0)
            r0 = r7 & 6
            r1 = 4
            if (r0 != 0) goto L17
            boolean r0 = r6.B(r5)
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r7
            goto L18
        L17:
            r0 = r7
        L18:
            r2 = r7 & 48
            if (r2 != 0) goto L28
            boolean r2 = r6.u(r4)
            if (r2 == 0) goto L25
            r2 = 32
            goto L27
        L25:
            r2 = 16
        L27:
            r0 = r0 | r2
        L28:
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L39
            boolean r2 = r6.c()
            if (r2 != 0) goto L35
            goto L39
        L35:
            r6.f()
            goto L69
        L39:
            r2 = 847683749(0x3286a0a5, float:1.5672706E-8)
            r6.I(r2)
            r2 = r0 & 14
            r3 = 0
            if (r2 != r1) goto L46
            r1 = 1
            goto L47
        L46:
            r1 = r3
        L47:
            java.lang.Object r2 = r6.t()
            if (r1 != 0) goto L56
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L5f
        L56:
            M11.a r2 = new M11.a
            r1 = 0
            r2.<init>(r5, r1)
            r6.H(r2)
        L5f:
            Y41.a r2 = (Y41.a) r2
            r6.X(r3)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r4.SheetScreenShown(r2, r6, r0)
        L69:
            androidx.compose.runtime.c2 r6 = r6.Z()
            if (r6 == 0) goto L77
            M11.b r0 = new M11.b
            r1 = 0
            r0.<init>(r4, r5, r7, r1)
            r6.f38184d = r0
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics.ErrorShown$group_subscription_compose_release(java.lang.String, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SheetShown$group_subscription_compose_release(@Y61.l java.lang.String r5, @Y61.l androidx.compose.runtime.A r6, int r7) {
        /*
            r4 = this;
            r0 = -216950650(0xfffffffff3119886, float:-1.1535287E31)
            androidx.compose.runtime.B r6 = r6.E(r0)
            r0 = r7 & 6
            r1 = 4
            if (r0 != 0) goto L17
            boolean r0 = r6.B(r5)
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r7
            goto L18
        L17:
            r0 = r7
        L18:
            r2 = r7 & 48
            if (r2 != 0) goto L28
            boolean r2 = r6.u(r4)
            if (r2 == 0) goto L25
            r2 = 32
            goto L27
        L25:
            r2 = 16
        L27:
            r0 = r0 | r2
        L28:
            r2 = r0 & 19
            r3 = 18
            if (r2 != r3) goto L39
            boolean r2 = r6.c()
            if (r2 != 0) goto L35
            goto L39
        L35:
            r6.f()
            goto L69
        L39:
            r2 = 1789500725(0x6aa99d35, float:1.0252543E26)
            r6.I(r2)
            r2 = r0 & 14
            r3 = 0
            if (r2 != r1) goto L46
            r1 = 1
            goto L47
        L46:
            r1 = r3
        L47:
            java.lang.Object r2 = r6.t()
            if (r1 != 0) goto L56
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L5f
        L56:
            M11.a r2 = new M11.a
            r1 = 1
            r2.<init>(r5, r1)
            r6.H(r2)
        L5f:
            Y41.a r2 = (Y41.a) r2
            r6.X(r3)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r4.SheetScreenShown(r2, r6, r0)
        L69:
            androidx.compose.runtime.c2 r6 = r6.Z()
            if (r6 == 0) goto L77
            M11.b r0 = new M11.b
            r1 = 1
            r0.<init>(r4, r5, r7, r1)
            r6.f38184d = r0
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics.SheetShown$group_subscription_compose_release(java.lang.String, androidx.compose.runtime.A, int):void");
    }

    public final void cancelClick$group_subscription_compose_release(@l String accessToken) {
        track("community_follow_error_cancel_click", accessToken);
    }

    public final void close$group_subscription_compose_release(@l String accessToken) {
        if (isErrorState.get()) {
            track("community_follow_error_close", accessToken);
        } else {
            track("community_follow_close", accessToken);
        }
    }

    @k
    public final AtomicReference<String> getGroupId$group_subscription_compose_release() {
        return groupId;
    }

    @k
    public final AtomicReference<GroupSubscriptionStyle> getStyle$group_subscription_compose_release() {
        return style;
    }

    @k
    public final AtomicBoolean isErrorState$group_subscription_compose_release() {
        return isErrorState;
    }

    public final void nextTimeClick$group_subscription_compose_release(@l String accessToken) {
        track("community_follow_next_time_click", accessToken);
    }

    public final void retryClick$group_subscription_compose_release(@l String accessToken) {
        track("community_follow_error_retry_click", accessToken);
    }

    public final void subscribeToGroupClick$group_subscription_compose_release(@l String accessToken) {
        track("community_follow_click", accessToken);
    }

    public final void successShown$group_subscription_compose_release(@l String accessToken) {
        track("community_follow_success", accessToken);
    }
}
