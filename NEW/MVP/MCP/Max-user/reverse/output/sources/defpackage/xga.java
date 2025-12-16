package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.function.Function;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class xga implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ xga(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((tlb) obj).b;
            case 1:
                return Long.valueOf(((gx3) obj).a);
            case 2:
                return ((zzg) obj).toString();
            case 3:
                return ((lk8) obj).j;
            case 4:
                return ((lk8) obj).k;
            case 5:
                return Long.valueOf(((u6e) obj).d.a);
            case 6:
                return Long.valueOf(((u6e) obj).o.p());
            case 7:
                return ((tv3) obj).a();
            case 8:
                return Long.valueOf(((u6e) obj).d.b.a);
            case 9:
                return Long.valueOf(((u6e) obj).o.p());
            case 10:
                return ((dde) obj).a;
            case 11:
                try {
                    return new pc3((InputStream) obj);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((atc) obj).toString();
            case 13:
                return (hz7) ((iz7) ((rn5) obj)).b.get(0);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((u0f) ((rn5) obj)).a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((e72) ((rn5) obj)).a;
            case 16:
                return ((rn5) obj).getClass();
            case LangUtils.HASH_SEED /* 17 */:
                return ((rn5) obj).getClass();
            case 18:
                List list = bbg.A;
                return null;
            case 19:
                return Short.valueOf(((urf) ((rn5) obj)).b);
            case 20:
                return ((zzg) obj).toString();
            default:
                return ((atc) obj).toString();
        }
    }
}
