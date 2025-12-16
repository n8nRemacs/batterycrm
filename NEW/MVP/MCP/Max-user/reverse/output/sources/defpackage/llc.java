package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.appcompat.widget.Toolbar;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickersshowcase.StickersShowcaseScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class llc implements em6 {
    public final /* synthetic */ int a;

    public /* synthetic */ llc(int i) {
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        jza jzaVar = jza.c;
        gza gzaVar = gza.d;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                Toolbar toolbar = (Toolbar) obj;
                yy7[] yy7VarArr = ProfileScreen.C0;
                yfb yfbVar = new yfb(toolbar.getContext(), 6);
                yfbVar.setId(v8b.q1);
                yfbVar.setForm(qfb.a);
                yfbVar.setTextShimmerEnabled(false);
                yfbVar.setLeftActions(new gfb(new llc(1 == true ? 1 : 0)));
                float f = 6;
                yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                toolbar.addView(yfbVar);
                return qqgVar;
            case 1:
                yy7[] yy7VarArr2 = ProfileScreen.C0;
                kkc.c.S0();
                return qqgVar;
            case 2:
                return new e9d((Context) obj);
            case 3:
                return String.valueOf(obj);
            case 4:
                yy7[] yy7VarArr3 = RegistrationNeuroAvatarsScreen.D0;
                return Integer.valueOf(((yeb) obj).getText().e);
            case 5:
                yy7[] yy7VarArr4 = RegistrationNeuroAvatarsScreen.D0;
                return Integer.valueOf(((yeb) obj).getText().h);
            case 6:
                OneMeButton oneMeButton = (OneMeButton) obj;
                yy7[] yy7VarArr5 = RegistrationNeuroAvatarsScreen.D0;
                oneMeButton.setId(xyc.oneme_login_neuro_avatars_continue_disabled_btn);
                oneMeButton.setText(t3d.oneme_login_neuro_avatars_continue_without_avatar_button);
                oneMeButton.setMode(iza.b);
                oneMeButton.setAppearance(gzaVar);
                oneMeButton.setSize(jzaVar);
                return qqgVar;
            case 7:
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                yy7[] yy7VarArr6 = RegistrationNeuroAvatarsScreen.D0;
                oneMeButton2.setId(xyc.oneme_login_neuro_avatars_continue_enabled_btn);
                oneMeButton2.setText(t3d.oneme_login_neuro_avatars_continue_button);
                oneMeButton2.setMode(iza.a);
                oneMeButton2.setAppearance(gzaVar);
                oneMeButton2.setSize(jzaVar);
                return qqgVar;
            case 8:
                return mri.b(((TamErrorException) obj).a);
            case 9:
                return "?";
            case 10:
                return Integer.valueOf(((yeb) obj).getText().g);
            case 11:
                return Integer.valueOf(((yeb) obj).b().h);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((Integer) obj).getClass();
                return Integer.MIN_VALUE;
            case 13:
                pde pdeVar = new pde((Context) obj);
                pdeVar.setId(j7b.J);
                pdeVar.setWillNotDraw(false);
                return pdeVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Integer.valueOf(((yeb) obj).b().a.f);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Integer.valueOf(((yeb) obj).b().a.f);
            case 16:
                return Boolean.valueOf(((ku3) obj).B());
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr7 = StickersShowcaseScreen.u0;
                djf.c.p0().b(":stickers/settings", null);
                return qqgVar;
            case 18:
                yy7[] yy7VarArr8 = ikf.z0;
                return Boolean.TRUE;
            case 19:
                e4f e4fVar = (e4f) obj;
                e4fVar.a(vid.a(n18.class));
                e4fVar.c("leakcanary.internal.LeakCanaryFileProvider");
                e4fVar.b(vid.a(ze8.class), vid.a(z7.class));
                e4fVar.b(vid.a(OneMeApplication.class), vid.a(Typeface.class));
                e4fVar.a(vid.a(PackageManager.class));
                return qqgVar;
            case 20:
                ((e4f) obj).a(vid.a(hc8.class));
                return qqgVar;
            case 21:
                e4f e4fVar2 = (e4f) obj;
                e4fVar2.a(vid.a(zhe.class));
                e4fVar2.b(vid.a(kua.class));
                e4fVar2.c("ru.ok.android");
                e4fVar2.c("org.webrtc");
                e4fVar2.a(vid.a(sca.class));
                return qqgVar;
            case 22:
                return ((u6e) obj).o;
            case 23:
                CharSequence charSequence = ((gpf) obj).e;
                return Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return Boolean.valueOf(((zz3) obj).b == yz3.b);
            case 25:
                return ((zz3) obj).a();
            case 26:
                CharSequence charSequence2 = ((gpf) obj).e;
                return Boolean.valueOf(!(charSequence2 == null || charSequence2.length() == 0));
            case 27:
                return Integer.valueOf(((yeb) obj).getText().j);
            case 28:
                q2g q2gVar = (q2g) obj;
                return "t=" + q2gVar.a + ", c=" + q2gVar.b;
            default:
                return Integer.valueOf(((yeb) obj).getText().d);
        }
    }
}
