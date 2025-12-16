package com.google.android.datatransport.runtime;

import j.N;
import java.util.Arrays;

/* compiled from: EncodedPayload.java */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.datatransport.c f343165a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f343166b;

    public i(@N com.google.android.datatransport.c cVar, @N byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f343165a = cVar;
        this.f343166b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f343165a.equals(iVar.f343165a)) {
            return Arrays.equals(this.f343166b, iVar.f343166b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f343165a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f343166b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f343165a + ", bytes=[...]}";
    }
}
