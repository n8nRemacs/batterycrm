package b61;

import java.util.ArrayList;
import net.bytebuddy.jar.asm.C44390c;
import net.bytebuddy.jar.asm.C44391d;

/* compiled from: ModuleHashesAttribute.java */
/* loaded from: classes7.dex */
public final class e extends C44390c {

    /* renamed from: d, reason: collision with root package name */
    public final String f56925d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f56926e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f56927f;

    public e(String str, ArrayList arrayList, ArrayList arrayList2) {
        super("ModuleHashes");
        this.f56925d = str;
        this.f56926e = arrayList;
        this.f56927f = arrayList2;
    }

    @Override // net.bytebuddy.jar.asm.C44390c
    public final C44390c c(net.bytebuddy.jar.asm.e eVar, int i12, int i13, char[] cArr) {
        String strS = eVar.s(i12, cArr);
        int iT2 = eVar.t(i12 + 2);
        int i14 = i12 + 4;
        ArrayList arrayList = new ArrayList(iT2);
        ArrayList arrayList2 = new ArrayList(iT2);
        for (int i15 = 0; i15 < iT2; i15++) {
            arrayList.add(eVar.p(i14, cArr));
            int iT3 = eVar.t(i14 + 2);
            i14 += 4;
            byte[] bArr = new byte[iT3];
            for (int i16 = 0; i16 < iT3; i16++) {
                bArr[i16] = (byte) eVar.g(i14);
                i14++;
            }
            arrayList2.add(bArr);
        }
        return new e(strS, arrayList, arrayList2);
    }

    @Override // net.bytebuddy.jar.asm.C44390c
    public final C44391d d(net.bytebuddy.jar.asm.g gVar) {
        C44391d c44391d = new C44391d();
        c44391d.j(gVar.t(this.f56925d));
        ArrayList arrayList = this.f56926e;
        if (arrayList == null) {
            c44391d.j(0);
        } else {
            int size = arrayList.size();
            c44391d.j(size);
            for (int i12 = 0; i12 < size; i12++) {
                String str = (String) arrayList.get(i12);
                byte[] bArr = (byte[]) this.f56927f.get(i12);
                c44391d.j(gVar.s(str));
                c44391d.j(bArr.length);
                c44391d.h(0, bArr.length, bArr);
            }
        }
        return c44391d;
    }

    public e() {
        this(null, null, null);
    }
}
