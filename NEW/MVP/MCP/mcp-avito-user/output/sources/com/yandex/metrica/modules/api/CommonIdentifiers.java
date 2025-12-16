package com.yandex.metrica.modules.api;

import AK.c;
import kotlin.jvm.internal.L;

/* loaded from: classes7.dex */
public final class CommonIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    public final String f382359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382360b;

    public CommonIdentifiers(String str, String str2) {
        this.f382359a = str;
        this.f382360b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonIdentifiers)) {
            return false;
        }
        CommonIdentifiers commonIdentifiers = (CommonIdentifiers) obj;
        return L.f(this.f382359a, commonIdentifiers.f382359a) && L.f(this.f382360b, commonIdentifiers.f382360b);
    }

    public final int hashCode() {
        String str = this.f382359a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f382360b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommonIdentifiers(uuid=");
        sb2.append(this.f382359a);
        sb2.append(", device=");
        return c.s(sb2, this.f382360b, ")");
    }
}
