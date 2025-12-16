package one.me.chatscreen.chatstatus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.d53;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gy2;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iy2;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.m1b;
import defpackage.sv2;
import defpackage.tk4;
import defpackage.tqi;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zx2;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/chatstatus/ChatStatusBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Lgy2;", "chatStatus", "(Ljava/lang/String;Lgy2;Ltk4;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatStatusBottomWidget extends Widget {
    public static final /* synthetic */ yy7[] c = {new z8a(ChatStatusBottomWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), ho7.d(vid.a, ChatStatusBottomWidget.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 a;
    public final bbd b;

    public ChatStatusBottomWidget(String str, gy2 gy2Var, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("arg_key_chat_status", gy2Var)));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tqi.c(new sv2(3, null, 1), frameLayout);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), null);
        oneMeButton.setId(m1b.c);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.c);
        oneMeButton.setAppearance(gza.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = 12;
        float f2 = 0;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams);
        frameLayout.addView(oneMeButton);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(aw0.a(new d53(y0().f1, 12), getViewLifecycleOwner().p(), l38.d), new iy2(null, this), 1), getViewLifecycleScope());
    }

    public final zx2 y0() {
        return (zx2) this.a.getValue();
    }

    public ChatStatusBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        yy7 yy7Var = c[0];
        this.a = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, zx2.class, null);
        this.b = viewBinding(m1b.c);
    }
}
