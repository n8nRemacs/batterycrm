package ru.ok.android.externcalls.sdk.ml.config;

import defpackage.tk4;
import defpackage.y6d;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/KwsFeaturesConfigProviderImpl;", "Lru/ok/android/externcalls/sdk/config/BaseConfigProvider;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "Lru/ok/android/externcalls/sdk/ml/config/MLFeaturesConfigProvider;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Ly6d;", "log", "", "configKey", "<init>", "(Lru/ok/android/externcalls/sdk/api/RemoteSettings;Ly6d;Ljava/lang/String;)V", "config", "parseConfig", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/ml/config/MLFeatureConfig;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KwsFeaturesConfigProviderImpl extends BaseConfigProvider<MLFeatureConfig> implements MLFeaturesConfigProvider {

    @Deprecated
    public static final String CHECKSUM_KEY = "cs";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENABLED_KEY = "use";

    @Deprecated
    public static final String LOG_TAG = "MLFeaturesConfigProviderImpl";

    @Deprecated
    public static final String URL_KEY = "url";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/sdk/ml/config/KwsFeaturesConfigProviderImpl$Companion;", "", "()V", "CHECKSUM_KEY", "", "ENABLED_KEY", "LOG_TAG", "URL_KEY", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    public KwsFeaturesConfigProviderImpl(RemoteSettings remoteSettings, y6d y6dVar, String str) {
        super(remoteSettings, y6dVar, str, new MLFeatureConfig(null, null, false, 7, null), LOG_TAG);
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public MLFeatureConfig parseConfig(String config) {
        JSONObject jSONObject = new JSONObject(config);
        return new MLFeatureConfig(JsonExtKt.getStringOrDefault(jSONObject, URL_KEY, ""), JsonExtKt.getStringOrDefault(jSONObject, CHECKSUM_KEY, ""), JsonExtKt.getBooleanOrDefault(jSONObject, ENABLED_KEY, true));
    }
}
