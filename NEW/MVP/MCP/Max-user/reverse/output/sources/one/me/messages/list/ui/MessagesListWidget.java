package one.me.messages.list.ui;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a37;
import defpackage.arb;
import defpackage.aw0;
import defpackage.aw9;
import defpackage.ay9;
import defpackage.az1;
import defpackage.b19;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bs9;
import defpackage.bv9;
import defpackage.bw9;
import defpackage.bwf;
import defpackage.by9;
import defpackage.bzb;
import defpackage.bzc;
import defpackage.ccb;
import defpackage.ci9;
import defpackage.cnf;
import defpackage.csg;
import defpackage.cv9;
import defpackage.d3e;
import defpackage.d53;
import defpackage.dad;
import defpackage.ds9;
import defpackage.dx0;
import defpackage.e4c;
import defpackage.ev9;
import defpackage.evd;
import defpackage.f1h;
import defpackage.f7f;
import defpackage.fni;
import defpackage.fq9;
import defpackage.fr7;
import defpackage.fv9;
import defpackage.fvd;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gq9;
import defpackage.gqb;
import defpackage.gu5;
import defpackage.gv9;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h54;
import defpackage.hbd;
import defpackage.hd5;
import defpackage.hs;
import defpackage.hv5;
import defpackage.hvf;
import defpackage.hw0;
import defpackage.i54;
import defpackage.i84;
import defpackage.i88;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iv8;
import defpackage.j7b;
import defpackage.j98;
import defpackage.jr9;
import defpackage.js0;
import defpackage.jt9;
import defpackage.jv9;
import defpackage.k18;
import defpackage.k9d;
import defpackage.kcb;
import defpackage.kce;
import defpackage.kj1;
import defpackage.km8;
import defpackage.kv9;
import defpackage.l38;
import defpackage.l48;
import defpackage.ld0;
import defpackage.lv9;
import defpackage.m36;
import defpackage.mgb;
import defpackage.mv9;
import defpackage.n5g;
import defpackage.nm8;
import defpackage.np0;
import defpackage.ns9;
import defpackage.nv9;
import defpackage.o3;
import defpackage.okf;
import defpackage.ooi;
import defpackage.ov9;
import defpackage.p3e;
import defpackage.p6a;
import defpackage.pb2;
import defpackage.pb3;
import defpackage.pe8;
import defpackage.pv9;
import defpackage.q2b;
import defpackage.q8g;
import defpackage.qcb;
import defpackage.qk8;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.qv9;
import defpackage.r38;
import defpackage.rf2;
import defpackage.rr9;
import defpackage.rsb;
import defpackage.rv9;
import defpackage.s2i;
import defpackage.s7c;
import defpackage.sn0;
import defpackage.sv9;
import defpackage.svi;
import defpackage.t26;
import defpackage.t38;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ts9;
import defpackage.tv9;
import defpackage.u45;
import defpackage.u50;
import defpackage.u6b;
import defpackage.u7c;
import defpackage.ukd;
import defpackage.und;
import defpackage.uv9;
import defpackage.v38;
import defpackage.v3b;
import defpackage.v40;
import defpackage.v6a;
import defpackage.vid;
import defpackage.vpc;
import defpackage.vu9;
import defpackage.vv9;
import defpackage.vx9;
import defpackage.w3d;
import defpackage.wj1;
import defpackage.wu9;
import defpackage.x7j;
import defpackage.xb3;
import defpackage.xfh;
import defpackage.xrg;
import defpackage.xu9;
import defpackage.y83;
import defpackage.y9d;
import defpackage.yad;
import defpackage.yd5;
import defpackage.yn6;
import defpackage.yr9;
import defpackage.ys;
import defpackage.yu9;
import defpackage.yud;
import defpackage.yv9;
import defpackage.yw0;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zqb;
import defpackage.zr0;
import defpackage.zr9;
import defpackage.zs0;
import defpackage.zu9;
import defpackage.zv9;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0015\u0016\u0017\u0018\u0016\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014¨\u0006\u001a"}, d2 = {"Lone/me/messages/list/ui/MessagesListWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "parentScope", "", ApiProtocol.PARAM_CHAT_ID, "loadMark", "", "", "highlights", "loadMessageId", "", "shouldHighlightMessage", "shouldSkipUnreadDecoration", "(Ljava/lang/String;JJLjava/util/List;JZZLtk4;)V", "b19", "fv9", "ev9", "dv9", "cv9", "message-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MessagesListWidget extends Widget implements qq3, g44 {
    public static final /* synthetic */ yy7[] b1 = {new toc(MessagesListWidget.class, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), u45.h(vid.a, MessagesListWidget.class, "selectedMessageIdsForAction", "getSelectedMessageIdsForAction()[J"), new z8a(MessagesListWidget.class, "currentReadMark", "getCurrentReadMark()J"), new z8a(MessagesListWidget.class, "isLastMsgCompletelyVisibleOnDetach", "isLastMsgCompletelyVisibleOnDetach()Z"), new z8a(MessagesListWidget.class, "shouldSkipUnreadDecoration", "getShouldSkipUnreadDecoration()Z"), new toc(MessagesListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new toc(MessagesListWidget.class, "scrollButtonsContainer", "getScrollButtonsContainer()Lone/me/messages/list/ui/view/scroll/ScrollButtonsContainer;", 0), new toc(MessagesListWidget.class, "messagesListRecyclerViewAnalyticsListener", "getMessagesListRecyclerViewAnalyticsListener()Lone/me/messages/list/ui/recycler/MessagesListRecyclerViewAnalyticsListener;", 0), new toc(MessagesListWidget.class, "prefetchReactionsScrollListener", "getPrefetchReactionsScrollListener()Lru/ok/onechat/reactions/PrefetchReactionsScrollListener;", 0), new toc(MessagesListWidget.class, "messagesLayoutManager", "getMessagesLayoutManager()Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", 0), new toc(MessagesListWidget.class, "messagesScroller", "getMessagesScroller()Lone/me/messages/list/ui/scroll/MessagesScroller;", 0), new toc(MessagesListWidget.class, "emptyStateContainer", "getEmptyStateContainer()Landroid/widget/FrameLayout;", 0), new toc(MessagesListWidget.class, "reactionEffectsView", "getReactionEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;", 0)};
    public bw9 A0;
    public bcb B0;
    public final jr9 C0;
    public final Object D0;
    public p3e E0;
    public final bbd F0;
    public final bbd G0;
    public xrg H0;
    public s7c I0;
    public okf J0;
    public y9d K0;
    public qk8 L0;
    public final sn0 M0;
    public final sn0 N0;
    public final b19 O0;
    public final fv9 P0;
    public final ev9 Q0;
    public final und R0;
    public final bwf S0;
    public final k18 T0;
    public final Object U0;
    public final sn0 V0;
    public final sn0 W0;
    public final hs X;
    public final sn0 X0;
    public final k18 Y;
    public final sn0 Y0;
    public final e4c Z;
    public yd5 Z0;
    public final String a;
    public dad a1;
    public final String b;
    public final hs c;
    public final hs d;
    public final hs o;
    public MessageContextMenuBottomSheet s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final Object w0;
    public final k18 x0;
    public final a37 y0;
    public hvf z0;

    public MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("ARG_CHAT_ID", Long.valueOf(j)), new imb("ARG_LOAD_MARK", Long.valueOf(j2)), new imb("ARG_LOAD_MESSAGE_ID", Long.valueOf(j3)), new imb("ARG_HIGHLIGHTS", list), new imb("ARG_HIGHLIGHT_MESSAGE", Boolean.valueOf(z)), new imb("ARG_SKIP_UNREAD_DECOR", Boolean.valueOf(z2))));
    }

    public static final void y0(MessagesListWidget messagesListWidget, String str, i88 i88Var, long j) {
        if (messagesListWidget.K0().D().g()) {
            messagesListWidget.K0().D().h(j);
            return;
        }
        int iOrdinal = i88Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                xfh.r(messagesListWidget.I0().s0, new zr9(str));
                return;
            }
            if (iOrdinal == 4) {
                vu9 vu9VarK0 = messagesListWidget.K0();
                if (str == null) {
                    vu9VarK0.getClass();
                    return;
                }
                String strA = ((j98) vu9VarK0.W0.getValue()).a(str);
                if (strA == null) {
                    return;
                }
                vu9VarK0.G(strA);
                return;
            }
            if (iOrdinal != 6) {
                return;
            }
        }
        vu9 vu9VarK02 = messagesListWidget.K0();
        gu5 gu5Var = (gu5) vu9VarK02.z0;
        if (((Boolean) gu5Var.z.D(gu5Var, gu5.S[13])).booleanValue()) {
            svi.e(vu9VarK02.a, ((q2b) vu9VarK02.X).b(), null, new ns9(vu9VarK02, j, str, null), 2);
        } else {
            vu9VarK02.G(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z0(one.me.messages.list.ui.MessagesListWidget r7, defpackage.o3e r8) {
        /*
            x2e r0 = defpackage.x2e.c
            x2e r1 = defpackage.x2e.b
            java.lang.String r2 = r7.a
            l6b r3 = defpackage.wqi.a
            if (r3 != 0) goto Lb
            goto L25
        Lb:
            lg8 r4 = defpackage.lg8.d
            boolean r5 = r3.b(r4)
            if (r5 == 0) goto L25
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Got new scrollState="
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r6 = 0
            r3.c(r4, r2, r5, r6)
        L25:
            ev9 r2 = r7.Q0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r7.H0()
            boolean r4 = r2.c
            r5 = 0
            if (r4 == 0) goto L31
            goto L3a
        L31:
            boolean r4 = defpackage.ev9.c(r3)
            r2.d = r4
            r2.b(r3, r5, r5)
        L3a:
            d3e r2 = r7.J0()
            x2e r3 = defpackage.x2e.a
            int r4 = r8.a
            t2e r2 = r2.d(r3)
            r2.setCounter(r4)
            boolean r2 = r8.b
            if (r2 == 0) goto L55
            d3e r2 = r7.J0()
            r2.c(r3)
            goto L5c
        L55:
            d3e r2 = r7.J0()
            r2.b(r3)
        L5c:
            boolean r2 = r8.c
            if (r2 == 0) goto L78
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r7.H0()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = defpackage.x7j.b(r2, r3)
            boolean r2 = defpackage.x7j.f(r2, r3)
            if (r2 != 0) goto L78
            d3e r2 = r7.J0()
            r2.c(r1)
            goto L7f
        L78:
            d3e r2 = r7.J0()
            r2.b(r1)
        L7f:
            n3e r1 = r8.d
            if (r1 != 0) goto L8b
            d3e r7 = r7.J0()
            r7.b(r0)
            return
        L8b:
            fv9 r1 = r7.P0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r7.H0()
            r3 = -1
            r1.b = r3
            r1.c = r3
            r1.b(r2, r5, r5)
            n3e r8 = r8.d
            long r1 = r8.b
            by9 r8 = r7.F0()
            boolean r8 = r8.a(r1)
            if (r8 != 0) goto Lae
            d3e r7 = r7.J0()
            r7.c(r0)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.z0(one.me.messages.list.ui.MessagesListWidget, o3e):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final f1h A0() {
        return (f1h) this.U0.getValue();
    }

    public final int B0() {
        Object parentController = getParentController();
        cv9 cv9Var = parentController instanceof cv9 ? (cv9) parentController : null;
        if (cv9Var != null) {
            return ((ChatScreen) cv9Var).Q0();
        }
        return 0;
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        int i2;
        n5g n5gVar;
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("messages:context_menu:message_id")) : null;
        if (lValueOf == null) {
            yy7[] yy7VarArr = b1;
            yy7 yy7Var = yy7VarArr[1];
            hs hsVar = this.c;
            long[] jArr = (long[]) hsVar.a(this);
            if (jArr != null) {
                yy7 yy7Var2 = yy7VarArr[1];
                hsVar.b(this, null);
                if (i == j7b.y) {
                    L0();
                    xfh.r(I0().s0, new bs9(ys.u(jArr)));
                    return;
                }
                if (i == j7b.B || i == j7b.u) {
                    L0();
                }
                vu9 vu9VarK0 = K0();
                long jU = ys.u(jArr);
                vu9VarK0.getClass();
                vu9VarK0.L(i, Collections.singletonList(Long.valueOf(jU)));
                return;
            }
            return;
        }
        String string = bundle.getString("messages:context_menu:link_url");
        if (string == null) {
            return;
        }
        if (i != evd.b) {
            if (i != evd.g) {
                if (i == evd.i) {
                    vu9 vu9VarK02 = K0();
                    String strA = ((j98) vu9VarK02.W0.getValue()).a(string);
                    if (strA == null) {
                        return;
                    }
                    vu9VarK02.G(strA);
                    return;
                }
                return;
            }
            K0().G(string);
            f7f f7fVarB = K0().B();
            long jLongValue = lValueOf.longValue();
            if (f7fVarB == null) {
                return;
            }
            int iV = az1.v(ooi.b(string) ? 3 : ooi.c(string) ? 2 : 1);
            if (iV == 0) {
                D0().a(jLongValue, 1, f7fVarB, 3);
                return;
            } else if (iV == 1) {
                D0().a(jLongValue, 3, f7fVarB, 5);
                return;
            } else {
                if (iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                D0().a(jLongValue, 2, f7fVarB, 4);
                return;
            }
        }
        xb3.a(getContext(), ooi.a(string));
        if (xb3.b()) {
            int iV2 = az1.v(ooi.b(string) ? 3 : ooi.c(string) ? 2 : 1);
            if (iV2 == 0) {
                n5gVar = new n5g(fvd.t);
            } else if (iV2 == 1) {
                n5gVar = new n5g(fvd.w);
            } else {
                if (iV2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n5gVar = new n5g(fvd.v);
            }
            ccb ccbVar = new ccb(this);
            ccbVar.g(n5gVar);
            ccbVar.e(new qcb(yud.o));
            ccbVar.c(new kcb(0, 0, B0(), 3));
            ccbVar.i();
        }
        f7f f7fVarB2 = K0().B();
        long jLongValue2 = lValueOf.longValue();
        if (f7fVarB2 == null) {
            return;
        }
        ci9 ci9VarD0 = D0();
        int iV3 = az1.v(ooi.b(string) ? 3 : ooi.c(string) ? 2 : 1);
        if (iV3 == 0) {
            i2 = 1;
        } else if (iV3 == 1) {
            i2 = 3;
        } else {
            if (iV3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        ci9VarD0.a(jLongValue2, i2, f7fVarB2, 2);
    }

    public final FrameLayout C0() {
        yy7 yy7Var = b1[11];
        return (FrameLayout) this.X0.getValue();
    }

    public final ci9 D0() {
        return (ci9) this.x0.getValue();
    }

    public final MessagesLayoutManager E0() {
        yy7 yy7Var = b1[9];
        return (MessagesLayoutManager) this.V0.getValue();
    }

    public final by9 F0() {
        yy7 yy7Var = b1[10];
        return (by9) this.W0.getValue();
    }

    public final yad G0() {
        return (yad) this.u0.getValue();
    }

    public final EndlessRecyclerView2 H0() {
        return (EndlessRecyclerView2) this.F0.D(this, b1[5]);
    }

    public final ds9 I0() {
        return (ds9) this.Y.getValue();
    }

    public final d3e J0() {
        return (d3e) this.G0.D(this, b1[6]);
    }

    public final vu9 K0() {
        return (vu9) this.v0.getValue();
    }

    public final void L0() {
        if (((Boolean) I0().c.a.getValue()).booleanValue()) {
            xfh.r(I0().s0, yr9.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        long[] longArray;
        Serializable serializable;
        if (((kj1) this.w0.getValue()).g(i) || bundle == null || (longArray = bundle.getLongArray("selected.messageIds.Action")) == null) {
            return;
        }
        if (i != j7b.S) {
            K0().L(i, ys.C(longArray));
            return;
        }
        Serializable serializableD = null;
        Long lValueOf = longArray.length == 0 ? null : Long.valueOf(longArray[0]);
        String string = bundle.getString("bot.shareContact.confirm.keyboardId");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            serializable = hw0.d(bundle, "bot.shareContact.confirm.button", yw0.class);
        } else {
            serializable = bundle.getSerializable("bot.shareContact.confirm.button");
            if (!yw0.class.isInstance(serializable)) {
                serializable = null;
            }
        }
        yw0 yw0Var = (yw0) serializable;
        if (i2 >= 34) {
            serializableD = hw0.d(bundle, "bot.shareContact.confirm.buttonPosition", dx0.class);
        } else {
            Serializable serializable2 = bundle.getSerializable("bot.shareContact.confirm.buttonPosition");
            if (dx0.class.isInstance(serializable2)) {
                serializableD = serializable2;
            }
        }
        dx0 dx0Var = (dx0) serializableD;
        vu9 vu9VarK0 = K0();
        vu9VarK0.getClass();
        if (lValueOf == null || string == null || yw0Var == null || dx0Var == null) {
            return;
        }
        vu9VarK0.u1.O(vu9VarK0, vu9.U1[4], svi.d(vu9VarK0.a, ((q2b) vu9VarK0.X).b(), i84.b, new jt9(vu9VarK0, lValueOf, string, dx0Var, yw0Var, null)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getM0() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
    @Override // defpackage.c54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.onAttach(android.view.View):void");
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        if (i54Var.a || i54Var.b || getView() == null) {
            return;
        }
        int iB = x7j.b(H0(), 0.3f);
        Integer numValueOf = Integer.valueOf(iB);
        if (iB == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            MessageModel messageModelM = this.C0.M(numValueOf.intValue());
            if (messageModelM != null) {
                K0().K(messageModelM);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wu9 wu9Var = new wu9(this, 1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        wu9Var.invoke(frameLayout);
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        u6b u6bVar = (u6b) this.T0.getValue();
        f1h f1hVarA0 = A0();
        if (f1hVarA0 != null) {
            u6bVar.g.remove(f1hVarA0);
        } else {
            u6bVar.getClass();
        }
        dad dadVar = this.a1;
        if (dadVar != null) {
            dadVar.f.clear();
            dadVar.e.clear();
            dadVar.b.b();
        }
        this.a1 = null;
        this.Z0 = null;
        y9d y9dVar = this.K0;
        if (y9dVar != null) {
            y9dVar.a();
        }
        this.K0 = null;
        a37 a37Var = this.y0;
        a37Var.c = false;
        a37Var.d = null;
        a37Var.b.clear();
        G0().t().u();
        hvf hvfVar = this.z0;
        if (hvfVar == null) {
            hvfVar = null;
        }
        ?? r2 = hvfVar.A0;
        if (r2.e()) {
            ((np0) hvfVar.t0.getValue()).b(r2.getValue());
        }
        bw9 bw9Var = this.A0;
        if (bw9Var == null) {
            bw9Var = null;
        }
        bw9Var.i(null);
        EndlessRecyclerView2 endlessRecyclerView2H0 = H0();
        yy7 yy7Var = b1[7];
        endlessRecyclerView2H0.q0((rr9) this.M0.getValue());
        E0().K.b();
        endlessRecyclerView2H0.setPager(null);
        endlessRecyclerView2H0.setDelegate(null);
        t26 t26Var = (t26) this.D0.getValue();
        t26Var.Z = false;
        t26Var.s0 = null;
        this.R0.reset();
        this.H0 = null;
        this.J0 = null;
        this.I0 = null;
        this.B0 = null;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.s0;
        if (messageContextMenuBottomSheet != null) {
            messageContextMenuBottomSheet.E0(true);
        }
        this.s0 = null;
        K0().N1.set(0L);
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        rf2 rf2Var;
        yy7[] yy7VarArr = b1;
        yy7 yy7Var = yy7VarArr[4];
        this.X.b(this, Boolean.FALSE);
        p3e p3eVar = this.E0;
        if (p3eVar != null) {
            p3eVar.b(H0());
        }
        f1h f1hVarA0 = A0();
        f1hVarA0.f = null;
        f1hVarA0.u.i(-1);
        v40 v40Var = this.Z.b;
        v40Var.X = false;
        vpc vpcVar = v40Var.b;
        if (v40Var.o) {
            v40Var.o = false;
            vpcVar.b();
            vpcVar.h.remove(v40Var.Y);
        }
        EndlessRecyclerView2 endlessRecyclerView2H0 = H0();
        boolean zF = x7j.f(endlessRecyclerView2H0, x7j.b(endlessRecyclerView2H0, 1.0f));
        yy7 yy7Var2 = yy7VarArr[3];
        this.o.b(this, Boolean.valueOf(zF));
        vu9 vu9VarK0 = K0();
        pb2 pb2Var = (pb2) vu9VarK0.B1.a.getValue();
        if (pb2Var == null || (rf2Var = pb2Var.b) == null || rf2Var.m <= 0) {
            csg csgVarF = vu9VarK0.F();
            yy7[] yy7VarArr2 = csg.j;
            csgVarF.b(true, new q8g(4));
        }
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        yy7 yy7Var = b1[1];
        this.c.b(this, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!((kj1) this.w0.getValue()).b(i, strArr, iArr) && i == 157) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    vu9 vu9VarK0 = K0();
                    imb imbVar = vu9VarK0.F1;
                    vu9VarK0.F1 = null;
                    if (imbVar != null) {
                        vu9VarK0.J((hv5) imbVar.a, ((Number) imbVar.b).longValue(), null);
                        return;
                    }
                    return;
                }
            }
            K0().F1 = null;
            qsb qsbVar = (qsb) this.t0.getValue();
            s2i s2iVar = new s2i(this, 1);
            int i3 = w3d.messages_list_request_storage_permission_title;
            int i4 = w3d.messages_list_request_storage_permission_subtitle;
            qsbVar.getClass();
            qsb.q(s2iVar, strArr, iArr, i3, i4);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        Long lI;
        super.onUpdateArgs(bundle, bundle2);
        boolean z = bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR", false);
        yy7[] yy7VarArr = b1;
        yy7 yy7Var = yy7VarArr[4];
        this.X.b(this, Boolean.valueOf(z));
        Object obj = bundle.get("ARG_LOAD_MESSAGE_ID");
        Object obj2 = bundle2.get("ARG_LOAD_MESSAGE_ID");
        if (obj2 == null || obj2.equals(obj)) {
            Object obj3 = bundle.get("ARG_LOAD_MARK");
            Object obj4 = bundle2.get("ARG_LOAD_MARK");
            if (obj4 == null || fni.a(obj3, obj4) || (lI = cnf.i(obj4.toString())) == null) {
                return;
            }
            long jLongValue = lI.longValue();
            bundle2.remove("ARG_LOAD_MARK");
            ay9 ay9VarE = K0().E();
            yy7[] yy7VarArr2 = ay9.r;
            ay9VarE.f(svi.d(ay9VarE.c, ay9VarE.b, i84.b, new vx9(ay9VarE, jLongValue, 4, null)));
            return;
        }
        Long lI2 = cnf.i(obj2.toString());
        if (lI2 != null) {
            long jLongValue2 = lI2.longValue();
            bundle2.remove("ARG_LOAD_MESSAGE_ID");
            yy7 yy7Var2 = yy7VarArr[3];
            this.o.b(this, Boolean.FALSE);
            K0().O(jLongValue2);
            View view = getView();
            if (view != null) {
                view.post(new u50(this, jLongValue2, 5));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Object, x26] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        EndlessRecyclerView2 endlessRecyclerView2H0 = H0();
        yy7[] yy7VarArr = b1;
        yy7 yy7Var = yy7VarArr[12];
        this.a1 = new dad(endlessRecyclerView2H0, (k9d) this.Y0.getValue(), new fr7(17, view));
        hbd hbdVar = K0().R1;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new aw9(null, this), 1), getViewLifecycleScope());
        jr9 jr9Var = this.C0;
        if (jr9Var.j() > 0) {
            F0().b();
        }
        EndlessRecyclerView2 endlessRecyclerView2H02 = H0();
        yy7 yy7Var2 = yy7VarArr[7];
        endlessRecyclerView2H02.k((rr9) this.M0.getValue());
        yy7 yy7Var3 = yy7VarArr[8];
        sn0 sn0Var = this.N0;
        u7c u7cVar = (u7c) sn0Var.getValue();
        u7cVar.k.O(u7cVar, u7c.l[0], H0());
        EndlessRecyclerView2 endlessRecyclerView2H03 = H0();
        yy7 yy7Var4 = yy7VarArr[8];
        endlessRecyclerView2H03.m((u7c) sn0Var.getValue());
        EndlessRecyclerView2 endlessRecyclerView2H04 = H0();
        mgb.a(endlessRecyclerView2H04, new yn6(endlessRecyclerView2H04, 21, this));
        H0().m(A0());
        E0().u1(new zv9(this));
        gw0.w(new g56(aw0.a(new d53(K0().P1, 23), getViewLifecycleOwner().p(), l38Var), new nv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(K0().E().q, 12), getViewLifecycleOwner().p(), l38Var), new ov9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(K0().J1, getViewLifecycleOwner().p(), l38Var), new pv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(K0().E().p, getViewLifecycleOwner().p(), l38.o), new gv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(I0().c, getViewLifecycleOwner().p(), l38Var), new qv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(I0().o, getViewLifecycleOwner().p(), l38Var), new rv9(null, this), 1), getViewLifecycleScope());
        g56 g56Var = new g56(I0().Z, new yv9(null, this), 1);
        v38 viewLifecycleScope = getViewLifecycleScope();
        svi.e(viewLifecycleScope, null, null, new t38(viewLifecycleScope, new r38(g56Var, null), null), 3);
        gw0.w(new g56(aw0.a(K0().I1, getViewLifecycleOwner().p(), l38Var), new sv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new y83(new d53(K0().F().f, 12), 21, this), getViewLifecycleOwner().p(), l38Var), new tv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(G0().t().D0, getViewLifecycleOwner().p(), l38Var), new uv9(null, this), 1), getViewLifecycleScope());
        EndlessRecyclerView2 endlessRecyclerView2H05 = H0();
        p6a p6aVarD = K0().D();
        v6a v6aVar = new v6a(endlessRecyclerView2H05, jr9Var, p6aVarD, I0());
        gw0.w(new g56(p6aVarD.g, new zr0(2, v6aVar, v6a.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 26), 1), getViewLifecycleScope());
        EndlessRecyclerView2 endlessRecyclerView2H06 = H0();
        ds9 ds9VarI0 = I0();
        yad yadVarG0 = G0();
        vu9 vu9VarK0 = K0();
        p6a p6aVarD2 = K0().D();
        gq9 gq9Var = gq9.a;
        y9d y9dVar = new y9d(endlessRecyclerView2H06, ds9VarI0, yadVarG0, vu9VarK0, p6aVarD2, ((g4b) gq9Var.getAccessor().c(56)).a());
        this.K0 = y9dVar;
        zs0.e(new g56(p6aVarD2.g, new bzb(2, y9dVar, y9d.class, "handleSelectedMessages", "handleSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 5), 1), getViewLifecycleScope());
        E0().u1(new jv9(this, 1));
        gw0.w(new g56(aw0.a(((v3b) gq9Var.getAccessor().c(500)).a, getViewLifecycleOwner().p(), l38Var), new vv9(null, this), 1), getViewLifecycleScope());
        u6b u6bVar = (u6b) this.T0.getValue();
        f1h f1hVarA0 = A0();
        if (f1hVarA0 != null) {
            u6bVar.g.add(f1hVarA0);
        }
        if (u6bVar.o.get() && f1hVarA0 != null) {
            u6bVar.f.post(new o3(18, f1hVarA0));
        }
        gw0.w(new g56(aw0.a(K0().o1, getViewLifecycleOwner().p(), l38Var), new lv9(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(K0().S1, getViewLifecycleOwner().p(), l38Var), new mv9(null, this), 1), getViewLifecycleScope());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MessagesListWidget(Bundle bundle) {
        Continuation continuation;
        int i = 2;
        super(bundle, 0, i, null);
        this.a = MessagesListWidget.class.getName();
        this.b = "MessagesList";
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        this.c = new hs(long[].class, null, "selected.messageIds.Action");
        this.d = new hs(Long.class, 0L, "messages:current.read.mark");
        Boolean bool = Boolean.FALSE;
        this.o = new hs(Boolean.class, bool, "is.last.message.completely.visible.on.detach");
        this.X = new hs(Boolean.class, bool, "ARG_SKIP_UNREAD_DECOR");
        yy7 yy7Var = b1[0];
        this.Y = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, ds9.class, null);
        gq9 gq9Var = gq9.a;
        this.Z = (e4c) gq9Var.getAccessor().c(523);
        this.t0 = rsb.a.a();
        this.u0 = createViewModelLazy(yad.class, new iv8(13, new wj1(bundle, 7)));
        int i2 = 1;
        this.v0 = createViewModelLazy(vu9.class, new iv8(14, new zu9(bundle, this, i2)));
        k18 k18Var = fq9.a;
        this.w0 = ipi.b(3, new yu9(this, 15));
        this.x0 = gq9Var.getAccessor().d(159);
        a37 a37Var = new a37(gq9Var.getAccessor().d(99));
        this.y0 = a37Var;
        ExecutorService executorServiceA = ((g4b) gq9Var.getAccessor().c(56)).a();
        ts9 ts9Var = new ts9(1, K0(), vu9.class, "onAttachClickAction", "onAttachClickAction(Lone/me/messages/list/ui/view/MessagesAttachAction;)V", 0, 2);
        ukd ukdVar = new ukd(24, this);
        kce kceVar = new kce(27, this);
        this.C0 = new jr9(executorServiceA, new kv9(this), ts9Var, a37Var, ukdVar, kceVar, new js0(i, this), new xu9((int) (null == true ? 1 : 0), (Object) this), new yu9(this, null == true ? 1 : 0));
        this.D0 = ipi.b(3, new yu9(this, i2));
        this.F0 = viewBinding(bzc.messages_list_recycler_view);
        this.G0 = viewBinding(bzc.messages_list_scroll_btn);
        this.M0 = binding(new yu9(this, i));
        this.N0 = binding(new yu9(this, 3));
        this.O0 = new b19(this);
        this.P0 = new fv9(this, i2);
        this.Q0 = new ev9(this);
        this.R0 = new und(new yu9(this, 4));
        this.S0 = new bwf(new yu9(this, 9));
        this.T0 = gq9Var.getAccessor().d(399);
        this.U0 = ipi.b(3, new zu9(bundle, this, null == true ? 1 : 0));
        this.V0 = binding(new yu9(this, 11));
        this.W0 = binding(new yu9(this, 12));
        this.X0 = binding(new yu9(this, 13));
        this.Y0 = binding(new yu9(this, 14));
        nm8 nm8Var = (nm8) gq9Var.getAccessor().c(2);
        if (((pe8) ((pb3) nm8Var.c().a.getValue())).K() != nm8Var.g || nm8Var.i) {
            nm8Var.c().getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            arb arbVar = arb.CHAT_INIT_TO_RENDER;
            nm8Var.e.m(arbVar, new zqb(arbVar, jElapsedRealtime));
            continuation = null;
            nm8Var.f.put(gqb.EVENT_OPEN_CHAT, svi.e(nm8Var.d, null, null, new km8(nm8Var, null), 3));
        } else {
            continuation = null;
        }
        gw0.w(new m36(new g56(K0().E1, new bv9(continuation, this), 1), new ld0((Object) this, continuation, 26, (boolean) (null == true ? 1 : 0))), getLifecycleScope());
    }

    public /* synthetic */ MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, int i, tk4 tk4Var) {
        this(str, j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? hd5.a : list, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, null);
    }
}
