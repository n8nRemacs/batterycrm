package one.me.profile.screens.addmembers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.aw0;
import defpackage.cm6;
import defpackage.f84;
import defpackage.f8j;
import defpackage.fdc;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6;
import defpackage.i84;
import defpackage.imb;
import defpackage.iza;
import defpackage.j6;
import defpackage.jza;
import defpackage.jzb;
import defpackage.k;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l;
import defpackage.l38;
import defpackage.l9;
import defpackage.lyb;
import defpackage.lzf;
import defpackage.m9;
import defpackage.mcf;
import defpackage.n5g;
import defpackage.n9;
import defpackage.o9;
import defpackage.p9;
import defpackage.q2b;
import defpackage.q9;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.rd5;
import defpackage.svi;
import defpackage.tcf;
import defpackage.toc;
import defpackage.uc9;
import defpackage.ucf;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x8b;
import defpackage.x9f;
import defpackage.xs0;
import defpackage.yfb;
import defpackage.yg2;
import defpackage.ys;
import defpackage.yy7;
import defpackage.z8a;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/addmembers/AddChatMembersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lm9;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "isChat", "(JZ)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AddChatMembersScreen extends AbstractPickerScreen<m9> implements qq3 {
    public static final /* synthetic */ yy7[] y0 = {new toc(AddChatMembersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, AddChatMembersScreen.class, "isChat", "isChat()Z", 0), new z8a(AddChatMembersScreen.class, "selectedIds", "getSelectedIds()[J")};
    public final hs t0;
    public final hs u0;
    public final hs v0;
    public final ka5 w0;
    public final tcf x0;

    public AddChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new hs(Long.class, 0L, "chat_id");
        this.u0 = new hs(Boolean.class, Boolean.TRUE, "is_chat");
        this.v0 = new hs(long[].class, "selected_ids");
        this.w0 = new ka5(new l(2), (cm6) null, 6);
        this.x0 = ucf.a(new n5g(x8b.e));
        gw0.w(new g56(I0().Y, new n9(null, this), 1), getLifecycleScope());
        xs0 xs0Var = new xs0(this, new i6(3, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 0, xs0Var));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        yy7[] yy7VarArr = y0;
        yy7 yy7Var = yy7VarArr[0];
        long jLongValue = ((Number) this.t0.a(this)).longValue();
        yy7 yy7Var2 = yy7VarArr[1];
        return new PickerMembersListWidget(str, jLongValue, true, yg2.c, ((Boolean) this.u0.a(this)).booleanValue(), null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(v8b.j);
        yfbVar.setTitle(((m9) I0().c).h ? x8b.g : x8b.f);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new k(3, this)));
        return yfbVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        yy7 yy7Var = y0[0];
        long jLongValue = ((Number) this.t0.a(this)).longValue();
        fdc fdcVar = fdc.a;
        return new m9(jLongValue, fdcVar.b(), fdcVar.e());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return this.x0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setE = longArray != null ? ys.E(longArray) : null;
        return setE == null ? rd5.a : setE;
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == v8b.g) {
            return;
        }
        m9 m9Var = (m9) I0().c;
        Set set = (Set) I0().Y.a.getValue();
        f84 f84Var = m9Var.d;
        x9f x9fVarD = null;
        if (f84Var != null) {
            x9fVarD = svi.d(f84Var, ((q2b) ((lzf) m9Var.c.getValue())).b(), i84.b, new l9(i, m9Var, set, null));
        }
        m9Var.g.O(m9Var, m9.i[0], x9fVarD);
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.w0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((m9) I0().c).f, getViewLifecycleOwner().p(), l38.d), new p9(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(((m9) I0().c).h ? x8b.d : x8b.c);
        oneMeButton.c(1, false);
        oneMeButton.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        layoutParams.setMargins(iD, iD, iD, iD);
        oneMeButton.setLayoutParams(layoutParams);
        f8j.d(oneMeButton, 300L, new j6(1, this));
        gw0.w(new g56(I0().Y, new o9(oneMeButton, null), 1), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return (uc9) fdc.a.getAccessor().c(572);
    }

    public AddChatMembersScreen(long j, boolean z) {
        this(gwi.b(new imb("chat_id", Long.valueOf(j)), new imb("is_chat", Boolean.valueOf(z))));
    }
}
