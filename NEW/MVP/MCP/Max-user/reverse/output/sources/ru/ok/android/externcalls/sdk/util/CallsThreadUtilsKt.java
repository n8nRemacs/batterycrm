package ru.ok.android.externcalls.sdk.util;

import defpackage.cm6;
import defpackage.de;
import defpackage.gu3;
import defpackage.hu3;
import defpackage.i2f;
import defpackage.l2f;
import defpackage.ns1;
import defpackage.py4;
import defpackage.qu1;
import defpackage.u0e;
import defpackage.u2f;
import defpackage.wk3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Lkotlin/Function0;", "Lhu3;", "onSuccess", "Ljava/lang/Runnable;", "onError", "Lpy4;", "executeOnIoThread", "(Lcm6;Lhu3;Ljava/lang/Runnable;)Lpy4;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallsThreadUtilsKt {
    public static final <T> py4 executeOnIoThread(cm6 cm6Var, final hu3 hu3Var, final Runnable runnable) {
        int i = 2;
        u2f u2fVarI = new wk3(i, new ns1(3, cm6Var)).m(u0e.b()).i(de.a());
        qu1 qu1Var = new qu1(new gu3() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt.executeOnIoThread.2
            @Override // defpackage.gu3
            public final void accept(T t) {
                hu3Var.accept(t);
            }
        }, i, new gu3() { // from class: ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt.executeOnIoThread.3
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        u2fVarI.k(qu1Var);
        return qu1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOnIoThread$lambda$0(cm6 cm6Var, l2f l2fVar) {
        try {
            ((i2f) l2fVar).a(cm6Var.invoke());
        } catch (Throwable th) {
            ((i2f) l2fVar).onError(th);
        }
    }
}
