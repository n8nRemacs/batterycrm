package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class mq extends j94 {
    public static k18 b;
    public static final mq a = new mq();
    public static final bwf c = new bwf(new l(7));
    public static final bwf d = new bwf(new l(8));

    @Override // defpackage.j94
    public final void a(String str, Throwable th) {
        k18 k18Var;
        l5c l5cVar;
        if (th instanceof CancellationException) {
            return;
        }
        bwf bwfVar = d;
        if (str != null && str.length() != 0) {
            if (((jeg) bwfVar.getValue()) != null) {
                jeg.b(null, th, str);
            }
        } else if (((th instanceof Error) || !((k18Var = b) == null || (l5cVar = (l5c) k18Var.getValue()) == null || !l5cVar.j(PmsKey.f146tracernonfatalcrashedenabled, true))) && ((jeg) bwfVar.getValue()) != null) {
            jeg.b(null, th, null);
        }
    }

    @Override // defpackage.j94
    public final void b(String str, String str2) {
        if (((feg) c.getValue()) != null) {
            feg.e(str, str2);
        }
    }
}
