package defpackage;

import android.util.Log;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes.dex */
public final class z44 extends bva {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z44(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.bva
    public void a() {
        switch (this.d) {
            case 6:
                c cVar = (c) this.e;
                if (c.K(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                ue0 ue0Var = cVar.h;
                if (ue0Var != null) {
                    ue0Var.r = false;
                    gq5 gq5Var = new gq5(5, cVar);
                    if (ue0Var.p == null) {
                        ue0Var.p = new ArrayList();
                    }
                    ue0Var.p.add(gq5Var);
                    cVar.h.d(false);
                    cVar.z(true);
                    cVar.E();
                }
                cVar.h = null;
                break;
        }
    }

    @Override // defpackage.bva
    public final void b() {
        Object value;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                Widget widget = (Widget) obj;
                if (widget.router.i().m()) {
                    return;
                }
                f(false);
                widget.getOnBackPressedDispatcher().d();
                if (widget.isBeingDestroyed) {
                    return;
                }
                f(true);
                return;
            case 1:
                yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
                xfh.r(((AppearanceSettingsMultiThemeScreen) obj).y0().E0, jc3.b);
                return;
            case 2:
                v1a v1aVar = CallIncomingScreen.s0;
                tcf tcfVar = ((CallIncomingScreen) obj).A0().s0;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, new ib1(false, false)));
                return;
            case 3:
                ((ub1) obj).k();
                return;
            case 4:
                rha rhaVar = CallScreen.N0;
                ((CallScreen) obj).C0(false);
                return;
            case 5:
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                yy7[] yy7VarArr2 = ChatMembersScreen.t0;
                if (chatMembersScreen.A0().u()) {
                    chatMembersScreen.A0().t();
                    return;
                } else {
                    chatMembersScreen.getRouter().C();
                    return;
                }
            case 6:
                c cVar = (c) obj;
                if (c.K(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                z44 z44Var = cVar.i;
                ArrayList arrayList = cVar.n;
                cVar.z(true);
                if (cVar.h == null) {
                    if (z44Var.a) {
                        if (c.K(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        cVar.S();
                        return;
                    } else {
                        if (c.K(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        cVar.g.d();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(c.F(cVar.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = cVar.h.a.iterator();
                while (it3.hasNext()) {
                    a aVar = ((aj6) it3.next()).b;
                    if (aVar != null) {
                        aVar.w0 = false;
                    }
                }
                Iterator it4 = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    tp4 tp4Var = (tp4) it4.next();
                    ArrayList arrayList2 = tp4Var.c;
                    if (c.K(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    tp4Var.i(arrayList2);
                    tp4Var.c(arrayList2);
                }
                Iterator it5 = cVar.h.a.iterator();
                while (it5.hasNext()) {
                    a aVar2 = ((aj6) it5.next()).b;
                    if (aVar2 != null && aVar2.R0 == null) {
                        cVar.g(aVar2).k();
                    }
                }
                cVar.h = null;
                cVar.j0();
                if (c.K(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + z44Var.a + " for  FragmentManager " + cVar);
                    return;
                }
                return;
            case 7:
                yy7[] yy7VarArr3 = InputNameScreen.A0;
                ((InputNameScreen) obj).D0();
                return;
            case 8:
                ((em6) obj).invoke(this);
                return;
            case 9:
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) obj;
                yy7[] yy7VarArr4 = ProfileEditAdminPermissionsWidget.w0;
                int iOrdinal = profileEditAdminPermissionsWidget.y0().ordinal();
                if (iOrdinal == 0) {
                    profileEditAdminPermissionsWidget.getRouter().C();
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    profileEditAdminPermissionsWidget.z0().z();
                    return;
                }
            case 10:
                yy7[] yy7VarArr5 = QrScannerWidget.E0;
                ((QrScannerWidget) obj).A0().t(vyd.a);
                return;
            case 11:
                ((c6e) obj).t();
                return;
            default:
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                fbb searchView = ((yfb) startConversationScreen.u0.D(startConversationScreen, StartConversationScreen.H0[4])).getSearchView();
                if (searchView != null) {
                    searchView.b();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.bva
    public void c(te0 te0Var) {
        switch (this.d) {
            case 6:
                c cVar = (c) this.e;
                if (c.K(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                if (cVar.h != null) {
                    Iterator it = cVar.f(new ArrayList(Collections.singletonList(cVar.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        tp4 tp4Var = (tp4) it.next();
                        tp4Var.getClass();
                        if (c.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + te0Var.c);
                        }
                        ArrayList arrayList = tp4Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            af3.v(arrayList2, ((v7f) it2.next()).k);
                        }
                        List listD0 = ue3.d0(ue3.h0(arrayList2));
                        int size = listD0.size();
                        for (int i = 0; i < size; i++) {
                            ((u7f) listD0.get(i)).c(te0Var);
                        }
                    }
                    Iterator it3 = cVar.n.iterator();
                    if (it3.hasNext()) {
                        throw ctd.h(it3);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.bva
    public void d() {
        switch (this.d) {
            case 6:
                c cVar = (c) this.e;
                if (c.K(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + cVar);
                }
                cVar.w();
                cVar.x(new si6(cVar), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z44(Widget widget, int i) {
        super(true);
        this.d = i;
        this.e = widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z44(StartConversationScreen startConversationScreen, boolean z) {
        super(z);
        this.d = 12;
        this.e = startConversationScreen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z44(boolean z, em6 em6Var) {
        super(z);
        this.d = 8;
        this.e = em6Var;
    }
}
