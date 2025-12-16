package com.otaliastudios.transcoder.internal.transcode;

import com.avito.android.messenger.conversation.mvi.video.b;
import com.avito.android.util.X2;

/* compiled from: TranscodeDispatcher.java */
/* loaded from: classes7.dex */
class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f366202b;

    public f(j jVar) {
        this.f366202b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.avito.android.messenger.conversation.mvi.video.d dVar = this.f366202b.f366209b;
        dVar.getClass();
        X2.f318778a.c("VideoCompressor", "onTranscodeCanceled() for sourceUri = " + dVar.f194992a + ", destFile = " + dVar.f194993b, null);
        dVar.f194994c.g(b.a.C5754a.f194885c);
    }
}
