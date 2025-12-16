package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;

/* loaded from: classes.dex */
public abstract class zi6 {
    public static final yi6 a = yi6.a;

    public static yi6 a(a aVar) {
        while (aVar != null) {
            if (aVar.F()) {
                aVar.x();
            }
            aVar = aVar.G0;
        }
        return a;
    }

    public static void b(Violation violation) {
        if (c.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.a.getClass().getName()), violation);
        }
    }

    public static final void c(a aVar, String str) {
        b(new FragmentReuseViolation(aVar, "Attempting to reuse fragment " + aVar + " with previous ID " + str));
        a(aVar).getClass();
    }
}
