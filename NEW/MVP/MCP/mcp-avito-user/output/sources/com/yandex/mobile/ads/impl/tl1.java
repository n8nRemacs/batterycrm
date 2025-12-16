package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class tl1 extends d41 {

    /* renamed from: m, reason: collision with root package name */
    private final pr0 f390225m = new pr0();

    /* renamed from: n, reason: collision with root package name */
    private final pl1 f390226n = new pl1();

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) throws v71 {
        rl1 rl1VarA;
        this.f390225m.a(i12, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            ul1.a(this.f390225m);
            while (!TextUtils.isEmpty(this.f390225m.j())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                pr0 pr0Var = this.f390225m;
                int iD2 = 0;
                char c12 = 65535;
                while (c12 == 65535) {
                    iD2 = pr0Var.d();
                    String strJ = pr0Var.j();
                    c12 = strJ == null ? (char) 0 : "STYLE".equals(strJ) ? (char) 2 : strJ.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                pr0Var.e(iD2);
                if (c12 == 0) {
                    return new vl1(arrayList2);
                }
                if (c12 == 1) {
                    while (!TextUtils.isEmpty(this.f390225m.j())) {
                    }
                } else if (c12 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new v71("A style block was found after the first cue.");
                    }
                    this.f390225m.j();
                    arrayList.addAll(this.f390226n.a(this.f390225m));
                } else if (c12 == 3 && (rl1VarA = sl1.a(this.f390225m, arrayList)) != null) {
                    arrayList2.add(rl1VarA);
                }
            }
        } catch (tr0 e12) {
            throw new v71(e12);
        }
    }
}
