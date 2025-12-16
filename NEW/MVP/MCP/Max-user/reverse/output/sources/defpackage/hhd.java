package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final /* synthetic */ class hhd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lhd b;

    public /* synthetic */ hhd(lhd lhdVar, int i) {
        this.a = i;
        this.b = lhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lhd lhdVar = this.b;
                try {
                    lhdVar.e();
                    break;
                } catch (Exception e) {
                    lhdVar.g.error("Runtime exception occurred while running loss detection timeout handler", e);
                    return;
                }
            case 1:
                rde rdeVar = this.b.f;
                Object[] objArr = {new r0c(), new ulb(2)};
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                rdeVar.i(Collections.unmodifiableList(arrayList), hf5.a);
                break;
            default:
                rde rdeVar2 = this.b.f;
                Object[] objArr2 = {new r0c(), new ulb(2)};
                ArrayList arrayList2 = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    Object obj2 = objArr2[i2];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                }
                rdeVar2.i(Collections.unmodifiableList(arrayList2), hf5.c);
                break;
        }
    }
}
