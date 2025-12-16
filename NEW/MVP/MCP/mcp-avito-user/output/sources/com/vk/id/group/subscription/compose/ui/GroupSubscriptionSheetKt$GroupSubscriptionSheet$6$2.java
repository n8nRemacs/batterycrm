package com.vk.id.group.subscription.compose.ui;

import Y41.q;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.analytics.GroupSubscriptionAnalytics;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: GroupSubscriptionSheet.kt */
@s0
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2 implements q<J, A, Integer, G0> {
    final /* synthetic */ I3<Y41.a<G0>> $actualOnSuccess$delegate;
    final /* synthetic */ T $coroutineScope;
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    final /* synthetic */ Y41.l<VKIDGroupSubscriptionFail, G0> $onFail;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC22204y1<GroupSubscriptionSheetStatus> $status;
    final /* synthetic */ GroupSubscriptionStyle $style;

    /* JADX WARN: Multi-variable type inference failed */
    public GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2(GroupSubscriptionStyle groupSubscriptionStyle, InterfaceC22204y1<GroupSubscriptionSheetStatus> interfaceC22204y1, GroupSubscriptionInteractor groupSubscriptionInteractor, Y41.l<? super VKIDGroupSubscriptionFail, G0> lVar, GroupSubscriptionSheetState groupSubscriptionSheetState, T t12, I3<? extends Y41.a<G0>> i32) {
        this.$style = groupSubscriptionStyle;
        this.$status = interfaceC22204y1;
        this.$interactor = groupSubscriptionInteractor;
        this.$onFail = lVar;
        this.$state = groupSubscriptionSheetState;
        this.$coroutineScope = t12;
        this.$actualOnSuccess$delegate = i32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 invoke$lambda$7$lambda$2$lambda$1(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, T t12, GroupSubscriptionInteractor groupSubscriptionInteractor, I3 i32) {
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.subscribeToGroupClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        GroupSubscriptionSheetStatus.Loaded loaded = (GroupSubscriptionSheetStatus.Loaded) groupSubscriptionSheetStatus;
        GroupSubscriptionSheetKt.subscribeToGroup(interfaceC22204y1, loaded.getData(), groupSubscriptionSheetState, t12, groupSubscriptionInteractor, GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$18(i32), new GroupSubscriptionSheetStatus.Subscribing(loaded.getData()));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 invoke$lambda$7$lambda$4$lambda$3(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, T t12, GroupSubscriptionInteractor groupSubscriptionInteractor, I3 i32) {
        GroupSubscriptionAnalytics groupSubscriptionAnalytics = GroupSubscriptionAnalytics.INSTANCE;
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        groupSubscriptionAnalytics.retryClick$group_subscription_compose_release(accessToken != null ? accessToken.getToken() : null);
        GroupSubscriptionSheetStatus.Failure failure = (GroupSubscriptionSheetStatus.Failure) groupSubscriptionSheetStatus;
        GroupSubscriptionSheetKt.subscribeToGroup(interfaceC22204y1, failure.getData(), groupSubscriptionSheetState, t12, groupSubscriptionInteractor, GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$18(i32), new GroupSubscriptionSheetStatus.Resubscribing(failure.getData()));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 invoke$lambda$7$lambda$6$lambda$5(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, T t12, GroupSubscriptionInteractor groupSubscriptionInteractor, I3 i32) {
        GroupSubscriptionSheetStatus.Resubscribing resubscribing = (GroupSubscriptionSheetStatus.Resubscribing) groupSubscriptionSheetStatus;
        GroupSubscriptionSheetKt.subscribeToGroup(interfaceC22204y1, resubscribing.getData(), groupSubscriptionSheetState, t12, groupSubscriptionInteractor, GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$18(i32), new GroupSubscriptionSheetStatus.Resubscribing(resubscribing.getData()));
        return G0.f406611a;
    }

    @Override // Y41.q
    public /* bridge */ /* synthetic */ G0 invoke(J j12, A a12, Integer num) {
        invoke(j12, a12, num.intValue());
        return G0.f406611a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 ??, still in use, count: 1, list:
          (r3v12 ?? I:java.lang.Object) from 0x018b: INVOKE (r20v0 ?? I:androidx.compose.runtime.A), (r3v12 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:58)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v12 ??, still in use, count: 1, list:
          (r3v12 ?? I:java.lang.Object) from 0x018b: INVOKE (r20v0 ?? I:androidx.compose.runtime.A), (r3v12 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:58)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
}
