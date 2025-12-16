package com.otaliastudios.transcoder.internal.transcode;

import com.avito.android.messenger.conversation.mvi.video.b;
import com.avito.android.util.X2;

/* compiled from: TranscodeDispatcher.java */
/* loaded from: classes7.dex */
class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f366205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f366206c;

    public h(j jVar, Exception exc) {
        this.f366206c = jVar;
        this.f366205b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f366206c;
        Exception exc = this.f366205b;
        com.avito.android.messenger.conversation.mvi.video.d dVar = jVar.f366209b;
        dVar.getClass();
        X2.f318778a.a("VideoCompressor", "onTranscodeFailed() for sourceUri = " + dVar.f194992a + ", destFile = " + dVar.f194993b, exc);
        dVar.f194994c.g(new b.a.C5755b(exc, null));
    }
}
