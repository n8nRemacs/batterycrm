package net.bytebuddy.jar.asm;

import java.util.Arrays;

/* compiled from: ConstantDynamic.java */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f418208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f418209b;

    /* renamed from: c, reason: collision with root package name */
    public final p f418210c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f418211d;

    public h(String str, String str2, p pVar, Object... objArr) {
        this.f418208a = str;
        this.f418209b = str2;
        this.f418210c = pVar;
        this.f418211d = objArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f418208a.equals(hVar.f418208a) && this.f418209b.equals(hVar.f418209b) && this.f418210c.equals(hVar.f418210c) && Arrays.equals(this.f418211d, hVar.f418211d);
    }

    public final int hashCode() {
        return ((this.f418208a.hashCode() ^ Integer.rotateLeft(this.f418209b.hashCode(), 8)) ^ Integer.rotateLeft(this.f418210c.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f418211d), 24);
    }

    public final String toString() {
        return this.f418208a + " : " + this.f418209b + ' ' + this.f418210c + ' ' + Arrays.toString(this.f418211d);
    }
}
