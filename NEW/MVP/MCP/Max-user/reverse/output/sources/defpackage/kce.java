package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import one.me.chatmedia.viewer.photo.GifViewerWidget;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class kce implements xe, mv, j7a, fod, h1e, oj1, rn6, iee, zua, bc8, qz4, tm6, hdh, vz4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ kce(int i) {
        this.a = i;
    }

    @Override // defpackage.j7a
    public void A() {
        v40.e((v40) this.b);
    }

    @Override // defpackage.hdh
    public int B() {
        return 2;
    }

    public File D() {
        return ((iz5) ((w5) this.b).c(111)).n();
    }

    @Override // defpackage.hdh
    public int F() {
        g2h g2hVar = ((GifViewerWidget) this.b).s0;
        if (g2hVar != null) {
            return g2hVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.bc8
    public void G(ec8 ec8Var, long j, long j2, int i) {
        ub8 ub8Var;
        zmb zmbVar = (zmb) ec8Var;
        sd4 sd4Var = (sd4) this.b;
        if (i == 0) {
            long j3 = zmbVar.a;
            ub8Var = new ub8(zmbVar.b);
        } else {
            long j4 = zmbVar.a;
            ze4 ze4Var = zmbVar.b;
            zdf zdfVar = zmbVar.d;
            Uri uri = zdfVar.c;
            ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        }
        sd4Var.q.R(ub8Var, zmbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.oj1
    public void H(float f, float f2) {
        qj1 qj1Var = (qj1) this.b;
        oj1 applicationPipDepended = qj1Var.getApplicationPipDepended();
        if (applicationPipDepended != null) {
            applicationPipDepended.H(f, f2);
        }
        PointF pointF = qj1Var.o;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        e4i e4iVar = g4iVar.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        if (!Objects.equals(coordinatorLayout.z0, g4iVar)) {
            coordinatorLayout.z0 = g4iVar;
            boolean z = g4iVar.d() > 0;
            coordinatorLayout.A0 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!e4iVar.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = hfh.a;
                    if (childAt.getFitsSystemWindows() && ((d74) childAt.getLayoutParams()).a != null && e4iVar.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return g4iVar;
    }

    @Override // defpackage.hdh
    public void J(Surface surface, a3h a3hVar) {
        String str = ((GifViewerWidget) this.b).a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Media viewer. Video viewer, set surface " + surface, null);
            }
        }
        cbh cbhVarB0 = ((GifViewerWidget) this.b).B0();
        if (cbhVarB0 != null) {
            cbhVarB0.a0(surface);
            cbhVarB0.O(a3hVar);
        }
    }

    @Override // defpackage.bc8
    public y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        zmb zmbVar = (zmb) ec8Var;
        sd4 sd4Var = (sd4) this.b;
        long j3 = zmbVar.a;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        int i2 = zmbVar.c;
        sd4Var.m.getClass();
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
        y21 y21Var = jMin == -9223372036854775807L ? te8.X : new y21(jMin, 0, 5, false);
        sd4Var.q.P(ub8Var, i2, iOException, !y21Var.a());
        return y21Var;
    }

    @Override // defpackage.mv
    public void L(long j, List list) {
        xw xwVar = (xw) this.b;
        xwVar.z();
        xwVar.l(list, j, false, true, false);
    }

    public void M(z59 z59Var, h59 h59Var, Collection collection) {
        h69 h69Var = (h69) this.b;
        if (z59Var != h69Var.u || h59Var == null) {
            if (z59Var == h69Var.s) {
                if (h59Var != null) {
                    h69Var.l(h69Var.r, h59Var);
                }
                h69Var.r.n(collection);
                return;
            }
            return;
        }
        j69 j69Var = h69Var.t.a;
        String strC = h59Var.c();
        k69 k69Var = new k69(j69Var, strC, h69Var.b(j69Var, strC));
        k69Var.i(h59Var);
        if (h69Var.r == k69Var) {
            return;
        }
        z59 z59Var2 = h69Var.u;
        k69 k69Var2 = h69Var.t;
        i69 i69Var = h69Var.z;
        if (i69Var != null) {
            a69 a69Var = i69Var.a;
            if (!i69Var.h && !i69Var.i) {
                i69Var.i = true;
                if (a69Var != null) {
                    a69Var.h(0);
                    a69Var.d();
                }
            }
            h69Var.z = null;
        }
        i69 i69Var2 = new i69(h69Var, k69Var, z59Var2, 3, k69Var2, collection);
        h69Var.z = i69Var2;
        i69Var2.a();
        h69Var.t = null;
        h69Var.u = null;
    }

    public void N(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        ArrayList arrayList = null;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    public Long O(Long l) {
        if (l == null) {
            this.b = null;
            return null;
        }
        if (l.longValue() < 0) {
            this.b = null;
            return null;
        }
        Long l2 = (Long) this.b;
        this.b = l;
        if (l2 != null && l.longValue() >= l2.longValue()) {
            return Long.valueOf(l.longValue() - l2.longValue());
        }
        return null;
    }

    @Override // defpackage.rn6, defpackage.v2f
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return ((Class) this.b).cast(obj);
    }

    @Override // defpackage.fod
    public void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            ((vo0) this.b).a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }

    @Override // defpackage.qz4, defpackage.vz4
    public void c() {
        ql6 ql6VarB0;
        switch (this.a) {
            case 16:
                ((s6b) ((tz4) this.b).e).d();
                break;
            default:
                yaa yaaVar = ((w9a) this.b).t0;
                if (yaaVar != null) {
                    Iterator it = ((Set) yaaVar.a).iterator();
                    while (it.hasNext()) {
                        FrgLocalVideo frgLocalVideo = ((iaa) it.next()).Y;
                        if (frgLocalVideo != null && (ql6VarB0 = frgLocalVideo.B0()) != null) {
                            ((ActLocalMedias) ql6VarB0).Z();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.iee
    public long d() {
        long jMin = Long.MAX_VALUE;
        for (iee ieeVar : (iee[]) this.b) {
            long jD = ieeVar.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.j7a
    public void e() {
        v40 v40Var = (v40) this.b;
        ((b8a) v40Var.a).q();
        v40.e(v40Var);
    }

    @Override // defpackage.j7a
    public void g() {
        v40.e((v40) this.b);
    }

    @Override // defpackage.qz4, defpackage.vz4
    public void i(int i) {
        switch (this.a) {
            case 16:
                tz4.a((tz4) this.b, false, i * 10);
                break;
            default:
                w9a w9aVar = (w9a) this.b;
                w9aVar.d.c = 0;
                w9a.L0(w9aVar, false, i * 10);
                break;
        }
    }

    @Override // defpackage.iee
    public boolean j() {
        for (iee ieeVar : (iee[]) this.b) {
            if (ieeVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hdh
    public int m() {
        g2h g2hVar = ((GifViewerWidget) this.b).s0;
        if (g2hVar != null) {
            return g2hVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.j7a
    public void n() {
        v40.e((v40) this.b);
    }

    @Override // defpackage.iee
    public long o() {
        long jMin = Long.MAX_VALUE;
        for (iee ieeVar : (iee[]) this.b) {
            long jO = ieeVar.o();
            if (jO != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jO);
            }
        }
        if (jMin == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        synchronized (((p52) this.b).a) {
            try {
                ((p52) this.b).d.q();
                int iV = az1.v(((p52) this.b).i);
                if ((iV == 3 || iV == 5 || iV == 6) && !(th instanceof CancellationException)) {
                    gri.j("CaptureSession", "Opening session with fail ".concat(wy1.w(((p52) this.b).i)), th);
                    ((p52) this.b).d();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.hdh
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).a;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.iee
    public void p(long j) {
        for (iee ieeVar : (iee[]) this.b) {
            ieeVar.p(j);
        }
    }

    @Override // defpackage.bc8
    public void q(ec8 ec8Var, long j, long j2, boolean z) {
        ((sd4) this.b).w((zmb) ec8Var, j2);
    }

    @Override // defpackage.j7a
    public void r() {
        v40.e((v40) this.b);
    }

    @Override // defpackage.xe
    public fs3 s(ywf ywfVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new kk4(13);
        }
        return new fs3(animatedFactoryV2Impl.g, ywfVar, rect, animatedFactoryV2Impl.d);
    }

    @Override // defpackage.oj1
    public PointF t() {
        PointF pointFT;
        qj1 qj1Var = (qj1) this.b;
        oj1 applicationPipDepended = qj1Var.getApplicationPipDepended();
        return (applicationPipDepended == null || (pointFT = applicationPipDepended.t()) == null) ? mfh.e(qj1Var.getContext()) : pointFT;
    }

    @Override // defpackage.j7a
    public void u(long j) {
        v40 v40Var = (v40) this.b;
        ((b8a) v40Var.a).q();
        v40.e(v40Var);
    }

    @Override // defpackage.j7a
    public void w() {
        v40.e((v40) this.b);
    }

    @Override // defpackage.bc8
    public void x(ec8 ec8Var, long j, long j2) {
        long j3;
        zmb zmbVar = (zmb) ec8Var;
        sd4 sd4Var = (sd4) this.b;
        long j4 = zmbVar.a;
        ze4 ze4Var = zmbVar.b;
        zdf zdfVar = zmbVar.d;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        sd4Var.m.getClass();
        sd4Var.q.N(ub8Var, zmbVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        ad4 ad4Var = (ad4) zmbVar.X;
        ad4 ad4Var2 = sd4Var.H;
        int size = ad4Var2 == null ? 0 : ad4Var2.m.size();
        long j5 = ad4Var.b(0).b;
        int i = 0;
        while (i < size && sd4Var.H.b(i).b < j5) {
            i++;
        }
        if (ad4Var.d) {
            if (size - i > ad4Var.m.size()) {
                a8i.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j6 = sd4Var.N;
                j3 = -9223372036854775807L;
                if (j6 == -9223372036854775807L || ad4Var.h * 1000 > j6) {
                    sd4Var.M = 0;
                } else {
                    a8i.l("DashMediaSource", "Loaded stale dynamic manifest: " + ad4Var.h + ", " + sd4Var.N);
                }
            }
            int i2 = sd4Var.M;
            sd4Var.M = i2 + 1;
            if (i2 < sd4Var.m.q(zmbVar.c)) {
                sd4Var.D.postDelayed(sd4Var.v, Math.min((sd4Var.M - 1) * 1000, 5000));
                return;
            } else {
                sd4Var.C = new DashManifestStaleException();
                return;
            }
        }
        j3 = -9223372036854775807L;
        sd4Var.H = ad4Var;
        sd4Var.I = ad4Var.d & sd4Var.I;
        sd4Var.J = j - j2;
        sd4Var.K = j;
        sd4Var.O += i;
        synchronized (sd4Var.t) {
            if (zmbVar.b.a.equals(sd4Var.F)) {
                Uri uriB = sd4Var.H.k;
                if (uriB == null) {
                    uriB = s4j.b(zmbVar.d.c);
                }
                sd4Var.F = uriB;
            }
        }
        ad4 ad4Var3 = sd4Var.H;
        if (!ad4Var3.d || sd4Var.L != j3) {
            sd4Var.y(true);
            return;
        }
        wib wibVar = ad4Var3.i;
        if (wibVar == null) {
            sd4Var.v();
            return;
        }
        String str = (String) wibVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                sd4Var.L = zxg.X((String) wibVar.c) - sd4Var.K;
                sd4Var.y(true);
                return;
            } catch (ParserException e) {
                sd4Var.x(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            sd4Var.z(wibVar, new pd4());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            sd4Var.z(wibVar, new uha(17));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            sd4Var.v();
        } else {
            sd4Var.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // defpackage.iee
    public boolean z(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (iee ieeVar : (iee[]) this.b) {
                long jD2 = ieeVar.d();
                boolean z3 = jD2 != Long.MIN_VALUE && jD2 <= j;
                if (jD2 == jD || z3) {
                    z |= ieeVar.z(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public /* synthetic */ kce(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public kce(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = 0;
        this.b = oneMeRoomDatabase;
        new ai(oneMeRoomDatabase, 23);
    }

    public kce() {
        this.a = 18;
        this.b = (ExtraSupportedSurfaceCombinationsQuirk) rv4.a.e(ExtraSupportedSurfaceCombinationsQuirk.class);
    }

    public kce(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.a = 8;
        if (Build.VERSION.SDK_INT >= 28) {
            this.b = new z02(cameraCaptureSession, null);
        } else {
            this.b = new i5i(cameraCaptureSession, new a12(handler));
        }
    }
}
