package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.location.map.show.ShowLocationScreen;
import one.me.profile.RknBottomSheet;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.SettingsAvatarBottomSheet;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class pcc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pcc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.a) {
            case 0:
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) this.b;
                yy7[] yy7VarArr = ProfileChangeLinkScreen.t0;
                api.c(profileChangeLinkScreen);
                u82 u82VarA0 = profileChangeLinkScreen.A0();
                u82VarA0.s0.O(u82VarA0, u82.t0[0], svi.e(u82VarA0.a, null, null, new t82(u82VarA0, null), 3));
                break;
            case 1:
                rec recVarZ0 = ((ProfileEditAdminPermissionsWidget) ((b0i) this.b).X).z0();
                recVarZ0.B0.O(recVarZ0, rec.E0[0], svi.d(recVarZ0.a, ((q2b) ((lzf) recVarZ0.Z.getValue())).a(), i84.b, new mec(recVarZ0, null)));
                break;
            case 2:
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) this.b;
                yy7[] yy7VarArr2 = ProfileEditAdminPermissionsWidget.w0;
                profileEditAdminPermissionsWidget.z0().u();
                break;
            case 3:
                ((ffb) this.b).invoke();
                break;
            case 4:
                ((sxa) this.b).invoke();
                break;
            case 5:
                RknBottomSheet rknBottomSheet = (RknBottomSheet) this.b;
                yy7[] yy7VarArr3 = RknBottomSheet.G0;
                rknBottomSheet.E0(true);
                break;
            case 6:
                gtd gtdVar = ((jtd) this.b).K0;
                if (gtdVar != null) {
                    gtdVar.a();
                    break;
                }
                break;
            case 7:
                SafeModeOnboardingScreen safeModeOnboardingScreen = (SafeModeOnboardingScreen) this.b;
                yy7[] yy7VarArr4 = SafeModeOnboardingScreen.X;
                wwd wwdVar = (wwd) safeModeOnboardingScreen.c.getValue();
                wwdVar.d.O(wwdVar, wwd.X[0], svi.d(wwdVar.a, ((q2b) ((lzf) wwdVar.b.getValue())).a(), i84.b, new vwd(wwdVar, null)));
                break;
            case 8:
                sbe sbeVar = (sbe) this.b;
                wo6 wo6Var = sbeVar.H0;
                if (wo6Var != null) {
                    SelectAlbumWidget selectAlbumWidget = (SelectAlbumWidget) sbeVar.E0.b;
                    yy7[] yy7VarArr5 = SelectAlbumWidget.X;
                    dbe dbeVarA0 = selectAlbumWidget.A0();
                    tcf tcfVar = dbeVarA0.X;
                    vo6 vo6Var = wo6Var.a;
                    tcfVar.m(null, vo6Var);
                    xfh.r(dbeVarA0.d, new uae(vo6Var));
                    xfh.r(dbeVarA0.o, new rae());
                    break;
                }
                break;
            case 9:
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) this.b;
                yy7[] yy7VarArr6 = ServerHostBottomSheet.K0;
                CharSequence text = ((veb) serverHostBottomSheet.I0.D(serverHostBottomSheet, ServerHostBottomSheet.K0[3])).getText();
                if (text != null && text.length() != 0) {
                    r77 r77Var = (r77) serverHostBottomSheet.C0.getValue();
                    String string = text.toString();
                    SharedPreferences.Editor editorEdit = r77Var.o.edit();
                    editorEdit.putString("Custom", string);
                    editorEdit.apply();
                    r77Var.v(string);
                    break;
                }
                break;
            case 10:
                SettingsAvatarBottomSheet settingsAvatarBottomSheet = (SettingsAvatarBottomSheet) this.b;
                hs hsVar = settingsAvatarBottomSheet.F0;
                yy7[] yy7VarArr7 = SettingsAvatarBottomSheet.G0;
                yy7 yy7Var = yy7VarArr7[4];
                if (!((Boolean) hsVar.a(settingsAvatarBottomSheet)).booleanValue()) {
                    yy7 yy7Var2 = yy7VarArr7[4];
                    hsVar.b(settingsAvatarBottomSheet, Boolean.TRUE);
                    settingsAvatarBottomSheet.getTargetController();
                }
                settingsAvatarBottomSheet.E0(true);
                break;
            case 11:
                ShareDataPickerScreen shareDataPickerScreen = (ShareDataPickerScreen) this.b;
                yy7[] yy7VarArr8 = ShareDataPickerScreen.I0;
                tte tteVar = (tte) shareDataPickerScreen.I0().c;
                ShareData shareData = tteVar.a;
                if (shareData != null && (str = shareData.text) != null) {
                    tteVar.k.h(new wte(str));
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Editable text2 = ((xwe) this.b).G0.getText();
                if (text2 != null) {
                    text2.clear();
                    break;
                }
                break;
            case 13:
                ((occ) this.b).invoke();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((occ) this.b).invoke();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ShowLocationScreen showLocationScreen = (ShowLocationScreen) this.b;
                yy7[] yy7VarArr9 = ShowLocationScreen.B0;
                showLocationScreen.z0().u();
                break;
            case 16:
                ((sxa) this.b).invoke();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                StickersScreen stickersScreen = (StickersScreen) this.b;
                yy7[] yy7VarArr10 = StickersScreen.u0;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                sjf sjfVar = (sjf) stickersScreen.A0().x0.a.getValue();
                intent.putExtra("android.intent.extra.TEXT", sjfVar != null ? sjfVar.c : null);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                bud budVar = (bud) ue3.Q(stickersScreen.getRouter().e());
                pif.c.L0(intent, budVar != null ? budVar.b : null);
                break;
            case 18:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                yy7[] yy7VarArr11 = SuggestionsWidget.F0;
                suggestionsWidget.Q0();
                break;
            case 19:
                AboutAppSettingsScreen aboutAppSettingsScreen = (AboutAppSettingsScreen) ((kce) ((kh1) this.b).F0).b;
                int i = AboutAppSettingsScreen.c;
                a0 a0VarY0 = aboutAppSettingsScreen.y0();
                svi.e(a0VarY0.a, null, null, new x(a0VarY0, null), 3);
                break;
            case 20:
                ((rfb) ((ufb) this.b)).b.invoke(view);
                break;
            case 21:
                ((sfb) this.b).e.invoke(view);
                break;
            case 22:
                ((ncg) this.b).dismiss();
                break;
            case 23:
                TwoFAOnboardingScreen twoFAOnboardingScreen = (TwoFAOnboardingScreen) this.b;
                yy7[] yy7VarArr12 = TwoFAOnboardingScreen.X;
                ang angVar = (ang) twoFAOnboardingScreen.d.getValue();
                if (angVar.b != wmg.b) {
                    x9f x9fVar = angVar.Y;
                    if (x9fVar == null || !x9fVar.isActive()) {
                        xfh.r(angVar.o, new mmg(true));
                        angVar.Y = xfh.o(angVar, ((q2b) ((lzf) angVar.d.getValue())).b(), new zmg(angVar, null), 2);
                        break;
                    }
                } else {
                    ci5 ci5Var = angVar.X;
                    omg.c.getClass();
                    xfh.r(ci5Var, new ei4(":settings/privacy"));
                    break;
                }
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                b3h b3hVar = (b3h) this.b;
                m00 m00Var = b3hVar.X;
                Long l = b3hVar.Y;
                if (m00Var != null && l != null) {
                    long jLongValue = l.longValue();
                    sm6 sm6Var = b3hVar.d;
                    if (sm6Var != null) {
                        sm6Var.invoke(m00Var, Long.valueOf(jLongValue));
                        break;
                    }
                }
                break;
            case 25:
                v6h.b((v6h) this.b);
                break;
            case 26:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                yy7[] yy7VarArr13 = VideoMessageWidget.H0;
                xfh.r(videoMessageWidget.G0().s0, u5h.a);
                break;
            case 27:
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.b;
                yy7[] yy7VarArr14 = VideoWebViewScreen.H0;
                aeh aehVarO0 = videoWebViewScreen.O0();
                aehVarO0.getClass();
                aehVarO0.x0.O(aehVarO0, aeh.C0[0], xfh.o(aehVarO0, null, new xdh(aehVarO0, null), 1));
                break;
            case 28:
                ((ljh) ((VpnPanelWidget) this.b).b.getValue()).b.o(dxg.c);
                break;
            default:
                qkh qkhVar = ((rkh) this.b).c;
                if (qkhVar != null) {
                    RecordControlsWidget recordControlsWidget = (RecordControlsWidget) ((hfd) qkhVar).b;
                    yy7[] yy7VarArr15 = RecordControlsWidget.g1;
                    recordControlsWidget.S0().A().e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pcc(SettingsAvatarBottomSheet settingsAvatarBottomSheet, int i) {
        this.a = 10;
        this.b = settingsAvatarBottomSheet;
    }
}
