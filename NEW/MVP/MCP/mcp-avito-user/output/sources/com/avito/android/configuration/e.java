package com.avito.android.configuration;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.config.AppType;
import com.avito.android.util.AppStore;
import kotlin.Metadata;

/* compiled from: BuildConfiguration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/configuration/e;", "", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AppStore f125501a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AppType f125502b;

    public e(@k AppStore appStore, @k AppType appType) {
        this.f125501a = appStore;
        this.f125502b = appType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f125501a == eVar.f125501a && this.f125502b == eVar.f125502b;
    }

    public final int hashCode() {
        return ((((((((((((((Integer.hashCode(3203) + r.i(r.i((((((((this.f125502b.hashCode() + (this.f125501a.hashCode() * 31)) * 31) - 1447057493) * 31) + 3651) * 31) - 1293995364) * 31, 31, true), 31, false)) * 31) + 47687262) * 31) - 1180106167) * 31) - 627876108) * 31) - 905799475) * 31) - 916078087) * 31) + 103145323) * 31) + 1201484323;
    }

    @k
    public final String toString() {
        return "BuildConfiguration(appStore=" + this.f125501a + ", appType=" + this.f125502b + ", appSignatureSha1=673ea7523e1e54c9f4e00743e941916affd0d90f, appLocales=ru, buildType=releaseSelfUpdate, isRelease=true, isDebuggable=false, versionCode=3203, versionName=214.7, apiUrl=https://app.avito.ru/api, webSocketEndpoint=https://socket.avito.ru/socket, webSocketSessionParameter=sessid, messengerImageUploadEndpoint=https://socket.avito.ru/images, performanceTestRunEnvironment=local, graphiteApplicationId=com.avito.android)";
    }
}
