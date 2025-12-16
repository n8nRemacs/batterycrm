package hu.akarnokd.rxjava3.debug.validator;

import s41.C47998a;

/* compiled from: RxJavaProtocolValidator.java */
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: RxJavaProtocolValidator.java */
    public static class a implements hu.akarnokd.rxjava3.functions.k<ProtocolNonConformanceException> {
        @Override // l41.g
        public final void accept(Object obj) {
            C47998a.b((ProtocolNonConformanceException) obj);
        }
    }

    static {
        new a();
    }

    public i() {
        throw new IllegalStateException("No instances!");
    }
}
