package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23116g;
import androidx.media3.container.b;
import j.P;
import java.util.ArrayList;

/* compiled from: AvcConfig.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23185d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f50489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50491c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50492d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50493e;

    /* renamed from: f, reason: collision with root package name */
    public final int f50494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f50495g;

    /* renamed from: h, reason: collision with root package name */
    public final float f50496h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final String f50497i;

    public C23185d(ArrayList arrayList, int i12, int i13, int i14, int i15, int i16, int i17, float f12, @P String str) {
        this.f50489a = arrayList;
        this.f50490b = i12;
        this.f50491c = i13;
        this.f50492d = i14;
        this.f50493e = i15;
        this.f50494f = i16;
        this.f50495g = i17;
        this.f50496h = f12;
        this.f50497i = str;
    }

    public static C23185d a(androidx.media3.common.util.z zVar) throws ParserException {
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f12;
        String str;
        try {
            zVar.G(4);
            int iU2 = (zVar.u() & 3) + 1;
            if (iU2 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU3 = zVar.u() & 31;
            int i17 = 0;
            while (true) {
                bArr = C23116g.f47902a;
                if (i17 >= iU3) {
                    break;
                }
                int iZ2 = zVar.z();
                int i18 = zVar.f47963b;
                zVar.G(iZ2);
                byte[] bArr2 = zVar.f47962a;
                byte[] bArr3 = new byte[iZ2 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i18, bArr3, 4, iZ2);
                arrayList.add(bArr3);
                i17++;
            }
            int iU4 = zVar.u();
            for (int i19 = 0; i19 < iU4; i19++) {
                int iZ3 = zVar.z();
                int i22 = zVar.f47963b;
                zVar.G(iZ3);
                byte[] bArr4 = zVar.f47962a;
                byte[] bArr5 = new byte[iZ3 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i22, bArr5, 4, iZ3);
                arrayList.add(bArr5);
            }
            if (iU3 > 0) {
                b.c cVarD = androidx.media3.container.b.d(iU2, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i23 = cVarD.f48140e;
                int i24 = cVarD.f48141f;
                int i25 = cVarD.f48149n;
                int i26 = cVarD.f48150o;
                int i27 = cVarD.f48151p;
                float f13 = cVarD.f48142g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cVarD.f48136a), Integer.valueOf(cVarD.f48137b), Integer.valueOf(cVarD.f48138c));
                i14 = i25;
                i15 = i26;
                i16 = i27;
                f12 = f13;
                i12 = i23;
                i13 = i24;
            } else {
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                f12 = 1.0f;
                str = null;
            }
            return new C23185d(arrayList, iU2, i12, i13, i14, i15, i16, f12, str);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw ParserException.a("Error parsing AVC config", e12);
        }
    }
}
