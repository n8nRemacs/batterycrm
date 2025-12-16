package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* loaded from: classes.dex */
public abstract class ko8 {
    public static final ArrayList a(List list, int i, int i2) {
        ArrayList arrayListI0 = ue3.i0(list, i, i);
        ArrayList arrayList = new ArrayList(we3.q(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                ve3.p();
                throw null;
            }
            arrayList.add(new zib((List) next, i3, i2));
            i3 = i4;
        }
        return arrayList;
    }

    public static final a71 b(CallsAudioDeviceInfo callsAudioDeviceInfo) {
        int i = jo8.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? new v61(callsAudioDeviceInfo) : i != 5 ? new y61(callsAudioDeviceInfo) : new x61(callsAudioDeviceInfo) : new w61(callsAudioDeviceInfo) : new z61(callsAudioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vd1 c(defpackage.cnb r39, boolean r40, boolean r41, boolean r42, defpackage.mr1 r43, defpackage.co5 r44, defpackage.zi1 r45) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko8.c(cnb, boolean, boolean, boolean, mr1, co5, zi1):vd1");
    }

    public static final gn1 d(e2e e2eVar, cnb cnbVar, boolean z) {
        t1e t1eVar;
        bj1 bj1Var = cnbVar.a;
        zi1 zi1Var = (e2eVar == null || (t1eVar = e2eVar.b) == null) ? null : t1eVar.c;
        return new gn1(fni.a(zi1Var, bj1Var.getId()), bj1Var.m(), (e2eVar != null ? e2eVar.a : null) == f2e.a, zi1Var, !z, e2eVar != null ? e2eVar.d : null);
    }

    public static final bn8 e(vd1 vd1Var, vc1 vc1Var, mr1 mr1Var) {
        boolean z;
        SpannableStringBuilder spannableStringBuilderH;
        wd0 wd0Var = vd1Var.o;
        String str = vd1Var.b;
        zi1 zi1Var = vd1Var.a;
        boolean z2 = vc1Var.g;
        boolean z3 = z2 ? false : vd1Var.X;
        boolean z4 = vd1Var.Z;
        boolean z5 = vd1Var.Y;
        boolean z6 = vc1Var.m;
        txg txgVar = vd1Var.y0;
        boolean z7 = vd1Var.v0;
        int i = vd1Var.A0;
        if (vc1Var.t || z2) {
            z = z4;
            spannableStringBuilderH = null;
        } else {
            spannableStringBuilderH = mr1Var.h(z7, i, str, z2, z4, z6, txgVar.g, vc1Var.e);
            i = i;
            z = z4;
            z6 = z6;
        }
        return new bn8(wd0Var, str, zi1Var, z3, z6, z5, z, txgVar, z7, vd1Var.u0, i, spannableStringBuilderH, vd1Var.d);
    }

    public static final xib f(vd1 vd1Var, boolean z, boolean z2, boolean z3) {
        zi1 zi1Var = vd1Var.a;
        wd0 wd0Var = vd1Var.o;
        boolean z4 = z ? vd1Var.X : false;
        String str = vd1Var.b;
        CharSequence charSequence = vd1Var.c;
        boolean z5 = (z2 || z3) ? vd1Var.Z : false;
        txg txgVar = vd1Var.y0;
        uxg uxgVar = vd1Var.z0;
        if (!z) {
            uxgVar = null;
        }
        if (uxgVar == null) {
            uxgVar = uxg.d;
        }
        return new xib(wd0Var, str, zi1Var, z4, vd1Var.t0, z5, txgVar, uxgVar, vd1Var.v0, charSequence);
    }
}
