package ru.cyberity.cbr.core.common;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: ContextExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "", "permission", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class t {
    public static final boolean a(@Y61.k Context context, @Y61.k String str) {
        return androidx.core.content.d.checkSelfPermission(context, str) == 0;
    }
}
