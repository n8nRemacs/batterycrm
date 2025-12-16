package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class W extends AbstractC37107b {

    /* renamed from: a, reason: collision with root package name */
    public final int f358251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f358253c;

    public W(int i12, @j.P String str, @j.P String str2) {
        this.f358251a = i12;
        this.f358252b = str;
        this.f358253c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37107b
    @j.P
    public final String a() {
        return this.f358253c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37107b
    @HY0.c
    public final int b() {
        return this.f358251a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37107b
    @j.P
    public final String c() {
        return this.f358252b;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC37107b) {
            AbstractC37107b abstractC37107b = (AbstractC37107b) obj;
            if (this.f358251a == abstractC37107b.b() && ((str = this.f358252b) != null ? str.equals(abstractC37107b.c()) : abstractC37107b.c() == null) && ((str2 = this.f358253c) != null ? str2.equals(abstractC37107b.a()) : abstractC37107b.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f358251a ^ 1000003;
        String str = this.f358252b;
        int iHashCode = ((i12 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f358253c;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackLocation{packStorageMethod=");
        sb2.append(this.f358251a);
        sb2.append(", path=");
        sb2.append(this.f358252b);
        sb2.append(", assetsPath=");
        return AK.c.s(sb2, this.f358253c, "}");
    }
}
