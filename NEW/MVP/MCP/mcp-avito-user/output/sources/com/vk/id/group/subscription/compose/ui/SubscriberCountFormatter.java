package com.vk.id.group.subscription.compose.ui;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SubscriberCountFormatter.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/SubscriberCountFormatter;", "", "<init>", "()V", "", "value", "", "decimalSeparator", "", "formatForDisplay", "(FC)Ljava/lang/String;", "", "subscriberCount", "format", "(I)Ljava/lang/String;", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubscriberCountFormatter {

    @Y61.k
    public static final SubscriberCountFormatter INSTANCE = new SubscriberCountFormatter();

    private SubscriberCountFormatter() {
    }

    private final String formatForDisplay(float value, char decimalSeparator) {
        int i12;
        int iB2 = kotlin.math.b.b(value * 10);
        int i13 = iB2 % 10;
        if (i13 == 0 || (i12 = iB2 / 10) > 10) {
            return String.valueOf(iB2 / 10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append(decimalSeparator);
        sb2.append(i13);
        return sb2.toString();
    }

    @Y61.k
    public final String format(int subscriberCount) {
        return subscriberCount < 1000 ? String.valueOf(subscriberCount) : subscriberCount < 1000000 ? r.q(formatForDisplay(subscriberCount / 1000.0f, ','), "K") : r.q(formatForDisplay(subscriberCount / 1000000.0f, '.'), "M");
    }
}
