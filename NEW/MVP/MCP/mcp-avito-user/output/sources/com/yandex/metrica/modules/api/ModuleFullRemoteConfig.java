package com.yandex.metrica.modules.api;

import androidx.appcompat.app.r;
import kotlin.jvm.internal.L;

/* loaded from: classes7.dex */
public final class ModuleFullRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final CommonIdentifiers f382361a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f382362b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f382363c;

    public ModuleFullRemoteConfig(CommonIdentifiers commonIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f382361a = commonIdentifiers;
        this.f382362b = remoteConfigMetaInfo;
        this.f382363c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleFullRemoteConfig)) {
            return false;
        }
        ModuleFullRemoteConfig moduleFullRemoteConfig = (ModuleFullRemoteConfig) obj;
        return L.f(this.f382361a, moduleFullRemoteConfig.f382361a) && L.f(this.f382362b, moduleFullRemoteConfig.f382362b) && L.f(this.f382363c, moduleFullRemoteConfig.f382363c);
    }

    public final int hashCode() {
        CommonIdentifiers commonIdentifiers = this.f382361a;
        int iHashCode = (commonIdentifiers != null ? commonIdentifiers.hashCode() : 0) * 31;
        RemoteConfigMetaInfo remoteConfigMetaInfo = this.f382362b;
        int iHashCode2 = (iHashCode + (remoteConfigMetaInfo != null ? remoteConfigMetaInfo.hashCode() : 0)) * 31;
        Object obj = this.f382363c;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModuleFullRemoteConfig(commonIdentifiers=");
        sb2.append(this.f382361a);
        sb2.append(", remoteConfigMetaInfo=");
        sb2.append(this.f382362b);
        sb2.append(", moduleConfig=");
        return r.o(this.f382363c, ")", sb2);
    }
}
