package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Collections;
import java.util.function.ToLongFunction;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class g31 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ g31(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 12;
        qqg qqgVar = qqg.a;
        int i3 = 3;
        switch (i) {
            case 0:
                int i4 = k31.U0;
                return -231920335;
            case 1:
                float f = vw4.d().getDisplayMetrics().density * 32.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 2:
                int i5 = m41.C0;
                return new AnimatorSet();
            case 3:
                int i6 = m41.C0;
                return (tv1) gm1.a.getAccessor().c(15);
            case 4:
                int i7 = m41.C0;
                return (nv4) gm1.a.getAccessor().c(86);
            case 5:
                yy7[] yy7VarArr = CallDebugMenuScreen.Z;
                k18 k18Var = fm1.a;
                return new j61(gm1.a.getAccessor().d(15));
            case 6:
                yy7[] yy7VarArr2 = CallDebugMenuScreen.Z;
                return new e61();
            case 7:
                float f2 = vw4.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 8:
                yy7[] yy7VarArr3 = CallEventsWidget.Z;
                gm1 gm1Var = gm1.a;
                return new i81(gm1Var.a(), fm1.b(), (lzf) gm1Var.getAccessor().c(8), e51.a.a());
            case 9:
                v17 v17Var = CallHistoryPageScreen.u0;
                return Collections.singletonList(new b44(0, new n5g(y2d.call_history_item_call_context_action_remove), Integer.valueOf(w9b.V), Integer.valueOf(iwc.ic_delete_22), Integer.valueOf(w9b.Q)));
            case 10:
                ca1.c.L0(null, null, null);
                return qqgVar;
            case 11:
                return new fn1();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ColorDrawable(0);
            case 13:
                yy7[] yy7VarArr4 = CallJoinLinkPreviewWidget.A0;
                return f1e.CALL_JOIN_LINK_PREVIEW;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                b6a b6aVar = CallLinkInfoScreen.A0;
                return f1e.CALL_CREATE_GROUP_LINK;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ShapeDrawable(new RoundRectShape(new float[]{vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f}, null, null));
            case 16:
                yy7[] yy7VarArr5 = CallMoreBottomSheet.C0;
                return new zfd();
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr6 = CallMoreBottomSheet.C0;
                return new r41();
            case 18:
                int i8 = mh1.F0;
                return qqgVar;
            case 19:
                s55 s55Var = new s55(i2);
                final gf1 gf1Var = new gf1(i3);
                return s55Var.thenComparingLong(new ToLongFunction() { // from class: oh1
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((Number) gf1Var.invoke(obj)).longValue();
                    }
                }).thenComparing(new s55(13)).reversed();
            case 20:
                yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                return f1e.ADMIN_CALL_SETTINGS;
            case 21:
                yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                return vye.a;
            case 22:
                yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                k18 k18VarC = fm1.c();
                k18 k18Var2 = x4e.g;
                e51 e51Var = e51.a;
                nnb nnbVar = (nnb) e51Var.getAccessor().c(16);
                lzf lzfVarJ = y4e.a.j();
                gm1 gm1Var2 = gm1.a;
                qv1 qv1VarA = gm1Var2.a();
                k18 k18VarB = fm1.b();
                k18 k18VarA = fm1.a();
                k18 k18VarD = fm1.d();
                return new ci1(k18VarC, gm1Var2.getAccessor().d(15), k18Var2, k18VarB, k18VarA, k18VarD, gm1Var2.getAccessor().d(46), (s41) e51Var.getAccessor().c(22), (ks1) gm1Var2.getAccessor().c(510), nnbVar, lzfVarJ, qv1VarA, new lcj(i2));
            case 23:
                yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                float f3 = vw4.d().getDisplayMetrics().density * 12.0f;
                return new float[]{f3, f3, f3, f3, f3, f3, f3, f3};
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return e51.a.b();
            case 25:
                yy7[] yy7VarArr11 = qj1.w0;
                return 262952;
            case 26:
                yy7[] yy7VarArr12 = qj1.w0;
                return null;
            case 27:
                yy7[] yy7VarArr13 = CallPresettingsScreen.Z;
                return new vj1();
            case 28:
                int i9 = gk1.M0;
                return qqgVar;
            default:
                rha rhaVar = CallScreen.N0;
                return (zo1) e51.a.getAccessor().c(26);
        }
    }
}
