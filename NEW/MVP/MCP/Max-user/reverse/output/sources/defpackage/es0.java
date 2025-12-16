package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.e;
import java.util.List;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.chatscreen.ChatScreen;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class es0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ es0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        x4h videoLayoutUpdatesController;
        Object value;
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                view.removeOnLayoutChangeListener(this);
                i1c i1cVar = ((on1) this.b).I0;
                if (i1cVar != null) {
                    i1cVar.c();
                    return;
                }
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                mq1 mq1Var = (mq1) this.b;
                mq1Var.x(mq1Var.O0);
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                it1 it1Var = (it1) this.b;
                it1Var.J(it1Var.f1);
                return;
            case 4:
                qt1 qt1Var = (qt1) this.b;
                if (qt1Var.c == null || (videoLayoutUpdatesController = qt1Var.getVideoLayoutUpdatesController()) == null) {
                    return;
                }
                videoLayoutUpdatesController.a(qt1Var, qt1Var.u0);
                return;
            case 5:
                view.removeOnLayoutChangeListener(this);
                ChatScreen chatScreen = (ChatScreen) this.b;
                yy7[] yy7VarArr = ChatScreen.l1;
                if (b6g.c(chatScreen.e1().getTitle())) {
                    ChatScreen.I0(chatScreen, chatScreen.e1(), true);
                    return;
                }
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                uk9 uk9Var = (uk9) this.b;
                ViewGroup viewGroup = (ViewGroup) uk9Var.b;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                int iQ = u45.q(10, vw4.d().getDisplayMetrics().density, viewGroup.getMeasuredWidth()) - uk9Var.N();
                int i9 = iQ >= 0 ? iQ : 0;
                ViewGroup viewGroup2 = (ViewGroup) uk9Var.b;
                jfi.b(i9, uk9Var.T(), viewGroup2 != null ? viewGroup2 : null);
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                muc mucVar = (muc) this.b;
                if (b6g.c(mucVar.getTitleView())) {
                    MessageWriteWidget.N0(mucVar, true);
                    return;
                }
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                String str = ((by9) this.b).f;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, vb9.e(((by9) this.b).b.c, "Scroll: Highlighted from args message with id="), null);
                    }
                }
                by9 by9Var = (by9) this.b;
                ds9 ds9Var = by9Var.e;
                cw9 cw9Var = by9Var.b;
                long j = cw9Var.c;
                List list = cw9Var.d;
                tcf tcfVar = ds9Var.d;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, new x27(j, list)));
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                a2b a2bVar = (a2b) this.b;
                a2bVar.getEditText().getHitRect(a2bVar.z0);
                Rect rect = a2bVar.A0;
                rect.set(a2bVar.z0);
                rect.left = rect.right;
                rect.right = a2bVar.getRight();
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                ((fbb) this.b).F0.start();
                return;
            case 11:
                yfb.e((yfb) this.b);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                view.removeOnLayoutChangeListener(this);
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                yy7[] yy7VarArr2 = ProfileScreen.C0;
                if (b6g.c(profileScreen.B0().getTitle())) {
                    ProfileScreen.y0(profileScreen, profileScreen.B0(), true);
                    return;
                }
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                ((vu2) this.b).invoke();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                view.removeOnLayoutChangeListener(this);
                RegistrationNeuroAvatarsScreen.y0(view, a93.s0.y((LinearLayout) this.b));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((e) this.b).adjustDropDownSizeAndPosition();
                return;
            case 16:
                icg icgVar = (icg) this.b;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                icgVar.U0 = iArr[0];
                view.getWindowVisibleDisplayFrame(icgVar.N0);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                view.removeOnLayoutChangeListener(this);
                ((l42) this.b).resumeWith(qqg.a);
                return;
            case 18:
                view.removeOnLayoutChangeListener(this);
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.b;
                yy7[] yy7VarArr3 = VideoWebViewScreen.H0;
                videoWebViewScreen.S0();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.b;
                yy7[] yy7VarArr4 = WebAppRootScreen.R0;
                if (b6g.c(webAppRootScreen.M0().getTitle())) {
                    WebAppRootScreen.R0(webAppRootScreen.M0(), true);
                    return;
                }
                return;
        }
    }

    public es0(muc mucVar, MessageWriteWidget messageWriteWidget) {
        this.a = 7;
        this.b = mucVar;
    }
}
