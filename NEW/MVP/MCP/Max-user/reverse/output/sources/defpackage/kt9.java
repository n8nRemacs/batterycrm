package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class kt9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ MessageModel Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt9(vu9 vu9Var, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = messageModel;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kt9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        wo8 wo8Var;
        qqg qqgVar;
        int i;
        Number num;
        int i2;
        qqg qqgVar2 = qqg.a;
        g84 g84Var = g84.a;
        int i3 = this.o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar2;
        }
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.X.B1.a.getValue();
        if (pb2Var == null) {
            return qqgVar2;
        }
        wo8 wo8Var2 = this.X.o;
        MessageModel messageModel = this.Y;
        this.o = 1;
        wo8Var2.getClass();
        lg8 lg8Var = lg8.d;
        long jP = pb2Var.p();
        if (messageModel.c <= jP && !(pb2Var.M() && pb2Var.P() && pb2Var.b.m > 0)) {
            qqgVar = qqgVar2;
            String str = (String) wo8Var2.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Message message=" + messageModel.n() + " is already read, curReadMark:" + jP, null);
            }
        } else {
            String str2 = (String) wo8Var2.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str2, "Marking as read message=".concat(messageModel.n()), null);
            }
            long j = messageModel.c;
            rf2 rf2Var = pb2Var.b;
            int i4 = rf2Var.m;
            long j2 = rf2Var.a;
            abd abdVar = (abd) ((k18) wo8Var2.c).getValue();
            Long l = new Long(messageModel.b);
            if (l.longValue() == 0) {
                l = null;
            }
            abd.e(abdVar, j2, j, l != null ? l.longValue() : -1L, false, false, false, 64);
            rs4 rs4Var = rs4.REGULAR;
            jf2 jf2Var = (jf2) p4j.e(j, pb2Var.b.n.d(rs4Var)).b;
            eh9 eh9Var = pb2Var.c;
            if (fni.a(jf2Var, eh9Var != null ? (jf2) p4j.e(eh9Var.getC(), pb2Var.b.n.d(rs4Var)).b : null)) {
                if (eh9Var == null || messageModel.a != eh9Var.a.a) {
                    wo8Var = wo8Var2;
                    i2 = i4;
                    jA = ((qi9) ((sl7) wo8Var.X).a).a(wo8Var.a, j);
                } else {
                    i2 = i4;
                    wo8Var = wo8Var2;
                }
                num = new Long(jA);
                qqgVar = qqgVar2;
                i = i2;
            } else {
                wo8Var = wo8Var2;
                qi9 qi9Var = (qi9) ((sl7) wo8Var.X).a;
                long j3 = wo8Var.a;
                long jP2 = pb2Var.p() + 1;
                qi9Var.getClass();
                qqgVar = qqgVar2;
                i = i4;
                wqi.c("qi9", "countMessagesFromTo chatId = %d, timeFrom = %d, timeTo = %d", Long.valueOf(j3), Long.valueOf(jP2), Long.valueOf(j));
                lq9 lq9VarD = qi9Var.a.c.d();
                lq9VarD.getClass();
                dsd dsdVarC = dsd.c(5, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = ? AND status <> ?");
                dsdVarC.k(1, j3);
                dsdVarC.k(2, jP2);
                dsdVarC.k(3, j);
                vb9.h(dsdVarC, 4, 0, lq9VarD);
                dsdVarC.k(5, 10);
                lrd lrdVar = lq9VarD.a;
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    long j4 = cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
                    cursorN.close();
                    dsdVarC.y();
                    int i5 = i - ((int) j4);
                    num = new Integer(i5 >= 0 ? i5 : 0);
                } catch (Throwable th) {
                    cursorN.close();
                    dsdVarC.y();
                    throw th;
                }
            }
            ((w63) ((k18) wo8Var.d).getValue()).i().v0(num.intValue(), wo8Var.a);
            if (eh9Var == null || messageModel.a != eh9Var.a.a || i == 0) {
                ((y7b) ((k18) wo8Var.o).getValue()).e(j2);
            } else {
                ((y7b) ((k18) wo8Var.o).getValue()).a(j2);
            }
        }
        qqg qqgVar3 = qqgVar;
        return qqgVar3 == g84Var ? g84Var : qqgVar3;
    }
}
