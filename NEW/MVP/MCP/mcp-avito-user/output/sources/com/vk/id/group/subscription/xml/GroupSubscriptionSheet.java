package com.vk.id.group.subscription.xml;

import O11.c;
import X41.j;
import Y41.a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.work.impl.F;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetState;
import com.vk.id.group.subscription.compose.util.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GroupSubscriptionSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010(\u001a\u0004\u0018\u00010 2\b\u0010'\u001a\u0004\u0018\u00010 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u000b0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R.\u00101\u001a\u0004\u0018\u0001002\b\u0010'\u001a\u0004\u0018\u0001008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u00020\u000b0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R*\u00109\u001a\u0002082\u0006\u0010'\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010/¨\u0006@²\u0006\u0010\u0010(\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00101\u001a\u0004\u0018\u0001008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u0002088\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/vk/id/group/subscription/xml/GroupSubscriptionSheet;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "Lkotlin/G0;", "onSuccess", "Lkotlin/Function1;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "onFail", "setCallbacks", "(LY41/a;LY41/l;)V", "show", "()V", "Content", "(Landroidx/compose/runtime/A;I)V", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "composeViewInternal", "getComposeViewInternal", "()Landroidx/compose/ui/platform/ComposeView;", "getComposeViewInternal$annotations", "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", VoiceInfo.STATE, "Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "", "accessTokenProvider", "LY41/a;", "getAccessTokenProvider", "()LY41/a;", "setAccessTokenProvider", "(LY41/a;)V", "value", "groupId", "Ljava/lang/String;", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "onGroupIdChange", "LY41/l;", "Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "snackbarHost", "Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "getSnackbarHost", "()Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "setSnackbarHost", "(Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;)V", "onSnackbarHostChange", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "getStyle", "()Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "setStyle", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;)V", "onStyleChange", "group-subscription-xml_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionSheet extends FrameLayout {

    @l
    private a<String> accessTokenProvider;

    @k
    private final ComposeView composeView;

    @k
    private final ComposeView composeViewInternal;

    @l
    private String groupId;

    @k
    private Y41.l<? super VKIDGroupSubscriptionFail, G0> onFail;

    @k
    private Y41.l<? super String, G0> onGroupIdChange;

    @k
    private Y41.l<? super GroupSubscriptionSnackbarHost, G0> onSnackbarHostChange;

    @k
    private Y41.l<? super GroupSubscriptionStyle, G0> onStyleChange;

    @k
    private a<G0> onSuccess;

    @l
    private GroupSubscriptionSnackbarHost snackbarHost;

    @l
    private GroupSubscriptionSheetState state;

    @k
    private GroupSubscriptionStyle style;

    public /* synthetic */ GroupSubscriptionSheet(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC22132o
    @InterfaceC22181t
    public final void Content(A a12, int i12) {
        int i13;
        B bE2 = a12.E(218953053);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(this) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(897911364);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(this.groupId);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            bE2.I(897913360);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new b(1, interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            this.onGroupIdChange = (Y41.l) objT2;
            bE2.I(897914825);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = C22126m3.g(this.snackbarHost);
                bE2.H(objT3);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT3;
            bE2.X(false);
            bE2.I(897917141);
            Object objT4 = bE2.t();
            if (objT4 == c1651a) {
                objT4 = new b(2, interfaceC22204y12);
                bE2.H(objT4);
            }
            bE2.X(false);
            this.onSnackbarHostChange = (Y41.l) objT4;
            bE2.I(897918530);
            Object objT5 = bE2.t();
            if (objT5 == c1651a) {
                objT5 = C22126m3.g(this.style);
                bE2.H(objT5);
            }
            InterfaceC22204y1 interfaceC22204y13 = (InterfaceC22204y1) objT5;
            bE2.X(false);
            bE2.I(897920398);
            Object objT6 = bE2.t();
            if (objT6 == c1651a) {
                objT6 = new b(3, interfaceC22204y13);
                bE2.H(objT6);
            }
            bE2.X(false);
            this.onStyleChange = (Y41.l) objT6;
            GroupSubscriptionSheetState groupSubscriptionSheetStateRememberGroupSubscriptionSheetState = GroupSubscriptionSheetKt.rememberGroupSubscriptionSheetState(bE2, 0);
            this.state = groupSubscriptionSheetStateRememberGroupSubscriptionSheetState;
            a<String> aVar = this.accessTokenProvider;
            String strContent$lambda$7 = Content$lambda$7(interfaceC22204y1);
            if (strContent$lambda$7 == null) {
                throw new IllegalStateException("groupId is not specified");
            }
            bE2.I(897929135);
            boolean zU2 = bE2.u(this);
            Object objT7 = bE2.t();
            if (zU2 || objT7 == c1651a) {
                objT7 = new F(this, 4);
                bE2.H(objT7);
            }
            a aVar2 = (a) objT7;
            bE2.X(false);
            bE2.I(897930350);
            boolean zU3 = bE2.u(this);
            Object objT8 = bE2.t();
            if (zU3 || objT8 == c1651a) {
                objT8 = new c(this, 4);
                bE2.H(objT8);
            }
            Y41.l lVar = (Y41.l) objT8;
            bE2.X(false);
            GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHostContent$lambda$12 = Content$lambda$12(interfaceC22204y12);
            GroupSubscriptionSheetKt.GroupSubscriptionSheet(null, groupSubscriptionSheetStateRememberGroupSubscriptionSheetState, aVar, strContent$lambda$7, aVar2, lVar, groupSubscriptionSnackbarHostContent$lambda$12 != null ? groupSubscriptionSnackbarHostContent$lambda$12.getSnackbarHostState() : null, Content$lambda$17(interfaceC22204y13), bE2, 0, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new N11.a(i12, 1, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$10$lambda$9(InterfaceC22204y1 interfaceC22204y1, String str) {
        interfaceC22204y1.setValue(str);
        return G0.f406611a;
    }

    private static final GroupSubscriptionSnackbarHost Content$lambda$12(InterfaceC22204y1<GroupSubscriptionSnackbarHost> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$15$lambda$14(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHost) {
        interfaceC22204y1.setValue(groupSubscriptionSnackbarHost);
        return G0.f406611a;
    }

    private static final GroupSubscriptionStyle Content$lambda$17(InterfaceC22204y1<GroupSubscriptionStyle> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$20$lambda$19(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionStyle groupSubscriptionStyle) {
        interfaceC22204y1.setValue(groupSubscriptionStyle);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$23$lambda$22(GroupSubscriptionSheet groupSubscriptionSheet) {
        groupSubscriptionSheet.onSuccess.invoke();
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$25$lambda$24(GroupSubscriptionSheet groupSubscriptionSheet, VKIDGroupSubscriptionFail vKIDGroupSubscriptionFail) {
        groupSubscriptionSheet.onFail.invoke(vKIDGroupSubscriptionFail);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$26(GroupSubscriptionSheet groupSubscriptionSheet, int i12, A a12, int i13) {
        groupSubscriptionSheet.Content(a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    private static final String Content$lambda$7(InterfaceC22204y1<String> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onFail$lambda$2(VKIDGroupSubscriptionFail vKIDGroupSubscriptionFail) {
        throw new IllegalStateException("setCallbacks was not called");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onGroupIdChange$lambda$0(String str) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onSnackbarHostChange$lambda$3(GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHost) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onStyleChange$lambda$4(GroupSubscriptionStyle groupSubscriptionStyle) {
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onSuccess$lambda$1() {
        throw new IllegalStateException("setCallbacks was not called");
    }

    @l
    public final a<String> getAccessTokenProvider() {
        return this.accessTokenProvider;
    }

    @k
    public final ComposeView getComposeViewInternal() {
        return this.composeViewInternal;
    }

    @l
    public final String getGroupId() {
        return this.groupId;
    }

    @l
    public final GroupSubscriptionSnackbarHost getSnackbarHost() {
        return this.snackbarHost;
    }

    @k
    public final GroupSubscriptionStyle getStyle() {
        return this.style;
    }

    public final void setAccessTokenProvider(@l a<String> aVar) {
        this.accessTokenProvider = aVar;
    }

    public final void setCallbacks(@k a<G0> onSuccess, @k Y41.l<? super VKIDGroupSubscriptionFail, G0> onFail) {
        this.onSuccess = onSuccess;
        this.onFail = onFail;
    }

    public final void setGroupId(@l String str) {
        this.groupId = str;
        this.onGroupIdChange.invoke(str);
    }

    public final void setSnackbarHost(@l GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHost) {
        this.snackbarHost = groupSubscriptionSnackbarHost;
        this.onSnackbarHostChange.invoke(groupSubscriptionSnackbarHost);
    }

    public final void setStyle(@k GroupSubscriptionStyle groupSubscriptionStyle) {
        this.style = groupSubscriptionStyle;
        this.onStyleChange.invoke(groupSubscriptionStyle);
    }

    public final void show() {
        GroupSubscriptionSheetState groupSubscriptionSheetState = this.state;
        if (groupSubscriptionSheetState == null) {
            throw new IllegalStateException("View is not initialized");
        }
        groupSubscriptionSheetState.show();
    }

    @j
    public GroupSubscriptionSheet(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.composeView = composeView;
        this.composeViewInternal = composeView;
        this.onGroupIdChange = new P11.a(10);
        this.onSuccess = new Q11.b(6);
        this.onFail = new P11.a(11);
        this.onSnackbarHostChange = new P11.a(12);
        this.style = new GroupSubscriptionStyle.Light(null, null, null, 7, null);
        this.onStyleChange = new P11.a(9);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.vkid_GroupSubscription, 0, 0);
        try {
            setGroupId(GroupSubscriptionAttrsKt.vkidInternalGetGroupId(typedArrayObtainStyledAttributes));
            setStyle(GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionStyleConstructor(typedArrayObtainStyledAttributes, context).invoke(new GroupSubscriptionSheetCornersStyle.Custom(UtilsKt.pixelsToDp(context, GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionCornerRadius(typedArrayObtainStyledAttributes, context))), new GroupSubscriptionButtonsCornersStyle.Custom(UtilsKt.pixelsToDp(context, GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionButtonCornerRadius(typedArrayObtainStyledAttributes, context))), GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionButtonSize(typedArrayObtainStyledAttributes)));
            typedArrayObtainStyledAttributes.recycle();
            composeView.setContent(new C22096n(1793031546, new p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.xml.GroupSubscriptionSheet.2
                @Override // Y41.p
                public /* bridge */ /* synthetic */ G0 invoke(A a12, Integer num) {
                    invoke(a12, num.intValue());
                    return G0.f406611a;
                }

                @InterfaceC22132o
                @InterfaceC22181t
                public final void invoke(A a12, int i13) {
                    if ((i13 & 3) == 2 && a12.c()) {
                        a12.f();
                    } else {
                        GroupSubscriptionSheet.this.Content(a12, 0);
                    }
                }
            }, true));
            addView(composeView);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @InternalVKIDApi
    public static /* synthetic */ void getComposeViewInternal$annotations() {
    }
}
