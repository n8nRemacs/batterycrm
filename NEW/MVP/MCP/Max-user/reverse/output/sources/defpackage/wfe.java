package defpackage;

import android.text.Editable;
import android.view.View;
import java.io.File;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class wfe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wfe(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        File file;
        Object value;
        int i = this.a;
        int i2 = 2;
        charSequence = null;
        CharSequence charSequence = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj2;
                OneMeButton oneMeButton = (OneMeButton) obj;
                CharSequence text = ((veb) serverPortBottomSheet.D0.D(serverPortBottomSheet, ServerPortBottomSheet.F0[0])).getText();
                if (text != null && text.length() != 0) {
                    u6c u6cVar = (u6c) serverPortBottomSheet.C0.getValue();
                    svi.e(u6cVar.a, ((q2b) ((lzf) u6cVar.c.getValue())).b().plus(bia.a), null, new t6c(u6cVar, text.toString(), new l3b(oneMeButton, 25, serverPortBottomSheet), null), 2);
                    break;
                }
                break;
            case 1:
                long j = ((eq0) obj).a;
                SettingsBlacklistScreen settingsBlacklistScreen = (SettingsBlacklistScreen) ((s6b) obj2).a;
                yy7[] yy7VarArr = SettingsBlacklistScreen.Y;
                lne lneVarY0 = settingsBlacklistScreen.y0();
                lneVarY0.w0.O(lneVarY0, lne.y0[0], svi.d(lneVarY0.a, ((q2b) ((lzf) lneVarY0.Z.getValue())).a(), i84.b, new jne(lneVarY0, j, null)));
                break;
            case 2:
                ((joe) obj2).h(((ioe) obj).getItemId());
                break;
            case 3:
                long j2 = ((l8e) obj).d;
                SettingMediaScreen settingMediaScreen = (SettingMediaScreen) ((awd) obj2).b;
                yy7[] yy7VarArr2 = SettingMediaScreen.X;
                settingMediaScreen.y0().v((int) j2);
                break;
            case 4:
                long j3 = ((d8e) obj).d;
                SettingsPrivacyScreen settingsPrivacyScreen = (SettingsPrivacyScreen) ((n4e) obj2).a;
                yy7[] yy7VarArr3 = SettingsPrivacyScreen.Z;
                ere ereVarY0 = settingsPrivacyScreen.y0();
                jve jveVar = ereVarY0.O0;
                if (j3 != lbb.k) {
                    if (j3 != lbb.f) {
                        if (j3 != lbb.d) {
                            if (j3 != lbb.o) {
                                if (j3 != lbb.e) {
                                    if (j3 != lbb.g) {
                                        if (j3 != lbb.j) {
                                            if (j3 != lbb.i) {
                                                if (j3 != lbb.a) {
                                                    if (j3 != lbb.c) {
                                                        if (j3 != lbb.l) {
                                                            if (j3 == lbb.m) {
                                                                gqe.c.getClass();
                                                                ereVarY0.A(new ei4(":settings/privacy/profile-deletion"));
                                                                break;
                                                            }
                                                        } else {
                                                            klc klcVar = (klc) ereVarY0.y0.getValue();
                                                            long jS = ((w4e) ereVarY0.y()).s();
                                                            xac xacVar = (xac) ((f9a) klcVar.f.computeIfAbsent(Long.valueOf(jS), new ni(26, new k03(klcVar, jS, i2)))).getValue();
                                                            if (xacVar != null && xacVar.c.contains(flc.c)) {
                                                                gqe.c.getClass();
                                                                ereVarY0.A(new ei4(":twofa/password/check"));
                                                                break;
                                                            } else {
                                                                gqe.c.getClass();
                                                                ereVarY0.A(new ei4(":settings/privacy/onboarding-twofa?state=start"));
                                                                break;
                                                            }
                                                        }
                                                    } else if (!ereVarY0.x().q()) {
                                                        ereVarY0.A(fme.l);
                                                        break;
                                                    } else {
                                                        ereVarY0.A(fme.p);
                                                        break;
                                                    }
                                                } else if (!ereVarY0.x().q()) {
                                                    ereVarY0.A(fme.m);
                                                    break;
                                                } else {
                                                    ereVarY0.A(fme.p);
                                                    break;
                                                }
                                            } else if (ereVarY0.x().q() && !ereVarY0.y().b() && !ereVarY0.x().g.getBoolean("app.privacy.safe_mode_no_pin", false)) {
                                                ereVarY0.A(cme.b);
                                                break;
                                            }
                                        } else if (!ereVarY0.x().q()) {
                                            ereVarY0.A(fme.i);
                                            break;
                                        } else {
                                            ereVarY0.A(fme.p);
                                            break;
                                        }
                                    } else {
                                        ereVarY0.A(fme.k);
                                        break;
                                    }
                                } else {
                                    gqe.c.getClass();
                                    ereVarY0.A(new ei4(":settings/blacklist"));
                                    break;
                                }
                            } else {
                                gqe.c.getClass();
                                ereVarY0.A(new ei4(":settings/webapps"));
                                break;
                            }
                        } else if (!ereVarY0.x().q()) {
                            ereVarY0.A(fme.j);
                            break;
                        } else {
                            ereVarY0.A(fme.p);
                            break;
                        }
                    } else if (!ereVarY0.x().q()) {
                        ereVarY0.A(fme.h);
                        break;
                    } else {
                        ereVarY0.A(fme.p);
                        break;
                    }
                } else {
                    ereVarY0.A(fme.f);
                    break;
                }
                break;
            case 5:
                t8e t8eVar = (t8e) obj;
                long j4 = t8eVar.d;
                String str = t8eVar.s0;
                SettingRingtoneScreen settingRingtoneScreen = (SettingRingtoneScreen) ((kme) obj2).b;
                yy7[] yy7VarArr4 = SettingRingtoneScreen.Z;
                tme tmeVarY0 = settingRingtoneScreen.y0();
                int i3 = (int) j4;
                ci5 ci5Var = tmeVarY0.u0;
                if (i3 != qbb.c) {
                    if (i3 != qbb.f) {
                        if (i3 != qbb.b) {
                            if (str != null && (file = (File) tmeVarY0.v0.get(str)) != null) {
                                tmeVarY0.y(new kqd(file.getAbsolutePath()));
                                Integer num = tmeVarY0.x0;
                                if (num == null || num.intValue() != i3 || !tmeVarY0.v().d()) {
                                    tmeVarY0.w();
                                    tmeVarY0.v().i(new nme(file.getAbsolutePath(), 0), 3, false, 2);
                                    tmeVarY0.x0 = Integer.valueOf(i3);
                                    break;
                                } else {
                                    tmeVarY0.v().j();
                                    tmeVarY0.x0 = null;
                                    break;
                                }
                            }
                        } else {
                            xfh.r(ci5Var, mre.b);
                            tmeVarY0.v().j();
                            tmeVarY0.x0 = null;
                            break;
                        }
                    } else {
                        tmeVarY0.v().j();
                        nqd nqdVar = tmeVarY0.b.c;
                        mqd mqdVar = nqdVar instanceof mqd ? (mqd) nqdVar : null;
                        xfh.r(ci5Var, new nre(mqdVar != null ? mqdVar.a : null));
                        break;
                    }
                } else {
                    tmeVarY0.y(lqd.a);
                    Integer num2 = tmeVarY0.x0;
                    if (num2 == null || num2.intValue() != i3 || !tmeVarY0.v().d()) {
                        tmeVarY0.w();
                        tmeVarY0.v().i((ome) tmeVarY0.y0.getValue(), 3, false, 2);
                        tmeVarY0.x0 = Integer.valueOf(i3);
                        break;
                    } else {
                        tmeVarY0.v().j();
                        tmeVarY0.x0 = null;
                        break;
                    }
                }
                break;
            case 6:
                long j5 = ((v8e) obj).b;
                SettingsStorageScreen settingsStorageScreen = (SettingsStorageScreen) ((zid) obj2).a;
                yy7[] yy7VarArr5 = SettingsStorageScreen.X;
                ((nse) settingsStorageScreen.a.getValue()).w((int) j5);
                break;
            case 7:
                long j6 = ((x8e) obj).d;
                SettingsStorageScreen settingsStorageScreen2 = (SettingsStorageScreen) ((zid) obj2).a;
                yy7[] yy7VarArr6 = SettingsStorageScreen.X;
                ((nse) settingsStorageScreen2.a.getValue()).w((int) j6);
                break;
            case 8:
                ((xwe) obj2).I0.setProgressEnabled(true);
                ((occ) obj).invoke();
                break;
            case 9:
                g1f g1fVar = (g1f) obj2;
                g1fVar.b.invoke(Integer.valueOf(((f1f) obj).a));
                g1fVar.dismiss();
                break;
            case 10:
                StartRecordBottomSheet startRecordBottomSheet = (StartRecordBottomSheet) obj2;
                yy7[] yy7VarArr7 = StartRecordBottomSheet.E0;
                zbf zbfVar = (zbf) startRecordBottomSheet.D0.getValue();
                Editable text2 = ((w3b) obj).getText();
                wo1 wo1Var = zbfVar.b;
                if (text2 != null && vmf.F(text2) && text2.length() > 0) {
                    xfh.r(wo1Var.L0, en1.z);
                    break;
                } else {
                    if (text2 != null && text2.length() != 0) {
                        charSequence = text2;
                    }
                    if (charSequence == null) {
                        charSequence = (CharSequence) zbfVar.d.getValue();
                    }
                    xfh.r(wo1Var.L0, new um1(charSequence));
                    startRecordBottomSheet.E0(true);
                    break;
                }
                break;
            case 11:
                cff cffVar = (cff) obj;
                fff fffVar = ((tk8) obj2).G0;
                if (fffVar != null) {
                    cffVar.g(fffVar);
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                em6 em6Var = (em6) obj;
                h8e h8eVar = ((zff) obj2).I0;
                if (h8eVar != null) {
                    em6Var.invoke(h8eVar);
                    break;
                }
                break;
            case 13:
                ogf ogfVar = (ogf) obj2;
                em6 em6Var2 = (em6) obj;
                f62 f62Var = ogfVar.K0;
                if (f62Var != null) {
                    ((OneMeDraweeView) ogfVar.a).setBackground(ogfVar.E0);
                    em6Var2.invoke(Long.valueOf(f62Var.b.a));
                    break;
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                em6 em6Var3 = (em6) obj;
                h8e h8eVar2 = ((mif) obj2).E0;
                if (h8eVar2 != null) {
                    em6Var3.invoke(h8eVar2);
                    break;
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                fqf fqfVar = (fqf) obj;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) ((cqf) obj2);
                tcf tcfVar = suggestionsWidget.P0().H0;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, fqfVar));
                suggestionsWidget.Q0();
                break;
            case 16:
                ((ts9) obj2).invoke((f7g) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((rr1) obj2).invoke();
                ((ncg) obj).a();
                break;
            case 18:
                long j7 = ((eng) obj).d;
                TwoFASettingsScreen twoFASettingsScreen = (TwoFASettingsScreen) ((zid) obj2).a;
                int i4 = TwoFASettingsScreen.X;
                sng sngVar = (sng) twoFASettingsScreen.c.getValue();
                int i5 = (int) j7;
                String str2 = sngVar.b;
                ci5 ci5Var2 = sngVar.s0;
                if (i5 != e0d.oneme_settings_twofa_configuration_setting_password) {
                    if (i5 != e0d.oneme_settings_twofa_configuration_setting_email) {
                        if (i5 == e0d.oneme_settings_twofa_configuration_setting_disable_twofa) {
                            xfh.r(sngVar.t0, new blg(new n5g(r4d.oneme_settings_twofa_configuration_disable_warning_title), new n5g(r4d.oneme_settings_twofa_configuration_disable_warning_subtitle), ve3.j(new pq3(e0d.oneme_settings_twofa_configuration_disable_twofa_positive, new n5g(r4d.oneme_settings_twofa_configuration_disable_warning_positive_action), 3, true, 3, 3), new pq3(e0d.oneme_settings_twofa_configuration_disable_twofa_negative, new n5g(r4d.oneme_settings_twofa_configuration_disable_warning_negative_action), 2, 32))));
                            break;
                        }
                    } else {
                        d70 d70Var = (d70) sngVar.u0.get();
                        xfh.r(ci5Var2, new dlg(str2, new up7(null, null, new tp7(0, 13, 0L, null, d70Var != null ? d70Var.c : null), null, null, 27)));
                        break;
                    }
                } else {
                    xfh.r(ci5Var2, new elg(str2));
                    break;
                }
                break;
            case 19:
                ((em6) obj2).invoke(((gxg) obj).d);
                break;
            case 20:
                ValueBottomSheet valueBottomSheet = (ValueBottomSheet) obj2;
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                bbd bbdVar = valueBottomSheet.F0;
                yy7[] yy7VarArr8 = ValueBottomSheet.H0;
                CharSequence text3 = ((veb) bbdVar.D(valueBottomSheet, yy7VarArr8[2])).getText();
                if (text3.length() > 0) {
                    c54 targetController = valueBottomSheet.getTargetController();
                    myg mygVar = targetController instanceof myg ? (myg) targetController : null;
                    if (mygVar != null) {
                        hs hsVar = valueBottomSheet.D0;
                        yy7 yy7Var = yy7VarArr8[0];
                        mygVar.G(((Number) hsVar.a(valueBottomSheet)).longValue(), text3.toString());
                    }
                    api.e(oneMeButton2);
                    valueBottomSheet.E0(true);
                    break;
                }
                break;
            case 21:
                yzh yzhVar = (yzh) obj;
                xzh xzhVar = ((zzh) obj2).E0;
                vzh vzhVar = xzhVar instanceof vzh ? (vzh) xzhVar : null;
                if (vzhVar != null) {
                    yzhVar.b(vzhVar, !((doe) vzhVar.a.Y).a);
                    break;
                }
                break;
            case 22:
                ts9 ts9Var = (ts9) obj;
                xzh xzhVar2 = ((a0i) obj2).E0;
                if (xzhVar2 != null) {
                    ts9Var.invoke(xzhVar2);
                    break;
                }
                break;
            default:
                cff cffVar2 = (cff) obj;
                fff fffVar2 = ((tk8) obj2).G0;
                if (fffVar2 != null) {
                    cffVar2.g(fffVar2);
                    break;
                }
                break;
        }
    }
}
