package one.me.mediapicker;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.aw0;
import defpackage.b39;
import defpackage.bbd;
import defpackage.c38;
import defpackage.dbe;
import defpackage.eo7;
import defpackage.f82;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h39;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i39;
import defpackage.imb;
import defpackage.iv8;
import defpackage.j39;
import defpackage.jd0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k39;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l39;
import defpackage.l48;
import defpackage.m;
import defpackage.m39;
import defpackage.mp6;
import defpackage.r39;
import defpackage.sn0;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.x6b;
import defpackage.xo6;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/mediapicker/MediaPickerScreen;", "Lone/me/sdk/arch/Widget;", "Ljd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lxo6;", "galleryMode", "", "sourceId", "(Lxo6;Ljava/lang/Long;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaPickerScreen extends Widget implements jd0 {
    public static final /* synthetic */ yy7[] B0 = {new toc(MediaPickerScreen.class, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), ho7.d(vid.a, MediaPickerScreen.class, "galleryMode", "getGalleryMode()Lone/me/sdk/gallery/GalleryMode;", 0), new toc(MediaPickerScreen.class, "sourceId", "getSourceId()Ljava/lang/Long;", 0), new toc(MediaPickerScreen.class, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(MediaPickerScreen.class, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new z8a(MediaPickerScreen.class, "maxHeightAlbumsContent", "getMaxHeightAlbumsContent()I"), new toc(MediaPickerScreen.class, "mediaPickerContainer", "getMediaPickerContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(MediaPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(MediaPickerScreen.class, "divider", "getDivider()Landroid/view/View;", 0), new toc(MediaPickerScreen.class, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0)};
    public final sn0 A0;
    public final ka5 X;
    public final k18 Y;
    public final k18 Z;
    public final eo7 a;
    public final bbd b;
    public final String c;
    public final hs d;
    public final hs o;
    public final k18 s0;
    public final bbd t0;
    public final sn0 u0;
    public final hs v0;
    public final sn0 w0;
    public final sn0 x0;
    public final sn0 y0;
    public final bbd z0;

    public MediaPickerScreen(xo6 xo6Var, Long l) {
        this(gwi.b(new imb("gallery_mode_args", xo6Var), new imb("source_id_args", l)));
    }

    public static final void y0(MediaPickerScreen mediaPickerScreen, boolean z) {
        sn0 sn0Var = mediaPickerScreen.A0;
        if (z) {
            ((View) sn0Var.getValue()).setVisibility(0);
        } else if (sn0Var.e()) {
            ((TextView) sn0Var.getValue()).setVisibility(8);
        }
        sn0 sn0Var2 = mediaPickerScreen.w0;
        yy7 yy7Var = B0[6];
        ((f82) sn0Var2.getValue()).setVisibility(z ? 8 : 0);
    }

    public final yfb A0() {
        yy7 yy7Var = B0[7];
        return (yfb) this.x0.getValue();
    }

    public final r39 B0() {
        return (r39) this.s0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getC() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getD() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.X;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (z0().Z) {
            tqi.c(new m(3, null, 8), linearLayout);
        }
        linearLayout.addView(A0());
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(x6b.k);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        yy7[] yy7VarArr = B0;
        yy7 yy7Var = yy7VarArr[6];
        frameLayout.addView((f82) this.w0.getValue());
        yy7 yy7Var2 = yy7VarArr[4];
        frameLayout.addView((f82) this.u0.getValue());
        yy7 yy7Var3 = yy7VarArr[8];
        frameLayout.addView((View) this.y0.getValue());
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = B0().x0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new i39(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((mp6) this.Y.getValue()).c, getViewLifecycleOwner().p(), l38Var), new j39(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().v0, getViewLifecycleOwner().p(), l38Var), new k39(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().w0, getViewLifecycleOwner().p(), l38Var), new l39(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((dbe) this.Z.getValue()).d, getViewLifecycleOwner().p(), l38Var), new m39(null, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.jd0
    public final void r(String str, RectF rectF, Rect rect) {
        B0().w0.h(new b39(str, rectF, rect));
    }

    public final xo6 z0() {
        yy7 yy7Var = B0[1];
        return (xo6) this.d.a(this);
    }

    public MediaPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = childSlotRouter(x6b.j);
        this.c = "MediaPickerScreenScopeId";
        this.d = new hs(xo6.class, "gallery_mode_args");
        this.o = new hs(Long.class, "source_id_args");
        this.X = new ka5(new h39(this, 0), new h39(this, 2), 4);
        this.Y = createViewModelLazy(mp6.class, new iv8(5, new c38(21)));
        this.Z = createViewModelLazy(dbe.class, new iv8(6, new h39(this, 3)));
        this.s0 = createViewModelLazy(r39.class, new iv8(7, new h39(this, 4)));
        this.t0 = childSlotRouter(x6b.i);
        this.u0 = binding(new h39(this, 5));
        this.v0 = new hs(Integer.class, 0, "max_height_albums_content");
        this.w0 = binding(new h39(this, 6));
        this.x0 = binding(new h39(this, 7));
        this.y0 = binding(new h39(this, 8));
        this.z0 = viewBinding(x6b.k);
        this.A0 = binding(new h39(this, 9));
    }
}
