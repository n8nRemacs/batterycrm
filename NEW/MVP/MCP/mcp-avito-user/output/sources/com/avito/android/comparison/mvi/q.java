package com.avito.android.comparison.mvi;

import Rq.b;
import kotlin.Metadata;

/* compiled from: ComparisonBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LRq/b;", "apply", "(Ljava/lang/Throwable;)LRq/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f124158b;

    public q(s sVar) {
        this.f124158b = sVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String strJ = com.avito.android.error.z.j((Throwable) obj);
        if (strJ == null) {
            strJ = this.f124158b.f124166d.getF123904b();
        }
        return new b.f(strJ);
    }
}
