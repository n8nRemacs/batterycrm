package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* loaded from: classes.dex */
public final /* synthetic */ class j11 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j11(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object value;
        qa qaVar;
        xs xsVar;
        switch (this.a) {
            case 0:
                WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = (WaitingRoomParticipantsUpdate) this.b;
                v11 v11Var = (v11) this.c;
                xs xsVar2 = (xs) obj;
                lg8 lg8Var = lg8.d;
                List<ParticipantId> list = waitingRoomParticipantsUpdate.participantsIds;
                xs xsVar3 = new xs(0);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    xsVar3.add(knb.a((ParticipantId) it.next()));
                }
                if (waitingRoomParticipantsUpdate.hasAdded) {
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null && l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "CallAdminSettingsController", "Waiting room added new users=" + xsVar3, null);
                    }
                    tcf tcfVar = v11Var.s0;
                    do {
                        value = tcfVar.getValue();
                        qaVar = (qa) value;
                        xsVar = new xs(0);
                        qs qsVar = new qs(xsVar3);
                        while (qsVar.hasNext()) {
                            Object next = qsVar.next();
                            if (!xsVar2.contains(Long.valueOf(((zi1) next).a))) {
                                xsVar.add(next);
                            }
                        }
                    } while (!tcfVar.c(value, qa.a(qaVar, null, xsVar, System.currentTimeMillis(), 1)));
                } else if (waitingRoomParticipantsUpdate.hasRemoved) {
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, "CallAdminSettingsController", "Waiting room remove users=" + xsVar3, null);
                    }
                } else {
                    l6b l6bVar3 = wqi.a;
                    if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                        l6bVar3.c(lg8Var, "CallAdminSettingsController", "Waiting room update users=" + xsVar3, null);
                    }
                }
                xs xsVar4 = new xs(0);
                qs qsVar2 = new qs(xsVar3);
                while (qsVar2.hasNext()) {
                    xsVar4.add(Long.valueOf(((zi1) qsVar2.next()).a));
                }
                return xsVar4;
            case 1:
                oz5 oz5VarG = lee.g(new at(2, (List) this.b), new d92(26, (gd6) this.c));
                bd6 bd6Var = bd6.a;
                Iterator it2 = oz5VarG.iterator();
                if (!it2.hasNext()) {
                    return rd5.a;
                }
                Object objInvoke = bd6Var.invoke(it2.next());
                if (!it2.hasNext()) {
                    return Collections.singleton(objInvoke);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(objInvoke);
                while (it2.hasNext()) {
                    linkedHashSet.add(bd6Var.invoke(it2.next()));
                }
                return linkedHashSet;
            case 2:
                lx9 lx9Var = (lx9) this.b;
                pb2 pb2Var = (pb2) this.c;
                boolean z = lx9Var.b;
                return new mx9(z ? 1 : 4, !z, z && pb2Var.b.m <= 0, 0L, lx9Var.a, 16);
            case 3:
                fde fdeVar = (fde) this.b;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.c;
                Iterator it3 = ((Set) fdeVar.a).iterator();
                while (it3.hasNext()) {
                    linkedHashSet2.add(new yyb(2, 1, ((Number) it3.next()).longValue()));
                }
                return linkedHashSet2;
            default:
                List list2 = (List) this.b;
                whf whfVar = (whf) this.c;
                ArrayList arrayList = new ArrayList(we3.q(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList.add(whf.t(whfVar, (jef) it4.next()));
                }
                return arrayList;
        }
    }
}
