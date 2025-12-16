package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class yu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yu2 yu2Var = (yu2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yu2 yu2Var = new yu2(continuation, this.X);
        yu2Var.o = obj;
        return yu2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ytd ytdVarE0;
        uh7 uh7Var;
        ChatScreen chatScreen = this.X;
        ?? r2 = chatScreen.i1;
        ?? r3 = chatScreen.h1;
        g8j.b(obj);
        kw2 kw2Var = (kw2) this.o;
        final int i = 1;
        if (kw2Var instanceof hw2) {
            hw2 hw2Var = (hw2) kw2Var;
            List list = hw2Var.a;
            Bundle bundle = hw2Var.b;
            View view = hw2Var.c;
            yy7[] yy7VarArr = ChatScreen.l1;
            h6j.a(1).o(list).x(bundle).B(view).f().build().u(chatScreen);
        } else {
            final int i2 = 0;
            int i3 = 6;
            if (kw2Var instanceof jw2) {
                final jw2 jw2Var = (jw2) kw2Var;
                yy7[] yy7VarArr2 = ChatScreen.l1;
                qk qkVar = new qk(i3, chatScreen);
                long j = jw2Var.a;
                boolean z = jw2Var.d;
                long j2 = jw2Var.b;
                String str = jw2Var.c;
                if (j != 0) {
                    qkVar.invoke(Boolean.valueOf(z), rx1.a);
                    ((kj1) r3.getValue()).l(jw2Var.a, z, new cm6() { // from class: hu2
                        @Override // defpackage.cm6
                        public final Object invoke() {
                            int i4 = i2;
                            qqg qqgVar = qqg.a;
                            jw2 jw2Var2 = jw2Var;
                            switch (i4) {
                                case 0:
                                    yy7[] yy7VarArr3 = ChatScreen.l1;
                                    wv2 wv2Var = wv2.c;
                                    long j3 = jw2Var2.a;
                                    boolean z2 = jw2Var2.d;
                                    wv2Var.p0().b(":call-user?opponent_id=" + j3 + "&video_enabled=" + z2, null);
                                    break;
                                case 1:
                                    yy7[] yy7VarArr4 = ChatScreen.l1;
                                    wv2.c.p0().b(":call-join-link?link=".concat(jw2Var2.c), null);
                                    break;
                                default:
                                    yy7[] yy7VarArr5 = ChatScreen.l1;
                                    wv2 wv2Var2 = wv2.c;
                                    long j4 = jw2Var2.b;
                                    boolean z3 = jw2Var2.d;
                                    wv2Var2.p0().b(":call-chat?chat_id=" + j4 + "&video_enabled=" + z3, null);
                                    break;
                            }
                            return qqgVar;
                        }
                    });
                } else {
                    rx1 rx1Var = rx1.c;
                    if (str != null && str.length() != 0) {
                        qkVar.invoke(Boolean.valueOf(z), rx1Var);
                        ((kj1) r3.getValue()).j(str, true, z, false, new cm6() { // from class: hu2
                            @Override // defpackage.cm6
                            public final Object invoke() {
                                int i4 = i;
                                qqg qqgVar = qqg.a;
                                jw2 jw2Var2 = jw2Var;
                                switch (i4) {
                                    case 0:
                                        yy7[] yy7VarArr3 = ChatScreen.l1;
                                        wv2 wv2Var = wv2.c;
                                        long j3 = jw2Var2.a;
                                        boolean z2 = jw2Var2.d;
                                        wv2Var.p0().b(":call-user?opponent_id=" + j3 + "&video_enabled=" + z2, null);
                                        break;
                                    case 1:
                                        yy7[] yy7VarArr4 = ChatScreen.l1;
                                        wv2.c.p0().b(":call-join-link?link=".concat(jw2Var2.c), null);
                                        break;
                                    default:
                                        yy7[] yy7VarArr5 = ChatScreen.l1;
                                        wv2 wv2Var2 = wv2.c;
                                        long j4 = jw2Var2.b;
                                        boolean z3 = jw2Var2.d;
                                        wv2Var2.p0().b(":call-chat?chat_id=" + j4 + "&video_enabled=" + z3, null);
                                        break;
                                }
                                return qqgVar;
                            }
                        });
                    } else if (j2 != 0) {
                        qkVar.invoke(Boolean.valueOf(z), rx1Var);
                        final int i4 = 2;
                        ((kj1) r3.getValue()).i(j2, z, new cm6() { // from class: hu2
                            @Override // defpackage.cm6
                            public final Object invoke() {
                                int i42 = i4;
                                qqg qqgVar = qqg.a;
                                jw2 jw2Var2 = jw2Var;
                                switch (i42) {
                                    case 0:
                                        yy7[] yy7VarArr3 = ChatScreen.l1;
                                        wv2 wv2Var = wv2.c;
                                        long j3 = jw2Var2.a;
                                        boolean z2 = jw2Var2.d;
                                        wv2Var.p0().b(":call-user?opponent_id=" + j3 + "&video_enabled=" + z2, null);
                                        break;
                                    case 1:
                                        yy7[] yy7VarArr4 = ChatScreen.l1;
                                        wv2.c.p0().b(":call-join-link?link=".concat(jw2Var2.c), null);
                                        break;
                                    default:
                                        yy7[] yy7VarArr5 = ChatScreen.l1;
                                        wv2 wv2Var2 = wv2.c;
                                        long j4 = jw2Var2.b;
                                        boolean z3 = jw2Var2.d;
                                        wv2Var2.p0().b(":call-chat?chat_id=" + j4 + "&video_enabled=" + z3, null);
                                        break;
                                }
                                return qqgVar;
                            }
                        });
                    }
                }
            } else if (kw2Var instanceof iw2) {
                iw2 iw2Var = (iw2) kw2Var;
                ChatScreen.l1(chatScreen, new Integer(iw2Var.a), null, iw2Var.b, iw2Var.c, 2);
            } else {
                if (kw2Var instanceof fw2) {
                    yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                    fw2 fw2Var = (fw2) kw2Var;
                    oq3 oq3VarA = j5j.a(fw2Var.a, null, null, 6);
                    fw2Var.b.forEach(new pv2(new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 1), 0));
                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                    confirmationBottomSheetE.setTargetController(chatScreen);
                    ?? parentController = chatScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                    ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                    confirmationBottomSheetE.N0(chatScreen);
                    if (ytdVarE0 != null) {
                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                        az1.u(false, budVar, true, "BottomSheetWidget");
                        ytdVarE0.H(budVar);
                    }
                } else if (kw2Var instanceof gw2) {
                    gw2 gw2Var = (gw2) kw2Var;
                    yy7[] yy7VarArr4 = ChatScreen.l1;
                    MessageWriteWidget messageWriteWidgetW0 = chatScreen.W0();
                    if (messageWriteWidgetW0 != null) {
                        CharSequence charSequence = gw2Var.a;
                        messageWriteWidgetW0.C0().setText(charSequence);
                        if (charSequence != null && charSequence.length() != 0) {
                            messageWriteWidgetW0.C0().h(charSequence.length());
                        }
                    }
                    mqf mqfVar = (mqf) chatScreen.H0.getValue();
                    CharSequence charSequence2 = gw2Var.a;
                    Long l = gw2Var.c;
                    Long l2 = gw2Var.b;
                    mqfVar.v(charSequence2);
                    if (l2 != null) {
                        chatScreen.V0().G(l2);
                    } else if (l != null) {
                        no9.F(chatScreen.V0(), l, null, null, 6);
                    }
                } else if (kw2Var instanceof ew2) {
                    ew2 ew2Var = (ew2) kw2Var;
                    int i5 = ew2Var.a;
                    sf6 sf6Var = ew2Var.b;
                    boolean z2 = ew2Var.c;
                    yy7[] yy7VarArr5 = ChatScreen.l1;
                    chatScreen.V0().G(null);
                    if (!z2) {
                        chatScreen.V0().v();
                    }
                    chatScreen.X0().t(null);
                    uh7 uh7Var2 = (uh7) r2.getValue();
                    if (uh7Var2 != null) {
                        uh7Var2.f(Collections.singleton(new th7(rh7.b, i5)), f1e.CHAT);
                    }
                    if (sf6Var != null && (uh7Var = (uh7) r2.getValue()) != null) {
                        uh7Var.f(sf6Var.a, sf6Var.b);
                    }
                } else if (kw2Var instanceof bw2) {
                    yy7[] yy7VarArr6 = ChatScreen.l1;
                    chatScreen.V0().v();
                    if (!((bw2) kw2Var).a) {
                        chatScreen.getRouter().C();
                    }
                } else if (fni.a(kw2Var, cw2.b)) {
                    yy7[] yy7VarArr7 = ChatScreen.l1;
                    chatScreen.a1().u(true);
                } else if (fni.a(kw2Var, cw2.c)) {
                    ?? parentController2 = chatScreen;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                    ytd ytdVarE02 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                    if ((ytdVarE02 != null ? ytdVarE02.g("send_message_restricted_controller_tag") : null) == null) {
                        yy7[] yy7VarArr8 = BottomSheetWidget.B0;
                        oq3 oq3VarE = az1.e(n1b.n, null, null, 6);
                        oq3VarE.f(new n5g(n1b.m));
                        oq3VarE.a(new pq3(m1b.r, new n5g(n1b.k), 3, true, 3, 3), new pq3(m1b.s, new n5g(n1b.l), 2, true, 3, 2));
                        ConfirmationBottomSheet confirmationBottomSheetE2 = oq3VarE.e();
                        confirmationBottomSheetE2.setTargetController(chatScreen);
                        ?? parentController3 = chatScreen;
                        while (parentController3.getParentController() != null) {
                            parentController3 = parentController3.getParentController();
                        }
                        eud eudVar3 = parentController3 instanceof eud ? (eud) parentController3 : null;
                        ytdVarE0 = eudVar3 != null ? ((RootController) eudVar3).E0() : null;
                        confirmationBottomSheetE2.N0(chatScreen);
                        if (ytdVarE0 != null) {
                            bud budVar2 = new bud(confirmationBottomSheetE2, null, null, null, false, -1);
                            az1.u(false, budVar2, true, "send_message_restricted_controller_tag");
                            ytdVarE0.H(budVar2);
                        }
                    }
                } else {
                    if (!fni.a(kw2Var, cw2.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context context = chatScreen.getContext();
                    l5c l5cVar = (l5c) ((age) chatScreen.Z.getValue());
                    String string = l5cVar.g.getString("invite-long", null);
                    if (string == null) {
                        string = String.format(context.getString(fvd.J), Arrays.copyOf(new Object[]{l5cVar.l()}, 1));
                    }
                    xb3.a(chatScreen.getContext(), string.toString());
                    String str2 = ap7.a;
                    ap7.i(chatScreen.getContext(), string, null);
                }
            }
        }
        return qqg.a;
    }
}
