package com.vk.id.group.subscription.xml;

import Y61.k;
import android.content.Context;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"pixelsToDp", "", "Landroid/content/Context;", "px", "group-subscription-xml_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final float pixelsToDp(@k Context context, float f12) {
        return f12 / (context.getResources().getDisplayMetrics().densityDpi / 160);
    }
}
