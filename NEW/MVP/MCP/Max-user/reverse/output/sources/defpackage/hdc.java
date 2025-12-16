package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class hdc implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ hdc(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new sza(v8b.N0, Integer.valueOf(x8b.s), (Integer) null, Integer.valueOf(yud.n0), (Integer) null, 52);
            case 1:
                return new sza(v8b.U0, Integer.valueOf(x8b.y), Integer.valueOf(w9b.V), Integer.valueOf(yud.J0), Integer.valueOf(w9b.Q), 32);
            case 2:
                return new sza(v8b.M0, Integer.valueOf(x8b.r), Integer.valueOf(w9b.V), Integer.valueOf(yud.g0), Integer.valueOf(w9b.Q), 32);
            case 3:
                return new sza(v8b.P0, Integer.valueOf(x8b.u), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q), 32);
            case 4:
                return new sza(v8b.O0, Integer.valueOf(x8b.t), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q), 32);
            case 5:
                return new sza(v8b.T0, Integer.valueOf(x8b.x), Integer.valueOf(w9b.V), Integer.valueOf(yud.D), Integer.valueOf(w9b.Q), 32);
            case 6:
                return new sza(v8b.S0, Integer.valueOf(x8b.w), Integer.valueOf(w9b.V), Integer.valueOf(yud.D), Integer.valueOf(w9b.Q), 32);
            case 7:
                return new sza(v8b.S0, Integer.valueOf(x8b.A), Integer.valueOf(w9b.V), Integer.valueOf(yud.D), Integer.valueOf(w9b.Q), 32);
            case 8:
                return new yuf(0);
            case 9:
                return new yuf(0);
            case 10:
                yy7[] yy7VarArr = ProfileDeletionInfoScreen.X;
                return new zdc();
            case 11:
                return (pfc) yec.a.getAccessor().c(HttpStatus.SC_NOT_IMPLEMENTED);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr2 = ProfileInviteScreen.X;
                return f1e.CHAT_INFO_INVITE_LINK;
            case 13:
                yy7[] yy7VarArr3 = ProfileScreen.C0;
                return f1e.CHAT_INFO;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new idc();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new mcc();
            case 16:
                return new njc();
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr4 = QrScannerWidget.E0;
                return f1e.MINIAPP_QR_SCANNER;
            case 18:
                yy7[] yy7VarArr5 = QrScannerWidget.E0;
                return new trc();
            case 19:
                yy7[] yy7VarArr6 = QrScannerWidget.E0;
                return ((g4b) mrc.a.getAccessor().c(56)).c();
            case 20:
                yy7[] yy7VarArr7 = QrScannerWidget.E0;
                return (qsb) mrc.a.getAccessor().c(10);
            case 21:
                yy7[] yy7VarArr8 = QrScannerWidget.E0;
                return new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
            case 22:
                return new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
            case 23:
                yy7[] yy7VarArr9 = e9d.A0;
                return qqg.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((q2b) gq9.a.getDispatchers()).b();
            case 25:
                yy7[] yy7VarArr10 = RecordControlsWidget.g1;
                return new yq5();
            case 26:
                yy7[] yy7VarArr11 = RecordControlsWidget.g1;
                return new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
            case 27:
                yy7[] yy7VarArr12 = RecordControlsWidget.g1;
                return Boolean.valueOf(((hw1) ((tv1) o6i.a.getAccessor().c(15))).u());
            case 28:
                yy7[] yy7VarArr13 = RecordControlsWidget.g1;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                return gradientDrawable;
            default:
                yy7[] yy7VarArr14 = RecordControlsWidget.g1;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                return gradientDrawable2;
        }
    }
}
