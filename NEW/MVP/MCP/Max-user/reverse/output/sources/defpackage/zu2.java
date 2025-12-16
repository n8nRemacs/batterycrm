package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final class zu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zu2 zu2Var = (zu2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zu2 zu2Var = new zu2(continuation, this.X);
        zu2Var.o = obj;
        return zu2Var;
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        View videoMessageRecordAnchor;
        Activity activityD;
        g8j.b(obj);
        eed eedVar = (eed) this.o;
        boolean z = eedVar instanceof zdd;
        ChatScreen chatScreen = this.X;
        if (z) {
            zdd zddVar = (zdd) eedVar;
            d3 d3Var = zddVar.a;
            if (d3Var instanceof x6h) {
                yy7[] yy7VarArr = ChatScreen.l1;
                zx2 zx2VarG1 = chatScreen.g1();
                x6h x6hVar = (x6h) d3Var;
                Long lZ = chatScreen.V0().z();
                on9 on9VarY = chatScreen.V0().y();
                vf6 vf6VarA = on9VarY != null ? on9VarY.a() : null;
                pb2 pb2Var = (pb2) zx2VarG1.a1.a.getValue();
                if (pb2Var != null) {
                    zx2VarG1.I(xfh.o(zx2VarG1, null, new lx2(zx2VarG1, pb2Var.a, x6hVar, lZ, vf6VarA, null), 1));
                }
            } else if (d3Var instanceof k40) {
                yy7[] yy7VarArr2 = ChatScreen.l1;
                zx2 zx2VarG12 = chatScreen.g1();
                List listSingletonList = Collections.singletonList(zddVar.a);
                Long lZ2 = chatScreen.V0().z();
                on9 on9VarY2 = chatScreen.V0().y();
                zx2VarG12.H(null, listSingletonList, false, lZ2, on9VarY2 != null ? on9VarY2.a() : null);
                uh7 uh7Var = (uh7) chatScreen.i1.getValue();
                if (uh7Var != null) {
                    uh7Var.f(Collections.singleton(new th7(rh7.d, 1)), f1e.CHAT);
                }
            }
        } else if (eedVar instanceof ced) {
            ced cedVar = (ced) eedVar;
            ChatScreen.l1(chatScreen, null, String.valueOf(cedVar.a.b(chatScreen.getContext())), null, cedVar.b, 5);
        } else if (eedVar instanceof bed) {
            wv2 wv2Var = wv2.c;
            if (!wv2Var.p0().d() && (activityD = ((RootController) ((b3b) wv2Var.p0().a()).f()).G0().d()) != null) {
                activityD.finish();
            }
        } else if (eedVar instanceof ded) {
            yy7[] yy7VarArr3 = ChatScreen.l1;
            MessageWriteWidget messageWriteWidgetW0 = chatScreen.W0();
            if (messageWriteWidgetW0 != null) {
                ded dedVar = (ded) eedVar;
                tdd tddVar = dedVar.a;
                n5g n5gVar = dedVar.b;
                int[] iArr = new int[2];
                int iOrdinal = tddVar.ordinal();
                if (iOrdinal == 0) {
                    videoMessageRecordAnchor = messageWriteWidgetW0.C0().getVideoMessageRecordAnchor();
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoMessageRecordAnchor = messageWriteWidgetW0.C0().getAudioRecordAnchor();
                }
                View view = videoMessageRecordAnchor;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    int iQ = u45.q(18, vw4.d().getDisplayMetrics().density, (f6j.b(messageWriteWidgetW0.getContext()) - iArr[0]) - (view.getWidth() / 2));
                    WindowInsets rootWindowInsets = messageWriteWidgetW0.requireView().getRootWindowInsets();
                    int i = rootWindowInsets != null ? g4i.h(null, rootWindowInsets).a.f(7).d : 0;
                    int i2 = xz7.a;
                    int i3 = 8;
                    Point point = new Point(iQ, (messageWriteWidgetW0.C0().getHeight() - kti.d(8 * vw4.d().getDisplayMetrics().density)) + i + (xz7.b(xz7.c) ? xz7.a(messageWriteWidgetW0.getContext()) : 0));
                    ncg ncgVar = messageWriteWidgetW0.G0;
                    if (ncgVar == null || !ncgVar.isShowing()) {
                        ncg ncgVar2 = messageWriteWidgetW0.G0;
                        if (ncgVar2 != null) {
                            ncgVar2.dismiss();
                        }
                        ncg ncgVar3 = new ncg(messageWriteWidgetW0.getContext(), view, new oo9(messageWriteWidgetW0, i3), (g31) null, 2, 3, 8);
                        ncgVar3.c(n5gVar);
                        ncgVar3.d(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        ncgVar3.setOnDismissListener(new qo9(messageWriteWidgetW0, 1));
                        messageWriteWidgetW0.G0 = ncgVar3;
                    } else {
                        ncg ncgVar4 = messageWriteWidgetW0.G0;
                        if (ncgVar4 != null) {
                            ncgVar4.d(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        }
                    }
                }
            }
        } else if (eedVar instanceof aed) {
            aed aedVar = (aed) eedVar;
            tdd tddVar2 = aedVar.a;
            boolean z2 = aedVar.b;
            int iOrdinal2 = tddVar2.ordinal();
            if (iOrdinal2 == 0) {
                yy7[] yy7VarArr4 = ChatScreen.l1;
                zx2 zx2VarG13 = chatScreen.g1();
                hbd hbdVar = zx2VarG13.a1;
                k18 k18Var = zx2VarG13.J0;
                pb2 pb2Var2 = (pb2) hbdVar.a.getValue();
                if (pb2Var2 != null) {
                    long j = pb2Var2.b.a;
                    if (z2) {
                        dkb dkbVar = (dkb) k18Var.getValue();
                        dkbVar.getClass();
                        if (j != 0) {
                            dkbVar.f(j, s00.VIDEO_MSG, -2L);
                        }
                    } else {
                        dkb dkbVar2 = (dkb) k18Var.getValue();
                        if (j == 0) {
                            dkbVar2.getClass();
                        } else {
                            dkbVar2.getClass();
                            dkb.b(j, -2L);
                        }
                    }
                }
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                yy7[] yy7VarArr5 = ChatScreen.l1;
                zx2 zx2VarG14 = chatScreen.g1();
                hbd hbdVar2 = zx2VarG14.a1;
                k18 k18Var2 = zx2VarG14.J0;
                pb2 pb2Var3 = (pb2) hbdVar2.a.getValue();
                if (pb2Var3 != null) {
                    long j2 = pb2Var3.b.a;
                    if (z2) {
                        dkb dkbVar3 = (dkb) k18Var2.getValue();
                        dkbVar3.getClass();
                        if (j2 != 0) {
                            dkbVar3.f(j2, s00.AUDIO, -1L);
                        }
                    } else {
                        dkb dkbVar4 = (dkb) k18Var2.getValue();
                        if (j2 == 0) {
                            dkbVar4.getClass();
                        } else {
                            dkbVar4.getClass();
                            dkb.b(j2, -1L);
                        }
                    }
                }
            }
        } else {
            if (!(eedVar instanceof ydd)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr6 = ChatScreen.l1;
            MessageWriteWidget messageWriteWidgetW02 = chatScreen.W0();
            if (messageWriteWidgetW02 != null) {
                ncg ncgVar5 = messageWriteWidgetW02.G0;
                if (ncgVar5 != null) {
                    ncgVar5.dismiss();
                }
                messageWriteWidgetW02.G0 = null;
            }
        }
        return qqg.a;
    }
}
