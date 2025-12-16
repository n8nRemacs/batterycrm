package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.media3.common.PlaybackException;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.NativeLibraryLoader;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class i00 implements gu3, xgh, tm6, NativeLibraryLoader, lyf, yu, uu1, rl3, n4f, pa8, ra8, im4, lp5, lsf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i00(yp4 yp4Var, u75 u75Var) {
        this.a = 28;
        Map map = Collections.EMPTY_MAP;
        this.b = yp4Var;
        this.c = u75Var;
    }

    @Override // defpackage.im4
    public int a(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.b;
        gf3 gf3Var = (gf3) this.c;
        gf3Var.getClass();
        return ff5.h(mediaCodecInfo, str, gf3Var) ? 0 : Integer.MAX_VALUE;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                j00 j00Var = (j00) obj3;
                wqi.c("j00", "Attach downloaded", new Object[0]);
                j00Var.b.o((g00) obj2, (File) obj);
                j00Var.a.j(false);
                break;
            default:
                rv3 rv3Var = (rv3) obj;
                rv3Var.k = (yv3) obj3;
                rv3Var.i = (xv3) obj2;
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        x6i x6iVar = (x6i) this.b;
        gr0 gr0Var = (gr0) obj;
        gx3 gx3Var = (gx3) ((Map) this.c).get(Long.valueOf(gr0Var.a));
        if (gx3Var == null) {
            wqi.c("x6i", "prepareBotCommandItems, contactInfo is null, botId: %d", Long.valueOf(gr0Var.a));
            return new wr0(null, gr0Var.a, x6iVar.j(gr0Var, null), gr0Var.c);
        }
        return new wr0(m6g.b(gx3Var.v0), gr0Var.a, x6iVar.j(gr0Var, gx3Var), gr0Var.c);
    }

    @Override // defpackage.n4f
    public void b(int i) {
        DateTimePicker dateTimePicker = (DateTimePicker) this.b;
        bg4 bg4Var = (bg4) this.c;
        if (dateTimePicker.M0) {
            return;
        }
        xf4 xf4Var = (xf4) bg4Var.C(i);
        tf4 tf4Var = dateTimePicker.L0;
        if (tf4Var != null) {
            ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) tf4Var;
            wqi.c("ScheduledSendPickerViewModel", "day = " + xf4Var, new Object[0]);
            tcf tcfVar = scheduledSendPickerViewModel.e;
            lf4 lf4Var = (lf4) tcfVar.getValue();
            if (lf4Var == null || fni.a(lf4Var.a, xf4Var)) {
                return;
            }
            tcfVar.m(null, lf4.a(lf4Var, xf4Var, null, null, 6));
            scheduledSendPickerViewModel.f();
        }
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        ho4 ho4Var = (ho4) this.b;
        hf6 hf6Var = (hf6) this.c;
        return new gp5[]{ho4Var.c.f(hf6Var) ? new mof(ho4Var.c.x(hf6Var), null) : new go4(hf6Var)};
    }

    @Override // defpackage.ra8
    public void f(Object obj, a26 a26Var) {
        nj4 nj4Var = (nj4) this.b;
        u3c u3cVar = (u3c) this.c;
        jd jdVar = (jd) obj;
        SparseArray sparseArray = nj4Var.o;
        s7c s7cVar = new s7c();
        s7cVar.a = a26Var;
        SparseBooleanArray sparseBooleanArray = a26Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iB = a26Var.b(i);
            id idVar = (id) sparseArray.get(iB);
            idVar.getClass();
            sparseArray2.append(iB, idVar);
        }
        s7cVar.b = sparseArray2;
        jdVar.x(u3cVar, s7cVar);
    }

    @Override // defpackage.lsf
    public void g(vb0 vb0Var) {
        yp4 yp4Var = (yp4) this.b;
        eo6 eo6Var = (((msf) this.c).c.a() && vb0Var.d) ? eo6.c : eo6.b;
        tz4 tz4Var = yp4Var.a;
        ho6.d((AtomicBoolean) tz4Var.c, true);
        ho6.c((Thread) tz4Var.e);
        if (((eo6) tz4Var.n) != eo6Var) {
            tz4Var.n = eo6Var;
            tz4Var.v(tz4Var.b);
        }
    }

    @Override // defpackage.lyf
    public void h(iyf iyfVar, int i) {
        String strE;
        switch (this.a) {
            case 5:
                ab1 ab1Var = (ab1) this.b;
                neb nebVar = (neb) this.c;
                if (ab1Var.a.isEmpty()) {
                    return;
                }
                View view = iyfVar.b;
                meb mebVar = view instanceof meb ? (meb) view : null;
                cb1 cb1Var = (cb1) ab1Var.a.get(i);
                aya ayaVar = new aya(String.valueOf(cb1Var.a), nebVar.getContext().getString(cb1Var.b), i == nebVar.getSelectedTabPosition() ? 1 : 2, new xxa(0), null, null);
                if (mebVar != null) {
                    mebVar.setTabItem(ayaVar);
                    return;
                }
                meb mebVar2 = new meb(nebVar.getContext());
                mebVar2.setTabItem(ayaVar);
                iyfVar.b = mebVar2;
                kyf kyfVar = iyfVar.d;
                if (kyfVar != null) {
                    kyfVar.d();
                    return;
                }
                return;
            default:
                neb nebVar2 = (neb) this.b;
                ukd ukdVar = (ukd) this.c;
                int selectedTabPosition = nebVar2.getSelectedTabPosition();
                View view2 = iyfVar.b;
                meb mebVar3 = view2 instanceof meb ? (meb) view2 : null;
                dn2 dn2Var = (dn2) ((List) ukdVar.b).get(i);
                boolean z = i == selectedTabPosition;
                Context context = nebVar2.getContext();
                int iOrdinal = dn2Var.ordinal();
                if (iOrdinal == 0) {
                    strE = z7.e(context, x8b.w0);
                } else if (iOrdinal == 1) {
                    strE = z7.e(context, x8b.u0);
                } else if (iOrdinal == 2) {
                    strE = z7.e(context, x8b.v0);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strE = z7.e(context, x8b.t0);
                }
                aya ayaVar2 = new aya(String.valueOf(dn2Var.ordinal()), z ? 1 : 2, 8, strE);
                if (mebVar3 != null) {
                    mebVar3.setTabItem(ayaVar2);
                    return;
                }
                meb mebVar4 = new meb(nebVar2.getContext());
                mebVar4.setTabItem(ayaVar2);
                iyfVar.b = mebVar4;
                kyf kyfVar2 = iyfVar.d;
                if (kyfVar2 != null) {
                    kyfVar2.d();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case LangUtils.HASH_SEED /* 17 */:
                ((jd) obj).D((id) this.b, (c3c) this.c);
                break;
            case 18:
            default:
                ((jd) obj).Q0((id) this.b, (Exception) this.c);
                break;
            case 19:
                ((jd) obj).F((id) this.b, (ty9) this.c);
                break;
            case 20:
                ((jd) obj).P0((id) this.b, (kgg) this.c);
                break;
            case 21:
                ((jd) obj).v0((id) this.b, (PlaybackException) this.c);
                break;
            case 22:
                ((jd) obj).N((id) this.b, (nh4) this.c);
                break;
            case 23:
                id idVar = (id) this.b;
                sch schVar = (sch) this.c;
                ((jd) obj).Y(idVar, schVar);
                int i = schVar.a;
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((jd) obj).S((id) this.b, (k20) this.c);
                break;
        }
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        String str = (String) this.b;
        cl3 cl3Var = (cl3) this.c;
        try {
            Trace.beginSection(str);
            return cl3Var.f.j(v6dVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override // org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        y6d y6dVar = (y6d) this.b;
        lca lcaVar = (lca) this.c;
        a9h.o("loading ", str, y6dVar, "CallsSdk");
        boolean z = false;
        if (fni.a(str, "jingle_peerconnection_so")) {
            kca kcaVar = kca.WEBRTC;
            if (lcaVar.b != 2) {
                try {
                    System.loadLibrary(kcaVar.a);
                } catch (UnsatisfiedLinkError unused) {
                    if (lcaVar.a(kcaVar)) {
                    }
                }
                z = true;
            } else if (lcaVar.a(kcaVar)) {
                z = true;
            } else {
                try {
                    System.loadLibrary(kcaVar.a);
                    z = true;
                } catch (UnsatisfiedLinkError unused2) {
                }
            }
        }
        y6dVar.log("CallsSdk", "loading " + str + " result: " + z);
        if (z) {
            return true;
        }
        throw new q81(wy1.h("failed to load ", str), 0);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 9:
                ayi.d().execute(new cj((yz1) this.b, (AtomicReference) this.c, tu1Var, 13));
                return "OnScreenFlashStart";
            case 10:
            default:
                yp4 yp4Var = (yp4) this.b;
                u75 u75Var = (u75) this.c;
                Map map = Collections.EMPTY_MAP;
                yp4Var.b(new cj(yp4Var, u75Var, tu1Var), new mc(6));
                return "Init GlRenderer";
            case 11:
                q32 q32Var = (q32) this.b;
                Context context = (Context) this.c;
                Executor executor = q32Var.d;
                executor.execute(new p32(q32Var, context, executor, 1, tu1Var, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
        }
    }

    public /* synthetic */ i00(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tm6
    public ha8 apply(Object obj) {
        switch (this.a) {
            case 8:
                p52 p52Var = (p52) this.b;
                cg7 cg7Var = (cg7) this.c;
                p52Var.a();
                cg7Var.a();
                return p52Var.m();
            default:
                yz1 yz1Var = (yz1) this.b;
                return ixi.a(new pv3((wu1) this.c, yz1Var.c, TimeUnit.SECONDS.toMillis(3L), 3));
        }
    }
}
