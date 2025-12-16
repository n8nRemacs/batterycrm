package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.video.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f348315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n.a f348316c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.decoder.f f348317d;

    public /* synthetic */ m(n.a aVar, com.google.android.exoplayer2.decoder.f fVar, int i12) {
        this.f348315b = i12;
        this.f348316c = aVar;
        this.f348317d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f348315b) {
            case 0:
                n.a aVar = this.f348316c;
                com.google.android.exoplayer2.decoder.f fVar = this.f348317d;
                aVar.getClass();
                synchronized (fVar) {
                }
                n nVar = aVar.f348319b;
                int i12 = U.f348106a;
                nVar.g9(fVar);
                break;
            default:
                n.a aVar2 = this.f348316c;
                aVar2.getClass();
                int i13 = U.f348106a;
                aVar2.f348319b.Yd(this.f348317d);
                break;
        }
    }
}
