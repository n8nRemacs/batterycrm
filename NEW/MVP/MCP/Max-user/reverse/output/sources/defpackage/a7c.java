package defpackage;

import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class a7c implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a7c(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                return ((e7c) ((c7c) this.b).b.getValue()).a(null, (si9) this.c);
            case 1:
                ((Handler) this.b).post(new tld((xo8) this.c, ((Long) obj).longValue()));
                return qqg.a;
            case 2:
                drd drdVar = (drd) this.b;
                drdVar.getClass();
                return drd.c(drdVar, (List) this.c, (Continuation) obj);
            case 3:
                ((ChatsListSearchScreen) ((c14) this.b).X).A0((j6e) this.c);
                return qqg.a;
            case 4:
                x6e x6eVar = (x6e) this.b;
                u6e u6eVar = (u6e) this.c;
                f7c f7cVarI = x6eVar.b().i((String) obj);
                return new f7c(uzi.h(a93.s0.x(x6eVar.a).k(), f7cVarI, uzi.f(f7cVarI.a.toString(), u6eVar.c)), f7cVarI.b);
            case 5:
                String str = (String) this.b;
                dx0 dx0Var = (dx0) this.c;
                to8.o((xl7) obj, str, dx0Var.a, dx0Var.b, true);
                return qqg.a;
            case 6:
                SettingsPrivacyScreen settingsPrivacyScreen = (SettingsPrivacyScreen) this.b;
                RecyclerView recyclerView = (RecyclerView) this.c;
                em6 em6VarR = ((i8e) ((t98) settingsPrivacyScreen.Y.C(((Integer) obj).intValue()))).r();
                return Integer.valueOf(em6VarR != null ? ((Number) em6VarR.invoke(a93.s0.y(recyclerView))).intValue() : Integer.MIN_VALUE);
            case 7:
                uve uveVar = (uve) this.b;
                return new n18(uveVar.a, new ax5((String) this.c), uveVar.c, null, 24);
            case 8:
                e5f e5fVar = (e5f) this.b;
                pb2 pb2Var = (pb2) this.c;
                ku3 ku3Var = (ku3) obj;
                int iOrdinal = e5fVar.b.ordinal();
                boolean zH = true;
                if (iOrdinal != 0 && iOrdinal == 1) {
                    zH = pb2Var.H(ku3Var.p());
                }
                return Boolean.valueOf(zH);
            case 9:
                Set set = (Set) this.b;
                lz9 lz9Var = (lz9) this.c;
                ku3 ku3Var2 = (ku3) obj;
                if (set.contains(Long.valueOf(ku3Var2.p()))) {
                    if (!ku3Var2.v()) {
                        lz9Var.getClass();
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                z95 z95Var = (z95) this.b;
                String str2 = (String) this.c;
                ar2 ar2Var = (ar2) obj;
                gx3 gx3Var = ar2Var.a;
                String strB = m6g.b(gx3Var.v0);
                ArrayList arrayList = new ArrayList();
                List list = ar2Var.a.o;
                z95Var.getClass();
                z95.i(arrayList, list);
                return ((ssb) z95Var.c).m(gx3Var.a, arrayList, strB, str2, gx3Var.d(il0.c), po8.j(ar2Var.b), ((mce) ((k18) z95Var.d).getValue()).a(gx3Var.a));
            case 11:
                t5g t5gVar = (t5g) this.b;
                b5g b5gVar = (b5g) this.c;
                TextPaint textPaint = new TextPaint();
                t5gVar.a(b5gVar.a, textPaint, b5gVar.b.getResources().getDisplayMetrics(), (t75) b5gVar.c.a.a.getValue());
                return textPaint;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new b26(obj, (em6) this.b, (em6) this.c);
            case 13:
                to8.u((x00) obj, (p10) this.b, ((w4e) ((pb3) ((htg) this.c).c.getValue())).j());
                return qqg.a;
            default:
                uvh uvhVar = (uvh) this.b;
                szh szhVar = (szh) this.c;
                return ((Vibrator) uvhVar.D0.getValue()).hasAmplitudeControl() ? VibrationEffect.createWaveform(szhVar.a, szhVar.b, -1) : VibrationEffect.createWaveform(szhVar.c, -1);
        }
    }
}
