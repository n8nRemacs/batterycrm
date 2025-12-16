package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.list.ChatsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class yn6 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ yn6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.lang.Object, k18] */
    @Override // java.lang.Runnable
    public final void run() {
        Drawable downloadDrawable;
        Throwable th = null;
        th = null;
        switch (this.a) {
            case 0:
                qn6 qn6Var = (qn6) this.c;
                Future future = (Future) this.b;
                if (future instanceof ip7) {
                    x1 x1Var = (x1) ((ip7) future);
                    if (x1Var instanceof o1) {
                        Object obj = x1Var.a;
                        if (obj instanceof e1) {
                            th = ((e1) obj).a;
                        }
                    } else {
                        x1Var.getClass();
                    }
                    if (th != null) {
                        qn6Var.onFailure(th);
                        return;
                    }
                }
                try {
                    qn6Var.a(a6a.a(future));
                    return;
                } catch (ExecutionException e) {
                    qn6Var.onFailure(e.getCause());
                    return;
                } catch (Throwable th2) {
                    qn6Var.onFailure(th2);
                    return;
                }
            case 1:
                ((af4) this.b).a((r0) this.c);
                return;
            case 2:
                ((c8) this.b).a = this.c;
                return;
            case 3:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = d8.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d8.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 4:
                o6c o6cVar = (o6c) this.c;
                int i = o6c.v0;
                o6cVar.setHalfScreen(null);
                return;
            case 5:
                nud nudVar = (nud) this.b;
                Typeface typeface = (Typeface) this.c;
                f8j f8jVar = (f8j) nudVar.b;
                if (f8jVar != null) {
                    f8jVar.c(typeface);
                    return;
                }
                return;
            case 6:
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.c;
                View view = chatMediaViewerScreen.getView();
                if (view == null) {
                    return;
                }
                d52 d52VarL0 = chatMediaViewerScreen.L0();
                if (d52VarL0 != null) {
                    d52VarL0.setMaxExpandedHeightPx((view.getMeasuredHeight() - chatMediaViewerScreen.P0().getMeasuredHeight()) - chatMediaViewerScreen.N0().getMeasuredHeight());
                }
                d52 d52VarL02 = chatMediaViewerScreen.L0();
                if (d52VarL02 != null) {
                    ViewGroup.LayoutParams layoutParams = d52VarL02.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = chatMediaViewerScreen.N0().getMeasuredHeight();
                    d52VarL02.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 7:
                ((nm8) e03.a.getAccessor().c(2)).b(Collections.singletonList(new brb(1)));
                g23 g23Var = (g23) this.c;
                if (g23Var.d) {
                    g23Var.a.q0(g23Var);
                    return;
                }
                return;
            case 8:
                Activity activity = ((ChatsListWidget) this.c).getActivity();
                if (activity != null) {
                    activity.reportFullyDrawn();
                    return;
                }
                return;
            case 9:
                un4 un4Var = (un4) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sn4 sn4Var = (sn4) it.next();
                    ArrayList arrayList2 = un4Var.r;
                    mid midVar = sn4Var.a;
                    View view2 = midVar == null ? null : midVar.a;
                    mid midVar2 = sn4Var.b;
                    View view3 = midVar2 != null ? midVar2.a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(un4Var.f);
                        arrayList2.add(sn4Var.a);
                        duration.translationX(sn4Var.e - sn4Var.c);
                        duration.translationY(sn4Var.f - sn4Var.d);
                        duration.alpha(0.0f).setListener(new rn4(un4Var, sn4Var, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                        arrayList2.add(sn4Var.b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(un4Var.f).alpha(1.0f).setListener(new rn4(un4Var, sn4Var, viewPropertyAnimatorAnimate, view3, 1)).start();
                    }
                }
                arrayList.clear();
                un4Var.n.remove(arrayList);
                return;
            case 10:
                cei ceiVarG = cei.g();
                String str = vs4.d;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                r5i r5iVar = (r5i) this.b;
                sb.append(r5iVar.a);
                ceiVarG.c(str, sb.toString());
                ((vs4) this.c).a.e(r5iVar);
                return;
            case 11:
                mj5 mj5Var = (mj5) this.b;
                n42 n42Var = mj5Var.b;
                py4 py4VarB = ((rj5) this.c).b(mj5Var);
                n42Var.getClass();
                ty4.d(n42Var, py4VarB);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) this.c;
                View view4 = (View) this.b;
                if (view4 instanceof TextView) {
                    b6g.b((TextView) view4, fitFontImageSpan);
                    return;
                } else {
                    if (view4 instanceof xta) {
                        jgh.b((xta) view4, fitFontImageSpan);
                        return;
                    }
                    return;
                }
            case 13:
                dk7 dk7Var = (dk7) this.b;
                za0 za0Var = (za0) this.c;
                d52 d52Var = (d52) za0Var.d;
                ImageView imageViewC = za0Var.c();
                ViewGroup.LayoutParams layoutParams2 = imageViewC.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (d52Var != null && d52Var.getVisibility() == 0) {
                    collapsedPanelHeight = d52Var.getCollapsedPanelHeight();
                }
                marginLayoutParams2.bottomMargin = dk7Var.getMeasuredHeight() + za0Var.a + collapsedPanelHeight;
                imageViewC.setLayoutParams(marginLayoutParams2);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((gr6) ((zd7) this.b).getHierarchy()).k((Drawable) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                zd7 zd7Var = (zd7) this.b;
                gr6 gr6Var = (gr6) zd7Var.getHierarchy();
                td7 td7Var = (td7) this.c;
                if (td7Var instanceof rd7) {
                    downloadDrawable = (Drawable) zd7Var.M0.getValue();
                } else if (td7Var instanceof qd7) {
                    downloadDrawable = zd7Var.getOverlayDrawable();
                } else {
                    if (!(td7Var instanceof sd7)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    downloadDrawable = zd7Var.getDownloadDrawable();
                }
                gr6Var.k(downloadDrawable);
                return;
            case 16:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.c;
                yy7[] yy7VarArr = InputPhoneScreen.C0;
                inputPhoneScreen.requireActivity().reportFullyDrawn();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                synchronized (((gb8) this.c).c) {
                    try {
                        Object objApply = ((gb8) this.c).d.apply(this.b);
                        gb8 gb8Var = (gb8) this.c;
                        Object obj4 = gb8Var.a;
                        if (obj4 == null && objApply != null) {
                            gb8Var.a = objApply;
                            gb8Var.o.i(objApply);
                        } else if (obj4 != null && !obj4.equals(objApply)) {
                            gb8 gb8Var2 = (gb8) this.c;
                            gb8Var2.a = objApply;
                            gb8Var2.o.i(objApply);
                        }
                    } finally {
                    }
                }
                return;
            case 18:
                ds4 ds4Var = (ds4) this.c;
                g79 g79Var = (g79) this.b;
                ArrayList arrayList3 = (ArrayList) ds4Var.a;
                if (!arrayList3.isEmpty()) {
                    db7 db7VarA = g79Var.a();
                    if (db7VarA != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            ((Bundle) it2.next()).putBinder("extra_session_binder", db7VarA.asBinder());
                        }
                    }
                    arrayList3.clear();
                }
                qv8 qv8Var = (qv8) ds4Var.b;
                qv8Var.getClass();
                qv8Var.setSessionToken(g79Var.b);
                return;
            case 19:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.c;
                yy7[] yy7VarArr2 = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.P0().setTranslationY(messageContextMenuBottomSheet.P0().getHeight());
                return;
            case 20:
                ((rm9) this.b).setLayout((pm9) this.c);
                return;
            case 21:
                MessagesListWidget messagesListWidget = (MessagesListWidget) this.c;
                dad dadVar = messagesListWidget.a1;
                if (dadVar != null) {
                    messagesListWidget.H0().s0(dadVar);
                    messagesListWidget.H0().m(dadVar);
                    dad dadVar2 = messagesListWidget.a1;
                    if (dadVar2 != null) {
                        dadVar2.g = true;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                mra mraVar = (mra) this.c;
                try {
                    mraVar.a.onError((Throwable) this.b);
                    return;
                } finally {
                    mraVar.c.dispose();
                }
            case 23:
                ((lra) this.c).a.a((qu1) this.b);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                return;
            case 25:
                w3b w3bVar = (w3b) this.b;
                fbb fbbVar = (fbb) this.c;
                ViewGroup.LayoutParams layoutParams3 = w3bVar.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int measuredWidth = fbbVar.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams4 = ((View) fbbVar.B0.getValue()).getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                layoutParams3.width = measuredWidth - (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
                w3bVar.setLayoutParams(layoutParams3);
                return;
            case 26:
                ((kdb) this.b).removeCallbacks((Runnable) this.c);
                return;
            case 27:
                LinearLayout linearLayout = (LinearLayout) this.b;
                ScrollView scrollView = (ScrollView) this.c;
                ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), scrollView.getPaddingTop(), scrollView.getPaddingRight(), linearLayout.getMeasuredHeight() + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0));
                return;
            case 28:
                ((i85) this.b).accept(this.c);
                return;
            default:
                View view5 = (View) this.b;
                SafeModeOnboardingScreen safeModeOnboardingScreen = (SafeModeOnboardingScreen) this.c;
                ConstraintLayout constraintLayout = (ConstraintLayout) safeModeOnboardingScreen.o.D(safeModeOnboardingScreen, SafeModeOnboardingScreen.X[1]);
                int measuredHeight = view5.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams6 = view5.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                int i2 = measuredHeight + (marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0);
                ViewGroup.LayoutParams layoutParams7 = view5.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), i2 + (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                jdc jdcVar = new jdc(yn6.class.getSimpleName());
                qn6 qn6Var = (qn6) this.c;
                i5i i5iVar = new i5i();
                ((i5i) jdcVar.d).b = i5iVar;
                jdcVar.d = i5iVar;
                i5iVar.a = qn6Var;
                return jdcVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yn6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
