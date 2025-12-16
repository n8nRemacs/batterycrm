package defpackage;

import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class tl2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tl2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new sl2(0, (m3) obj);
            case 1:
                return new sl2(1, (wj1) obj);
            case 2:
                return new sl2(2, (lo2) obj);
            case 3:
                return new sl2(3, (dr2) obj);
            case 4:
                return new sl2(4, (dr2) obj);
            case 5:
                yy7[] yy7VarArr = ChatMembersScreen.t0;
                ((ChatMembersScreen) obj).A0().t();
                return qqgVar;
            case 6:
                return new sl2(5, (hr2) obj);
            case 7:
                return new sl2(6, (hr2) obj);
            case 8:
                return new sl2(7, (zb2) obj);
            case 9:
                yy7[] yy7VarArr2 = ChatScreen.l1;
                xfh.r(((ChatScreen) obj).X0().Z, sr9.a);
                return qqgVar;
            case 10:
                return new sl2(9, (eu2) obj);
            case 11:
                return new sl2(8, (eu2) obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new sl2(10, (eu2) obj);
            case 13:
                return new sl2(11, (eu2) obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new sl2(12, (zb2) obj);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new sl2(13, (eu2) obj);
            case 16:
                return new sl2(14, (zb2) obj);
            case LangUtils.HASH_SEED /* 17 */:
                return new sl2(15, (fu2) obj);
            case 18:
                return new sl2(16, (eu2) obj);
            case 19:
                return new sl2(17, (eu2) obj);
            case 20:
                return new sl2(18, (qn2) obj);
            case 21:
                return (o03) obj;
            case 22:
                return Boolean.valueOf(((h13) ((bwf) obj).getValue()).a().a());
            case 23:
                return new sl2(19, (fu2) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new sl2(20, (fu2) obj);
            case 25:
                return new sl2(21, (fu2) obj);
            case 26:
                return new sl2(22, (l53) obj);
            case 27:
                return new sl2(23, (l53) obj);
            case 28:
                return new sl2(24, (fu2) obj);
            default:
                return new sl2(25, (tj3) obj);
        }
    }
}
