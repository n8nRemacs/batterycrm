package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.messages.list.ui.view.WarningLinkBottomSheet;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* loaded from: classes2.dex */
public final class qlg extends dtf implements um6 {
    public /* synthetic */ Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qlg(int i, Continuation continuation) {
        super(i, continuation);
        this.o = 5;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                qlg qlgVar = new qlg((TwoFACreationScreen) this.Y, (Continuation) obj3, 0);
                qlgVar.X = (yeb) obj2;
                qqg qqgVar = qqg.a;
                qlgVar.n(qqgVar);
                return qqgVar;
            case 1:
                qlg qlgVar2 = new qlg((TwoFAOnboardingScreen) this.Y, (Continuation) obj3, 1);
                qlgVar2.X = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                qlgVar2.n(qqgVar2);
                return qqgVar2;
            case 2:
                qlg qlgVar3 = new qlg((TwoFAStartRestoreScreen) this.Y, (Continuation) obj3, 2);
                qlgVar3.X = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                qlgVar3.n(qqgVar3);
                return qqgVar3;
            case 3:
                qlg qlgVar4 = new qlg((UploadFileAttachWorker) this.Y, (Continuation) obj3, 3);
                qlgVar4.X = (Throwable) obj2;
                qqg qqgVar4 = qqg.a;
                qlgVar4.n(qqgVar4);
                return qqgVar4;
            case 4:
                qlg qlgVar5 = new qlg((l5h) this.Y, (Continuation) obj3, 4);
                qlgVar5.X = (FrameLayout) obj;
                qqg qqgVar5 = qqg.a;
                qlgVar5.n(qqgVar5);
                return qqgVar5;
            case 5:
                qlg qlgVar6 = new qlg(3, (Continuation) obj3);
                qlgVar6.Y = (e9h) obj;
                qlgVar6.X = (yeb) obj2;
                qqg qqgVar6 = qqg.a;
                qlgVar6.n(qqgVar6);
                return qqgVar6;
            case 6:
                qlg qlgVar7 = new qlg((VideoMessageWidget) this.Y, (Continuation) obj3, 6);
                qlgVar7.X = (TextView) obj;
                qqg qqgVar7 = qqg.a;
                qlgVar7.n(qqgVar7);
                return qqgVar7;
            case 7:
                qlg qlgVar8 = new qlg((WarningLinkBottomSheet) this.Y, (Continuation) obj3, 7);
                qlgVar8.X = (LinearLayout) obj;
                qqg qqgVar8 = qqg.a;
                qlgVar8.n(qqgVar8);
                return qqgVar8;
            default:
                qlg qlgVar9 = new qlg((rkh) this.Y, (Continuation) obj3, 8);
                qlgVar9.X = (yeb) obj2;
                qqg qqgVar9 = qqg.a;
                qlgVar9.n(qqgVar9);
                return qqgVar9;
        }
    }

    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                yeb yebVar = (yeb) this.X;
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) this.Y;
                yy7[] yy7VarArr = TwoFACreationScreen.w0;
                View view = twoFACreationScreen.getView();
                if (view != null) {
                    view.setBackgroundColor(yebVar.b().l);
                }
                pog pogVar = (pog) twoFACreationScreen.findViewById(e0d.oneme_settings_twofa_onboarding_content);
                if (pogVar != null) {
                    pogVar.onThemeChanged(yebVar);
                }
                if (twoFACreationScreen.z0() == ilg.b) {
                    ((TextView) twoFACreationScreen.u0.D(twoFACreationScreen, TwoFACreationScreen.w0[3])).setTextColor(yebVar.getText().g);
                }
                break;
            case 1:
                g8j.b(obj);
                yeb yebVar2 = (yeb) this.X;
                TwoFAOnboardingScreen twoFAOnboardingScreen = (TwoFAOnboardingScreen) this.Y;
                yy7[] yy7VarArr2 = TwoFAOnboardingScreen.X;
                View view2 = twoFAOnboardingScreen.getView();
                if (view2 != null) {
                    view2.setBackgroundColor(yebVar2.b().l);
                }
                TextView textView = (TextView) twoFAOnboardingScreen.findViewById(e0d.oneme_settings_twofa_onboarding_title);
                if (textView != null) {
                    textView.setTextColor(yebVar2.getText().e);
                }
                TextView textView2 = (TextView) twoFAOnboardingScreen.findViewById(e0d.oneme_settings_twofa_onboarding_subtitle);
                if (textView2 != null) {
                    textView2.setTextColor(yebVar2.getText().g);
                }
                break;
            case 2:
                g8j.b(obj);
                yeb yebVar3 = (yeb) this.X;
                TwoFAStartRestoreScreen twoFAStartRestoreScreen = (TwoFAStartRestoreScreen) this.Y;
                yy7[] yy7VarArr3 = TwoFAStartRestoreScreen.s0;
                View view3 = twoFAStartRestoreScreen.getView();
                if (view3 != null) {
                    view3.setBackgroundColor(yebVar3.b().l);
                }
                pog pogVar2 = (pog) twoFAStartRestoreScreen.findViewById(e0d.oneme_settings_twofa_onboarding_content);
                if (pogVar2 != null) {
                    pogVar2.onThemeChanged(yebVar3);
                }
                ((TextView) twoFAStartRestoreScreen.Y.D(twoFAStartRestoreScreen, TwoFAStartRestoreScreen.s0[1])).setTextColor(yebVar3.getText().g);
                break;
            case 3:
                g8j.b(obj);
                Throwable th = (Throwable) this.X;
                if (th != null) {
                    UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) this.Y;
                    uploadFileAttachWorker.e(th);
                    uploadFileAttachWorker.C0 = la8.a();
                }
                break;
            case 4:
                g8j.b(obj);
                FrameLayout frameLayout = (FrameLayout) this.X;
                wq0 wq0Var = new wq0(frameLayout.getContext(), a93.s0.x(frameLayout.getContext()).l() ? -1558898145 : -1543503873, 10.0f, false);
                l5h l5hVar = (l5h) this.Y;
                wq0Var.i = new hah(l5hVar, 0);
                wq0Var.j = new hah(l5hVar, 1);
                frameLayout.setBackground(wq0Var);
                break;
            case 5:
                g8j.b(obj);
                ((e9h) this.Y).setBackgroundColor(((yeb) this.X).a().k().a.d);
                break;
            case 6:
                g8j.b(obj);
                TextView textView3 = (TextView) this.X;
                v1a v1aVar = a93.s0;
                v1aVar.y(textView3).getText();
                textView3.setTextColor(-1);
                GradientDrawable gradientDrawable = (GradientDrawable) textView3.getBackground();
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.Y;
                yy7[] yy7VarArr4 = VideoMessageWidget.H0;
                gradientDrawable.setColor(v1aVar.y(textView3).a().G().b.l);
                cei.k((InsetDrawable) videoMessageWidget.B0.getValue(), v1aVar.y(textView3).e().a);
                break;
            case 7:
                g8j.b(obj);
                LinearLayout linearLayout = (LinearLayout) this.X;
                WarningLinkBottomSheet warningLinkBottomSheet = (WarningLinkBottomSheet) this.Y;
                bbd bbdVar = warningLinkBottomSheet.F0;
                yy7[] yy7VarArr5 = WarningLinkBottomSheet.I0;
                TextView textView4 = (TextView) bbdVar.D(warningLinkBottomSheet, yy7VarArr5[0]);
                v1a v1aVar2 = a93.s0;
                textView4.setTextColor(v1aVar2.y(linearLayout).getText().e);
                ((TextView) warningLinkBottomSheet.G0.D(warningLinkBottomSheet, yy7VarArr5[1])).setTextColor(v1aVar2.y(linearLayout).getText().g);
                break;
            default:
                g8j.b(obj);
                yeb yebVar4 = (yeb) this.X;
                rkh rkhVar = (rkh) this.Y;
                Drawable pauseSmallIcon = rkhVar.getPauseSmallIcon();
                yebVar4.getIcon();
                cei.k(pauseSmallIcon, -1);
                cei.k(rkhVar.getPlayIcon(), -1);
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qlg(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = obj;
    }
}
