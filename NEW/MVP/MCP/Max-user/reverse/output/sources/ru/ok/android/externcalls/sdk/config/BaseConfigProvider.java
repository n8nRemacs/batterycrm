package ru.ok.android.externcalls.sdk.config;

import defpackage.e2f;
import defpackage.tm6;
import defpackage.y6d;
import kotlin.Metadata;
import org.json.JSONException;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\n\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/config/BaseConfigProvider;", "", "T", "Lru/ok/android/externcalls/sdk/config/ConfigProvider;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "settings", "Ly6d;", "log", "", "configKey", "defaultConfig", "logTag", "<init>", "(Lru/ok/android/externcalls/sdk/api/RemoteSettings;Ly6d;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "config", "parseConfig", "(Ljava/lang/String;)Ljava/lang/Object;", "Le2f;", "getConfig", "()Le2f;", "Lru/ok/android/externcalls/sdk/api/RemoteSettings;", "Ly6d;", "Ljava/lang/String;", "Ljava/lang/Object;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseConfigProvider<T> implements ConfigProvider<T> {
    private final String configKey;
    private final T defaultConfig;
    private final y6d log;
    private final String logTag;
    private final RemoteSettings settings;

    public BaseConfigProvider(RemoteSettings remoteSettings, y6d y6dVar, String str, T t, String str2) {
        this.settings = remoteSettings;
        this.log = y6dVar;
        this.configKey = str;
        this.defaultConfig = t;
        this.logTag = str2;
    }

    @Override // ru.ok.android.externcalls.sdk.config.ConfigProvider
    public e2f getConfig() {
        return this.settings.get(this.configKey).h(new tm6(this) { // from class: ru.ok.android.externcalls.sdk.config.BaseConfigProvider.getConfig.1
            final /* synthetic */ BaseConfigProvider<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // defpackage.tm6
            public final T apply(String str) {
                if (str.length() == 0) {
                    return (T) ((BaseConfigProvider) this.this$0).defaultConfig;
                }
                try {
                    return this.this$0.parseConfig(str);
                } catch (JSONException e) {
                    ((BaseConfigProvider) this.this$0).log.reportException(((BaseConfigProvider) this.this$0).logTag, "Can't parse JSON configuration from ".concat(str), e);
                    return (T) ((BaseConfigProvider) this.this$0).defaultConfig;
                }
            }
        });
    }

    public abstract T parseConfig(String config);
}
