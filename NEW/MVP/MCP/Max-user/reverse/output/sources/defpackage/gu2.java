package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class gu2 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ gu2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        Activity activityD;
        MessageWriteWidget messageWriteWidgetW0;
        int i = this.a;
        int i2 = 1;
        int i3 = 5;
        int i4 = 3;
        Object[] objArr = 0;
        qqg qqgVar = qqg.a;
        ChatScreen chatScreen = this.b;
        int i5 = 0;
        switch (i) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                yy7[] yy7VarArr = ChatScreen.l1;
                viewGroup.setId(iyc.chat__root_container);
                View view = new View(viewGroup.getContext());
                view.setId(m1b.a);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                zfi.b(view, new eo7(5, new ms0(5, 1, true), 5), null);
                viewGroup.addView(view);
                gu2 gu2Var = new gu2(chatScreen, i2);
                vv2 vv2Var = new vv2(viewGroup.getContext());
                vv2Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gu2Var.invoke(vv2Var);
                viewGroup.addView(vv2Var);
                f82 f82Var = new f82(viewGroup.getContext());
                f82Var.setId(m1b.i);
                f82Var.setVisibility(8);
                f82Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(f82Var);
                break;
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                yy7[] yy7VarArr2 = ChatScreen.l1;
                int i6 = 2;
                gu2 gu2Var2 = new gu2(chatScreen, i6);
                LinearLayout linearLayout = new LinearLayout(viewGroup2.getContext());
                linearLayout.setId(m1b.h);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                gu2Var2.invoke(linearLayout);
                viewGroup2.addView(linearLayout);
                f82 f82Var2 = new f82(viewGroup2.getContext());
                f82Var2.setId(m1b.p);
                f82Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                f82Var2.setVisibility(8);
                chatScreen.O0(f82Var2);
                viewGroup2.addView(f82Var2);
                f82 f82Var3 = new f82(viewGroup2.getContext());
                f82Var3.setId(m1b.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                f82Var3.setLayoutParams(layoutParams);
                chatScreen.L0(f82Var3);
                f82Var3.addOnLayoutChangeListener(new j81(i6, chatScreen));
                tqi.c(new er(3, (Continuation) null, 3), f82Var3);
                viewGroup2.addView(f82Var3);
                f82 f82Var4 = new f82(viewGroup2.getContext());
                f82Var4.setId(m1b.n);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 80;
                layoutParams2.bottomMargin = kti.d(48 * vw4.d().getDisplayMetrics().density);
                f82Var4.setLayoutParams(layoutParams2);
                chatScreen.N0(f82Var4);
                viewGroup2.addView(f82Var4);
                f82 f82Var5 = new f82(viewGroup2.getContext());
                f82Var5.setId(m1b.j);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 80;
                f82Var5.setLayoutParams(layoutParams3);
                int i7 = xz7.a;
                f82Var5.setTranslationY(xz7.a(f82Var5.getContext()));
                if (chatScreen.h1()) {
                    zfi.b(f82Var5, new eo7(0, new ms0(5, 1, true), 7), new gu2(chatScreen, 4));
                }
                viewGroup2.addView(f82Var5);
                zfi.b(viewGroup2, chatScreen.h1() ? eo7.e : eo7.a(), null);
                break;
            case 2:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                yy7[] yy7VarArr3 = ChatScreen.l1;
                gu2 gu2Var3 = new gu2(chatScreen, i4);
                View frameLayout = new FrameLayout(linearLayout2.getContext());
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                zfi.c(frameLayout);
                frameLayout.setElevation(10.0f);
                tqi.c(new sv2(i4, objArr == true ? 1 : 0, i5), frameLayout);
                gu2Var3.invoke(frameLayout);
                linearLayout2.addView(frameLayout);
                View viewA = czi.a(linearLayout2.getContext());
                viewA.setId(m1b.l);
                viewA.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                tqi.c(new ov2(3, null, 0), viewA);
                viewA.setElevation(10.0f);
                linearLayout2.addView(viewA);
                f82 f82Var6 = new f82(linearLayout2.getContext());
                f82Var6.setId(m1b.k);
                f82Var6.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                chatScreen.M0(f82Var6);
                linearLayout2.addView(f82Var6);
                break;
            case 3:
                ViewGroup viewGroup3 = (ViewGroup) obj;
                yy7[] yy7VarArr4 = ChatScreen.l1;
                yfb yfbVar = new yfb(viewGroup3.getContext(), 6);
                yfbVar.setId(m1b.o);
                yfbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                yfbVar.setForm(qfb.c);
                yfbVar.setTitle("");
                yfbVar.setSubtitle("");
                yfbVar.setLeftActions(new gfb(new gu2(chatScreen, i3)));
                yfbVar.setTitleClickListener(new eu2(chatScreen, 11));
                viewGroup3.addView(yfbVar);
                fbb fbbVar = new fbb(viewGroup3.getContext());
                fbbVar.setId(m1b.m);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.setMarginEnd(kti.d(12 * vw4.d().getDisplayMetrics().density));
                layoutParams4.gravity = 8388629;
                fbbVar.setLayoutParams(layoutParams4);
                fbbVar.setShouldShowSearchIcon(false);
                fbbVar.setListener(new rv2(chatScreen));
                fbbVar.setSearchHint(z7.e(chatScreen.getContext(), chatScreen.g1().A() ? n1b.j : n1b.u));
                viewGroup3.addView(fbbVar);
                break;
            case 4:
                y09 y09Var = chatScreen.V0;
                if (y09Var != null) {
                    View view2 = y09Var.c;
                    View view3 = y09Var.b;
                    if (y09Var.l && y09Var.g) {
                        int iC = y09Var.c();
                        ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                        int i8 = iC + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                        if (view2.getPaddingBottom() != i8) {
                            y09Var.g = false;
                            AnimatorSet animatorSet = y09Var.i;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            view3.setTranslationY(0.0f);
                            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i8);
                            break;
                        }
                    }
                }
                break;
            default:
                yy7[] yy7VarArr5 = ChatScreen.l1;
                if (chatScreen.V0().y() == null) {
                    int i9 = xz7.a;
                    if (xz7.b(xz7.c) && (messageWriteWidgetW0 = chatScreen.W0()) != null) {
                        messageWriteWidgetW0.k();
                    }
                    uo5 uo5Var = chatScreen.g1().d;
                    uo5Var.a.f(uo5Var);
                    fed fedVarZ0 = chatScreen.Z0();
                    if (!((Boolean) fedVarZ0.Y.getValue()).booleanValue()) {
                        wv2 wv2Var = wv2.c;
                        if (!wv2Var.p0().d() && (activityD = ((RootController) ((b3b) wv2Var.p0().a()).f()).G0().d()) != null) {
                            activityD.finish();
                            break;
                        }
                    } else {
                        xfh.r(fedVarZ0.d, udd.a);
                        break;
                    }
                } else {
                    chatScreen.j1(false);
                    break;
                }
                break;
        }
        return qqgVar;
    }
}
