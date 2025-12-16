package com.yandex.metrica.modules.api;

import AK.c;

/* loaded from: classes7.dex */
public final class RemoteConfigMetaInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f382364a;

    /* renamed from: b, reason: collision with root package name */
    public final long f382365b;

    public RemoteConfigMetaInfo(long j12, long j13) {
        this.f382364a = j12;
        this.f382365b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfigMetaInfo)) {
            return false;
        }
        RemoteConfigMetaInfo remoteConfigMetaInfo = (RemoteConfigMetaInfo) obj;
        return this.f382364a == remoteConfigMetaInfo.f382364a && this.f382365b == remoteConfigMetaInfo.f382365b;
    }

    public final int hashCode() {
        long j12 = this.f382364a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        long j13 = this.f382365b;
        return i12 + ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteConfigMetaInfo(firstSendTime=");
        sb2.append(this.f382364a);
        sb2.append(", lastUpdateTime=");
        return c.j(this.f382365b, ")", sb2);
    }
}
