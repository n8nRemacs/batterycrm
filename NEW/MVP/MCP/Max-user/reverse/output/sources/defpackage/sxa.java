package defpackage;

import one.me.android.root.RootController;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class sxa extends hn6 implements cm6 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxa(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [c54] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [c54] */
    @Override // defpackage.cm6
    public final Object invoke() {
        ytd ytdVarE0;
        int i = this.a;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                ((uxa) this.receiver).h();
                break;
            case 1:
                ((uxa) this.receiver).i();
                break;
            case 2:
                ChatsListSearchScreen chatsListSearchScreen = ((t23) this.receiver).a;
                api.c(chatsListSearchScreen);
                yy7[] yy7VarArr = BottomSheetWidget.B0;
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = new ClearRecentSearchBottomSheet();
                clearRecentSearchBottomSheet.setTargetController(chatsListSearchScreen);
                ?? parentController = chatsListSearchScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                clearRecentSearchBottomSheet.N0(chatsListSearchScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(clearRecentSearchBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                    break;
                }
                break;
            case 3:
                ele eleVar = (ele) this.receiver;
                ci5 ci5Var = eleVar.B0;
                if (((fre) eleVar.D0.getValue()).b != null) {
                    Long lX = eleVar.x();
                    if (lX != null) {
                        xfh.r(ci5Var, new vpe(lX.longValue()));
                        break;
                    }
                } else {
                    xfh.r(ci5Var, rpe.b);
                    break;
                }
                break;
            case 4:
                ele eleVar2 = (ele) this.receiver;
                svi.e(eleVar2.a, ((q2b) eleVar2.v()).a().plus(eleVar2.u()), null, new tke(eleVar2, null), 2);
                break;
            case 5:
                ele eleVar3 = (ele) this.receiver;
                svi.e(eleVar3.a, ((q2b) eleVar3.v()).a().plus(eleVar3.u()), null, new uke(eleVar3, null), 2);
                break;
            case 6:
                c08 c08Var = (c08) this.receiver;
                c08Var.getClass();
                uz7 uz7Var = uz7.c;
                long j = c08Var.b.getLong("arg_key_chat_id");
                uz7Var.p0().b(":stickers/search?chat_id=" + j, null);
                break;
            case 7:
                KeyboardStickersWidget keyboardStickersWidget = ((c08) this.receiver).a;
                yy7[] yy7VarArr2 = KeyboardStickersWidget.s0;
                yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                oq3 oq3VarE = az1.e(x5b.o, null, null, 6);
                oq3VarE.a(new pq3(w5b.g, new n5g(x5b.m), 1, 56), new pq3(w5b.h, new n5g(x5b.n), 2, 56));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                confirmationBottomSheetE.setTargetController(keyboardStickersWidget);
                ?? parentController2 = keyboardStickersWidget;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                confirmationBottomSheetE.N0(keyboardStickersWidget);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                    break;
                }
                break;
            case 8:
                dvf dvfVar = (dvf) this.receiver;
                dvfVar.f = false;
                dvfVar.g = -1.0f;
                dvfVar.h = -1.0f;
                break;
            case 9:
                ((fsf) this.receiver).close();
                break;
            case 10:
                tmh tmhVarV = ((uvh) this.receiver).v();
                svi.e(tmhVarV.c, null, null, new ylh(tmhVarV, null), 3);
                break;
            case 11:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.receiver;
                yy7[] yy7VarArr4 = WebAppRootScreen.R0;
                long j2 = webAppRootScreen.getArgs().getLong("web_root_screen:bot_id");
                e7f e7fVar = e7f.X;
                if (j2 != 0) {
                    break;
                } else {
                    break;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((owh) this.receiver).getClass();
                break;
            case 13:
                ((Runnable) this.receiver).run();
                break;
        }
        return Boolean.valueOf(v06.a((v06) this.receiver));
    }
}
