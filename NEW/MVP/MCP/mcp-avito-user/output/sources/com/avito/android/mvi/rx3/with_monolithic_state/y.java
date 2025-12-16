package com.avito.android.mvi.rx3.with_monolithic_state;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Reducible.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "S", "kotlin.jvm.PlatformType", "", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class y<V> implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o<Object> f207182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f207183c;

    public y(o<Object> oVar, Object obj) {
        this.f207182b = oVar;
        this.f207183c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f207182b.f207170b.invoke(this.f207183c);
    }
}
