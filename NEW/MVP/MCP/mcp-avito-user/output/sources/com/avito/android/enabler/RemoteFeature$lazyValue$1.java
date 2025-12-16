package com.avito.android.enabler;

import Y41.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: RemoteFeature.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RemoteFeature$lazyValue$1<T> extends N implements a<T> {
    final /* synthetic */ RemoteFeature<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteFeature$lazyValue$1(RemoteFeature<T> remoteFeature) {
        super(0);
        this.this$0 = remoteFeature;
    }

    @Override // Y41.a
    public final T invoke() {
        T tInvoke = this.this$0.getRemoteValue().invoke(this.this$0.getF3108c());
        return tInvoke == null ? (T) ((RemoteFeature) this.this$0).delegate.getValue() : tInvoke;
    }
}
