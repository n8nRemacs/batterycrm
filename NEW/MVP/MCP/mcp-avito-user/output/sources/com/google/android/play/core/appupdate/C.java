package com.google.android.play.core.appupdate;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class C extends AbstractC37097d {

    /* renamed from: a, reason: collision with root package name */
    public final int f357998a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f357999b;

    public /* synthetic */ C(int i12, boolean z12, B b12) {
        this.f357998a = i12;
        this.f357999b = z12;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC37097d
    public final boolean a() {
        return this.f357999b;
    }

    @Override // com.google.android.play.core.appupdate.AbstractC37097d
    @JY0.b
    public final int b() {
        return this.f357998a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC37097d) {
            AbstractC37097d abstractC37097d = (AbstractC37097d) obj;
            if (this.f357998a == abstractC37097d.b() && this.f357999b == abstractC37097d.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f357998a ^ 1000003) * 1000003) ^ (true != this.f357999b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f357998a + ", allowAssetPackDeletion=" + this.f357999b + "}";
    }
}
