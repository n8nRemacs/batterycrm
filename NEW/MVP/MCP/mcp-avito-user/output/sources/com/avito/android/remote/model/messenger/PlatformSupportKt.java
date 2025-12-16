package com.avito.android.remote.model.messenger;

import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: PlatformSupport.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, d2 = {"isSupported", "", "Lcom/avito/android/remote/model/messenger/PlatformSupport;", "(Lcom/avito/android/remote/model/messenger/PlatformSupport;)Z", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class PlatformSupportKt {
    public static final boolean isSupported(@l PlatformSupport platformSupport) {
        List<String> platforms;
        if (platformSupport == null || (platforms = platformSupport.getPlatforms()) == null) {
            return true;
        }
        return platforms.contains("android");
    }
}
