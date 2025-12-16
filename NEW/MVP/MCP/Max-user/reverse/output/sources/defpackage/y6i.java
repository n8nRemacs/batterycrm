package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Range;
import android.view.View;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import one.me.calls.ui.ui.call.CallScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public class y6i implements mv, grf, zua, m91, ft1, rn6, hof, g42, qp5, ac8, gu3, nva {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y6i(int i, Object obj) {
        this.a = i;
        this.b = obj;
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
        rd4Var.L = ((Long) ymbVar.X).longValue() - j;
        rd4Var.s(true);
    }

    public ti1 B(int i) {
        nt1 nt1Var = (nt1) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (nt1Var != null) {
            return nt1Var.b;
        }
        return null;
    }

    @Override // defpackage.ac8
    public y21 D(dc8 dc8Var, long j, long j2, IOException iOException, int i) {
        ymb ymbVar = (ymb) dc8Var;
        rd4 rd4Var = (rd4) this.b;
        qr4 qr4Var = rd4Var.q;
        long j3 = ymbVar.a;
        ye4 ye4Var = ymbVar.b;
        ydf ydfVar = ymbVar.d;
        qr4Var.i(new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b), ymbVar.c, iOException, true);
        rd4Var.n.getClass();
        pai.c("DashMediaSource", "Failed to resolve time offset.", iOException);
        rd4Var.s(true);
        return hc8.X;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        vs0 vs0Var = (vs0) this.b;
        us0 us0Var = vs0Var.x0;
        if (us0Var != null) {
            vs0Var.X.W.remove(us0Var);
        }
        us0 us0Var2 = new us0(vs0Var.s0, g4iVar);
        vs0Var.x0 = us0Var2;
        us0Var2.e(vs0Var.getWindow());
        BottomSheetBehavior bottomSheetBehavior = vs0Var.X;
        us0 us0Var3 = vs0Var.x0;
        ArrayList arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(us0Var3)) {
            arrayList.add(us0Var3);
        }
        return g4iVar;
    }

    @Override // defpackage.mv
    public void L(long j, List list) throws Throwable {
        ((mk3) this.b).makeCompleting$kotlinx_coroutines_core(list);
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 8:
                d86 d86Var = (d86) obj;
                if (d86Var != null) {
                    boolean z = d86Var.a;
                    gri.a("CameraController", "Tap to focus onSuccess: " + z);
                    ((w12) this.b).z.i(Integer.valueOf(z ? 2 : 3));
                    break;
                }
                break;
            default:
                break;
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) throws Throwable {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                List<e35> list = (List) obj;
                f35 f35Var = (f35) obj2;
                wqi.c(f35.g, "startUploads: count = " + list.size(), new Object[0]);
                for (e35 e35Var : list) {
                    kz4 kz4Var = f35Var.c;
                    yy7 yy7Var = f35.f[1];
                    g5i g5iVar = ((lv5) kz4Var.get()).a;
                    y25 y25Var = e35Var.a;
                    long j = y25Var.a;
                    String str = y25Var.b;
                    String strE = a9h.e("UploadDraftMediaWorker/", j, ":", str);
                    ngb ngbVar = (ngb) ((ngb) ((ngb) new ngb(UploadDraftMediaWorker.class).setConstraints(new bu3(2, false, false, false, false, -1L, -1L, ue3.h0(new LinkedHashSet())))).setExpedited(ujb.a)).setBackoffCriteria(eg0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
                    HashMap map = new HashMap();
                    map.put("workName", strE);
                    map.put(ApiProtocol.PARAM_CHAT_ID, Long.valueOf(j));
                    map.put("attachLocalId", str);
                    map.put("draft.path", e35Var.b);
                    map.put("draft.lastModified", Long.valueOf(e35Var.c));
                    map.put("draft.uploadType", e35Var.d.name());
                    p2h p2hVar = e35Var.e;
                    if (p2hVar != null) {
                        map.put("draft.videoConvertOptions", Boolean.TRUE);
                        map.put("draft.videoConvertOptions.quality", p2hVar.a.name());
                        map.put("draft.videoConvertOptions.startTrimPosition", Float.valueOf(p2hVar.b));
                        map.put("draft.videoConvertOptions.endTrimPosition", Float.valueOf(p2hVar.c));
                        map.put("draft.videoConvertOptions.mute", Boolean.valueOf(p2hVar.d));
                    }
                    yd4 yd4Var = new yd4(map);
                    yd4.f(yd4Var);
                    g5iVar.b(strE, uk5.b, (ogb) ((ngb) ngbVar.setInputData(yd4Var)).build()).c();
                }
                break;
            case 18:
                Objects.requireNonNull(obj, "value is null");
                wp7 wp7Var = (wp7) ((y6i) obj2).b;
                wp7Var.d.f(wp7Var);
                wp7Var.l.compareAndSet(true, false);
                break;
            case 20:
                wp7 wp7Var2 = (wp7) obj2;
                wp7Var2.d.f(wp7Var2);
                wp7Var2.l.compareAndSet(true, false);
                break;
            default:
                ((dlb) obj2).f.invoke("error occurred: " + ((Throwable) obj));
                break;
        }
    }

    @Override // defpackage.hof
    public int e(long j) {
        return j < 0 ? 0 : -1;
    }

    public m5 f(int i) {
        return null;
    }

    @Override // defpackage.hof
    public long g(int i) {
        hsi.b(i == 0);
        return 0L;
    }

    @Override // defpackage.grf
    public Object get() {
        int iD;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                g90 g90Var = (g90) obj;
                int iA = usi.a(g90Var);
                int iB = usi.b(g90Var);
                int i2 = g90Var.e;
                if (i2 == -1) {
                    gri.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
                    i2 = 1;
                } else {
                    gri.a("DefAudioResolver", "Using supplied AUDIO channel count: " + i2);
                }
                Range range = g90Var.d;
                if (g90.g.equals(range)) {
                    gri.a("DefAudioResolver", "Using fallback AUDIO sample rate: 44100Hz");
                    iD = 44100;
                } else {
                    iD = usi.d(range, i2, iB, ((Integer) range.getUpper()).intValue());
                    gri.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + iD + "Hz");
                }
                List list = f90.e;
                fde fdeVar = new fde();
                fdeVar.a = -1;
                fdeVar.b = -1;
                fdeVar.c = -1;
                fdeVar.d = -1;
                fdeVar.a = Integer.valueOf(iA);
                fdeVar.d = Integer.valueOf(iB);
                fdeVar.c = Integer.valueOf(i2);
                fdeVar.b = Integer.valueOf(iD);
                return fdeVar.c();
            default:
                return new x94((Context) ((tl4) obj).a, new iwf(), new nwf());
        }
    }

    @Override // defpackage.ft1
    public void i(zi1 zi1Var) {
        tq1 tq1Var = ((vq1) this.b).X0;
        if (tq1Var != null) {
            ((bm1) tq1Var).i(zi1Var);
        }
    }

    @Override // defpackage.ft1
    public void j(zi1 zi1Var, Point point) {
        zi1 zi1Var2;
        tq1 tq1Var;
        vq1 vq1Var = (vq1) this.b;
        xib xibVar = vq1Var.V0;
        if (xibVar == null || (zi1Var2 = xibVar.c) == null || (tq1Var = vq1Var.X0) == null) {
            return;
        }
        CallScreen callScreen = ((bm1) tq1Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.H0().C(zi1Var2, null);
    }

    @Override // defpackage.ft1
    public void k(zi1 zi1Var) {
        tq1 tq1Var = ((vq1) this.b).X0;
        if (tq1Var != null) {
            CallScreen callScreen = ((bm1) tq1Var).a;
            rha rhaVar = CallScreen.N0;
            callScreen.H0().Z.f(zi1Var);
        }
    }

    public void l(z8 z8Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i = z8Var.a;
        if (i == 1) {
            recyclerView.A0.f0(z8Var.b, z8Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.A0.i0(z8Var.b, z8Var.d);
        } else if (i == 4) {
            recyclerView.A0.k0(recyclerView, z8Var.b, z8Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.A0.h0(z8Var.b, z8Var.d);
        }
    }

    @Override // defpackage.hof
    public List m(long j) {
        return j >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    public m5 n(int i) {
        return null;
    }

    @Override // defpackage.g42
    public void o(Typeface typeface) {
        ne3 ne3Var = (ne3) this.b;
        if (ne3Var.m(typeface)) {
            ne3Var.i(false);
        }
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        ((lwd) this.b).resumeWith(new ipd(exc));
    }

    @Override // defpackage.ft1
    public void p(zi1 zi1Var) {
        tq1 tq1Var = ((vq1) this.b).X0;
        if (tq1Var != null) {
            CallScreen callScreen = ((bm1) tq1Var).a;
            rha rhaVar = CallScreen.N0;
            wo1 wo1VarH0 = callScreen.H0();
            vc1 vc1VarW = wo1VarH0.w();
            Map map = (Map) wo1VarH0.B0.getValue();
            boolean z = vc1VarW.g;
            boolean z2 = vc1VarW.m;
            zi1 zi1Var2 = ((bt1) wo1VarH0.w0.a.getValue()).b;
            Object obj = null;
            if (z) {
                zi1Var2 = null;
            } else if (z2) {
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!fni.a((zi1) next, zi1Var2)) {
                        obj = next;
                        break;
                    }
                }
                zi1Var2 = (zi1) obj;
            }
            wo1VarH0.c.j(zi1Var2);
        }
    }

    @Override // defpackage.ft1
    public void q() {
        tq1 tq1Var = ((vq1) this.b).X0;
        if (tq1Var != null) {
            CallScreen callScreen = ((bm1) tq1Var).a;
            rha rhaVar = CallScreen.N0;
            callScreen.H0().Z.h();
        }
    }

    @Override // defpackage.ac8
    public void r(dc8 dc8Var, long j, long j2, boolean z) {
        ((rd4) this.b).r((ymb) dc8Var, j, j2);
    }

    @Override // defpackage.hof
    public int s() {
        return 1;
    }

    public mid t(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.s0.O();
        int i2 = 0;
        mid midVar = null;
        while (true) {
            if (i2 >= iO) {
                break;
            }
            mid midVarU = RecyclerView.U(recyclerView.s0.N(i2));
            if (midVarU != null && !midVarU.q() && midVarU.c == i) {
                if (!((ArrayList) recyclerView.s0.X).contains(midVarU.a)) {
                    midVar = midVarU;
                    break;
                }
                midVar = midVarU;
            }
            i2++;
        }
        if (midVar != null) {
            if (!((ArrayList) recyclerView.s0.X).contains(midVar.a)) {
                return midVar;
            }
            if (RecyclerView.L1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void u(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.s0.O();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iO; i6++) {
            View viewN = recyclerView.s0.N(i6);
            mid midVarU = RecyclerView.U(viewN);
            if (midVarU != null && !midVarU.x() && (i4 = midVarU.c) >= i && i4 < i5) {
                midVarU.e(2);
                if (obj == null) {
                    midVarU.e(1024);
                } else if ((1024 & midVarU.t0) == 0) {
                    if (midVarU.u0 == null) {
                        ArrayList arrayList = new ArrayList();
                        midVarU.u0 = arrayList;
                        midVarU.v0 = Collections.unmodifiableList(arrayList);
                    }
                    midVarU.u0.add(obj);
                }
                ((xhd) viewN.getLayoutParams()).c = true;
            }
        }
        did didVar = recyclerView.c;
        for (int size = didVar.c.size() - 1; size >= 0; size--) {
            mid midVar = (mid) didVar.c.get(size);
            if (midVar != null && (i3 = midVar.c) >= i && i3 < i5) {
                midVar.e(2);
                didVar.g(size);
            }
        }
        recyclerView.v1 = true;
    }

    public void v() {
        ((ei6) this.b).X.R();
    }

    public void w(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.s0.O();
        for (int i3 = 0; i3 < iO; i3++) {
            mid midVarU = RecyclerView.U(recyclerView.s0.N(i3));
            if (midVarU != null && !midVarU.x() && midVarU.c >= i) {
                if (RecyclerView.L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + midVarU + " now at position " + (midVarU.c + i2));
                }
                midVarU.u(i2, false);
                recyclerView.r1.g = true;
            }
        }
        did didVar = recyclerView.c;
        int size = didVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            mid midVar = (mid) didVar.c.get(i4);
            if (midVar != null && midVar.c >= i) {
                if (RecyclerView.L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + midVar + " now at position " + (midVar.c + i2));
                }
                midVar.u(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.u1 = true;
    }

    public void x(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int iO = recyclerView.s0.O();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < iO; i11++) {
            mid midVarU = RecyclerView.U(recyclerView.s0.N(i11));
            if (midVarU != null && (i10 = midVarU.c) >= i4 && i10 <= i3) {
                if (RecyclerView.L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + midVarU);
                }
                if (midVarU.c == i) {
                    midVarU.u(i2 - i, false);
                } else {
                    midVarU.u(i5, false);
                }
                recyclerView.r1.g = true;
            }
        }
        did didVar = recyclerView.c;
        didVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        int size = didVar.c.size();
        int i12 = 0;
        while (i12 < size) {
            mid midVar = (mid) didVar.c.get(i12);
            if (midVar != null && (i9 = midVar.c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    midVar.u(i2 - i, z);
                } else {
                    midVar.u(i8, z);
                }
                if (RecyclerView.L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + midVar);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.u1 = true;
    }

    public void y(Exception exc) {
        a8i.h("MediaCodecAudioRenderer", "Audio sink error", exc);
        xo8 xo8Var = ((mw8) this.b).P1;
        Handler handler = (Handler) xo8Var.b;
        if (handler != null) {
            handler.post(new q50(xo8Var, exc, 1));
        }
    }

    public boolean z(int i, int i2, Bundle bundle) {
        return false;
    }

    public y6i(int i) {
        this.a = i;
        switch (i) {
            case 22:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = new n5(this);
                break;
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 8:
                if (th instanceof CameraControl$OperationCanceledException) {
                    gri.a("CameraController", "Tap-to-focus is canceled by new action.");
                    break;
                } else {
                    if (gri.d(3, "CameraController")) {
                        Log.d("CameraController", "Tap to focus failed.", th);
                    }
                    ((w12) this.b).z.i(4);
                    break;
                }
            default:
                bf5 bf5Var = (bf5) ((r5j) this.b).b;
                if (th instanceof MediaCodec.CodecException) {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    bf5Var.b(1, codecException.getMessage(), codecException);
                    break;
                } else {
                    bf5Var.b(0, th.getMessage(), th);
                    break;
                }
        }
    }
}
