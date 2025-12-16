package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Rational;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class mc5 implements a34, gu3, dcb, jpf, v57, h8, rn6, tof, q8c, oeh {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ mc5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void A(long j, String str) {
        Integer num = (Integer) x19.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(ho7.i("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.b).putLong(str, j);
    }

    public void B(String str, j8d j8dVar) {
        Object obj;
        float f = j8dVar.b;
        int i = j8dVar.a;
        Integer num = (Integer) x19.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(ho7.i("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.b;
        if (j8dVar.c != null) {
            obj = j8dVar.c;
        } else {
            if (j8dVar.c()) {
                switch (i) {
                    case 1:
                        j8dVar.c = Rating.newHeartRating(i == 1 && f == 1.0f);
                        break;
                    case 2:
                        j8dVar.c = Rating.newThumbRating(i == 2 && f == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        j8dVar.c = Rating.newStarRating(i, j8dVar.b());
                        break;
                    case 6:
                        if (i != 6 || !j8dVar.c()) {
                            f = -1.0f;
                        }
                        j8dVar.c = Rating.newPercentageRating(f);
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                j8dVar.c = Rating.newUnratedRating(i);
            }
            obj = j8dVar.c;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public void C(String str, String str2) {
        Integer num = (Integer) x19.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(ho7.i("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public void D(String str, CharSequence charSequence) {
        Integer num = (Integer) x19.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(ho7.i("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.b).putCharSequence(str, charSequence);
    }

    public void E(lk6 lk6Var) {
    }

    @Override // defpackage.rn6, defpackage.v2f
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                zz2 zz2Var = (zz2) obj;
                z72 z72Var = (z72) this.b;
                long j = z72Var.b;
                if (zz2Var.c != null) {
                    z72Var.b().g0(z72Var.d, bf2.b);
                    ige igeVar = z72Var.a;
                    if (igeVar == null) {
                        igeVar = null;
                    }
                    w63 w63Var = (w63) igeVar.H.getValue();
                    w63Var.i().m0(Collections.singletonList(zz2Var.c));
                }
                z72Var.r().c(new a03(j));
                z72Var.q().d(j);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((og4) this.b).b.run();
                break;
            case 19:
                wqi.e(((i58) this.b).X, "failed to store sticker set", (Throwable) obj);
                break;
            default:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ((lv5) ((vm9) this.b).c.getValue()).d((um9) it.next());
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q8c
    public void b(msf msfVar) {
        rsf rsfVar;
        if (!jei.c()) {
            z7.d(((a9c) this.b).getContext()).execute(new d8c(this, 3, msfVar));
            return;
        }
        gri.a("PreviewView", "Surface requested by Preview.");
        n22 n22Var = msfVar.e;
        ((a9c) this.b).x0 = n22Var.n();
        b9c b9cVar = ((a9c) this.b).v0;
        Rect rectE = n22Var.f().e();
        b9cVar.getClass();
        b9cVar.a = new Rational(rectE.width(), rectE.height());
        synchronized (b9cVar) {
            b9cVar.c = rectE;
        }
        msfVar.c(z7.d(((a9c) this.b).getContext()), new nl(this, n22Var, msfVar, 21));
        a9c a9cVar = (a9c) this.b;
        bma bmaVar = a9cVar.b;
        x8c x8cVar = a9cVar.a;
        if (!(bmaVar instanceof rsf) || a9c.c(msfVar, x8cVar)) {
            a9c a9cVar2 = (a9c) this.b;
            if (a9c.c(msfVar, a9cVar2.a)) {
                a9c a9cVar3 = (a9c) this.b;
                r6g r6gVar = new r6g(a9cVar3, a9cVar3.d);
                r6gVar.i = false;
                r6gVar.k = new AtomicReference();
                rsfVar = r6gVar;
            } else {
                a9c a9cVar4 = (a9c) this.b;
                rsfVar = new rsf(a9cVar4, a9cVar4.d);
            }
            a9cVar2.b = rsfVar;
        }
        l22 l22VarN = n22Var.n();
        a9c a9cVar5 = (a9c) this.b;
        u8c u8cVar = new u8c(l22VarN, a9cVar5.s0, a9cVar5.b);
        ((a9c) this.b).t0.set(u8cVar);
        n22Var.e().f(z7.d(((a9c) this.b).getContext()), u8cVar);
        ((a9c) this.b).b.h(msfVar, new nl(this, u8cVar, n22Var, 22));
        a9c a9cVar6 = (a9c) this.b;
        if (a9cVar6.indexOfChild(a9cVar6.c) == -1) {
            a9c a9cVar7 = (a9c) this.b;
            a9cVar7.addView(a9cVar7.c);
        }
    }

    @Override // defpackage.oeh
    public int c(View view) {
        return a.G(view) - ((ViewGroup.MarginLayoutParams) ((xhd) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.v57
    public wmb d() {
        wmb wmbVarD = ((v57) this.b).d();
        List list = Collections.EMPTY_LIST;
        return new iv6(wmbVarD);
    }

    @Override // defpackage.h8
    public void e(Object obj) {
        g8 g8Var = (g8) obj;
        c cVar = (c) this.b;
        oi6 oi6Var = (oi6) cVar.F.pollFirst();
        if (oi6Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = oi6Var.a;
        int i = oi6Var.b;
        androidx.fragment.app.a aVarC = cVar.c.c(str);
        if (aVarC != null) {
            aVarC.J(i, g8Var.a, g8Var.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    public void f(lk6 lk6Var) {
    }

    public void g(rz9... rz9VarArr) {
        for (rz9 rz9Var : rz9VarArr) {
            int i = rz9Var.a;
            int i2 = rz9Var.b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + rz9Var);
            }
            treeMap2.put(Integer.valueOf(i2), rz9Var);
        }
    }

    public void h(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
    }

    @Override // defpackage.oeh
    public int i() {
        return ((a) this.b).M();
    }

    @Override // defpackage.v57
    public wmb j(p57 p57Var, h57 h57Var) {
        wmb wmbVarJ = ((v57) this.b).j(p57Var, h57Var);
        List list = Collections.EMPTY_LIST;
        return new iv6(wmbVarJ);
    }

    @Override // defpackage.jpf
    public Object k(q44 q44Var) {
        return (List) ((bwf) ((v6d) this.b).o).getValue();
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        ((ixe) ((e13) this.b)).b.invoke(ecbVar);
    }

    public DrmSession$DrmSessionException m() {
        return (DrmSession$DrmSessionException) this.b;
    }

    @Override // defpackage.oeh
    public int n() {
        a aVar = (a) this.b;
        return aVar.o - aVar.J();
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) throws Exception {
        ((kd7) this.b).close();
    }

    @Override // defpackage.oeh
    public View p(int i) {
        return ((a) this.b).w(i);
    }

    @Override // defpackage.oeh
    public int q(View view) {
        return a.A(view) + ((ViewGroup.MarginLayoutParams) ((xhd) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.tof
    public void r(byte[] bArr, int i, int i2, sof sofVar, fu3 fu3Var) {
        hb4 hb4VarA;
        umb umbVar = (umb) this.b;
        umbVar.H(i + i2, bArr);
        umbVar.J(i);
        ArrayList arrayList = new ArrayList();
        while (umbVar.a() > 0) {
            hsi.a("Incomplete Mp4Webvtt Top Level box header found.", umbVar.a() >= 8);
            int iJ = umbVar.j();
            if (umbVar.j() == 1987343459) {
                int i3 = iJ - 8;
                CharSequence charSequenceF = null;
                fb4 fb4VarC = null;
                while (i3 > 0) {
                    hsi.a("Incomplete vtt cue box header found.", i3 >= 8);
                    int iJ2 = umbVar.j();
                    int iJ3 = umbVar.j();
                    int i4 = iJ2 - 8;
                    byte[] bArr2 = umbVar.a;
                    int i5 = umbVar.b;
                    String str = zxg.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    umbVar.K(i4);
                    i3 = (i3 - 8) - i4;
                    if (iJ3 == 1937011815) {
                        s1i s1iVar = new s1i();
                        u1i.e(str2, s1iVar);
                        fb4VarC = s1iVar.c();
                    } else if (iJ3 == 1885436268) {
                        charSequenceF = u1i.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (fb4VarC != null) {
                    fb4VarC.a = charSequenceF;
                    fb4VarC.b = null;
                    hb4VarA = fb4VarC.a();
                } else {
                    Pattern pattern = u1i.a;
                    s1i s1iVar2 = new s1i();
                    s1iVar2.c = charSequenceF;
                    hb4VarA = s1iVar2.c().a();
                }
                arrayList.add(hb4VarA);
            } else {
                umbVar.K(iJ - 8);
            }
        }
        fu3Var.accept(new kb4(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public UUID s() {
        return ay0.a;
    }

    public int t() {
        return 1;
    }

    @Override // defpackage.tof
    public int u() {
        return 2;
    }

    public void v(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.b).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getTop() - iArr[3]);
    }

    public void w(Rect rect, View view, RecyclerView recyclerView) {
        SparseArray sparseArray = (SparseArray) this.b;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int iR = RecyclerView.R(view);
        if (iR == -1) {
            sparseArray.remove(iR);
            return;
        }
        int[] iArr = (int[]) sparseArray.get(iR);
        if (iArr == null) {
            iArr = new int[8];
            sparseArray.put(iR, iArr);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + ((xhd) view.getLayoutParams()).b.left;
        iArr[1] = i;
        iArr[0] = i + rect.left;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + ((xhd) view.getLayoutParams()).b.top;
        iArr[3] = i2;
        iArr[2] = i2 + rect.top;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0) + ((xhd) view.getLayoutParams()).b.right;
        iArr[5] = i3;
        iArr[4] = i3 + rect.right;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0) + ((xhd) view.getLayoutParams()).b.bottom;
        iArr[7] = i4;
        iArr[6] = i4 + rect.bottom;
    }

    public void x(long j, final boolean z) {
        CallAdminSettingsScreen callAdminSettingsScreen = (CallAdminSettingsScreen) this.b;
        yy7[] yy7VarArr = CallAdminSettingsScreen.s0;
        h21 h21VarY0 = callAdminSettingsScreen.y0();
        int i = (int) j;
        h21VarY0.getClass();
        h29 h29Var = h29.c;
        h29 h29Var2 = h29.a;
        if (i == j0b.a) {
            final v11 v11Var = (v11) h21VarY0.t();
            MediaMuteManager mediaMuteManagerE = v11Var.e();
            if (mediaMuteManagerE != null) {
                nn8 nn8Var = new nn8();
                g29 g29Var = g29.b;
                if (z) {
                    h29Var = h29Var2;
                }
                nn8Var.put(g29Var, h29Var);
                final int i2 = 1;
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE, nn8Var.b(), null, new cm6() { // from class: b11
                    @Override // defpackage.cm6
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i2) {
                            case 0:
                                v11 v11Var2 = v11Var;
                                boolean z2 = z;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", xrf.p("Microphone in call was changed on ", " success", z2), null);
                                    }
                                }
                                tcf tcfVar = v11Var2.E0;
                                do {
                                    value = tcfVar.getValue();
                                } while (!tcfVar.c(value, ca.a((ca) value, false, false, z2, false, false, false, 123)));
                                v11Var2.C0.h(new bb(true, z2));
                                break;
                            case 1:
                                v11 v11Var3 = v11Var;
                                boolean z3 = z;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", xrf.p("Cameras in call was changed on ", " success", z3), null);
                                    }
                                }
                                tcf tcfVar2 = v11Var3.E0;
                                do {
                                    value2 = tcfVar2.getValue();
                                } while (!tcfVar2.c(value2, ca.a((ca) value2, false, z3, false, false, false, false, 125)));
                                v11Var3.C0.h(new za(true, z3));
                                break;
                            default:
                                v11 v11Var4 = v11Var;
                                boolean z4 = z;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", xrf.p("Screen sharing in call was changed on ", " success", z4), null);
                                    }
                                }
                                tcf tcfVar3 = v11Var4.E0;
                                do {
                                    value3 = tcfVar3.getValue();
                                } while (!tcfVar3.c(value3, ca.a((ca) value3, false, false, false, z4, false, false, 119)));
                                v11Var4.C0.h(new fb(true, z4));
                                break;
                        }
                        return qqg.a;
                    }
                }, new em6() { // from class: c11
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        i29 mediaOptionsForCall$default;
                        h29 h29Var3;
                        i29 mediaOptionsForCall$default2;
                        h29 h29Var4;
                        i29 mediaOptionsForCall$default3;
                        h29 h29Var5;
                        switch (i2) {
                            case 0:
                                v11 v11Var2 = v11Var;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                    }
                                }
                                jve jveVar = v11Var2.C0;
                                MediaMuteManager mediaMuteManagerE2 = v11Var2.e();
                                jveVar.h(new bb(false, (mediaMuteManagerE2 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE2, null, 1, null)) == null || (h29Var3 = mediaOptionsForCall$default.a) == null) ? false : v11.h(h29Var3)));
                                break;
                            case 1:
                                v11 v11Var3 = v11Var;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                    }
                                }
                                jve jveVar2 = v11Var3.C0;
                                MediaMuteManager mediaMuteManagerE3 = v11Var3.e();
                                jveVar2.h(new za(false, (mediaMuteManagerE3 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) == null || (h29Var4 = mediaOptionsForCall$default2.b) == null) ? false : v11.h(h29Var4)));
                                break;
                            default:
                                v11 v11Var4 = v11Var;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                    }
                                }
                                jve jveVar3 = v11Var4.C0;
                                MediaMuteManager mediaMuteManagerE4 = v11Var4.e();
                                jveVar3.h(new fb(false, (mediaMuteManagerE4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE4, null, 1, null)) == null || (h29Var5 = mediaOptionsForCall$default3.c) == null) ? false : v11.h(h29Var5)));
                                break;
                        }
                        return qqg.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i == j0b.h) {
            final v11 v11Var2 = (v11) h21VarY0.t();
            MediaMuteManager mediaMuteManagerE2 = v11Var2.e();
            if (mediaMuteManagerE2 != null) {
                nn8 nn8Var2 = new nn8();
                g29 g29Var2 = g29.a;
                if (z) {
                    h29Var = h29Var2;
                }
                nn8Var2.put(g29Var2, h29Var);
                final int i3 = 0;
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE2, nn8Var2.b(), null, new cm6() { // from class: b11
                    @Override // defpackage.cm6
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i3) {
                            case 0:
                                v11 v11Var22 = v11Var2;
                                boolean z2 = z;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", xrf.p("Microphone in call was changed on ", " success", z2), null);
                                    }
                                }
                                tcf tcfVar = v11Var22.E0;
                                do {
                                    value = tcfVar.getValue();
                                } while (!tcfVar.c(value, ca.a((ca) value, false, false, z2, false, false, false, 123)));
                                v11Var22.C0.h(new bb(true, z2));
                                break;
                            case 1:
                                v11 v11Var3 = v11Var2;
                                boolean z3 = z;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", xrf.p("Cameras in call was changed on ", " success", z3), null);
                                    }
                                }
                                tcf tcfVar2 = v11Var3.E0;
                                do {
                                    value2 = tcfVar2.getValue();
                                } while (!tcfVar2.c(value2, ca.a((ca) value2, false, z3, false, false, false, false, 125)));
                                v11Var3.C0.h(new za(true, z3));
                                break;
                            default:
                                v11 v11Var4 = v11Var2;
                                boolean z4 = z;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", xrf.p("Screen sharing in call was changed on ", " success", z4), null);
                                    }
                                }
                                tcf tcfVar3 = v11Var4.E0;
                                do {
                                    value3 = tcfVar3.getValue();
                                } while (!tcfVar3.c(value3, ca.a((ca) value3, false, false, false, z4, false, false, 119)));
                                v11Var4.C0.h(new fb(true, z4));
                                break;
                        }
                        return qqg.a;
                    }
                }, new em6() { // from class: c11
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        i29 mediaOptionsForCall$default;
                        h29 h29Var3;
                        i29 mediaOptionsForCall$default2;
                        h29 h29Var4;
                        i29 mediaOptionsForCall$default3;
                        h29 h29Var5;
                        switch (i3) {
                            case 0:
                                v11 v11Var22 = v11Var2;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                    }
                                }
                                jve jveVar = v11Var22.C0;
                                MediaMuteManager mediaMuteManagerE22 = v11Var22.e();
                                jveVar.h(new bb(false, (mediaMuteManagerE22 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE22, null, 1, null)) == null || (h29Var3 = mediaOptionsForCall$default.a) == null) ? false : v11.h(h29Var3)));
                                break;
                            case 1:
                                v11 v11Var3 = v11Var2;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                    }
                                }
                                jve jveVar2 = v11Var3.C0;
                                MediaMuteManager mediaMuteManagerE3 = v11Var3.e();
                                jveVar2.h(new za(false, (mediaMuteManagerE3 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) == null || (h29Var4 = mediaOptionsForCall$default2.b) == null) ? false : v11.h(h29Var4)));
                                break;
                            default:
                                v11 v11Var4 = v11Var2;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                    }
                                }
                                jve jveVar3 = v11Var4.C0;
                                MediaMuteManager mediaMuteManagerE4 = v11Var4.e();
                                jveVar3.h(new fb(false, (mediaMuteManagerE4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE4, null, 1, null)) == null || (h29Var5 = mediaOptionsForCall$default3.c) == null) ? false : v11.h(h29Var5)));
                                break;
                        }
                        return qqg.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        final int i4 = 2;
        if (i == j0b.j) {
            final v11 v11Var3 = (v11) h21VarY0.t();
            MediaMuteManager mediaMuteManagerE3 = v11Var3.e();
            if (mediaMuteManagerE3 != null) {
                nn8 nn8Var3 = new nn8();
                g29 g29Var3 = g29.c;
                if (z) {
                    h29Var = h29Var2;
                }
                nn8Var3.put(g29Var3, h29Var);
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerE3, nn8Var3.b(), null, new cm6() { // from class: b11
                    @Override // defpackage.cm6
                    public final Object invoke() {
                        Object value;
                        Object value2;
                        Object value3;
                        switch (i4) {
                            case 0:
                                v11 v11Var22 = v11Var3;
                                boolean z2 = z;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", xrf.p("Microphone in call was changed on ", " success", z2), null);
                                    }
                                }
                                tcf tcfVar = v11Var22.E0;
                                do {
                                    value = tcfVar.getValue();
                                } while (!tcfVar.c(value, ca.a((ca) value, false, false, z2, false, false, false, 123)));
                                v11Var22.C0.h(new bb(true, z2));
                                break;
                            case 1:
                                v11 v11Var32 = v11Var3;
                                boolean z3 = z;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", xrf.p("Cameras in call was changed on ", " success", z3), null);
                                    }
                                }
                                tcf tcfVar2 = v11Var32.E0;
                                do {
                                    value2 = tcfVar2.getValue();
                                } while (!tcfVar2.c(value2, ca.a((ca) value2, false, z3, false, false, false, false, 125)));
                                v11Var32.C0.h(new za(true, z3));
                                break;
                            default:
                                v11 v11Var4 = v11Var3;
                                boolean z4 = z;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", xrf.p("Screen sharing in call was changed on ", " success", z4), null);
                                    }
                                }
                                tcf tcfVar3 = v11Var4.E0;
                                do {
                                    value3 = tcfVar3.getValue();
                                } while (!tcfVar3.c(value3, ca.a((ca) value3, false, false, false, z4, false, false, 119)));
                                v11Var4.C0.h(new fb(true, z4));
                                break;
                        }
                        return qqg.a;
                    }
                }, new em6() { // from class: c11
                    @Override // defpackage.em6
                    public final Object invoke(Object obj) {
                        i29 mediaOptionsForCall$default;
                        h29 h29Var3;
                        i29 mediaOptionsForCall$default2;
                        h29 h29Var4;
                        i29 mediaOptionsForCall$default3;
                        h29 h29Var5;
                        switch (i4) {
                            case 0:
                                v11 v11Var22 = v11Var3;
                                boolean z2 = z;
                                Throwable th = (Throwable) obj;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null) {
                                    lg8 lg8Var = lg8.d;
                                    if (l6bVar.b(lg8Var)) {
                                        l6bVar.c(lg8Var, "CallAdminSettingsController", "Microphone in call wasn't changed on " + z2 + " due to: " + th.getMessage(), null);
                                    }
                                }
                                jve jveVar = v11Var22.C0;
                                MediaMuteManager mediaMuteManagerE22 = v11Var22.e();
                                jveVar.h(new bb(false, (mediaMuteManagerE22 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE22, null, 1, null)) == null || (h29Var3 = mediaOptionsForCall$default.a) == null) ? false : v11.h(h29Var3)));
                                break;
                            case 1:
                                v11 v11Var32 = v11Var3;
                                boolean z3 = z;
                                Throwable th2 = (Throwable) obj;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null) {
                                    lg8 lg8Var2 = lg8.d;
                                    if (l6bVar2.b(lg8Var2)) {
                                        l6bVar2.c(lg8Var2, "CallAdminSettingsController", "Cameras in call wasn't changed on " + z3 + " due to: " + th2.getMessage(), null);
                                    }
                                }
                                jve jveVar2 = v11Var32.C0;
                                MediaMuteManager mediaMuteManagerE32 = v11Var32.e();
                                jveVar2.h(new za(false, (mediaMuteManagerE32 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE32, null, 1, null)) == null || (h29Var4 = mediaOptionsForCall$default2.b) == null) ? false : v11.h(h29Var4)));
                                break;
                            default:
                                v11 v11Var4 = v11Var3;
                                boolean z4 = z;
                                Throwable th3 = (Throwable) obj;
                                l6b l6bVar3 = wqi.a;
                                if (l6bVar3 != null) {
                                    lg8 lg8Var3 = lg8.d;
                                    if (l6bVar3.b(lg8Var3)) {
                                        l6bVar3.c(lg8Var3, "CallAdminSettingsController", "Screen sharing in call wasn't changed on " + z4 + " due to: " + th3.getMessage(), null);
                                    }
                                }
                                jve jveVar3 = v11Var4.C0;
                                MediaMuteManager mediaMuteManagerE4 = v11Var4.e();
                                jveVar3.h(new fb(false, (mediaMuteManagerE4 == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE4, null, 1, null)) == null || (h29Var5 = mediaOptionsForCall$default3.c) == null) ? false : v11.h(h29Var5)));
                                break;
                        }
                        return qqg.a;
                    }
                }, 2, null);
                return;
            }
            return;
        }
        if (i == j0b.i) {
            if (!z) {
                u1e u1eVar = h21VarY0.b.i;
                u1eVar.getClass();
                if (((e2e) ((d2e) u1eVar).t0.getValue()).a == f2e.a) {
                    xfh.r(h21VarY0.s0, xm1.D);
                    return;
                }
            }
            ((v11) h21VarY0.t()).j(z);
            return;
        }
        if (i == j0b.k) {
            v11 v11Var4 = (v11) h21VarY0.t();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                v11Var4.getClass();
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "CallAdminSettingsController", xc0.f("Waiting room change state to ", z), null);
                }
            }
            Conversation conversationA = v11Var4.d().a();
            if (conversationA != null) {
                Conversation.setWaitingRoomEnabled$default(conversationA, z, null, 2, null);
            }
        }
    }

    public lu1 y(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("id");
                arrayList.add(new st1(new tt1(ti1.a(jSONObject3.getString("id")), jSONObject3.getLong("addedTs")), paj.h(jSONObject2)));
            }
            return new lu1(jSONObject.optInt("totalCount", 0), arrayList, jSONObject.optBoolean("hasMore", false));
        } catch (JSONException e) {
            ((y6d) this.b).log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }

    public void z(String str, Bitmap bitmap) {
        Integer num = (Integer) x19.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(ho7.i("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public /* synthetic */ mc5(int i, boolean z) {
        this.a = i;
    }

    public mc5(Resources resources) throws Resources.NotFoundException, IOException {
        this.a = 0;
        wqi.c(mc5.class.getName(), "Create emoji tree from bin. Start", new Object[0]);
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(eab.a);
            try {
                byte[] bArr = new byte[4];
                inputStreamOpenRawResource.read(bArr);
                int i = 0;
                char c = 24;
                this.b = new long[(bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)];
                byte[] bArr2 = new byte[inputStreamOpenRawResource.available() & (-8)];
                int i2 = 0;
                while (true) {
                    int i3 = inputStreamOpenRawResource.read(bArr2);
                    if (i3 != -1) {
                        int i4 = i3 / 8;
                        int i5 = i;
                        while (i5 < i4) {
                            int i6 = i5 * 8;
                            char c2 = c;
                            ((long[]) this.b)[i2 + i5] = ((bArr2[i6 + 1] & 255) << 48) | (bArr2[i6] << 56) | ((bArr2[i6 + 2] & 255) << 40) | ((bArr2[i6 + 3] & 255) << 32) | ((bArr2[i6 + 4] & 255) << c2) | ((bArr2[i6 + 5] & 255) << 16) | ((bArr2[i6 + 6] & 255) << 8) | (bArr2[i6 + 7] & 255);
                            i5++;
                            c = c2;
                            i4 = i4;
                        }
                        i2 += i4;
                        i = 0;
                    } else {
                        wqi.c(mc5.class.getName(), "Create emoji tree from bin. Finish. Size:" + ((long[]) this.b).length, new Object[0]);
                        inputStreamOpenRawResource.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            wqi.e(mc5.class.getName(), "Can't create emoji tree from bin", e);
            throw e;
        }
    }

    public mc5(v57 v57Var) {
        this.a = 14;
        List list = Collections.EMPTY_LIST;
        this.b = v57Var;
    }

    public mc5(kz4 kz4Var, ArrayList arrayList) {
        this.a = 3;
    }

    public mc5(int i, int i2, int i3, int i4) {
        b17 b17Var;
        this.a = 4;
        int iV = az1.v(i4);
        b17 b17Var2 = null;
        if (iV == 0) {
            b17Var = b17.a;
        } else if (iV == 1) {
            b17Var = b17.b;
        } else {
            if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b17Var = null;
        }
        if (i == 2 && i3 == 1 && ((i4 == 1 || i4 == 2) && i2 == 1)) {
            b17Var2 = b17Var;
        }
        this.b = b17Var2;
    }

    public mc5(int i) {
        Object objF;
        this.a = i;
        switch (i) {
            case 18:
                this.b = new SparseArray();
                return;
            case 21:
                this.b = new Bundle();
                return;
            case 23:
                this.b = new umb();
                return;
            case 29:
                this.b = new LinkedHashMap();
                return;
            default:
                x8a x8aVarB = x8a.b();
                this.b = x8aVarB;
                Object objF2 = null;
                try {
                    objF = x8aVarB.f(a2g.f0);
                } catch (IllegalArgumentException unused) {
                    objF = null;
                }
                Class cls = (Class) objF;
                if (cls != null && !cls.equals(q32.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                x8a x8aVar = (x8a) this.b;
                x8aVar.n(a2g.f0, q32.class);
                try {
                    objF2 = x8aVar.f(a2g.e0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objF2 == null) {
                    x8aVar.n(a2g.e0, q32.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
