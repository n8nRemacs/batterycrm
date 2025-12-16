package defpackage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ m0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        StringBuilder sb;
        Instant instant;
        switch (this.a) {
            case 0:
                return ((tlb) obj).b;
            case 1:
                return ((tlb) obj).b;
            case 2:
                return ((tlb) obj).b;
            case 3:
                return new ArrayList();
            case 4:
                n7d n7dVar = (n7d) obj;
                long j = n7dVar.b;
                long j2 = n7dVar.a;
                if (((int) ((j - j2) + 1)) == 1) {
                    sb = new StringBuilder();
                    sb.append(j);
                } else {
                    sb = new StringBuilder();
                    sb.append(j);
                    sb.append("-");
                    sb.append(j2);
                }
                return sb.toString();
            case 5:
                n7d n7dVar2 = (n7d) obj;
                n7dVar2.getClass();
                m7d m7dVar = new m7d();
                m7dVar.a = n7dVar2.b;
                return Stream.generate(m7dVar).limit((int) ((r1 - n7dVar2.a) + 1));
            case 6:
                return ((jbg) obj).toString();
            case 7:
                return ((rn5) obj).toString();
            case 8:
                return ((or3) ((Map.Entry) obj).getValue()).b;
            case 9:
                return ((or3) obj).b;
            case 10:
                return ((tv3) obj).c;
            case 11:
                return ((zz3) obj).b;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((h07) obj).getClass().getSimpleName();
            case 13:
                String str = (String) obj;
                return str.endsWith("Message") ? str.substring(0, str.length() - 7) : str;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return (String) ((List) obj).get(1);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((String) obj).trim();
            case 16:
                return ((String) obj).replace("CN=", "");
            case LangUtils.HASH_SEED /* 17 */:
                return (Integer) ((Map.Entry) obj).getKey();
            case 18:
                return ((rn5) obj).a();
            case 19:
                return ((dde) obj).a;
            case 20:
                return ((dde) obj).a;
            case 21:
                mde mdeVar = (mde) obj;
                synchronized (mdeVar.e) {
                    instant = mdeVar.f;
                }
                return instant;
            case 22:
                Optional optional = (Optional) obj;
                return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
            case 23:
                return (String) ((Map.Entry) obj).getKey();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (List) ((Map.Entry) obj).getValue();
            case 25:
                return ((atc) obj).toString();
            case 26:
                return ((hz7) obj).a;
            case 27:
                return ((atc) obj).toString();
            case 28:
                return ((tlb) obj).a;
            default:
                return ((tlb) obj).b;
        }
    }
}
