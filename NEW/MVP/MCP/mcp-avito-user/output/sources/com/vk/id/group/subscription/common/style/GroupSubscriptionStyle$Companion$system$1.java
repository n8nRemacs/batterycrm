package com.vk.id.group.subscription.common.style;

import Y41.q;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: GroupSubscriptionStyle.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class GroupSubscriptionStyle$Companion$system$1 extends H implements q<GroupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle, GroupSubscriptionStyle.Dark> {
    public static final GroupSubscriptionStyle$Companion$system$1 INSTANCE = new GroupSubscriptionStyle$Companion$system$1();

    public GroupSubscriptionStyle$Companion$system$1() {
        super(3, GroupSubscriptionStyle.Dark.class, "<init>", "<init>(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", 0);
    }

    @Override // Y41.q
    public final GroupSubscriptionStyle.Dark invoke(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
        return new GroupSubscriptionStyle.Dark(groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle);
    }
}
