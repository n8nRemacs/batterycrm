package one.me.chatmedia.viewer.photo;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ak2;
import defpackage.aw0;
import defpackage.b09;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.cbh;
import defpackage.ci5;
import defpackage.d1b;
import defpackage.g2h;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hc8;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hvb;
import defpackage.imb;
import defpackage.j09;
import defpackage.ju6;
import defpackage.k18;
import defpackage.kce;
import defpackage.ku6;
import defpackage.l38;
import defpackage.l48;
import defpackage.lu6;
import defpackage.odh;
import defpackage.rdh;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ukd;
import defpackage.vid;
import defpackage.yq2;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/chatmedia/viewer/photo/GifViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lb1e;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Ltk4;)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class GifViewerWidget extends Widget {
    public static final /* synthetic */ yy7[] u0 = {new toc(GifViewerWidget.class, "msgId", "getMsgId()J", 0), ho7.d(vid.a, GifViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), new toc(GifViewerWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), new toc(GifViewerWidget.class, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0), new toc(GifViewerWidget.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0)};
    public final bbd X;
    public final bbd Y;
    public hc8 Z;
    public final String a;
    public final k18 b;
    public final hs c;
    public final hs d;
    public final k18 o;
    public g2h s0;
    public final kce t0;

    public GifViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = GifViewerWidget.class.getName();
        this.b = ak2.a.getAccessor().d(48);
        this.c = new hs(Long.class, 0L, "chat.media.viewer.message_id");
        this.d = new hs(String.class, "", "chat.media.viewer.attach_id");
        hs hsVar = new hs(b1e.class, new b1e(getX()), Widget.ARG_SCOPE_ID);
        yy7 yy7Var = u0[2];
        this.o = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, yq2.class, null);
        this.X = viewBinding(d1b.k);
        this.Y = viewBinding(d1b.i);
        this.t0 = new kce(21, this);
    }

    public final hvb A0() {
        return (hvb) this.X.D(this, u0[3]);
    }

    public final cbh B0() {
        Object targetController = getTargetController();
        rdh rdhVar = targetController instanceof rdh ? (rdh) targetController : null;
        if (rdhVar != null) {
            return ((ChatMediaViewerScreen) rdhVar).O0();
        }
        return null;
    }

    public final odh C0() {
        return (odh) this.Y.D(this, u0[4]);
    }

    public final yq2 D0() {
        return (yq2) this.o.getValue();
    }

    @Override // defpackage.c54
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() == null || this.s0 == null) {
            return;
        }
        C0().a(this.t0);
        cbh cbhVarB0 = B0();
        if (cbhVarB0 != null) {
            cbhVarB0.play();
        }
    }

    @Override // defpackage.c54
    public final void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        if (getView() == null || this.s0 == null) {
            return;
        }
        cbh cbhVarB0 = B0();
        if (cbhVarB0 != null) {
            cbhVarB0.pause();
            cbhVarB0.a0(null);
        }
        C0().b();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        hvb hvbVar = new hvb(frameLayout.getContext());
        hvbVar.setId(d1b.k);
        hvbVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.addView(hvbVar);
        odh odhVar = new odh(frameLayout.getContext());
        odhVar.setId(d1b.i);
        odhVar.setAlpha(0.0f);
        odhVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new hc8(odhVar);
        frameLayout.addView(odhVar);
        return frameLayout;
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
        j09 j09VarF = D0().F(z0(), y0());
        b09 b09Var = j09VarF instanceof b09 ? (b09) j09VarF : null;
        if (b09Var == null) {
            return;
        }
        A0().setZoomEnabled(false);
        A0().setListener(new ukd(19, this));
        D0().K(z0(), y0());
        A0().k(b09Var.d, false);
        ci5 ci5Var = D0().U0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new ju6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().e1, getViewLifecycleOwner().p(), l38Var), new ku6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().g1, getViewLifecycleOwner().p(), l38Var), new lu6(null, this), 1), getViewLifecycleScope());
    }

    public final String y0() {
        yy7 yy7Var = u0[1];
        return (String) this.d.a(this);
    }

    public final long z0() {
        yy7 yy7Var = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public GifViewerWidget(long j, String str, String str2, tk4 tk4Var) {
        this(gwi.b(new imb("chat.media.viewer.message_id", Long.valueOf(j)), new imb("chat.media.viewer.attach_id", str), new imb(Widget.ARG_SCOPE_ID, new b1e(str2))));
    }
}
