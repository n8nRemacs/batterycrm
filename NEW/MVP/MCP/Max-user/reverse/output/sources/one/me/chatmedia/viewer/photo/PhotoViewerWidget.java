package one.me.chatmedia.viewer.photo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.aw0;
import defpackage.b09;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.ci5;
import defpackage.d1b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h08;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hvb;
import defpackage.imb;
import defpackage.j09;
import defpackage.jvb;
import defpackage.k18;
import defpackage.kvb;
import defpackage.l38;
import defpackage.l48;
import defpackage.tk4;
import defpackage.toc;
import defpackage.vid;
import defpackage.yq2;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/photo/PhotoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lb1e;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Ltk4;)V", "ivb", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PhotoViewerWidget extends Widget {
    public static final /* synthetic */ yy7[] o = {new toc(PhotoViewerWidget.class, "msgId", "getMsgId()J", 0), ho7.d(vid.a, PhotoViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), new toc(PhotoViewerWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), new toc(PhotoViewerWidget.class, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0)};
    public final hs a;
    public final hs b;
    public final k18 c;
    public final bbd d;

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, 0L, "chat.media.viewer.message_id");
        this.b = new hs(String.class, "", "chat.media.viewer.attach_id");
        hs hsVar = new hs(b1e.class, new b1e(getB()), Widget.ARG_SCOPE_ID);
        yy7 yy7Var = o[2];
        this.c = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, yq2.class, null);
        this.d = viewBinding(d1b.k);
    }

    public final hvb A0() {
        return (hvb) this.d.D(this, o[3]);
    }

    public final yq2 B0() {
        return (yq2) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        hvb hvbVar = new hvb(frameLayout.getContext());
        hvbVar.setId(d1b.k);
        frameLayout.addView(hvbVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        j09 j09VarF = B0().F(z0(), y0());
        b09 b09Var = j09VarF instanceof b09 ? (b09) j09VarF : null;
        if (b09Var == null) {
            return;
        }
        A0().setZoomEnabled(true);
        A0().setListener(new h08(28, this));
        B0().K(z0(), y0());
        A0().k(b09Var.d, false);
        ci5 ci5Var = B0().U0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new jvb(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().g1, getViewLifecycleOwner().p(), l38Var), new kvb(null, this), 1), getViewLifecycleScope());
    }

    public final String y0() {
        yy7 yy7Var = o[1];
        return (String) this.b.a(this);
    }

    public final long z0() {
        yy7 yy7Var = o[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public PhotoViewerWidget(long j, String str, String str2, tk4 tk4Var) {
        this(gwi.b(new imb("chat.media.viewer.message_id", Long.valueOf(j)), new imb("chat.media.viewer.attach_id", str), new imb(Widget.ARG_SCOPE_ID, new b1e(str2))));
    }
}
