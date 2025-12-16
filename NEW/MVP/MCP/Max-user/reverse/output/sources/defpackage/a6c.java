package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a6c {
    public static final int a = rzc.pooling_container_listener_holder_tag;
    public static final int b = rzc.is_pooling_container_tag;

    /* JADX WARN: Type inference failed for: r3v3, types: [dpd, sm6] */
    public static final void a(View view) {
        fee feeVarB = mee.b((dpd) jqi.e(view).b);
        while (feeVarB.hasNext()) {
            View view2 = (View) feeVarB.next();
            int i = a;
            b6c b6cVar = (b6c) view2.getTag(i);
            if (b6cVar == null) {
                b6cVar = new b6c();
                view2.setTag(i, b6cVar);
            }
            ArrayList arrayList = b6cVar.a;
            int i2 = ve3.i(arrayList);
            if (-1 < i2) {
                throw xrf.n(arrayList, i2);
            }
        }
    }
}
