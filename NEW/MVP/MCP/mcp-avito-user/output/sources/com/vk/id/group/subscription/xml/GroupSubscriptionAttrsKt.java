package com.vk.id.group.subscription.xml;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsSizeStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.util.a;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: GroupSubscriptionAttrs.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/res/TypedArray;", "", "vkidInternalGetGroupId", "(Landroid/content/res/TypedArray;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Lkotlin/Function3;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "vkidInternalGetGroupSubscriptionStyleConstructor", "(Landroid/content/res/TypedArray;Landroid/content/Context;)LY41/q;", "", "vkidInternalGetGroupSubscriptionCornerRadius", "(Landroid/content/res/TypedArray;Landroid/content/Context;)F", "vkidInternalGetGroupSubscriptionButtonCornerRadius", "vkidInternalGetGroupSubscriptionButtonSize", "(Landroid/content/res/TypedArray;)Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "dp", "dpToPixels", "(Landroid/content/Context;F)F", "group-subscription-xml_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroupSubscriptionAttrsKt {

    /* compiled from: GroupSubscriptionAttrs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.vk.id.group.subscription.xml.GroupSubscriptionAttrsKt$vkidInternalGetGroupSubscriptionStyleConstructor$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends H implements q<GroupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle, GroupSubscriptionStyle.Dark> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3, GroupSubscriptionStyle.Dark.class, "<init>", "<init>(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", 0);
        }

        @Override // Y41.q
        public final GroupSubscriptionStyle.Dark invoke(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
            return new GroupSubscriptionStyle.Dark(groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle);
        }
    }

    /* compiled from: GroupSubscriptionAttrs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.vk.id.group.subscription.xml.GroupSubscriptionAttrsKt$vkidInternalGetGroupSubscriptionStyleConstructor$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends H implements q<GroupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle, GroupSubscriptionStyle.Light> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, GroupSubscriptionStyle.Light.class, "<init>", "<init>(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", 0);
        }

        @Override // Y41.q
        public final GroupSubscriptionStyle.Light invoke(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
            return new GroupSubscriptionStyle.Light(groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle);
        }
    }

    private static final float dpToPixels(Context context, float f12) {
        return TypedValue.applyDimension(1, f12, context.getResources().getDisplayMetrics());
    }

    @l
    @InternalVKIDApi
    public static final String vkidInternalGetGroupId(@k TypedArray typedArray) {
        return typedArray.getString(R.styleable.vkid_GroupSubscription_vkid_groupId);
    }

    @InternalVKIDApi
    public static final float vkidInternalGetGroupSubscriptionButtonCornerRadius(@k TypedArray typedArray, @k Context context) {
        return typedArray.getDimension(R.styleable.vkid_GroupSubscription_vkid_groupSubscriptionButtonCorners, dpToPixels(context, GroupSubscriptionButtonsCornersStyle.Default.INSTANCE.getRadiusDp()));
    }

    @InternalVKIDApi
    @k
    public static final GroupSubscriptionButtonsSizeStyle vkidInternalGetGroupSubscriptionButtonSize(@k TypedArray typedArray) {
        switch (typedArray.getInt(R.styleable.vkid_GroupSubscription_vkid_groupSubscriptionButtonSize, 0)) {
            case 1:
                return GroupSubscriptionButtonsSizeStyle.SMALL_32;
            case 2:
                return GroupSubscriptionButtonsSizeStyle.SMALL_34;
            case 3:
                return GroupSubscriptionButtonsSizeStyle.SMALL_36;
            case 4:
                return GroupSubscriptionButtonsSizeStyle.SMALL_38;
            case 5:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_40;
            case 6:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_42;
            case 7:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_44;
            case 8:
                return GroupSubscriptionButtonsSizeStyle.MEDIUM_46;
            case 9:
                return GroupSubscriptionButtonsSizeStyle.LARGE_48;
            case 10:
                return GroupSubscriptionButtonsSizeStyle.LARGE_50;
            case 11:
                return GroupSubscriptionButtonsSizeStyle.LARGE_52;
            case 12:
                return GroupSubscriptionButtonsSizeStyle.LARGE_54;
            case 13:
                return GroupSubscriptionButtonsSizeStyle.LARGE_56;
            default:
                return GroupSubscriptionButtonsSizeStyle.DEFAULT;
        }
    }

    @InternalVKIDApi
    public static final float vkidInternalGetGroupSubscriptionCornerRadius(@k TypedArray typedArray, @k Context context) {
        return typedArray.getDimension(R.styleable.vkid_GroupSubscription_vkid_groupSubscriptionCorners, dpToPixels(context, GroupSubscriptionSheetCornersStyle.Default.INSTANCE.getRadiusDp()));
    }

    @InternalVKIDApi
    @k
    public static final q<GroupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle, GroupSubscriptionStyle> vkidInternalGetGroupSubscriptionStyleConstructor(@k TypedArray typedArray, @k Context context) {
        int i12 = typedArray.getInt(R.styleable.vkid_GroupSubscription_vkid_groupSubscriptionStyle, 0);
        return i12 != 1 ? i12 != 2 ? AnonymousClass3.INSTANCE : new a(context, 1) : AnonymousClass1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupSubscriptionStyle vkidInternalGetGroupSubscriptionStyleConstructor$lambda$0(Context context, GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
        return GroupSubscriptionStyle.INSTANCE.system(context, groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle);
    }
}
