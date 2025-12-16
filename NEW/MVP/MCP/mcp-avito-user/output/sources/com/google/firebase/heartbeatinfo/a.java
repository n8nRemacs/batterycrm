package com.google.firebase.heartbeatinfo;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes6.dex */
final class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f361611a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f361612b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f361611a = str;
        this.f361612b = arrayList;
    }

    @Override // com.google.firebase.heartbeatinfo.k
    public final List<String> a() {
        return this.f361612b;
    }

    @Override // com.google.firebase.heartbeatinfo.k
    public final String b() {
        return this.f361611a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f361611a.equals(kVar.b()) && this.f361612b.equals(kVar.a());
    }

    public final int hashCode() {
        return ((this.f361611a.hashCode() ^ 1000003) * 1000003) ^ this.f361612b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f361611a + ", usedDates=" + this.f361612b + "}";
    }
}
