package com.vk.id.internal.auth.web;

import Y61.k;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ContextUtils.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/vk/id/internal/auth/web/ContextUtils;", "", "<init>", "()V", "addNewTaskFlag", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "toActivitySafe", "Landroid/app/Activity;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContextUtils {

    @k
    public static final ContextUtils INSTANCE = new ContextUtils();

    private ContextUtils() {
    }

    private final Activity toActivitySafe(Context context) {
        boolean z12;
        while (true) {
            z12 = context instanceof Activity;
            if (z12 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z12) {
            return (Activity) context;
        }
        return null;
    }

    @k
    public final Intent addNewTaskFlag(@k Intent intent, @k Context context) {
        if (toActivitySafe(context) == null) {
            intent.addFlags(268435456);
        }
        return intent;
    }
}
