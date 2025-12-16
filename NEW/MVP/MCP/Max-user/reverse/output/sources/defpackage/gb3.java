package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.concurrent.LinkedTransferQueue34;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class gb3 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ gb3(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((rn5) obj) instanceof g7c;
            case 1:
                return !az1.c(((or3) ((Map.Entry) obj).getValue()).c, 4);
            case 2:
                return !az1.c(((or3) obj).c, 4);
            case 3:
                return Objects.isNull((tv3) obj);
            case 4:
                return ((List) obj).get(0).equals(2);
            case 5:
                return ((String) obj).startsWith("CN=");
            case 6:
                int i = ((or3) obj).c;
                return (az1.c(i, 1) || az1.c(i, 4)) ? false : true;
            case 7:
                return !az1.c(((or3) ((Map.Entry) obj).getValue()).c, 4);
            case 8:
                return !az1.c(((or3) obj).c, 4);
            case 9:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 1;
            case 10:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 0;
            case 11:
                return ((Integer) ((Map.Entry) obj).getKey()).intValue() % 4 == 2;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                atc atcVar = (atc) obj;
                return (atcVar instanceof ulb) || (atcVar instanceof r0c) || (atcVar instanceof z5) || (atcVar instanceof ya4) || ((atcVar instanceof ir3) && ((ir3) atcVar).o == 28);
            case 13:
                atc atcVar2 = (atc) obj;
                return (atcVar2 instanceof ya4) || (atcVar2 instanceof z5) || (atcVar2 instanceof fha) || (atcVar2 instanceof yob) || (atcVar2 instanceof g07);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                atc atcVar3 = (atc) obj;
                return (atcVar3 instanceof ulb) || (atcVar3 instanceof r0c) || (atcVar3 instanceof z5) || (atcVar3 instanceof ya4) || ((atcVar3 instanceof ir3) && ((ir3) atcVar3).o == 28);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                atc atcVar4 = (atc) obj;
                return (atcVar4 instanceof qob) || (atcVar4 instanceof yob);
            case 16:
                return ((btc) obj) instanceof ol7;
            case LangUtils.HASH_SEED /* 17 */:
                return Objects.nonNull((Instant) obj);
            case 18:
                return !((String) obj).startsWith(":");
            case 19:
                return ((String) ((Map.Entry) obj).getKey()).startsWith(":");
            case 20:
                return ((InetAddress) obj) instanceof Inet4Address;
            case 21:
                return ((InetAddress) obj) instanceof Inet6Address;
            case 22:
                return LinkedTransferQueue34.lambda$clear$2(obj);
            case 23:
                return ((tlb) obj).a();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return !((tlb) obj).b.q();
            case 25:
                return ((tlb) obj).a();
            case 26:
                return !((tlb) obj).b.q();
            case 27:
                return ((tlb) obj).b.r();
            case 28:
                return ((tlb) obj).b();
            default:
                return ((tlb) obj).b.p();
        }
    }
}
