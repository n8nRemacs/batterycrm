package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class ro2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        ro2 ro2Var = (ro2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ro2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ro2 ro2Var = new ro2(continuation, this.X);
        ro2Var.o = obj;
        return ro2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r15v57, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        ca9 ca9Var;
        g8j.b(obj);
        zh5 zh5Var = (zh5) this.o;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        boolean z = zh5Var instanceof ph5;
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        if (z) {
            x9f x9fVar = chatMediaViewerScreen.O0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            if (((ph5) zh5Var).a instanceof h09) {
                chatMediaViewerScreen.N0().b((gp2) chatMediaViewerScreen.Q0().a1.a.getValue());
                cbh cbhVarO0 = chatMediaViewerScreen.O0();
                if (chatMediaViewerScreen.M0 < 0.0f && cbhVarO0.a() == 0.0f) {
                    cbhVarO0.b(1.0f);
                }
                chatMediaViewerScreen.V0();
                chatMediaViewerScreen.Q0().I();
            } else {
                dk7 dk7VarN0 = chatMediaViewerScreen.N0();
                ?? r0 = dk7VarN0.v0;
                if (r0.e()) {
                    ((b4c) r0.getValue()).setVisibility(8);
                }
                ?? r15 = dk7VarN0.w0;
                if (r15.e()) {
                    ((ImageView) r15.getValue()).setVisibility(8);
                }
                chatMediaViewerScreen.Q0().x();
            }
            chatMediaViewerScreen.W0();
            za0 za0Var = chatMediaViewerScreen.C0;
            if (za0Var != null) {
                dk7 dk7Var = (dk7) za0Var.c;
                mgb.a(dk7Var, new yn6(dk7Var, 13, za0Var));
            }
        } else if (!(zh5Var instanceof qh5)) {
            if (zh5Var instanceof lh5) {
                lh5 lh5Var = (lh5) zh5Var;
                Integer num = lh5Var.a;
                ccb ccbVar = new ccb(chatMediaViewerScreen);
                ccbVar.h(chatMediaViewerScreen.getContext().getString(lh5Var.a.intValue()));
                ccbVar.e(new qcb(yud.J));
                ccbVar.i();
                jva onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
            } else {
                if (zh5Var instanceof vh5) {
                    ccb ccbVar2 = new ccb(chatMediaViewerScreen);
                    vh5 vh5Var = (vh5) zh5Var;
                    ccbVar2.g(vh5Var.a);
                    ccbVar2.a(vh5Var.c);
                    ccbVar2.c(new kcb(0, 0, chatMediaViewerScreen.J0(), 3));
                    Integer num2 = vh5Var.b;
                    if (num2 != null) {
                        ccbVar2.e(new qcb(num2.intValue()));
                    }
                    chatMediaViewerScreen.P0 = ccbVar2.i();
                } else if (zh5Var instanceof nh5) {
                    nh5 nh5Var = (nh5) zh5Var;
                    int i = nh5Var.a;
                    if (i == 5) {
                        ca9 ca9Var2 = chatMediaViewerScreen.B0;
                        if ((ca9Var2 != null ? ca9Var2.h : 0) != i) {
                            chatMediaViewerScreen.U0(nh5Var.b);
                        }
                    }
                    if (chatMediaViewerScreen.Q0().i1.a.getValue() != w54.c && (ca9Var = chatMediaViewerScreen.B0) != null) {
                        ca9Var.b(nh5Var.a);
                    }
                } else if (!(zh5Var instanceof rh5)) {
                    if (zh5Var instanceof wh5) {
                        ko2 ko2Var = ko2.c;
                        wh5 wh5Var = (wh5) zh5Var;
                        long j = wh5Var.a;
                        long j2 = wh5Var.b;
                        String str = wh5Var.c;
                        o05 o05Var = wh5Var.d;
                        int iJ0 = chatMediaViewerScreen.J0();
                        ii4 ii4VarP0 = ko2Var.p0();
                        hi4 hi4Var = new hi4();
                        hi4Var.a = ":dialogs/share-media";
                        hi4Var.c(Long.valueOf(j), "msg_id");
                        hi4Var.c(Long.valueOf(j2), "attach_id");
                        hi4Var.c(str, "local_attach_id");
                        hi4Var.c(Integer.valueOf(o05Var.ordinal()), "cause_ordinal");
                        hi4Var.c(Integer.valueOf(iJ0), "snack_bot_margin");
                        hi4Var.c(Boolean.TRUE, "force_dark");
                        ii4VarP0.c(hi4Var.a(), null);
                    } else if (zh5Var instanceof th5) {
                        yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                        oq3 oq3VarE = az1.e(mvd.c2, null, null, 6);
                        th5 th5Var = (th5) zh5Var;
                        oq3VarE.c(fyc.oneme_chatmedia_viewer_bulk_saving_only_this, th5Var.a);
                        oq3VarE.c(fyc.oneme_chatmedia_viewer_bulk_saving_all, th5Var.b);
                        oq3VarE.b(jvd.a, new n5g(mvd.p));
                        oq3VarE.a.putString("theme_key", a93.s0.x(chatMediaViewerScreen.getContext()).j().c.getName());
                        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                        confirmationBottomSheetE.setTargetController(chatMediaViewerScreen);
                        c54 parentController = chatMediaViewerScreen;
                        while (parentController.getParentController() != null) {
                            parentController = parentController.getParentController();
                        }
                        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                        confirmationBottomSheetE.N0(chatMediaViewerScreen);
                        if (ytdVarE0 != null) {
                            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                            az1.u(false, budVar, true, "BottomSheetWidget");
                            ytdVarE0.H(budVar);
                        }
                    } else if (zh5Var instanceof oh5) {
                        e6j.c(chatMediaViewerScreen.getContext(), ((oh5) zh5Var).a);
                    } else if (fni.a(zh5Var, sh5.a)) {
                        ((qsb) chatMediaViewerScreen.K0.getValue()).l(new s2i(chatMediaViewerScreen, 1));
                    } else if (zh5Var instanceof mh5) {
                        mh5 mh5Var = (mh5) zh5Var;
                        xb3.a(chatMediaViewerScreen.getContext(), ooi.a(mh5Var.a));
                        if (xb3.b()) {
                            ccb ccbVar3 = new ccb(chatMediaViewerScreen);
                            ccbVar3.g(mh5Var.b);
                            ccbVar3.e(new qcb(yud.t));
                            ccbVar3.i();
                        }
                    } else {
                        if (!(zh5Var instanceof uh5)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uh5 uh5Var = (uh5) zh5Var;
                        float f = uh5Var.d;
                        float f2 = uh5Var.e;
                        Bundle bundle = uh5Var.a;
                        r5g r5gVar = uh5Var.b;
                        List list = uh5Var.c;
                        if (chatMediaViewerScreen.getView() != null) {
                            h6j.a(1).D().q(f, f2).x(bundle).G(r5gVar).o(list).build().u(chatMediaViewerScreen);
                            View view = chatMediaViewerScreen.getView();
                            if (view != null) {
                                uog.i(view, q07.LONG_PRESS);
                            }
                        }
                    }
                }
            }
        }
        return qqg.a;
    }
}
