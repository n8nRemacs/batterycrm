package Oa1;

import java.util.Arrays;

/* renamed from: Oa1.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14654m {

    /* renamed from: a, reason: collision with root package name */
    public final String f12378a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12379b;

    public C14654m(String str, byte[] bArr) {
        this.f12378a = str;
        this.f12379b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14654m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C14654m c14654m = (C14654m) obj;
        return kotlin.jvm.internal.L.f(this.f12378a, c14654m.f12378a) && Arrays.equals(this.f12379b, c14654m.f12379b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12379b) + (this.f12378a.hashCode() * 31);
    }
}
