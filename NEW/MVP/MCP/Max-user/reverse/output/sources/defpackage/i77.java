package defpackage;

import android.graphics.drawable.GradientDrawable;
import java.lang.annotation.Annotation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.login.inputname.InputNameScreen;
import one.me.login.inputphone.InputPhoneScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class i77 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ i77(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return jei.a(j77.m);
            case 1:
                return jei.a(j77.o);
            case 2:
                yy7[] yy7VarArr = zd7.N0;
                return qqg.a;
            case 3:
                return new ne7();
            case 4:
                return qg9.a("one.me.webapp.domain.jsbridge.delegates.haptic.ImpactStyle", nh7.values(), new String[]{"light", "medium", "heavy", "rigid", "soft"}, new Annotation[][]{null, null, null, null, null});
            case 5:
                return new c2f(false);
            case 6:
                return new c2f(true);
            case 7:
                yy7[] yy7VarArr2 = InputNameScreen.A0;
                return f1e.AUTH_EMPTY_PROFILE;
            case 8:
                yy7[] yy7VarArr3 = InputPhoneScreen.C0;
                return f1e.AUTH_PHONE_LOGIN;
            case 9:
                return new byte[]{72, 84, 84, 80, 47, 49, 46, 49, 32, 50, 48, 52, 32, 78, 111, 32, 67, 111, 110, 116, 101, 110, 116};
            case 10:
                return new c2f(false);
            case 11:
                return new c2f(true);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new c2f(false);
            case 13:
                return new c2f(true);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr4 = InviteByPhoneScreen.z0;
                return f1e.CONTACTS_SEARCH_BY_PHONE;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr5 = InviteByPhoneScreen.z0;
                return new wr7();
            case 16:
                yy7[] yy7VarArr6 = InviteByPhoneScreen.z0;
                return new mx3(vq7.a.getAccessor().d(47));
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr7 = InviteByQrBottomSheet.O0;
                return new mx3(vq7.a.getAccessor().d(47));
            case 18:
                return new ts7();
            case 19:
                return new h0h(0);
            case 20:
                return new h0h(0);
            case 21:
                return ux7.b;
            case 22:
                return ix7.b;
            case 23:
                return ex7.b;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return mx7.b;
            case 25:
                return iw7.b;
            case 26:
                yy7[] yy7VarArr8 = KeyboardEmojiWidget.Z;
                mz7 mz7Var = mz7.a;
                return new uc5(mz7Var.getAccessor().d(281), (vi) mz7Var.getAccessor().c(489), new t9f(21, (wc5) mz7Var.getAccessor().c(480)), (lzf) mz7Var.getAccessor().c(8), (kdd) mz7Var.getAccessor().d(236).getValue());
            case 27:
                yy7[] yy7VarArr9 = KeyboardStickersWidget.s0;
                mz7 mz7Var2 = mz7.a;
                return new fze(mz7Var2.getAccessor().d(231), mz7Var2.getAccessor().d(475));
            case 28:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setShape(0);
                return gradientDrawable;
            default:
                return ((ie4) y4e.a.getAccessor().c(189)).g;
        }
    }
}
