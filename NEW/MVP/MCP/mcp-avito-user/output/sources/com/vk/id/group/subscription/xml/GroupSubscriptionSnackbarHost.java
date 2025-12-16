package com.vk.id.group.subscription.xml;

import N11.a;
import X41.j;
import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.material3.C21729mg;
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
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt;
import com.vk.id.group.subscription.compose.util.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GroupSubscriptionSnackbarHost.kt */
@P
@s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\"²\u0006\u000e\u0010\u0019\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/vk/id/group/subscription/xml/GroupSubscriptionSnackbarHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/G0;", "Content", "(Landroidx/compose/runtime/A;I)V", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/material3/mg;", "snackbarHostState", "Landroidx/compose/material3/mg;", "getSnackbarHostState", "()Landroidx/compose/material3/mg;", "getSnackbarHostState$annotations", "()V", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "value", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "getStyle", "()Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "setStyle", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;)V", "Lkotlin/Function1;", "onStyleChange", "LY41/l;", "group-subscription-xml_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionSnackbarHost extends FrameLayout {

    @k
    private final ComposeView composeView;

    @k
    private l<? super GroupSubscriptionStyle, G0> onStyleChange;

    @k
    private final C21729mg snackbarHostState;

    @k
    private GroupSubscriptionStyle style;

    public /* synthetic */ GroupSubscriptionSnackbarHost(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC22132o
    @InterfaceC22181t
    public final void Content(A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1747402937);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(this) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(-1797464668);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(this.style);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            bE2.I(-1797462800);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new b(4, interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            this.onStyleChange = (l) objT2;
            GroupSubscriptionSheetKt.GroupSubscriptionSnackbarHost(this.snackbarHostState, Content$lambda$3(interfaceC22204y1), bE2, 0, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, 2, this);
        }
    }

    private static final GroupSubscriptionStyle Content$lambda$3(InterfaceC22204y1<GroupSubscriptionStyle> interfaceC22204y1) {
        return interfaceC22204y1.getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$6$lambda$5(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionStyle groupSubscriptionStyle) {
        interfaceC22204y1.setValue(groupSubscriptionStyle);
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 Content$lambda$7(GroupSubscriptionSnackbarHost groupSubscriptionSnackbarHost, int i12, A a12, int i13) {
        groupSubscriptionSnackbarHost.Content(a12, C22066f2.a(i12 | 1));
        return G0.f406611a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G0 onStyleChange$lambda$0(GroupSubscriptionStyle groupSubscriptionStyle) {
        return G0.f406611a;
    }

    @k
    public final C21729mg getSnackbarHostState() {
        return this.snackbarHostState;
    }

    @k
    public final GroupSubscriptionStyle getStyle() {
        return this.style;
    }

    public final void setStyle(@k GroupSubscriptionStyle groupSubscriptionStyle) {
        this.style = groupSubscriptionStyle;
        this.onStyleChange.invoke(groupSubscriptionStyle);
    }

    @j
    public GroupSubscriptionSnackbarHost(@k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.composeView = composeView;
        this.snackbarHostState = new C21729mg();
        this.style = new GroupSubscriptionStyle.Light(null, null, null, 7, null);
        this.onStyleChange = new P11.a(13);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.vkid_GroupSubscription, 0, 0);
        try {
            setStyle(GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionStyleConstructor(typedArrayObtainStyledAttributes, context).invoke(new GroupSubscriptionSheetCornersStyle.Custom(UtilsKt.pixelsToDp(context, GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionCornerRadius(typedArrayObtainStyledAttributes, context))), new GroupSubscriptionButtonsCornersStyle.Custom(UtilsKt.pixelsToDp(context, GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionButtonCornerRadius(typedArrayObtainStyledAttributes, context))), GroupSubscriptionAttrsKt.vkidInternalGetGroupSubscriptionButtonSize(typedArrayObtainStyledAttributes)));
            typedArrayObtainStyledAttributes.recycle();
            composeView.setContent(new C22096n(477647012, new p<A, Integer, G0>() { // from class: com.vk.id.group.subscription.xml.GroupSubscriptionSnackbarHost.2
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
                        GroupSubscriptionSnackbarHost.this.Content(a12, 0);
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
    public static /* synthetic */ void getSnackbarHostState$annotations() {
    }
}
