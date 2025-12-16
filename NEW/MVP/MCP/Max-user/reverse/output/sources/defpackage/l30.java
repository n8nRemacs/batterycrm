package defpackage;

import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.devmenu.DevMenuScreen;
import org.apache.http.util.LangUtils;
import org.webrtc.HardwareVideoEncoder;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class l30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l30(ViewPager2 viewPager2, int i, DevMenuScreen devMenuScreen) {
        this.a = 8;
        this.c = viewPager2;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View childAt;
        ScheduledFuture scheduledFuture;
        bf5 bf5Var;
        n22 n22VarC;
        int i = 4;
        switch (this.a) {
            case 0:
                m30 m30Var = (m30) this.c;
                int i2 = this.b;
                n30 n30Var = m30Var.b;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        n30Var.b(3);
                        return;
                    }
                    xl5 xl5Var = n30Var.c;
                    if (xl5Var != null) {
                        dm5 dm5Var = xl5Var.a;
                        boolean zI = dm5Var.i();
                        dm5Var.a1(0, zI ? 2 : 1, zI);
                    }
                    n30Var.b(2);
                    return;
                }
                if (i2 == -1) {
                    xl5 xl5Var2 = n30Var.c;
                    if (xl5Var2 != null) {
                        dm5 dm5Var2 = xl5Var2.a;
                        boolean zI2 = dm5Var2.i();
                        dm5Var2.a1(-1, zI2 ? 2 : 1, zI2);
                    }
                    n30Var.a();
                    return;
                }
                if (i2 != 1) {
                    az1.s("Unknown focus change type: ", 38, i2, "AudioFocusManager");
                    return;
                }
                n30Var.b(1);
                xl5 xl5Var3 = n30Var.c;
                if (xl5Var3 != null) {
                    dm5 dm5Var3 = xl5Var3.a;
                    dm5Var3.a1(1, 1, dm5Var3.i());
                    return;
                }
                return;
            case 1:
                xo8 xo8Var = (xo8) this.c;
                int i3 = this.b;
                yl5 yl5Var = (yl5) xo8Var.c;
                String str = zxg.a;
                a9 a9Var = yl5Var.a.P0;
                cj4 cj4Var = new cj4(i3, i);
                a9Var.getClass();
                hsi.g(Looper.myLooper() == ((wwf) a9Var.c).a.getLooper());
                a9Var.a++;
                a9Var.D(new ud(a9Var, 14, cj4Var));
                a9Var.J(Integer.valueOf(i3));
                return;
            case 2:
                iv0 iv0Var = (iv0) this.c;
                int i4 = this.b;
                int i5 = iv0Var.l;
                if (i5 == i4) {
                    return;
                }
                int i6 = iv0Var.h;
                iv0Var.l = (i4 / i6) * i6;
                StringBuilder sbM = ho7.m(i5, "Update buffer size from ", " to ");
                sbM.append(iv0Var.l);
                gri.a("BufferedAudioStream", sbM.toString());
                return;
            case 3:
                CallServiceImpl callServiceImpl = (CallServiceImpl) this.c;
                int i7 = this.b;
                zo1 zo1Var = CallServiceImpl.u0;
                if (((hw1) callServiceImpl.c()).t()) {
                    return;
                }
                cge.a(callServiceImpl, 1);
                callServiceImpl.stopSelfResult(i7);
                return;
            case 4:
                ((k02) this.c).a(this.b);
                return;
            case 5:
                ((w12) this.c).b = this.b;
                return;
            case 6:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                int i8 = this.b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    awf awfVar = (awf) it.next();
                    if (i8 == 5) {
                        synchronized (awfVar.p) {
                            try {
                                if (awfVar.m() && awfVar.q != null) {
                                    awfVar.l("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it2 = awfVar.q.iterator();
                                    while (it2.hasNext()) {
                                        ((zr4) it2.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        awfVar.getClass();
                    }
                }
                return;
            case 7:
                uh4 uh4Var = (uh4) this.c;
                int i9 = this.b;
                VpxDecoderWrapper vpxDecoderWrapper = uh4Var.a;
                vpxDecoderWrapper.init(VpxDecoderWrapper.DecoderKind.values()[az1.v(i9)]);
                vpxDecoderWrapper.setFrameHandler(uh4Var);
                vpxDecoderWrapper.setErrorCallback(uh4Var);
                vpxDecoderWrapper.setDesiredFps(10);
                return;
            case 8:
                ViewPager2 viewPager2 = (ViewPager2) this.c;
                int i10 = this.b;
                phd adapter = viewPager2.getAdapter();
                int iJ = adapter != null ? adapter.j() : 0;
                for (int i11 = 0; i11 < iJ; i11++) {
                    if (i11 != i10) {
                        View childAt2 = viewPager2.getChildAt(0);
                        RecyclerView recyclerView = childAt2 instanceof RecyclerView ? (RecyclerView) childAt2 : null;
                        if (recyclerView != null && (childAt = recyclerView.getChildAt(i11)) != null) {
                            DevMenuScreen.y0(childAt);
                        }
                    }
                }
                return;
            case 9:
                ye5 ye5Var = (ye5) this.c;
                int i12 = this.b;
                bf5 bf5Var2 = ye5Var.k;
                if (ye5Var.j) {
                    gri.i(bf5Var2.a, "Receives input frame after codec is reset.");
                    return;
                }
                switch (az1.v(bf5Var2.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bf5Var2.k.offer(Integer.valueOf(i12));
                        bf5Var2.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(bf5Var2.D)));
                }
            case 10:
                ((yf5) this.c).N0(this.b + 1);
                return;
            case 11:
                ((HardwareVideoEncoder) this.c).lambda$deliverEncodedImage$0(this.b);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ly8 ly8Var = (ly8) this.c;
                int i13 = this.b;
                xs xsVar = ly8Var.j;
                xsVar.remove(Integer.valueOf(i13));
                tje tjeVar = ly8Var.l;
                if (tjeVar == null || tjeVar.a.e() >= 5 || !xsVar.isEmpty()) {
                    return;
                }
                ly8Var.k.postDelayed(new gy8(ly8Var, i), 500L);
                return;
            case 13:
                ((ik9) this.c).h(this.b);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bhd bhdVar = (bhd) this.c;
                int i14 = this.b;
                int i15 = bhdVar.f0;
                bhdVar.f0 = i14;
                if (i15 == i14) {
                    gri.a("Recorder", "Video source transitions to the same state: ".concat(a9h.q(i14)));
                    return;
                }
                gri.a("Recorder", "Video source has transitioned to state: ".concat(a9h.q(i14)));
                if (i14 != 3) {
                    if (i14 != 2 || (scheduledFuture = bhdVar.X) == null || !scheduledFuture.cancel(false) || (bf5Var = bhdVar.E) == null) {
                        return;
                    }
                    bhd.r(bf5Var);
                    return;
                }
                if (bhdVar.A != null) {
                    bhdVar.Y = true;
                    gb0 gb0Var = bhdVar.p;
                    if (gb0Var == null || gb0Var.v0) {
                        return;
                    }
                    bhdVar.s(gb0Var, 4, null);
                    return;
                }
                mw4 mw4Var = bhdVar.d0;
                if (mw4Var != null) {
                    if (!mw4Var.b) {
                        mw4Var.b = true;
                        ScheduledFuture scheduledFuture2 = (ScheduledFuture) mw4Var.f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            mw4Var.f = null;
                        }
                    }
                    bhdVar.d0 = null;
                }
                bhdVar.v(false);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((f8j) this.c).b(this.b);
                return;
            case 16:
                atd atdVar = (atd) this.c;
                int i16 = this.b;
                if (atdVar.c.get()) {
                    o38 o38Var = (o38) atdVar.a.b;
                    dd7 dd7Var = o38Var.h;
                    if (dd7Var.B(i16) && (n22VarC = dd7Var.c()) != null) {
                        dd7Var.p.b = dd7Var.h(n22VarC, false);
                    }
                    ee7 ee7Var = o38Var.e;
                    int iK = ee7Var.k();
                    if (ee7Var.B(i16) && ee7Var.t != null) {
                        ee7Var.t = pfi.c(Math.abs(sxi.b(i16) - sxi.b(iK)), ee7Var.t);
                    }
                    s1h s1hVar = o38Var.i;
                    if (s1hVar.B(i16)) {
                        s1hVar.P();
                        return;
                    }
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                int i17 = this.b;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.A(i17, view, false);
                    return;
                }
                return;
            default:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
        }
    }

    public /* synthetic */ l30(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
