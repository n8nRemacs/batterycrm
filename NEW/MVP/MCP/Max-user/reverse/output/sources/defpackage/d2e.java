package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* loaded from: classes.dex */
public final class d2e implements u1e {
    public static final /* synthetic */ yy7[] A0;
    public final k18 X;
    public final k18 Y;
    public final ReentrantLock Z = new ReentrantLock(true);
    public final at1 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final tcf t0;
    public x9f u0;
    public final bwf v0;
    public final t9f w0;
    public x9f x0;
    public final tcf y0;
    public final tcf z0;

    static {
        z8a z8aVar = new z8a(d2e.class, "loadUserRecordInfoJob", "getLoadUserRecordInfoJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        A0 = new yy7[]{z8aVar};
    }

    public d2e(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, at1 at1Var, k18 k18Var5, k18 k18Var6) {
        this.a = at1Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
        this.Y = k18Var6;
        tcf tcfVarA = ucf.a(e2e.e);
        this.s0 = tcfVarA;
        this.t0 = tcfVarA;
        this.v0 = new bwf(new efd(9));
        this.w0 = c7j.c();
        tcf tcfVarA2 = ucf.a(null);
        this.y0 = tcfVarA2;
        this.z0 = tcfVarA2;
    }

    public final RecordManager a() {
        Conversation conversationA = ((n64) this.b.getValue()).a();
        if (conversationA != null) {
            return conversationA.getRecordManager();
        }
        return null;
    }

    public final void c(f2e f2eVar) {
        tcf tcfVar;
        Object value;
        wqi.m("ScreenRecordControllerTag", "release record state with " + f2eVar, new Object[0]);
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, e2e.a(e2e.e, f2eVar, null, null, 14)));
        x9f x9fVar = this.u0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.u0 = null;
        yy7[] yy7VarArr = A0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.w0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
        x9f x9fVar2 = this.x0;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        this.x0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.f2e r18) {
        /*
            r17 = this;
            r0 = r17
        L2:
            tcf r1 = r0.s0
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            e2e r3 = (defpackage.e2e) r3
            ru.ok.android.externcalls.sdk.record.RecordManager r4 = r0.a()
            r5 = 0
            if (r4 == 0) goto L7b
            ru.ok.android.externcalls.sdk.record.RecordDescription r4 = r4.getRecordDescription()
            if (r4 == 0) goto L7b
            pgd r6 = r4.getType()
            int r6 = r6.ordinal()
            r7 = 1
            r8 = 2
            if (r6 == 0) goto L28
            if (r6 == r7) goto L2c
            if (r6 == r8) goto L2a
        L28:
            r6 = r7
            goto L2d
        L2a:
            r6 = r8
            goto L2d
        L2c:
            r6 = 3
        L2d:
            if (r6 != r7) goto L30
            goto L7b
        L30:
            ru.ok.android.externcalls.sdk.id.ParticipantId r7 = r4.getInitiator()
            zi1 r13 = defpackage.knb.a(r7)
            long r9 = r13.a
            k18 r7 = r0.c
            java.lang.Object r7 = r7.getValue()
            sv1 r7 = (defpackage.sv1) r7
            k18 r11 = r0.Y
            java.lang.Object r11 = r11.getValue()
            lzf r11 = (defpackage.lzf) r11
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.b()
            v1e r12 = new v1e
            r12.<init>(r9, r0, r5)
            x9f r7 = defpackage.svi.e(r7, r11, r5, r12, r8)
            yy7[] r8 = defpackage.d2e.A0
            r9 = 0
            r8 = r8[r9]
            t9f r9 = r0.w0
            r9.O(r0, r8, r7)
            t1e r9 = new t1e
            long r10 = r4.getMovieId()
            long r7 = r4.getMovieId()
            java.lang.String r12 = java.lang.String.valueOf(r7)
            long r14 = r4.getStart()
            r16 = r6
            r9.<init>(r10, r12, r13, r14, r16)
            goto L7c
        L7b:
            r9 = r5
        L7c:
            r4 = 12
            r6 = r18
            e2e r3 = defpackage.e2e.a(r3, r6, r9, r5, r4)
            boolean r1 = r1.c(r2, r3)
            if (r1 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2e.d(f2e):void");
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordDataChanged() {
        wqi.m("ScreenRecordControllerTag", "onRecordDataChanged", new Object[0]);
        d(f2e.c);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordError(String str) {
        wqi.m("ScreenRecordControllerTag", "onRecordError: " + str, new Object[0]);
        c(f2e.b);
        c(f2e.c);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStarted() {
        RecordDescription recordDescription;
        RecordManager recordManagerA = a();
        if (recordManagerA == null || (recordDescription = recordManagerA.getRecordDescription()) == null) {
            return;
        }
        wqi.m("ScreenRecordControllerTag", "onRecordStarted: data = " + recordDescription, new Object[0]);
        long start = recordDescription.getStart();
        if (this.u0 == null) {
            this.u0 = svi.e((sv1) this.c.getValue(), null, null, new c2e(start, this, null), 3);
        }
        d(f2e.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.RecordEventListener
    public final void onRecordStopped(ConversationParticipant conversationParticipant) {
        ParticipantId externalId;
        ConversationParticipant me2;
        ParticipantId externalId2;
        wqi.m("ScreenRecordControllerTag", "onRecordStopped: stoppedBy = " + conversationParticipant, new Object[0]);
        t1e t1eVar = ((e2e) this.t0.getValue()).b;
        zi1 zi1VarA = null;
        zi1 zi1Var = t1eVar != null ? t1eVar.c : null;
        if (zi1Var != null) {
            Conversation conversationA = ((n64) this.b.getValue()).a();
            if (zi1Var.equals((conversationA == null || (me2 = conversationA.getMe()) == null || (externalId2 = me2.getExternalId()) == null) ? null : knb.a(externalId2))) {
                if (conversationParticipant != null && (externalId = conversationParticipant.getExternalId()) != null) {
                    zi1VarA = knb.a(externalId);
                }
                if (!zi1Var.equals(zi1VarA)) {
                    ((v11) ((z01) this.d.getValue())).C0.h(wa.a);
                }
            }
        }
        c(f2e.c);
    }
}
