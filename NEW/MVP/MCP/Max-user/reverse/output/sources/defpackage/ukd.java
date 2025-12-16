package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.jakewharton.processphoenix.ProcessPhoenix;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import one.me.android.OneMeApplication;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* loaded from: classes.dex */
public class ukd implements cz9, a70, z6d, oj1, pn5, ebd, tm6, ac8, fod, gvb, gu3, nx8, p1c {
    public static final Object c = new Object();
    public static ukd d;
    public static int o;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ukd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static ukd K() {
        synchronized (c) {
            try {
                ukd ukdVar = d;
                if (ukdVar == null) {
                    return new ukd(1);
                }
                d = (ukd) ukdVar.b;
                ukdVar.b = null;
                o--;
                return ukdVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ac8
    public void A(dc8 dc8Var, long j, long j2) {
        ymb ymbVar = (ymb) dc8Var;
        rd4 rd4Var = (rd4) this.b;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        rd4Var.n.getClass();
        rd4Var.q.f(tb8Var, ymbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        zc4 zc4Var = (zc4) ymbVar.X;
        zc4 zc4Var2 = rd4Var.H;
        int size = zc4Var2 == null ? 0 : zc4Var2.m.size();
        long j4 = zc4Var.b(0).b;
        int i = 0;
        while (i < size && rd4Var.H.b(i).b < j4) {
            i++;
        }
        if (zc4Var.d) {
            if (size - i > zc4Var.m.size()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = rd4Var.N;
                if (j5 != -9223372036854775807L) {
                    long j6 = zc4Var.h;
                    if (1000 * j6 <= j5) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j6);
                        sb.append(", ");
                        sb.append(j5);
                        Log.w("DashMediaSource", sb.toString());
                    }
                }
                rd4Var.M = 0;
            }
            int i2 = rd4Var.M;
            rd4Var.M = i2 + 1;
            if (i2 < rd4Var.n.q(ymbVar.c)) {
                rd4Var.D.postDelayed(rd4Var.v, Math.min((rd4Var.M - 1) * 1000, 5000));
                return;
            } else {
                rd4Var.C = new DashManifestStaleException();
                return;
            }
        }
        rd4Var.H = zc4Var;
        rd4Var.I = zc4Var.d & rd4Var.I;
        rd4Var.J = j - j2;
        rd4Var.K = j;
        synchronized (rd4Var.t) {
            try {
                if (ymbVar.b.a == rd4Var.F) {
                    Uri uri = rd4Var.H.k;
                    if (uri == null) {
                        uri = ymbVar.d.c;
                    }
                    rd4Var.F = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            rd4Var.O += i;
            rd4Var.s(true);
            return;
        }
        zc4 zc4Var3 = rd4Var.H;
        if (!zc4Var3.d) {
            rd4Var.s(true);
            return;
        }
        vhb vhbVar = zc4Var3.i;
        if (vhbVar == null) {
            rd4Var.q();
            return;
        }
        String str = (String) vhbVar.b;
        if (xxg.a(str, "urn:mpeg:dash:utc:direct:2014") || xxg.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                rd4Var.L = xxg.E((String) vhbVar.c) - rd4Var.K;
                rd4Var.s(true);
                return;
            } catch (ParserException e) {
                pai.c("DashMediaSource", "Failed to resolve time offset.", e);
                rd4Var.s(true);
                return;
            }
        }
        if (xxg.a(str, "urn:mpeg:dash:utc:http-iso:2014") || xxg.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            ymb ymbVar2 = new ymb(rd4Var.z, Uri.parse((String) vhbVar.c), 5, new od4());
            rd4Var.q.k(new tb8(ymbVar2.a, ymbVar2.b, rd4Var.A.O(ymbVar2, new y6i(12, rd4Var), 1)), ymbVar2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            return;
        }
        if (xxg.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || xxg.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            ymb ymbVar3 = new ymb(rd4Var.z, Uri.parse((String) vhbVar.c), 5, new tha(17));
            rd4Var.q.k(new tb8(ymbVar3.a, ymbVar3.b, rd4Var.A.O(ymbVar3, new y6i(12, rd4Var), 1)), ymbVar3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (xxg.a(str, "urn:mpeg:dash:utc:ntp:2014") || xxg.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            rd4Var.q();
        } else {
            pai.c("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            rd4Var.s(true);
        }
    }

    @Override // defpackage.nx8
    public void C(px8 px8Var) {
        b8a b8aVar = (b8a) this.b;
        o7a o7aVar = b8aVar.x0;
        if (o7aVar != null) {
            px8Var.D();
            hsi.e(o7aVar, "listener must not be null");
            px8Var.c.N(o7aVar);
        }
        b8aVar.x0 = null;
        int i = b8a.U0;
        wqi.c("b8a", "onDisconnected", new Object[0]);
    }

    @Override // defpackage.ac8
    public y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        ymb ymbVar = (ymb) dc8Var;
        rd4 rd4Var = (rd4) this.b;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        int i2 = ymbVar.c;
        rd4Var.n.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        y21 y21Var = jMin == -9223372036854775807L ? hc8.Y : new y21(jMin, 0, 4, false);
        rd4Var.q.i(tb8Var, i2, iOException, !y21Var.a());
        return y21Var;
    }

    @Override // defpackage.gvb
    public void E() {
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        yy7[] yy7VarArr = GifViewerWidget.u0;
        gifViewerWidget.D0().J(gifViewerWidget.z0(), gifViewerWidget.y0());
    }

    @Override // defpackage.oj1
    public void H(float f, float f2) {
        qj1 qj1Var = (qj1) this.b;
        yy7[] yy7VarArr = qj1.w0;
        PointF pointF = qj1Var.o;
        pointF.x = f;
        pointF.y = f2;
    }

    public void J(h93 h93Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = h93Var.o;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(h93Var.o[0]), h93Var);
    }

    public void L() {
        synchronized (c) {
            try {
                int i = o;
                if (i < 5) {
                    o = i + 1;
                    ukd ukdVar = d;
                    if (ukdVar != null) {
                        this.b = ukdVar;
                    }
                    d = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void M(CaptureRequest.Key key, Object obj) {
        ((x8a) this.b).m(e02.N(key), zn3.c, obj);
    }

    @Override // defpackage.p1c
    public void a() {
        PipScreen pipScreen = (PipScreen) this.b;
        if (!pipScreen.getRouter().n()) {
            pipScreen.requireActivity().finish();
            return;
        }
        ln lnVarRequireActivity = pipScreen.requireActivity();
        Intent intent = new Intent(pipScreen.requireActivity(), pipScreen.requireActivity().getClass());
        intent.setFlags(131072);
        lnVarRequireActivity.startActivity(intent);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 21:
                fo4 fo4Var = (fo4) this.b;
                if (fo4Var.a) {
                    ((y6d) fo4Var.b).log("OwnTalkingReporter", "on voice stop detected and reported");
                    oz0 oz0Var = (oz0) fo4Var.X;
                    if (oz0Var != null) {
                        oz0Var.a(false);
                    }
                    fo4Var.a = false;
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof UndeliverableException)) {
                    if (!(th instanceof SQLiteDatabaseCorruptException)) {
                        Thread threadCurrentThread = Thread.currentThread();
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
                        if (uncaughtExceptionHandler != null) {
                            uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
                            break;
                        }
                    } else {
                        ProcessPhoenix.b((OneMeApplication) this.b);
                        break;
                    }
                } else {
                    wqi.e("RxJavaErrorHandler", "rxjava undeliverable error", th);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        Object ipdVar;
        switch (this.a) {
            case 13:
                wo8 wo8VarA = ((um9) ((uid) this.b).a).a();
                String str = ((k2h) obj).d;
                try {
                    ipdVar = Long.valueOf(new File(str).lastModified());
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                if (ipdVar instanceof ipd) {
                    ipdVar = 0L;
                }
                wo8VarA.a = ((Number) ipdVar).longValue();
                wo8VarA.b = str;
                return new um9(wo8VarA);
            default:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 3) {
                    return ((vm6) this.b).apply(objArr[0], objArr[1], objArr[2]);
                }
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    @Override // defpackage.fod
    public void b(Object obj) {
        ((d26) this.b).b.b((byte[]) obj);
    }

    @Override // defpackage.ebd
    public ao3 getConfig() {
        return (ao3) this.b;
    }

    @Override // defpackage.gvb
    public void k() {
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        yy7[] yy7VarArr = GifViewerWidget.u0;
        gifViewerWidget.D0().L(gifViewerWidget.z0(), gifViewerWidget.y0());
    }

    @Override // defpackage.gvb
    public void m() {
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        yy7[] yy7VarArr = GifViewerWidget.u0;
        Object targetController = gifViewerWidget.getTargetController();
        ivb ivbVar = targetController instanceof ivb ? (ivb) targetController : null;
        if (ivbVar != null) {
            ((ChatMediaViewerScreen) ivbVar).T0();
        }
    }

    @Override // defpackage.cz9
    public InputStream n(String str) {
        try {
            return ((AssetManager) this.b).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.pn5
    public c8a o() {
        throw null;
    }

    @Override // defpackage.ac8
    public void r(dc8 dc8Var, long j, long j2, boolean z) {
        ((rd4) this.b).r((ymb) dc8Var, j, j2);
    }

    @Override // defpackage.z6d
    public boolean shouldHideSensitiveInformation() {
        ((eza) ((k18) this.b).getValue()).getClass();
        return true;
    }

    @Override // defpackage.oj1
    public PointF t() {
        return ((qj1) this.b).o;
    }

    @Override // defpackage.nx8
    public void u(mie mieVar) {
        int i = b8a.U0;
        wqi.c("b8a", "onError: " + mieVar.b, new Object[0]);
    }

    public ukd(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tkd tkdVar = (tkd) it.next();
            HashMap map = (HashMap) this.b;
            tkdVar.getClass();
            map.put(wb4.class, tkdVar.a);
        }
    }

    public ukd(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = x8a.b();
                break;
            case 10:
                this.b = ue3.d0(dn2.d);
                break;
            case 11:
                this.b = new LinkedHashMap();
                break;
            case 16:
                this.b = new Object();
                break;
            case 22:
                Process.getStartElapsedRealtime();
                this.b = new js();
                break;
        }
    }

    public ukd(Context context) {
        this.a = 5;
        this.b = context.getApplicationContext();
    }
}
