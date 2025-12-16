package defpackage;

import android.content.res.Resources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class ev8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        ev8 ev8Var = (ev8) l((it8) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ev8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ev8 ev8Var = new ev8(continuation, this.X);
        ev8Var.o = obj;
        return ev8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Resources.NotFoundException {
        g8j.b(obj);
        it8 it8Var = (it8) this.o;
        boolean z = it8Var instanceof ct8;
        int i = 1;
        MediaBarWidget mediaBarWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = MediaBarWidget.c1;
            mediaBarWidget.I0().setText(mediaBarWidget.o.f.j);
            mediaBarWidget.P0((ade) mediaBarWidget.N0().G0.a.getValue());
            boolean z2 = ((Boolean) mediaBarWidget.N0().E0.a.getValue()).booleanValue() || mediaBarWidget.N0().v();
            mediaBarWidget.I0().setVisibility(z2 ? 0 : 8);
            sn0 sn0Var = mediaBarWidget.O0;
            yy7 yy7Var = MediaBarWidget.c1[16];
            ((f82) sn0Var.getValue()).setVisibility(z2 ? 8 : 0);
            mediaBarWidget.Q0((l00) mediaBarWidget.N0().s0.getValue());
            o6c o6cVarJ0 = mediaBarWidget.J0();
            if (!o6cVarJ0.isLaidOut() || o6cVarJ0.isLayoutRequested()) {
                o6cVarJ0.addOnLayoutChangeListener(new hv8(mediaBarWidget, i));
            } else if (mediaBarWidget.N0().v()) {
                mediaBarWidget.J0().k();
            } else {
                mediaBarWidget.J0().setHalfScreen(null);
            }
            gda.g(mediaBarWidget.d, f1e.CHAT_ATTACH_PICKER);
        } else if (it8Var instanceof zs8) {
            if (((zs8) it8Var).a) {
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                mediaBarWidget.I0().setText(null);
            }
            yy7[] yy7VarArr3 = MediaBarWidget.c1;
            mediaBarWidget.J0().j(true);
        } else if (it8Var instanceof at8) {
            yy7[] yy7VarArr4 = MediaBarWidget.c1;
            mediaBarWidget.I0().e(false);
        } else if (it8Var instanceof dt8) {
            yy7[] yy7VarArr5 = MediaBarWidget.c1;
            yy7[] yy7VarArr6 = BottomSheetWidget.B0;
            oq3 oq3VarE = az1.e(n1b.D, null, null, 6);
            oq3VarE.a(new pq3(1, new n5g(n1b.C), 1, 56));
            oq3VarE.a(new pq3(2, new n5g(mvd.p), 2, 56));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.setTargetController(mediaBarWidget);
            c54 parentController = mediaBarWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(mediaBarWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (it8Var instanceof ys8) {
            yy7[] yy7VarArr7 = MediaBarWidget.c1;
            xfh.r(mediaBarWidget.G0().d, bp6.a);
        } else if (it8Var instanceof bt8) {
            yy7[] yy7VarArr8 = MediaBarWidget.c1;
            xfh.r(mediaBarWidget.G0().d, new dp6(((bt8) it8Var).a));
        } else if (it8Var instanceof ft8) {
            ft8 ft8Var = (ft8) it8Var;
            pd8 pd8VarB = nqi.b(ft8Var.a.a);
            int i2 = ft8Var.b;
            yy7[] yy7VarArr9 = MediaBarWidget.c1;
            mediaBarWidget.O0(pd8VarB, i2, "SELECTED_MEDIA_ALBUM");
        } else if (it8Var instanceof gt8) {
            MediaBarWidget.y0(mediaBarWidget, l1b.k, n1b.W);
        } else if (it8Var instanceof et8) {
            MediaBarWidget.y0(mediaBarWidget, l1b.j, n1b.V);
        } else {
            if (!(it8Var instanceof ht8)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaBarWidget.z0(mediaBarWidget, ((ht8) it8Var).a);
        }
        return qqg.a;
    }
}
