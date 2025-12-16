package defpackage;

import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes.dex */
public final class sa extends xfh {
    public final lcj b;
    public final k18 c;
    public final tcf d;
    public final hbd o;

    public sa(k18 k18Var, k18 k18Var2, lcj lcjVar) {
        k18 k18VarE = fm1.e();
        this.b = lcjVar;
        this.c = k18Var;
        tcf tcfVarA = ucf.a(pa.c);
        this.d = tcfVarA;
        this.o = new hbd(tcfVarA);
        gw0.w(gw0.u(new g56(((v11) ((z01) k18Var.getValue())).t0, new ra(k18Var2, this, null), 1), ((q2b) ((lzf) ((bwf) k18VarE).getValue())).a()), this.a);
    }

    public final void t(final boolean z) {
        final v11 v11Var = (v11) ((z01) this.c.getValue());
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            v11Var.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", xc0.f("Update users from waiting room for all with apply state=", z), null);
            }
        }
        Conversation conversationA = v11Var.d().a();
        String conversationId = conversationA != null ? conversationA.getConversationId() : null;
        if (z) {
            yx1 yx1Var = (yx1) v11Var.o.getValue();
            yx1Var.getClass();
            yx1.d(yx1Var, "PROMOTE_JOIN_WAITING_ROOM", conversationId, null, null, null, null, true, 116);
        } else {
            yx1 yx1Var2 = (yx1) v11Var.o.getValue();
            yx1Var2.getClass();
            yx1.d(yx1Var2, "REJECT_JOIN_WAITING_ROOM", conversationId, null, null, null, null, true, 116);
        }
        v11Var.Z.updateAndGet(new UnaryOperator() { // from class: g11
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boolean z2;
                xs xsVar = (xs) obj;
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (true) {
                    boolean zHasNext = qsVar.hasNext();
                    z2 = z;
                    if (!zHasNext) {
                        break;
                    }
                    ParticipantId participantIdB = knb.b(((Number) qsVar.next()).longValue());
                    v11 v11Var2 = v11Var;
                    if (z2) {
                        Conversation conversationA2 = v11Var2.d().a();
                        if (conversationA2 != null) {
                            conversationA2.promoteParticipant(participantIdB, true);
                        }
                    } else {
                        Conversation conversationA3 = v11Var2.d().a();
                        if (conversationA3 != null) {
                            conversationA3.removeParticipant(participantIdB);
                        }
                    }
                }
                return z2 ? xsVar : new xs(0);
            }
        });
        if (z) {
            return;
        }
        v11Var.m();
    }
}
