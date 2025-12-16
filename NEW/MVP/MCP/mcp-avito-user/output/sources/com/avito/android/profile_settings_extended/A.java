package com.avito.android.profile_settings_extended;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.render.android_view.BeduinView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f228956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B f228957c;

    public /* synthetic */ A(B b12, int i12) {
        this.f228956b = i12;
        this.f228957c = b12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerViewA;
        switch (this.f228956b) {
            case 0:
                BeduinView beduinView = this.f228957c.f228975r;
                if (beduinView != null && (recyclerViewA = CA.b.a(beduinView)) != null) {
                    recyclerViewA.A0(0);
                    break;
                }
                break;
            default:
                ScreenPerformanceTracker.a.c(this.f228957c.f228961d, null, null, null, 7);
                break;
        }
    }
}
