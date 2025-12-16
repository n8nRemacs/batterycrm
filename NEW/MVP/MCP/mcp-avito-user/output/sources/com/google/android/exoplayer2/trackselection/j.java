package com.google.android.exoplayer2.trackselection;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.AbstractC37429w3;

/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes6.dex */
class j implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f347267a;

    public j(g gVar) {
        this.f347267a = gVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z12) {
        g gVar = this.f347267a;
        AbstractC37429w3<Integer> abstractC37429w3 = g.f347172i;
        gVar.l();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z12) {
        g gVar = this.f347267a;
        AbstractC37429w3<Integer> abstractC37429w3 = g.f347172i;
        gVar.l();
    }
}
