package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.util.J;
import j.P;
import java.util.Arrays;

/* compiled from: TrackSelectionArray.java */
@J
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f50034a;

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
        if (this.f50034a == 0) {
            this.f50034a = Arrays.hashCode((Object[]) null) + 527;
        }
        return this.f50034a;
    }
}
