package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.N;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f346379c;

    public /* synthetic */ p(N n12, int i12) {
        this.f346378b = i12;
        this.f346379c = n12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N n12 = this.f346379c;
        switch (this.f346378b) {
            case 0:
                Set<Integer> set = q.f346533Z;
                ((q) n12).s();
                break;
            case 1:
                q qVar = (q) n12;
                qVar.f346537D = true;
                qVar.s();
                break;
            default:
                ((n) n12).j();
                break;
        }
    }
}
