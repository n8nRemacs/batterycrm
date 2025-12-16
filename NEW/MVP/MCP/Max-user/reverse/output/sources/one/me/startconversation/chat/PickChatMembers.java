package one.me.startconversation.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.aw0;
import defpackage.cm6;
import defpackage.f8j;
import defpackage.ffb;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hs;
import defpackage.iqb;
import defpackage.iza;
import defpackage.jza;
import defpackage.jzb;
import defpackage.k18;
import defpackage.k1b;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l38;
import defpackage.lvb;
import defpackage.lyb;
import defpackage.mcf;
import defpackage.mvb;
import defpackage.mvd;
import defpackage.n5g;
import defpackage.ndb;
import defpackage.nvb;
import defpackage.odb;
import defpackage.paf;
import defpackage.pvb;
import defpackage.q9;
import defpackage.qfb;
import defpackage.qsb;
import defpackage.rd5;
import defpackage.s2i;
import defpackage.tcf;
import defpackage.uc9;
import defpackage.ucf;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wrb;
import defpackage.xs0;
import defpackage.y9b;
import defpackage.ye6;
import defpackage.yfb;
import defpackage.yg2;
import defpackage.ys;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zfb;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/startconversation/chat/PickChatMembers;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lpvb;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickChatMembers extends AbstractPickerScreen<pvb> {
    public static final /* synthetic */ yy7[] x0;
    public final hs t0;
    public final k18 u0;
    public final ka5 v0;
    public final tcf w0;

    static {
        z8a z8aVar = new z8a(PickChatMembers.class, "selectedIds", "getSelectedIds()[J");
        vid.a.getClass();
        x0 = new yy7[]{z8aVar};
    }

    public PickChatMembers() {
        super(gwi.a());
        this.t0 = new hs(long[].class, "selected_ids");
        this.u0 = paf.a.getAccessor().d(10);
        this.v0 = new ka5(new zfb(8), (cm6) null, 6);
        this.w0 = ucf.a(new n5g(odb.v));
        gw0.w(new g56(I0().Y, new lvb(null, this), 1), getLifecycleScope());
        xs0 xs0Var = new xs0(this, new ffb(9, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 11, xs0Var));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerMembersListWidget(str, 0L, false, yg2.d, true, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(ndb.k);
        yfbVar.setTitle(odb.g);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(1, this)));
        return yfbVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        return new pvb();
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return this.w0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setE = longArray != null ? ys.E(longArray) : null;
        return setE == null ? rd5.a : setE;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.v0;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            qsb qsbVar = (qsb) this.u0.getValue();
            s2i s2iVar = new s2i(this, 1);
            String[] strArr2 = qsb.e;
            int i2 = mvd.a1;
            int i3 = mvd.b1;
            wrb wrbVar = new wrb(y9b.e);
            qsbVar.getClass();
            qsb.r(s2iVar, strArr, iArr, strArr2, i2, i3, wrbVar);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((pvb) I0().c).e, getViewLifecycleOwner().p(), l38.d), new nvb(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(k1b.N);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        layoutParams.setMargins(iD, iD, iD, iD);
        oneMeButton.setLayoutParams(layoutParams);
        f8j.d(oneMeButton, 300L, new ye6(28, this));
        gw0.w(new g56(I0().Y, new mvb(oneMeButton, null), 1), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return (uc9) paf.a.getAccessor().c(572);
    }
}
