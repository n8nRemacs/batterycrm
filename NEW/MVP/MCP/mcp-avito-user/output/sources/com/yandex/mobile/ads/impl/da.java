package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class da extends b41 {
    @Override // com.yandex.mobile.ads.impl.b41
    @j.P
    public final Metadata a(hg0 hg0Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        or0 or0Var = new or0(byteBuffer.limit(), byteBuffer.array());
        or0Var.d(12);
        int iD2 = (or0Var.d() + or0Var.b(12)) - 4;
        or0Var.d(44);
        or0Var.e(or0Var.b(12));
        or0Var.d(16);
        ArrayList arrayList = new ArrayList();
        while (or0Var.d() < iD2) {
            or0Var.d(48);
            int iB2 = or0Var.b(8);
            or0Var.d(4);
            int iD3 = or0Var.d() + or0Var.b(12);
            String strA = null;
            String strA2 = null;
            while (or0Var.d() < iD3) {
                int iB3 = or0Var.b(8);
                int iB4 = or0Var.b(8);
                int iD4 = or0Var.d() + iB4;
                if (iB3 == 2) {
                    int iB5 = or0Var.b(16);
                    or0Var.d(8);
                    if (iB5 == 3) {
                        while (or0Var.d() < iD4) {
                            strA = or0Var.a(or0Var.b(8), oi.f388552a);
                            int iB6 = or0Var.b(8);
                            for (int i12 = 0; i12 < iB6; i12++) {
                                or0Var.e(or0Var.b(8));
                            }
                        }
                    }
                } else if (iB3 == 21) {
                    strA2 = or0Var.a(iB4, oi.f388552a);
                }
                or0Var.c(iD4 * 8);
            }
            or0Var.c(iD3 * 8);
            if (strA != null && strA2 != null) {
                arrayList.add(new AppInfoTable(iB2, up1.a(strA, strA2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
