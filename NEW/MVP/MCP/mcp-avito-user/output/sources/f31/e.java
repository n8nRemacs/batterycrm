package F31;

import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import q71.C47248a;
import q71.C47249b;

/* loaded from: classes8.dex */
public abstract class e {
    public static final void a(b bVar, A a12, int i12) {
        B bE2 = a12.E(1756744957);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bVar = b.f4526l;
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            org.koin.mp.d.f421487a.getClass();
            C47249b.f429044a.getClass();
            if (C47249b.f429045b == null) {
                C47248a.a(new c(context, bVar));
            }
            y31.c.f442881c = true;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new d(bVar, i12);
    }
}
