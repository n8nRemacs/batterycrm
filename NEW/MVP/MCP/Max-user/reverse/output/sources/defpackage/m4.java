package defpackage;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((rie) this.b).d((ca7) obj);
                break;
            case 1:
                fr2 fr2Var = (fr2) this.b;
                yy7[] yy7VarArr = ChatMembersCompactWidget.Y;
                fr2Var.invoke(obj);
                break;
            case 2:
                fr2 fr2Var2 = (fr2) this.b;
                yy7[] yy7VarArr2 = ChatsListSearchScreen.I0;
                fr2Var2.invoke(obj);
                break;
            case 3:
                fr2 fr2Var3 = (fr2) this.b;
                yy7[] yy7VarArr3 = ChatsListWidget.L0;
                fr2Var3.invoke(obj);
                break;
            case 4:
                fr2 fr2Var4 = (fr2) this.b;
                yy7[] yy7VarArr4 = ChatsListWidget.L0;
                fr2Var4.invoke(obj);
                break;
            case 5:
                ((hb3) this.b).c.add((jbg) obj);
                break;
            case 6:
                fr2 fr2Var5 = (fr2) this.b;
                yy7[] yy7VarArr5 = ContactListWidget.O0;
                fr2Var5.invoke(obj);
                break;
            case 7:
                db4 db4Var = (db4) this.b;
                atc atcVar = (atc) obj;
                db4Var.f.recovery("Retransmitting " + atcVar + " on level " + db4Var.b);
                db4Var.e.f(atcVar, db4Var.b, new m4(7, db4Var));
                break;
            case 8:
                lu4 lu4Var = (lu4) this.b;
                lu4Var.getClass();
                lu4Var.c(((Integer) obj).intValue());
                break;
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                ((n17) this.b).b.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
                break;
            case 10:
                fr2 fr2Var6 = (fr2) this.b;
                yy7[] yy7VarArr6 = MessagesListWidget.b1;
                fr2Var6.invoke(obj);
                break;
            case 11:
                fr2 fr2Var7 = (fr2) this.b;
                yy7[] yy7VarArr7 = MessagesListWidget.b1;
                fr2Var7.invoke(obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                p5a p5aVar = (p5a) this.b;
                w10 w10Var = (w10) obj;
                kvg kvgVar = kvg.g;
                String str = w10Var.r;
                String strA = ((ur3) p5aVar.c.a0.getValue()).b().a();
                kvgVar.getClass();
                kvgVar.a(str, new imb("net_type", strA));
                yqb.c(kvgVar, "msg_resp_received", 5, w10Var.r, 48);
                break;
            case 13:
                yga ygaVar = (yga) this.b;
                btc btcVar = (btc) obj;
                if (ygaVar.c >= ygaVar.e) {
                    ygaVar.c = ((1200 * btcVar.o()) / ygaVar.c) + ygaVar.c;
                    break;
                } else {
                    ygaVar.c += btcVar.o();
                    break;
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((fr2) this.b).invoke(obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((fr2) this.b).invoke(obj);
                break;
            case 16:
                ((fr2) this.b).invoke(obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((hqc) this.b).b.add((nbg) obj);
                break;
            case 18:
                ((lfe) this.b).c = (jbg) obj;
                break;
            case 19:
                ((u0f) this.b).a.add((obg) obj);
                break;
            case 20:
                fr2 fr2Var8 = (fr2) this.b;
                yy7[] yy7VarArr8 = StickersScreen.u0;
                fr2Var8.invoke(obj);
                break;
            case 21:
                fr2 fr2Var9 = (fr2) this.b;
                yy7[] yy7VarArr9 = StickersSettingsScreen.X;
                fr2Var9.invoke(obj);
                break;
            case 22:
                llf llfVar = (llf) this.b;
                ysc yscVar = llfVar.b;
                int i = 22;
                if (!((nr8) ((atc) obj)).b) {
                    yscVar.k(llfVar.d(Integer.MAX_VALUE), new m4(i, llfVar), false);
                    break;
                } else {
                    yscVar.k(llfVar.c(Integer.MAX_VALUE), new m4(i, llfVar), false);
                    break;
                }
            case 23:
                ((hqc) this.b).b.add((mbg) obj);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                fr2 fr2Var10 = (fr2) this.b;
                yy7[] yy7VarArr10 = TwoFACheckPassScreen.t0;
                fr2Var10.invoke(obj);
                break;
            case 25:
                fr2 fr2Var11 = (fr2) this.b;
                yy7[] yy7VarArr11 = TwoFACreationScreen.w0;
                fr2Var11.invoke(obj);
                break;
            case 26:
                fr2 fr2Var12 = (fr2) this.b;
                int i2 = TwoFASettingsScreen.X;
                fr2Var12.invoke(obj);
                break;
            case 27:
                fr2 fr2Var13 = (fr2) this.b;
                yy7[] yy7VarArr12 = TwoFAStartRestoreScreen.s0;
                fr2Var13.invoke(obj);
                break;
            case 28:
                fr2 fr2Var14 = (fr2) this.b;
                yy7[] yy7VarArr13 = WebAppRootScreen.R0;
                fr2Var14.invoke(obj);
                break;
            default:
                fr2 fr2Var15 = (fr2) this.b;
                yy7[] yy7VarArr14 = WebAppRootScreen.R0;
                fr2Var15.invoke(obj);
                break;
        }
    }
}
