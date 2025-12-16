package ru.ok.android.externcalls.sdk.audio.internal;

import defpackage.tk4;
import defpackage.y6d;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManager;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/KeywordSpotterConfigProviderImpl;", "Lru/ok/android/externcalls/sdk/config/BaseConfigProvider;", "Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterConfig;", "Lru/ok/android/externcalls/sdk/audio/internal/KeywordSpotterConfigProvider;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Ly6d;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/api/RemoteSettings;Ly6d;)V", "", "config", "parseConfig", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/audio/KeywordSpotterManager$KeywordSpotterConfig;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeywordSpotterConfigProviderImpl extends BaseConfigProvider<KeywordSpotterManager.KeywordSpotterConfig> implements KeywordSpotterConfigProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_TURN_OFF_IN = "turn_off_in_ms";

    @Deprecated
    public static final String LOG_TAG = "KeywordSpotterManagerImpl";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/KeywordSpotterConfigProviderImpl$Companion;", "", "()V", "KEY_TURN_OFF_IN", "", "LOG_TAG", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public KeywordSpotterConfigProviderImpl(RemoteSettings remoteSettings, y6d y6dVar) {
        super(remoteSettings, y6dVar, "android.wordspotter.config", new KeywordSpotterManager.KeywordSpotterConfig(null, 1, null), "KeywordSpotterManagerImpl");
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public KeywordSpotterManager.KeywordSpotterConfig parseConfig(String config) {
        return new KeywordSpotterManager.KeywordSpotterConfig(JsonExtKt.getLongOrNull(new JSONObject(config), KEY_TURN_OFF_IN));
    }
}
