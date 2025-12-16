package defpackage;

import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* loaded from: classes.dex */
public final class xl1 extends dtf implements sm6 {
    public final /* synthetic */ CallScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.X = callScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xl1 xl1Var = (xl1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xl1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xl1 xl1Var = new xl1(continuation, this.X);
        xl1Var.o = obj;
        return xl1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [c54] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v8, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v108 */
    /* JADX WARN: Type inference failed for: r2v109, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CallScreen callScreen = this.X;
        ?? r2 = callScreen.K0;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof en1) {
            en1 en1Var = (en1) cdaVar;
            String str = callScreen.s0;
            co5 co5Var = callScreen.H0().w().e;
            if ((co5Var instanceof wn5) || (co5Var instanceof vn5) || (co5Var instanceof xn5)) {
                wqi.c(CallScreen.class.getName(), "handleCallScreenNavigationEvent skip event=" + en1Var + " due to call is failed or finished.", new Object[0]);
            } else {
                int i = 1;
                if (en1Var instanceof om1) {
                    yy7[] yy7VarArr = BottomSheetWidget.B0;
                    ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet();
                    confirmAddOpponentToCallBottomSheet.setTargetController(callScreen);
                    ?? parentController = callScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                    ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                    confirmAddOpponentToCallBottomSheet.N0(callScreen);
                    if (ytdVarE0 != null) {
                        bud budVar = new bud(confirmAddOpponentToCallBottomSheet, null, null, null, false, -1);
                        az1.u(false, budVar, true, "BottomSheetWidget");
                        ytdVarE0.H(budVar);
                    }
                } else if (en1Var instanceof sm1) {
                    yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                    ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((sm1) en1Var).D);
                    confirmRemoveOpponentToCallBottomSheet.setTargetController(callScreen);
                    ?? parentController2 = callScreen;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                    ytd ytdVarE02 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                    confirmRemoveOpponentToCallBottomSheet.N0(callScreen);
                    if (ytdVarE02 != null) {
                        bud budVar2 = new bud(confirmRemoveOpponentToCallBottomSheet, null, null, null, false, -1);
                        az1.u(false, budVar2, true, "BottomSheetWidget");
                        ytdVarE02.H(budVar2);
                    }
                } else if (en1Var instanceof bn1) {
                    k51 k51Var = ((bn1) en1Var).D;
                    y34 y34VarF = h6j.a(1).j().x(k51Var.a).f();
                    if (k51Var.d != null) {
                        y34VarF.q(r4.x, r4.y);
                    }
                    y34VarF.z().o(k51Var.b).build().u(callScreen);
                } else if (en1Var instanceof cn1) {
                    vye vyeVar = (vye) r2.getValue();
                    int iB = callScreen.F0().k.b();
                    vyeVar.getClass();
                    vye.b(km1.a, new wg5((cn1) en1Var, callScreen, iB, i));
                } else {
                    int i2 = 2;
                    if (en1Var instanceof dn1) {
                        vye vyeVar2 = (vye) r2.getValue();
                        int iB2 = callScreen.F0().k.b();
                        vyeVar2.getClass();
                        vye.b(km1.b, new wg5(callScreen, (dn1) en1Var, iB2, i2));
                    } else if (en1Var instanceof qm1) {
                        wo1 wo1VarH0 = callScreen.H0();
                        d51 d51Var = callScreen.H0().w().f;
                        Long l = d51Var != null ? d51Var.a : null;
                        if (l != null) {
                            yx1 yx1Var = (yx1) wo1VarH0.v0.getValue();
                            String str2 = wo1VarH0.w().a;
                            boolean z = wo1VarH0.w().g;
                            yx1Var.getClass();
                            yx1.d(yx1Var, "PROFILE_OPENED", str2, null, null, null, null, z, 124);
                            xfh.r(wo1VarH0.L0, ug1.M0(ug1.c, l.longValue()));
                        } else {
                            wo1VarH0.getClass();
                        }
                    } else if (en1Var instanceof pm1) {
                        callScreen.H0().z();
                    } else if (en1Var instanceof hm1) {
                        callScreen.C0(true);
                    } else if (en1Var instanceof zm1) {
                        boolean z2 = ((zm1) en1Var).D;
                        boolean zA = callScreen.H0().w().i.a();
                        if (!z2 && zA) {
                            callScreen.H0().B(false, null);
                        } else if (!z2 || !zA) {
                            Object systemService = callScreen.requireActivity().getSystemService("media_projection");
                            MediaProjectionManager mediaProjectionManager = systemService instanceof MediaProjectionManager ? (MediaProjectionManager) systemService : null;
                            if (mediaProjectionManager == null) {
                                xfh.r(callScreen.H0().L0, en1.q);
                            } else {
                                callScreen.startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 1);
                            }
                        }
                    } else if (en1Var instanceof um1) {
                        wo1 wo1VarH02 = callScreen.H0();
                        CharSequence charSequence = ((um1) en1Var).D;
                        u1e u1eVar = wo1VarH02.c.i;
                        RecordManager.StartParams startParamsBuild = new RecordManager.StartParams.Builder().isStream(false).withName(charSequence).build();
                        d2e d2eVar = (d2e) u1eVar;
                        d2eVar.getClass();
                        wqi.m("ScreenRecordControllerTag", "startRecordBroadcast", new Object[0]);
                        ReentrantLock reentrantLock = d2eVar.Z;
                        reentrantLock.lock();
                        try {
                            if (((e2e) d2eVar.t0.getValue()).a == f2e.a) {
                                wqi.m("ScreenRecordControllerTag", "startRecordBroadcast already started", new Object[0]);
                            } else {
                                ((yx1) d2eVar.o.getValue()).f(true);
                                RecordManager recordManagerA = d2eVar.a();
                                if (recordManagerA != null) {
                                    RecordManager.startRecord$default(recordManagerA, startParamsBuild, null, null, 6, null);
                                }
                                reentrantLock.unlock();
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    } else if (en1Var instanceof jm1) {
                        callScreen.C0(false);
                    } else if (en1Var instanceof im1) {
                        callScreen.H0().c.a(((im1) en1Var).D);
                    } else if (en1Var instanceof nm1) {
                        String string = callScreen.getContext().getString(m0b.r1);
                        ug1 ug1Var = ug1.c;
                        String name = CallScreen.class.getName();
                        ug1Var.getClass();
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.setType(HTTP.PLAIN_TEXT_TYPE);
                        ug1Var.p0().b(":chats/callshare", gwi.b(new imb("oneme:share:data", intent), new imb("calls_share_title", string), new imb("tag", name)));
                    } else if (en1Var instanceof an1) {
                        ug1.c.p0().b(":call-opponents-list?arg_key_scope_id=".concat(str), null);
                    } else if (en1Var instanceof lm1) {
                        xb3.a(callScreen.getContext(), ((lm1) en1Var).D);
                        if (xb3.b()) {
                            String string2 = callScreen.getContext().getString(d3d.call_link_share_dialog_share_link_copy);
                            ccb ccbVar = new ccb(callScreen);
                            ccbVar.h(string2);
                            ccbVar.d(new ns1(4, null));
                            ccbVar.c(new kcb(0, 0, 0, 3));
                            ccbVar.i();
                        }
                    } else if (en1Var instanceof wm1) {
                        yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                        CallMoreBottomSheet callMoreBottomSheet = new CallMoreBottomSheet(str, lg1.b, null);
                        callMoreBottomSheet.setTargetController(callScreen);
                        ?? parentController3 = callScreen;
                        while (parentController3.getParentController() != null) {
                            parentController3 = parentController3.getParentController();
                        }
                        eud eudVar3 = parentController3 instanceof eud ? (eud) parentController3 : null;
                        ytd ytdVarE03 = eudVar3 != null ? ((RootController) eudVar3).E0() : null;
                        if (ytdVarE03 != null) {
                            bud budVar3 = new bud(callMoreBottomSheet, null, null, null, false, -1);
                            az1.u(false, budVar3, true, "BottomSheetWidget");
                            ytdVarE03.H(budVar3);
                        }
                    } else if (en1Var instanceof tm1) {
                        yy7[] yy7VarArr4 = BottomSheetWidget.B0;
                        RaiseHandActionBottomSheet raiseHandActionBottomSheet = new RaiseHandActionBottomSheet(str, ((tm1) en1Var).D, null);
                        raiseHandActionBottomSheet.setTargetController(callScreen);
                        ?? parentController4 = callScreen;
                        while (parentController4.getParentController() != null) {
                            parentController4 = parentController4.getParentController();
                        }
                        eud eudVar4 = parentController4 instanceof eud ? (eud) parentController4 : null;
                        ytd ytdVarE04 = eudVar4 != null ? ((RootController) eudVar4).E0() : null;
                        raiseHandActionBottomSheet.N0(callScreen);
                        if (ytdVarE04 != null) {
                            bud budVar4 = new bud(raiseHandActionBottomSheet, null, null, null, false, -1);
                            az1.u(false, budVar4, true, "BottomSheetWidget");
                            ytdVarE04.H(budVar4);
                        }
                    } else if (en1Var instanceof vm1) {
                        yy7[] yy7VarArr5 = BottomSheetWidget.B0;
                        StartRecordBottomSheet startRecordBottomSheet = new StartRecordBottomSheet(str, null);
                        startRecordBottomSheet.setTargetController(callScreen);
                        ?? parentController5 = callScreen;
                        while (parentController5.getParentController() != null) {
                            parentController5 = parentController5.getParentController();
                        }
                        eud eudVar5 = parentController5 instanceof eud ? (eud) parentController5 : null;
                        ytd ytdVarE05 = eudVar5 != null ? ((RootController) eudVar5).E0() : null;
                        startRecordBottomSheet.N0(callScreen);
                        if (ytdVarE05 != null) {
                            bud budVar5 = new bud(startRecordBottomSheet, null, null, null, false, -1);
                            az1.u(false, budVar5, true, "BottomSheetWidget");
                            ytdVarE05.H(budVar5);
                        }
                    } else if (en1Var instanceof xm1) {
                        yy7[] yy7VarArr6 = BottomSheetWidget.B0;
                        RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(bgd.b, null, 2, null);
                        recordExitBottomSheet.setTargetController(callScreen);
                        ?? parentController6 = callScreen;
                        while (parentController6.getParentController() != null) {
                            parentController6 = parentController6.getParentController();
                        }
                        eud eudVar6 = parentController6 instanceof eud ? (eud) parentController6 : null;
                        ytd ytdVarE06 = eudVar6 != null ? ((RootController) eudVar6).E0() : null;
                        recordExitBottomSheet.N0(callScreen);
                        if (ytdVarE06 != null) {
                            bud budVar6 = new bud(recordExitBottomSheet, null, null, null, false, -1);
                            az1.u(false, budVar6, true, "BottomSheetWidget");
                            ytdVarE06.H(budVar6);
                        }
                    } else if (en1Var instanceof mm1) {
                        yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                        RecordExitBottomSheet recordExitBottomSheet2 = new RecordExitBottomSheet(bgd.a, null, 2, null);
                        recordExitBottomSheet2.setTargetController(callScreen);
                        ?? parentController7 = callScreen;
                        while (parentController7.getParentController() != null) {
                            parentController7 = parentController7.getParentController();
                        }
                        eud eudVar7 = parentController7 instanceof eud ? (eud) parentController7 : null;
                        ytd ytdVarE07 = eudVar7 != null ? ((RootController) eudVar7).E0() : null;
                        recordExitBottomSheet2.N0(callScreen);
                        if (ytdVarE07 != null) {
                            bud budVar7 = new bud(recordExitBottomSheet2, null, null, null, false, -1);
                            az1.u(false, budVar7, true, "BottomSheetWidget");
                            ytdVarE07.H(budVar7);
                        }
                    } else if (en1Var instanceof rm1) {
                        yy7[] yy7VarArr8 = BottomSheetWidget.B0;
                        CallMoreBottomSheet callMoreBottomSheet2 = new CallMoreBottomSheet(str, lg1.a, null);
                        callMoreBottomSheet2.setTargetController(callScreen);
                        ?? parentController8 = callScreen;
                        while (parentController8.getParentController() != null) {
                            parentController8 = parentController8.getParentController();
                        }
                        eud eudVar8 = parentController8 instanceof eud ? (eud) parentController8 : null;
                        ytd ytdVarE08 = eudVar8 != null ? ((RootController) eudVar8).E0() : null;
                        if (ytdVarE08 != null) {
                            bud budVar8 = new bud(callMoreBottomSheet2, null, null, null, false, -1);
                            az1.u(false, budVar8, true, "BottomSheetWidget");
                            ytdVarE08.H(budVar8);
                        }
                    } else {
                        if (!(en1Var instanceof ym1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ug1.c.N0(((ym1) en1Var).D, callScreen.getContext().getString(m0b.a2), CallScreen.class.getName());
                    }
                }
            }
        } else if (cdaVar instanceof ei4) {
            ug1.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
