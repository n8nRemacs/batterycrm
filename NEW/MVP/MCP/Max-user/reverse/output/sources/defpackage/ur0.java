package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public class ur0 extends sm implements j1g {
    public final Object X;
    public final /* synthetic */ int d;
    public final long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur0(int i, long j, long j2, Object obj) {
        super(j);
        this.d = i;
        this.o = j2;
        this.X = obj;
    }

    private final void s(pzf pzfVar) {
    }

    private final void u(l0g l0gVar) {
    }

    public void d(l0g l0gVar) {
        int i = this.d;
        long j = this.o;
        switch (i) {
            case 0:
                vr0 vr0Var = (vr0) l0gVar;
                gx3 gx3Var = vr0Var.d;
                if (gx3Var == null) {
                    Log.d((String) this.X, "onSuccess: contact for botId = " + j + " is null");
                    return;
                }
                long j2 = gx3Var.a;
                ku3 ku3VarI = m().i(j2, false);
                yv3 yv3Var = ku3VarI != null ? ku3VarI.a.b.k : null;
                yv3 yv3Var2 = yv3.a;
                if (yv3Var == yv3Var2) {
                    m().s(Collections.singletonList(gx3Var), yv3Var2);
                } else {
                    m().s(Collections.singletonList(gx3Var), yv3.b);
                }
                k().c(new mc2(this.a, l().P(j).a, vr0Var.c, Collections.singletonMap(Long.valueOf(j), gx3Var)));
                tbf tbfVar = vr0Var.o;
                if (tbfVar != null) {
                    qv3 qv3VarM = m();
                    qv3VarM.getClass();
                    qv3VarM.c(j2, new i62(13, tbfVar));
                    return;
                }
                return;
            case 1:
                e04 e04Var = (e04) l0gVar;
                if (j > 0) {
                    Map map = e04Var.c;
                    tm tmVar = this.c;
                    if (tmVar == null) {
                        tmVar = null;
                    }
                    map.put(Long.valueOf(((w4e) ((pb3) tmVar.f.getValue())).s()), c8c.c);
                }
                tm tmVar2 = this.c;
                ((h8c) (tmVar2 != null ? tmVar2 : null).O.getValue()).g(e04Var.d, po8.l(e04Var.c));
                ve2 ve2VarL = l();
                Map map2 = e04Var.c;
                ve2VarL.getClass();
                ArrayList arrayList = new ArrayList(map2.keySet());
                wqi.c("ve2", "invalidateChatsContacts, contactsIds.size() = " + arrayList.size(), new Object[0]);
                for (pb2 pb2Var : ve2VarL.O(ve2.I)) {
                    ArrayList arrayListL = pb2Var.l();
                    ArrayList arrayList2 = new ArrayList(arrayListL.size());
                    Iterator it = arrayListL.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(Long.valueOf(((ku3) it.next()).p()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    if (!Collections.disjoint(arrayList, arrayList2)) {
                        pb2Var.t0((qv3) ve2VarL.s.get());
                    }
                }
                return;
            case 2:
                d((w4a) l0gVar);
                return;
            default:
                return;
        }
    }

    public void e(pzf pzfVar) {
        switch (this.d) {
            case 0:
                break;
            case 1:
                k().c(new rj0(this.a, pzfVar));
                break;
            case 2:
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                ((tw0) ((d5a) tmVar.W.getValue()).a.getValue()).c(new y4a(this.a, pzfVar, this.o, (List) this.X));
                break;
            default:
                k().c(new rj0(this.a, pzfVar));
                break;
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        switch (this.d) {
            case 0:
                wua wuaVar = new wua(xhb.u2, 21);
                wuaVar.t(this.o, "botId");
                return wuaVar;
            case 1:
                long[] jArr = (long[]) this.X;
                fh2 fh2Var = new fh2(null, 22);
                if (jArr != null) {
                    fh2Var.q("contactIds", jArr);
                }
                long j = this.o;
                if (j > 0) {
                    fh2Var.t(j, "sync");
                }
                return fh2Var;
            case 2:
                return new zf8(this.o, ue3.e0((List) this.X));
            default:
                long j2 = this.o;
                if (j2 == 0) {
                    return null;
                }
                s00 s00Var = (s00) this.X;
                String str = s00Var != null ? s00Var.a : null;
                x5a x5aVar = new x5a(null);
                x5aVar.t(j2, ApiProtocol.PARAM_CHAT_ID);
                if (str != null) {
                    x5aVar.x("type", str);
                }
                return x5aVar;
        }
    }

    /* renamed from: t */
    public void d(w4a w4aVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((d5a) tmVar.W.getValue()).a(w4aVar, this.o, ue3.e0((List) this.X), this.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(long j, long j2) {
        super(j);
        this.d = 0;
        this.o = j2;
        this.X = ur0.class.getName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(long j, long[] jArr, long j2) {
        super(j);
        this.d = 1;
        this.X = jArr;
        this.o = j2;
    }
}
