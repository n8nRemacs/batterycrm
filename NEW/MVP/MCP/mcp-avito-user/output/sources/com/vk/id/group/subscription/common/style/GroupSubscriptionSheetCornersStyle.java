package com.vk.id.group.subscription.common.style;

import Y61.k;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GroupSubscriptionSheetCornersStyle.kt */
@H0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "", "radiusDp", "", "<init>", "(F)V", "getRadiusDp", "()F", "Default", "None", "Rounded", "Custom", "Companion", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Custom;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Default;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$None;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Rounded;", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class GroupSubscriptionSheetCornersStyle {

    @k
    private static final Companion Companion = new Companion(null);
    private final float radiusDp;

    /* compiled from: GroupSubscriptionSheetCornersStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Companion;", "", "<init>", "()V", "ROUNDED_RADIUS_DP", "", "NONE_RADIUS_DP", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GroupSubscriptionSheetCornersStyle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Custom;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "radiusDp", "", "<init>", "(F)V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Custom extends GroupSubscriptionSheetCornersStyle {
        public Custom(float f12) {
            super(f12, null);
        }
    }

    /* compiled from: GroupSubscriptionSheetCornersStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Default;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "<init>", "()V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends GroupSubscriptionSheetCornersStyle {

        @k
        public static final Default INSTANCE = new Default();

        private Default() {
            super(12.0f, null);
        }
    }

    /* compiled from: GroupSubscriptionSheetCornersStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$None;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "<init>", "()V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends GroupSubscriptionSheetCornersStyle {

        @k
        public static final None INSTANCE = new None();

        private None() {
            super(0.0f, null);
        }
    }

    /* compiled from: GroupSubscriptionSheetCornersStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle$Rounded;", "Lcom/vk/id/group/subscription/common/style/GroupSubscriptionSheetCornersStyle;", "<init>", "()V", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Rounded extends GroupSubscriptionSheetCornersStyle {

        @k
        public static final Rounded INSTANCE = new Rounded();

        private Rounded() {
            super(12.0f, null);
        }
    }

    public /* synthetic */ GroupSubscriptionSheetCornersStyle(float f12, C42822w c42822w) {
        this(f12);
    }

    public final float getRadiusDp() {
        return this.radiusDp;
    }

    private GroupSubscriptionSheetCornersStyle(float f12) {
        this.radiusDp = f12;
    }
}
