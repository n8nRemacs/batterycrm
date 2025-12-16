package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class az2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ az2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.a;
        int i6 = 6;
        int i7 = 3;
        Continuation continuation = null;
        final int i8 = 1;
        boolean z = false;
        z = false;
        final ChatTitleIconScreen chatTitleIconScreen = this.b;
        switch (i5) {
            case 0:
                yy7[] yy7VarArr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.C0().w0.m(null, new iz2(null, null, null));
                return qqg.a;
            case 1:
                yy7[] yy7VarArr2 = ChatTitleIconScreen.z0;
                int iOrdinal = chatTitleIconScreen.B0().ordinal();
                if (iOrdinal == 0) {
                    return f1e.CREATE_CHAT_INFO;
                }
                if (iOrdinal == 1) {
                    return f1e.CREATE_CHANNEL_INFO;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                yy7[] yy7VarArr3 = ChatTitleIconScreen.z0;
                yfb yfbVar = new yfb(chatTitleIconScreen.getContext(), 6);
                yfbVar.setId(ndb.j);
                yfbVar.setLayoutParams(new kt3(-1, -2));
                yfbVar.setForm(qfb.a);
                int iOrdinal2 = chatTitleIconScreen.B0().ordinal();
                if (iOrdinal2 == 0) {
                    i = odb.r;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = odb.s;
                }
                yfbVar.setTitle(i);
                yfbVar.setLeftActions(new gfb(new d92(5, yfbVar)));
                return yfbVar;
            case 3:
                yy7[] yy7VarArr4 = ChatTitleIconScreen.z0;
                TextView textView = new TextView(chatTitleIconScreen.getContext());
                textView.setId(ndb.f);
                textView.setLayoutParams(new kt3(0, -2));
                textView.setGravity(17);
                float f = 12;
                textView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
                int iOrdinal3 = chatTitleIconScreen.B0().ordinal();
                if (iOrdinal3 == 0) {
                    i2 = odb.m;
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = odb.n;
                }
                textView.setText(i2);
                tqi.c(new x9(3, null, 6), textView);
                return textView;
            case 4:
                yy7[] yy7VarArr5 = ChatTitleIconScreen.z0;
                uxa uxaVar = new uxa(chatTitleIconScreen.getContext());
                uxaVar.setId(ndb.h);
                float f2 = 96;
                uxaVar.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                uxa.o(uxaVar, r34.b(chatTitleIconScreen.getContext(), yud.j0), null, null, 30);
                uxaVar.setAvatarShape(kxa.a);
                final int i9 = z ? 1 : 0;
                f8j.d(uxaVar, 300L, new View.OnClickListener() { // from class: zy2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i9;
                        ChatTitleIconScreen chatTitleIconScreen2 = chatTitleIconScreen;
                        switch (i10) {
                            case 0:
                                yy7[] yy7VarArr6 = ChatTitleIconScreen.z0;
                                api.c(chatTitleIconScreen2);
                                chatTitleIconScreen2.C0().getClass();
                                List listJ = ve3.j(new pq3(ndb.b, new n5g(odb.i), 3, 56), new pq3(ndb.c, new n5g(odb.j), 3, 56), new pq3(ndb.a, new n5g(mvd.p), 2, 56));
                                yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                                oq3 oq3VarE = az1.e(odb.h, null, null, 6);
                                Iterator it = listJ.iterator();
                                while (it.hasNext()) {
                                    oq3VarE.a((pq3) it.next());
                                }
                                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                confirmationBottomSheetE.setTargetController(chatTitleIconScreen2);
                                c54 parentController = chatTitleIconScreen2;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                confirmationBottomSheetE.N0(chatTitleIconScreen2);
                                if (ytdVarE0 != null) {
                                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                    az1.u(false, budVar, true, "BottomSheetWidget");
                                    ytdVarE0.H(budVar);
                                    return;
                                }
                                return;
                            default:
                                yy7[] yy7VarArr8 = ChatTitleIconScreen.z0;
                                api.c(chatTitleIconScreen2);
                                chatTitleIconScreen2.A0().setProgressEnabled(true);
                                sz2 sz2VarC0 = chatTitleIconScreen2.C0();
                                int iOrdinal4 = sz2VarC0.c.ordinal();
                                if (iOrdinal4 != 0) {
                                    if (iOrdinal4 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sz2VarC0.B0.O(sz2VarC0, sz2.H0[0], xfh.o(sz2VarC0, ((q2b) sz2VarC0.u()).b(), new qz2(sz2VarC0, null), 2));
                                    return;
                                } else {
                                    x9f x9fVar = sz2VarC0.D0;
                                    if (x9fVar == null || !x9fVar.isActive()) {
                                        sz2VarC0.D0 = xfh.o(sz2VarC0, ((q2b) sz2VarC0.u()).a(), new rz2(sz2VarC0, null), 2);
                                        return;
                                    }
                                    return;
                                }
                        }
                    }
                });
                uxaVar.setCloseBadgeClickListener(new az2(chatTitleIconScreen, z ? 1 : 0));
                return uxaVar;
            case 5:
                yy7[] yy7VarArr6 = ChatTitleIconScreen.z0;
                veb vebVar = new veb(chatTitleIconScreen.getContext());
                vebVar.setId(ndb.i);
                vebVar.setLayoutParams(new kt3(0, -2));
                float f3 = 12;
                vebVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f3), 0, kti.d(f3 * vw4.d().getDisplayMetrics().density), 0);
                int iOrdinal4 = chatTitleIconScreen.B0().ordinal();
                if (iOrdinal4 == 0) {
                    i3 = odb.p;
                } else {
                    if (iOrdinal4 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = odb.q;
                }
                vebVar.setHint(z7.e(vebVar.getContext(), i3));
                vebVar.setText(chatTitleIconScreen.C0().F0);
                vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.M));
                l5c l5cVar = (l5c) ((age) chatTitleIconScreen.b.getValue());
                l5cVar.getClass();
                vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) l5cVar.m(PmsKey.f89maxthemelength, 200))});
                tqi.c(new bz2(3, null, 0), vebVar);
                vebVar.f(new d92(i6, chatTitleIconScreen));
                return vebVar;
            case 6:
                yy7[] yy7VarArr7 = ChatTitleIconScreen.z0;
                gu4 gu4Var = new gu4(chatTitleIconScreen.getContext());
                gu4Var.setId(ndb.g);
                kt3 kt3Var = new kt3(0, -2);
                float f4 = 12;
                kt3Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                kt3Var.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                gu4Var.setLayoutParams(kt3Var);
                gu4Var.setMaxCount(((l5c) ((age) chatTitleIconScreen.b.getValue())).o());
                gu4Var.setHint(new n5g(odb.o));
                gu4Var.setText(chatTitleIconScreen.C0().G0);
                gu4Var.setBackgroundColorAttr(Integer.valueOf(w9b.M));
                gu4Var.setHintColorAttr(w9b.Y);
                tqi.c(new ld0(i7, continuation, 8), gu4Var);
                return gu4Var;
            default:
                yy7[] yy7VarArr8 = ChatTitleIconScreen.z0;
                OneMeButton oneMeButton = new OneMeButton(chatTitleIconScreen.getContext(), null);
                oneMeButton.setId(ndb.e);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                float f5 = 12;
                layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f5));
                layoutParams.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f5));
                layoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f5);
                layoutParams.topMargin = kti.d(f5 * vw4.d().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(layoutParams);
                int iOrdinal5 = chatTitleIconScreen.B0().ordinal();
                if (iOrdinal5 == 0) {
                    i4 = odb.k;
                } else {
                    if (iOrdinal5 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = odb.l;
                }
                oneMeButton.setText(i4);
                oneMeButton.setSize(jza.c);
                oneMeButton.setMode(iza.a);
                oneMeButton.setAppearance(gza.d);
                sz2 sz2VarC0 = chatTitleIconScreen.C0();
                String str = chatTitleIconScreen.C0().F0;
                sz2VarC0.getClass();
                if (!vmf.F(str)) {
                    int length = str.length();
                    l5c l5cVar2 = (l5c) sz2VarC0.d;
                    l5cVar2.getClass();
                    if (length <= ((int) l5cVar2.m(PmsKey.f89maxthemelength, 200))) {
                        z = true;
                    }
                }
                oneMeButton.setEnabled(z);
                f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: zy2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i10 = i8;
                        ChatTitleIconScreen chatTitleIconScreen2 = chatTitleIconScreen;
                        switch (i10) {
                            case 0:
                                yy7[] yy7VarArr62 = ChatTitleIconScreen.z0;
                                api.c(chatTitleIconScreen2);
                                chatTitleIconScreen2.C0().getClass();
                                List listJ = ve3.j(new pq3(ndb.b, new n5g(odb.i), 3, 56), new pq3(ndb.c, new n5g(odb.j), 3, 56), new pq3(ndb.a, new n5g(mvd.p), 2, 56));
                                yy7[] yy7VarArr72 = BottomSheetWidget.B0;
                                oq3 oq3VarE = az1.e(odb.h, null, null, 6);
                                Iterator it = listJ.iterator();
                                while (it.hasNext()) {
                                    oq3VarE.a((pq3) it.next());
                                }
                                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                confirmationBottomSheetE.setTargetController(chatTitleIconScreen2);
                                c54 parentController = chatTitleIconScreen2;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                confirmationBottomSheetE.N0(chatTitleIconScreen2);
                                if (ytdVarE0 != null) {
                                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                    az1.u(false, budVar, true, "BottomSheetWidget");
                                    ytdVarE0.H(budVar);
                                    return;
                                }
                                return;
                            default:
                                yy7[] yy7VarArr82 = ChatTitleIconScreen.z0;
                                api.c(chatTitleIconScreen2);
                                chatTitleIconScreen2.A0().setProgressEnabled(true);
                                sz2 sz2VarC02 = chatTitleIconScreen2.C0();
                                int iOrdinal42 = sz2VarC02.c.ordinal();
                                if (iOrdinal42 != 0) {
                                    if (iOrdinal42 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sz2VarC02.B0.O(sz2VarC02, sz2.H0[0], xfh.o(sz2VarC02, ((q2b) sz2VarC02.u()).b(), new qz2(sz2VarC02, null), 2));
                                    return;
                                } else {
                                    x9f x9fVar = sz2VarC02.D0;
                                    if (x9fVar == null || !x9fVar.isActive()) {
                                        sz2VarC02.D0 = xfh.o(sz2VarC02, ((q2b) sz2VarC02.u()).a(), new rz2(sz2VarC02, null), 2);
                                        return;
                                    }
                                    return;
                                }
                        }
                    }
                });
                return oneMeButton;
        }
    }
}
