package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sl1;
import com.yandex.mobile.ads.impl.vm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class lh0 extends d41 {

    /* renamed from: m, reason: collision with root package name */
    private final pr0 f387484m = new pr0();

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) throws v71 {
        vm vmVarA;
        this.f387484m.a(i12, bArr);
        ArrayList arrayList = new ArrayList();
        while (this.f387484m.a() > 0) {
            if (this.f387484m.a() < 8) {
                throw new v71("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iH2 = this.f387484m.h();
            if (this.f387484m.h() == 1987343459) {
                pr0 pr0Var = this.f387484m;
                int i13 = iH2 - 8;
                CharSequence charSequenceA = null;
                vm.a aVarA = null;
                while (i13 > 0) {
                    if (i13 < 8) {
                        throw new v71("Incomplete vtt cue box header found.");
                    }
                    int iH3 = pr0Var.h();
                    int iH4 = pr0Var.h();
                    int i14 = iH3 - 8;
                    String strA = pc1.a(pr0Var.c(), pr0Var.d(), i14);
                    pr0Var.f(i14);
                    i13 = (i13 - 8) - i14;
                    if (iH4 == 1937011815) {
                        aVarA = sl1.a(strA);
                    } else if (iH4 == 1885436268) {
                        charSequenceA = sl1.a(null, strA.trim(), Collections.emptyList());
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (aVarA != null) {
                    vmVarA = aVarA.a(charSequenceA).a();
                } else {
                    Pattern pattern = sl1.f389982a;
                    sl1.d dVar = new sl1.d();
                    dVar.f389997c = charSequenceA;
                    vmVarA = dVar.a().a();
                }
                arrayList.add(vmVarA);
            } else {
                this.f387484m.f(iH2 - 8);
            }
        }
        return new mh0(arrayList);
    }
}
