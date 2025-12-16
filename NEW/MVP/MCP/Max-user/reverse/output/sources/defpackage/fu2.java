package defpackage;

import android.content.res.Resources;
import androidx.work.WorkRequest;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class fu2 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ fu2(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        Object ipdVar;
        boolean zF;
        boolean z = false;
        switch (this.a) {
            case 0:
                yy7[] yy7VarArr = ChatScreen.l1;
                return new t09((yz7) uv2.a.getAccessor().c(490), 7);
            case 1:
                yy7[] yy7VarArr2 = ChatScreen.l1;
                return uv2.a.b();
            case 2:
                yy7[] yy7VarArr3 = ChatScreen.l1;
                uv2 uv2Var = uv2.a;
                bwf bwfVarD = uv2Var.getAccessor().d(61);
                bwf bwfVarD2 = uv2Var.getAccessor().d(347);
                bwf bwfVarD3 = uv2Var.getAccessor().d(46);
                bwf bwfVarD4 = uv2Var.getAccessor().d(8);
                bwf bwfVarD5 = uv2Var.getAccessor().d(12);
                bwf bwfVarD6 = uv2Var.getAccessor().d(215);
                uv2Var.getAccessor().d(109);
                return new gz(bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD5, bwfVarD6, uv2Var.getAccessor().d(346), uv2Var.getAccessor().d(HttpStatus.SC_GONE), uv2Var.getAccessor().d(534));
            case 3:
                yy7[] yy7VarArr4 = ChatScreen.l1;
                return (uh7) uv2.a.getAccessor().f();
            case 4:
                uv2 uv2Var2 = uv2.a;
                return new ide(uv2Var2.getAccessor().d(8), uv2Var2.getAccessor().d(186), uv2Var2.getAccessor().d(369), uv2Var2.getAccessor().d(546), uv2Var2.getAccessor().d(547), uv2Var2.getAccessor().d(548));
            case 5:
                uv2 uv2Var3 = uv2.a;
                return new t8h(uv2Var3.getAccessor().d(8), uv2Var3.getAccessor().d(186), uv2Var3.getAccessor().d(547), uv2Var3.getAccessor().d(546));
            case 6:
                uv2 uv2Var4 = uv2.a;
                return new l6h(uv2Var4.getAccessor().d(12), uv2Var4.getAccessor().d(8), uv2Var4.getAccessor().d(602));
            case 7:
                yy7[] yy7VarArr5 = ChatTitleIconScreen.z0;
                return paf.a.a();
            case 8:
                yy7[] yy7VarArr6 = ChatsListSearchScreen.I0;
                return new b43();
            case 9:
                yy7[] yy7VarArr7 = ChatsListSearchScreen.I0;
                return new zh0(bi0.a.getAccessor().d(549), true, null, 46);
            case 10:
                yy7[] yy7VarArr8 = ChatsListWidget.L0;
                l14 l14Var = l14.a;
                bwf bwfVarD7 = l14Var.getAccessor().d(12);
                ay3.a.getClass();
                return new zy3(hz3.b, bwfVarD7, zx3.b, l14Var.getAccessor().d(352), (lzf) l14Var.getAccessor().c(8), l14Var.getAccessor().d(99), l14Var.getAccessor().d(328), l14Var.getAccessor().d(123), l14Var.getAccessor().d(109), l14Var.getAccessor().d(329), l14Var.getAccessor().d(331), l14Var.getAccessor().d(332), l14Var.getAccessor().d(330), l14Var.getAccessor().d(389), l14Var.getAccessor().d(108), l14Var.getAccessor().d(46), l14Var.getAccessor().d(48), l14Var.getAccessor().d(47), l14Var.getAccessor().d(487), l14Var.getAccessor().d(84));
            case 11:
                yy7[] yy7VarArr9 = ChatsListWidget.L0;
                ve2 ve2VarI = ((w63) e03.a.getAccessor().c(109)).i();
                ve2VarI.p();
                Iterator it = ve2VarI.h.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        pb2 pb2Var = (pb2) ((Map.Entry) it.next()).getValue();
                        try {
                            zF = ve2.N.f(pb2Var);
                        } catch (Exception unused) {
                            zF = true;
                        }
                        if (zF) {
                            EnumSet enumSet = ve2.L;
                            gu5 gu5Var = ve2VarI.o.e;
                            if (ve2.w(pb2Var, enumSet, false)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr10 = ChatsListWidget.L0;
                return new mx3(e03.a.getAccessor().d(47));
            case 13:
                return new w23();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new w23();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr11 = ChatsTabWidget.F0;
                return new ae6();
            case 16:
                return new tic(x8b.G);
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr12 = ComplaintBottomSheet.X;
                return new pq3(f3b.a, new n5g(mvd.p), 2, 56);
            case 18:
                return new c2f(false);
            case 19:
                return new c2f(true);
            case 20:
                try {
                    Resources system = Resources.getSystem();
                    int identifier = system.getIdentifier("db_connection_pool_size", "integer", "android");
                    int integer = identifier != 0 ? system.getInteger(identifier) : -1;
                    if (integer <= 0) {
                        integer = 4;
                    }
                    ipdVar = Integer.valueOf(integer);
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                boolean z2 = ipdVar instanceof ipd;
                Object obj = ipdVar;
                if (z2) {
                    obj = 4;
                }
                int iIntValue = ((Number) obj).intValue();
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                if (iAvailableProcessors >= 4) {
                    iIntValue = iAvailableProcessors < 8 ? Math.min(8, iIntValue * 2) : Math.min(16, iIntValue * 4);
                }
                return Integer.valueOf(iIntValue);
            case 21:
                return new jj5("io", ((Number) qn3.c.getValue()).intValue(), WorkRequest.MIN_BACKOFF_MILLIS, true, false, false, true, 96);
            case 22:
                return new jj5("net", 4, 60000L, true, false, true, true, 64);
            case 23:
                jj5 jj5Var = qn3.a;
                int i = s65.d;
                y65 y65Var = y65.SECONDS;
                m69 m69Var = new m69(true, v9j.h(1, y65Var), v9j.h(3, y65Var), new d73(3), new d73(4));
                boolean z3 = h2f.a;
                ge geVar = ge.a;
                jj5 jj5Var2 = z3 ? jj5Var : (jj5) qn3.d.getValue();
                jj5 jj5Var3 = z3 ? qn3.b : (jj5) qn3.e.getValue();
                if (!z3) {
                    jj5Var = qn3.f;
                }
                jj5 jj5Var4 = jj5Var;
                gmf gmfVar = gmf.a;
                return new g4b(m69Var, new pn3(false ? 1 : 0), jj5Var2, jj5Var3, jj5Var4);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new n0g(qn3.g, new bwf(new fu2(26)));
            case 25:
                return new q2b(qn3.g);
            case 26:
                return de.a();
            case 27:
                int i2 = ConfirmAddOpponentToCallBottomSheet.E0;
                s41 s41Var = (s41) e51.a.getAccessor().c(22);
                k18 k18Var = fm1.a;
                return new ap3(s41Var, gm1.a.getAccessor().d(46), fm1.e());
            case 28:
                yy7[] yy7VarArr13 = ConfirmPhoneScreen.B0;
                int i3 = xz7.a;
                return Boolean.valueOf(xz7.b(xz7.c));
            default:
                yy7[] yy7VarArr14 = ConfirmPhoneScreen.B0;
                return f1e.AUTH_OTP;
        }
    }
}
