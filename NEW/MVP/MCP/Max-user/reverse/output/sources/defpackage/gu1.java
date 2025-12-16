package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;

/* loaded from: classes.dex */
public final class gu1 extends dtf implements sm6 {
    public final /* synthetic */ CallWaitingRoomEventsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu1(Continuation continuation, CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        super(2, continuation);
        this.X = callWaitingRoomEventsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gu1 gu1Var = (gu1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gu1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gu1 gu1Var = new gu1(continuation, this.X);
        gu1Var.o = obj;
        return gu1Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String string;
        g8j.b(obj);
        cu1 cu1Var = (cu1) this.o;
        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = this.X;
        ?? r3 = callWaitingRoomEventsWidget.X;
        bbd bbdVar = callWaitingRoomEventsWidget.Z;
        yy7[] yy7VarArr = CallWaitingRoomEventsWidget.u0;
        boolean z = cu1Var instanceof bu1;
        if (z) {
            if (callWaitingRoomEventsWidget.y0().findViewById(j0b.W1) != null) {
                hqi.g(callWaitingRoomEventsWidget.z0(), false, 0L, null, 6);
            }
            FrameLayout frameLayoutY0 = callWaitingRoomEventsWidget.y0();
            int i = j0b.c2;
            if (frameLayoutY0.findViewById(i) != null) {
                hqi.g((v0b) bbdVar.D(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.u0[0]), true, 0L, null, 6);
            } else {
                FrameLayout frameLayoutY02 = callWaitingRoomEventsWidget.y0();
                v0b v0bVar = new v0b(callWaitingRoomEventsWidget.getContext(), false);
                v0bVar.setId(i);
                v0bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                v0bVar.setCustomTheme(a93.s0.B(v0bVar).c);
                v0bVar.setCallButtonMode(r0b.b);
                v0bVar.setSubtitle(v0bVar.getContext().getString(m0b.e2));
                v0bVar.setVisibility(0);
                frameLayoutY02.addView(v0bVar);
            }
        } else if (cu1Var instanceof zt1) {
            if (callWaitingRoomEventsWidget.y0().findViewById(j0b.c2) != null) {
                hqi.g((v0b) bbdVar.D(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.u0[0]), false, 0L, null, 6);
            }
            FrameLayout frameLayoutY03 = callWaitingRoomEventsWidget.y0();
            int i2 = j0b.W1;
            if (frameLayoutY03.findViewById(i2) != null) {
                hqi.g(callWaitingRoomEventsWidget.z0(), true, 0L, null, 6);
            } else {
                FrameLayout frameLayoutY04 = callWaitingRoomEventsWidget.y0();
                z5a z5aVar = new z5a(callWaitingRoomEventsWidget.getContext());
                z5aVar.setId(i2);
                z5aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                z5aVar.setVisibility(0);
                frameLayoutY04.addView(z5aVar);
                callWaitingRoomEventsWidget.z0().setVisibility(0);
            }
        }
        if (!(cu1Var instanceof yt1)) {
            if (cu1Var instanceof au1) {
                callWaitingRoomEventsWidget.A0(((au1) cu1Var).a);
            } else if (z) {
                v0b v0bVar2 = (v0b) bbdVar.D(callWaitingRoomEventsWidget, CallWaitingRoomEventsWidget.u0[0]);
                bu1 bu1Var = (bu1) cu1Var;
                mc0 mc0Var = bu1Var.d;
                v0bVar2.g(mc0Var.a, mc0Var.b, bu1Var.e);
                CharSequence charSequenceB = bu1Var.b.b(v0bVar2.getContext());
                if (charSequenceB != null) {
                    List listR = vmf.R(vmf.c0(charSequenceB), new char[]{' ', 160});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listR) {
                        if (!vmf.F((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    int size = arrayList.size();
                    if (size == 0) {
                        string = "";
                    } else if (size != 1) {
                        string = ((String) arrayList.get(0)) + " " + vmf.z(0, (CharSequence) arrayList.get(1)) + ".";
                    } else {
                        string = charSequenceB.toString();
                    }
                } else {
                    string = null;
                }
                v0bVar2.setTitle(string != null ? string : "");
                v0bVar2.setSubtitle(bu1Var.c.b(v0bVar2.getContext()));
                v0bVar2.setSubtitleTextColor(q0b.a);
                v0bVar2.f();
                v0bVar2.k((LayerDrawable) ((rjh) r3.getValue()).b.getValue(), (LayerDrawable) ((rjh) r3.getValue()).c.getValue(), new hu1(callWaitingRoomEventsWidget, 0, cu1Var));
                s0b s0bVar = s0b.b;
                v0bVar2.setTrailingElementsPadding(s0bVar);
                v0bVar2.setCellHeight(s0bVar);
                v0bVar2.setOnClickListener(null);
                int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                v0bVar2.setPadding(iD, iD, iD, iD);
            } else {
                if (!(cu1Var instanceof zt1)) {
                    throw new NoWhenBranchMatchedException();
                }
                z5a z5aVarZ0 = callWaitingRoomEventsWidget.z0();
                zt1 zt1Var = (zt1) cu1Var;
                z5aVarZ0.setAvatars(zt1Var.c);
                z5aVarZ0.setName(zt1Var.a);
                z5aVarZ0.setMessage(zt1Var.b);
                z5aVarZ0.setMessageTextColor(y5a.a);
                f8j.d(z5aVarZ0, 300L, new iu1(callWaitingRoomEventsWidget, 0, cu1Var));
                int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
                z5aVarZ0.setPadding(iD2, iD2, iD2, iD2);
            }
        }
        return qqg.a;
    }
}
