package defpackage;

import java.util.Map;
import java.util.function.Consumer;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes3.dex */
public final /* synthetic */ class sb3 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ sb3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                qa7.a(qa7.a, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                break;
            case 3:
                kvg kvgVar = kvg.g;
                String str = ((w10) obj).r;
                kvgVar.getClass();
                yqb.e(kvgVar, jvg.MESSAGE_DELETED, str);
                break;
            case 4:
                break;
            case 5:
                ((Runnable) obj).run();
                break;
            case 6:
                break;
            case 7:
                ((mde) obj).b(true);
                break;
            case 8:
                ((ca7) obj).e(386759528L);
                break;
            case 9:
                ((ca7) obj).d(386759528L);
                break;
            case 10:
                System.err.println("No handler set for incoming unidirectional stream.");
                break;
            case 11:
                System.err.println("No handler set for incoming bidirectional stream.");
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((or3) obj).c = 3;
                break;
            case 13:
                ((or3) obj).c = 2;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ctc ctcVar = (ctc) obj;
                ctcVar.f.l();
                ctcVar.e.l();
                break;
            default:
                break;
        }
    }
}
