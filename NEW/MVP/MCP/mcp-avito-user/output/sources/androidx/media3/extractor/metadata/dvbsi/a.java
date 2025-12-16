package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.y;
import androidx.media3.extractor.metadata.c;
import com.google.common.base.C37262f;
import j.P;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
@J
/* loaded from: classes.dex */
public final class a extends c {
    @Override // androidx.media3.extractor.metadata.c
    @P
    public final Metadata b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        y yVar = new y(byteBuffer.array(), byteBuffer.limit());
        yVar.n(12);
        int iD2 = (yVar.d() + yVar.g(12)) - 4;
        yVar.n(44);
        yVar.o(yVar.g(12));
        yVar.n(16);
        ArrayList arrayList = new ArrayList();
        while (yVar.d() < iD2) {
            yVar.n(48);
            int iG2 = yVar.g(8);
            yVar.n(4);
            int iD3 = yVar.d() + yVar.g(12);
            String str = null;
            String str2 = null;
            while (yVar.d() < iD3) {
                int iG3 = yVar.g(8);
                int iG4 = yVar.g(8);
                int iD4 = yVar.d() + iG4;
                if (iG3 == 2) {
                    int iG5 = yVar.g(16);
                    yVar.n(8);
                    if (iG5 == 3) {
                        while (yVar.d() < iD4) {
                            int iG6 = yVar.g(8);
                            Charset charset = C37262f.f359032a;
                            byte[] bArr = new byte[iG6];
                            yVar.i(iG6, bArr);
                            str = new String(bArr, charset);
                            int iG7 = yVar.g(8);
                            for (int i12 = 0; i12 < iG7; i12++) {
                                yVar.o(yVar.g(8));
                            }
                        }
                    }
                } else if (iG3 == 21) {
                    Charset charset2 = C37262f.f359032a;
                    byte[] bArr2 = new byte[iG4];
                    yVar.i(iG4, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                yVar.l(iD4 * 8);
            }
            yVar.l(iD3 * 8);
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
