package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes10.dex */
public final class I<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final C27291k f59108a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Throwable f59109b;

    public I(C27291k c27291k) {
        this.f59108a = c27291k;
        this.f59109b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        C27291k c27291k = this.f59108a;
        if (c27291k != null && c27291k.equals(i12.f59108a)) {
            return true;
        }
        Throwable th2 = this.f59109b;
        if (th2 == null || i12.f59109b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59108a, this.f59109b});
    }

    public I(Throwable th2) {
        this.f59109b = th2;
        this.f59108a = null;
    }
}
