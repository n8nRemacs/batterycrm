package defpackage;

import android.content.Context;
import android.net.Uri;
import java.net.Proxy;
import java.net.URI;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes2.dex */
public final class un5 extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un5(Object obj, int i, Object obj2) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public List a() {
        URI uriI = ((ga7) this.c).i();
        if (uriI.getHost() == null) {
            return yxg.k(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = ((aa) ((a9) this.b).e).j.select(uriI);
        return (listSelect == null || listSelect.isEmpty()) ? yxg.k(Proxy.NO_PROXY) : yxg.w(listSelect);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        dgh dghVarD;
        switch (this.a) {
            case 0:
                ys4 ys4Var = (ys4) this.b;
                z3e z3eVar = (z3e) this.c;
                Uri uriA = z3eVar.a();
                rm rmVar = (rm) ys4Var.a;
                tl tlVar = z3eVar.a;
                rmVar.setSessionInfo(new qm(tlVar.c, tlVar.d, uriA != null ? uriA.toString() : null));
                return qqg.a;
            case 1:
                return a();
            case 2:
                ggh gghVar = (ggh) this.c.getValue();
                s07 s07Var = gghVar instanceof s07 ? (s07) gghVar : null;
                return (s07Var == null || (dghVarD = s07Var.d()) == null) ? ((ScheduledSendPickerDialogFragment) this.b).d() : dghVarD;
            case 3:
                return new w55(jz5.g(jz5.g(((Context) this.b).getCacheDir(), "tracer-lite-".concat((String) this.c)), "drops.json"));
            default:
                try {
                    return new HardwareVideoEncoderFactory((EglBase.Context) this.b, false, false);
                } catch (Throwable th) {
                    return new mob(((nob) this.c).a, new IllegalStateException("Can't create HardwareVideoEncoder", th));
                }
        }
    }
}
