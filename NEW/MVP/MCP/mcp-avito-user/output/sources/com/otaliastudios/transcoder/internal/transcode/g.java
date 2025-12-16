package com.otaliastudios.transcoder.internal.transcode;

import com.avito.android.messenger.conversation.mvi.video.c;
import com.avito.android.util.X2;
import io.reactivex.rxjava3.core.B;

/* compiled from: TranscodeDispatcher.java */
/* loaded from: classes7.dex */
class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f366204c;

    public g(j jVar, int i12) {
        this.f366204c = jVar;
        this.f366203b = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.avito.android.messenger.conversation.mvi.video.d dVar = this.f366204c.f366209b;
        dVar.getClass();
        X2 x22 = X2.f318778a;
        StringBuilder sb2 = new StringBuilder("onTranscodeCompleted(successCode=");
        int i12 = this.f366203b;
        sb2.append(i12);
        sb2.append(") for sourceUri = ");
        sb2.append(dVar.f194992a);
        sb2.append(", destFile = ");
        sb2.append(dVar.f194993b);
        x22.c("VideoCompressor", sb2.toString(), null);
        B<c.a> b12 = dVar.f194994c;
        if (b12.getF318621e()) {
            return;
        }
        if (i12 == 0) {
            b12.onNext(new c.a.C5759c(dVar.f194995d));
        } else {
            b12.onNext(c.a.C5758a.f194890a);
        }
        b12.e();
    }
}
