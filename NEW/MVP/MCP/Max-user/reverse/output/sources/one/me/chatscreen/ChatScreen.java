package one.me.chatscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.api;
import defpackage.ari;
import defpackage.av2;
import defpackage.avd;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b04;
import defpackage.b6g;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bda;
import defpackage.bud;
import defpackage.bv2;
import defpackage.bvf;
import defpackage.bw2;
import defpackage.bx2;
import defpackage.c54;
import defpackage.c6e;
import defpackage.c83;
import defpackage.ccb;
import defpackage.cf8;
import defpackage.ci5;
import defpackage.ct8;
import defpackage.cv2;
import defpackage.cv9;
import defpackage.cw2;
import defpackage.d53;
import defpackage.dj6;
import defpackage.dqi;
import defpackage.ds9;
import defpackage.du8;
import defpackage.dv2;
import defpackage.dx2;
import defpackage.eo7;
import defpackage.es0;
import defpackage.eu2;
import defpackage.eud;
import defpackage.ev2;
import defpackage.f1e;
import defpackage.f82;
import defpackage.fbb;
import defpackage.fed;
import defpackage.fni;
import defpackage.fp8;
import defpackage.fu2;
import defpackage.fv2;
import defpackage.g44;
import defpackage.g56;
import defpackage.gda;
import defpackage.gu2;
import defpackage.gu5;
import defpackage.gv2;
import defpackage.gw0;
import defpackage.gy2;
import defpackage.h54;
import defpackage.hbd;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hv2;
import defpackage.hx2;
import defpackage.i54;
import defpackage.i84;
import defpackage.in9;
import defpackage.ipi;
import defpackage.iu2;
import defpackage.iv2;
import defpackage.j5j;
import defpackage.jv2;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k8j;
import defpackage.ka5;
import defpackage.kcb;
import defpackage.kj1;
import defpackage.ku2;
import defpackage.kv2;
import defpackage.l38;
import defpackage.l48;
import defpackage.l6b;
import defpackage.l8j;
import defpackage.ld0;
import defpackage.lg8;
import defpackage.lu2;
import defpackage.lv2;
import defpackage.lzf;
import defpackage.m1b;
import defpackage.m6c;
import defpackage.mqf;
import defpackage.ms0;
import defpackage.mu8;
import defpackage.n31;
import defpackage.n5g;
import defpackage.nn9;
import defpackage.no9;
import defpackage.nu2;
import defpackage.nv2;
import defpackage.oc3;
import defpackage.on9;
import defpackage.oq3;
import defpackage.ou2;
import defpackage.ozb;
import defpackage.pb2;
import defpackage.q2b;
import defpackage.qcb;
import defpackage.qk8;
import defpackage.qq3;
import defpackage.qu2;
import defpackage.qw2;
import defpackage.rk8;
import defpackage.rmi;
import defpackage.rt5;
import defpackage.ru2;
import defpackage.sd8;
import defpackage.sr9;
import defpackage.su2;
import defpackage.svi;
import defpackage.t09;
import defpackage.tcf;
import defpackage.tl2;
import defpackage.toc;
import defpackage.tu2;
import defpackage.tv2;
import defpackage.tzb;
import defpackage.udd;
import defpackage.ue3;
import defpackage.uf2;
import defpackage.uu2;
import defpackage.uv2;
import defpackage.uw2;
import defpackage.v38;
import defpackage.vf6;
import defpackage.vid;
import defpackage.wqi;
import defpackage.wv2;
import defpackage.x4j;
import defpackage.xfh;
import defpackage.xz7;
import defpackage.y09;
import defpackage.yfb;
import defpackage.yh5;
import defpackage.ys;
import defpackage.ys0;
import defpackage.ytd;
import defpackage.yu2;
import defpackage.yx1;
import defpackage.yx2;
import defpackage.yy7;
import defpackage.z41;
import defpackage.z7;
import defpackage.z8a;
import defpackage.zb2;
import defpackage.zfi;
import defpackage.znf;
import defpackage.zr0;
import defpackage.zs8;
import defpackage.zu2;
import defpackage.zud;
import defpackage.zx2;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/ChatScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lg44;", "Lqq3;", "Ldj6;", "Ltzb;", "", "Lcv9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatScreen extends SwipeWidget implements g44, qq3, dj6, tzb, cv9 {
    public static final /* synthetic */ yy7[] l1 = {new toc(ChatScreen.class, "unspecifiedChatId", "getUnspecifiedChatId()J", 0), ho7.d(vid.a, ChatScreen.class, "type", "getType()Lone/me/chatscreen/deeplink/ChatDeepLinkRoutes$Type;", 0), new toc(ChatScreen.class, "openSearchField", "getOpenSearchField()Z", 0), new toc(ChatScreen.class, "startPayload", "getStartPayload()Ljava/lang/String;", 0), new z8a(ChatScreen.class, "forwardChatId", "getForwardChatId()Ljava/lang/Long;"), new z8a(ChatScreen.class, "forwardMessageIds", "getForwardMessageIds()[J"), new z8a(ChatScreen.class, "forwardAttachId", "getForwardAttachId()Ljava/lang/Long;"), new z8a(ChatScreen.class, "isForwardAttach", "isForwardAttach()Z"), new toc(ChatScreen.class, "messagesContainer", "getMessagesContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(ChatScreen.class, "messagesRouter", "getMessagesRouter()Lcom/bluelinelabs/conductor/Router;", 0), new toc(ChatScreen.class, "bottomContainer", "getBottomContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(ChatScreen.class, "bottomRouter", "getBottomRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(ChatScreen.class, "mediaBarContainer", "getMediaBarContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(ChatScreen.class, "mediaBarRouter", "getMediaBarRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(ChatScreen.class, "mediaKeyboardContainer", "getMediaKeyboardContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(ChatScreen.class, "mediaKeyboardRouter", "getMediaKeyboardRouter()Lcom/bluelinelabs/conductor/Router;", 0), new toc(ChatScreen.class, "chatMainContainer", "getChatMainContainer()Landroid/widget/LinearLayout;", 0), new toc(ChatScreen.class, "videoMsgContainer", "getVideoMsgContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new toc(ChatScreen.class, "videoMsgRouter", "getVideoMsgRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(ChatScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChatScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0), new toc(ChatScreen.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new toc(ChatScreen.class, "chatBackground", "getChatBackground()Landroid/view/View;", 0), new toc(ChatScreen.class, "suggestionsContainer", "getSuggestionsContainer()Landroid/view/ViewGroup;", 0), new toc(ChatScreen.class, "suggestionsRouter", "getSuggestionsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final hs A0;
    public boolean B0;
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final k18 F0;
    public final eu2 G0;
    public final k18 H0;
    public final k18 I0;
    public final k18 J0;
    public final k18 K0;
    public final k18 L0;
    public final String M0;
    public final bbd N0;
    public final bbd O0;
    public final bbd P0;
    public final bbd Q0;
    public final bbd R0;
    public final bbd S0;
    public final bbd T0;
    public final bbd U0;
    public y09 V0;
    public final bbd W0;
    public final yx1 X;
    public final bbd X0;
    public final k18 Y;
    public final bbd Y0;
    public final k18 Z;
    public final k18 Z0;
    public final qk8 a1;
    public final bbd b1;
    public final bbd c1;
    public final ka5 d;
    public final bbd d1;
    public final bbd e1;
    public final bbd f1;
    public final bbd g1;
    public final Object h1;
    public final Object i1;
    public bcb j1;
    public Bundle k1;
    public final gda o;
    public final oc3 s0;
    public final hs t0;
    public final hs u0;
    public final hs v0;
    public final hs w0;
    public final hs x0;
    public final hs y0;
    public final hs z0;

    public ChatScreen(Bundle bundle) {
        super(bundle);
        int i = 0;
        int i2 = 14;
        this.d = new ka5(new eu2(this, i), new eu2(this, i2), 4);
        uv2 uv2Var = uv2.a;
        this.o = (gda) uv2Var.getAccessor().c(151);
        this.X = (yx1) uv2Var.getAccessor().c(156);
        k18 k18Var = tv2.a;
        this.Y = uv2Var.getAccessor().d(48);
        this.Z = uv2Var.getAccessor().d(47);
        int i3 = 1;
        this.s0 = new oc3(i3, this);
        this.t0 = new hs(Long.class, "id");
        this.u0 = new hs(uf2.class, "type");
        Boolean bool = Boolean.FALSE;
        this.v0 = new hs(Boolean.class, bool, "open_search_field");
        this.w0 = new hs(String.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.x0 = new hs(Long.class, null, "forward_cht_id");
        this.y0 = new hs(long[].class, null, "forward_msg_ids");
        this.z0 = new hs(Long.class, null, "forward_attach_id");
        this.A0 = new hs(Boolean.class, bool, "is_forward_attach");
        this.B0 = true;
        int i4 = 15;
        this.C0 = createViewModelLazy(zx2.class, new tl2(11, new eu2(this, i4)));
        int i5 = 16;
        int i6 = 12;
        this.D0 = createViewModelLazy(no9.class, new tl2(i6, new eu2(this, i5)));
        int i7 = 17;
        int i8 = 13;
        this.E0 = createViewModelLazy(mu8.class, new tl2(i8, new eu2(this, i7)));
        this.F0 = createViewModelLazy(ds9.class, new tl2(i2, new zb2(28)));
        this.G0 = new eu2(this, i3);
        this.H0 = createViewModelLazy(mqf.class, new tl2(i4, new eu2(this, 2)));
        this.I0 = createViewModelLazy(fp8.class, new tl2(i5, new zb2(29)));
        this.J0 = createViewModelLazy(t09.class, new tl2(i7, new fu2(i)));
        this.K0 = createViewModelLazy(c6e.class, new tl2(18, new eu2(this, 7)));
        int i9 = 10;
        createViewModelLazy(ozb.class, new tl2(19, new eu2(this, i9)));
        this.L0 = createViewModelLazy(fed.class, new tl2(i9, new eu2(this, i6)));
        this.M0 = "ChatScreen";
        int i10 = m1b.k;
        this.N0 = viewBinding(i10);
        this.O0 = Widget.childRouter$default(this, i10, null, 2, null);
        int i11 = m1b.b;
        this.P0 = viewBinding(i11);
        this.Q0 = childSlotRouter(i11);
        int i12 = m1b.i;
        this.R0 = viewBinding(i12);
        this.S0 = childSlotRouter(i12);
        int i13 = m1b.j;
        this.T0 = viewBinding(i13);
        this.U0 = Widget.childRouter$default(this, i13, null, 2, null);
        this.W0 = viewBinding(m1b.h);
        int i14 = m1b.p;
        this.X0 = viewBinding(i14);
        this.Y0 = childSlotRouter(i14);
        this.Z0 = uv2Var.getAccessor().d(476);
        this.a1 = new qk8();
        this.b1 = viewBinding(m1b.o);
        this.c1 = viewBinding(m1b.m);
        this.d1 = viewBinding(m1b.l);
        this.e1 = viewBinding(m1b.a);
        int i15 = m1b.n;
        this.f1 = viewBinding(i15);
        this.g1 = childSlotRouter(i15);
        this.h1 = ipi.b(3, new eu2(this, i8));
        this.i1 = ipi.b(3, new fu2(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H0(one.me.chatscreen.ChatScreen r10, defpackage.gn9 r11) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.H0(one.me.chatscreen.ChatScreen, gn9):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I0(one.me.chatscreen.ChatScreen r2, defpackage.yfb r3, boolean r4) {
        /*
            android.widget.TextView r2 = r3.getTitle()
            float r2 = defpackage.b6g.e(r2)
            int r2 = defpackage.kpi.r(r2)
            r0 = 0
            if (r4 == 0) goto L20
            android.widget.TextView r1 = r3.getTitle()
            xzg r1 = defpackage.b6g.a(r1)
            if (r1 == 0) goto L1c
            int r1 = r1.a
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 != r2) goto L20
            return
        L20:
            if (r4 == 0) goto L3c
            android.widget.TextView r4 = r3.getTitle()
            xzg r4 = defpackage.b6g.a(r4)
            if (r4 == 0) goto L2e
            int r0 = r4.a
        L2e:
            if (r0 == r2) goto L3c
            xzg r4 = new xzg
            android.content.Context r0 = r3.getContext()
            lcj r1 = defpackage.lcj.d
            r4.<init>(r0, r2, r1)
            goto L3d
        L3c:
            r4 = 0
        L3d:
            android.widget.TextView r2 = r3.getTitle()
            defpackage.b6g.d(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.ChatScreen.I0(one.me.chatscreen.ChatScreen, yfb, boolean):void");
    }

    public static final void J0(ChatScreen chatScreen, ys0 ys0Var) {
        String str = chatScreen.M0;
        int iOrdinal = ys0Var.ordinal();
        if (iOrdinal == 0) {
            c83 c83VarR0 = chatScreen.R0();
            ytd ytdVar = c83VarR0.a;
            if (fni.a(c83VarR0.b(), "write_controller")) {
                return;
            }
            ytdVar.R(false);
            bud budVarA = l8j.a(new MessageWriteWidget(str, null), null, null);
            budVarA.d("write_controller");
            ytdVar.S(budVarA);
            return;
        }
        if (iOrdinal == 1) {
            c83 c83VarR02 = chatScreen.R0();
            ytd ytdVar2 = c83VarR02.a;
            if (fni.a(c83VarR02.b(), "search_bar_controller")) {
                return;
            }
            ytdVar2.R(false);
            bud budVarA2 = l8j.a(new SearchMessageBottomWidget(str, null), null, null);
            budVarA2.d("search_bar_controller");
            ytdVar2.S(budVarA2);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        gy2 gy2Var = (gy2) chatScreen.g1().f1.a.getValue();
        if (gy2Var == null) {
            return;
        }
        if (gy2Var == gy2.X) {
            chatScreen.R0().a();
            chatScreen.P0().removeAllViews();
            return;
        }
        c83 c83VarR03 = chatScreen.R0();
        ytd ytdVar3 = c83VarR03.a;
        if (fni.a(c83VarR03.b(), "unblock_contact_controller_tag")) {
            return;
        }
        ytdVar3.R(false);
        bud budVarA3 = l8j.a(new ChatStatusBottomWidget(str, gy2Var, null), null, null);
        budVarA3.d("unblock_contact_controller_tag");
        ytdVar3.S(budVarA3);
    }

    public static void l1(ChatScreen chatScreen, Integer num, String str, Integer num2, Integer num3, int i) {
        String strE = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if (str == null) {
            if (num != null) {
                str = z7.e(chatScreen.getContext(), num.intValue());
            } else {
                str = null;
            }
            if (str == null) {
                return;
            }
        }
        if (num2 != null) {
            strE = z7.e(chatScreen.getContext(), num2.intValue());
        }
        bcb bcbVar = chatScreen.j1;
        if (bcbVar != null) {
            bcbVar.a();
        }
        ccb ccbVar = new ccb(chatScreen);
        ccbVar.h(str);
        ccbVar.b(strE);
        ccbVar.c(new kcb(0, 0, chatScreen.Q0(), 3));
        if (num3 != null) {
            ccbVar.e(new qcb(num3.intValue()));
        }
        chatScreen.j1 = ccbVar.i();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void B0() {
        i1();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        pb2 pb2Var;
        if (i == zud.L0) {
            b1().d();
            return;
        }
        if (i == zud.K0) {
            g1().C();
            return;
        }
        if (i == zud.J0) {
            zx2 zx2VarG1 = g1();
            zx2VarG1.getClass();
            xfh.o(zx2VarG1, null, new yx2(zx2VarG1, null), 3);
            return;
        }
        if (i == zud.H0) {
            if (bundle != null) {
                long j = bundle.getLong("chat_server_id");
                wv2.c.p0().b(":settings/folder/by-chat?id=" + j, null);
                return;
            }
            return;
        }
        if (i == zud.M0) {
            zx2 zx2VarG12 = g1();
            svi.e(zx2VarG12.a, ((q2b) zx2VarG12.y()).b(), null, new hx2(zx2VarG12, null), 2);
            return;
        }
        if (i == zud.N0) {
            pb2 pb2Var2 = (pb2) g1().a1.a.getValue();
            if (pb2Var2 != null) {
                long j2 = pb2Var2.a;
                wv2.c.p0().b(":profile/invite?id=" + j2, null);
                return;
            }
            return;
        }
        if (i != zud.I0 || (pb2Var = (pb2) g1().a1.a.getValue()) == null) {
            return;
        }
        long j3 = pb2Var.a;
        wv2.c.p0().b(":complaint?ids=" + j3, null);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void D0() {
        api.c(this);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long F0() {
        return 400L;
    }

    public final void K0() {
        N0(c1());
        L0(P0());
        M0((f82) this.N0.D(this, l1[8]));
        O0(f1());
    }

    public final void L0(f82 f82Var) {
        if (h1()) {
            zfi.b(f82Var, new eo7(0, new ms0(4, 2, true), 7), null);
        }
    }

    public final void M0(f82 f82Var) {
        if (h1()) {
            zfi.b(f82Var, new eo7(0, new ms0(1, 2, true), 7), null);
        }
    }

    public final void N0(ViewGroup viewGroup) {
        if (h1()) {
            zfi.b(viewGroup, new eo7(0, new ms0(4, 2, true), 7), null);
        }
    }

    public final void O0(f82 f82Var) {
        if (h1()) {
            zfi.b(f82Var, new eo7(0, new ms0(4, 2, true), 7), null);
        }
    }

    public final f82 P0() {
        return (f82) this.P0.D(this, l1[10]);
    }

    public final int Q0() {
        y09 y09Var = this.V0;
        if (y09Var != null && y09Var.l) {
            return P0().getMeasuredHeight();
        }
        int measuredHeight = P0().getMeasuredHeight() - P0().getPaddingBottom();
        Integer numH = dqi.h(P0());
        return measuredHeight + (numH != null ? numH.intValue() : 0);
    }

    public final c83 R0() {
        return (c83) this.Q0.D(this, l1[11]);
    }

    public final f1e S0() {
        bud budVar = (bud) ue3.Q(getRouter().e());
        Object obj = budVar != null ? budVar.a : null;
        c54 c54VarB = k8j.b(U0().a);
        if (!fni.a(obj, this) && (obj instanceof bda)) {
            return ((bda) obj).n();
        }
        if (c54VarB instanceof MediaBarWidget) {
            MediaBarWidget mediaBarWidget = (MediaBarWidget) c54VarB;
            if (mediaBarWidget.getViewLifecycleOwner().p().d.compareTo(l38.d) >= 0 && mediaBarWidget.J0().getScrollState() != m6c.a) {
                return mediaBarWidget.n();
            }
        }
        return f1e.CHAT;
    }

    public final f82 T0() {
        return (f82) this.R0.D(this, l1[12]);
    }

    public final c83 U0() {
        return (c83) this.S0.D(this, l1[13]);
    }

    public final no9 V0() {
        return (no9) this.D0.getValue();
    }

    public final MessageWriteWidget W0() {
        c54 c54VarB = k8j.b(R0().a);
        if (c54VarB instanceof MessageWriteWidget) {
            return (MessageWriteWidget) c54VarB;
        }
        return null;
    }

    @Override // defpackage.dj6
    public final void X(int i, int i2, Intent intent) {
        if (i == 371) {
            if (intent != null) {
                cf8 cf8Var = (cf8) rmi.b(intent, "LocationMapScreen.result.locationData", cf8.class);
                float floatExtra = intent.getFloatExtra("LocationMapScreen.result.zoom", 0.0f);
                long longExtra = intent.getLongExtra("LocationMapScreen.result.livePeriod", 0L);
                if (cf8Var != null) {
                    zx2 zx2VarG1 = g1();
                    Long lZ = V0().z();
                    on9 on9VarY = V0().y();
                    zx2VarG1.G(cf8Var, floatExtra, longExtra, lZ, on9VarY != null ? on9VarY.a() : null);
                    c54 c54VarB = k8j.b(U0().a);
                    MediaBarWidget mediaBarWidget = c54VarB instanceof MediaBarWidget ? (MediaBarWidget) c54VarB : null;
                    if (mediaBarWidget == null || mediaBarWidget.getView() == null) {
                        return;
                    }
                    mediaBarWidget.J0().j(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 372) {
            if (i != 1001) {
                if (i == 1010 && i2 == -1) {
                    ((mu8) this.E0.getValue()).u0.g(new zs8(false));
                    return;
                }
                return;
            }
            cf8 cf8Var2 = (cf8) (intent == null ? null : rmi.b(intent, "location_data", cf8.class));
            Float fValueOf = intent != null ? Float.valueOf(intent.getFloatExtra("zoom", 0.0f)) : null;
            if (cf8Var2 == null || fValueOf == null) {
                return;
            }
            zx2 zx2VarG12 = g1();
            float fFloatValue = fValueOf.floatValue();
            Long lZ2 = V0().z();
            on9 on9VarY2 = V0().y();
            zx2VarG12.G(cf8Var2, fFloatValue, 0L, lZ2, on9VarY2 != null ? on9VarY2.a() : null);
            return;
        }
        b04 b04Var = intent != null ? (b04) rmi.b(intent, "contacts.picker.result.key", b04.class) : null;
        if (b04Var != null) {
            zx2 zx2VarG13 = g1();
            ArrayList arrayList = b04Var.a;
            ArrayList arrayList2 = b04Var.b;
            Long lZ3 = V0().z();
            on9 on9VarY3 = V0().y();
            vf6 vf6VarA = on9VarY3 != null ? on9VarY3.a() : null;
            pb2 pb2Var = (pb2) zx2VarG13.a1.a.getValue();
            if (pb2Var != null) {
                zx2VarG13.P0.O(zx2VarG13, zx2.h1[3], svi.d(zx2VarG13.a, ((q2b) zx2VarG13.y()).b(), i84.b, new dx2(zx2VarG13, pb2Var.a, lZ3, arrayList, arrayList2, vf6VarA, null)));
            }
            c54 c54VarB2 = k8j.b(U0().a);
            MediaBarWidget mediaBarWidget2 = c54VarB2 instanceof MediaBarWidget ? (MediaBarWidget) c54VarB2 : null;
            if (mediaBarWidget2 == null || mediaBarWidget2.getView() == null) {
                return;
            }
            mediaBarWidget2.J0().j(true);
        }
    }

    public final ds9 X0() {
        return (ds9) this.F0.getValue();
    }

    @Override // defpackage.zuf
    public final boolean Y() {
        return ((gu5) ((rt5) this.Y.getValue())).y() && this.B0;
    }

    public final ytd Y0() {
        return (ytd) this.O0.D(this, l1[9]);
    }

    public final fed Z0() {
        return (fed) this.L0.getValue();
    }

    public final c6e a1() {
        return (c6e) this.K0.getValue();
    }

    public final fbb b1() {
        return (fbb) this.c1.D(this, l1[20]);
    }

    public final ViewGroup c1() {
        return (ViewGroup) this.f1.D(this, l1[23]);
    }

    public final c83 d1() {
        return (c83) this.g1.D(this, l1[24]);
    }

    public final yfb e1() {
        return (yfb) this.b1.D(this, l1[19]);
    }

    public final f82 f1() {
        return (f82) this.X0.D(this, l1[17]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (((kj1) this.h1.getValue()).g(i)) {
            return;
        }
        zx2 zx2VarG1 = g1();
        ci5 ci5Var = zx2VarG1.d1;
        if (i == m1b.r) {
            xfh.r(ci5Var, cw2.a);
            return;
        }
        if (i == m1b.t || i == m1b.u) {
            pb2 pb2Var = (pb2) zx2VarG1.a1.a.getValue();
            if (pb2Var != null) {
                xfh.o(zx2VarG1, ((q2b) zx2VarG1.y()).b(), new uw2(zx2VarG1, pb2Var.a, null), 2);
                return;
            }
            return;
        }
        if (i == zud.p0 || i == zud.q0 || i == zud.o0 || i == zud.r0) {
            svi.e(zx2VarG1.a, null, null, new qw2(zx2VarG1, i, null), 3);
        } else if (i == zud.t0) {
            xfh.r(ci5Var, new bw2(bundle != null ? bundle.getBoolean("forward_cancel_stay_on_screen") : false));
        }
    }

    public final zx2 g1() {
        return (zx2) this.C0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getB() {
        return this.M0;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.d;
    }

    public final boolean h1() {
        return x4j.b(getContext()).b && Build.VERSION.SDK_INT >= 30;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.c54
    public final boolean handleBack() {
        if (getView() != null && e1().b()) {
            xfh.r(X0().Z, sr9.a);
            return true;
        }
        fed fedVarZ0 = Z0();
        if (((Boolean) fedVarZ0.Y.getValue()).booleanValue()) {
            xfh.r(fedVarZ0.d, udd.a);
            return true;
        }
        if (V0().y() != null) {
            j1(false);
            return true;
        }
        View view = getView();
        if (view != null) {
            view.requestApplyInsets();
        }
        return super.handleBack();
    }

    public final void i1() {
        zx2 zx2VarG1 = g1();
        CharSequence charSequence = V0().W0;
        Long lZ = V0().z();
        Long lX = V0().x();
        String name = zx2.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            zx2VarG1.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "save draft, textLength:" + (charSequence != null ? Integer.valueOf(charSequence.length()) : null), null);
            }
        }
        zx2VarG1.V0.O(zx2VarG1, zx2.h1[9], svi.d(zx2VarG1.a, ((q2b) zx2VarG1.y()).b(), i84.b, new bx2(zx2VarG1, charSequence, lZ, lX, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j1(boolean z) {
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        n5g n5gVar = new n5g(avd.q0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("forward_cancel_stay_on_screen", z);
        oq3 oq3VarA = j5j.a(n5gVar, bundle, null, 4);
        oq3VarA.b(zud.t0, new n5g(avd.p0));
        oq3VarA.c(zud.s0, new n5g(avd.o0));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
        confirmationBottomSheetE.setTargetController(this);
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(this);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }

    public final void k1() {
        pb2 pb2Var = (pb2) g1().a1.a.getValue();
        if (pb2Var != null) {
            long j = pb2Var.a;
            MessageWriteWidget messageWriteWidgetW0 = W0();
            if (messageWriteWidgetW0 != null) {
                messageWriteWidgetW0.k();
            }
            T0().setVisibility(0);
            if (h1()) {
                hfh.p(c1(), null);
                hfh.p(P0(), null);
                hfh.p((f82) this.N0.D(this, l1[8]), null);
                hfh.p(f1(), null);
            }
            y09 y09Var = this.V0;
            if (y09Var != null && y09Var.l) {
                no9.B(V0(), true, 2);
            }
            c83 c83VarU0 = U0();
            ytd ytdVar = c83VarU0.a;
            if (!fni.a(c83VarU0.b(), "media_bar_controller")) {
                ytdVar.R(false);
                MediaBarWidget mediaBarWidget = new MediaBarWidget(this.M0, j, null);
                mediaBarWidget.b1 = this;
                bud budVarA = l8j.a(mediaBarWidget, null, null);
                budVarA.d("media_bar_controller");
                ytdVar.S(budVarA);
            }
            mu8 mu8Var = (mu8) this.E0.getValue();
            Long l = (Long) mu8Var.b.invoke();
            if (l == null) {
                mu8Var.u0.g(ct8.a);
                return;
            }
            mu8Var.H0.O(mu8Var, mu8.J0[0], svi.d(mu8Var.a, ((q2b) ((lzf) mu8Var.X.getValue())).b(), i84.b, new du8(mu8Var, l, null)));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        ((rk8) this.Z0.getValue()).a(this.a1);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        if (isAttached()) {
            ((rk8) this.Z0.getValue()).b(this.a1);
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new es0(5, this));
        } else if (b6g.c(e1().getTitle())) {
            I0(this, e1(), true);
        }
        getRouter().a(this.s0);
        Bundle bundle = this.k1;
        if (bundle == null) {
            return;
        }
        this.k1 = null;
        onUpdateArgs(getArgs().deepCopy(), bundle);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        i54 i54Var2 = i54.POP_ENTER;
        k18 k18Var = this.Z0;
        qk8 qk8Var = this.a1;
        if (i54Var == i54Var2 || i54Var == i54.PUSH_ENTER) {
            ((rk8) k18Var.getValue()).b(qk8Var);
            return;
        }
        if (i54Var == i54.PUSH_EXIT) {
            if (getView() != null) {
                int i = xz7.a;
                if (xz7.b(xz7.c)) {
                    api.d(requireActivity());
                }
            }
            a1().t();
            ((rk8) k18Var.getValue()).a(qk8Var);
        }
    }

    @Override // defpackage.c54
    public final void onContextAvailable(Context context) {
        gw0.w(new g56(g1().g1, new uu2(null, this), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gu2 gu2Var = new gu2(this, 0);
        bvf bvfVar = new bvf(getContext());
        bvfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        gu2Var.invoke(bvfVar);
        return bvfVar;
    }

    @Override // defpackage.c54
    public final void onDestroy() {
        ((sd8) uv2.a.getAccessor().c(493)).f.j = null;
        super.onDestroy();
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        Drawable background = ((View) this.e1.D(this, l1[22])).getBackground();
        if (background != null) {
            background.setCallback(null);
        }
        this.j1 = null;
        y09 y09Var = this.V0;
        if (y09Var != null) {
            y09Var.a();
        }
        this.V0 = null;
        this.a1.b();
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        i1();
        getRouter().L(this.s0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ((kj1) this.h1.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        nn9 nn9Var;
        Object value;
        super.onUpdateArgs(bundle, bundle2);
        if (!isAttached()) {
            if (bundle.equals(bundle2)) {
                return;
            }
            this.k1 = bundle2;
            return;
        }
        Long lD = l8j.d("forward_cht_id", bundle2);
        yy7[] yy7VarArr = l1;
        yy7 yy7Var = yy7VarArr[4];
        this.x0.b(this, lD);
        long[] jArrE = l8j.e("forward_msg_ids", bundle2);
        yy7 yy7Var2 = yy7VarArr[5];
        hs hsVar = this.y0;
        hsVar.b(this, jArrE);
        Long lD2 = l8j.d("forward_attach_id", bundle2);
        yy7 yy7Var3 = yy7VarArr[6];
        hs hsVar2 = this.z0;
        hsVar2.b(this, lD2);
        Boolean boolB = l8j.b("is_forward_attach", bundle2);
        boolean zBooleanValue = boolB != null ? boolB.booleanValue() : false;
        yy7 yy7Var4 = yy7VarArr[7];
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        hs hsVar3 = this.A0;
        hsVar3.b(this, boolValueOf);
        yy7 yy7Var5 = yy7VarArr[5];
        long[] jArr = (long[]) hsVar.a(this);
        if (jArr != null) {
            Set setE = ys.E(jArr);
            yy7 yy7Var6 = yy7VarArr[6];
            Long l = (Long) hsVar2.a(this);
            yy7 yy7Var7 = yy7VarArr[7];
            nn9Var = new nn9(setE, l, ((Boolean) hsVar3.a(this)).booleanValue());
        } else {
            nn9Var = null;
        }
        tcf tcfVar = V0().P0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, nn9Var));
        String string = bundle2.getString(ApiProtocol.PARAM_PAYLOAD);
        if (string != null) {
            zx2 zx2VarG1 = g1();
            zx2VarG1.b = string;
            zx2VarG1.E();
        }
        bud budVar = (bud) ue3.Q(Y0().e());
        c54 c54Var = budVar != null ? budVar.a : null;
        MessagesListWidget messagesListWidget = c54Var instanceof MessagesListWidget ? (MessagesListWidget) c54Var : null;
        if (messagesListWidget != null) {
            Bundle bundleDeepCopy = messagesListWidget.getArgs().deepCopy();
            if (bundle2.containsKey("from_forward")) {
                messagesListWidget.getArgs().putBoolean("ARG_SKIP_UNREAD_DECOR", l8j.f("from_forward", bundle2));
                messagesListWidget.onUpdateArgs(bundleDeepCopy, messagesListWidget.getArgs());
            }
            if (bundle2.containsKey("message_id")) {
                Bundle args = messagesListWidget.getArgs();
                Object obj = bundle2.get("message_id");
                args.putString("ARG_LOAD_MESSAGE_ID", obj != null ? obj.toString() : null);
                messagesListWidget.onUpdateArgs(bundleDeepCopy, messagesListWidget.getArgs());
                return;
            }
            if (bundle2.containsKey("load_mark")) {
                Bundle args2 = messagesListWidget.getArgs();
                Object obj2 = bundle2.get("load_mark");
                args2.putString("ARG_LOAD_MARK", obj2 != null ? obj2.toString() : null);
                messagesListWidget.onUpdateArgs(bundleDeepCopy, messagesListWidget.getArgs());
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        in9 in9Var;
        Continuation continuation = null;
        int i = 3;
        svi.e(getViewLifecycleScope(), null, null, new ru2(null, this), 3);
        yy7[] yy7VarArr = l1;
        ytd ytdVar = (ytd) this.U0.D(this, yy7VarArr[15]);
        f82 f82Var = (f82) this.T0.D(this, yy7VarArr[14]);
        f82 f82VarP0 = P0();
        eu2 eu2Var = new eu2(this, 3);
        boolean zH1 = h1();
        v38 viewLifecycleScope = getViewLifecycleScope();
        yh5 yh5Var = (yh5) V0().A0.a.getValue();
        this.V0 = new y09(ytdVar, f82Var, f82VarP0, eu2Var, zH1, viewLifecycleScope, ((yh5Var == null || (in9Var = (in9) yh5Var.a) == null) ? 0 : in9Var.a) == 2, new eu2(this, 4));
        k18 k18Var = this.J0;
        hbd hbdVar = ((t09) k18Var.getValue()).Y;
        gw0.w(new nu2(new g56(new d53(hbdVar, 12), new lu2(hbdVar, null, this), 1), 0), getViewLifecycleScope());
        gw0.w(new g56(((t09) k18Var.getValue()).o, new zr0(2, this, ChatScreen.class, "handleMediaKeyboardEvents", "handleMediaKeyboardEvents(Lone/me/sdk/arch/event/Event;)V", 4, 11), 1), getViewLifecycleScope());
        hbd hbdVar2 = V0().C0;
        gw0.w(new nu2(new g56(new d53(hbdVar2, 12), new ou2(hbdVar2, null, this), 1), 1), getViewLifecycleScope());
        hbd hbdVar3 = V0().A0;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(new d53(aw0.a(hbdVar3, l48VarP, l38Var), 12), new qu2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(a1().Y, new iu2(null, this), 1), getViewLifecycleScope());
        svi.e(getViewLifecycleScope(), null, null, new ku2(null, this), 3);
        yy7 yy7Var = yy7VarArr[2];
        hs hsVar = this.v0;
        if (((Boolean) hsVar.a(this)).booleanValue()) {
            c6e c6eVarA1 = a1();
            yy7 yy7Var2 = yy7VarArr[2];
            c6eVarA1.u(((Boolean) hsVar.a(this)).booleanValue());
            getArgs().remove("open_search_field");
        }
        gw0.w(new g56(aw0.a(gw0.m(new z41(g1().e1, a1().X, new ld0(i, continuation, 7), 3)), getViewLifecycleOwner().p(), l38Var), new tu2(null, this), 1), getViewLifecycleScope());
        wqi.c(ari.b(this), "onViewCreated: viewstate=" + getViewLifecycleOwner().p().d, new Object[0]);
        gw0.w(new g56(aw0.a(g1().Z0, getViewLifecycleOwner().p(), l38Var), new cv2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(g1().b1, getViewLifecycleOwner().p(), l38Var), new dv2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new znf(g1().d1, new nv2(null, this)), getViewLifecycleOwner().p(), l38.c), new yu2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(g1().c1, getViewLifecycleOwner().p(), l38Var), new ev2(null, this), 1), getViewLifecycleScope());
        hbd hbdVar4 = V0().G0;
        gw0.w(new nu2(new g56(new d53(hbdVar4, 12), new lv2(hbdVar4, null, this), 1), 2), getViewLifecycleScope());
        k18 k18Var2 = this.E0;
        gw0.w(new g56(aw0.a(gw0.i(((mu8) k18Var2.getValue()).t0, V0().T0, Z0().t0, new n31(4, null, 1)), getViewLifecycleOwner().p(), l38Var), new fv2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((mu8) k18Var2.getValue()).x0, getViewLifecycleOwner().p(), l38Var), new gv2(null, this), 1), getViewLifecycleScope());
        if (g1().A()) {
            gw0.w(new g56(aw0.a(V0().K0, getViewLifecycleOwner().p(), l38Var), new hv2(null, this), 1), getViewLifecycleScope());
        }
        gw0.w(new g56(aw0.a(X0().s0, getViewLifecycleOwner().p(), l38Var), new iv2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(V0().y0, getViewLifecycleOwner().p(), l38Var), new jv2(null, this), 1), getViewLifecycleScope());
        ytd childRouter = getChildRouter((ViewGroup) this.d1.D(this, yy7VarArr[21]));
        childRouter.e = 1;
        childRouter.R(false);
        if (!childRouter.n()) {
            childRouter.S(l8j.a(new PinBarsWidget(this.M0, null), null, null));
        }
        gw0.w(new g56(aw0.a(new d53(X0().Y, 12), getViewLifecycleOwner().p(), l38Var), new kv2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new d53(((fp8) this.I0.getValue()).c, 12), new zr0(2, this, ChatScreen.class, "showAddLinkBottomsheet", "showAddLinkBottomsheet(Lone/me/sdk/messagewrite/markdown/AddLinkState;)V", 4, 12), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Z0().c, getViewLifecycleOwner().p(), l38Var), new zu2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Z0().t0, getViewLifecycleOwner().p(), l38Var), new av2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Z0().Z, getViewLifecycleOwner().p(), l38Var), new bv2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new d53(((mqf) this.H0.getValue()).C0, 12), new su2(null, this), 1), getViewLifecycleScope());
    }
}
