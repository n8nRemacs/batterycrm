package androidx.media;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AbstractServiceC23085i;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MediaBrowserServiceCompat.java */
/* renamed from: androidx.media.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC23086j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSessionCompat.Token f47068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.f f47069c;

    public RunnableC23086j(AbstractServiceC23085i.f fVar, MediaSessionCompat.Token token) {
        this.f47069c = fVar;
        this.f47068b = token;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC23085i.f fVar = this.f47069c;
        ArrayList arrayList = fVar.f47049a;
        boolean zIsEmpty = arrayList.isEmpty();
        MediaSessionCompat.Token token = this.f47068b;
        if (!zIsEmpty) {
            IMediaSession extraBinder = token.getExtraBinder();
            if (extraBinder != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Bundle) it.next()).putBinder("extra_session_binder", extraBinder.asBinder());
                }
            }
            arrayList.clear();
        }
        fVar.f47050b.setSessionToken((MediaSession.Token) token.getToken());
    }
}
