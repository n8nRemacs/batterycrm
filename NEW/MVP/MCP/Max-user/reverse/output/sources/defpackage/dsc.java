package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.qrscanner.QrScannerWidget;

/* loaded from: classes2.dex */
public final class dsc extends dtf implements sm6 {
    public final /* synthetic */ QrScannerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsc(Continuation continuation, QrScannerWidget qrScannerWidget) {
        super(2, continuation);
        this.X = qrScannerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dsc dscVar = (dsc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dscVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dsc dscVar = new dsc(continuation, this.X);
        dscVar.o = obj;
        return dscVar;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Integer num = (Integer) this.o;
        QrScannerWidget qrScannerWidget = this.X;
        Drawable drawable = (num != null && num.intValue() == 1) ? (Drawable) qrScannerWidget.Y.getValue() : (num != null && num.intValue() == 0) ? (Drawable) qrScannerWidget.X.getValue() : null;
        if (drawable != null) {
            ((f8b) qrScannerWidget.u0.D(qrScannerWidget, QrScannerWidget.E0[4])).b(drawable, "M14.446 0.606c1.097-1.181 3.024-0.003 2.473 1.512L14.318 9.27l4.577 0.653c1.181 0.169 1.686 1.596 0.874 2.47l-10.214 11c-1.097 1.182-3.025 0.004-2.474-1.511l2.601-7.152-4.577-0.653c-1.181-0.169-1.686-1.596-0.874-2.47L14.446 0.606z", vw4.d().getDisplayMetrics().density * 24.0f);
        }
        return qqg.a;
    }
}
