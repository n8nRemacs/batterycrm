package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class yl9 {
    public final int a;
    public final k18 b;
    public final k18 c;
    public final Context d;
    public final boolean e;

    public yl9(Context context, k18 k18Var, k18 k18Var2, lv4 lv4Var, int i) {
        this.a = i;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = context.getApplicationContext();
        this.e = lv4Var.b().compareTo(nv4.AVERAGE) >= 0;
    }

    public final xl9 a(byte[] bArr) throws ProtoException {
        byte[] bArr2 = a.a;
        try {
            Protos.MessageReactions from = Protos.MessageReactions.parseFrom(bArr);
            ArrayList arrayList = new ArrayList();
            int length = from.reactions.length;
            int i = 0;
            while (true) {
                zg5 zg5Var = g9d.d;
                f9d f9dVar = null;
                Object obj = null;
                Object obj2 = null;
                if (i >= length) {
                    int i2 = from.totalCount;
                    Protos.ReactionData reactionData = from.yourReaction;
                    if (reactionData != null) {
                        int i3 = reactionData.type;
                        Iterator it = zg5Var.iterator();
                        while (true) {
                            f2 f2Var = (f2) it;
                            if (!f2Var.hasNext()) {
                                break;
                            }
                            Object next = f2Var.next();
                            if (((g9d) next).a == i3) {
                                obj2 = next;
                                break;
                            }
                        }
                        g9d g9dVar = (g9d) obj2;
                        if (g9dVar == null) {
                            throw new IllegalArgumentException(ho7.f(i3, "Unknown reactionType = "));
                        }
                        f9dVar = new f9d(g9dVar, b(from.yourReaction.reaction));
                    }
                    return new xl9(arrayList, i2, f9dVar);
                }
                Protos.ReactionData reactionData2 = from.reactions[i].reaction;
                int i4 = reactionData2.type;
                Iterator it2 = zg5Var.iterator();
                while (true) {
                    f2 f2Var2 = (f2) it2;
                    if (!f2Var2.hasNext()) {
                        break;
                    }
                    Object next2 = f2Var2.next();
                    if (((g9d) next2).a == i4) {
                        obj = next2;
                        break;
                    }
                }
                g9d g9dVar2 = (g9d) obj;
                if (g9dVar2 == null) {
                    throw new IllegalArgumentException(ho7.f(i4, "Unknown reactionType = "));
                }
                arrayList.add(new wl9(new f9d(g9dVar2, b(reactionData2.reaction)), from.reactions[i].count));
                i++;
            }
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    public final x8d b(String str) throws Resources.NotFoundException {
        return new x8d(((qb5) this.b.getValue()).b(this.d.getResources().getDimensionPixelSize(this.a), str));
    }

    public final xl9 c(ul9 ul9Var) {
        if (ul9Var == null) {
            return null;
        }
        ArrayList arrayList = ul9Var.a;
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rl9 rl9Var = (rl9) it.next();
            arrayList2.add(new wl9(d(rl9Var.a), rl9Var.b));
        }
        int i = ul9Var.b;
        ql9 ql9Var = ul9Var.c;
        return new xl9(arrayList2, i, ql9Var != null ? d(ql9Var) : null);
    }

    public final f9d d(ql9 ql9Var) {
        Object next;
        int i = ql9Var.a.a;
        f2 f2Var = new f2(0, g9d.d);
        while (true) {
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (((g9d) next).a == i) {
                break;
            }
        }
        g9d g9dVar = (g9d) next;
        if (g9dVar != null) {
            return new f9d(g9dVar, b(ql9Var.b));
        }
        throw new IllegalArgumentException(ho7.f(i, "Unknown reactionType = "));
    }
}
