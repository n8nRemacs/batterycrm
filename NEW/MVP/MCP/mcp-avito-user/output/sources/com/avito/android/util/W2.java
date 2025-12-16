package com.avito.android.util;

import kotlin.Metadata;

/* compiled from: LogsT.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class W2 extends kotlin.jvm.internal.N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<String> f318769l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Y41.a<String> aVar) {
        super(0);
        this.f318769l = aVar;
    }

    @Override // Y41.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder("[");
        X2 x22 = X2.f318778a;
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append("] ");
        sb2.append(this.f318769l.invoke());
        return sb2.toString();
    }
}
