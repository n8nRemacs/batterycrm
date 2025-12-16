package com.vk.id.group.subscription.common.style;

import Y61.k;
import android.content.Context;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.common.util.IsDarkThemeKt;
import com.vk.id.group.subscription.common.style.GroupSubscriptionButtonsCornersStyle;
import com.vk.id.group.subscription.common.style.GroupSubscriptionSheetCornersStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GroupSubscriptionStyle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\u0019B'\b\u0005\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0016\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "cornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "buttonsCornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "buttonsSizeStyle", "<init>", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "getCornersStyle", "()Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "getButtonsCornersStyle", "()Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "getButtonsSizeStyle", "()Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "", "isLight", "Z", "()Z", "isLight$annotations", "()V", "Companion", "Light", "Dark", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle$Dark;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle$Light;", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class GroupSubscriptionStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final GroupSubscriptionButtonsCornersStyle buttonsCornersStyle;

    @k
    private final GroupSubscriptionButtonsSizeStyle buttonsSizeStyle;

    @k
    private final GroupSubscriptionSheetCornersStyle cornersStyle;
    private final boolean isLight;

    /* compiled from: GroupSubscriptionStyle.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle$Companion;", "", "<init>", "()V", ChannelContext.System.TYPE, "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "context", "Landroid/content/Context;", "cornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "buttonsCornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "buttonsSizeStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final GroupSubscriptionStyle system(@k Context context, @k GroupSubscriptionSheetCornersStyle cornersStyle, @k GroupSubscriptionButtonsCornersStyle buttonsCornersStyle, @k GroupSubscriptionButtonsSizeStyle buttonsSizeStyle) {
            return (GroupSubscriptionStyle) (IsDarkThemeKt.getInternalVkIdIsDarkTheme(context) ? GroupSubscriptionStyle$Companion$system$1.INSTANCE : GroupSubscriptionStyle$Companion$system$2.INSTANCE).invoke(cornersStyle, buttonsCornersStyle, buttonsSizeStyle);
        }

        private Companion() {
        }
    }

    /* compiled from: GroupSubscriptionStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle$Dark;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "cornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "buttonsCornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "buttonsSizeStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "<init>", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dark extends GroupSubscriptionStyle {
        public Dark() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ Dark(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? GroupSubscriptionSheetCornersStyle.Default.INSTANCE : groupSubscriptionSheetCornersStyle, (i12 & 2) != 0 ? GroupSubscriptionButtonsCornersStyle.Default.INSTANCE : groupSubscriptionButtonsCornersStyle, (i12 & 4) != 0 ? GroupSubscriptionButtonsSizeStyle.DEFAULT : groupSubscriptionButtonsSizeStyle);
        }

        public Dark(@k GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, @k GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, @k GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
            super(groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle, null);
        }
    }

    /* compiled from: GroupSubscriptionStyle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle$Light;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", "cornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "buttonsCornersStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;", "buttonsSizeStyle", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "<init>", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsCornersStyle;Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;)V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Light extends GroupSubscriptionStyle {
        public Light() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ Light(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? GroupSubscriptionSheetCornersStyle.Default.INSTANCE : groupSubscriptionSheetCornersStyle, (i12 & 2) != 0 ? GroupSubscriptionButtonsCornersStyle.Default.INSTANCE : groupSubscriptionButtonsCornersStyle, (i12 & 4) != 0 ? GroupSubscriptionButtonsSizeStyle.DEFAULT : groupSubscriptionButtonsSizeStyle);
        }

        public Light(@k GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, @k GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, @k GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
            super(groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle, null);
        }
    }

    public /* synthetic */ GroupSubscriptionStyle(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle, C42822w c42822w) {
        this(groupSubscriptionSheetCornersStyle, groupSubscriptionButtonsCornersStyle, groupSubscriptionButtonsSizeStyle);
    }

    @k
    public final GroupSubscriptionButtonsCornersStyle getButtonsCornersStyle() {
        return this.buttonsCornersStyle;
    }

    @k
    public final GroupSubscriptionButtonsSizeStyle getButtonsSizeStyle() {
        return this.buttonsSizeStyle;
    }

    @k
    public final GroupSubscriptionSheetCornersStyle getCornersStyle() {
        return this.cornersStyle;
    }

    @InternalVKIDApi
    private GroupSubscriptionStyle(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle) {
        this.cornersStyle = groupSubscriptionSheetCornersStyle;
        this.buttonsCornersStyle = groupSubscriptionButtonsCornersStyle;
        this.buttonsSizeStyle = groupSubscriptionButtonsSizeStyle;
        this.isLight = this instanceof Light;
    }

    public /* synthetic */ GroupSubscriptionStyle(GroupSubscriptionSheetCornersStyle groupSubscriptionSheetCornersStyle, GroupSubscriptionButtonsCornersStyle groupSubscriptionButtonsCornersStyle, GroupSubscriptionButtonsSizeStyle groupSubscriptionButtonsSizeStyle, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? GroupSubscriptionSheetCornersStyle.Default.INSTANCE : groupSubscriptionSheetCornersStyle, (i12 & 2) != 0 ? GroupSubscriptionButtonsCornersStyle.Default.INSTANCE : groupSubscriptionButtonsCornersStyle, (i12 & 4) != 0 ? GroupSubscriptionButtonsSizeStyle.DEFAULT : groupSubscriptionButtonsSizeStyle, null);
    }
}
