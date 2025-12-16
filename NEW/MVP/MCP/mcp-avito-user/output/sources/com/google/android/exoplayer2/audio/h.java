package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.i;
import com.google.android.exoplayer2.util.U;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f343993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.a f343994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.decoder.f f343995d;

    public /* synthetic */ h(i.a aVar, com.google.android.exoplayer2.decoder.f fVar, int i12) {
        this.f343993b = i12;
        this.f343994c = aVar;
        this.f343995d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f343993b) {
            case 0:
                i.a aVar = this.f343994c;
                aVar.getClass();
                int i12 = U.f348106a;
                aVar.f343997b.u8(this.f343995d);
                break;
            default:
                i.a aVar2 = this.f343994c;
                com.google.android.exoplayer2.decoder.f fVar = this.f343995d;
                aVar2.getClass();
                synchronized (fVar) {
                }
                i iVar = aVar2.f343997b;
                int i13 = U.f348106a;
                iVar.md(fVar);
                break;
        }
    }
}
