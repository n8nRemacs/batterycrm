package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.io.IOException;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.share.CallSharePickerScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.animoji.views.AnimojiTextView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [i4i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r3v28, types: [android.view.View, android.view.ViewGroup, androidx.coordinatorlayout.widget.CoordinatorLayout] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [m8] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.view.View, android.view.ViewGroup, in] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v4, types: [n8] */
    /* JADX WARN: Type inference failed for: r9v4, types: [i4i] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) throws IOException {
        h4i h4iVar;
        h4i h4iVar2;
        Object value;
        Object value2;
        switch (this.a) {
            case 0:
                AboutAppSettingsScreen aboutAppSettingsScreen = (AboutAppSettingsScreen) this.b;
                int i = AboutAppSettingsScreen.c;
                xfh.r(aboutAppSettingsScreen.y0().X, jc3.b);
                break;
            case 1:
                a93 a93Var = (a93) this.b;
                ?? r2 = (Activity) obj;
                kf3 kf3Var = kf3.b;
                 = r2 instanceof m8 ? (m8) r2 : 0;
                boolean z =  != 0 && j();
                boolean z2 =  != 0 && c();
                Window window = r2.getWindow();
                if (window != null) {
                    if (!z) {
                        kf3 kf3VarH = a93Var.k().h();
                        vgd vgdVar = new vgd(window.getDecorView());
                        if (Build.VERSION.SDK_INT >= 30) {
                            ?? i4iVar = new i4i(window.getInsetsController(), vgdVar);
                            i4iVar.c = window;
                            h4iVar2 = i4iVar;
                        } else {
                            h4iVar2 = new h4i(window, vgdVar);
                        }
                        h4iVar2.m(kf3VarH != kf3Var);
                    }
                    if (!z2) {
                        boolean z3 = a93Var.k().h() != kf3Var;
                        if (Build.VERSION.SDK_INT < 29) {
                            a93.s0.x(window.getContext()).k().b();
                            window.setNavigationBarColor(0);
                        } else {
                            window.setNavigationBarContrastEnforced(z3);
                        }
                        vgd vgdVar2 = new vgd(window.getDecorView());
                        if (Build.VERSION.SDK_INT >= 30) {
                            ?? i4iVar2 = new i4i(window.getInsetsController(), vgdVar2);
                            i4iVar2.c = window;
                            h4iVar = i4iVar2;
                        } else {
                            h4iVar = new h4i(window, vgdVar2);
                        }
                        h4iVar.l(z3);
                    }
                }
                break;
            case 2:
                AddChatAdminsScreen addChatAdminsScreen = (AddChatAdminsScreen) this.b;
                yy7[] yy7VarArr = AddChatAdminsScreen.t0;
                addChatAdminsScreen.getRouter().C();
                break;
            case 3:
                AddChatMembersScreen addChatMembersScreen = (AddChatMembersScreen) this.b;
                yy7[] yy7VarArr2 = AddChatMembersScreen.y0;
                jva onBackPressedDispatcher = addChatMembersScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                break;
            case 4:
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) this.b;
                yy7[] yy7VarArr3 = AddLinkBottomSheet.B0;
                ((o88) addLinkBottomSheet.A0.getValue()).o.m(null, ((CharSequence) obj).toString());
                break;
            case 5:
                AdminWaitingRoomScreen adminWaitingRoomScreen = (AdminWaitingRoomScreen) this.b;
                yy7[] yy7VarArr4 = AdminWaitingRoomScreen.Z;
                adminWaitingRoomScreen.getRouter().C();
                break;
            case 6:
                ((td9) ((AdminsFromContactsScreen) ((b0i) this.b).X).b.getValue()).w(((Long) obj).longValue(), false);
                break;
            case 7:
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) this.b;
                int iIntValue = ((Integer) obj).intValue();
                b0i b0iVar = adminsFromContactsScreen.s0;
                if (!((ac) adminsFromContactsScreen.c.getValue()).t() && iIntValue < b0iVar.j()) {
                    break;
                }
                break;
            case 8:
                break;
            case 9:
                AnimojiTextView.j((AnimojiTextView) this.b, (Canvas) obj);
                break;
            case 10:
                i40 i40Var = (i40) this.b;
                ((b8a) ((l7a) i40Var.c)).r((a3b) i40Var.h);
                break;
            case 11:
                f50 f50Var = (f50) this.b;
                ((b8a) f50Var.c).r(f50Var.u0);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                AvatarEditScreen avatarEditScreen = (AvatarEditScreen) this.b;
                int iIntValue2 = ((Integer) obj).intValue();
                yy7[] yy7VarArr5 = AvatarEditScreen.u0;
                break;
            case 13:
                ((fba) this.b).j(new dk0(9));
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((an0) this.b).m.set(false);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                lx0 lx0Var = (lx0) this.b;
                xr0 xr0Var = (xr0) obj;
                yw0 yw0Var = xr0Var.a;
                n10 n10Var = xr0Var.b;
                float fAbs = yw0Var.b == gx0.CALLBACK ? (float) Math.abs(n10Var.d - n10Var.b) : ((float) Math.abs(n10Var.d - n10Var.b)) - (lx0Var.s0 + lx0Var.b);
                if (fAbs < 0.0f) {
                    fAbs = (float) Math.abs(n10Var.d - n10Var.b);
                }
                xr0Var.i = TextUtils.ellipsize((yw0Var.b == gx0.REQUEST_GEO_LOCATION && yw0Var.X) ? lx0Var.getContext().getString(mvd.o) : yw0Var.a, lx0Var.A0, fAbs, TextUtils.TruncateAt.END).toString();
                break;
            case 16:
                CallAdminSettingsScreen callAdminSettingsScreen = (CallAdminSettingsScreen) this.b;
                yy7[] yy7VarArr6 = CallAdminSettingsScreen.s0;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                CallDebugMenuScreen callDebugMenuScreen = (CallDebugMenuScreen) this.b;
                yy7[] yy7VarArr7 = CallDebugMenuScreen.Z;
                break;
            case 18:
                CallHistoryScreen callHistoryScreen = (CallHistoryScreen) this.b;
                ((Integer) obj).getClass();
                yy7[] yy7VarArr8 = CallHistoryScreen.D0;
                za1 za1VarA0 = callHistoryScreen.A0();
                svi.e(za1VarA0.a, null, null, new ya1(za1VarA0, ue3.d0(((xa1) callHistoryScreen.A0().X.getValue()).b.values()), null), 3);
                tcf tcfVar = callHistoryScreen.A0().o;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, new xa1()));
                ((yfb) callHistoryScreen.s0.D(callHistoryScreen, CallHistoryScreen.D0[1])).a();
                break;
            case 19:
                break;
            case 20:
                ((md1) this.b).X.set(false);
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "CallInviteToP2PController", "Failed enable invite to p2p feature.", null);
                    }
                }
                break;
            case 21:
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) this.b;
                ?? r3 = (CoordinatorLayout) obj;
                b6a b6aVar = CallLinkInfoScreen.A0;
                ?? inVar = new in(r3.getContext());
                inVar.setId(yza.n);
                inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                inVar.setBackground(null);
                inVar.setStateListAnimator(null);
                ?? n8Var = new n8(callLinkInfoScreen);
                re3 re3Var = new re3(inVar.getContext());
                gn gnVar = new gn();
                gnVar.a = 19;
                re3Var.setLayoutParams(gnVar);
                re3Var.setTitleEnabled(false);
                n8Var.invoke(re3Var);
                inVar.addView(re3Var);
                r3.addView(inVar);
                RecyclerView recyclerView = new RecyclerView(r3.getContext(), null);
                recyclerView.setId(yza.l);
                d74 d74Var = new d74(-1, -1);
                d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(d74Var);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(callLinkInfoScreen.y0);
                recyclerView.setItemAnimator(null);
                recyclerView.j(new d9e(a93.s0.y(recyclerView), new xtd(13, callLinkInfoScreen), null, null, 28));
                recyclerView.j(new m01(1));
                r3.addView(recyclerView);
                OneMeButton oneMeButton = new OneMeButton(r3.getContext(), null);
                oneMeButton.setId(yza.o);
                oneMeButton.setSize(jza.c);
                oneMeButton.setAppearance(gza.a);
                d74 d74Var2 = new d74(-1, -2);
                d74Var2.c = 81;
                float f = 12;
                d74Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
                d74Var2.setMarginEnd(kti.d(f * vw4.d().getDisplayMetrics().density));
                ((ViewGroup.MarginLayoutParams) d74Var2).bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                ((ViewGroup.MarginLayoutParams) d74Var2).topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(d74Var2);
                r3.addView(oneMeButton);
                tqi.c(new s3(callLinkInfoScreen, , 4), r3);
                break;
            case 22:
                pf1 pf1Var = (pf1) this.b;
                Long l = ((cf1) pf1Var.t0.a.getValue()).i;
                if (l != null) {
                    long jLongValue = l.longValue();
                    ci5 ci5Var = pf1Var.v0;
                    ca1.c.getClass();
                    xc0.l(":call-presettings?chat_id=" + jLongValue, ci5Var);
                }
                break;
            case 23:
                t9f t9fVar = (t9f) this.b;
                CharSequence charSequenceA = kzi.a((CharSequence) obj);
                CallPresettingsScreen callPresettingsScreen = (CallPresettingsScreen) t9fVar.b;
                yy7[] yy7VarArr9 = CallPresettingsScreen.Z;
                dk1 dk1VarY0 = callPresettingsScreen.y0();
                tcf tcfVar2 = dk1VarY0.d;
                do {
                    value2 = tcfVar2.getValue();
                    ((tj1) value2).getClass();
                } while (!tcfVar2.c(value2, new tj1(charSequenceA)));
                dk1VarY0.u(charSequenceA);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                vfh vfhVar = (vfh) obj;
                nn1 nn1Var = ((on1) this.b).J0;
                if (nn1Var != null) {
                    CallScreen callScreen = ((ql1) nn1Var).a;
                    rha rhaVar = CallScreen.N0;
                    callScreen.H0().c.a(vfhVar);
                }
                break;
            case 25:
                CallSharePickerScreen callSharePickerScreen = (CallSharePickerScreen) this.b;
                eo7 eo7Var = CallSharePickerScreen.y0;
                jva onBackPressedDispatcher2 = callSharePickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                break;
            case 26:
                mq1 mq1Var = (mq1) this.b;
                ((Boolean) obj).booleanValue();
                i1c i1cVar = mq1Var.T0;
                if (i1cVar != null) {
                    i1cVar.c();
                }
                break;
            case 27:
                ((jtd) obj).setIcon((Drawable) this.b);
                break;
            case 28:
                CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.b;
                if (((z8c) obj) == z8c.b) {
                    q22 q22Var = cameraxCameraApiView.s0;
                    if (q22Var != null) {
                        o38 o38Var = cameraxCameraApiView.c;
                        o38Var.getClass();
                        jei.b();
                        n38 n38Var = o38Var.p;
                        yod yodVar = n38Var != null ? n38Var.c.B0 : null;
                        ((ytc) ((s6b) q22Var).a).y0.setVisibility(yodVar != null ? yodVar.b.m() : false ? 0 : 8);
                    }
                } else {
                    int i2 = CameraxCameraApiView.u0;
                }
                break;
            default:
                BottomSheetWidget bottomSheetWidget = (BottomSheetWidget) this.b;
                cda cdaVar = (cda) obj;
                if (cdaVar instanceof ei4) {
                    gqe.c.s0((ei4) cdaVar);
                } else if (cdaVar instanceof oib) {
                    Activity activity = bottomSheetWidget.getActivity();
                    if (activity != null) {
                        e6j.c(activity, ((oib) cdaVar).b.toString());
                    }
                } else if (cdaVar instanceof pib) {
                    ccb ccbVar = new ccb(bottomSheetWidget);
                    pib pibVar = (pib) cdaVar;
                    ?? B = pibVar.b.b(bottomSheetWidget.getContext());
                    ccbVar.h(B != 0 ? B : "");
                    ccbVar.a(null);
                    ccbVar.e(new qcb(pibVar.c));
                    ccbVar.i();
                } else if (cdaVar instanceof nib) {
                    ((ii4) bqe.a.getAccessor().c(116)).c(((nib) cdaVar).b, null);
                }
                q85 q85Var = BaseBottomSheetWidget.s0;
                bottomSheetWidget.E0(true);
                break;
        }
        return qqg.a;
    }
}
