package defpackage;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.location.map.show.ShowLocationScreen;
import one.me.sdk.arch.Widget;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class dse implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dse(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Activity activity;
        long j;
        switch (this.a) {
            case 0:
                SettingsStorageScreen settingsStorageScreen = (SettingsStorageScreen) this.b;
                yy7[] yy7VarArr = SettingsStorageScreen.X;
                settingsStorageScreen.getRouter().C();
                return qqg.a;
            case 1:
                ShowLocationScreen showLocationScreen = (ShowLocationScreen) this.b;
                yy7[] yy7VarArr2 = ShowLocationScreen.B0;
                jva onBackPressedDispatcher = showLocationScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return qqg.a;
            case 2:
                eoi.c(((z1f) this.b).X.getCoroutineContext(), null);
                return qqg.a;
            case 3:
                StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) this.b;
                yy7[] yy7VarArr3 = StickerPreviewScreen.z0;
                stickerPreviewScreen.getRouter().C();
                return qqg.a;
            case 4:
                StickersScreen stickersScreen = (StickersScreen) this.b;
                yy7[] yy7VarArr4 = StickersScreen.u0;
                stickersScreen.getRouter().C();
                return qqg.a;
            case 5:
                StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) this.b;
                yy7[] yy7VarArr5 = StickersShowcaseScreen.u0;
                stickersShowcaseScreen.getRouter().C();
                return qqg.a;
            case 6:
                z95 z95Var = (z95) this.b;
                if (!((ar2) obj).a.e()) {
                    z95Var.getClass();
                }
                return true;
            case 7:
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) this.b;
                yy7[] yy7VarArr6 = TwoFACheckPassScreen.t0;
                jva onBackPressedDispatcher2 = twoFACheckPassScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return qqg.a;
            case 8:
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) this.b;
                yy7[] yy7VarArr7 = TwoFACreationScreen.w0;
                if ((twoFACreationScreen.B0() != jlg.a || twoFACreationScreen.z0().ordinal() == 0) && (activity = twoFACreationScreen.getActivity()) != null) {
                    cpi.b(activity);
                }
                jva onBackPressedDispatcher3 = twoFACreationScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return qqg.a;
            case 9:
                TwoFAOnboardingScreen twoFAOnboardingScreen = (TwoFAOnboardingScreen) this.b;
                yy7[] yy7VarArr8 = TwoFAOnboardingScreen.X;
                jva onBackPressedDispatcher4 = twoFAOnboardingScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher4 != null) {
                    onBackPressedDispatcher4.d();
                }
                return qqg.a;
            case 10:
                TwoFASettingsScreen twoFASettingsScreen = (TwoFASettingsScreen) this.b;
                int i = TwoFASettingsScreen.X;
                jva onBackPressedDispatcher5 = twoFASettingsScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher5 != null) {
                    onBackPressedDispatcher5.d();
                }
                return qqg.a;
            case 11:
                TwoFAStartRestoreScreen twoFAStartRestoreScreen = (TwoFAStartRestoreScreen) this.b;
                yy7[] yy7VarArr9 = TwoFAStartRestoreScreen.s0;
                jva onBackPressedDispatcher6 = twoFAStartRestoreScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher6 != null) {
                    onBackPressedDispatcher6.d();
                }
                return qqg.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                fh9 fh9Var = (fh9) obj;
                int i2 = iyg.$EnumSwitchMapping$0[((jyg) this.b).b.ordinal()];
                if (i2 == 1) {
                    j = fh9Var.b;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ss4 ss4Var = fh9Var.A0;
                    j = ss4Var != null ? ss4Var.a : 0L;
                }
                return Long.valueOf(j);
            case 13:
                q8h q8hVar = (q8h) this.b;
                byte[] bArr = (byte[]) obj;
                String str = q8hVar.h;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "VideoMessage Recording. Capture first frame to have a preview", null);
                    }
                }
                q8hVar.x.h(new c5h(bArr));
                svi.e(q8hVar.i, ((q2b) q8hVar.q()).a(), null, new n8h(bArr, q8hVar, null), 2);
                return qqg.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.b;
                yy7[] yy7VarArr10 = VideoWebViewScreen.H0;
                xfh.r(videoWebViewScreen.O0().w0, jc3.b);
                return qqg.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                WebAppsSettingScreen webAppsSettingScreen = (WebAppsSettingScreen) this.b;
                yy7[] yy7VarArr11 = WebAppsSettingScreen.o;
                webAppsSettingScreen.getRouter().C();
                return qqg.a;
            default:
                return Widget.binding$lambda$8((cm6) this.b, obj);
        }
    }
}
