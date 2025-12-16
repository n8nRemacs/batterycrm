package com.google.android.odml.image;

/* compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* loaded from: classes6.dex */
final class l extends e {

    /* renamed from: a, reason: collision with root package name */
    public final int f357993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f357994b;

    public /* synthetic */ l(int i12, int i13, j jVar) {
        this.f357993a = i12;
        this.f357994b = i13;
    }

    @Override // com.google.android.odml.image.e
    public final int a() {
        return this.f357993a;
    }

    @Override // com.google.android.odml.image.e
    public final int b() {
        return this.f357994b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f357993a == eVar.a() && this.f357994b == eVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f357993a ^ 1000003) * 1000003) ^ this.f357994b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("ImageProperties{imageFormat=");
        sb2.append(this.f357993a);
        sb2.append(", storageType=");
        sb2.append(this.f357994b);
        sb2.append("}");
        return sb2.toString();
    }
}
