package com.google.android.exoplayer2.trackselection;

import j.P;
import java.util.Arrays;

/* compiled from: TrackSelectionArray.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f347277a;

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals((Object[]) null, (Object[]) null);
    }

    public final int hashCode() {
        if (this.f347277a == 0) {
            this.f347277a = Arrays.hashCode((Object[]) null) + 527;
        }
        return this.f347277a;
    }
}
