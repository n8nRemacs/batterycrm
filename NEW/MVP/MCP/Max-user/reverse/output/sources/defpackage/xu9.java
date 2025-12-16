package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Provider;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import org.webrtc.StatsReport;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class xu9 implements am7, kf7, gu3, zua, MyTrackerConfig.Logger, Provider, tza, w2f, RTCStatsCollectorCallback, tm6, pc6, yu, b9e, bz0, uu1, wi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xu9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        switch (this.a) {
            case 4:
                eba ebaVar = (eba) this.b;
                ViewGroup viewGroup = ebaVar.X;
                int iB = g4iVar.b();
                if (viewGroup.getPaddingLeft() != iB) {
                    viewGroup.setPadding(iB, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                }
                ViewGroup viewGroup2 = ebaVar.X;
                int iC = g4iVar.c();
                if (viewGroup2.getPaddingRight() != iC) {
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), iC, viewGroup2.getPaddingBottom());
                    break;
                }
                break;
            default:
                kba kbaVar = (kba) this.b;
                ViewGroup viewGroup3 = kbaVar.y0;
                int iB2 = g4iVar.b();
                if (viewGroup3.getPaddingLeft() != iB2) {
                    viewGroup3.setPadding(iB2, viewGroup3.getPaddingTop(), viewGroup3.getPaddingRight(), viewGroup3.getPaddingBottom());
                }
                ViewGroup viewGroup4 = kbaVar.y0;
                int iC2 = g4iVar.c();
                if (viewGroup4.getPaddingRight() != iC2) {
                    viewGroup4.setPadding(viewGroup4.getPaddingLeft(), viewGroup4.getPaddingTop(), iC2, viewGroup4.getPaddingBottom());
                }
                ViewGroup viewGroup5 = kbaVar.y0;
                int iA = g4iVar.a();
                if (viewGroup5.getPaddingBottom() != iA) {
                    viewGroup5.setPadding(viewGroup5.getPaddingLeft(), viewGroup5.getPaddingTop(), viewGroup5.getPaddingRight(), iA);
                    break;
                }
                break;
        }
        return g4iVar;
    }

    @Override // defpackage.bz0
    public void a(long j, long j2, long j3) {
        unc uncVar = (unc) this.b;
        if (((i25) uncVar.g) == null) {
            return;
        }
        float fY = (j == -1 || j == 0) ? -1.0f : zxg.Y(j2, j);
        i25 i25Var = (i25) uncVar.g;
        i25Var.getClass();
        i25Var.b(j, j2, fY);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                x00 x00Var = (x00) obj;
                int iOrdinal = ((w10) this.b).a.ordinal();
                if (iOrdinal == 2) {
                    k10 k10Var = x00Var.b;
                    if (k10Var == null) {
                        k10Var = k10.v0;
                    }
                    j10 j10VarB = k10Var.b();
                    j10VarB.g = null;
                    x00Var.b = new k10(j10VarB);
                    break;
                } else if (iOrdinal == 3) {
                    t10 t10VarA = x00Var.c().a();
                    t10VarA.a = 0L;
                    t10VarA.m = null;
                    x00Var.d = new v10(t10VarA);
                    break;
                } else if (iOrdinal == 5) {
                    r10 r10Var = x00Var.f;
                    if (r10Var == null) {
                        r10Var = r10.p;
                    }
                    q10 q10Var = new q10();
                    long j = r10Var.a;
                    q10Var.d = r10Var.b;
                    q10Var.b = r10Var.c;
                    q10Var.c = r10Var.d;
                    q10Var.f = r10Var.e;
                    q10Var.g = r10Var.f;
                    q10Var.i = r10Var.g;
                    q10Var.h = r10Var.h;
                    q10Var.e = r10Var.i;
                    q10Var.j = r10Var.j;
                    q10Var.k = r10Var.k;
                    q10Var.l = r10Var.l;
                    q10Var.m = r10Var.m;
                    q10Var.n = r10Var.n;
                    q10Var.o = r10Var.o;
                    q10Var.a = 0L;
                    x00Var.f = q10Var.a();
                    break;
                } else if (iOrdinal == 9) {
                    e10 e10VarA = x00Var.b().a();
                    e10VarA.a = 0L;
                    e10VarA.d = null;
                    x00Var.r = new f10(e10VarA);
                    break;
                }
                break;
            case 3:
                ((xd8) this.b).i(((Long) obj).longValue());
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((uaj) this.b).e = (hf0) obj;
                break;
            default:
                RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) this.b;
                kmb kmbVar = (kmb) obj;
                rangeSeekBarView.F0.append(((Long) kmbVar.a).longValue(), (Bitmap) kmbVar.b);
                rangeSeekBarView.invalidate();
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 11:
                return new hf0(new BitmapDrawable((Resources) this.b, (Bitmap) obj));
            case 23:
                return ddd.d((ocd) obj, (scd) this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ddd.d((ocd) this.b, (scd) obj);
            case 25:
                pcd pcdVar = (pcd) this.b;
                ocd ocdVar = (ocd) obj;
                ocdVar.getClass();
                return new kk3(2, new jad(ocdVar, 2, pcdVar));
            default:
                return (yr8) this.b;
        }
    }

    @Override // defpackage.wi6
    public void b(String str, Bundle bundle) throws Throwable {
        iqb iqbVar = (iqb) this.b;
        uzd uzdVar = (uzd) bundle.getParcelable(str);
        if (uzdVar == null) {
            return;
        }
        iqbVar.invoke(uzdVar);
    }

    public Boolean c(int i) {
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.b;
        yy7[] yy7VarArr = ProfileScreen.C0;
        return Boolean.valueOf((((mjc) ((t98) ((amc) endlessRecyclerView2.getAdapter()).C(i))).getK0() & 268435456) != 0);
    }

    @Override // defpackage.kf7
    public void d(lf7 lf7Var) {
        wy9 wy9Var = (wy9) this.b;
        synchronized (wy9Var.a) {
            wy9Var.c++;
        }
        wy9Var.d(lf7Var);
    }

    @Override // defpackage.tza
    public void e(int i) {
        ((ylc) this.b).invoke(Integer.valueOf(i));
    }

    public void f(bui buiVar) {
        w12 w12Var;
        a9c a9cVar = (a9c) this.b;
        if (!(buiVar instanceof o7i) || (w12Var = a9cVar.u0) == null) {
            return;
        }
        float f = ((o7i) buiVar).a;
        if (!w12Var.i()) {
            gri.i("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!w12Var.v) {
            gri.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        gri.a("CameraController", "Pinch to zoom with scale: " + f);
        jei.b();
        q7i q7iVar = (q7i) w12Var.x.d();
        if (q7iVar == null) {
            return;
        }
        w12Var.p(Math.min(Math.max(q7iVar.c() * (f > 1.0f ? utb.i(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), q7iVar.b()), q7iVar.a()));
    }

    @Override // defpackage.b9e
    public int g(int i) {
        int k0 = ((qfc) ((t98) ((ProfileChangeLinkScreen) this.b).X.C(i))).getK0();
        if ((536870911 & k0) == 2048) {
            return 0;
        }
        if ((536870912 & k0) != 0) {
            return 1;
        }
        if ((1073741824 & k0) != 0) {
            return 2;
        }
        return (k0 & Integer.MIN_VALUE) != 0 ? 3 : 4;
    }

    @Override // javax.inject.Provider
    public Object get() throws Throwable {
        zva zvaVar = (zva) this.b;
        w4e w4eVar = (w4e) ((pb3) zvaVar.b);
        long j = w4eVar.j();
        long jQ = w4eVar.q();
        String strP = w4eVar.p();
        if (strP == null || vmf.F(strP) || j >= jQ) {
            svi.g((x74) zvaVar.c, new yva(zvaVar, null));
        }
        return w4eVar.p();
    }

    @Override // defpackage.w2f
    public void i(final i2f i2fVar) {
        ((dlb) this.b).d.invoke(new eef() { // from class: blb
            @Override // defpackage.eef
            public final void a(StatsReport[] statsReportArr, StatsReport[] statsReportArr2, os0[] os0VarArr, Map map, ds1 ds1Var) {
                i2fVar.a(statsReportArr);
            }
        });
    }

    @Override // defpackage.pc6
    public Widget l(String str, b bVar) {
        PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) this.b;
        yy7[] yy7VarArr = PickerChatsTabWidget.x0;
        hs hsVar = pickerChatsTabWidget.a;
        yy7[] yy7VarArr2 = PickerChatsTabWidget.x0;
        yy7 yy7Var = yy7VarArr2[0];
        String str2 = ((b1e) hsVar.a(pickerChatsTabWidget)).a;
        hs hsVar2 = pickerChatsTabWidget.b;
        yy7 yy7Var2 = yy7VarArr2[1];
        boolean zBooleanValue = ((Boolean) hsVar2.a(pickerChatsTabWidget)).booleanValue();
        em6 em6Var = pickerChatsTabWidget.o;
        hs hsVar3 = pickerChatsTabWidget.c;
        yy7 yy7Var3 = yy7VarArr2[2];
        PickerChatsListWidget pickerChatsListWidget = new PickerChatsListWidget(str, str2, (yg2) hsVar3.a(pickerChatsTabWidget), false, zBooleanValue, em6Var, 8, null);
        pickerChatsListWidget.t0 = bVar;
        if (pickerChatsListWidget.isAttached()) {
            pickerChatsListWidget.C0().setRecycledViewPool(bVar);
        }
        return pickerChatsListWidget;
    }

    @Override // com.my.tracker.MyTrackerConfig.Logger
    public void log(int i, String str, Throwable th) {
        Object next;
        if (i >= ((int) ((l5c) this.b).m(PmsKey.f105mytrackerloglevel, 4))) {
            Iterator it = lg8.t0.iterator();
            while (true) {
                f2 f2Var = (f2) it;
                if (!f2Var.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = f2Var.next();
                    if (((lg8) next).a == i) {
                        break;
                    }
                }
            }
            lg8 lg8Var = (lg8) next;
            if (lg8Var == null) {
                lg8Var = lg8.c;
            }
            wqi.k(lg8Var, "OneMeMyTracker", str, th);
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        py1 py1Var = (py1) this.b;
        py1Var.c = tu1Var;
        return "RequestCompleteListener[" + py1Var + "]";
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((wdf) this.b).a(new vdf(rTCStatsReport));
    }

    public /* synthetic */ xu9(f54 f54Var, hjd hjdVar) {
        this.a = 26;
        this.b = f54Var;
    }

    public /* synthetic */ xu9(ddd dddVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tm6
    public ha8 apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((u8c) this.b).d.j();
            default:
                return (ha8) ((i0) this.b).invoke(obj);
        }
    }
}
