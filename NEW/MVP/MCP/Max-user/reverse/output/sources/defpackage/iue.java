package defpackage;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class iue extends dtf implements sm6 {
    public final /* synthetic */ ShareDataPickerScreen X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iue(ShareDataPickerScreen shareDataPickerScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.X = shareDataPickerScreen;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iue iueVar = (iue) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iueVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iue iueVar = new iue(this.X, this.Y, continuation);
        iueVar.o = obj;
        return iueVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int size = ((Set) this.o).size();
        ShareDataPickerScreen shareDataPickerScreen = this.X;
        AutoTransition autoTransition = shareDataPickerScreen.x0;
        bbd bbdVar = shareDataPickerScreen.A0;
        bbd bbdVar2 = shareDataPickerScreen.z0;
        if (shareDataPickerScreen.v0 && size == 0) {
            yy7[] yy7VarArr = ShareDataPickerScreen.I0;
            ((OneMeButton) bbdVar2.D(shareDataPickerScreen, yy7VarArr[1])).setVisibility(0);
            ((muc) bbdVar.D(shareDataPickerScreen, yy7VarArr[2])).setVisibility(8);
            shareDataPickerScreen.K0().setVisibility(8);
        } else {
            yy7[] yy7VarArr2 = ShareDataPickerScreen.I0;
            ((OneMeButton) bbdVar2.D(shareDataPickerScreen, yy7VarArr2[1])).setVisibility(8);
            ((muc) bbdVar.D(shareDataPickerScreen, yy7VarArr2[2])).setVisibility(((tte) shareDataPickerScreen.I0().c).j.a.getValue() != null ? 0 : 8);
            shareDataPickerScreen.K0().setVisibility(0);
        }
        boolean z = shareDataPickerScreen.K0().getVisibility() == 0;
        View view = this.Y;
        if (!z && size > 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            shareDataPickerScreen.K0().setVisibility(0);
        } else if (z && size == 0) {
            TransitionManager.beginDelayedTransition((ViewGroup) view, autoTransition);
            sn0 sn0Var = shareDataPickerScreen.y0;
            if (sn0Var.e()) {
                ((ik9) sn0Var.getValue()).setVisibility(8);
            }
            ytd ytdVar = shareDataPickerScreen.D0;
            if (ytdVar == null || !ytdVar.n()) {
                int i = xz7.a;
                if (xz7.b(xz7.c)) {
                    shareDataPickerScreen.E0.k();
                }
            } else {
                ((tte) shareDataPickerScreen.I0().c).m.E(1);
            }
        }
        return qqg.a;
    }
}
