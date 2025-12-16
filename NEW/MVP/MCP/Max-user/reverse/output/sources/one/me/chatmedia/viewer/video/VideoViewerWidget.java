package one.me.chatmedia.viewer.video;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ak2;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.cbh;
import defpackage.d1b;
import defpackage.g2h;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h09;
import defpackage.hbd;
import defpackage.hc8;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.j09;
import defpackage.jp2;
import defpackage.k18;
import defpackage.kbh;
import defpackage.kvf;
import defpackage.l38;
import defpackage.l48;
import defpackage.odh;
import defpackage.p0c;
import defpackage.rdh;
import defpackage.s6b;
import defpackage.sdh;
import defpackage.tdh;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tz4;
import defpackage.udh;
import defpackage.vid;
import defpackage.w7c;
import defpackage.yq2;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/video/VideoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lb1e;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Ltk4;)V", "rdh", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class VideoViewerWidget extends Widget {
    public static final /* synthetic */ yy7[] u0 = {new toc(VideoViewerWidget.class, "msgId", "getMsgId()J", 0), ho7.d(vid.a, VideoViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), new toc(VideoViewerWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), new toc(VideoViewerWidget.class, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0), new toc(VideoViewerWidget.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0)};
    public final bbd X;
    public final bbd Y;
    public hc8 Z;
    public final String a;
    public final k18 b;
    public final hs c;
    public final hs d;
    public final k18 o;
    public g2h s0;
    public final w7c t0;

    public VideoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = VideoViewerWidget.class.getName();
        this.b = ak2.a.getAccessor().d(48);
        this.c = new hs(Long.class, 0L, "chat.media.viewer.message_id");
        this.d = new hs(String.class, "", "chat.media.viewer.attach_id");
        hs hsVar = new hs(b1e.class, new b1e(getX()), Widget.ARG_SCOPE_ID);
        yy7 yy7Var = u0[2];
        this.o = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, yq2.class, null);
        this.X = viewBinding(d1b.q);
        this.Y = viewBinding(d1b.r);
        this.t0 = new w7c(this);
    }

    public final rdh A0() {
        Object targetController = getTargetController();
        if (targetController instanceof rdh) {
            return (rdh) targetController;
        }
        return null;
    }

    public final kbh B0() {
        return (kbh) this.X.D(this, u0[3]);
    }

    public final odh C0() {
        return (odh) this.Y.D(this, u0[4]);
    }

    public final yq2 D0() {
        return (yq2) this.o.getValue();
    }

    @Override // defpackage.c54
    public final void onActivityStarted(Activity activity) {
        rdh rdhVarA0;
        cbh cbhVarO0;
        super.onActivityStarted(activity);
        if (getView() == null || this.s0 == null || (rdhVarA0 = A0()) == null || (cbhVarO0 = ((ChatMediaViewerScreen) rdhVarA0).O0()) == null || !cbhVarO0.y0()) {
            return;
        }
        C0().a(this.t0);
    }

    @Override // defpackage.c54
    public final void onActivityStopped(Activity activity) {
        cbh cbhVarO0;
        super.onActivityStopped(activity);
        if (getView() == null || this.s0 == null) {
            return;
        }
        rdh rdhVarA0 = A0();
        if (rdhVarA0 != null && (cbhVarO0 = ((ChatMediaViewerScreen) rdhVarA0).O0()) != null) {
            cbhVarO0.pause();
            cbhVarO0.a0(null);
        }
        C0().b();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p0c p0cVar = new p0c(getContext());
        p0cVar.setId(d1b.s);
        p0cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        p0cVar.setTouchEventDelegate(new tz4(p0cVar.getContext(), p0cVar, new kvf(20, this), new s6b(this)));
        kbh kbhVar = new kbh(p0cVar.getContext());
        kbhVar.setId(d1b.q);
        kbhVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        p0cVar.addView(kbhVar);
        odh odhVar = new odh(p0cVar.getContext());
        odhVar.setId(d1b.r);
        odhVar.setAlpha(0.0f);
        odhVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new hc8(odhVar);
        p0cVar.addView(odhVar);
        return p0cVar;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ObjectAnimator objectAnimator;
        super.onDestroyView(view);
        hc8 hc8Var = this.Z;
        if (hc8Var != null && (objectAnimator = (ObjectAnimator) hc8Var.c) != null) {
            objectAnimator.cancel();
        }
        this.Z = null;
        this.s0 = null;
        C0().b();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = D0().e1;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new sdh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().g1, getViewLifecycleOwner().p(), l38Var), new tdh(null, this), 1), getViewLifecycleScope());
        j09 j09VarF = D0().F(z0(), y0());
        h09 h09Var = j09VarF instanceof h09 ? (h09) j09VarF : null;
        if (h09Var == null) {
            return;
        }
        B0().k(h09Var.d, ((jp2) D0().g1.a.getValue()).b);
        gw0.w(new g56(aw0.a(D0().U0, getViewLifecycleOwner().p(), l38Var), new udh(null, this), 1), getViewLifecycleScope());
    }

    public final String y0() {
        yy7 yy7Var = u0[1];
        return (String) this.d.a(this);
    }

    public final long z0() {
        yy7 yy7Var = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public VideoViewerWidget(long j, String str, String str2, tk4 tk4Var) {
        this(gwi.b(new imb("chat.media.viewer.message_id", Long.valueOf(j)), new imb("chat.media.viewer.attach_id", str), new imb(Widget.ARG_SCOPE_ID, new b1e(str2))));
    }
}
