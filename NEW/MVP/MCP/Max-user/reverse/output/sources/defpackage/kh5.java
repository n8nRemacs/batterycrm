package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kh5 implements gof {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ kh5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public zf3 a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n5g n5gVarA = ((kyg) it.next()).a(i, str);
            if (n5gVarA != null) {
                arrayList.add(n5gVarA);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new zf3(arrayList);
        }
        return null;
    }

    @Override // defpackage.gof
    public int e(long j) {
        switch (this.a) {
            case 1:
                if (j < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // defpackage.gof
    public long g(int i) {
        switch (this.a) {
            case 1:
                fsi.b(i == 0);
                break;
        }
        return 0L;
    }

    @Override // defpackage.gof
    public List m(long j) {
        switch (this.a) {
            case 1:
                return j >= 0 ? this.b : Collections.EMPTY_LIST;
            default:
                return this.b;
        }
    }

    @Override // defpackage.gof
    public int s() {
        switch (this.a) {
        }
        return 1;
    }

    public kh5(ArrayList arrayList) {
        this.a = 1;
        this.b = Collections.unmodifiableList(arrayList);
    }
}
