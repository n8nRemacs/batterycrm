package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class whb implements hof {
    public final /* synthetic */ int a;
    public final List b;
    public final long[] c;
    public final long[] d;

    public whb(ArrayList arrayList, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = Collections.unmodifiableList(new ArrayList(arrayList));
                this.c = new long[arrayList.size() * 2];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    l1i l1iVar = (l1i) arrayList.get(i2);
                    int i3 = i2 * 2;
                    long[] jArr = this.c;
                    jArr[i3] = l1iVar.b;
                    jArr[i3 + 1] = l1iVar.c;
                }
                long[] jArr2 = this.c;
                long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.d = jArrCopyOf;
                Arrays.sort(jArrCopyOf);
                break;
            default:
                this.b = Collections.unmodifiableList(new ArrayList(arrayList));
                this.c = new long[arrayList.size() * 2];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    l1i l1iVar2 = (l1i) arrayList.get(i4);
                    int i5 = i4 * 2;
                    long[] jArr3 = this.c;
                    jArr3[i5] = l1iVar2.b;
                    jArr3[i5 + 1] = l1iVar2.c;
                }
                long[] jArr4 = this.c;
                long[] jArrCopyOf2 = Arrays.copyOf(jArr4, jArr4.length);
                this.d = jArrCopyOf2;
                Arrays.sort(jArrCopyOf2);
                break;
        }
    }

    @Override // defpackage.hof
    public final int e(long j) {
        switch (this.a) {
            case 0:
                long[] jArr = this.d;
                int iA = zxg.a(jArr, j, false);
                if (iA < jArr.length) {
                    return iA;
                }
                return -1;
            default:
                long[] jArr2 = this.d;
                int iA2 = zxg.a(jArr2, j, false);
                if (iA2 < jArr2.length) {
                    return iA2;
                }
                return -1;
        }
    }

    @Override // defpackage.hof
    public final long g(int i) {
        switch (this.a) {
            case 0:
                hsi.b(i >= 0);
                long[] jArr = this.d;
                hsi.b(i < jArr.length);
                return jArr[i];
            default:
                hsi.b(i >= 0);
                long[] jArr2 = this.d;
                hsi.b(i < jArr2.length);
                return jArr2[i];
        }
    }

    @Override // defpackage.hof
    public final List m(long j) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                while (true) {
                    List list = this.b;
                    if (i >= list.size()) {
                        Collections.sort(arrayList2, new ov5(17));
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            fb4 fb4VarA = ((l1i) arrayList2.get(i2)).a.a();
                            fb4VarA.e = (-1) - i2;
                            fb4VarA.f = 1;
                            arrayList.add(fb4VarA.a());
                        }
                        return arrayList;
                    }
                    int i3 = i * 2;
                    long[] jArr = this.c;
                    if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                        l1i l1iVar = (l1i) list.get(i);
                        hb4 hb4Var = l1iVar.a;
                        if (hb4Var.e == -3.4028235E38f) {
                            arrayList2.add(l1iVar);
                        } else {
                            arrayList.add(hb4Var);
                        }
                    }
                    i++;
                }
                break;
            default:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i4 = 0;
                while (true) {
                    List list2 = this.b;
                    if (i4 >= list2.size()) {
                        Collections.sort(arrayList4, new n7f(6));
                        for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                            fb4 fb4VarA2 = ((l1i) arrayList4.get(i5)).a.a();
                            fb4VarA2.e = (-1) - i5;
                            fb4VarA2.f = 1;
                            arrayList3.add(fb4VarA2.a());
                        }
                        return arrayList3;
                    }
                    int i6 = i4 * 2;
                    long[] jArr2 = this.c;
                    if (jArr2[i6] <= j && j < jArr2[i6 + 1]) {
                        l1i l1iVar2 = (l1i) list2.get(i4);
                        hb4 hb4Var2 = l1iVar2.a;
                        if (hb4Var2.e == -3.4028235E38f) {
                            arrayList4.add(l1iVar2);
                        } else {
                            arrayList3.add(hb4Var2);
                        }
                    }
                    i4++;
                }
                break;
        }
    }

    @Override // defpackage.hof
    public final int s() {
        switch (this.a) {
        }
        return this.d.length;
    }
}
