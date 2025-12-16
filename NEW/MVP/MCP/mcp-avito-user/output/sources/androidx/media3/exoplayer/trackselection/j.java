package androidx.media3.exoplayer.trackselection;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.AbstractC37429w3;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes.dex */
class j implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f50025a;

    public j(g gVar) {
        this.f50025a = gVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z12) {
        g gVar = this.f50025a;
        AbstractC37429w3<Integer> abstractC37429w3 = g.f49906j;
        gVar.n();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z12) {
        g gVar = this.f50025a;
        AbstractC37429w3<Integer> abstractC37429w3 = g.f49906j;
        gVar.n();
    }
}
