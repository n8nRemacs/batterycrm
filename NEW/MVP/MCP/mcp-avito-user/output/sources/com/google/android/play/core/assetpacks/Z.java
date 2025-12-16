package com.google.android.play.core.assetpacks;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class Z extends AbstractC37197z1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f358275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358276b;

    /* renamed from: c, reason: collision with root package name */
    public final long f358277c;

    /* renamed from: d, reason: collision with root package name */
    public final long f358278d;

    /* renamed from: e, reason: collision with root package name */
    public final int f358279e;

    public Z(int i12, int i13, long j12, long j13, @j.P String str) {
        this.f358275a = i12;
        this.f358276b = str;
        this.f358277c = j12;
        this.f358278d = j13;
        this.f358279e = i13;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37197z1
    public final int a() {
        return this.f358275a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37197z1
    public final int b() {
        return this.f358279e;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37197z1
    public final long c() {
        return this.f358277c;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37197z1
    public final long d() {
        return this.f358278d;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC37197z1
    @j.P
    public final String e() {
        return this.f358276b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC37197z1) {
            AbstractC37197z1 abstractC37197z1 = (AbstractC37197z1) obj;
            if (this.f358275a == abstractC37197z1.a() && ((str = this.f358276b) != null ? str.equals(abstractC37197z1.e()) : abstractC37197z1.e() == null) && this.f358277c == abstractC37197z1.c() && this.f358278d == abstractC37197z1.d() && this.f358279e == abstractC37197z1.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i12 = this.f358275a ^ 1000003;
        String str = this.f358276b;
        int iHashCode = ((i12 * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f358277c;
        int i13 = (iHashCode ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f358278d;
        return ((i13 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ this.f358279e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliceCheckpoint{fileExtractionStatus=");
        sb2.append(this.f358275a);
        sb2.append(", filePath=");
        sb2.append(this.f358276b);
        sb2.append(", fileOffset=");
        sb2.append(this.f358277c);
        sb2.append(", remainingBytes=");
        sb2.append(this.f358278d);
        sb2.append(", previousChunk=");
        return AK.c.i(this.f358279e, "}", sb2);
    }
}
