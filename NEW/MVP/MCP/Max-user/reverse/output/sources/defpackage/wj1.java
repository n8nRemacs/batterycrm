package defpackage;

import android.os.Bundle;
import java.util.Locale;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.contactlist.ContactListWidget;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class wj1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ wj1(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        nbc vbcVar;
        rp7 rp7VarValueOf;
        ilg ilgVarValueOf;
        wmg wmgVarValueOf;
        rp7 rp7VarValueOf2;
        int i = this.a;
        hz3 hz3Var = hz3.b;
        rp7 rp7Var = rp7.b;
        hz3 hz3VarValueOf = null;
        hz3 hz3VarValueOf2 = null;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = CallPresettingsScreen.Z;
                Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("chat_id_arg")) : null;
                if (lValueOf != null) {
                    return new dk1(lValueOf.longValue());
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                yy7[] yy7VarArr2 = ChatMediaTabWidget.v0;
                return new an2(bundle.getLong("chat_id"));
            case 2:
                int i2 = ConfirmRemoveOpponentToCallBottomSheet.D0;
                zi1 zi1Var = (zi1) bundle.getParcelable("opponent_id");
                gm1 gm1Var = gm1.a;
                return new fq3(zi1Var, gm1Var.a(), (ks1) gm1Var.getAccessor().c(510));
            case 3:
                yy7[] yy7VarArr3 = ContactListWidget.O0;
                String string = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                try {
                    hz3VarValueOf = hz3.valueOf(string != null ? string : "");
                } catch (IllegalArgumentException unused) {
                }
                hz3 hz3Var2 = hz3VarValueOf == null ? hz3Var : hz3VarValueOf;
                l14 l14Var = l14.a;
                return new zy3(hz3Var2, l14Var.getAccessor().d(12), (ay3) l14Var.getAccessor().c(556), l14Var.getAccessor().d(352), (lzf) l14Var.getAccessor().c(8), l14Var.getAccessor().d(99), l14Var.getAccessor().d(328), l14Var.getAccessor().d(123), l14Var.getAccessor().d(109), l14Var.getAccessor().d(329), l14Var.getAccessor().d(331), l14Var.getAccessor().d(332), l14Var.getAccessor().d(330), l14Var.getAccessor().d(389), l14Var.getAccessor().d(108), l14Var.getAccessor().d(46), l14Var.getAccessor().d(48), l14Var.getAccessor().d(47), l14Var.getAccessor().d(487), l14Var.getAccessor().d(84));
            case 4:
                yy7[] yy7VarArr4 = ContactListWidget.O0;
                String string2 = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                try {
                    hz3VarValueOf2 = hz3.valueOf(string2 != null ? string2 : "");
                } catch (IllegalArgumentException unused2) {
                }
                if (hz3VarValueOf2 != null) {
                    hz3Var = hz3VarValueOf2;
                }
                return Boolean.valueOf(hz3Var == hz3.a);
            case 5:
                int i3 = FileDownloadWarningBottomSheet.c;
                long j = bundle.getLong("chat_id");
                long j2 = bundle.getLong("message_id");
                String string3 = bundle.getString("attach_id");
                long j3 = bundle.getLong("file_id");
                String string4 = bundle.getString("file_name");
                if (string4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String string5 = bundle.getString("file_url");
                if (string5 != null) {
                    return new kw5(j, j2, string3, j3, string4, string5, bundle.getLong("file_size"));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                yy7[] yy7VarArr5 = KeyboardStickersWidget.s0;
                bundle.getLong("arg_key_chat_id");
                mz7 mz7Var = mz7.a;
                lzf lzfVar = (lzf) mz7Var.getAccessor().c(8);
                bwf bwfVarD = mz7Var.getAccessor().d(231);
                bwf bwfVarD2 = mz7Var.getAccessor().d(236);
                bwf bwfVarD3 = mz7Var.getAccessor().d(240);
                bwf bwfVarD4 = mz7Var.getAccessor().d(241);
                mz7Var.getAccessor().getClass();
                bwf bwfVar = new bwf(new i77(27));
                mz7Var.getAccessor().getClass();
                return new ikf(lzfVar, bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVar);
            case 7:
                yy7[] yy7VarArr6 = MessagesListWidget.b1;
                return new yad(bundle.getLong("ARG_CHAT_ID"));
            case 8:
                yy7[] yy7VarArr7 = ProfileAvatarsScreen.y0;
                long j4 = bundle.getLong("EXTRA_ID");
                if (fni.a(bundle.getString("EXTRA_TYPE"), "contact")) {
                    vbcVar = new vbc(j4);
                } else {
                    wo8 wo8Var = new wo8();
                    wo8Var.a = j4;
                    fdc fdcVar = fdc.a;
                    wo8Var.c = fdcVar.b();
                    wo8Var.b = fdcVar.g();
                    tcf tcfVarA = ucf.a(hd5.a);
                    wo8Var.d = tcfVarA;
                    wo8Var.o = new hbd(tcfVarA);
                    wo8Var.X = new lbc(new r5g(""));
                    vbcVar = wo8Var;
                }
                fdc fdcVar2 = fdc.a;
                return new jcc(vbcVar, fdcVar2.getAccessor().d(9), fdcVar2.e());
            case 9:
                yy7[] yy7VarArr8 = ProfileInviteScreen.X;
                long j5 = bundle.getLong("id");
                fdc fdcVar3 = fdc.a;
                return new qic(j5, fdcVar3.getAccessor().d(12), fdcVar3.getAccessor().d(139), fdcVar3.b(), fdcVar3.e(), fdcVar3.a(), fdcVar3.getAccessor().d(44), fdcVar3.f(), fdcVar3.c(), fdcVar3.getAccessor().d(108), fdcVar3.getAccessor().d(83), fdcVar3.getAccessor().d(84), fdcVar3.getAccessor().d(605));
            case 10:
                int i4 = ProfileMemberPermissionsScreen.d;
                long j6 = bundle.getLong("id");
                yec yecVar = yec.a;
                return new hkc(j6, yecVar.b(), yecVar.c(), yecVar.a(), yecVar.getAccessor().d(44), yecVar.getAccessor().d(139), yecVar.getAccessor().d(454), yecVar.getAccessor().d(48));
            case 11:
                yy7[] yy7VarArr9 = RaiseHandActionBottomSheet.F0;
                zi1 zi1Var2 = (zi1) bundle.getParcelable("opponent_id");
                if (zi1Var2 == null) {
                    zi1Var2 = zi1.c;
                }
                return new g7d(zi1Var2, gm1.a.a());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr10 = RecordExitBottomSheet.K0;
                bgd bgdVarValueOf = bgd.valueOf(bundle.getString("open_type", "UNDEFINE"));
                k18 k18Var = fm1.a;
                gm1 gm1Var2 = gm1.a;
                return new kgd(bgdVarValueOf, bundle.containsKey("admin_record_settings") ? Boolean.valueOf(bundle.getBoolean("admin_record_settings")) : null, gm1Var2.a(), fm1.b(), gm1Var2.getAccessor().d(460), fm1.a());
            case 13:
                yy7[] yy7VarArr11 = TwoFACheckPassScreen.t0;
                String string6 = bundle.getString("twofa_check_password_source_key");
                return (string6 == null || (rp7VarValueOf = rp7.valueOf(string6.toUpperCase(Locale.ROOT))) == null) ? rp7Var : rp7VarValueOf;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr12 = TwoFACreationScreen.w0;
                String string7 = bundle.getString("creation_2fa_step_key");
                return (string7 == null || (ilgVarValueOf = ilg.valueOf(string7.toUpperCase(Locale.ROOT))) == null) ? ilg.a : ilgVarValueOf;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr13 = TwoFACreationScreen.w0;
                String string8 = bundle.getString("creation_2fa_type_key");
                jlg jlgVarValueOf = string8 != null ? jlg.valueOf(string8.toUpperCase(Locale.ROOT)) : null;
                if (jlgVarValueOf != null) {
                    return jlgVarValueOf;
                }
                throw new IllegalArgumentException("Can't open creation twoFA because type");
            case 16:
                yy7[] yy7VarArr14 = TwoFACreationScreen.w0;
                String string9 = bundle.getString("creation_2fa_source_key");
                rp7 rp7VarValueOf3 = string9 != null ? rp7.valueOf(string9.toUpperCase(Locale.ROOT)) : null;
                if (rp7VarValueOf3 != null) {
                    return rp7VarValueOf3;
                }
                throw new IllegalArgumentException("Can't open creation twoFA because source");
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr15 = TwoFAOnboardingScreen.X;
                String string10 = bundle.getString("onboarding_2fa_state_key");
                return (string10 == null || (wmgVarValueOf = wmg.valueOf(string10.toUpperCase(Locale.ROOT))) == null) ? wmg.b : wmgVarValueOf;
            case 18:
                int i5 = TwoFASettingsScreen.X;
                return new sng(bundle.getString("twofa_settings_track_id_key", ""));
            case 19:
                yy7[] yy7VarArr16 = TwoFAStartRestoreScreen.s0;
                String string11 = bundle.getString("twofa_check_password_source_key");
                return (string11 == null || (rp7VarValueOf2 = rp7.valueOf(string11.toUpperCase(Locale.ROOT))) == null) ? rp7Var : rp7VarValueOf2;
            default:
                yy7[] yy7VarArr17 = WebAppSettingsScreen.Z;
                return new owh(((w4e) ((pb3) kph.a.getAccessor().c(46))).s(), bundle.getLong("bot_id_arg"));
        }
    }
}
