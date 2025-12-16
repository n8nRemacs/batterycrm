package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.webrtc.EglBase;
import org.webrtc.NativeDoubleArrayConsumer;

/* loaded from: classes2.dex */
public final class zh {
    public final k01 a;
    public final y6d b;
    public final li c;
    public final r8a d;
    public final a93 e;
    public final r30 f;
    public final CopyOnWriteArraySet g;
    public final ej h;
    public final boolean i;
    public volatile boolean j;
    public volatile Integer k;

    public zh(k01 k01Var, rve rveVar, y6d y6dVar, y6i y6iVar, li liVar, r8a r8aVar, EglBase eglBase) {
        this.a = k01Var;
        this.b = y6dVar;
        this.c = liVar;
        this.d = r8aVar;
        a93 a93Var = new a93(2);
        this.e = a93Var;
        r30 r30Var = new r30();
        r30Var.b = this;
        r30Var.c = rveVar;
        r30Var.d = liVar;
        r30Var.o = a93Var;
        r30Var.a = "";
        r30Var.X = r30.Y;
        this.f = r30Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.g = copyOnWriteArraySet;
        this.h = new ej(this, new enb(k01Var, 0, y6iVar), liVar, eglBase, a93Var, new ts9(1, this, zh.class, "shouldRenderLocally", "shouldRenderLocally(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Z", 0, 23));
        liVar.getClass();
        this.i = false;
        xtd xtdVar = new xtd(1, this);
        if (!((NativeDoubleArrayConsumer.Consumer) r30Var.X).equals(xtdVar)) {
            r30Var.X = xtdVar;
            ((AtomicInteger) ((a93) r30Var.o).Y).set(0);
        }
        copyOnWriteArraySet.add(new yh(this));
    }

    public final void a(JSONObject jSONObject) {
        ti1 ti1VarA;
        if (this.i) {
            try {
                ti1VarA = ti1.a(jSONObject.optString("participantId"));
            } catch (Exception unused) {
                ti1VarA = null;
            }
            if (ti1VarA == null) {
                return;
            }
            this.c.getClass();
            ej ejVar = this.h;
            ejVar.g.post(new ud(ejVar, 1, ti1VarA));
        }
    }

    public final void b(nt1 nt1Var, List list) {
        Object objPutIfAbsent;
        if (this.i && nt1Var.a == cdh.c) {
            ti1 ti1Var = nt1Var.b;
            ConcurrentHashMap concurrentHashMap = this.h.j;
            Object copyOnWriteArraySet = concurrentHashMap.get(ti1Var);
            if (copyOnWriteArraySet == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(ti1Var, (copyOnWriteArraySet = new CopyOnWriteArraySet()))) != null) {
                copyOnWriteArraySet = objPutIfAbsent;
            }
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) copyOnWriteArraySet;
            copyOnWriteArraySet2.clear();
            copyOnWriteArraySet2.addAll(list);
        }
    }
}
