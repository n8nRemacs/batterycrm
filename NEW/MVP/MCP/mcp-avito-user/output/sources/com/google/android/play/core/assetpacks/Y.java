package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class Y extends AbstractC37119f {

    /* renamed from: a, reason: collision with root package name */
    public final long f358270a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f358271b;

    public Y(long j12, HashMap map) {
        this.f358270a = j12;
        this.f358271b = map;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37119f
    public final Map<String, AssetPackState> b() {
        return this.f358271b;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37119f
    public final long c() {
        return this.f358270a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC37119f) {
            AbstractC37119f abstractC37119f = (AbstractC37119f) obj;
            if (this.f358270a == abstractC37119f.c() && this.f358271b.equals(abstractC37119f.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j12 = this.f358270a;
        return ((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003) ^ this.f358271b.hashCode();
    }

    public final String toString() {
        return "AssetPackStates{totalBytes=" + this.f358270a + ", packStates=" + this.f358271b.toString() + "}";
    }
}
