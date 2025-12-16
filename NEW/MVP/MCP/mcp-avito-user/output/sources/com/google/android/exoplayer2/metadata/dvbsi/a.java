package com.google.android.exoplayer2.metadata.dvbsi;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.c;
import com.google.android.exoplayer2.metadata.f;
import com.google.android.exoplayer2.util.E;
import com.google.common.base.C37262f;
import j.P;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes6.dex */
public final class a extends f {
    @Override // com.google.android.exoplayer2.metadata.f
    @P
    public final Metadata b(c cVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        E e12 = new E(byteBuffer.array(), byteBuffer.limit());
        e12.m(12);
        int iD2 = (e12.d() + e12.g(12)) - 4;
        e12.m(44);
        e12.n(e12.g(12));
        e12.m(16);
        ArrayList arrayList = new ArrayList();
        while (e12.d() < iD2) {
            e12.m(48);
            int iG2 = e12.g(8);
            e12.m(4);
            int iD3 = e12.d() + e12.g(12);
            String str = null;
            String str2 = null;
            while (e12.d() < iD3) {
                int iG3 = e12.g(8);
                int iG4 = e12.g(8);
                int iD4 = e12.d() + iG4;
                if (iG3 == 2) {
                    int iG5 = e12.g(16);
                    e12.m(8);
                    if (iG5 == 3) {
                        while (e12.d() < iD4) {
                            int iG6 = e12.g(8);
                            Charset charset = C37262f.f359032a;
                            byte[] bArr = new byte[iG6];
                            e12.i(iG6, bArr);
                            str = new String(bArr, charset);
                            int iG7 = e12.g(8);
                            for (int i12 = 0; i12 < iG7; i12++) {
                                e12.n(e12.g(8));
                            }
                        }
                    }
                } else if (iG3 == 21) {
                    Charset charset2 = C37262f.f359032a;
                    byte[] bArr2 = new byte[iG4];
                    e12.i(iG4, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                e12.k(iD4 * 8);
            }
            e12.k(iD3 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(iG2, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
