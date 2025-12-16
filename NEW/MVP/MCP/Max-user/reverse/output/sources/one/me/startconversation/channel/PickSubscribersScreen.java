package one.me.startconversation.channel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.bcb;
import defpackage.bwf;
import defpackage.cm6;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.jzb;
import defpackage.lyb;
import defpackage.mcf;
import defpackage.n5g;
import defpackage.ndb;
import defpackage.nwb;
import defpackage.odb;
import defpackage.paf;
import defpackage.q9;
import defpackage.qfb;
import defpackage.rd5;
import defpackage.sn0;
import defpackage.tcf;
import defpackage.toc;
import defpackage.uc9;
import defpackage.ucf;
import defpackage.vid;
import defpackage.vwb;
import defpackage.wwb;
import defpackage.xs0;
import defpackage.yfb;
import defpackage.yg2;
import defpackage.ys;
import defpackage.ywb;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zfb;
import defpackage.zwb;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.channel.PickSubscribersScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/channel/PickSubscribersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lnwb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickSubscribersScreen extends AbstractPickerScreen<nwb> {
    public static final /* synthetic */ yy7[] z0 = {new z8a(PickSubscribersScreen.class, "selectedIds", "getSelectedIds()[J"), ho7.d(vid.a, PickSubscribersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new toc(PickSubscribersScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final hs t0;
    public final hs u0;
    public final bwf v0;
    public bcb w0;
    public final tcf x0;
    public final sn0 y0;

    public PickSubscribersScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new hs(long[].class, "selected_ids");
        this.u0 = new hs(Long.class, "id");
        this.v0 = new bwf(new zfb(10));
        this.x0 = ucf.a(new n5g(odb.v));
        final int i = 0;
        this.y0 = binding(new cm6(this) { // from class: uwb
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = PickSubscribersScreen.z0;
                        OneMeButton oneMeButton = new OneMeButton(pickSubscribersScreen.getContext(), null);
                        oneMeButton.setId(ndb.l);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.d);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setText(k1b.N);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iD, iD, iD, iD);
                        oneMeButton.setLayoutParams(layoutParams);
                        return oneMeButton;
                    default:
                        yy7[] yy7VarArr2 = PickSubscribersScreen.z0;
                        int i3 = xz7.a;
                        if (xz7.b(xz7.c)) {
                            api.c(pickSubscribersScreen);
                        }
                        return qqg.a;
                }
            }
        });
        gw0.w(new g56(I0().Y, new wwb(this, null), 1), getLifecycleScope());
        final int i2 = 1;
        xs0 xs0Var = new xs0(this, new cm6(this) { // from class: uwb
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = PickSubscribersScreen.z0;
                        OneMeButton oneMeButton = new OneMeButton(pickSubscribersScreen.getContext(), null);
                        oneMeButton.setId(ndb.l);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setAppearance(gza.d);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setText(k1b.N);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iD, iD, iD, iD);
                        oneMeButton.setLayoutParams(layoutParams);
                        return oneMeButton;
                    default:
                        yy7[] yy7VarArr2 = PickSubscribersScreen.z0;
                        int i3 = xz7.a;
                        if (xz7.b(xz7.c)) {
                            api.c(pickSubscribersScreen);
                        }
                        return qqg.a;
                }
            }
        });
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 12, xs0Var));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget A0(String str) {
        return new PickerMembersListWidget(str, 0L, false, yg2.d, false, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final yfb B0(Context context) {
        yfb yfbVar = new yfb(context, 6);
        yfbVar.setId(ndb.p);
        yfbVar.setTitle(odb.e);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new vwb(this, 0)));
        return yfbVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final jzb C0() {
        yy7 yy7Var = z0[1];
        long jLongValue = ((Number) this.u0.a(this)).longValue();
        paf pafVar = paf.a;
        return new nwb(jLongValue, pafVar.getAccessor().d(79), pafVar.getAccessor().d(8), pafVar.getAccessor().d(109), pafVar.getAccessor().d(585), pafVar.getAccessor().d(139));
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

    public final OneMeButton K0() {
        yy7 yy7Var = z0[2];
        return (OneMeButton) this.y0.getValue();
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(((nwb) I0().c).h, new zwb(this, null), 1), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable y0() {
        gw0.w(new g56(I0().Y, new ywb(this, null), 1), getViewLifecycleScope());
        return Collections.singletonList(K0());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final lyb z0() {
        return (uc9) paf.a.getAccessor().c(572);
    }

    public PickSubscribersScreen(long j) {
        this(gwi.b(new imb("id", Long.valueOf(j))));
    }
}
