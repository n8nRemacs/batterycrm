package androidx.media3.decoder;

import androidx.media3.common.util.J;

/* compiled from: Buffer.java */
@J
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public int f48328b;

    public final void e(int i12) {
        this.f48328b = i12 | this.f48328b;
    }

    public final boolean f(int i12) {
        return (this.f48328b & i12) == i12;
    }
}
