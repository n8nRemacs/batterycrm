package com.otaliastudios.transcoder;

import com.otaliastudios.transcoder.internal.transcode.l;
import java.util.concurrent.Callable;

/* compiled from: Transcoder.java */
/* loaded from: classes7.dex */
class f implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f365981b;

    public f(i iVar) {
        this.f365981b = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        l.a(this.f365981b);
        return null;
    }
}
