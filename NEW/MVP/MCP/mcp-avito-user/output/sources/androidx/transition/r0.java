package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
@j.X
/* loaded from: classes10.dex */
class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f54843a;

    public r0(@j.N View view) {
        this.f54843a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r0) && ((r0) obj).f54843a.equals(this.f54843a);
    }

    public final int hashCode() {
        return this.f54843a.hashCode();
    }
}
