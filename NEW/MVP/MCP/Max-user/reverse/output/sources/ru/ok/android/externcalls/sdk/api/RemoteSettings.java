package ru.ok.android.externcalls.sdk.api;

import defpackage.e2f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "", "", "key", "Le2f;", "get", "(Ljava/lang/String;)Le2f;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RemoteSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String KEY_ML_FEATURES = "android.mlfeatures.%s";
    public static final String KEY_PLATFORM = "android";
    public static final String KEY_RATING_LIMITS = "android.rating.limits";
    public static final String KEY_WORDSPOTTER_CONFIG = "android.wordspotter.config";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/RemoteSettings$Companion;", "", "()V", "KEY_ML_FEATURES", "", "KEY_PLATFORM", "KEY_RATING_LIMITS", "KEY_WORDSPOTTER_CONFIG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_ML_FEATURES = "android.mlfeatures.%s";
        public static final String KEY_PLATFORM = "android";
        public static final String KEY_RATING_LIMITS = "android.rating.limits";
        public static final String KEY_WORDSPOTTER_CONFIG = "android.wordspotter.config";

        private Companion() {
        }
    }

    e2f get(String key);
}
