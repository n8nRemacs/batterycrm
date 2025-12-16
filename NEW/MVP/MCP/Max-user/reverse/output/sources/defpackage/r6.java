package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.profile.ProfileScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class r6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r13v43, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        y59 y59Var;
        y59 y59Var2;
        y59 y59Var3;
        int i = this.a;
        Message messageObtain = null;
        messageObtain = null;
        z = false;
        boolean z = false;
        int iMax = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((l7) obj).a();
                return;
            case 1:
                tc tcVar = (tc) obj;
                if (view == tcVar.i && (message3 = tcVar.k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == tcVar.l && (message2 = tcVar.n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == tcVar.o && (message = tcVar.q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                tcVar.E.obtainMessage(1, tcVar.b).sendToTarget();
                return;
            case 2:
                vs0 vs0Var = (vs0) obj;
                if (vs0Var.u0 && vs0Var.isShowing()) {
                    if (!vs0Var.w0) {
                        TypedArray typedArrayObtainStyledAttributes = vs0Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        vs0Var.v0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        vs0Var.w0 = true;
                    }
                    if (vs0Var.v0) {
                        vs0Var.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                yy7[] yy7VarArr = CallPresettingsScreen.Z;
                dk1 dk1VarY0 = ((CallPresettingsScreen) obj).y0();
                ci5 ci5Var = dk1VarY0.t0;
                if (!dk1VarY0.t()) {
                    xfh.r(ci5Var, jc3.b);
                    return;
                }
                tj1 tj1Var = (tj1) dk1VarY0.d.getValue();
                CharSequence charSequence = tj1Var.a;
                char c = (charSequence == null || vmf.F(charSequence)) ? (char) 1 : (char) 0;
                if (c != 0) {
                    dk1VarY0.u(tj1Var.a);
                }
                xfh.o(dk1VarY0, ((q2b) ((lzf) dk1VarY0.c.getValue())).b().plus(bia.a), new ck1(dk1VarY0, tj1Var, null), 2);
                if (c == 0) {
                    xfh.r(ci5Var, jc3.b);
                    return;
                }
                return;
            case 4:
                ((ChatMediaDownloadBottomSheet) obj).E0(true);
                return;
            case 5:
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                int i2 = materialCalendar.m1;
                if (i2 == 2) {
                    materialCalendar.t0(1);
                    return;
                } else {
                    if (i2 == 1) {
                        materialCalendar.t0(2);
                        return;
                    }
                    return;
                }
            case 6:
                ((o59) obj).dismiss();
                return;
            case 7:
                e eVar = (e) obj;
                x59 x59Var = eVar.H0;
                if (x59Var.G0 != null) {
                    x59Var.B0.removeMessages(2);
                }
                x59Var.G0 = eVar.E0;
                boolean zIsActivated = view.isActivated();
                boolean z2 = !zIsActivated;
                if (zIsActivated) {
                    Integer num = (Integer) x59Var.H0.get(eVar.E0.c);
                    iMax = num == null ? 1 : Math.max(1, num.intValue());
                }
                eVar.A(z2);
                eVar.G0.setProgress(iMax);
                eVar.E0.j(iMax);
                x59Var.B0.sendEmptyMessageDelayed(2, 500L);
                return;
            case 8:
                s59 s59Var = (s59) obj;
                l69 l69Var = s59Var.K0.w0.X;
                k69 k69Var = s59Var.J0;
                l69Var.getClass();
                if (k69Var == null) {
                    throw new NullPointerException("route must not be null");
                }
                l69.b();
                h69 h69VarC = l69.c();
                if (!(h69VarC.s instanceof z59)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                y6i y6iVarB = h69VarC.r.b(k69Var);
                if (y6iVarB == null || (y59Var = (y59) y6iVarB.b) == null || !y59Var.e) {
                    Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((z59) h69VarC.s).o(Collections.singletonList(k69Var.b));
                }
                s59Var.F0.setVisibility(4);
                s59Var.G0.setVisibility(0);
                return;
            case 9:
                g gVar = (g) obj;
                v59 v59Var = gVar.R0;
                boolean zC = gVar.C(gVar.E0);
                boolean z3 = !zC;
                boolean zE = gVar.E0.e();
                if (zC) {
                    l69 l69Var2 = v59Var.w0.X;
                    k69 k69Var2 = gVar.E0;
                    l69Var2.getClass();
                    if (k69Var2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    l69.b();
                    h69 h69VarC2 = l69.c();
                    if (!(h69VarC2.s instanceof z59)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    y6i y6iVarB2 = h69VarC2.r.b(k69Var2);
                    if (!Collections.unmodifiableList(h69VarC2.r.u).contains(k69Var2) || y6iVarB2 == null || ((y59Var2 = (y59) y6iVarB2.b) != null && !y59Var2.c)) {
                        Log.w("MediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + k69Var2);
                    } else if (Collections.unmodifiableList(h69VarC2.r.u).size() <= 1) {
                        Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((z59) h69VarC2.s).n(k69Var2.b);
                    }
                } else {
                    l69 l69Var3 = v59Var.w0.X;
                    k69 k69Var3 = gVar.E0;
                    l69Var3.getClass();
                    if (k69Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    l69.b();
                    h69 h69VarC3 = l69.c();
                    if (!(h69VarC3.s instanceof z59)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    y6i y6iVarB3 = h69VarC3.r.b(k69Var3);
                    if (Collections.unmodifiableList(h69VarC3.r.u).contains(k69Var3) || y6iVarB3 == null || (y59Var3 = (y59) y6iVarB3.b) == null || !y59Var3.d) {
                        Log.w("MediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + k69Var3);
                    } else {
                        ((z59) h69VarC3.s).m(k69Var3.b);
                    }
                }
                gVar.D(z3, !zE);
                if (zE) {
                    List listUnmodifiableList = Collections.unmodifiableList(v59Var.w0.s0.u);
                    for (k69 k69Var4 : Collections.unmodifiableList(gVar.E0.u)) {
                        if (listUnmodifiableList.contains(k69Var4) != z3) {
                            e eVar2 = (e) v59Var.w0.F0.get(k69Var4.c);
                            if (eVar2 instanceof g) {
                                ((g) eVar2).D(z3, true);
                            }
                        }
                    }
                }
                x59 x59Var2 = v59Var.w0;
                k69 k69Var5 = gVar.E0;
                List listUnmodifiableList2 = Collections.unmodifiableList(x59Var2.s0.u);
                int iMax2 = Math.max(1, listUnmodifiableList2.size());
                if (k69Var5.e()) {
                    Iterator it = Collections.unmodifiableList(k69Var5.u).iterator();
                    while (it.hasNext()) {
                        if (listUnmodifiableList2.contains((k69) it.next()) != z3) {
                            iMax2 += !zC ? 1 : -1;
                        }
                    }
                } else {
                    iMax2 += zC ? -1 : 1;
                }
                boolean z4 = x59Var2.c1 && Collections.unmodifiableList(x59Var2.s0.u).size() > 1;
                boolean z5 = x59Var2.c1 && iMax2 >= 2;
                if (z4 != z5) {
                    mid midVarM = x59Var2.C0.M(0);
                    if (midVarM instanceof f) {
                        f fVar = (f) midVarM;
                        v59Var.C(fVar.a, z5 ? fVar.J0 : 0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                yy7[] yy7VarArr2 = ProfileScreen.C0;
                pnc pncVarD0 = ((ProfileScreen) obj).D0();
                yac yacVar = pncVarD0.T0;
                bbc bbcVar = (bbc) pncVarD0.R0.getValue();
                if ((bbcVar != null ? bbcVar.c : null) != null) {
                    ei4 ei4VarX = yacVar.x();
                    if (ei4VarX != null) {
                        xfh.r(pncVarD0.F0, ei4VarX);
                        return;
                    }
                    return;
                }
                if (yacVar.b()) {
                    ci5 ci5Var2 = pncVarD0.E0;
                    mcc mccVar = (mcc) pncVarD0.L0.getValue();
                    mccVar.getClass();
                    n5g n5gVar = new n5g(x8b.d0);
                    o98 o98VarD = ve3.d();
                    o98VarD.add(new pq3(v8b.n, new n5g(x8b.f0), 3, 56));
                    o98VarD.add(new pq3(v8b.m, new n5g(x8b.e0), 3, 56));
                    o98VarD.add(mccVar.b());
                    xfh.r(ci5Var2, new fmc(n5gVar, null, ve3.a(o98VarD), null));
                    return;
                }
                return;
            case 11:
                ((RecordExitBottomSheet) obj).E0(true);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                xbg xbgVar = ((Toolbar) obj).Z0;
                zf9 zf9Var = xbgVar != null ? xbgVar.b : null;
                if (zf9Var != null) {
                    zf9Var.collapseActionView();
                    return;
                }
                return;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                CheckedTextView checkedTextView = trackSelectionView.b;
                SparseArray sparseArray = trackSelectionView.c;
                CheckedTextView checkedTextView2 = trackSelectionView.a;
                if (view == checkedTextView2) {
                    trackSelectionView.s0 = true;
                    sparseArray.clear();
                } else {
                    if (view != checkedTextView) {
                        trackSelectionView.s0 = false;
                        view.getTag().getClass();
                        throw new ClassCastException();
                    }
                    trackSelectionView.s0 = false;
                    sparseArray.clear();
                }
                checkedTextView2.setChecked(trackSelectionView.s0);
                if (!trackSelectionView.s0 && sparseArray.size() == 0) {
                    z = true;
                }
                checkedTextView.setChecked(z);
                throw null;
        }
    }
}
