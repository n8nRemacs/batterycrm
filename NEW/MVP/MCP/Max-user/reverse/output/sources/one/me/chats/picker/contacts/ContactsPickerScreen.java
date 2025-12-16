package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.a24;
import defpackage.aw0;
import defpackage.b24;
import defpackage.bda;
import defpackage.c24;
import defpackage.d92;
import defpackage.e03;
import defpackage.f1e;
import defpackage.f24;
import defpackage.f8j;
import defpackage.fde;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hfb;
import defpackage.hk1;
import defpackage.hs;
import defpackage.i1b;
import defpackage.i5i;
import defpackage.imb;
import defpackage.iza;
import defpackage.j6;
import defpackage.jza;
import defpackage.jzb;
import defpackage.k18;
import defpackage.k1b;
import defpackage.kti;
import defpackage.l38;
import defpackage.lyb;
import defpackage.mcf;
import defpackage.n5g;
import defpackage.q9;
import defpackage.qfb;
import defpackage.rd5;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ucf;
import defpackage.vid;
import defpackage.vw4;
import defpackage.xs0;
import defpackage.yfb;
import defpackage.yy7;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/contacts/ContactsPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lf24;", "Lbda;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "requestCode", "(I)V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ContactsPickerScreen extends AbstractPickerScreen<f24> implements bda {
    public static final /* synthetic */ yy7[] v0;
    public final hs t0;
    public final fde u0;

    static {
        toc tocVar = new toc(ContactsPickerScreen.class, "requestCode", "getRequestCode()I", 0);
        vid.a.getClass();
        v0 = new yy7[]{tocVar};
    }

    public ContactsPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new hs(Integer.class, 0, "contacts.picker.request_code.key");
        xs0 xs0Var = new xs0(this, new hk1(26, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 1, xs0Var));
        }
        this.u0 = new fde(e03.a.getAccessor().d(8), (k18) null, 6);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerContactsListWidget(str, null, 2, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(i1b.Z);
        yfbVar.setTitle(k1b.G);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new hfb(new d92(13, this)));
        return yfbVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        e03 e03Var = e03.a;
        return new f24(e03Var.getAccessor().d(556), e03Var.getAccessor().d(8), this.u0);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final mcf E0() {
        return ucf.a(new n5g(k1b.E));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set J0(Bundle bundle) {
        return rd5.a;
    }

    @Override // defpackage.bda
    public final f1e n() {
        return f1e.CHAT_SHARE_CONTACT;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        tqi.c(new c24(3, null, 0), view);
        gw0.w(new g56(aw0.a(((f24) I0().c).g, getViewLifecycleOwner().p(), l38.d), new b24(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(k1b.F);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        layoutParams.setMargins(iD, iD, iD, iD);
        oneMeButton.setLayoutParams(layoutParams);
        f8j.d(oneMeButton, 300L, new j6(21, this));
        gw0.w(new g56(I0().Y, new a24(oneMeButton, null), 1), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return new i5i(e03.a.getAccessor().d(556), this.u0, false);
    }

    public ContactsPickerScreen(int i) {
        this(gwi.b(new imb("contacts.picker.request_code.key", Integer.valueOf(i))));
    }
}
