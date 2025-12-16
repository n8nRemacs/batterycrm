package defpackage;

import java.util.function.Predicate;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes3.dex */
public final /* synthetic */ class kk8 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ kk8(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((tlb) obj).b();
            case 1:
                return ((tlb) obj).a();
            case 2:
                return !((tlb) obj).b.q();
            case 3:
                return ((tlb) obj).a();
            case 4:
                return ((tlb) obj).b();
            case 5:
                return ((tlb) obj) != null;
            case 6:
                tlb tlbVar = (tlb) obj;
                synchronized (tlbVar) {
                    if (tlbVar.e || tlbVar.d) {
                        return false;
                    }
                    tlbVar.e = true;
                    return true;
                }
            case 7:
                return ((tlb) obj).b.p();
            case 8:
                return ((tlb) obj).a();
            case 9:
                return ((atc) obj) instanceof ir3;
            case 10:
                return ((atc) obj).d();
            case 11:
                atc atcVar = (atc) obj;
                return atcVar.d() || (atcVar instanceof ulb);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((atc) obj) instanceof z5;
            case 13:
                return ((btc) obj).p();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return !((btc) obj).c.stream().allMatch(new kk8(16));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return !(((atc) obj) instanceof z5);
            case 16:
                atc atcVar2 = (atc) obj;
                return (atcVar2 instanceof r0c) || (atcVar2 instanceof ulb) || (atcVar2 instanceof z5);
            case LangUtils.HASH_SEED /* 17 */:
                return ((lk8) obj).h.get() != 0;
            case 18:
                return ((tlb) obj).b.p();
            case 19:
                return ((u6e) obj).d != null;
            case 20:
                return ((u6e) obj).o != null;
            case 21:
                return ((u6e) obj).d != null;
            case 22:
                return ((u6e) obj).o != null;
            case 23:
                return ((lde) obj) instanceof k16;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((k16) ((lde) obj)).a.getClass().equals(yob.class);
            case 25:
                return ((btc) obj) instanceof rwe;
            case 26:
                return ((atc) obj) instanceof dlf;
            case 27:
                return ((qie) obj) == qie.a;
            case 28:
                return false;
            default:
                qie qieVar = (qie) obj;
                return qieVar == qie.c || qieVar == qie.d;
        }
    }
}
