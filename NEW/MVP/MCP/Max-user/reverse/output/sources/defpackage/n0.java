package defpackage;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.function.ToIntFunction;
import javax.security.auth.x500.X500Principal;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements ToIntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ n0(int i) {
        this.a = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((btc) obj).o();
            case 1:
                return ((btc) obj).o();
            case 2:
                return ((btc) obj).o();
            case 3:
                return ((String) obj).getBytes(Charset.forName("UTF-8")).length;
            case 4:
                return ((X500Principal) obj).getEncoded().length;
            case 5:
                return ((byte[]) obj).length;
            case 6:
                return ((rn5) obj).a().length;
            case 7:
                return ((jb3) obj).a.length + 6;
            case 8:
                return ((ib3) obj).a.length + 1;
            case 9:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue();
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getValue()).length() + ((String) entry.getKey()).length();
            case 11:
                return ((byte[]) obj).length;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((Integer) iz7.c.get((mbg) obj)).intValue();
            case 13:
                return ((atc) obj).c();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((atc) obj).c();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((btc) obj).c.stream().filter(new kk8(26)).mapToInt(new n0(16)).sum();
            case 16:
                return ((dlf) ((atc) obj)).d;
            default:
                return ((atc) obj).c();
        }
    }
}
