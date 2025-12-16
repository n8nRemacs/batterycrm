package com.vk.id.group.subscription.compose.util;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.T;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.vk.id.group.subscription.common.style.GroupSubscriptionStyle;
import com.vk.id.group.subscription.compose.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import u0.C48752a;

/* compiled from: StylingUtil.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\u0004\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/graphics/T;", "textPrimaryColor", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;Landroidx/compose/runtime/A;I)J", "textSecondaryColor", "textPrimaryButtonColor", "(Lcom/vk/id/group/subscription/common/style/GroupSubscriptionStyle;)J", "textPrimaryButtonBackgroundColor", "textSecondaryButtonBackgroundColor", "backgroundColor", "group-subscription-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StylingUtilKt {
    @InterfaceC22132o
    public static final long backgroundColor(@k GroupSubscriptionStyle groupSubscriptionStyle, @l A a12, int i12) {
        long jA2;
        a12.I(-1180487326);
        if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            a12.I(2142912673);
            jA2 = C48752a.a(a12, R.color.vkid_white);
            a12.O();
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                a12.I(2142910967);
                a12.O();
                throw new NoWhenBranchMatchedException();
            }
            a12.I(2142915115);
            jA2 = C48752a.a(a12, R.color.vkid_background_dark);
            a12.O();
        }
        a12.O();
        return jA2;
    }

    @InterfaceC22132o
    public static final long textPrimaryButtonBackgroundColor(@k GroupSubscriptionStyle groupSubscriptionStyle, @l A a12, int i12) {
        long jA2;
        a12.I(1212274317);
        if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            a12.I(-378742776);
            jA2 = C48752a.a(a12, R.color.vkid_azure_300);
            a12.O();
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                a12.I(-378744492);
                a12.O();
                throw new NoWhenBranchMatchedException();
            }
            a12.I(-378740220);
            jA2 = C48752a.a(a12, R.color.vkid_white);
            a12.O();
        }
        a12.O();
        return jA2;
    }

    public static final long textPrimaryButtonColor(@k GroupSubscriptionStyle groupSubscriptionStyle) {
        if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            T.f39320b.getClass();
            return T.f39323e;
        }
        if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
            throw new NoWhenBranchMatchedException();
        }
        T.f39320b.getClass();
        return T.f39321c;
    }

    @InterfaceC22132o
    public static final long textPrimaryColor(@k GroupSubscriptionStyle groupSubscriptionStyle, @l A a12, int i12) {
        long jA2;
        a12.I(1121586797);
        if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            T.f39320b.getClass();
            jA2 = T.f39321c;
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                throw new NoWhenBranchMatchedException();
            }
            jA2 = C48752a.a(a12, R.color.vkid_text_dark_primary);
        }
        a12.O();
        return jA2;
    }

    @InterfaceC22132o
    public static final long textSecondaryButtonBackgroundColor(@k GroupSubscriptionStyle groupSubscriptionStyle, @l A a12, int i12) {
        long jA2;
        a12.I(1629861823);
        if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            a12.I(63744110);
            jA2 = C48752a.a(a12, R.color.vkid_background_secondary_button_light);
            a12.O();
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                a12.I(63742421);
                a12.O();
                throw new NoWhenBranchMatchedException();
            }
            a12.I(63747437);
            jA2 = C48752a.a(a12, R.color.vkid_background_secondary_button_dark);
            a12.O();
        }
        a12.O();
        return jA2;
    }

    @InterfaceC22132o
    public static final long textSecondaryColor(@k GroupSubscriptionStyle groupSubscriptionStyle, @l A a12, int i12) {
        int i13;
        a12.I(440046495);
        if (groupSubscriptionStyle instanceof GroupSubscriptionStyle.Light) {
            i13 = R.color.vkid_text_light_subhead;
        } else {
            if (!(groupSubscriptionStyle instanceof GroupSubscriptionStyle.Dark)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.color.vkid_text_dark_subhead;
        }
        long jA2 = C48752a.a(a12, i13);
        a12.O();
        return jA2;
    }
}
