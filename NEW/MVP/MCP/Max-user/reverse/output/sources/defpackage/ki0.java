package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* loaded from: classes.dex */
public final class ki0 extends wgh {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ki0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wgh
    public void a(int i) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((wgh) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
            default:
                return;
            case 7:
                ((wo8) this.b).g(false);
                return;
        }
    }

    @Override // defpackage.wgh
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((wgh) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // defpackage.wgh
    public final void c(int i) {
        int i2;
        final View[] viewArr;
        final View[] viewArr2;
        final int i3 = 0;
        final int i4 = 1;
        switch (this.a) {
            case 0:
                li0 li0Var = (li0) this.b;
                c14 c14Var = li0Var.F0;
                d14 d14Var = (d14) c14Var.d.f.get(i);
                int iG = z5j.g(d14Var.a);
                switch (az1.v(d14Var.a)) {
                    case 0:
                        i2 = 3;
                        break;
                    case 1:
                    case 4:
                    case 6:
                        i2 = 1;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        i2 = 2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i5 = c14Var.j() == 1 ? 2 : 1;
                ii0 ii0Var = li0Var.E0;
                g8a g8aVar = ii0Var.d;
                g8a g8aVar2 = ii0Var.e;
                g8a g8aVar3 = ii0Var.f;
                Integer numD = ((gda) ii0Var.c.getValue()).d();
                if (numD != null) {
                    int iIntValue = numD.intValue();
                    long jK = ((pe8) ((pb3) ii0Var.a.getValue())).K();
                    int iV = az1.v(i5) + utb.k(i2, ((az1.v(iG) * 961) + iIntValue) * 31, 31);
                    int iV2 = az1.v(iG);
                    if (iV2 == 0) {
                        int iB = g8aVar2.b(iV);
                        if ((iB >= 0 ? g8aVar2.c[iB] : -1L) == jK) {
                            return;
                        } else {
                            g8aVar2.d(iV, jK);
                        }
                    } else if (iV2 == 1) {
                        int iB2 = g8aVar.b(iV);
                        if ((iB2 >= 0 ? g8aVar.c[iB2] : -1L) == jK) {
                            return;
                        } else {
                            g8aVar.d(iV, jK);
                        }
                    } else {
                        if (iV2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int iB3 = g8aVar3.b(iV);
                        if ((iB3 >= 0 ? g8aVar3.c[iB3] : -1L) == jK) {
                            return;
                        } else {
                            g8aVar3.d(iV, jK);
                        }
                    }
                    ii0Var.b(iG, iIntValue, i2, i5, jK, "showed");
                    return;
                }
                return;
            case 1:
                i91.v((i91) this.b, i);
                return;
            case 2:
                ChatMediaTabWidget chatMediaTabWidget = (ChatMediaTabWidget) this.b;
                gda.g((gda) chatMediaTabWidget.c.getValue(), ChatMediaTabWidget.y0(chatMediaTabWidget));
                return;
            case 3:
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
                yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
                yq2 yq2VarQ0 = chatMediaViewerScreen.Q0();
                yq2VarQ0.Q(svi.d(yq2VarQ0.a, ((q2b) yq2VarQ0.t0).a(), i84.b, new fq2(i, yq2VarQ0, null)));
                return;
            case 4:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                yy7[] yy7VarArr2 = ChatsTabWidget.F0;
                if (((Number) chatsTabWidget.D0().w0.a.getValue()).intValue() != i) {
                    String str = ((ChatsTabWidget) this.b).b;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, ho7.f(i, "ONEME-6453|chats_list_lf | tabs page selected, pos:"), null);
                        }
                    }
                    qmb qmbVarF0 = ((ChatsTabWidget) this.b).F0();
                    ((gda) ((ChatsTabWidget) this.b).y0.getValue()).f(f1e.CHATS_LIST_TAB, new qmb(qmbVarF0.a, 3, qmbVarF0.c, qmbVarF0.d, qmbVarF0.e, qmbVarF0.f));
                    ((ChatsTabWidget) this.b).E0(i);
                }
                ((ChatsTabWidget) this.b).D0().v0.m(null, Integer.valueOf(i));
                return;
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((wgh) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
                yb4 yb4Var = (yb4) this.b;
                SparseArray sparseArray = yb4Var.Y;
                ytd ytdVar = (ytd) sparseArray.get(i);
                int i6 = yb4Var.Z;
                if (i != i6) {
                    ytd ytdVar2 = (ytd) sparseArray.get(i6);
                    if (ytdVar2 != null) {
                        Iterator it2 = ytdVar2.e().iterator();
                        while (it2.hasNext()) {
                            ((bud) it2.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (ytdVar != null) {
                        Iterator it3 = ytdVar.e().iterator();
                        while (it3.hasNext()) {
                            ((bud) it3.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    yb4Var.Z = i;
                    return;
                }
                return;
            case 7:
                ((wo8) this.b).g(false);
                return;
            case 8:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                bbd bbdVar = mediaKeyboardWidget.t0;
                bbd bbdVar2 = mediaKeyboardWidget.Z;
                bbd bbdVar3 = mediaKeyboardWidget.s0;
                d08 d08Var = (d08) ue3.J(i, (List) mediaKeyboardWidget.v0.b);
                if (d08Var != null) {
                    xfh.r(((t09) mediaKeyboardWidget.c.getValue()).o, new o09(d08Var));
                    if (d08Var == d08.Y) {
                        yy7[] yy7VarArr3 = MediaKeyboardWidget.B0;
                        viewArr = new View[]{(View) bbdVar3.D(mediaKeyboardWidget, yy7VarArr3[6])};
                        viewArr2 = new View[]{(View) bbdVar2.D(mediaKeyboardWidget, yy7VarArr3[5]), (View) bbdVar.D(mediaKeyboardWidget, yy7VarArr3[7])};
                    } else {
                        yy7[] yy7VarArr4 = MediaKeyboardWidget.B0;
                        viewArr = new View[]{(View) bbdVar2.D(mediaKeyboardWidget, yy7VarArr4[5]), (View) bbdVar.D(mediaKeyboardWidget, yy7VarArr4[7])};
                        viewArr2 = new View[]{(View) bbdVar3.D(mediaKeyboardWidget, yy7VarArr4[6])};
                    }
                    AnimatorSet animatorSet = mediaKeyboardWidget.A0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new sg(valueAnimatorOfFloat, 5, viewArr));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new sg(valueAnimatorOfFloat2, 5, viewArr2));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                    animatorSet2.addListener(new lh(animatorSet2, new cm6() { // from class: a19
                        @Override // defpackage.cm6
                        public final Object invoke() {
                            int i7 = i3;
                            qqg qqgVar = qqg.a;
                            View[] viewArr3 = viewArr;
                            switch (i7) {
                                case 0:
                                    yy7[] yy7VarArr5 = MediaKeyboardWidget.B0;
                                    for (View view : viewArr3) {
                                        view.setVisibility(0);
                                    }
                                    break;
                                default:
                                    yy7[] yy7VarArr6 = MediaKeyboardWidget.B0;
                                    for (View view2 : viewArr3) {
                                        view2.setVisibility(8);
                                    }
                                    break;
                            }
                            return qqgVar;
                        }
                    }, 1));
                    animatorSet2.addListener(new lh(animatorSet2, new cm6() { // from class: a19
                        @Override // defpackage.cm6
                        public final Object invoke() {
                            int i7 = i4;
                            qqg qqgVar = qqg.a;
                            View[] viewArr3 = viewArr2;
                            switch (i7) {
                                case 0:
                                    yy7[] yy7VarArr5 = MediaKeyboardWidget.B0;
                                    for (View view : viewArr3) {
                                        view.setVisibility(0);
                                    }
                                    break;
                                default:
                                    yy7[] yy7VarArr6 = MediaKeyboardWidget.B0;
                                    for (View view2 : viewArr3) {
                                        view2.setVisibility(8);
                                    }
                                    break;
                            }
                            return qqgVar;
                        }
                    }, 0));
                    animatorSet2.setDuration(200L);
                    animatorSet2.start();
                    mediaKeyboardWidget.A0 = animatorSet2;
                }
                mediaKeyboardWidget.A0().post(new gq5(16, mediaKeyboardWidget));
                return;
            case 9:
                ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) this.b;
                yy7[] yy7VarArr5 = ProfileAvatarsScreen.y0;
                ProfileAvatarsScreen.I0(profileAvatarsScreen, profileAvatarsScreen.N0().b.getTitle(), i);
                return;
            default:
                yb4 yb4Var2 = (yb4) this.b;
                SparseArray sparseArray2 = yb4Var2.Y;
                ytd ytdVar3 = (ytd) sparseArray2.get(i);
                int i7 = yb4Var2.Z;
                if (i != i7) {
                    ytd ytdVar4 = (ytd) sparseArray2.get(i7);
                    if (ytdVar4 != null) {
                        Iterator it4 = ytdVar4.e().iterator();
                        while (it4.hasNext()) {
                            ((bud) it4.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (ytdVar3 != null) {
                        Iterator it5 = ytdVar3.e().iterator();
                        while (it5.hasNext()) {
                            ((bud) it5.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    yb4Var2.Z = i;
                    return;
                }
                return;
        }
    }

    public ki0() {
        this.a = 5;
        this.b = new ArrayList(3);
    }
}
