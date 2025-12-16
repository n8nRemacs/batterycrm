package com.avito.android.enabler;

import Y61.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;

/* compiled from: PersistentTogglesCache.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"VERSION_CODE_KEY", "", "getTogglesPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getVersionPreferences", "_common_features-enabler_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PersistentTogglesCacheKt {

    @k
    private static final String VERSION_CODE_KEY = "enabler_version_code_key";

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences getTogglesPreferences(Context context) {
        return context.getSharedPreferences("enabler_toggles_cache", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences getVersionPreferences(Context context) {
        return context.getSharedPreferences("enabler_version_cache", 0);
    }
}
