package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e3h implements grf {
    public static final Size Y = new Size(1280, 720);
    public static final Range Z = new Range(1, 60);
    public final Range X;
    public final String a;
    public final f9g b;
    public final fc0 c;
    public final Size d;
    public final u75 o;

    public e3h(String str, f9g f9gVar, fc0 fc0Var, Size size, u75 u75Var, Range range) {
        this.a = str;
        this.b = f9gVar;
        this.c = fc0Var;
        this.d = size;
        this.o = u75Var;
        this.X = range;
    }

    @Override // defpackage.grf
    public final Object get() {
        Integer num;
        Range range = msf.p;
        Range range2 = this.X;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) Z.clamp((Integer) range2.getUpper())).intValue() : 30;
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        gri.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj));
        gri.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range range3 = this.c.c;
        gri.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        u75 u75Var = this.o;
        int i = u75Var.b;
        Size size = this.d;
        int width = size.getWidth();
        Size size2 = Y;
        int iC = e2h.c(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range3);
        HashMap map = x75.e;
        String str = this.a;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(u75Var)) == null) ? -1 : num.intValue();
        cc0 cc0VarA = e2h.a(iIntValue2, str);
        j35 j35VarD = bc0.d();
        j35VarD.b = str;
        f9g f9gVar = this.b;
        if (f9gVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        j35VarD.d = f9gVar;
        j35VarD.o = size;
        j35VarD.t0 = Integer.valueOf(iC);
        j35VarD.Z = Integer.valueOf(iIntValue);
        j35VarD.c = Integer.valueOf(iIntValue2);
        j35VarD.Y = cc0VarA;
        return j35VarD.g();
    }
}
