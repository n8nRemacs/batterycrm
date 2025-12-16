package com.google.android.play.core.appupdate.internal;

import com.avito.android.remote.model.AvatarStatus;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f358038a;

    static {
        new HashSet(Arrays.asList("app_update", AvatarStatus.REVIEW));
        new HashSet(Arrays.asList("native", PluginErrorDetails.Platform.UNITY));
        f358038a = new HashMap();
        new s("PlayCoreVersion");
    }
}
