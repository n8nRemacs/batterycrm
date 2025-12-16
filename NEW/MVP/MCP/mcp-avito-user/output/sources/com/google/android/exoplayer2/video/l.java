package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f348311b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n.a f348312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f348313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f348314e;

    public /* synthetic */ l(n.a aVar, int i12, long j12) {
        this.f348312c = aVar;
        this.f348314e = i12;
        this.f348313d = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i12 = this.f348314e;
        long j12 = this.f348313d;
        n.a aVar = this.f348312c;
        int i13 = this.f348311b;
        aVar.getClass();
        switch (i13) {
            case 0:
                int i14 = U.f348106a;
                aVar.f348319b.g2(i12, j12);
                break;
            default:
                int i15 = U.f348106a;
                aVar.f348319b.R2(i12, j12);
                break;
        }
    }

    public /* synthetic */ l(n.a aVar, long j12, int i12) {
        this.f348312c = aVar;
        this.f348313d = j12;
        this.f348314e = i12;
    }
}
