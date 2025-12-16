package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public abstract class t8j {
    public static volatile ukd a;
    public static volatile v1a b;
    public static volatile b6a c;
    public static volatile qha d;

    public static void a(Throwable th) {
        ukd ukdVar = a;
        if (th == null) {
            th = bj5.a("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof QueueOverflowException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (ukdVar != null) {
            try {
                ukdVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(CharSequence charSequence, Widget widget) {
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarA = j5j.a(new p5g(f5b.a, ys.D(new Object[]{charSequence})), null, null, 6);
        oq3VarA.f(new n5g(f5b.e));
        oq3VarA.b(d5b.c, new n5g(f5b.d));
        oq3VarA.d(d5b.b, new n5g(mvd.p));
        oq3VarA.a.putBoolean("memorize_keyboard", false);
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
        confirmationBottomSheetE.setTargetController(widget);
        c54 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(widget);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }
}
