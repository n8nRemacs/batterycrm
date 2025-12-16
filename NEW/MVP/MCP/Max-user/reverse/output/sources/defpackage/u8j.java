package defpackage;

import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class u8j {
    public static final /* synthetic */ int a = 0;

    public static void a(View view, p6 p6Var) {
        vk3 vk3Var = new vk3(9, view);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        new ota(vk3Var, 300L, j0eVarA, 0).l(de.a()).a(new v08(new zvd(p6Var), new ycd(3), pdf.d));
    }

    public static final int b(st4 st4Var) {
        switch (tt4.$EnumSwitchMapping$0[st4Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
