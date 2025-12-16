package com.google.firebase.platforminfo;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes6.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f361942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361943b;

    public a(String str, String str2) {
        this.f361942a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f361943b = str2;
    }

    @Override // com.google.firebase.platforminfo.f
    @I41.g
    public final String a() {
        return this.f361942a;
    }

    @Override // com.google.firebase.platforminfo.f
    @I41.g
    public final String b() {
        return this.f361943b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f361942a.equals(fVar.a()) && this.f361943b.equals(fVar.b());
    }

    public final int hashCode() {
        return ((this.f361942a.hashCode() ^ 1000003) * 1000003) ^ this.f361943b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f361942a);
        sb2.append(", version=");
        return AK.c.s(sb2, this.f361943b, "}");
    }
}
