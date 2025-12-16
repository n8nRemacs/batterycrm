package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.C36240c;
import kotlin.Metadata;

/* compiled from: LambdaValue.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.N implements Y41.a<Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s<Object> f336684l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s<Object> sVar) {
        super(0);
        this.f336684l = sVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        s<Object> sVar = this.f336684l;
        C36239b.a aVar = sVar.f336685a;
        if (aVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        F f12 = aVar.f336546c;
        C36240c c36240c = sVar.f336687c;
        if (c36240c == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objInvoke = c36240c.invoke(f12);
        sVar.f336687c = null;
        return objInvoke;
    }
}
