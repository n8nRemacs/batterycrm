package one.me.chatscreen.mediabar;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a93;
import defpackage.ade;
import defpackage.ak9;
import defpackage.av8;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bda;
import defpackage.bk9;
import defpackage.bu8;
import defpackage.buc;
import defpackage.bud;
import defpackage.bv8;
import defpackage.c38;
import defpackage.c54;
import defpackage.c83;
import defpackage.ccb;
import defpackage.cv8;
import defpackage.d53;
import defpackage.dbe;
import defpackage.dce;
import defpackage.dv8;
import defpackage.eb9;
import defpackage.eo7;
import defpackage.ev8;
import defpackage.f1e;
import defpackage.f82;
import defpackage.fni;
import defpackage.g56;
import defpackage.gda;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.iab;
import defpackage.ik9;
import defpackage.imb;
import defpackage.in9;
import defpackage.ipi;
import defpackage.iv8;
import defpackage.iyc;
import defpackage.j02;
import defpackage.jfb;
import defpackage.k00;
import defpackage.k18;
import defpackage.k8j;
import defpackage.kcb;
import defpackage.l00;
import defpackage.l1b;
import defpackage.l38;
import defpackage.l48;
import defpackage.l8j;
import defpackage.lfb;
import defpackage.ln;
import defpackage.lqi;
import defpackage.ls0;
import defpackage.m1b;
import defpackage.m6c;
import defpackage.mp6;
import defpackage.ms0;
import defpackage.mu8;
import defpackage.mvd;
import defpackage.nd8;
import defpackage.nu8;
import defpackage.o12;
import defpackage.o22;
import defpackage.o6c;
import defpackage.o92;
import defpackage.ofb;
import defpackage.og6;
import defpackage.oi4;
import defpackage.ou8;
import defpackage.p12;
import defpackage.p22;
import defpackage.pcg;
import defpackage.pd8;
import defpackage.pu8;
import defpackage.qcb;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.rfb;
import defpackage.rs0;
import defpackage.rsb;
import defpackage.ru8;
import defpackage.s09;
import defpackage.s2i;
import defpackage.sd8;
import defpackage.shh;
import defpackage.sn0;
import defpackage.t09;
import defpackage.tcf;
import defpackage.tk4;
import defpackage.toc;
import defpackage.uu8;
import defpackage.uv2;
import defpackage.v38;
import defpackage.v9;
import defpackage.vf2;
import defpackage.vid;
import defpackage.vpi;
import defpackage.vu8;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.wu8;
import defpackage.x4j;
import defpackage.xu8;
import defpackage.xz7;
import defpackage.y09;
import defpackage.yfb;
import defpackage.ytc;
import defpackage.ytd;
import defpackage.yu8;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.zfi;
import defpackage.zj9;
import defpackage.zr0;
import defpackage.zs8;
import defpackage.zu8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/chatscreen/mediabar/MediaBarWidget;", "Lone/me/sdk/arch/Widget;", "Lbda;", "Lqq3;", "Lo12;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "(Ljava/lang/String;JLtk4;)V", "v9", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaBarWidget extends Widget implements bda, qq3, o12 {
    public static final /* synthetic */ yy7[] c1 = {new toc(MediaBarWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, MediaBarWidget.class, "selectMediaTypeRouter", "getSelectMediaTypeRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(MediaBarWidget.class, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(MediaBarWidget.class, "popupLayout", "getPopupLayout()Lone/me/sdk/uikit/common/views/PopupLayout;", 0), new toc(MediaBarWidget.class, "closeDragView", "getCloseDragView()Landroid/widget/FrameLayout;", 0), new toc(MediaBarWidget.class, "closeDragElement", "getCloseDragElement()Landroid/widget/FrameLayout;", 0), new toc(MediaBarWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(MediaBarWidget.class, "primaryContainer", "getPrimaryContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(MediaBarWidget.class, "partialMediaAccessRouter", "getPartialMediaAccessRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(MediaBarWidget.class, "partialMediaAccessContainer", "getPartialMediaAccessContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(MediaBarWidget.class, "cameraContainerView", "getCameraContainerView()Lone/me/sdk/gallery/view/CameraContainerView;", 0), new toc(MediaBarWidget.class, "selectedMediaAdapter", "getSelectedMediaAdapter()Lone/me/chatscreen/mediabar/SelectedMediaAdapter;", 0), new toc(MediaBarWidget.class, "selectedMediaRecycler", "getSelectedMediaRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(MediaBarWidget.class, "selectedMediaContent", "getSelectedMediaContent()Landroid/widget/LinearLayout;", 0), new toc(MediaBarWidget.class, "messageContent", "getMessageContent()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new toc(MediaBarWidget.class, "draggableContainer", "getDraggableContainer()Landroid/widget/LinearLayout;", 0), new toc(MediaBarWidget.class, "selectMediaTypeContainer", "getSelectMediaTypeContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(MediaBarWidget.class, "bottomContainer", "getBottomContainer()Landroid/widget/LinearLayout;", 0), new toc(MediaBarWidget.class, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(MediaBarWidget.class, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(MediaBarWidget.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(MediaBarWidget.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    public static final eo7 d1 = new eo7(0, new ms0(4, 3, true), 7);
    public final sn0 A0;
    public final ColorDrawable B0;
    public final sn0 C0;
    public float D0;
    public float E0;
    public int F0;
    public final sn0 G0;
    public final sn0 H0;
    public final sn0 I0;
    public final sn0 J0;
    public final ls0 K0;
    public final ColorDrawable L0;
    public ValueAnimator M0;
    public final sn0 N0;
    public final sn0 O0;
    public final sn0 P0;
    public final k18 Q0;
    public final k18 R0;
    public final k18 S0;
    public final k18 T0;
    public final bbd U0;
    public final sn0 V0;
    public final k18 W0;
    public final IntEvaluator X;
    public final bbd X0;
    public final bbd Y;
    public final bbd Y0;
    public final bbd Z;
    public final og6 Z0;
    public final String a;
    public y09 a1;
    public final hs b;
    public ChatScreen b1;
    public final k18 c;
    public final gda d;
    public final sd8 o;
    public final bbd s0;
    public bcb t0;
    public final sn0 u0;
    public final sn0 v0;
    public final sn0 w0;
    public final sn0 x0;
    public final k18 y0;
    public final bbd z0;

    public MediaBarWidget(String str, long j, tk4 tk4Var) {
        this(gwi.b(new imb("scope_id", new b1e(str)), new imb("chat_id", Long.valueOf(j))));
    }

    public static final void A0(MediaBarWidget mediaBarWidget) {
        sn0 sn0Var = mediaBarWidget.v0;
        yy7[] yy7VarArr = c1;
        yy7 yy7Var = yy7VarArr[5];
        int paddingTop = mediaBarWidget.F0().getPaddingTop() + mediaBarWidget.M0().getMeasuredHeight() + ((FrameLayout) sn0Var.getValue()).getMeasuredHeight();
        sn0 sn0Var2 = mediaBarWidget.A0;
        yy7 yy7Var2 = yy7VarArr[9];
        float measuredHeight = mediaBarWidget.E0 + mediaBarWidget.D0 + ((f82) sn0Var2.getValue()).getMeasuredHeight() + paddingTop;
        LinearLayout linearLayoutD0 = mediaBarWidget.D0();
        Rect rect = shh.a;
        shh.d(rect, linearLayoutD0);
        int height = (mediaBarWidget.E0().getHeight() + ((int) measuredHeight)) - rect.top;
        if (height < 0) {
            height = 0;
        }
        p12 p12VarE0 = mediaBarWidget.E0();
        int i = (-((int) mediaBarWidget.D0)) + mediaBarWidget.F0;
        p12VarE0.u0 = i;
        p12VarE0.v0 = height;
        if (!p12VarE0.y0) {
            pcg pcgVar = p12VarE0.w0;
            pcgVar.a = i;
            pcgVar.b = height;
            p12VarE0.invalidateOutline();
        }
        mediaBarWidget.E0().setPreviewTranslationY(measuredHeight);
    }

    public static final void y0(MediaBarWidget mediaBarWidget, int i, int i2) {
        bcb bcbVar = mediaBarWidget.t0;
        if (bcbVar != null) {
            bcbVar.a();
        }
        ccb ccbVar = new ccb(mediaBarWidget.J0());
        ccbVar.c(new kcb(0, 0, mediaBarWidget.D0().getHeight(), 3));
        ccbVar.e(new qcb(i));
        ccbVar.h(mediaBarWidget.getContext().getString(i2));
        mediaBarWidget.t0 = ccbVar.i();
    }

    public static final void z0(MediaBarWidget mediaBarWidget, int i) throws Resources.NotFoundException {
        bcb bcbVar = mediaBarWidget.t0;
        if (bcbVar != null) {
            bcbVar.a();
        }
        String quantityString = mediaBarWidget.getContext().getResources().getQuantityString(iab.a, i, Integer.valueOf(i));
        ccb ccbVar = new ccb(mediaBarWidget.J0());
        ccbVar.c(new kcb(0, 0, mediaBarWidget.D0().getHeight(), 3));
        ccbVar.h(quantityString);
        mediaBarWidget.t0 = ccbVar.i();
    }

    public final void B0() {
        ytc ytcVar = E0().a;
        if (ytcVar != null) {
            if (ytcVar == null) {
                ytcVar = null;
            }
            ((CameraxCameraApiView) ytcVar.getCameraApi()).d();
        }
        c54 c54VarB = k8j.b(K0().a);
        if (c54VarB instanceof MediaBarPermissionWidget) {
            sn0 sn0Var = ((MediaBarPermissionWidget) c54VarB).d;
            if (sn0Var.e()) {
                ((CameraxCameraApiView) ((j02) sn0Var.getValue())).d();
            }
        }
        c54 c54VarB2 = k8j.b(((c83) this.U0.D(this, c1[18])).a);
        SelectAlbumWidget selectAlbumWidget = c54VarB2 instanceof SelectAlbumWidget ? (SelectAlbumWidget) c54VarB2 : null;
        if (selectAlbumWidget != null) {
            selectAlbumWidget.z0().j(false);
        }
        M0().setDropdownRotationProgress(0.0f);
        N0().Z.m(null, Boolean.FALSE);
    }

    public final void C0() {
        ytc ytcVar = E0().a;
        if (ytcVar != null) {
            if (ytcVar == null) {
                ytcVar = null;
            }
            ((CameraxCameraApiView) ytcVar.getCameraApi()).c();
        }
        c54 c54VarB = k8j.b(K0().a);
        if (c54VarB instanceof MediaBarPermissionWidget) {
            sn0 sn0Var = ((MediaBarPermissionWidget) c54VarB).d;
            if (sn0Var.e()) {
                ((CameraxCameraApiView) ((j02) sn0Var.getValue())).c();
            }
        }
        N0().Z.m(null, Boolean.TRUE);
    }

    public final LinearLayout D0() {
        yy7 yy7Var = c1[17];
        return (LinearLayout) this.P0.getValue();
    }

    public final p12 E0() {
        yy7 yy7Var = c1[10];
        return (p12) this.C0.getValue();
    }

    public final LinearLayout F0() {
        yy7 yy7Var = c1[15];
        return (LinearLayout) this.N0.getValue();
    }

    public final mp6 G0() {
        return (mp6) this.Q0.getValue();
    }

    public final ytd H0() {
        return (ytd) this.Y0.D(this, c1[21]);
    }

    public final ik9 I0() {
        yy7 yy7Var = c1[14];
        return (ik9) this.J0.getValue();
    }

    public final o6c J0() {
        return (o6c) this.s0.D(this, c1[3]);
    }

    public final c83 K0() {
        return (c83) this.Z.D(this, c1[2]);
    }

    public final f82 L0() {
        yy7 yy7Var = c1[19];
        return (f82) this.V0.getValue();
    }

    public final yfb M0() {
        yy7 yy7Var = c1[6];
        return (yfb) this.w0.getValue();
    }

    public final mu8 N0() {
        return (mu8) this.S0.getValue();
    }

    public final void O0(pd8 pd8Var, int i, String str) {
        ln lnVarRequireActivity = requireActivity();
        boolean zV = N0().v();
        rs0 rs0Var = new rs0(4, (byte) 0);
        rs0Var.c = false;
        rs0Var.d = str;
        rs0Var.b = i;
        rs0Var.e = pd8Var.a();
        rs0Var.c = zV;
        int i2 = ActLocalMedias.p1;
        Intent intent = new Intent(lnVarRequireActivity, (Class<?>) ActLocalMedias.class);
        intent.putExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false);
        intent.putExtra("ru.ok.tamtam.extra.OPTIONS", new nd8(rs0Var));
        Pair pairCreate = Pair.create(intent, null);
        startActivityForResult((Intent) pairCreate.first, 39393, (Bundle) pairCreate.second);
    }

    public final void P0(ade adeVar) {
        int iOrdinal = adeVar.ordinal();
        if (iOrdinal == 0) {
            I0().setRightOuterIconActionState(ak9.a);
        } else if (iOrdinal == 1) {
            I0().setRightOuterIconActionState(zj9.a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            I0().setRightOuterIconActionState(bk9.a);
        }
    }

    public final void Q0(l00 l00Var) {
        int i;
        ofb lfbVar;
        yfb yfbVarM0 = M0();
        if (N0().v()) {
            lfbVar = jfb.a;
        } else {
            int iOrdinal = l00Var.ordinal();
            if (iOrdinal == 0) {
                i = l1b.i;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = l1b.h;
            }
            lfbVar = new lfb(null, new rfb(i, new pu8(this, 0)), null);
        }
        yfbVarM0.setRightActions(lfbVar);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i != 1) {
            return;
        }
        N0().u0.g(new zs8(false));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getD() {
        return this.a;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        if (E0().y0) {
            E0().a(false, true);
            gda.g(this.d, f1e.CHAT_ATTACH_PICKER);
            return true;
        }
        m6c scrollState = J0().getScrollState();
        scrollState.getClass();
        if (scrollState == m6c.a) {
            return false;
        }
        if (H0().n()) {
            N0().w0.E(1);
            return true;
        }
        if (N0().x()) {
            J0().j(true);
        }
        return true;
    }

    @Override // defpackage.bda
    public final f1e n() {
        return E0().y0 ? f1e.CHAT_ATTACH_PICKER_CAMERA : f1e.CHAT_ATTACH_PICKER;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        if (getView() != null) {
            B0();
        }
        super.onActivityPaused(activity);
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mu8 mu8VarN0 = N0();
        dce dceVarU = mu8VarN0.u();
        tcf tcfVar = mu8VarN0.s0;
        int i3 = dceVarU.k;
        int i4 = i3 == 0 ? -1 : bu8.$EnumSwitchMapping$2[az1.v(i3)];
        int i5 = 3;
        if (i4 == 1 || i4 == 2) {
            tcfVar.m(null, l00.a);
            dce dceVarU2 = mu8VarN0.u();
            int i6 = k00.$EnumSwitchMapping$0[0];
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 2;
            }
            dceVarU2.p(i5);
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            tcfVar.m(null, l00.b);
            dce dceVarU3 = mu8VarN0.u();
            int i7 = k00.$EnumSwitchMapping$0[1];
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 2;
            }
            dceVarU3.p(i5);
        }
        if (i == 39393) {
            E0().a(false, false);
            if (i2 == -1) {
                N0().w(true);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            if (J0().getScrollState() != m6c.a) {
                C0();
            }
            I0().setText(this.o.f.j);
        }
        mu8 mu8VarN0 = N0();
        mu8VarN0.z0.f();
        mu8VarN0.A0.f();
        buc bucVar = (buc) this.y0.getValue();
        bucVar.x0.f();
        bucVar.y0.f();
        super.onActivityResumed(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        o6c o6cVar = new o6c(getContext());
        o6cVar.setId(iyc.media_bar__popup_layout);
        a93.s0.y(o6cVar).b();
        o6cVar.setBackground(new ColorDrawable(-1728053248));
        o6cVar.addView(F0());
        o6cVar.addView(D0());
        o6cVar.addView(E0());
        View f82Var = new f82(o6cVar.getContext());
        f82Var.setId(m1b.D);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        f82Var.setLayoutParams(layoutParams);
        int i = xz7.a;
        f82Var.setTranslationY(xz7.a(f82Var.getContext()));
        zfi.b(f82Var, new eo7(0, new ms0(5, 1, false), 7), null);
        o6cVar.addView(f82Var);
        o6cVar.setCallback(new v9(this, 2));
        o6cVar.addOnLayoutChangeListener(new nu8(o6cVar, 0, this));
        vpi.b(new g56(xz7.f, new ru8(this, o6cVar, null), 1), getViewLifecycleScope());
        return o6cVar;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        o6c o6cVarJ0 = J0();
        ValueAnimator valueAnimator = o6cVarJ0.o;
        if (valueAnimator != null) {
            lqi.a(valueAnimator);
        }
        o6cVarJ0.o = null;
        ytc ytcVar = E0().a;
        if (ytcVar != null) {
            if (ytcVar == null) {
                ytcVar = null;
            }
            CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) ytcVar.getCameraApi();
            cameraxCameraApiView.getClass();
            wqi.c(CameraxCameraApiView.class.getName(), "destroyCamera", new Object[0]);
            cameraxCameraApiView.c.w();
            p22 p22Var = cameraxCameraApiView.d;
            p22Var.getClass();
            p22Var.a(new o22(p22Var, 1));
        }
        y09 y09Var = this.a1;
        if (y09Var != null) {
            y09Var.a();
        }
        this.a1 = null;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        k18 k18Var = this.c;
        if (i == 159) {
            qsb.s((qsb) k18Var.getValue(), new s2i(this, 1), strArr, iArr, qsb.m, mvd.Y0, mvd.Z0, 192);
        } else {
            if (i != 171) {
                return;
            }
            qsb.s((qsb) k18Var.getValue(), new s2i(this, 1), strArr, iArr, qsb.h, mvd.W0, mvd.V0, 192);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yy7[] yy7VarArr = c1;
        c83 c83Var = (c83) this.Y.D(this, yy7VarArr[1]);
        ytd ytdVar = c83Var.a;
        if (!fni.a(c83Var.b(), "media_type_picker_widget")) {
            ytdVar.R(false);
            yy7 yy7Var = yy7VarArr[0];
            bud budVarA = l8j.a(new MediaTypePickerWidget(this.a, ((Number) this.b.a(this)).longValue(), null), null, null);
            budVarA.d("media_type_picker_widget");
            ytdVar.S(budVarA);
        }
        tcf tcfVar = N0().s0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(tcfVar, l48VarP, l38Var), new zu8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(N0().B0, getViewLifecycleOwner().p(), l38Var), new av8(null, this), 1), getViewLifecycleScope());
        vpi.b(new g56(new o92(N0().u0), new ev8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(N0().G0, getViewLifecycleOwner().p(), l38Var), new bv8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(N0().E0, getViewLifecycleOwner().p(), l38Var), new cv8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(N0().C0, getViewLifecycleOwner().p(), l38Var), new dv8(null, this), 1), getViewLifecycleScope());
        vpi.b(new g56(G0().c, new wu8(null, this), 1), getViewLifecycleScope());
        k18 k18Var = this.R0;
        gw0.w(new g56(aw0.a(((eb9) k18Var.getValue()).b, getViewLifecycleOwner().p(), l38Var), new yu8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((eb9) k18Var.getValue()).c, getViewLifecycleOwner().p(), l38.c), new xu8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((buc) this.y0.getValue()).w0, getViewLifecycleOwner().p(), l38Var), new vu8(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((dbe) this.T0.getValue()).d, getViewLifecycleOwner().p(), l38Var), new uu8(null, this), 1), getViewLifecycleScope());
        ytd ytdVarH0 = H0();
        f82 f82Var = (f82) this.X0.D(this, yy7VarArr[20]);
        LinearLayout linearLayoutD0 = D0();
        ou8 ou8Var = new ou8(this, 15);
        boolean z = x4j.b(getContext()).b && Build.VERSION.SDK_INT >= 30;
        v38 viewLifecycleScope = getViewLifecycleScope();
        in9 in9Var = (in9) ((hbd) N0().w0.b).a.getValue();
        this.a1 = new y09(ytdVarH0, f82Var, linearLayoutD0, ou8Var, z, viewLifecycleScope, (in9Var != null ? in9Var.a : 0) == 2, new ou8(this, 16));
        new s09((t09) this.W0.getValue(), I0()).a(getViewLifecycleScope());
        gw0.w(new g56(new d53((hbd) N0().w0.b, 12), new zr0(2, this, MediaBarWidget.class, "onToggleEmoji", "onToggleEmoji(Lone/me/sdk/messagewrite/MessageWriteEvent$ToggleEmoji;)V", 4, 21), 1), getViewLifecycleScope());
    }

    public MediaBarWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        vf2.b.getClass();
        this.a = oi4.a(vf2.c.a);
        this.b = new hs(Long.class, "chat_id");
        this.c = rsb.a.a();
        uv2 uv2Var = uv2.a;
        this.d = (gda) uv2Var.getAccessor().c(151);
        this.o = (sd8) uv2Var.getAccessor().c(493);
        this.X = new IntEvaluator();
        this.Y = childSlotRouter(iyc.media_bar__bottom_container);
        this.Z = childSlotRouter(iyc.media_bar__primary_container);
        this.s0 = viewBinding(iyc.media_bar__popup_layout);
        this.u0 = binding(new ou8(this, 9));
        this.v0 = binding(new ou8(this, 1));
        this.w0 = binding(new ou8(this, 2));
        this.x0 = binding(new ou8(this, 3));
        this.y0 = createViewModelLazy(buc.class, new iv8(0, new c38(14)));
        this.z0 = childSlotRouter(iyc.media_bar__partial_media_access_container);
        this.A0 = binding(new ou8(this, 4));
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        colorDrawable.setAlpha(0);
        this.B0 = colorDrawable;
        this.C0 = binding(new ou8(this, 5));
        this.G0 = binding(new ou8(this, 6));
        this.H0 = binding(new ou8(this, 7));
        this.I0 = binding(new ou8(this, 8));
        this.J0 = binding(new ou8(this, 14));
        this.K0 = new ls0(1, vw4.d().getDisplayMetrics().density * 12.0f);
        ColorDrawable colorDrawable2 = new ColorDrawable(-16777216);
        colorDrawable2.setAlpha(0);
        this.L0 = colorDrawable2;
        this.N0 = binding(new ou8(this, 17));
        this.O0 = binding(new ou8(this, 18));
        this.P0 = binding(new ou8(this, 19));
        ipi.b(3, new ou8(this, 20));
        this.Q0 = createViewModelLazy(mp6.class, new iv8(1, new ou8(this, 21)));
        this.R0 = createViewModelLazy(eb9.class, new iv8(2, new c38(15)));
        Object objA = yvi.a(bundle, "scope_id", b1e.class);
        if (objA != null) {
            this.S0 = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, mu8.class, null);
            this.T0 = createViewModelLazy(dbe.class, new iv8(3, new c38(16)));
            this.U0 = childSlotRouter(m1b.F);
            this.V0 = binding(new ou8(this, 0));
            Object objA2 = yvi.a(bundle, "scope_id", b1e.class);
            if (objA2 != null) {
                this.W0 = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA2)).a, t09.class, null);
                int i = m1b.D;
                this.X0 = viewBinding(i);
                this.Y0 = Widget.childRouter$default(this, i, null, 2, null);
                this.Z0 = new og6(this, 1);
                return;
            }
            throw new IllegalArgumentException(ho7.i("No value passed for key scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }
}
