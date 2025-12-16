package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.dev.CallsSDKException;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ub implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ub(em6 em6Var, yb9 yb9Var) {
        this.a = 14;
        this.b = (hn6) em6Var;
        this.c = yb9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v89, types: [em6, hn6] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IOException {
        Conversation conversationA;
        DebugManager debugManager;
        switch (this.a) {
            case 0:
                ((k) this.b).invoke(Long.valueOf(((da) this.c).a));
                return;
            case 1:
                zbb zbbVar = (zbb) this.b;
                TextView textView = (TextView) this.c;
                yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
                if (zbbVar.getValue() != 1.0f) {
                    uog.i(textView, p07.CONTEXT_CLICK);
                }
                zbbVar.setValue(1.0f);
                return;
            case 2:
                ((eb6) ((en0) this.b).F0).invoke((mb6) this.c);
                return;
            case 3:
                h08 h08Var = (h08) this.b;
                long j = ((g61) this.c).c;
                CallDebugMenuScreen callDebugMenuScreen = (CallDebugMenuScreen) h08Var.b;
                yy7[] yy7VarArr2 = CallDebugMenuScreen.Z;
                j61 j61Var = (j61) callDebugMenuScreen.b.getValue();
                j61Var.getClass();
                k18 k18Var = j61Var.b;
                if (j != k0b.q) {
                    if (j != k0b.r || (conversationA = ((n64) ((a61) ((hw1) ((tv1) k18Var.getValue())).c1.getValue()).a.getValue()).a()) == null || (debugManager = conversationA.getDebugManager()) == null) {
                        return;
                    }
                    debugManager.reportError(new CallsSDKException("It's test application crash... Please don't worry!", null, 2, null));
                    return;
                }
                a61 a61Var = (a61) ((hw1) ((tv1) k18Var.getValue())).c1.getValue();
                a61Var.getClass();
                mc mcVar = new mc(5);
                if (Looper.getMainLooper().isCurrentThread()) {
                    mcVar.run();
                    throw null;
                }
                a61Var.b.post(mcVar);
                return;
            case 4:
                iv6 iv6Var = (iv6) this.b;
                long itemId = ((te1) this.c).getItemId();
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) iv6Var.b;
                b6a b6aVar = CallLinkInfoScreen.A0;
                callLinkInfoScreen.B0().u(itemId);
                return;
            case 5:
                cf1 cf1Var = (cf1) this.b;
                CallLinkInfoScreen callLinkInfoScreen2 = (CallLinkInfoScreen) this.c;
                b6a b6aVar2 = CallLinkInfoScreen.A0;
                if (cf1Var.d instanceof af1) {
                    callLinkInfoScreen2.z0().d = rx1.c;
                    callLinkInfoScreen2.z0().f = 1;
                    callLinkInfoScreen2.z0().i(sx1.a, false);
                    callLinkInfoScreen2.B0().u(yza.f);
                    return;
                }
                return;
            case 6:
                CallLinkInfoScreen callLinkInfoScreen3 = (CallLinkInfoScreen) this.b;
                xe1 xe1Var = (xe1) this.c;
                b6a b6aVar3 = CallLinkInfoScreen.A0;
                callLinkInfoScreen3.z0().f = 1;
                callLinkInfoScreen3.z0().d = rx1.c;
                callLinkInfoScreen3.z0().i(sx1.a, false);
                callLinkInfoScreen3.B0().u(xe1Var.getItemId());
                return;
            case 7:
                mh1 mh1Var = (mh1) this.b;
                zi1 zi1Var = (zi1) this.c;
                h08 h08Var2 = mh1Var.E0;
                if (h08Var2 != null) {
                    mh1Var.g();
                    CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) h08Var2.b;
                    callOpponentsListWidget.o.O(callOpponentsListWidget, CallOpponentsListWidget.H0[0], svi.e(callOpponentsListWidget.getViewLifecycleScope(), null, i84.b, new ki1(callOpponentsListWidget, zi1Var, null), 1));
                    return;
                }
                return;
            case 8:
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.b;
                mq1 mq1Var = (mq1) this.c;
                int[] iArr = new int[2];
                appCompatImageView.getLocationOnScreen(iArr);
                Point point = new Point(iArr[0], iArr[1]);
                point.y = appCompatImageView.getHeight() + point.y;
                lq1 lq1Var = mq1Var.K0;
                if (lq1Var != null) {
                    zi1 zi1Var2 = mq1Var.P0;
                    CallScreen callScreen = ((ql1) lq1Var).a;
                    rha rhaVar = CallScreen.N0;
                    callScreen.H0().C(zi1Var2, point);
                    return;
                }
                return;
            case 9:
                tr1 tr1Var = ((ur1) this.b).F0;
                if (tr1Var != null) {
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((r5j) tr1Var).b;
                    yy7[] yy7VarArr3 = CallTopPanelWidget.d;
                    xfh.r(callTopPanelWidget.z0().b.L0, wm1.D);
                    return;
                }
                return;
            case 10:
                it1 it1Var = (it1) this.b;
                jtd jtdVar = (jtd) this.c;
                int[] iArr2 = new int[2];
                it1Var.N0.getLocationOnScreen(iArr2);
                Point point2 = new Point(iArr2[0], iArr2[1]);
                point2.y = jtdVar.getHeight() + point2.y;
                ft1 ft1Var = it1Var.b1;
                if (ft1Var != null) {
                    ft1Var.j(it1Var.h1, point2);
                    return;
                }
                return;
            case 11:
                kh1 kh1Var = (kh1) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                kce kceVar = (kce) kh1Var.F0;
                String string = charSequence.toString();
                AboutAppSettingsScreen aboutAppSettingsScreen = (AboutAppSettingsScreen) kceVar.b;
                int i = AboutAppSettingsScreen.c;
                xfh.r(aboutAppSettingsScreen.y0().X, new s(string));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((jx0) this.b).invoke((ub9) this.c);
                return;
            case 13:
                ((jx0) this.b).invoke((ub9) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((hn6) this.b).invoke((yb9) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((k5e) this.b).invoke((cy2) this.c);
                return;
            case 16:
                ChatStatusBottomWidget chatStatusBottomWidget = (ChatStatusBottomWidget) this.b;
                gy2 gy2Var = (gy2) this.c;
                yy7[] yy7VarArr4 = ChatStatusBottomWidget.c;
                i84 i84Var = i84.b;
                switch (hy2.$EnumSwitchMapping$0[gy2Var.ordinal()]) {
                    case -1:
                    case 6:
                        return;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        zx2 zx2VarY0 = chatStatusBottomWidget.y0();
                        xfh.o(zx2VarY0, ((q2b) zx2VarY0.y()).b(), new tw2(zx2VarY0, null), 2);
                        return;
                    case 2:
                        zx2 zx2VarY02 = chatStatusBottomWidget.y0();
                        zx2VarY02.getClass();
                        xfh.o(zx2VarY02, null, new yx2(zx2VarY02, null), 3);
                        return;
                    case 3:
                        chatStatusBottomWidget.y0().C();
                        return;
                    case 4:
                        zx2 zx2VarY03 = chatStatusBottomWidget.y0();
                        zx2VarY03.T0.O(zx2VarY03, zx2.h1[7], svi.d(zx2VarY03.a, ((q2b) zx2VarY03.y()).b(), i84Var, new vw2(zx2VarY03, null)));
                        return;
                    case 5:
                        zx2 zx2VarY04 = chatStatusBottomWidget.y0();
                        zx2VarY04.U0.O(zx2VarY04, zx2.h1[8], svi.d(zx2VarY04.a, ((q2b) zx2VarY04.y()).b(), i84Var, new vx2(zx2VarY04, null)));
                        return;
                    case 7:
                        zx2 zx2VarY05 = chatStatusBottomWidget.y0();
                        xfh.o(zx2VarY05, ((q2b) zx2VarY05.y()).b(), new yw2(zx2VarY05, null), 2);
                        return;
                    case 8:
                        zx2 zx2VarY06 = chatStatusBottomWidget.y0();
                        pb2 pb2Var = (pb2) zx2VarY06.a1.a.getValue();
                        String strS = pb2Var != null ? pb2Var.s() : null;
                        xfh.r(zx2VarY06.d1, new fw2(new p5g(n1b.d, ys.D(new Object[]{strS != null ? strS : ""})), ve3.j(new pq3(m1b.u, new n5g(n1b.c), 1, 56), new pq3(m1b.q, new n5g(mvd.p), 2, 56))));
                        return;
                    case 9:
                        zx2 zx2VarY07 = chatStatusBottomWidget.y0();
                        pb2 pb2Var2 = (pb2) zx2VarY07.a1.a.getValue();
                        String strS2 = pb2Var2 != null ? pb2Var2.s() : null;
                        xfh.r(zx2VarY07.d1, new fw2(new p5g(n1b.b, ys.D(new Object[]{strS2 != null ? strS2 : ""})), ve3.j(new pq3(m1b.t, new n5g(n1b.a), 1, 56), new pq3(m1b.q, new n5g(mvd.p), 2, 56))));
                        return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                ((w03) this.b).accept(((hs2) this.c).a);
                return;
            case 18:
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = (ConfirmAddOpponentToCallBottomSheet) this.b;
                o73 o73Var = (o73) this.c;
                int i2 = ConfirmAddOpponentToCallBottomSheet.E0;
                ap3 ap3Var = (ap3) confirmAddOpponentToCallBottomSheet.C0.getValue();
                boolean zIsChecked = o73Var.isChecked();
                Long l = ((n41) ((c51) ap3Var.b).j.getValue()).a;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (ap3Var.o != null) {
                        return;
                    }
                    ap3Var.o = xfh.o(ap3Var, ((q2b) ((lzf) ap3Var.d.getValue())).b(), new zo3(ap3Var, zIsChecked, jLongValue, null), 2);
                    return;
                }
                return;
            case 19:
                ((ia) this.b).invoke(Long.valueOf(((xx3) this.c).a));
                return;
            case 20:
                ((k5e) this.b).invoke((q04) this.c);
                return;
            case 21:
                ContextMenuPopupWindow contextMenuPopupWindow = (ContextMenuPopupWindow) this.b;
                b44 b44Var = (b44) this.c;
                yy7[] yy7VarArr5 = ContextMenuPopupWindow.u0;
                hs hsVar = contextMenuPopupWindow.Y;
                yy7[] yy7VarArr6 = ContextMenuPopupWindow.u0;
                yy7 yy7Var = yy7VarArr6[6];
                if (!((Boolean) hsVar.a(contextMenuPopupWindow)).booleanValue()) {
                    yy7 yy7Var2 = yy7VarArr6[6];
                    hsVar.b(contextMenuPopupWindow, Boolean.TRUE);
                    c54 targetController = contextMenuPopupWindow.getTargetController();
                    g44 g44Var = targetController instanceof g44 ? (g44) targetController : null;
                    if (g44Var != null) {
                        int i3 = b44Var.a;
                        hs hsVar2 = contextMenuPopupWindow.a;
                        yy7 yy7Var3 = yy7VarArr6[0];
                        g44Var.C(i3, (Bundle) hsVar2.a(contextMenuPopupWindow));
                    }
                }
                contextMenuPopupWindow.dismiss();
                return;
            case 22:
                a44 a44Var = (a44) this.b;
                e18 e18Var = (e18) this.c;
                a44Var.c.invoke();
                if (e18Var.b) {
                    e18Var.dismiss();
                    return;
                }
                return;
            case 23:
                ((em6) this.b).invoke((b44) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                t44 t44Var = (t44) this.b;
                el9 el9Var = (el9) this.c;
                ukd ukdVar = t44Var.I0;
                if (ukdVar != null) {
                    long j2 = el9Var.a;
                    MessagesListWidget messagesListWidget = (MessagesListWidget) ukdVar.b;
                    yy7[] yy7VarArr7 = MessagesListWidget.b1;
                    ay9 ay9VarE = messagesListWidget.K0().E();
                    ay9VarE.f(svi.d(ay9VarE.c, ay9VarE.b, i84.b, new rx9(ay9VarE, j2, null)));
                    return;
                }
                return;
            case 25:
                u4e u4eVar = (u4e) this.b;
                x2b x2bVar = (x2b) this.c;
                SelectCountryBottomSheet selectCountryBottomSheet = (SelectCountryBottomSheet) u4eVar.b;
                jbe jbeVar = SelectCountryBottomSheet.E0;
                c54 targetController2 = selectCountryBottomSheet.getTargetController();
                c94 c94Var = targetController2 instanceof c94 ? (c94) targetController2 : null;
                if (c94Var != null) {
                    c94Var.O(x2bVar);
                }
                if (selectCountryBottomSheet.getView() != null) {
                    selectCountryBottomSheet.E0(true);
                    return;
                }
                return;
            case 26:
                ((d92) this.b).invoke(Integer.valueOf(((k94) this.c).a));
                return;
            case 27:
                ja5 ja5Var = (ja5) this.b;
                x6i x6iVar = (x6i) this.c;
                ob5 ob5Var = ja5Var.E0;
                if (ob5Var != null) {
                    CharSequence charSequence2 = ob5Var.c;
                    long j3 = ob5Var.X;
                    KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) x6iVar.b;
                    View view2 = keyboardEmojiWidget.getView();
                    if (view2 != null) {
                        uog.i(view2, p07.KEYBOARD_TAP);
                    }
                    t09 t09Var = (t09) keyboardEmojiWidget.b.getValue();
                    vh vhVar = j3 != 0 ? (vh) ((wj) t09Var.d.getValue()).i(j3).getValue() : null;
                    xfh.r(t09Var.o, new n09(vhVar != null ? t09Var.b.d(j3, vhVar.c, vhVar.e, charSequence2, kti.d(20 * vw4.d().getDisplayMetrics().density)) : t09Var.b.b(kti.d(20 * vw4.d().getDisplayMetrics().density), charSequence2)));
                    return;
                }
                return;
            case 28:
                fc5 fc5Var = (fc5) this.b;
                em6 em6Var = (em6) this.c;
                e62 e62Var = fc5Var.I0;
                if (e62Var != null) {
                    ((ViewGroup) fc5Var.a).setBackground(fc5Var.E0);
                    em6Var.invoke(Integer.valueOf(e62Var.a));
                    return;
                }
                return;
            default:
                ((eb6) ((en0) this.b).F0).invoke((mb6) this.c);
                return;
        }
    }

    public /* synthetic */ ub(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
