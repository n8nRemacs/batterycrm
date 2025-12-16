package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Concurrent_commonKt;

/* loaded from: classes.dex */
public final class vcf extends o4 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.o4
    public final boolean a(n4 n4Var) {
        AtomicReference atomicReference = this.a;
        if (Concurrent_commonKt.getValue(atomicReference) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(atomicReference, ucf.a);
        return true;
    }

    @Override // defpackage.o4
    public final Continuation[] b(n4 n4Var) {
        Concurrent_commonKt.setValue(this.a, null);
        return j40.b;
    }
}
