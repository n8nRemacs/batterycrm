package one.me.stickerspreview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import defpackage.api;
import defpackage.bbd;
import defpackage.bzb;
import defpackage.e8j;
import defpackage.eo7;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h54;
import defpackage.hff;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i54;
import defpackage.i84;
import defpackage.iff;
import defpackage.imb;
import defpackage.k18;
import defpackage.kk4;
import defpackage.l8j;
import defpackage.ms0;
import defpackage.off;
import defpackage.pdb;
import defpackage.q2b;
import defpackage.qk8;
import defpackage.rk8;
import defpackage.svi;
import defpackage.toc;
import defpackage.vdc;
import defpackage.vff;
import defpackage.vgf;
import defpackage.vid;
import defpackage.vnd;
import defpackage.xz7;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yy7;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/stickerspreview/StickerPreviewScreen;", "Lone/me/sdk/arch/Widget;", "Lvff;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "stickerId", ApiProtocol.PARAM_CHAT_ID, "forwardId", "(JJJ)V", "stickers-preview_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickerPreviewScreen extends Widget implements vff {
    public static final /* synthetic */ yy7[] z0 = {new toc(StickerPreviewScreen.class, "stickerId", "getStickerId()J", 0), ho7.d(vid.a, StickerPreviewScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new toc(StickerPreviewScreen.class, "forwardId", "getForwardId()J", 0), new toc(StickerPreviewScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(StickerPreviewScreen.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0), new toc(StickerPreviewScreen.class, "stickerContainer", "getStickerContainer()Landroid/widget/FrameLayout;", 0), new toc(StickerPreviewScreen.class, "favoriteButton", "getFavoriteButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0), new toc(StickerPreviewScreen.class, "stickerSetSheetRouter", "getStickerSetSheetRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    public final k18 X;
    public final qk8 Y;
    public final bbd Z;
    public final hs a;
    public final hs b;
    public final eo7 c;
    public final String d;
    public final k18 o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final vnd w0;
    public final vnd x0;
    public final vnd y0;

    public StickerPreviewScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(Long.class, 0L, "arg_key_sticker_id");
        this.a = new hs(Long.class, 0L, "arg_key_chat_id");
        this.b = new hs(Long.class, 0L, "arg_key_forward_id");
        this.c = new eo7(3, new ms0(3, 1, false), 5);
        this.d = "StickerPreviewScreen";
        this.o = createViewModelLazy(off.class, new vdc(27, new hff(this, 0)));
        this.X = vgf.a.getAccessor().d(476);
        this.Y = new qk8();
        this.Z = viewBinding(pdb.k);
        this.s0 = viewBinding(pdb.d);
        this.t0 = viewBinding(pdb.g);
        this.u0 = viewBinding(pdb.a);
        this.v0 = Widget.childRouter$default(this, pdb.h, null, 2, null);
        this.w0 = e8j.b(new hff(this, 1));
        this.x0 = e8j.b(new hff(this, 2));
        this.y0 = e8j.b(new hff(this, 3));
        off offVarZ0 = z0();
        yy7 yy7Var = z0[0];
        offVarZ0.w(((Number) hsVar.a(this)).longValue());
        off offVarZ02 = z0();
        if (offVarZ02.b == 0) {
            return;
        }
        offVarZ02.C0.O(offVarZ02, off.F0[1], svi.d(offVarZ02.a, ((q2b) offVarZ02.c).b(), i84.b, new iff(offVarZ02, null)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getO() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        y0().b = null;
        y0().a(this.Y);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference;
        if (isAttached()) {
            rk8 rk8VarY0 = y0();
            qk8 qk8Var = this.Y;
            if (qk8Var == null) {
                weakReference = null;
            } else {
                rk8VarY0.getClass();
                weakReference = new WeakReference(qk8Var);
            }
            rk8VarY0.b = weakReference;
            y0().b(qk8Var);
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        Window window;
        View currentFocus;
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        int i = xz7.a;
        if (xz7.b(xz7.c)) {
            api.e(currentFocus);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        i54 i54Var2 = i54.POP_ENTER;
        WeakReference weakReference = null;
        qk8 qk8Var = this.Y;
        if (i54Var != i54Var2 && i54Var != i54.PUSH_ENTER) {
            if (i54Var == i54.PUSH_EXIT || i54Var == i54.POP_EXIT) {
                y0().b = null;
                y0().a(qk8Var);
                return;
            }
            return;
        }
        rk8 rk8VarY0 = y0();
        if (qk8Var != null) {
            rk8VarY0.getClass();
            weakReference = new WeakReference(qk8Var);
        }
        rk8VarY0.b = weakReference;
        y0().b(qk8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01e2  */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r22, android.view.ViewGroup r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerspreview.StickerPreviewScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        y0().b = null;
        this.Y.b();
        kk4 kk4Var = kk4.B0;
        this.w0.b = kk4Var;
        this.x0.b = kk4Var;
        this.y0.b = kk4Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yy7[] yy7VarArr = z0;
        yy7 yy7Var = yy7VarArr[7];
        bbd bbdVar = this.v0;
        if (!((ytd) bbdVar.D(this, yy7Var)).n()) {
            ytd ytdVar = (ytd) bbdVar.D(this, yy7VarArr[7]);
            StickerSetBottomSheet stickerSetBottomSheet = new StickerSetBottomSheet(this.d, null);
            stickerSetBottomSheet.y0 = this.Y;
            ytdVar.S(l8j.a(stickerSetBottomSheet, null, null));
        }
        int i = 4;
        gw0.w(new g56(z0().w0, new bzb(2, this, StickerPreviewScreen.class, "handleNewSticker", "handleNewSticker(Lone/me/sdk/stickers/model/StickerModel;)V", i, 11), 1), getViewLifecycleScope());
        int i2 = 2;
        Class<yfb> cls = yfb.class;
        String str = "setTitle";
        String str2 = "setTitle(Ljava/lang/CharSequence;)V";
        gw0.w(new g56(z0().y0, new bzb(i2, (yfb) this.Z.D(this, yy7VarArr[3]), cls, str, str2, 4, 12), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().t0, new bzb(2, this, StickerPreviewScreen.class, "handleNavEvent", "handleNavEvent(Lone/me/sdk/arch/event/NavigationEvent;)V", i, 13), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().u0, new bzb(2, this, StickerPreviewScreen.class, "handleEvent", "handleEvent(Lone/me/sdk/arch/event/Event;)V", i, 14), 1), getViewLifecycleScope());
    }

    public final rk8 y0() {
        return (rk8) this.X.getValue();
    }

    public final off z0() {
        return (off) this.o.getValue();
    }

    public StickerPreviewScreen(long j, long j2, long j3) {
        this(gwi.b(new imb("arg_key_sticker_id", Long.valueOf(j)), new imb("arg_key_chat_id", Long.valueOf(j2)), new imb("arg_key_forward_id", Long.valueOf(j3))));
    }
}
