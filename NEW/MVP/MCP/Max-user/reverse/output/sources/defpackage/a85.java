package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class a85 implements y75 {
    public static final iv6 a = new iv6(16, new a85());
    public static final Set b = Collections.singleton(u75.d);

    @Override // defpackage.y75
    public final Set a() {
        return b;
    }

    @Override // defpackage.y75
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // defpackage.y75
    public final Set c(u75 u75Var) {
        z5j.a("DynamicRange is not supported: " + u75Var, u75.d.equals(u75Var));
        return b;
    }
}
