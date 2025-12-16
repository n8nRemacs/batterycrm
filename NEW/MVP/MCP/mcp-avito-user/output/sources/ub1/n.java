package ub1;

import java.util.Map;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f440168a;

    public n(Map map) {
        this.f440168a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        nVar.getClass();
        return L.f(this.f440168a, nVar.f440168a);
    }

    public final int hashCode() {
        return this.f440168a.hashCode() + 249895160;
    }

    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("ReviewAnalyticsEvent(eventName=sdkInfo, eventData="), this.f440168a, ')');
    }
}
