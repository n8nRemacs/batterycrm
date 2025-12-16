package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class rua {
    public fa6 a = new fa6(5);
    public x6i b = new x6i(10);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public syf e = new syf();
    public boolean f = true;
    public qha g;
    public boolean h;
    public boolean i;
    public mni j;
    public v1a k;
    public ProxySelector l;
    public qha m;
    public SocketFactory n;
    public SSLSocketFactory o;
    public X509TrustManager p;
    public List q;
    public List r;
    public qua s;
    public g72 t;
    public wyi u;
    public int v;
    public int w;
    public int x;
    public long y;
    public zid z;

    public rua() {
        qha qhaVar = qha.d;
        this.g = qhaVar;
        this.h = true;
        this.i = true;
        this.j = mni.s0;
        this.k = v1a.u0;
        this.m = qhaVar;
        this.n = SocketFactory.getDefault();
        this.q = sua.L0;
        this.r = sua.K0;
        this.s = qua.a;
        this.t = g72.c;
        this.v = 10000;
        this.w = 10000;
        this.x = 10000;
        this.y = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
