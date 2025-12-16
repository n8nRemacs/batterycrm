package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import java.util.List;

/* loaded from: classes.dex */
public class b79 {
    public final MediaSession a;
    public final a79 b;
    public final g79 c;
    public final Bundle e;
    public f3c g;
    public List h;
    public x19 i;
    public int j;
    public int k;
    public z69 l;
    public b89 m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public b79(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(context, str, bundle);
        this.a = mediaSessionA;
        a79 a79Var = new a79(this);
        this.b = a79Var;
        this.c = new g79(mediaSessionA.getSessionToken(), a79Var);
        this.e = bundle;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public b89 b() {
        b89 b89Var;
        synchronized (this.d) {
            b89Var = this.m;
        }
        return b89Var;
    }

    public void c(b89 b89Var) {
        synchronized (this.d) {
            this.m = b89Var;
        }
    }
}
