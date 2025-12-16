package net.bytebuddy.jar.asm;

import androidx.compose.runtime.C22026a;

/* compiled from: Handle.java */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f418256a;

    /* renamed from: b, reason: collision with root package name */
    public final String f418257b;

    /* renamed from: c, reason: collision with root package name */
    public final String f418258c;

    /* renamed from: d, reason: collision with root package name */
    public final String f418259d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f418260e;

    public p(String str, String str2, String str3, int i12, boolean z12) {
        this.f418256a = i12;
        this.f418257b = str;
        this.f418258c = str2;
        this.f418259d = str3;
        this.f418260e = z12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f418256a == pVar.f418256a && this.f418260e == pVar.f418260e && this.f418257b.equals(pVar.f418257b) && this.f418258c.equals(pVar.f418258c) && this.f418259d.equals(pVar.f418259d);
    }

    public final int hashCode() {
        return (this.f418259d.hashCode() * this.f418258c.hashCode() * this.f418257b.hashCode()) + this.f418256a + (this.f418260e ? 64 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f418257b);
        sb2.append('.');
        sb2.append(this.f418258c);
        sb2.append(this.f418259d);
        sb2.append(" (");
        sb2.append(this.f418256a);
        return C22026a.c(sb2, this.f418260e ? " itf" : "", ')');
    }
}
