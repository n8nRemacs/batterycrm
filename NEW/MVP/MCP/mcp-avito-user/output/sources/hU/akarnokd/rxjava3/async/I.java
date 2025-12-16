package hu.akarnokd.rxjava3.async;

/* compiled from: AsyncFlowable.java */
/* loaded from: classes8.dex */
final class I implements l41.g<org.reactivestreams.e> {
    @Override // l41.g
    public final void accept(org.reactivestreams.e eVar) {
        eVar.request(Long.MAX_VALUE);
    }
}
