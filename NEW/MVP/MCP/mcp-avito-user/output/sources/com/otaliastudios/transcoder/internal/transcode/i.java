package com.otaliastudios.transcoder.internal.transcode;

import com.avito.android.messenger.conversation.mvi.video.c;
import io.reactivex.rxjava3.core.B;

/* compiled from: TranscodeDispatcher.java */
/* loaded from: classes7.dex */
class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f366207b;

    public i(j jVar, double d12) {
        this.f366207b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B<c.a> b12 = this.f366207b.f366209b.f194994c;
        if (b12.getF318621e()) {
            return;
        }
        b12.onNext(c.a.b.f194891a);
    }
}
