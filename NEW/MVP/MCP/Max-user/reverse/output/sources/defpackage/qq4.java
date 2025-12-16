package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class qq4 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ ar4 a;

    public qq4(ar4 ar4Var) {
        this.a = ar4Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        ijb ijbVar = ar4.k;
        this.a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        ijb ijbVar = ar4.k;
        this.a.f();
    }
}
