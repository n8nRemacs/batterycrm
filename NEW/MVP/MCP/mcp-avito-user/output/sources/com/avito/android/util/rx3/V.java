package com.avito.android.util.rx3;

import kotlin.Metadata;

/* compiled from: Observables.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "test", "(Ljava/lang/Object;)Z"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class V<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f319012b;

    /* JADX WARN: Multi-variable type inference failed */
    public V(Y41.l<? super T, Boolean> lVar) {
        this.f319012b = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.r
    public final boolean test(@Y61.k T t12) {
        return !((Boolean) this.f319012b.invoke(t12)).booleanValue();
    }
}
