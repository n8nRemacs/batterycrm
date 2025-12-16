package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.Image;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.media3.common.VideoFrameProcessingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.photo.PhotoViewerWidget;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public class h08 implements mp, j7a, uj0, gu3, v2f, y34, hee, d4h, gvb {
    public static final Object c = new Object();
    public static h08 d;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h08(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static h08 J() {
        h08 h08Var;
        synchronized (c) {
            try {
                if (d == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    d = new h08(handlerThread.getLooper());
                }
                h08Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h08Var;
    }

    public static ybj P(Callable callable) {
        n2g n2gVar = new n2g();
        spi.a.execute(new c5e(callable, 12, n2gVar));
        return n2gVar.a;
    }

    public static d5c Q(uch uchVar) {
        return new d5c(Collections.singletonList(uchVar));
    }

    @Override // defpackage.j7a
    public void A() {
        e40.f((e40) this.b);
    }

    @Override // defpackage.y34
    public y34 B(View view) {
        Bundle bundle = (Bundle) this.b;
        if (view.getId() == -1) {
            throw new IllegalStateException("Check failed.");
        }
        bundle.putInt("anchor_id", view.getId());
        bundle.putSerializable("anchor_class", view.getClass());
        return this;
    }

    @Override // defpackage.mp
    public void C(int i) {
    }

    @Override // defpackage.y34
    public y34 D() {
        ((Bundle) this.b).putBoolean("dim", true);
        return this;
    }

    @Override // defpackage.gvb
    public void E() {
        PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
        yy7[] yy7VarArr = PhotoViewerWidget.o;
        photoViewerWidget.B0().J(photoViewerWidget.z0(), photoViewerWidget.y0());
    }

    @Override // defpackage.d4h
    public void F(float f) {
        ((f7a) this.b).f.execute(new pt0(this, f, 1));
    }

    @Override // defpackage.y34
    public y34 G(s5g s5gVar) {
        ((Bundle) this.b).putParcelable("header", s5gVar);
        return this;
    }

    @Override // defpackage.mp
    public void H(int i, float f) {
    }

    public ByteBuffer I() {
        return ((Image.Plane) this.b).getBuffer();
    }

    public int K() {
        return ((Image.Plane) this.b).getPixelStride();
    }

    @Override // defpackage.d4h
    public void L() {
        ((f7a) this.b).b();
    }

    public int M() {
        return ((Image.Plane) this.b).getRowStride();
    }

    public void N() {
        u47 u47Var = (u47) this.b;
        int i = u47Var.B0 - 1;
        u47Var.B0 = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (i67 i67Var : u47Var.D0) {
            i67Var.e();
            i2 += i67Var.S0.a;
        }
        lfg[] lfgVarArr = new lfg[i2];
        int i3 = 0;
        for (i67 i67Var2 : u47Var.D0) {
            i67Var2.e();
            int i4 = i67Var2.S0.a;
            int i5 = 0;
            while (i5 < i4) {
                i67Var2.e();
                lfgVarArr[i3] = i67Var2.S0.a(i5);
                i5++;
                i3++;
            }
        }
        u47Var.C0 = new nfg(lfgVarArr);
        u47Var.A0.i(u47Var);
    }

    @Override // defpackage.d4h
    public void O() {
        ((f7a) this.b).f.execute(new gq5(24, this));
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        ((rk3) this.b).b();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 9:
                Throwable th = (Throwable) obj;
                l92 l92Var = (l92) this.b;
                wqi.e(l92Var.Y, "onUploadFailed: failed", th);
                a3g a3gVarQ = l92Var.q();
                long j = l92Var.b;
                a3gVarQ.d(j);
                long j2 = l92Var.d;
                if (j2 != 0) {
                    pb2 pb2VarM = l92Var.b().M(j2);
                    if (pb2VarM != null) {
                        l92Var.b().g0(j2, bf2.b);
                        l92Var.a().f(pb2VarM.b.a);
                    }
                } else {
                    ige igeVar = l92Var.a;
                    if (igeVar == null) {
                        igeVar = null;
                    }
                    ((qv3) igeVar.i.getValue()).d(0L, null, null);
                    long jS = ((w4e) l92Var.i()).s();
                    if (jS > 0) {
                        hwa hwaVarA = l92Var.a();
                        hwa.q(hwaVarA, new hx3(hwaVarA.t().a.k(), new long[]{jS}, 0));
                    }
                }
                l92Var.r().c(new rj0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pzf("internal-error", th.toString(), null)));
                break;
            default:
                wqi.e(((gr9) this.b).b, "postProcessText: failed", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.y34
    public y34 b() {
        Bundle bundle = (Bundle) this.b;
        Rect rect = t27.b;
        bundle.putParcelable("highlight_padding", t27.b);
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.y34
    public z34 build() {
        return new ContextMenuPopupWindow(new Bundle((Bundle) this.b));
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        ((rk3) this.b).c(py4Var);
    }

    @Override // defpackage.d4h
    public void d(VideoFrameProcessingException videoFrameProcessingException) {
        f7a f7aVar = (f7a) this.b;
        f7aVar.f.execute(new k79(f7aVar, 9, videoFrameProcessingException));
    }

    @Override // defpackage.j7a
    public void e() {
        e40.f((e40) this.b);
    }

    @Override // defpackage.y34
    public y34 f() {
        Bundle bundle = (Bundle) this.b;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    @Override // defpackage.j7a
    public void g() {
        e40.f((e40) this.b);
    }

    @Override // defpackage.y34
    public y34 h(Rect rect, float f) {
        Bundle bundle = (Bundle) this.b;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.y34
    public y34 j() {
        ((Bundle) this.b).putBoolean("dark_theme", true);
        return this;
    }

    @Override // defpackage.gvb
    public void k() {
        PhotoViewerWidget photoViewerWidget = (PhotoViewerWidget) this.b;
        yy7[] yy7VarArr = PhotoViewerWidget.o;
        photoViewerWidget.B0().L(photoViewerWidget.z0(), photoViewerWidget.y0());
    }

    @Override // defpackage.d4h
    public void l(int i, int i2) {
        ((f7a) this.b).f.execute(new vu0(this, i, i2, 2));
    }

    @Override // defpackage.gvb
    public void m() {
        Object targetController = ((PhotoViewerWidget) this.b).getTargetController();
        ivb ivbVar = targetController instanceof ivb ? (ivb) targetController : null;
        if (ivbVar != null) {
            ((ChatMediaViewerScreen) ivbVar).T0();
        }
    }

    @Override // defpackage.j7a
    public void n() {
        e40.f((e40) this.b);
    }

    @Override // defpackage.y34
    public y34 o(Collection collection) {
        ((Bundle) this.b).putBundle("actions", g6j.a(collection));
        return this;
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        ((rk3) this.b).onError(th);
    }

    @Override // defpackage.d4h
    public void p(long j, boolean z) {
        if (j == 0) {
            ((f7a) this.b).u = true;
        }
        f7a f7aVar = (f7a) this.b;
        f7aVar.t = j;
        f7aVar.f.execute(new c7a(this, j, z, 0));
    }

    @Override // defpackage.y34
    public y34 q(float f, float f2) {
        Bundle bundle = (Bundle) this.b;
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalStateException("Check failed.");
        }
        bundle.putFloat("x", f);
        bundle.putFloat("y", f2);
        return this;
    }

    @Override // defpackage.j7a
    public void r() {
        e40.f((e40) this.b);
    }

    @Override // defpackage.hee
    public void s(jee jeeVar) {
        u47 u47Var = (u47) this.b;
        u47Var.A0.s(u47Var);
    }

    @Override // defpackage.mp
    public void t(int i) {
    }

    @Override // defpackage.j7a
    public void u(long j) {
        e40.f((e40) this.b);
    }

    @Override // defpackage.y34
    public y34 v(float f) {
        Bundle bundle = (Bundle) this.b;
        Rect rect = t27.b;
        bundle.putParcelable("highlight_padding", t27.b);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    @Override // defpackage.j7a
    public void w() {
        e40.f((e40) this.b);
    }

    @Override // defpackage.y34
    public y34 x(Bundle bundle) {
        ((Bundle) this.b).putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    @Override // defpackage.uj0
    public void y(es3 es3Var) {
        jze jzeVar = (jze) this.b;
        if (es3Var.b == 0) {
            jzeVar.k(null, jzeVar.G0);
            return;
        }
        w7c w7cVar = jzeVar.y0;
        if (w7cVar != null) {
            ((wv6) w7cVar.a).i(es3Var);
        }
    }

    @Override // defpackage.y34
    public y34 z() {
        ((Bundle) this.b).putBoolean("default_spaces", true);
        return this;
    }

    public /* synthetic */ h08(int i, boolean z) {
        this.a = i;
    }

    public h08(Looper looper) {
        this.a = 1;
        y1a y1aVar = new y1a(looper, 4, false);
        Looper.getMainLooper();
        this.b = y1aVar;
    }

    public h08(Context context) {
        this.a = 16;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setId(uab.a);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        gr6 gr6Var = (gr6) oneMeDraweeView.getHierarchy();
        int i = tab.a;
        tyd tydVar = tyd.d;
        gr6Var.i(gr6Var.b.getDrawable(i), 1);
        qyd qydVarF = gr6Var.f(1);
        if (!yyi.b(qydVarF.o, tydVar)) {
            qydVarF.o = tydVar;
            qydVarF.X = null;
            qydVarF.p();
            qydVarF.invalidateSelf();
        }
        this.b = oneMeDraweeView;
    }

    public h08(i17 i17Var) {
        this.a = 21;
        this.b = (IncorrectJpegMetadataQuirk) i17Var.e(IncorrectJpegMetadataQuirk.class);
    }

    public h08(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                this.b = new zl6(5, 1.0f, false, 0);
                break;
            case 23:
                this.b = (ExtraCroppingQuirk) rv4.a.e(ExtraCroppingQuirk.class);
                break;
            case 29:
                this.b = new wib(3);
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }
}
